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
        ModelProviderUtil.bucketFluids(ECMaterialItems.HYDROGEN_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.HELIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LITHIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.BERYLLIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.BORON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.CARBON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.NITROGEN_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.OXYGEN_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.FLUORINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.NEON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.SODIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.MAGNESIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.ALUMINUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.SILICON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.PHOSPHORUS_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.SULFUR_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.CHLORINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.ARGON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.POTASSIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.CALCIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.SCANDIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.TITANIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.VANADIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.CHROMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.MANGANESE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.IRON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.COBALT_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.NICKEL_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.COPPER_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.ZINC_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.GALLIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.GERMANIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.ARSENIC_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.SELENIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.BROMINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.KRYPTON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.RUBIDIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.STRONTIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.YTTRIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.ZIRCONIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.NIOBIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.MOLYBDENUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.TECHNETIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.RUTHENIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.RHODIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.PALLADIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.SILVER_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.CADMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.INDIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.TIN_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.ANTIMONY_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.TELLURIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.IODINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.XENON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.CESIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.BARIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LANTHANUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.CERIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.PRASEODYMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.NEODYMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.PROMETHIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.SAMARIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.EUROPIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.GADOLINIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.TERBIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.DYSPROSIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.HOLMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.ERBIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.THULIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.YTTERBIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LUTETIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.HAFNIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.TANTALUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.TUNGSTEN_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.RHENIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.OSMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.IRIDIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.PLATINUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.GOLD_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.MERCURY_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.THALLIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LEAD_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.BISMUTH_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.POLONIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.ASTATINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.RADON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.FRANCIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.RADIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.ACTINIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.THORIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.PROTACTINIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.URANIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.NEPTUNIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.PLUTONIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.AMERICIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.CURIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.BERKELIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.CALIFORNIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.EINSTEINIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.FERMIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.MENDELEVIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.NOBELIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LAWRENCIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.RUTHERFORDIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.DUBNIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.SEABORGIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.BOHRIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.HASSIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.MEITNERIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.DARMSTADTIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.ROENTGENIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.COPERNICIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.NIHONIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.FLEROVIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.MOSCOVIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LIVERMORIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.TENNESSINE_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.OGANESSON_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.LONGIUM_BUCKET, this);
        ModelProviderUtil.bucketFluids(ECMaterialItems.MYSTERIUM_BUCKET, this);

        // 气体桶材质
        ModelProviderUtil.bucketGas(ECMaterialItems.HYDROGEN_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.HELIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.LITHIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.BERYLLIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.BORON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.CARBON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.NITROGEN_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.OXYGEN_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.FLUORINE_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.NEON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.SODIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.MAGNESIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.ALUMINUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.SILICON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.PHOSPHORUS_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.SULFUR_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.CHLORINE_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.ARGON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.POTASSIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.CALCIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.SCANDIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.TITANIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.VANADIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.CHROMIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.MANGANESE_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.IRON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.COBALT_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.NICKEL_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.COPPER_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.ZINC_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.GALLIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.GERMANIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.ARSENIC_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.SELENIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.BROMINE_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.KRYPTON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.RUBIDIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.STRONTIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.YTTRIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.ZIRCONIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.NIOBIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.MOLYBDENUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.TECHNETIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.RUTHENIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.RHODIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.PALLADIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.SILVER_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.CADMIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.INDIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.TIN_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.ANTIMONY_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.TELLURIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.IODINE_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.XENON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.CESIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.BARIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.LANTHANUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.CERIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.PRASEODYMIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.NEODYMIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.PROMETHIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.SAMARIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.EUROPIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.GADOLINIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.TERBIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.DYSPROSIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.HOLMIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.ERBIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.THULIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.YTTERBIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.LUTETIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.HAFNIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.TANTALUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.TUNGSTEN_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.RHENIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.OSMIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.IRIDIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.PLATINUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.GOLD_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.MERCURY_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.THALLIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.LEAD_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.BISMUTH_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.POLONIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.ASTATINE_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.RADON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.FRANCIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.RADIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.ACTINIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.THORIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.PROTACTINIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.URANIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.NEPTUNIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.PLUTONIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.AMERICIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.CURIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.BERKELIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.CALIFORNIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.EINSTEINIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.FERMIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.MENDELEVIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.NOBELIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.LAWRENCIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.RUTHERFORDIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.DUBNIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.SEABORGIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.BOHRIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.HASSIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.MEITNERIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.DARMSTADTIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.ROENTGENIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.COPERNICIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.NIHONIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.FLEROVIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.MOSCOVIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.LIVERMORIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.TENNESSINE_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.OGANESSON_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.LONGIUM_GAS_BUCKET, this);
        ModelProviderUtil.bucketGas(ECMaterialItems.MYSTERIUM_GAS_BUCKET, this);
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
