package com.chinaex123.elementum_core.init.fluids;

import com.chinaex123.elementum_core.ElementumCore;
import net.minecraft.sounds.SoundEvents;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.NeoForgeRegistries;

public interface ECFluidTypes {
    DeferredRegister<FluidType> FLUID_TYPES = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, ElementumCore.MODID);

    /** 氢气 */
    DeferredHolder<FluidType, FluidType> LIQUID_HYDROGEN_TYPE = registerElement("liquid_hydrogen", 0, 0, 71, 14, 13, 0.05, false, false, false, false, true, false, false);
    /** 氦气 */
    DeferredHolder<FluidType, FluidType> LIQUID_HELIUM_TYPE = registerElement("liquid_helium", 0, 0, 125, 1, 3, 0.05, false, false, false, false, true, false, false);
    /** 锂 */
    DeferredHolder<FluidType, FluidType> LIQUID_LITHIUM_TYPE = registerElement("liquid_lithium", 0, 0, 512, 454, 600, 0.014, false, false, false, false, true, false, false);
    /** 铍 */
    DeferredHolder<FluidType, FluidType> LIQUID_BERYLLIUM_TYPE = registerElement("liquid_beryllium", 0, 0, 1690, 1560, 1500, 0.014, false, false, false, false, true, false, false);
    /** 硼 */
    DeferredHolder<FluidType, FluidType> LIQUID_BORON_TYPE = registerElement("liquid_boron", 0, 0, 2080, 2349, 2000, 0.014, false, false, false, false, true, false, false);
    /** 碳 */
    DeferredHolder<FluidType, FluidType> LIQUID_CARBON_TYPE = registerElement("liquid_carbon", 0, 0, 2000, 3823, 5000, 0.014, false, false, false, false, true, false, false);
    /** 氮气 */
    DeferredHolder<FluidType, FluidType> LIQUID_NITROGEN_TYPE = registerElement("liquid_nitrogen", 0, 0, 808, 63, 160, 0.05, false, false, false, false, true, false, false);
    /** 氧气 */
    DeferredHolder<FluidType, FluidType> LIQUID_OXYGEN_TYPE = registerElement("liquid_oxygen", 0, 0, 1141, 54, 190, 0.05, false, false, false, false, true, false, false);
    /** 氟气 */
    DeferredHolder<FluidType, FluidType> LIQUID_FLUORINE_TYPE = registerElement("liquid_fluorine", 0, 0, 1500, 53, 200, 0.05, false, false, false, true, true, false, false);
    /** 氖气 */
    DeferredHolder<FluidType, FluidType> LIQUID_NEON_TYPE = registerElement("liquid_neon", 0, 0, 1207, 25, 250, 0.05, false, false, false, false, true, false, false);
    /** 钠 */
    DeferredHolder<FluidType, FluidType> LIQUID_SODIUM_TYPE = registerElement("liquid_sodium", 0, 0, 927, 371, 700, 0.014, false, false, false, false, true, false, false);
    /** 镁 */
    DeferredHolder<FluidType, FluidType> LIQUID_MAGNESIUM_TYPE = registerElement("liquid_magnesium", 0, 0, 1584, 923, 1300, 0.014, false, false, false, false, true, false, false);
    /** 铝 */
    DeferredHolder<FluidType, FluidType> LIQUID_ALUMINUM_TYPE = registerElement("liquid_aluminum", 0, 0, 2375, 933, 1300, 0.014, false, false, false, false, true, false, false);
    /** 硅 */
    DeferredHolder<FluidType, FluidType> LIQUID_SILICON_TYPE = registerElement("liquid_silicon", 0, 0, 2570, 1687, 700, 0.014, false, false, false, false, true, false, false);
    /** 磷 */
    DeferredHolder<FluidType, FluidType> LIQUID_PHOSPHORUS_TYPE = registerElement("liquid_phosphorus", 0, 0, 1750, 317, 600, 0.014, false, false, false, false, true, false, false);
    /** 硫 */
    DeferredHolder<FluidType, FluidType> LIQUID_SULFUR_TYPE = registerElement("liquid_sulfur", 0, 0, 1819, 388, 7500, 0.014, false, false, false, false, true, false, false);
    /** 氯气 */
    DeferredHolder<FluidType, FluidType> LIQUID_CHLORINE_TYPE = registerElement("liquid_chlorine", 0, 0, 1564, 172, 400, 0.05, false, false, false, true, true, true, false);
    /** 氩气 */
    DeferredHolder<FluidType, FluidType> LIQUID_ARGON_TYPE = registerElement("liquid_argon", 0, 0, 1396, 84, 250, 0.05, false, false, false, false, true, false, false);
    /** 钾 */
    DeferredHolder<FluidType, FluidType> LIQUID_POTASSIUM_TYPE = registerElement("liquid_potassium", 0, 0, 828, 337, 500, 0.014, false, false, false, false, true, false, false);
    /** 钙 */
    DeferredHolder<FluidType, FluidType> LIQUID_CALCIUM_TYPE = registerElement("liquid_calcium", 0, 0, 1378, 1115, 1300, 0.014, false, false, false, false, true, false, false);
    /** 钪 */
    DeferredHolder<FluidType, FluidType> LIQUID_SCANDIUM_TYPE = registerElement("liquid_scandium", 0, 0, 2800, 1814, 2500, 0.014, false, false, false, false, true, false, false);
    /** 钛 */
    DeferredHolder<FluidType, FluidType> LIQUID_TITANIUM_TYPE = registerElement("liquid_titanium", 0, 0, 4110, 1941, 2600, 0.014, false, false, false, false, true, false, false);
    /** 钒 */
    DeferredHolder<FluidType, FluidType> LIQUID_VANADIUM_TYPE = registerElement("liquid_vanadium", 0, 0, 5500, 2183, 3000, 0.014, false, false, false, false, true, false, false);
    /** 铬 */
    DeferredHolder<FluidType, FluidType> LIQUID_CHROMIUM_TYPE = registerElement("liquid_chromium", 0, 0, 6300, 2180, 3500, 0.014, false, false, false, false, true, false, false);
    /** 锰 */
    DeferredHolder<FluidType, FluidType> LIQUID_MANGANESE_TYPE = registerElement("liquid_manganese", 0, 0, 5950, 1519, 3000, 0.014, false, false, false, false, true, false, false);
    /** 铁 */
    DeferredHolder<FluidType, FluidType> LIQUID_IRON_TYPE = registerElement("liquid_iron", 0, 0, 6980, 1811, 5700, 0.014, false, false, false, false, true, false, false);
    /** 钴 */
    DeferredHolder<FluidType, FluidType> LIQUID_COBALT_TYPE = registerElement("liquid_cobalt", 0, 0, 7750, 1768, 4500, 0.014, false, false, false, false, true, false, false);
    /** 镍 */
    DeferredHolder<FluidType, FluidType> LIQUID_NICKEL_TYPE = registerElement("liquid_nickel", 0, 0, 7810, 1728, 4500, 0.014, false, false, false, false, true, false, false);
    /** 铜 */
    DeferredHolder<FluidType, FluidType> LIQUID_COPPER_TYPE = registerElement("liquid_copper", 0, 0, 8020, 1358, 4200, 0.014, false, false, false, false, true, false, false);
    /** 锌 */
    DeferredHolder<FluidType, FluidType> LIQUID_ZINC_TYPE = registerElement("liquid_zinc", 0, 0, 6570, 693, 3500, 0.014, false, false, false, false, true, false, false);
    /** 镓 */
    DeferredHolder<FluidType, FluidType> LIQUID_GALLIUM_TYPE = registerElement("liquid_gallium", 0, 0, 6095, 303, 1800, 0.014, false, false, false, false, true, false, false);
    /** 锗 */
    DeferredHolder<FluidType, FluidType> LIQUID_GERMANIUM_TYPE = registerElement("liquid_germanium", 0, 0, 5600, 1211, 1000, 0.014, false, false, false, false, true, false, false);
    /** 砷 */
    DeferredHolder<FluidType, FluidType> LIQUID_ARSENIC_TYPE = registerElement("liquid_arsenic", 0, 0, 5200, 1090, 2500, 0.014, false, false, false, false, true, false, false);
    /** 硒 */
    DeferredHolder<FluidType, FluidType> LIQUID_SELENIUM_TYPE = registerElement("liquid_selenium", 0, 0, 3990, 494, 2000, 0.014, false, false, false, false, true, false, false);
    /** 溴 */
    DeferredHolder<FluidType, FluidType> BROMINE_TYPE = registerElement("bromine", 0, 0, 3102, 266, 950, 0.01, false, false, false, true, true, true, true);
    /** 氪气 */
    DeferredHolder<FluidType, FluidType> LIQUID_KRYPTON_TYPE = registerElement("liquid_krypton", 0, 0, 2410, 116, 400, 0.05, false, false, false, false, true, false, false);
    /** 铷 */
    DeferredHolder<FluidType, FluidType> LIQUID_RUBIDIUM_TYPE = registerElement("liquid_rubidium", 0, 0, 1460, 312, 600, 0.014, false, false, false, false, true, false, false);
    /** 锶 */
    DeferredHolder<FluidType, FluidType> LIQUID_STRONTIUM_TYPE = registerElement("liquid_strontium", 0, 0, 2370, 1050, 1500, 0.014, false, false, false, false, true, false, false);
    /** 钇 */
    DeferredHolder<FluidType, FluidType> LIQUID_YTTRIUM_TYPE = registerElement("liquid_yttrium", 0, 0, 4240, 1799, 2500, 0.014, false, false, false, false, true, false, false);
    /** 锆 */
    DeferredHolder<FluidType, FluidType> LIQUID_ZIRCONIUM_TYPE = registerElement("liquid_zirconium", 0, 0, 5800, 2128, 3000, 0.014, false, false, false, false, true, false, false);
    /** 铌 */
    DeferredHolder<FluidType, FluidType> LIQUID_NIOBIUM_TYPE = registerElement("liquid_niobium", 0, 0, 8000, 2750, 3500, 0.014, false, false, false, false, true, false, false);
    /** 钼 */
    DeferredHolder<FluidType, FluidType> LIQUID_MOLYBDENUM_TYPE = registerElement("liquid_molybdenum", 0, 0, 9600, 2896, 4000, 0.014, false, false, false, false, true, false, false);
    /** 锝 */
    DeferredHolder<FluidType, FluidType> LIQUID_TECHNETIUM_TYPE = registerElement("liquid_technetium", 0, 0, 10900, 2430, 4000, 0.014, false, false, false, false, true, false, false);
    /** 钌 */
    DeferredHolder<FluidType, FluidType> LIQUID_RUTHENIUM_TYPE = registerElement("liquid_ruthenium", 0, 0, 11900, 2607, 4500, 0.014, false, false, false, false, true, false, false);
    /** 铑 */
    DeferredHolder<FluidType, FluidType> LIQUID_RHODIUM_TYPE = registerElement("liquid_rhodium", 0, 0, 11900, 2237, 4500, 0.014, false, false, false, false, true, false, false);
    /** 钯 */
    DeferredHolder<FluidType, FluidType> LIQUID_PALLADIUM_TYPE = registerElement("liquid_palladium", 0, 0, 11300, 1828, 4500, 0.014, false, false, false, false, true, false, false);
    /** 银 */
    DeferredHolder<FluidType, FluidType> LIQUID_SILVER_TYPE = registerElement("liquid_silver", 0, 0, 9320, 1235, 3800, 0.014, false, false, false, false, true, false, false);
    /** 镉 */
    DeferredHolder<FluidType, FluidType> LIQUID_CADMIUM_TYPE = registerElement("liquid_cadmium", 0, 0, 7996, 594, 2300, 0.014, false, false, false, false, true, false, false);
    /** 铟 */
    DeferredHolder<FluidType, FluidType> LIQUID_INDIUM_TYPE = registerElement("liquid_indium", 0, 0, 7030, 430, 1800, 0.014, false, false, false, false, true, false, false);
    /** 锡 */
    DeferredHolder<FluidType, FluidType> LIQUID_TIN_TYPE = registerElement("liquid_tin", 0, 0, 6990, 505, 1800, 0.014, false, false, false, false, true, false, false);
    /** 锑 */
    DeferredHolder<FluidType, FluidType> LIQUID_ANTIMONY_TYPE = registerElement("liquid_antimony", 0, 0, 6530, 904, 2500, 0.014, false, false, false, false, true, false, false);
    /** 碲 */
    DeferredHolder<FluidType, FluidType> LIQUID_TELLURIUM_TYPE = registerElement("liquid_tellurium", 0, 0, 6240, 723, 2000, 0.014, false, false, false, false, true, false, false);
    /** 碘 */
    DeferredHolder<FluidType, FluidType> LIQUID_IODINE_TYPE = registerElement("liquid_iodine", 0, 0, 4000, 387, 1200, 0.014, false, false, false, false, true, false, false);
    /** 氙气 */
    DeferredHolder<FluidType, FluidType> LIQUID_XENON_TYPE = registerElement("liquid_xenon", 0, 0, 3100, 161, 500, 0.05, false, false, false, false, true, false, false);
    /** 铯 */
    DeferredHolder<FluidType, FluidType> LIQUID_CESIUM_TYPE = registerElement("liquid_cesium", 0, 0, 1843, 302, 700, 0.014, false, false, false, false, true, false, false);
    /** 钡 */
    DeferredHolder<FluidType, FluidType> LIQUID_BARIUM_TYPE = registerElement("liquid_barium", 0, 0, 3340, 1000, 1500, 0.014, false, false, false, false, true, false, false);
    /** 镧 */
    DeferredHolder<FluidType, FluidType> LIQUID_LANTHANUM_TYPE = registerElement("liquid_lanthanum", 0, 0, 5940, 1193, 2500, 0.014, false, false, false, false, true, false, false);
    /** 铈 */
    DeferredHolder<FluidType, FluidType> LIQUID_CERIUM_TYPE = registerElement("liquid_cerium", 0, 0, 6550, 1068, 2500, 0.014, false, false, false, false, true, false, false);
    /** 镨 */
    DeferredHolder<FluidType, FluidType> LIQUID_PRASEODYMIUM_TYPE = registerElement("liquid_praseodymium", 0, 0, 6500, 1208, 2500, 0.014, false, false, false, false, true, false, false);
    /** 钕 */
    DeferredHolder<FluidType, FluidType> LIQUID_NEODYMIUM_TYPE = registerElement("liquid_neodymium", 0, 0, 6900, 1297, 2500, 0.014, false, false, false, false, true, false, false);
    /** 钷 */
    DeferredHolder<FluidType, FluidType> LIQUID_PROMETHIUM_TYPE = registerElement("liquid_promethium", 0, 0, 7260, 1315, 2500, 0.014, false, false, false, false, true, false, false);
    /** 钐 */
    DeferredHolder<FluidType, FluidType> LIQUID_SAMARIUM_TYPE = registerElement("liquid_samarium", 0, 0, 7370, 1345, 2500, 0.014, false, false, false, false, true, false, false);
    /** 铕 */
    DeferredHolder<FluidType, FluidType> LIQUID_EUROPIUM_TYPE = registerElement("liquid_europium", 0, 0, 5130, 1099, 2000, 0.014, false, false, false, false, true, false, false);
    /** 钆 */
    DeferredHolder<FluidType, FluidType> LIQUID_GADOLINIUM_TYPE = registerElement("liquid_gadolinium", 0, 0, 7400, 1585, 2500, 0.014, false, false, false, false, true, false, false);
    /** 铽 */
    DeferredHolder<FluidType, FluidType> LIQUID_TERBIUM_TYPE = registerElement("liquid_terbium", 0, 0, 7650, 1629, 2500, 0.014, false, false, false, false, true, false, false);
    /** 镝 */
    DeferredHolder<FluidType, FluidType> LIQUID_DYSPROSIUM_TYPE = registerElement("liquid_dysprosium", 0, 0, 8370, 1680, 2500, 0.014, false, false, false, false, true, false, false);
    /** 钬 */
    DeferredHolder<FluidType, FluidType> LIQUID_HOLMIUM_TYPE = registerElement("liquid_holmium", 0, 0, 8200, 1734, 2500, 0.014, false, false, false, false, true, false, false);
    /** 铒 */
    DeferredHolder<FluidType, FluidType> LIQUID_ERBIUM_TYPE = registerElement("liquid_erbium", 0, 0, 8860, 1802, 2500, 0.014, false, false, false, false, true, false, false);
    /** 铥 */
    DeferredHolder<FluidType, FluidType> LIQUID_THULIUM_TYPE = registerElement("liquid_thulium", 0, 0, 9320, 1818, 2500, 0.014, false, false, false, false, true, false, false);
    /** 镱 */
    DeferredHolder<FluidType, FluidType> LIQUID_YTTERBIUM_TYPE = registerElement("liquid_ytterbium", 0, 0, 6900, 1097, 2000, 0.014, false, false, false, false, true, false, false);
    /** 镥 */
    DeferredHolder<FluidType, FluidType> LIQUID_LUTETIUM_TYPE = registerElement("liquid_lutetium", 0, 0, 9840, 1925, 2500, 0.014, false, false, false, false, true, false, false);
    /** 铪 */
    DeferredHolder<FluidType, FluidType> LIQUID_HAFNIUM_TYPE = registerElement("liquid_hafnium", 0, 0, 12000, 2506, 3500, 0.014, false, false, false, false, true, false, false);
    /** 钽 */
    DeferredHolder<FluidType, FluidType> LIQUID_TANTALUM_TYPE = registerElement("liquid_tantalum", 0, 0, 15000, 3290, 4000, 0.014, false, false, false, false, true, false, false);
    /** 钨 */
    DeferredHolder<FluidType, FluidType> LIQUID_TUNGSTEN_TYPE = registerElement("liquid_tungsten", 0, 0, 17600, 3695, 4500, 0.014, false, false, false, false, true, false, false);
    /** 铼 */
    DeferredHolder<FluidType, FluidType> LIQUID_RHENIUM_TYPE = registerElement("liquid_rhenium", 0, 0, 18900, 3459, 4500, 0.014, false, false, false, false, true, false, false);
    /** 锇 */
    DeferredHolder<FluidType, FluidType> LIQUID_OSMIUM_TYPE = registerElement("liquid_osmium", 0, 0, 20000, 3306, 5000, 0.014, false, false, false, false, true, false, false);
    /** 铱 */
    DeferredHolder<FluidType, FluidType> LIQUID_IRIDIUM_TYPE = registerElement("liquid_iridium", 0, 0, 20000, 2719, 5000, 0.014, false, false, false, false, true, false, false);
    /** 铂 */
    DeferredHolder<FluidType, FluidType> LIQUID_PLATINUM_TYPE = registerElement("liquid_platinum", 0, 0, 19200, 2041, 5700, 0.014, false, false, false, false, true, false, false);
    /** 金 */
    DeferredHolder<FluidType, FluidType> LIQUID_GOLD_TYPE = registerElement("liquid_gold", 0, 0, 17300, 1337, 5400, 0.014, false, false, false, false, true, false, false);
    /** 汞（水银） */
    DeferredHolder<FluidType, FluidType> MERCURY_TYPE = registerElement("mercury", 0, 0, 13534, 234, 1530, 0.01, false, false, true, true, true, true, true);
    /** 铊 */
    DeferredHolder<FluidType, FluidType> LIQUID_THALLIUM_TYPE = registerElement("liquid_thallium", 0, 0, 11220, 577, 2500, 0.014, false, false, false, false, true, false, false);
    /** 铅 */
    DeferredHolder<FluidType, FluidType> LIQUID_LEAD_TYPE = registerElement("liquid_lead", 0, 0, 10660, 601, 2600, 0.014, false, false, false, false, true, false, false);
    /** 铋 */
    DeferredHolder<FluidType, FluidType> LIQUID_BISMUTH_TYPE = registerElement("liquid_bismuth", 0, 0, 10050, 545, 1700, 0.014, false, false, false, false, true, false, false);
    /** 钋 */
    DeferredHolder<FluidType, FluidType> LIQUID_POLONIUM_TYPE = registerElement("liquid_polonium", 0, 0, 8800, 527, 2000, 0.014, false, false, false, false, true, false, false);
    /** 砹 */
    DeferredHolder<FluidType, FluidType> LIQUID_ASTATINE_TYPE = registerElement("liquid_astatine", 0, 0, 6400, 575, 1500, 0.014, false, false, false, false, true, false, false);
    /** 氡气 */
    DeferredHolder<FluidType, FluidType> LIQUID_RADON_TYPE = registerElement("liquid_radon", 0, 0, 4400, 202, 600, 0.05, false, false, false, false, true, false, false);
    /** 钫 */
    DeferredHolder<FluidType, FluidType> LIQUID_FRANCIUM_TYPE = registerElement("liquid_francium", 0, 0, 1870, 300, 800, 0.014, false, false, false, false, true, false, false);
    /** 镭 */
    DeferredHolder<FluidType, FluidType> LIQUID_RADIUM_TYPE = registerElement("liquid_radium", 0, 0, 5500, 973, 2000, 0.014, false, false, false, false, true, false, false);
    /** 锕 */
    DeferredHolder<FluidType, FluidType> LIQUID_ACTINIUM_TYPE = registerElement("liquid_actinium", 0, 0, 10070, 1323, 3000, 0.014, false, false, false, false, true, false, false);
    /** 钍 */
    DeferredHolder<FluidType, FluidType> LIQUID_THORIUM_TYPE = registerElement("liquid_thorium", 0, 0, 11720, 2023, 3500, 0.014, false, false, false, false, true, false, false);
    /** 镤 */
    DeferredHolder<FluidType, FluidType> LIQUID_PROTACTINIUM_TYPE = registerElement("liquid_protactinium", 0, 0, 15370, 1841, 3500, 0.014, false, false, false, false, true, false, false);
    /** 铀 */
    DeferredHolder<FluidType, FluidType> LIQUID_URANIUM_TYPE = registerElement("liquid_uranium", 0, 0, 17300, 1405, 6000, 0.014, false, false, false, false, true, false, false);
    /** 镎 */
    DeferredHolder<FluidType, FluidType> LIQUID_NEPTUNIUM_TYPE = registerElement("liquid_neptunium", 0, 0, 18000, 917, 4000, 0.014, false, false, false, false, true, false, false);
    /** 钚 */
    DeferredHolder<FluidType, FluidType> LIQUID_PLUTONIUM_TYPE = registerElement("liquid_plutonium", 0, 0, 16600, 913, 4000, 0.014, false, false, false, false, true, false, false);
    /** 镅 */
    DeferredHolder<FluidType, FluidType> LIQUID_AMERICIUM_TYPE = registerElement("liquid_americium", 0, 0, 12000, 1449, 3500, 0.014, false, false, false, false, true, false, false);
    /** 锔 */
    DeferredHolder<FluidType, FluidType> LIQUID_CURIUM_TYPE = registerElement("liquid_curium", 0, 0, 13000, 1613, 3500, 0.014, false, false, false, false, true, false, false);
    /** 锫 */
    DeferredHolder<FluidType, FluidType> LIQUID_BERKELIUM_TYPE = registerElement("liquid_berkelium", 0, 0, 14000, 1259, 3500, 0.014, false, false, false, false, true, false, false);
    /** 锎 */
    DeferredHolder<FluidType, FluidType> LIQUID_CALIFORNIUM_TYPE = registerElement("liquid_californium", 0, 0, 15000, 1173, 3500, 0.014, false, false, false, false, true, false, false);
    /** 锿 */
    DeferredHolder<FluidType, FluidType> LIQUID_EINSTEINIUM_TYPE = registerElement("liquid_einsteinium", 0, 0, 8840, 1133, 3000, 0.014, false, false, false, false, true, false, false);
    /** 镄 */
    DeferredHolder<FluidType, FluidType> LIQUID_FERMIUM_TYPE = registerElement("liquid_fermium", 0, 0, 9700, 1800, 3000, 0.014, false, false, false, false, true, false, false);
    /** 钔 */
    DeferredHolder<FluidType, FluidType> LIQUID_MENDELEVIUM_TYPE = registerElement("liquid_mendelevium", 0, 0, 10300, 1100, 3000, 0.014, false, false, false, false, true, false, false);
    /** 锘 */
    DeferredHolder<FluidType, FluidType> LIQUID_NOBELIUM_TYPE = registerElement("liquid_nobelium", 0, 0, 9900, 1100, 3000, 0.014, false, false, false, false, true, false, false);
    /** 铹 */
    DeferredHolder<FluidType, FluidType> LIQUID_LAWRENCIUM_TYPE = registerElement("liquid_lawrencium", 0, 0, 15600, 1900, 4000, 0.014, false, false, false, false, true, false, false);
    /** 𬬻 */
    DeferredHolder<FluidType, FluidType> LIQUID_RUTHERFORDIUM_TYPE = registerElement("liquid_rutherfordium", 0, 0, 17000, 2400, 4000, 0.014, false, false, false, false, true, false, false);
    /** 𬭊 */
    DeferredHolder<FluidType, FluidType> LIQUID_DUBNIUM_TYPE = registerElement("liquid_dubnium", 0, 0, 21600, 2900, 4500, 0.014, false, false, false, false, true, false, false);
    /** 𬭳 */
    DeferredHolder<FluidType, FluidType> LIQUID_SEABORGIUM_TYPE = registerElement("liquid_seaborgium", 0, 0, 23000, 3250, 5000, 0.014, false, false, false, false, true, false, false);
    /** 𬭛 */
    DeferredHolder<FluidType, FluidType> LIQUID_BOHRIUM_TYPE = registerElement("liquid_bohrium", 0, 0, 26000, 3000, 5000, 0.014, false, false, false, false, true, false, false);
    /** 𬭶 */
    DeferredHolder<FluidType, FluidType> LIQUID_HASSIUM_TYPE = registerElement("liquid_hassium", 0, 0, 27000, 2900, 5000, 0.014, false, false, false, false, true, false, false);
    /** 鿏 */
    DeferredHolder<FluidType, FluidType> LIQUID_MEITNERIUM_TYPE = registerElement("liquid_meitnerium", 0, 0, 27000, 2500, 5000, 0.014, false, false, false, false, true, false, false);
    /** 𫟼 */
    DeferredHolder<FluidType, FluidType> LIQUID_DARMSTADTIUM_TYPE = registerElement("liquid_darmstadtium", 0, 0, 26000, 2500, 5000, 0.014, false, false, false, false, true, false, false);
    /** 𬬭 */
    DeferredHolder<FluidType, FluidType> LIQUID_ROENTGENIUM_TYPE = registerElement("liquid_roentgenium", 0, 0, 26000, 2200, 5000, 0.014, false, false, false, false, true, false, false);
    /** 鿔 */
    DeferredHolder<FluidType, FluidType> LIQUID_COPERNICIUM_TYPE = registerElement("liquid_copernicium", 0, 0, 14000, 300, 2000, 0.01, false, false, true, false, true, true, true);
    /** 鿭 */
    DeferredHolder<FluidType, FluidType> LIQUID_NIHONIUM_TYPE = registerElement("liquid_nihonium", 0, 0, 16000, 700, 2500, 0.014, false, false, false, false, true, false, false);
    /** 𫓧 */
    DeferredHolder<FluidType, FluidType> LIQUID_FLEROVIUM_TYPE = registerElement("liquid_flerovium", 0, 0, 14000, 200, 2000, 0.014, false, false, false, false, true, false, false);
    /** 镆 */
    DeferredHolder<FluidType, FluidType> LIQUID_MOSCOVIUM_TYPE = registerElement("liquid_moscovium", 0, 0, 13000, 700, 2500, 0.014, false, false, false, false, true, false, false);
    /** 𫟷 */
    DeferredHolder<FluidType, FluidType> LIQUID_LIVERMORIUM_TYPE = registerElement("liquid_livermorium", 0, 0, 12000, 700, 2500, 0.014, false, false, false, false, true, false, false);
    /** 鿬 */
    DeferredHolder<FluidType, FluidType> LIQUID_TENNESSINE_TYPE = registerElement("liquid_tennessine", 0, 0, 7000, 700, 1500, 0.014, false, false, false, false, true, false, false);
    /** 鿫 */
    DeferredHolder<FluidType, FluidType> LIQUID_OGANESSON_TYPE = registerElement("liquid_oganesson", 0, 0, 5000, 325, 1000, 0.05, false, false, false, false, true, false, false);
    /** 鑨 */
    DeferredHolder<FluidType, FluidType> LIQUID_LONGIUM_TYPE = registerElement("liquid_longium", 0, 0, 11000, 1200, 3000, 0.014, false, false, false, false, true, false, false);
    /** 镾 */
    DeferredHolder<FluidType, FluidType> LIQUID_MYSTERIUM_TYPE = registerElement("liquid_mysterium", 0, 0, 12500, 1500, 3500, 0.014, false, false, false, false, true, false, false);

    /**
     * @param name            流体名称
     * @param fallDistance    摔落距离修正系数(默认0.5)
     * @param lightLevel      发光等级(默认0)
     * @param density         密度，影响浮沉(默认1000)
     * @param temperature     温度，影响表现与伤害(默认300)
     * @param viscosity       粘稠度。数值越大流动越慢(默认1000)
     * @param motionScale     实体在流体中的运动速度缩放。数值越小越慢(默认0.014)
     * @param canHydrate      是否能湿润耕地(默认false)
     * @param convertToSource 是否能形成无限源(默认false)
     * @param canExtinguish   是否能扑灭实体身上的火(默认false)
     * @param supportsBoating 是否能漂浮在流体中(默认false)
     * @param canPushEntity   流体是否能推动实体(默认true)
     * @param canDrown        实体是否会在其中溺水(默认true)
     * @param canSwim         实体是否能在其中游泳(默认true)
     *
     * @return 用于延迟获取注册结果。
     */
    private static DeferredHolder<FluidType, FluidType> registerElement(
            String name,
            float fallDistance,
            int lightLevel,
            int density,
            int temperature,
            int viscosity,
            double motionScale,
            boolean canHydrate,
            boolean convertToSource,
            boolean supportsBoating,
            boolean canExtinguish,
            boolean canPushEntity,
            boolean canDrown,
            boolean canSwim
    ) {
        return FLUID_TYPES.register(name, () -> new FluidType(FluidType.Properties.create()
                .descriptionId("block." + ElementumCore.MODID + "." + name)
                .fallDistanceModifier(fallDistance)
                .lightLevel(lightLevel)
                .density(density)
                .temperature(temperature)
                .viscosity(viscosity)
                .canHydrate(canHydrate)
                .canConvertToSource(convertToSource)
                .canSwim(canSwim)
                .canDrown(canDrown)
                .canPushEntity(canPushEntity)
                .canExtinguish(canExtinguish)
                .supportsBoating(supportsBoating)
                .motionScale(motionScale)
                .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
        ));
    }
}