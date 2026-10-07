package com.chinaex123.elementum_core.init.tags;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public interface ECItemTags {

    TagKey<Item> INGOTS = neoforgeItemTag("ingots"); // c:ingots
    TagKey<Item> NUGGETS = neoforgeItemTag("nuggets"); // c:nuggets
    TagKey<Item> GEARS = neoforgeItemTag("gears"); // c:gears
    TagKey<Item> DUSTS = neoforgeItemTag("dusts"); // c:dusts
    TagKey<Item> PLATES = neoforgeItemTag("plates"); // c:plates
    TagKey<Item> RODS = neoforgeItemTag("rods"); // c:rods
    TagKey<Item> WIRES = neoforgeItemTag("wires"); // c:wire/wires
    TagKey<Item> RAW_MATERIALS = neoforgeItemTag("raw_materials"); // c:raw_materials
    TagKey<Item> CRUSHED_RAW = neoforgeItemTag("crushed_raw"); // c:crushed_raw

    static TagKey<Item> neoforgeItemTag(String name) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", name));
    }

    static TagKey<Item> ingotTag(String elementName) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "ingots/" + elementName));
    }

    static TagKey<Item> nuggetTag(String elementName) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "nuggets/" + elementName));
    }

    static TagKey<Item> gearTag(String elementName) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "gears/" + elementName));
    }

    static TagKey<Item> dustTag(String elementName) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "dusts/" + elementName));
    }

    static TagKey<Item> plateTag(String elementName) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "plates/" + elementName));
    }

    static TagKey<Item> rodTag(String elementName) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "rods/" + elementName));
    }

    static TagKey<Item> wireTag(String elementName) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "wires/" + elementName));
    }

    static TagKey<Item> rawTag(String elementName) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "raw_materials/" + elementName));
    }

    static TagKey<Item> crushedRawTag(String elementName) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "crushed_raw/" + elementName));
    }

    static TagKey<Item> oreTag(String elementName) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "ores/" + elementName));
    }

    static TagKey<Item> stoneOreTag() {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/stone"));
    }

    static TagKey<Item> deepslateOreTag() {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/deepslate"));
    }

    static TagKey<Item> netherOreTag() {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/netherrack"));
    }

    static TagKey<Item> endOreTag() {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "ores_in_ground/end_stone"));
    }

    static TagKey<Item> storageBlockTag(String elementName) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/" + elementName));
    }

    static TagKey<Item> rawStorageBlockTag(String elementName) {
        return TagKey.create(Registries.ITEM, ResourceLocation.fromNamespaceAndPath("c", "storage_blocks/raw_" + elementName));
    }
}
