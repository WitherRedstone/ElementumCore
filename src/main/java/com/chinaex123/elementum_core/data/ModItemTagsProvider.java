package com.chinaex123.elementum_core.data;

import com.chinaex123.elementum_core.ElementumCore;
import com.chinaex123.elementum_core.init.blocks.ECElementBlocks;
import com.chinaex123.elementum_core.init.items.ECMaterialItems;
import com.chinaex123.elementum_core.init.tags.ECItemTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.Tags;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagsProvider extends ItemTagsProvider {
    public ModItemTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTags, ElementumCore.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.@NotNull Provider provider) {
        var ingotsTag = this.tag(ECItemTags.INGOTS);
        var nuggetsTag = this.tag(ECItemTags.NUGGETS);
        var gearsTag = this.tag(ECItemTags.GEARS);
        var dustsTag = this.tag(ECItemTags.DUSTS);
        var platesTag = this.tag(ECItemTags.PLATES);
        var rodsTag = this.tag(ECItemTags.RODS);
        var wiresTag = this.tag(ECItemTags.WIRES);
        var crushedRawsTag = this.tag(ECItemTags.CRUSHED_RAW);
        var rawsTag = this.tag(ECItemTags.RAW_MATERIALS);
        var oresTag = this.tag(Tags.Items.ORES);
        var storageBlocksTag = this.tag(Tags.Items.STORAGE_BLOCKS);

        for (ECMaterialItems.OreItems oreItem : ECMaterialItems.OreItems.ALL_ORE_ITEMS) {
            String elementName = oreItem.INGOT.getId().getPath().replace("_ingot", "");

            ingotsTag.add(oreItem.INGOT.get());
            this.tag(ECItemTags.ingotTag(elementName)).add(oreItem.INGOT.get());

            nuggetsTag.add(oreItem.NUGGET.get());
            this.tag(ECItemTags.nuggetTag(elementName)).add(oreItem.NUGGET.get());

            gearsTag.add(oreItem.GEAR.get());
            this.tag(ECItemTags.gearTag(elementName)).add(oreItem.GEAR.get());

            dustsTag.add(oreItem.DUST.get());
            this.tag(ECItemTags.dustTag(elementName)).add(oreItem.DUST.get());

            platesTag.add(oreItem.PLATE.get());
            this.tag(ECItemTags.plateTag(elementName)).add(oreItem.PLATE.get());

            rodsTag.add(oreItem.ROD.get());
            this.tag(ECItemTags.rodTag(elementName)).add(oreItem.ROD.get());

            wiresTag.add(oreItem.WIRE.get());
            this.tag(ECItemTags.wireTag(elementName)).add(oreItem.WIRE.get());

            rawsTag.add(oreItem.RAW.get());
            this.tag(ECItemTags.rawTag(elementName)).add(oreItem.RAW.get());

            crushedRawsTag.add(oreItem.CRUSHED_RAW.get());
            this.tag(ECItemTags.crushedRawTag(elementName)).add(oreItem.CRUSHED_RAW.get());
        }

        for (ECElementBlocks.OreBlocks oreBlock : ECElementBlocks.OreBlocks.ALL_ORE_BLOCKS) {
            String elementName = oreBlock.BLOCK.getId().getPath().replace("_block", "");

            storageBlocksTag.add(oreBlock.BLOCK.get().asItem());
            storageBlocksTag.add(oreBlock.RAW_BLOCK.get().asItem());

            oresTag.add(oreBlock.ORE.get().asItem(), oreBlock.DEEPSLATE_ORE.get().asItem(),
                    oreBlock.NETHER_ORE.get().asItem(), oreBlock.END_ORE.get().asItem());

            this.tag(ECItemTags.oreTag(elementName))
                    .add(oreBlock.ORE.get().asItem(), oreBlock.DEEPSLATE_ORE.get().asItem(),
                            oreBlock.NETHER_ORE.get().asItem(), oreBlock.END_ORE.get().asItem());

            this.tag(ECItemTags.storageBlockTag(elementName))
                    .add(oreBlock.BLOCK.get().asItem());

            this.tag(ECItemTags.stoneOreTag())
                    .add(oreBlock.ORE.get().asItem());

            this.tag(ECItemTags.deepslateOreTag())
                    .add(oreBlock.DEEPSLATE_ORE.get().asItem());

            this.tag(ECItemTags.netherOreTag())
                    .add(oreBlock.NETHER_ORE.get().asItem());

            this.tag(ECItemTags.endOreTag())
                    .add(oreBlock.END_ORE.get().asItem());

            this.tag(ECItemTags.rawStorageBlockTag(elementName))
                    .add(oreBlock.RAW_BLOCK.get().asItem());
        }

        for (ECElementBlocks.SpecialOreBlocks specialOre : ECElementBlocks.SpecialOreBlocks.ALL_SPECIAL_ORE_BLOCKS) {
            String oreName = specialOre.ORE.getId().getPath();

            oresTag.add(specialOre.ORE.get().asItem(), specialOre.DEEPSLATE_ORE.get().asItem(),
                    specialOre.NETHER_ORE.get().asItem(), specialOre.END_ORE.get().asItem());

            this.tag(ECItemTags.oreTag(oreName))
                    .add(specialOre.ORE.get().asItem(), specialOre.DEEPSLATE_ORE.get().asItem(),
                            specialOre.NETHER_ORE.get().asItem(), specialOre.END_ORE.get().asItem());

            this.tag(ECItemTags.stoneOreTag()).add(specialOre.ORE.get().asItem());
            this.tag(ECItemTags.deepslateOreTag()).add(specialOre.DEEPSLATE_ORE.get().asItem());
            this.tag(ECItemTags.netherOreTag()).add(specialOre.NETHER_ORE.get().asItem());
            this.tag(ECItemTags.endOreTag()).add(specialOre.END_ORE.get().asItem());
        }

    }
}
