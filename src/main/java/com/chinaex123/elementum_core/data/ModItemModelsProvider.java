package com.chinaex123.elementum_core.data;

import com.chinaex123.elementum_core.ElementumCore;
import com.chinaex123.elementum_core.init.ECBlockElements;
import com.chinaex123.elementum_core.init.ECItemMaterials;
import com.chinaex123.elementum_core.init.ECItems;
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
        ECItemMaterials.OreItems.ALL_ITEMS.forEach(this::basicMaterialItem);
        ECBlockElements.OreBlocks.ALL_ITEMS.forEach(this::blockItem);

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
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_HYDROGEN_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_HELIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_LITHIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_BERYLLIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_BORON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_CARBON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_NITROGEN_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_OXYGEN_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_FLUORINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_NEON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_SODIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_MAGNESIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_ALUMINUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_SILICON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_PHOSPHORUS_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_SULFUR_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_CHLORINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_ARGON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_POTASSIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_CALCIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_SCANDIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_TITANIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_VANADIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_CHROMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_MANGANESE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_IRON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_COBALT_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_NICKEL_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_COPPER_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_ZINC_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_GALLIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_GERMANIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_ARSENIC_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_SELENIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.BROMINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_KRYPTON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_RUBIDIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_STRONTIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_YTTRIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_ZIRCONIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_NIOBIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_MOLYBDENUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_TECHNETIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_RUTHENIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_RHODIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_PALLADIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_SILVER_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_CADMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_INDIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_TIN_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_ANTIMONY_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_TELLURIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_IODINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_XENON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_CESIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_BARIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_LANTHANUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_CERIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_PRASEODYMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_NEODYMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_PROMETHIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_SAMARIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_EUROPIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_GADOLINIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_TERBIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_DYSPROSIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_HOLMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_ERBIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_THULIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_YTTERBIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_LUTETIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_HAFNIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_TANTALUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_TUNGSTEN_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_RHENIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_OSMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_IRIDIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_PLATINUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_GOLD_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.MERCURY_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_THALLIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_LEAD_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_BISMUTH_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_POLONIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_ASTATINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_RADON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_FRANCIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_RADIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_ACTINIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_THORIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_PROTACTINIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_URANIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_NEPTUNIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_PLUTONIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_AMERICIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_CURIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_BERKELIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_CALIFORNIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_EINSTEINIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_FERMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_MENDELEVIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_NOBELIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_LAWRENCIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_RUTHERFORDIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_DUBNIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_SEABORGIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_BOHRIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_HASSIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_MEITNERIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_DARMSTADTIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_ROENTGENIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_COPERNICIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_NIHONIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_FLEROVIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_MOSCOVIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_LIVERMORIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_TENNESSINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_OGANESSON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_LONGIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECItemMaterials.LIQUID_MYSTERIUM_BUCKET, this);

        // 气体桶材质
        ModelProviderUtil.bucketGas(ECItemMaterials.HYDROGEN_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.HELIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.LITHIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.BERYLLIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.BORON_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.CARBON_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.NITROGEN_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.OXYGEN_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.FLUORINE_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.NEON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.SODIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.MAGNESIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.ALUMINUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.SILICON_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.PHOSPHORUS_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.SULFUR_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.CHLORINE_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.ARGON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.POTASSIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.CALCIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.SCANDIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.TITANIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.VANADIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.CHROMIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.MANGANESE_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.IRON_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.COBALT_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.NICKEL_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.COPPER_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.ZINC_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.GALLIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.GERMANIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.ARSENIC_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.SELENIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.BROMINE_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.KRYPTON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.RUBIDIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.STRONTIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.YTTRIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.ZIRCONIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.NIOBIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.MOLYBDENUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.TECHNETIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.RUTHENIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.RHODIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.PALLADIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.SILVER_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.CADMIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.INDIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.TIN_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.ANTIMONY_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.TELLURIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.IODINE_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.XENON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.CESIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.BARIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.LANTHANUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.CERIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.PRASEODYMIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.NEODYMIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.PROMETHIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.SAMARIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.EUROPIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.GADOLINIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.TERBIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.DYSPROSIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.HOLMIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.ERBIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.THULIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.YTTERBIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.LUTETIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.HAFNIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.TANTALUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.TUNGSTEN_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.RHENIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.OSMIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.IRIDIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.PLATINUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.GOLD_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.MERCURY_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.THALLIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.LEAD_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.BISMUTH_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.POLONIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.ASTATINE_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.RADON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.FRANCIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.RADIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.ACTINIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.THORIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.PROTACTINIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.URANIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.NEPTUNIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.PLUTONIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.AMERICIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.CURIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.BERKELIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.CALIFORNIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.EINSTEINIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.FERMIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.MENDELEVIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.NOBELIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.LAWRENCIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.RUTHERFORDIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.DUBNIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.SEABORGIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.BOHRIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.HASSIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.MEITNERIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.DARMSTADTIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.ROENTGENIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.COPERNICIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.NIHONIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.FLEROVIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.MOSCOVIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.LIVERMORIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.TENNESSINE_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.OGANESSON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.LONGIUM_VAPOR_BUCKET, this);
        ModelProviderUtil.bucketGas(ECItemMaterials.MYSTERIUM_VAPOR_BUCKET, this);
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
