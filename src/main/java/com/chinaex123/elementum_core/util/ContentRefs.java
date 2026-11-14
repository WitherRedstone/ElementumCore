package com.chinaex123.elementum_core.util;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.registries.DeferredHolder;

import java.util.Optional;

public final class ContentRefs {

    public static DeferredHolder<Item, Item> vanillaItem(Item item) {
        return DeferredHolder.create(requireKey(BuiltInRegistries.ITEM.getResourceKey(item)));
    }

    public static DeferredHolder<Block, Block> vanillaBlock(Block block) {
        return DeferredHolder.create(requireKey(BuiltInRegistries.BLOCK.getResourceKey(block)));
    }

    public static boolean isVanilla(DeferredHolder<?, ?> holder) {
        return holder != null && "minecraft".equals(holder.getId().getNamespace());
    }

    public static boolean isModded(DeferredHolder<?, ?> holder) {
        return holder != null && !isVanilla(holder);
    }

    private static <T> ResourceKey<T> requireKey(Optional<ResourceKey<T>> key) {
        return key.orElseThrow(() -> new IllegalStateException("引用的内容尚未在原版注册表中登记"));
    }
}
