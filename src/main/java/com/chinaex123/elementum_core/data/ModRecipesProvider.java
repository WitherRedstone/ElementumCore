package com.chinaex123.elementum_core.data;

import com.chinaex123.elementum_core.ElementumCore;
import com.chinaex123.elementum_core.init.blocks.ECElementBlocks;
import com.chinaex123.elementum_core.init.items.ECMaterialItems;
import com.chinaex123.elementum_core.init.tags.ECItemTags;
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

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipesProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipesProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(@NotNull RecipeOutput recipeOutput) {
        for (int i = 0; i < ECMaterialItems.OreItems.ALL_ORE_ITEMS.size(); i++) {
            ECMaterialItems.OreItems oreItem = ECMaterialItems.OreItems.ALL_ORE_ITEMS.get(i);
            ECElementBlocks.OreBlocks oreBlock = ECElementBlocks.OreBlocks.ALL_ORE_BLOCKS.get(i);
            String elementName = oreItem.INGOT.getId().getPath().replace("_ingot", "");

            customOreSmelting(recipeOutput, List.of(Ingredient.of(ECItemTags.rawTag(elementName))), RecipeCategory.MISC, oreItem.INGOT.get(), 0.7f, 200, elementName);
            customOreBlasting(recipeOutput, List.of(Ingredient.of(ECItemTags.rawTag(elementName))), RecipeCategory.MISC, oreItem.INGOT.get(), 0.7f, 100, elementName);

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

        for (int i = 0; i < ECElementBlocks.OreBlocks.ALL_ORE_BLOCKS.size(); i++) {
            ECElementBlocks.OreBlocks oreBlock = ECElementBlocks.OreBlocks.ALL_ORE_BLOCKS.get(i);
            ECMaterialItems.OreItems oreItem = ECMaterialItems.OreItems.ALL_ORE_ITEMS.get(i);
            String elementName = oreItem.INGOT.getId().getPath().replace("_ingot", "");

            customOreSmelting(recipeOutput, List.of(Ingredient.of(ECItemTags.oreTag(elementName))), RecipeCategory.MISC, oreItem.INGOT.get(), 0.7f, 200, elementName + "_ore");
            customOreBlasting(recipeOutput, List.of(Ingredient.of(ECItemTags.oreTag(elementName))), RecipeCategory.MISC, oreItem.INGOT.get(), 0.7f, 100, elementName + "_ore");

            customOreSmelting(recipeOutput, List.of(Ingredient.of(ECItemTags.rawStorageBlockTag(elementName))), RecipeCategory.MISC, oreBlock.BLOCK.get().asItem(), 0.7f, 200, elementName + "_raw_block");
            customOreBlasting(recipeOutput, List.of(Ingredient.of(ECItemTags.rawStorageBlockTag(elementName))), RecipeCategory.MISC, oreBlock.BLOCK.get().asItem(), 0.7f, 100, elementName + "_raw_block");
        }
    }

    private ECMaterialItems.OreItems getOreItemsByName(String elementName) {
        for (ECMaterialItems.OreItems oreItem : ECMaterialItems.OreItems.ALL_ORE_ITEMS) {
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
        return item.asItem().getDescriptionId().replace("item.", "").replace(".", "_");
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
