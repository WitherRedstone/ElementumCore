package com.chinaex123.elementum_core.data;

import com.chinaex123.elementum_core.ElementumCore;
import com.chinaex123.elementum_core.init.blocks.ECElementBlocks;
import com.chinaex123.elementum_core.init.items.ECMaterialItems;
import com.chinaex123.elementum_core.init.items.ECItems;
import com.chinaex123.elementum_core.util.MaterialName;
import com.chinaex123.elementum_core.util.ModelProviderUtil;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.ItemModelBuilder;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredItem;

public class ModItemModelsProvider extends ItemModelProvider {
    public ModItemModelsProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, ElementumCore.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        ECMaterialItems.OreItems.ALL_ITEMS.forEach(this::basicMaterialItem);
        ECElementBlocks.OreBlocks.ALL_ITEMS.forEach(this::blockItem);

        basicItem(ECItems.GAS_CYLINDER.get());
        gasCylinderItem(ECItems.HYDROGEN_CYLINDER);
        gasCylinderItem(ECItems.HELIUM_CYLINDER);
        gasCylinderItem(ECItems.NITROGEN_CYLINDER);
        gasCylinderItem(ECItems.OXYGEN_CYLINDER);
        gasCylinderItem(ECItems.FLUORINE_CYLINDER);
        gasCylinderItem(ECItems.NEON_CYLINDER);
        gasCylinderItem(ECItems.CHLORINE_CYLINDER);
        gasCylinderItem(ECItems.ARGON_CYLINDER);
        gasCylinderItem(ECItems.KRYPTON_CYLINDER);
        gasCylinderItem(ECItems.XENON_CYLINDER);
        gasCylinderItem(ECItems.RADON_CYLINDER);
        gasCylinderItem(ECItems.OGANESSON_CYLINDER);

