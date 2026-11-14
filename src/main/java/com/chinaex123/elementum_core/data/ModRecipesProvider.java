package com.chinaex123.elementum_core.data;

import com.chinaex123.elementum_core.ElementumCore;
import com.chinaex123.elementum_core.init.ECElementBlocks;
import com.chinaex123.elementum_core.init.ECElementItems;
import com.chinaex123.elementum_core.init.tags.ECItemTags;
import com.chinaex123.elementum_core.util.ContentRefs;
import net.minecraft.advancements.Criterion;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        for (int i = 0; i < ECElementItems.OreItems.ALL_ORE_ITEMS.size(); i++) {
            ECElementItems.OreItems oreItem = ECElementItems.OreItems.ALL_ORE_ITEMS.get(i);
            ECElementBlocks.OreBlocks oreBlock = ECElementBlocks.OreBlocks.ALL_ORE_BLOCKS.get(i);
            String elementName = oreItem.INGOT.getId().getPath().replace("_ingot", "");

            // 与原版重复的内容不再注册，也就不用再生成原版已有的配方
            boolean vanillaIngot = ContentRefs.isVanilla(oreItem.INGOT);
            boolean vanillaNugget = ContentRefs.isVanilla(oreItem.NUGGET);
            boolean vanillaRaw = ContentRefs.isVanilla(oreItem.RAW);
            boolean vanillaBlock = ContentRefs.isVanilla(oreBlock.BLOCK);
            boolean vanillaRawBlock = ContentRefs.isVanilla(oreBlock.RAW_BLOCK);

            if (!vanillaRaw) {
                customOreSmelting(recipeOutput, List.of(Ingredient.of(ECItemTags.rawTag(elementName))), RecipeCategory.MISC, oreItem.INGOT.get(), 0.7f, 200, elementName);
                customOreBlasting(recipeOutput, List.of(Ingredient.of(ECItemTags.rawTag(elementName))), RecipeCategory.MISC, oreItem.INGOT.get(), 0.7f, 100, elementName);
            }

            if (!(vanillaIngot && vanillaNugget)) {
                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, oreItem.NUGGET.get(), 9)
                        .requires(ECItemTags.ingotTag(elementName))
                        .unlockedBy(getHasName(oreItem.INGOT.get()), has(ECItemTags.ingotTag(elementName)))
                        .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(ElementumCore.MODID, elementName + "_nugget_from_ingot"));

                ShapedRecipeBuilder.shaped(RecipeCategory.MISC, oreItem.INGOT.get())
                        .pattern("NNN")
                        .pattern("NNN")
                        .pattern("NNN")
                        .define('N', ECItemTags.nuggetTag(elementName))
                        .unlockedBy(getHasName(oreItem.NUGGET.get()), has(ECItemTags.nuggetTag(elementName)))
                        .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(ElementumCore.MODID, elementName + "_ingot_from_nugget"));
            }

            if (!(vanillaIngot && vanillaBlock)) {
                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, oreItem.INGOT.get(), 9)
                        .requires(ECItemTags.storageBlockTag(elementName))
                        .unlockedBy(getHasName(oreBlock.BLOCK.get().asItem()), has(ECItemTags.storageBlockTag(elementName)))
                        .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(ElementumCore.MODID, elementName + "_ingot_from_block"));

                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, oreBlock.BLOCK.get().asItem())
                        .pattern("III")
                        .pattern("III")
                        .pattern("III")
                        .define('I', ECItemTags.ingotTag(elementName))
                        .unlockedBy(getHasName(oreItem.INGOT.get()), has(ECItemTags.ingotTag(elementName)))
                        .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(ElementumCore.MODID, elementName + "_block_from_ingot"));
            }

            if (!(vanillaRaw && vanillaRawBlock)) {
                ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, oreItem.RAW.get(), 9)
                        .requires(ECItemTags.rawStorageBlockTag(elementName))
                        .unlockedBy(getHasName(oreBlock.RAW_BLOCK.get().asItem()), has(ECItemTags.rawStorageBlockTag(elementName)))
                        .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(ElementumCore.MODID, elementName + "_raw_from_raw_block"));

                ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, oreBlock.RAW_BLOCK.get().asItem())
                        .pattern("RRR")
                        .pattern("RRR")
                        .pattern("RRR")
                        .define('R', ECItemTags.rawTag(elementName))
                        .unlockedBy(getHasName(oreItem.RAW.get()), has(ECItemTags.rawTag(elementName)))
                        .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(ElementumCore.MODID, elementName + "_raw_block_from_raw"));
            }
        }

        for (int i = 0; i < ECElementBlocks.OreBlocks.ALL_ORE_BLOCKS.size(); i++) {
            ECElementBlocks.OreBlocks oreBlock = ECElementBlocks.OreBlocks.ALL_ORE_BLOCKS.get(i);
            ECElementItems.OreItems oreItem = ECElementItems.OreItems.ALL_ORE_ITEMS.get(i);
            String elementName = oreItem.INGOT.getId().getPath().replace("_ingot", "");

            boolean vanillaBlock = ContentRefs.isVanilla(oreBlock.BLOCK);
            boolean vanillaRawBlock = ContentRefs.isVanilla(oreBlock.RAW_BLOCK);
            boolean vanillaOre = ContentRefs.isVanilla(oreBlock.ORE);
            boolean vanillaDeepslateOre = ContentRefs.isVanilla(oreBlock.DEEPSLATE_ORE);
            boolean vanillaNetherOre = ContentRefs.isVanilla(oreBlock.NETHER_ORE);
            boolean vanillaEndOre = ContentRefs.isVanilla(oreBlock.END_ORE);

            // 四个矿石全部沿用原版时，原版已有对应的烧炼配方
            if (!(vanillaOre && vanillaDeepslateOre && vanillaNetherOre && vanillaEndOre)) {
                Ingredient oreIngredient = oreIngredient(oreBlock, elementName);
                customOreSmelting(recipeOutput, List.of(oreIngredient), RecipeCategory.MISC, oreItem.INGOT.get(), 0.7f, 200, elementName + "_ore");
                customOreBlasting(recipeOutput, List.of(oreIngredient), RecipeCategory.MISC, oreItem.INGOT.get(), 0.7f, 100, elementName + "_ore");
            }

            if (!(vanillaRawBlock && vanillaBlock)) {
                customOreSmelting(recipeOutput, List.of(Ingredient.of(ECItemTags.rawStorageBlockTag(elementName))), RecipeCategory.MISC, oreBlock.BLOCK.get().asItem(), 0.7f, 200, elementName + "_raw_block");
                customOreBlasting(recipeOutput, List.of(Ingredient.of(ECItemTags.rawStorageBlockTag(elementName))), RecipeCategory.MISC, oreBlock.BLOCK.get().asItem(), 0.7f, 100, elementName + "_raw_block");
            }
        }
    }

    /**
     * 矿石烧炼配方的原料：四个变体都属于本模组时用通用矿石标签（可与其他模组互通），
     * 否则只列出本模组注册的矿石，避免和原版已有的烧炼配方重复。
     */
    private static Ingredient oreIngredient(ECElementBlocks.OreBlocks oreBlock, String elementName) {
        List<ItemLike> own = new ArrayList<>();
        if (!ContentRefs.isVanilla(oreBlock.ORE)) {
            own.add(oreBlock.ORE.get());
        }
        if (!ContentRefs.isVanilla(oreBlock.DEEPSLATE_ORE)) {
            own.add(oreBlock.DEEPSLATE_ORE.get());
        }
        if (!ContentRefs.isVanilla(oreBlock.NETHER_ORE)) {
            own.add(oreBlock.NETHER_ORE.get());
        }
        if (!ContentRefs.isVanilla(oreBlock.END_ORE)) {
            own.add(oreBlock.END_ORE.get());
        }
        return own.size() == 4 ? Ingredient.of(ECItemTags.oreTag(elementName)) : Ingredient.of(own.toArray(ItemLike[]::new));
    }

    private ECElementItems.OreItems getOreItemsByName(String elementName) {        for (ECElementItems.OreItems oreItem : ECElementItems.OreItems.ALL_ORE_ITEMS) {
            if (oreItem.RAW.getId().getPath().equals("raw_" + elementName)) {
                return oreItem;
            }
        }
        return null;
    }

    /**
     * 检查物品标签
     */
    protected static Criterion<InventoryChangeTrigger.TriggerInstance> has(TagKey<Item> tag) {
        return InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(tag).build());
    }

    /**
     * 检查具体物品
     */
    protected static Criterion<InventoryChangeTrigger.TriggerInstance> has(Item item) {
        return InventoryChangeTrigger.TriggerInstance.hasItems(item);
    }

    protected static @NotNull String getItemName(ItemLike item) {
        String name = item.asItem().getDescriptionId().replace("item.", "").replace(".", "_");
        // 原版物品的翻译键以 minecraft 开头，去掉它让配方 id 不带冗余命名空间前缀
        return name.startsWith("minecraft_") ? name.substring("minecraft_".length()) : name;
    }

    protected static String getHasName(ItemLike item) {
        return "has_" + getItemName(item);
    }

    protected static void customOreSmelting(
            RecipeOutput recipeOutput, List<Ingredient> ingredients, RecipeCategory category, ItemLike result, float experience, int cookingTime, String group
    ) {
        customOreCooking(
                recipeOutput,
                RecipeSerializer.SMELTING_RECIPE,
                SmeltingRecipe::new,
                ingredients,
                category,
                result,
                experience,
                cookingTime,
                group,
                "_from_smelting"
        );
    }

    protected static void customOreBlasting(
            RecipeOutput recipeOutput, List<Ingredient> ingredients, RecipeCategory category, ItemLike result, float experience, int cookingTime, String group
    ) {
        customOreCooking(
                recipeOutput,
                RecipeSerializer.BLASTING_RECIPE,
                BlastingRecipe::new,
                ingredients,
                category,
                result,
                experience,
                cookingTime,
                group,
                "_from_blasting"
        );
    }

    protected static <T extends AbstractCookingRecipe> void customOreCooking(
            RecipeOutput recipeOutput,
            RecipeSerializer<T> serializer,
            AbstractCookingRecipe.Factory<T> recipeFactory,
            List<Ingredient> ingredients,
            RecipeCategory category,
            ItemLike result,
            float experience,
            int cookingTime,
            String group,
            String suffix
    ) {
        for (Ingredient ingredient : ingredients) {
            SimpleCookingRecipeBuilder.generic(ingredient, category, result, experience, cookingTime, serializer, recipeFactory)
                    .group(group)
                    .unlockedBy("has_" + group, has(result.asItem()))
                    .save(recipeOutput, ResourceLocation.fromNamespaceAndPath(ElementumCore.MODID, getItemName(result) + suffix + "_" + group));
        }
    }
}
