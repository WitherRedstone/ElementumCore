package com.chinaex123.elementum_core.init.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public interface ECBlockTags {

    static TagKey<Block> oreTag(String elementName) {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", "ores/" + elementName));
    }

    static TagKey<Block> storageBlockTag(String elementName) {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/" + elementName));
    }

    static TagKey<Block> stoneOreTag() {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone"));
    }

    static TagKey<Block> deepslateOreTag() {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate"));
    }

    static TagKey<Block> netherOreTag() {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack"));
    }

    static TagKey<Block> endOreTag() {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone"));
    }

    static TagKey<Block> rawStorageBlockTag(String elementName) {
        return TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_" + elementName));
    }
}
