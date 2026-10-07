package com.chinaex123.elementum_core.data.lang;

import com.chinaex123.elementum_core.ElementumCore;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public abstract class ModLangProvider extends LanguageProvider {

    protected ModLangProvider(PackOutput output, String locale) {
        super(output, ElementumCore.MODID, locale);
    }

    // ==================== 数据表 ====================
    protected abstract String[][] elements();
    protected abstract String[][] minerals();

    // ==================== 翻译模板 ====================
    protected abstract String gasCylinder();
    protected abstract String ingot(String e);
    protected abstract String nugget(String e);
    protected abstract String dust(String e);
    protected abstract String plate(String e);
    protected abstract String rod(String e);
    protected abstract String wire(String e);
    protected abstract String gear(String e);
    protected abstract String crushedRaw(String e);
    protected abstract String raw(String e);
    protected abstract String cylinder(String e);

    protected abstract String block(String e);
    protected abstract String rawBlock(String e);
    protected abstract String ore(String e);
    protected abstract String deepslateOre(String e);
    protected abstract String netherOre(String e);
    protected abstract String endOre(String e);

    protected abstract String fluid(String e);
    protected abstract String bucket(String e);
    protected abstract String fluidBlock(String e);

    protected abstract String gas(String e);
    protected abstract String gasBucket(String e);
    protected abstract String gasBlock(String e);

    protected abstract String mineral(String m);
    protected abstract String deepslateMineral(String m);
    protected abstract String netherMineral(String m);
    protected abstract String endMineral(String m);

    protected abstract String tabMaterial();
    protected abstract String tabItems();
    protected abstract String tabBlocks();
    protected abstract String tabFluids();
    protected abstract String tabGases();

    // ==================== 通用生成逻辑 ====================
    @Override
    protected void addTranslations() {
        add("itemGroup.elementum_core.rce_material_item_tab", tabMaterial());
        add("itemGroup.elementum_core.rce_element_item_tab", tabItems());
        add("itemGroup.elementum_core.rce_element_block_tab", tabBlocks());
        add("itemGroup.elementum_core.rce_element_fluid_tab", tabFluids());
        add("itemGroup.elementum_core.rce_element_gas_tab", tabGases());

        add("item.elementum_core.gas_cylinder", gasCylinder());

        for (String[] entry : elements()) {
            String id = entry[0];
            String name = entry[1];

            add("item.elementum_core." + id + "_ingot", ingot(name));
            add("item.elementum_core." + id + "_nugget", nugget(name));
            add("item.elementum_core." + id + "_dust", dust(name));
            add("item.elementum_core." + id + "_plate", plate(name));
            add("item.elementum_core." + id + "_rod", rod(name));
            add("item.elementum_core." + id + "_wire", wire(name));
            add("item.elementum_core." + id + "_gear", gear(name));
            add("item.elementum_core.crushed_raw_" + id, crushedRaw(name));
            add("item.elementum_core.raw_" + id, raw(name));

            if (isGas(id)) {
                add("item.elementum_core." + id + "_cylinder", cylinder(name));
            }

            add("block.elementum_core." + id + "_block", block(name));
            add("block.elementum_core.raw_" + id + "_block", rawBlock(name));
            add("block.elementum_core." + id + "_ore", ore(name));
            add("block.elementum_core.deepslate_" + id + "_ore", deepslateOre(name));
            add("block.elementum_core.nether_" + id + "_ore", netherOre(name));
            add("block.elementum_core.end_" + id + "_ore", endOre(name));

            add("fluid_type.elementum_core." + id, fluid(name));
            add("item.elementum_core." + id + "_bucket", bucket(name));
            add("block.elementum_core." + id, fluidBlock(name));

            add("fluid_type.elementum_core." + id + "_gas", gas(name));
            add("item.elementum_core." + id + "_gas_bucket", gasBucket(name));
            add("block.elementum_core." + id + "_gas", gasBlock(name));
        }

        for (String[] entry : minerals()) {
            String id = entry[0];
            String name = entry[1];
            add("block.elementum_core." + id, mineral(name));
            add("block.elementum_core.deepslate_" + id, deepslateMineral(name));
            add("block.elementum_core.nether_" + id, netherMineral(name));
            add("block.elementum_core.end_" + id, endMineral(name));
        }
    }

    private static boolean isGas(String id) {
        for (String gas : GAS_ELEMENTS) {
            if (gas.equals(id)) return true;
        }
        return false;
    }

    protected static final String[] GAS_ELEMENTS = {
            "hydrogen", "helium", "nitrogen", "oxygen", "fluorine", "neon",
            "chlorine", "argon", "krypton", "xenon", "radon", "oganesson"
    };
}