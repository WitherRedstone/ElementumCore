package com.chinaex123.elementum_core.data;

import com.chinaex123.elementum_core.init.ECElementBlocks;
import com.chinaex123.elementum_core.init.ECElementItems;
import com.chinaex123.elementum_core.init.ECMaterialBlocks;
import com.chinaex123.elementum_core.util.ContentRefs;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import org.jetbrains.annotations.NotNull;

import java.util.Set;

public class ModBlockLootTablesProvider extends BlockLootSubProvider {
    public ModBlockLootTablesProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        for (ECElementBlocks.OreBlocks oreBlock : ECElementBlocks.OreBlocks.ALL_ORE_BLOCKS) {
            if (!ContentRefs.isVanilla(oreBlock.BLOCK)) {
                this.dropSelf(oreBlock.BLOCK.get());
            }
            if (!ContentRefs.isVanilla(oreBlock.RAW_BLOCK)) {
                this.dropSelf(oreBlock.RAW_BLOCK.get());
            }

            String elementName = oreBlock.BLOCK.getId().getPath().replace("_block", "");
            ECElementItems.OreItems oreItems = getOreItemsByName(elementName);

            if (oreItems != null) {
                if (!ContentRefs.isVanilla(oreBlock.ORE)) {
                    this.add(oreBlock.ORE.get(), block -> customDrops_Fortune(oreBlock.ORE.get(), oreItems.RAW.get(), 1.0F, 1.0F));
                }
                if (!ContentRefs.isVanilla(oreBlock.DEEPSLATE_ORE)) {
                    this.add(oreBlock.DEEPSLATE_ORE.get(), block -> customDrops_Fortune(oreBlock.DEEPSLATE_ORE.get(), oreItems.RAW.get(), 1.0F, 1.0F));
                }
                if (!ContentRefs.isVanilla(oreBlock.NETHER_ORE)) {
                    this.add(oreBlock.NETHER_ORE.get(), block -> customDrops_Fortune(oreBlock.NETHER_ORE.get(), oreItems.RAW.get(), 2.0F, 1.0F));
                }
                if (!ContentRefs.isVanilla(oreBlock.END_ORE)) {
                    this.add(oreBlock.END_ORE.get(), block -> customDrops_Fortune(oreBlock.END_ORE.get(), oreItems.RAW.get(), 2.0F, 2.0F));
                }
            }

            for (ECMaterialBlocks.SpecialOreBlocks specialOre : ECMaterialBlocks.SpecialOreBlocks.ALL_SPECIAL_ORE_BLOCKS) {
                this.dropSelf(specialOre.ORE.get());
                this.dropSelf(specialOre.DEEPSLATE_ORE.get());
                this.dropSelf(specialOre.NETHER_ORE.get());
                this.dropSelf(specialOre.END_ORE.get());
            }
        }
    }

    private ECElementItems.OreItems getOreItemsByName(String elementName) {
        for (ECElementItems.OreItems oreItem : ECElementItems.OreItems.ALL_ORE_ITEMS) {
            if (oreItem.RAW.getId().getPath().equals("raw_" + elementName)) {
                return oreItem;
            }
        }
        return null;
    }

    protected LootTable.Builder customDrops_Fortune(Block block, Item item, float min, float max) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(block,
                this.applyExplosionDecay(block, LootItem.lootTableItem(item)
                        .apply(SetItemCountFunction.setCount(UniformGenerator.between(min, max)))
                        .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }

    @Override
    protected @NotNull Iterable<Block> getKnownBlocks() {
        return ECElementBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}