        // 流体桶材质
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_HYDROGEN_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_HELIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_LITHIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_BERYLLIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_BORON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_CARBON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_NITROGEN_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_OXYGEN_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_FLUORINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_NEON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_SODIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_MAGNESIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_ALUMINUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_SILICON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_PHOSPHORUS_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_SULFUR_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_CHLORINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_ARGON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_POTASSIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_CALCIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_SCANDIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_TITANIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_VANADIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_CHROMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_MANGANESE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_IRON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_COBALT_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_NICKEL_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_COPPER_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_ZINC_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_GALLIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_GERMANIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_ARSENIC_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_SELENIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.BROMINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_KRYPTON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_RUBIDIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_STRONTIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_YTTRIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_ZIRCONIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_NIOBIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_MOLYBDENUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_TECHNETIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_RUTHENIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_RHODIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_PALLADIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_SILVER_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_CADMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_INDIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_TIN_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_ANTIMONY_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_TELLURIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_IODINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_XENON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_CESIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_BARIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_LANTHANUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_CERIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_PRASEODYMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_NEODYMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_PROMETHIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_SAMARIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_EUROPIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_GADOLINIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_TERBIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_DYSPROSIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_HOLMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_ERBIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_THULIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_YTTERBIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_LUTETIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_HAFNIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_TANTALUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_TUNGSTEN_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_RHENIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_OSMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_IRIDIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_PLATINUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_GOLD_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.MERCURY_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_THALLIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_LEAD_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_BISMUTH_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_POLONIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_ASTATINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_RADON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_FRANCIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_RADIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_ACTINIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_THORIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_PROTACTINIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_URANIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_NEPTUNIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_PLUTONIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_AMERICIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_CURIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_BERKELIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_CALIFORNIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_EINSTEINIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_FERMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_MENDELEVIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_NOBELIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_LAWRENCIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_RUTHERFORDIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_DUBNIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_SEABORGIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_BOHRIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_HASSIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_MEITNERIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_DARMSTADTIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_ROENTGENIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_COPERNICIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_NIHONIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_FLEROVIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_MOSCOVIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_LIVERMORIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_TENNESSINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_OGANESSON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_LONGIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIQUID_MYSTERIUM_BUCKET, this);

        // 气体桶材质
        ModelProviderUtil.bucketGas(ECMaterialItems.HYDROGEN_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.HELIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.LITHIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.BERYLLIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.BORON_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.CARBON_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.NITROGEN_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.OXYGEN_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.FLUORINE_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.NEON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.SODIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.MAGNESIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.ALUMINUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.SILICON_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.PHOSPHORUS_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.SULFUR_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.CHLORINE_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.ARGON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.POTASSIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.CALCIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.SCANDIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.TITANIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.VANADIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.CHROMIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.MANGANESE_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.IRON_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.COBALT_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.NICKEL_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.COPPER_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.ZINC_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.GALLIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.GERMANIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.ARSENIC_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.SELENIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.BROMINE_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.KRYPTON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.RUBIDIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.STRONTIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.YTTRIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.ZIRCONIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.NIOBIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.MOLYBDENUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.TECHNETIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.RUTHENIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.RHODIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.PALLADIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.SILVER_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.CADMIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.INDIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.TIN_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.ANTIMONY_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.TELLURIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.IODINE_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.XENON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.CESIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.BARIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.LANTHANUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.CERIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.PRASEODYMIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.NEODYMIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.PROMETHIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.SAMARIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.EUROPIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.GADOLINIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.TERBIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.DYSPROSIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.HOLMIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.ERBIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.THULIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.YTTERBIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.LUTETIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.HAFNIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.TANTALUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.TUNGSTEN_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.RHENIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.OSMIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.IRIDIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.PLATINUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.GOLD_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.MERCURY_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.THALLIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.LEAD_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.BISMUTH_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.POLONIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.ASTATINE_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.RADON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.FRANCIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.RADIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.ACTINIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.THORIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.PROTACTINIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.URANIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.NEPTUNIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.PLUTONIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.AMERICIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.CURIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.BERKELIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.CALIFORNIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.EINSTEINIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.FERMIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.MENDELEVIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.NOBELIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.LAWRENCIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.RUTHERFORDIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.DUBNIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.SEABORGIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.BOHRIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.HASSIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.MEITNERIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.DARMSTADTIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.ROENTGENIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.COPERNICIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.NIHONIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.FLEROVIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.MOSCOVIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.LIVERMORIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.TENNESSINE_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.OGANESSON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.LONGIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.MYSTERIUM_VAPOR_BUCKET, this);
    }

    /**
     * 化学元素材料物品模型（路径：textures/item/元素文件夹）
     */
    private void basicMaterialItem(DeferredItem<?> item) {
        String itemName = item.getId().getPath();
        String materialName = MaterialName.extractMaterialName(itemName);

        ItemModelBuilder builder = withExistingParent(itemName, ResourceLocation.withDefaultNamespace("item/generated"));
        builder.texture("layer0", ResourceLocation.fromNamespaceAndPath(ElementumCore.MODID, "item/elements/" + materialName + "/" + itemName));
    }

    /**
     * 气瓶物品模型（路径：textures/item/元素文件夹）
     */
    private void gasCylinderItem(DeferredItem<?> item) {
        String itemName = item.getId().getPath();
        String materialName = itemName.replace("_cylinder", "");

        ItemModelBuilder builder = withExistingParent(itemName, ResourceLocation.withDefaultNamespace("item/generated"));
        builder.texture("layer0", ResourceLocation.fromNamespaceAndPath(ElementumCore.MODID, "item/elements/" + materialName + "/" + itemName));
    }

    /**
     * 化学元素方块物品模型（路径：textures/block/元素文件夹）
     */
    private void blockItem(DeferredItem<?> item) {
        String itemName = item.getId().getPath();
        String materialName = MaterialName.extractBlockMaterialName(itemName);

        ItemModelBuilder builder = withExistingParent(itemName, ResourceLocation.withDefaultNamespace("block/cube_all"));
        builder.texture("all", ResourceLocation.fromNamespaceAndPath(ElementumCore.MODID, "block/elements/" + materialName + "/" + itemName));
    }
}
