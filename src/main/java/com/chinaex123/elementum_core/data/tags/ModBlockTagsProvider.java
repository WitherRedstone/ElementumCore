package com.chinaex123.elementum_core.data.tags;

import com.chinaex123.elementum_core.ElementumCore;
import com.chinaex123.elementum_core.init.ECElementBlocks;
import com.chinaex123.elementum_core.init.ECMaterialBlocks;
import com.chinaex123.elementum_core.init.tags.ECBlockTags;
import com.chinaex123.elementum_core.util.ContentRefs;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredHolder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ElementumCore.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        var beaconBaseTag = this.tag(BlockTags.BEACON_BASE_BLOCKS);
        var storageBlockTag = this.tag(Tags.Blocks.STORAGE_BLOCKS);
        var stoneToolTag = this.tag(BlockTags.NEEDS_STONE_TOOL);
        var pickaxeTag = this.tag(BlockTags.MINEABLE_WITH_PICKAXE);
        var ironToolTag = this.tag(BlockTags.NEEDS_IRON_TOOL);
        var diamondToolTag = this.tag(BlockTags.NEEDS_DIAMOND_TOOL);
        var oresTag = this.tag(Tags.Blocks.ORES);

        for (ECElementBlocks.OreBlocks oreBlock : ECElementBlocks.OreBlocks.ALL_ORE_BLOCKS) {
            String elementName = oreBlock.BLOCK.getId().getPath().replace("_block", "");

            if (!ContentRefs.isVanilla(oreBlock.BLOCK)) {
                beaconBaseTag.add(oreBlock.BLOCK.get());
                storageBlockTag.add(oreBlock.BLOCK.get());
                this.tag(ECBlockTags.storageBlockTag(elementName)).add(oreBlock.BLOCK.get());
            }

            if (!ContentRefs.isVanilla(oreBlock.RAW_BLOCK)) {
                storageBlockTag.add(oreBlock.RAW_BLOCK.get());
                this.tag(ECBlockTags.rawStorageBlockTag(elementName)).add(oreBlock.RAW_BLOCK.get());
            }

            if (!ContentRefs.isVanilla(oreBlock.ORE)) {
                oresTag.add(oreBlock.ORE.get());
                this.tag(ECBlockTags.oreTag(elementName)).add(oreBlock.ORE.get());
                this.tag(ECBlockTags.stoneOreTag()).add(oreBlock.ORE.get());
            }

            if (!ContentRefs.isVanilla(oreBlock.DEEPSLATE_ORE)) {
                oresTag.add(oreBlock.DEEPSLATE_ORE.get());
                this.tag(ECBlockTags.oreTag(elementName)).add(oreBlock.DEEPSLATE_ORE.get());
                this.tag(ECBlockTags.deepslateOreTag()).add(oreBlock.DEEPSLATE_ORE.get());
            }

            if (!ContentRefs.isVanilla(oreBlock.NETHER_ORE)) {
                oresTag.add(oreBlock.NETHER_ORE.get());
                this.tag(ECBlockTags.oreTag(elementName)).add(oreBlock.NETHER_ORE.get());
                this.tag(ECBlockTags.netherOreTag()).add(oreBlock.NETHER_ORE.get());
            }

            if (!ContentRefs.isVanilla(oreBlock.END_ORE)) {
                oresTag.add(oreBlock.END_ORE.get());
                this.tag(ECBlockTags.oreTag(elementName)).add(oreBlock.END_ORE.get());
                this.tag(ECBlockTags.endOreTag()).add(oreBlock.END_ORE.get());
            }

            boolean stoneTier = "iron".equals(elementName) || "copper".equals(elementName);
            boolean ironTier = "gold".equals(elementName) || "aluminum".equals(elementName) || "zinc".equals(elementName) ||
                    "silver".equals(elementName) || "tin".equals(elementName) || "osmium".equals(elementName) ||
                    "platinum".equals(elementName) || "lead".equals(elementName) || "uranium".equals(elementName) ||
                    "nickel".equals(elementName);

            for (DeferredHolder<Block, Block> block : List.of(oreBlock.BLOCK, oreBlock.RAW_BLOCK, oreBlock.ORE,
                    oreBlock.DEEPSLATE_ORE, oreBlock.NETHER_ORE, oreBlock.END_ORE)) {
                if (ContentRefs.isVanilla(block)) {
                    continue;
                }

                pickaxeTag.add(block.get());

                if (stoneTier) {
                    if (block == oreBlock.NETHER_ORE || block == oreBlock.END_ORE) {
                        ironToolTag.add(block.get());
                    } else {
                        stoneToolTag.add(block.get());
                    }
                } else if (ironTier) {
                    ironToolTag.add(block.get());
                } else {
                    diamondToolTag.add(block.get());
                }
            }
        }

        for (ECMaterialBlocks.SpecialOreBlocks specialOre : ECMaterialBlocks.SpecialOreBlocks.ALL_SPECIAL_ORE_BLOCKS) {
            String oreName = specialOre.ORE.getId().getPath();

            pickaxeTag.add(specialOre.ORE.get(), specialOre.DEEPSLATE_ORE.get(),
                    specialOre.NETHER_ORE.get(), specialOre.END_ORE.get());
            diamondToolTag.add(specialOre.ORE.get(), specialOre.DEEPSLATE_ORE.get(),
                    specialOre.NETHER_ORE.get(), specialOre.END_ORE.get());
            oresTag.add(specialOre.ORE.get(), specialOre.DEEPSLATE_ORE.get(),
                    specialOre.NETHER_ORE.get(), specialOre.END_ORE.get());

            this.tag(ECBlockTags.oreTag(oreName)).add(specialOre.ORE.get(), specialOre.DEEPSLATE_ORE.get(),
                    specialOre.NETHER_ORE.get(), specialOre.END_ORE.get());

            this.tag(ECBlockTags.stoneOreTag()).add(specialOre.ORE.get());
            this.tag(ECBlockTags.deepslateOreTag()).add(specialOre.DEEPSLATE_ORE.get());
            this.tag(ECBlockTags.netherOreTag()).add(specialOre.NETHER_ORE.get());
            this.tag(ECBlockTags.endOreTag()).add(specialOre.END_ORE.get());
        }
    }
}