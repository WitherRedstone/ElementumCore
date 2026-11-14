package com.chinaex123.elementum_core.data;

import com.chinaex123.elementum_core.ElementumCore;
import com.chinaex123.elementum_core.init.ECElementBlocks;
import com.chinaex123.elementum_core.init.ECElementItems;
import com.chinaex123.elementum_core.init.ECMaterialItems;
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
        ECElementItems.OreItems.ALL_ITEMS.forEach(this::basicMaterialItem);
        ECElementBlocks.OreBlocks.ALL_ITEMS.forEach(this::blockItem);

        basicItem(ECMaterialItems.GAS_CYLINDER.get());
        gasCylinderItem(ECMaterialItems.HYDROGEN_CYLINDER);
        gasCylinderItem(ECMaterialItems.HELIUM_CYLINDER);
        gasCylinderItem(ECMaterialItems.NITROGEN_CYLINDER);
        gasCylinderItem(ECMaterialItems.OXYGEN_CYLINDER);
        gasCylinderItem(ECMaterialItems.FLUORINE_CYLINDER);
        gasCylinderItem(ECMaterialItems.NEON_CYLINDER);
        gasCylinderItem(ECMaterialItems.CHLORINE_CYLINDER);
        gasCylinderItem(ECMaterialItems.ARGON_CYLINDER);
        gasCylinderItem(ECMaterialItems.KRYPTON_CYLINDER);
        gasCylinderItem(ECMaterialItems.XENON_CYLINDER);
        gasCylinderItem(ECMaterialItems.RADON_CYLINDER);
        gasCylinderItem(ECMaterialItems.OGANESSON_CYLINDER);

        // 流体桶材质
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_HYDROGEN_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_HELIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_LITHIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_BERYLLIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_BORON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_CARBON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_NITROGEN_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_OXYGEN_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_FLUORINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_NEON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_SODIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_MAGNESIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_ALUMINUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_SILICON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_PHOSPHORUS_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_SULFUR_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_CHLORINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_ARGON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_POTASSIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_CALCIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_SCANDIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_TITANIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_VANADIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_CHROMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_MANGANESE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_IRON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_COBALT_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_NICKEL_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_COPPER_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_ZINC_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_GALLIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_GERMANIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_ARSENIC_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_SELENIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.BROMINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_KRYPTON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_RUBIDIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_STRONTIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_YTTRIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_ZIRCONIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_NIOBIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_MOLYBDENUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_TECHNETIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_RUTHENIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_RHODIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_PALLADIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_SILVER_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_CADMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_INDIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_TIN_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_ANTIMONY_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_TELLURIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_IODINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_XENON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_CESIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_BARIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_LANTHANUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_CERIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_PRASEODYMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_NEODYMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_PROMETHIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_SAMARIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_EUROPIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_GADOLINIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_TERBIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_DYSPROSIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_HOLMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_ERBIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_THULIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_YTTERBIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_LUTETIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_HAFNIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_TANTALUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_TUNGSTEN_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_RHENIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_OSMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_IRIDIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_PLATINUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_GOLD_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.MERCURY_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_THALLIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_LEAD_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_BISMUTH_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_POLONIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_ASTATINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_RADON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_FRANCIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_RADIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_ACTINIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_THORIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_PROTACTINIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_URANIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_NEPTUNIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_PLUTONIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_AMERICIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_CURIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_BERKELIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_CALIFORNIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_EINSTEINIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_FERMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_MENDELEVIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_NOBELIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_LAWRENCIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_RUTHERFORDIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_DUBNIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_SEABORGIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_BOHRIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_HASSIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_MEITNERIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_DARMSTADTIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_ROENTGENIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_COPERNICIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_NIHONIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_FLEROVIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_MOSCOVIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_LIVERMORIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_TENNESSINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_OGANESSON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_LONGIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECElementItems.LIQUID_MYSTERIUM_BUCKET, this);

        // 气体桶材质
        ModelProviderUtil.bucketGas(ECElementItems.HYDROGEN_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.HELIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.LITHIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.BERYLLIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.BORON_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.CARBON_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.NITROGEN_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.OXYGEN_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.FLUORINE_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.NEON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.SODIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.MAGNESIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.ALUMINUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.SILICON_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.PHOSPHORUS_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.SULFUR_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.CHLORINE_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.ARGON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.POTASSIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.CALCIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.SCANDIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.TITANIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.VANADIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.CHROMIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.MANGANESE_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.IRON_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.COBALT_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.NICKEL_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.COPPER_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.ZINC_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.GALLIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.GERMANIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.ARSENIC_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.SELENIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.BROMINE_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.KRYPTON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.RUBIDIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.STRONTIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.YTTRIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.ZIRCONIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.NIOBIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.MOLYBDENUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.TECHNETIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.RUTHENIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.RHODIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.PALLADIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.SILVER_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.CADMIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.INDIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.TIN_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.ANTIMONY_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.TELLURIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.IODINE_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.XENON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.CESIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.BARIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.LANTHANUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.CERIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.PRASEODYMIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.NEODYMIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.PROMETHIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.SAMARIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.EUROPIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.GADOLINIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.TERBIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.DYSPROSIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.HOLMIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.ERBIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.THULIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.YTTERBIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.LUTETIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.HAFNIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.TANTALUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.TUNGSTEN_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.RHENIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.OSMIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.IRIDIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.PLATINUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.GOLD_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.MERCURY_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.THALLIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.LEAD_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.BISMUTH_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.POLONIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.ASTATINE_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.RADON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.FRANCIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.RADIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.ACTINIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.THORIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.PROTACTINIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.URANIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.NEPTUNIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.PLUTONIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.AMERICIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.CURIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.BERKELIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.CALIFORNIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.EINSTEINIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.FERMIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.MENDELEVIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.NOBELIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.LAWRENCIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.RUTHERFORDIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.DUBNIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.SEABORGIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.BOHRIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.HASSIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.MEITNERIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.DARMSTADTIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.ROENTGENIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.COPERNICIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.NIHONIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.FLEROVIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.MOSCOVIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.LIVERMORIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.TENNESSINE_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.OGANESSON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.LONGIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECElementItems.MYSTERIUM_VAPOR_BUCKET, this);
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
