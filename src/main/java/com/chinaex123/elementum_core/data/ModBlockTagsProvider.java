package com.chinaex123.elementum_core.data;

import com.chinaex123.elementum_core.ElementumCore;
import com.chinaex123.elementum_core.init.blocks.ECElementBlocks;
import com.chinaex123.elementum_core.init.tags.ECBlockTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
            beaconBaseTag.add(oreBlock.BLOCK.get());
            storageBlockTag.add(oreBlock.BLOCK.get());
            storageBlockTag.add(oreBlock.RAW_BLOCK.get());
            pickaxeTag.add(oreBlock.BLOCK.get(), oreBlock.RAW_BLOCK.get(), oreBlock.ORE.get(),
                    oreBlock.DEEPSLATE_ORE.get(), oreBlock.NETHER_ORE.get(), oreBlock.END_ORE.get());

            String elementName = oreBlock.BLOCK.getId().getPath().replace("_block", "");

            this.tag(ECBlockTags.oreTag(elementName)).add(oreBlock.ORE.get(), oreBlock.DEEPSLATE_ORE.get(),
                    oreBlock.NETHER_ORE.get(), oreBlock.END_ORE.get());
            oresTag.add(oreBlock.ORE.get(), oreBlock.DEEPSLATE_ORE.get(), oreBlock.NETHER_ORE.get(), oreBlock.END_ORE.get());

            this.tag(ECBlockTags.storageBlockTag(elementName))
                    .add(oreBlock.BLOCK.get());

            this.tag(ECBlockTags.stoneOreTag())
                    .add(oreBlock.ORE.get());

            this.tag(ECBlockTags.deepslateOreTag())
                    .add(oreBlock.DEEPSLATE_ORE.get());

            this.tag(ECBlockTags.netherOreTag())
                    .add(oreBlock.NETHER_ORE.get());

            this.tag(ECBlockTags.endOreTag())
                    .add(oreBlock.END_ORE.get());

            this.tag(ECBlockTags.rawStorageBlockTag(elementName))
                    .add(oreBlock.RAW_BLOCK.get());

            if ("iron".equals(elementName) || "copper".equals(elementName)) {
                stoneToolTag.add(oreBlock.BLOCK.get(), oreBlock.RAW_BLOCK.get(), oreBlock.ORE.get(), oreBlock.DEEPSLATE_ORE.get());
                ironToolTag.add(oreBlock.NETHER_ORE.get(), oreBlock.END_ORE.get());
            } else if ("gold".equals(elementName) || "aluminum".equals(elementName) || "zinc".equals(elementName) ||
                    "silver".equals(elementName) || "tin".equals(elementName) || "osmium".equals(elementName) ||
                    "platinum".equals(elementName) || "lead".equals(elementName) || "uranium".equals(elementName) ||
                    "nickel".equals(elementName)) {
                ironToolTag.add(oreBlock.BLOCK.get(), oreBlock.RAW_BLOCK.get(), oreBlock.ORE.get(),
                        oreBlock.DEEPSLATE_ORE.get(), oreBlock.NETHER_ORE.get(), oreBlock.END_ORE.get());
            } else {
                diamondToolTag.add(oreBlock.BLOCK.get(), oreBlock.RAW_BLOCK.get(), oreBlock.ORE.get(),
                        oreBlock.DEEPSLATE_ORE.get(), oreBlock.NETHER_ORE.get(), oreBlock.END_ORE.get());
            }
        }

        for (ECElementBlocks.SpecialOreBlocks specialOre : ECElementBlocks.SpecialOreBlocks.ALL_SPECIAL_ORE_BLOCKS) {
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