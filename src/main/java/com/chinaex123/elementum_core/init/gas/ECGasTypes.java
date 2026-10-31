package com.chinaex123.elementum_core.init.gas;

import com.chinaex123.elementum_core.ElementumCore;
import net.minecraft.sounds.SoundEvents;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.*;

public interface ECGasTypes {
    DeferredRegister<FluidType> GAS_TYPES = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, ElementumCore.MODID);

    /** 氢气 */
    DeferredHolder<FluidType, FluidType> HYDROGEN_GAS_TYPE = registerGas("hydrogen_gas", 0, 0, -70, 20, 8, 0.05, false, false, false, false, true, false, false);
    /** 氦气 */
    DeferredHolder<FluidType, FluidType> HELIUM_GAS_TYPE = registerGas("helium_gas", 0, 0, -138, 4, 20, 0.05, false, false, false, false, true, false, false);
    /** 锂蒸气 */
    DeferredHolder<FluidType, FluidType> LITHIUM_VAPOR_TYPE = registerGas("lithium_vapor", 0, 0, -239, 1615, 15, 0.014, false, false, false, false, false, false, false);
    /** 铍蒸气 */
    DeferredHolder<FluidType, FluidType> BERYLLIUM_VAPOR_TYPE = registerGas("beryllium_vapor", 0, 0, -311, 2743, 15, 0.014, false, false, false, false, false, false, false);
    /** 硼蒸气 */
    DeferredHolder<FluidType, FluidType> BORON_VAPOR_TYPE = registerGas("boron_vapor", 0, 0, -373, 4200, 15, 0.014, false, false, false, false, false, false, false);
    /** 碳蒸气 */
    DeferredHolder<FluidType, FluidType> CARBON_VAPOR_TYPE = registerGas("carbon_vapor", 0, 0, -414, 4098, 15, 0.014, false, false, false, false, false, false, false);
    /** 氮气 */
    DeferredHolder<FluidType, FluidType> NITROGEN_GAS_TYPE = registerGas("nitrogen_gas", 0, 0, -966, 77, 18, 0.05, false, false, false, false, true, false, false);
    /** 氧气 */
    DeferredHolder<FluidType, FluidType> OXYGEN_GAS_TYPE = registerGas("oxygen_gas", 0, 0, -1103, 90, 20, 0.05, false, false, false, false, true, false, false);
    /** 氟气 */
    DeferredHolder<FluidType, FluidType> FLUORINE_GAS_TYPE = registerGas("fluorine_gas", 0, 0, -1310, 85, 13, 0.05, false, false, false, true, true, false, false);
    /** 氖气 */
    DeferredHolder<FluidType, FluidType> NEON_GAS_TYPE = registerGas("neon_gas", 0, 0, -696, 27, 31, 0.05, false, false, false, false, true, false, false);
    /** 钠蒸气 */
    DeferredHolder<FluidType, FluidType> SODIUM_VAPOR_TYPE = registerGas("sodium_vapor", 0, 0, -793, 1156, 15, 0.014, false, false, false, false, false, false, false);
    /** 镁蒸气 */
    DeferredHolder<FluidType, FluidType> MAGNESIUM_VAPOR_TYPE = registerGas("magnesium_vapor", 0, 0, -838, 1363, 15, 0.014, false, false, false, false, false, false, false);
    /** 铝蒸气 */
    DeferredHolder<FluidType, FluidType> ALUMINUM_VAPOR_TYPE = registerGas("aluminum_vapor", 0, 0, -930, 2792, 15, 0.014, false, false, false, false, false, false, false);
    /** 硅蒸气 */
    DeferredHolder<FluidType, FluidType> SILICON_VAPOR_TYPE = registerGas("silicon_vapor", 0, 0, -969, 3538, 15, 0.014, false, false, false, false, false, false, false);
    /** 磷蒸气 */
    DeferredHolder<FluidType, FluidType> PHOSPHORUS_VAPOR_TYPE = registerGas("phosphorus_vapor", 0, 0, -1068, 554, 15, 0.014, false, false, false, false, false, false, false);
    /** 硫蒸气 */
    DeferredHolder<FluidType, FluidType> SULFUR_VAPOR_TYPE = registerGas("sulfur_vapor", 0, 0, -1106, 718, 15, 0.014, false, false, false, false, false, false, false);
    /** 氯气 */
    DeferredHolder<FluidType, FluidType> CHLORINE_GAS_TYPE = registerGas("chlorine_gas", 0, 0, -2445, 239, 13, 0.05, false, false, false, true, true, true, false);
    /** 氩气 */
    DeferredHolder<FluidType, FluidType> ARGON_GAS_TYPE = registerGas("argon_gas", 0, 0, -1378, 87, 22, 0.05, false, false, false, false, true, false, false);
    /** 钾蒸气 */
    DeferredHolder<FluidType, FluidType> POTASSIUM_VAPOR_TYPE = registerGas("potassium_vapor", 0, 0, -1348, 1032, 15, 0.014, false, false, false, false, false, false, false);
    /** 钙蒸气 */
    DeferredHolder<FluidType, FluidType> CALCIUM_VAPOR_TYPE = registerGas("calcium_vapor", 0, 0, -1382, 1757, 15, 0.014, false, false, false, false, false, false, false);
    /** 钪蒸气 */
    DeferredHolder<FluidType, FluidType> SCANDIUM_VAPOR_TYPE = registerGas("scandium_vapor", 0, 0, -1550, 3109, 15, 0.014, false, false, false, false, false, false, false);
    /** 钛蒸气 */
    DeferredHolder<FluidType, FluidType> TITANIUM_VAPOR_TYPE = registerGas("titanium_vapor", 0, 0, -1651, 3560, 15, 0.014, false, false, false, false, false, false, false);
    /** 钒蒸气 */
    DeferredHolder<FluidType, FluidType> VANADIUM_VAPOR_TYPE = registerGas("vanadium_vapor", 0, 0, -1757, 3680, 15, 0.014, false, false, false, false, false, false, false);
    /** 铬蒸气 */
    DeferredHolder<FluidType, FluidType> CHROMIUM_VAPOR_TYPE = registerGas("chromium_vapor", 0, 0, -1793, 2944, 15, 0.014, false, false, false, false, false, false, false);
    /** 锰蒸气 */
    DeferredHolder<FluidType, FluidType> MANGANESE_VAPOR_TYPE = registerGas("manganese_vapor", 0, 0, -1894, 2334, 15, 0.014, false, false, false, false, false, false, false);
    /** 铁蒸气 */
    DeferredHolder<FluidType, FluidType> IRON_VAPOR_TYPE = registerGas("iron_vapor", 0, 0, -1926, 3134, 16, 0.014, false, false, false, false, false, false, false);
    /** 钴蒸气 */
    DeferredHolder<FluidType, FluidType> COBALT_VAPOR_TYPE = registerGas("cobalt_vapor", 0, 0, -2032, 3200, 16, 0.014, false, false, false, false, false, false, false);
    /** 镍蒸气 */
    DeferredHolder<FluidType, FluidType> NICKEL_VAPOR_TYPE = registerGas("nickel_vapor", 0, 0, -2024, 3186, 16, 0.014, false, false, false, false, false, false, false);
    /** 铜蒸气 */
    DeferredHolder<FluidType, FluidType> COPPER_VAPOR_TYPE = registerGas("copper_vapor", 0, 0, -2191, 2835, 16, 0.014, false, false, false, false, false, false, false);
    /** 锌蒸气 */
    DeferredHolder<FluidType, FluidType> ZINC_VAPOR_TYPE = registerGas("zinc_vapor", 0, 0, -2254, 1180, 15, 0.014, false, false, false, false, false, false, false);
    /** 镓蒸气 */
    DeferredHolder<FluidType, FluidType> GALLIUM_VAPOR_TYPE = registerGas("gallium_vapor", 0, 0, -2404, 2477, 15, 0.014, false, false, false, false, false, false, false);
    /** 锗蒸气 */
    DeferredHolder<FluidType, FluidType> GERMANIUM_VAPOR_TYPE = registerGas("germanium_vapor", 0, 0, -2504, 3106, 15, 0.014, false, false, false, false, false, false, false);
    /** 砷蒸气 */
    DeferredHolder<FluidType, FluidType> ARSENIC_VAPOR_TYPE = registerGas("arsenic_vapor", 0, 0, -2583, 887, 15, 0.014, false, false, false, false, false, false, false);
    /** 硒蒸气 */
    DeferredHolder<FluidType, FluidType> SELENIUM_VAPOR_TYPE = registerGas("selenium_vapor", 0, 0, -2723, 958, 13, 0.014, false, false, false, false, false, false, false);
    /** 溴蒸气 */
    DeferredHolder<FluidType, FluidType> BROMINE_VAPOR_TYPE = registerGas("bromine_vapor", 0, 0, -5510, 332, 11, 0.01, false, false, false, true, true, true, true);
    /** 氪气 */
    DeferredHolder<FluidType, FluidType> KRYPTON_GAS_TYPE = registerGas("krypton_gas", 0, 0, -2890, 120, 25, 0.05, false, false, false, false, true, false, false);
    /** 铷蒸气 */
    DeferredHolder<FluidType, FluidType> RUBIDIUM_VAPOR_TYPE = registerGas("rubidium_vapor", 0, 0, -2947, 961, 15, 0.014, false, false, false, false, false, false, false);
    /** 锶蒸气 */
    DeferredHolder<FluidType, FluidType> STRONTIUM_VAPOR_TYPE = registerGas("strontium_vapor", 0, 0, -3021, 1650, 15, 0.014, false, false, false, false, false, false, false);
    /** 钇蒸气 */
    DeferredHolder<FluidType, FluidType> YTTRIUM_VAPOR_TYPE = registerGas("yttrium_vapor", 0, 0, -3066, 3609, 15, 0.014, false, false, false, false, false, false, false);
    /** 锆蒸气 */
    DeferredHolder<FluidType, FluidType> ZIRCONIUM_VAPOR_TYPE = registerGas("zirconium_vapor", 0, 0, -3146, 4682, 15, 0.014, false, false, false, false, false, false, false);
    /** 铌蒸气 */
    DeferredHolder<FluidType, FluidType> NIOBIUM_VAPOR_TYPE = registerGas("niobium_vapor", 0, 0, -3204, 5017, 15, 0.014, false, false, false, false, false, false, false);
    /** 钼蒸气 */
    DeferredHolder<FluidType, FluidType> MOLYBDENUM_VAPOR_TYPE = registerGas("molybdenum_vapor", 0, 0, -3309, 4912, 15, 0.014, false, false, false, false, false, false, false);
    /** 锝蒸气 */
    DeferredHolder<FluidType, FluidType> TECHNETIUM_VAPOR_TYPE = registerGas("technetium_vapor", 0, 0, -3379, 4538, 15, 0.014, false, false, false, false, false, false, false);
    /** 钌蒸气 */
    DeferredHolder<FluidType, FluidType> RUTHENIUM_VAPOR_TYPE = registerGas("ruthenium_vapor", 0, 0, -3485, 4423, 15, 0.014, false, false, false, false, false, false, false);
    /** 铑蒸气 */
    DeferredHolder<FluidType, FluidType> RHODIUM_VAPOR_TYPE = registerGas("rhodium_vapor", 0, 0, -3549, 3968, 15, 0.014, false, false, false, false, false, false, false);
    /** 钯蒸气 */
    DeferredHolder<FluidType, FluidType> PALLADIUM_VAPOR_TYPE = registerGas("palladium_vapor", 0, 0, -3670, 3236, 15, 0.014, false, false, false, false, false, false, false);
    /** 银蒸气 */
    DeferredHolder<FluidType, FluidType> SILVER_VAPOR_TYPE = registerGas("silver_vapor", 0, 0, -3720, 2435, 15, 0.014, false, false, false, false, false, false, false);
    /** 镉蒸气 */
    DeferredHolder<FluidType, FluidType> CADMIUM_VAPOR_TYPE = registerGas("cadmium_vapor", 0, 0, -3876, 1040, 15, 0.014, false, false, false, false, false, false, false);
    /** 铟蒸气 */
    DeferredHolder<FluidType, FluidType> INDIUM_VAPOR_TYPE = registerGas("indium_vapor", 0, 0, -3959, 2345, 15, 0.014, false, false, false, false, false, false, false);
    /** 锡蒸气 */
    DeferredHolder<FluidType, FluidType> TIN_VAPOR_TYPE = registerGas("tin_vapor", 0, 0, -4093, 2875, 15, 0.014, false, false, false, false, false, false, false);
    /** 锑蒸气 */
    DeferredHolder<FluidType, FluidType> ANTIMONY_VAPOR_TYPE = registerGas("antimony_vapor", 0, 0, -4199, 1860, 15, 0.014, false, false, false, false, false, false, false);
    /** 碲蒸气 */
    DeferredHolder<FluidType, FluidType> TELLURIUM_VAPOR_TYPE = registerGas("tellurium_vapor", 0, 0, -4400, 1261, 15, 0.014, false, false, false, false, false, false, false);
    /** 碘蒸气 */
    DeferredHolder<FluidType, FluidType> IODINE_VAPOR_TYPE = registerGas("iodine_vapor", 0, 0, -8752, 457, 9, 0.014, false, false, false, false, false, false, false);
    /** 氙气 */
    DeferredHolder<FluidType, FluidType> XENON_GAS_TYPE = registerGas("xenon_gas", 0, 0, -4527, 165, 23, 0.05, false, false, false, false, true, false, false);
    /** 铯蒸气 */
    DeferredHolder<FluidType, FluidType> CESIUM_VAPOR_TYPE = registerGas("cesium_vapor", 0, 0, -4583, 944, 15, 0.014, false, false, false, false, false, false, false);
    /** 钡蒸气 */
    DeferredHolder<FluidType, FluidType> BARIUM_VAPOR_TYPE = registerGas("barium_vapor", 0, 0, -4736, 2170, 15, 0.014, false, false, false, false, false, false, false);
    /** 镧蒸气 */
    DeferredHolder<FluidType, FluidType> LANTHANUM_VAPOR_TYPE = registerGas("lanthanum_vapor", 0, 0, -4790, 3737, 15, 0.014, false, false, false, false, false, false, false);
    /** 铈蒸气 */
    DeferredHolder<FluidType, FluidType> CERIUM_VAPOR_TYPE = registerGas("cerium_vapor", 0, 0, -4832, 3716, 15, 0.014, false, false, false, false, false, false, false);
    /** 镨蒸气 */
    DeferredHolder<FluidType, FluidType> PRASEODYMIUM_VAPOR_TYPE = registerGas("praseodymium_vapor", 0, 0, -4859, 3793, 15, 0.014, false, false, false, false, false, false, false);
    /** 钕蒸气 */
    DeferredHolder<FluidType, FluidType> NEODYMIUM_VAPOR_TYPE = registerGas("neodymium_vapor", 0, 0, -4974, 3347, 15, 0.014, false, false, false, false, false, false, false);
    /** 钷蒸气 */
    DeferredHolder<FluidType, FluidType> PROMETHIUM_VAPOR_TYPE = registerGas("promethium_vapor", 0, 0, -5000, 3273, 15, 0.014, false, false, false, false, false, false, false);
    /** 钐蒸气 */
    DeferredHolder<FluidType, FluidType> SAMARIUM_VAPOR_TYPE = registerGas("samarium_vapor", 0, 0, -5185, 2067, 15, 0.014, false, false, false, false, false, false, false);
    /** 铕蒸气 */
    DeferredHolder<FluidType, FluidType> EUROPIUM_VAPOR_TYPE = registerGas("europium_vapor", 0, 0, -5240, 1802, 15, 0.014, false, false, false, false, false, false, false);
    /** 钆蒸气 */
    DeferredHolder<FluidType, FluidType> GADOLINIUM_VAPOR_TYPE = registerGas("gadolinium_vapor", 0, 0, -5422, 3546, 15, 0.014, false, false, false, false, false, false, false);
    /** 铽蒸气 */
    DeferredHolder<FluidType, FluidType> TERBIUM_VAPOR_TYPE = registerGas("terbium_vapor", 0, 0, -5480, 3503, 15, 0.014, false, false, false, false, false, false, false);
    /** 镝蒸气 */
    DeferredHolder<FluidType, FluidType> DYSPROSIUM_VAPOR_TYPE = registerGas("dysprosium_vapor", 0, 0, -5603, 2840, 15, 0.014, false, false, false, false, false, false, false);
    /** 钬蒸气 */
    DeferredHolder<FluidType, FluidType> HOLMIUM_VAPOR_TYPE = registerGas("holmium_vapor", 0, 0, -5687, 2993, 15, 0.014, false, false, false, false, false, false, false);
    /** 铒蒸气 */
    DeferredHolder<FluidType, FluidType> ERBIUM_VAPOR_TYPE = registerGas("erbium_vapor", 0, 0, -5768, 3141, 15, 0.014, false, false, false, false, false, false, false);
    /** 铥蒸气 */
    DeferredHolder<FluidType, FluidType> THULIUM_VAPOR_TYPE = registerGas("thulium_vapor", 0, 0, -5825, 2223, 15, 0.014, false, false, false, false, false, false, false);
    /** 镱蒸气 */
    DeferredHolder<FluidType, FluidType> YTTERBIUM_VAPOR_TYPE = registerGas("ytterbium_vapor", 0, 0, -5967, 1469, 15, 0.014, false, false, false, false, false, false, false);
    /** 镥蒸气 */
    DeferredHolder<FluidType, FluidType> LUTETIUM_VAPOR_TYPE = registerGas("lutetium_vapor", 0, 0, -6033, 3675, 15, 0.014, false, false, false, false, false, false, false);
    /** 铪蒸气 */
    DeferredHolder<FluidType, FluidType> HAFNIUM_VAPOR_TYPE = registerGas("hafnium_vapor", 0, 0, -6155, 4876, 15, 0.014, false, false, false, false, false, false, false);
    /** 钽蒸气 */
    DeferredHolder<FluidType, FluidType> TANTALUM_VAPOR_TYPE = registerGas("tantalum_vapor", 0, 0, -6239, 5731, 15, 0.014, false, false, false, false, false, false, false);
    /** 钨蒸气 */
    DeferredHolder<FluidType, FluidType> TUNGSTEN_VAPOR_TYPE = registerGas("tungsten_vapor", 0, 0, -6339, 5828, 15, 0.014, false, false, false, false, false, false, false);
    /** 铼蒸气 */
    DeferredHolder<FluidType, FluidType> RHENIUM_VAPOR_TYPE = registerGas("rhenium_vapor", 0, 0, -6421, 5869, 15, 0.014, false, false, false, false, false, false, false);
    /** 锇蒸气 */
    DeferredHolder<FluidType, FluidType> OSMIUM_VAPOR_TYPE = registerGas("osmium_vapor", 0, 0, -6559, 5285, 15, 0.014, false, false, false, false, false, false, false);
    /** 铱蒸气 */
    DeferredHolder<FluidType, FluidType> IRIDIUM_VAPOR_TYPE = registerGas("iridium_vapor", 0, 0, -6628, 4701, 15, 0.014, false, false, false, false, false, false, false);
    /** 铂蒸气 */
    DeferredHolder<FluidType, FluidType> PLATINUM_VAPOR_TYPE = registerGas("platinum_vapor", 0, 0, -6727, 4098, 15, 0.014, false, false, false, false, false, false, false);
    /** 金蒸气 */
    DeferredHolder<FluidType, FluidType> GOLD_VAPOR_TYPE = registerGas("gold_vapor", 0, 0, -6792, 3129, 15, 0.014, false, false, false, false, false, false, false);
    /** 汞蒸气 */
    DeferredHolder<FluidType, FluidType> MERCURY_VAPOR_TYPE = registerGas("mercury_vapor", 0, 0, -6917, 630, 10, 0.01, false, false, true, true, true, true, true);
    /** 铊蒸气 */
    DeferredHolder<FluidType, FluidType> THALLIUM_VAPOR_TYPE = registerGas("thallium_vapor", 0, 0, -7048, 1746, 15, 0.014, false, false, false, false, false, false, false);
    /** 铅蒸气 */
    DeferredHolder<FluidType, FluidType> LEAD_VAPOR_TYPE = registerGas("lead_vapor", 0, 0, -7145, 2022, 15, 0.014, false, false, false, false, false, false, false);
    /** 铋蒸气 */
    DeferredHolder<FluidType, FluidType> BISMUTH_VAPOR_TYPE = registerGas("bismuth_vapor", 0, 0, -7206, 1837, 15, 0.014, false, false, false, false, false, false, false);
    /** 钋蒸气 */
    DeferredHolder<FluidType, FluidType> POLONIUM_VAPOR_TYPE = registerGas("polonium_vapor", 0, 0, -7207, 1235, 15, 0.014, false, false, false, false, false, false, false);
    /** 砹蒸气 */
    DeferredHolder<FluidType, FluidType> ASTATINE_VAPOR_TYPE = registerGas("astatine_vapor", 0, 0, -7241, 610, 13, 0.014, false, false, false, false, false, false, false);
    /** 氡气 */
    DeferredHolder<FluidType, FluidType> RADON_GAS_TYPE = registerGas("radon_gas", 0, 0, -7655, 211, 28, 0.05, false, false, false, false, true, false, false);
    /** 钫蒸气 */
    DeferredHolder<FluidType, FluidType> FRANCIUM_VAPOR_TYPE = registerGas("francium_vapor", 0, 0, -7690, 950, 15, 0.014, false, false, false, false, false, false, false);
    /** 镭蒸气 */
    DeferredHolder<FluidType, FluidType> RADIUM_VAPOR_TYPE = registerGas("radium_vapor", 0, 0, -7793, 2010, 15, 0.014, false, false, false, false, false, false, false);
    /** 锕蒸气 */
    DeferredHolder<FluidType, FluidType> ACTINIUM_VAPOR_TYPE = registerGas("actinium_vapor", 0, 0, -7828, 3471, 15, 0.014, false, false, false, false, false, false, false);
    /** 钍蒸气 */
    DeferredHolder<FluidType, FluidType> THORIUM_VAPOR_TYPE = registerGas("thorium_vapor", 0, 0, -8001, 5061, 15, 0.014, false, false, false, false, false, false, false);
    /** 镤蒸气 */
    DeferredHolder<FluidType, FluidType> PROTACTINIUM_VAPOR_TYPE = registerGas("protactinium_vapor", 0, 0, -7967, 4300, 15, 0.014, false, false, false, false, false, false, false);
    /** 铀蒸气 */
    DeferredHolder<FluidType, FluidType> URANIUM_VAPOR_TYPE = registerGas("uranium_vapor", 0, 0, -8208, 4404, 15, 0.014, false, false, false, false, false, false, false);
    /** 镎蒸气 */
    DeferredHolder<FluidType, FluidType> NEPTUNIUM_VAPOR_TYPE = registerGas("neptunium_vapor", 0, 0, -8172, 4273, 15, 0.014, false, false, false, false, false, false, false);
    /** 钚蒸气 */
    DeferredHolder<FluidType, FluidType> PLUTONIUM_VAPOR_TYPE = registerGas("plutonium_vapor", 0, 0, -8414, 3505, 15, 0.014, false, false, false, false, false, false, false);
    /** 镅蒸气 */
    DeferredHolder<FluidType, FluidType> AMERICIUM_VAPOR_TYPE = registerGas("americium_vapor", 0, 0, -8379, 2880, 15, 0.014, false, false, false, false, false, false, false);
    /** 锔蒸气 */
    DeferredHolder<FluidType, FluidType> CURIUM_VAPOR_TYPE = registerGas("curium_vapor", 0, 0, -8517, 3383, 15, 0.014, false, false, false, false, false, false, false);
    /** 锫蒸气 */
    DeferredHolder<FluidType, FluidType> BERKELIUM_VAPOR_TYPE = registerGas("berkelium_vapor", 0, 0, -8517, 983, 15, 0.014, false, false, false, false, false, false, false);
    /** 锎蒸气 */
    DeferredHolder<FluidType, FluidType> CALIFORNIUM_VAPOR_TYPE = registerGas("californium_vapor", 0, 0, -8655, 1743, 15, 0.014, false, false, false, false, false, false, false);
    /** 锿蒸气 */
    DeferredHolder<FluidType, FluidType> EINSTEINIUM_VAPOR_TYPE = registerGas("einsteinium_vapor", 0, 0, -8690, 1269, 15, 0.014, false, false, false, false, false, false, false);
    /** 镄蒸气 */
    DeferredHolder<FluidType, FluidType> FERMIUM_VAPOR_TYPE = registerGas("fermium_vapor", 0, 0, -8862, 2510, 15, 0.014, false, false, false, false, false, false, false);
    /** 钔蒸气 */
    DeferredHolder<FluidType, FluidType> MENDELEVIUM_VAPOR_TYPE = registerGas("mendelevium_vapor", 0, 0, -8897, 2100, 15, 0.014, false, false, false, false, false, false, false);
    /** 锘蒸气 */
    DeferredHolder<FluidType, FluidType> NOBELIUM_VAPOR_TYPE = registerGas("nobelium_vapor", 0, 0, -8931, 1200, 15, 0.014, false, false, false, false, false, false, false);
    /** 铹蒸气 */
    DeferredHolder<FluidType, FluidType> LAWRENCIUM_VAPOR_TYPE = registerGas("lawrencium_vapor", 0, 0, -9172, 2223, 15, 0.014, false, false, false, false, false, false, false);
    /** 𬬻蒸气 */
    DeferredHolder<FluidType, FluidType> RUTHERFORDIUM_VAPOR_TYPE = registerGas("rutherfordium_vapor", 0, 0, -9207, 5800, 15, 0.014, false, false, false, false, false, false, false);
    /** 𬭊蒸气 */
    DeferredHolder<FluidType, FluidType> DUBNIUM_VAPOR_TYPE = registerGas("dubnium_vapor", 0, 0, -9241, 6000, 15, 0.014, false, false, false, false, false, false, false);
    /** 𬭳蒸气 */
    DeferredHolder<FluidType, FluidType> SEABORGIUM_VAPOR_TYPE = registerGas("seaborgium_vapor", 0, 0, -9276, 6400, 15, 0.014, false, false, false, false, false, false, false);
    /** 𬭛蒸气 */
    DeferredHolder<FluidType, FluidType> BOHRIUM_VAPOR_TYPE = registerGas("bohrium_vapor", 0, 0, -9310, 6500, 15, 0.014, false, false, false, false, false, false, false);
    /** 𬭶蒸气 */
    DeferredHolder<FluidType, FluidType> HASSIUM_VAPOR_TYPE = registerGas("hassium_vapor", 0, 0, -9276, 6300, 15, 0.014, false, false, false, false, false, false, false);
    /** 鿏蒸气 */
    DeferredHolder<FluidType, FluidType> MEITNERIUM_VAPOR_TYPE = registerGas("meitnerium_vapor", 0, 0, -9586, 5800, 15, 0.014, false, false, false, false, false, false, false);
    /** 𫟼蒸气 */
    DeferredHolder<FluidType, FluidType> DARMSTADTIUM_VAPOR_TYPE = registerGas("darmstadtium_vapor", 0, 0, -9690, 5500, 15, 0.014, false, false, false, false, false, false, false);
    /** 𬬭蒸气 */
    DeferredHolder<FluidType, FluidType> ROENTGENIUM_VAPOR_TYPE = registerGas("roentgenium_vapor", 0, 0, -9724, 5300, 15, 0.014, false, false, false, false, false, false, false);
    /** 鿔蒸气 */
    DeferredHolder<FluidType, FluidType> COPERNICIUM_VAPOR_TYPE = registerGas("copernicium_vapor", 0, 0, -9828, 3570, 15, 0.01, false, false, true, false, true, true, true);
    /** 鿭蒸气 */
    DeferredHolder<FluidType, FluidType> NIHONIUM_VAPOR_TYPE = registerGas("nihonium_vapor", 0, 0, -9862, 1430, 15, 0.014, false, false, false, false, false, false, false);
    /** 𫓧蒸气 */
    DeferredHolder<FluidType, FluidType> FLEROVIUM_VAPOR_TYPE = registerGas("flerovium_vapor", 0, 0, -9966, 900, 15, 0.014, false, false, false, false, false, false, false);
    /** 镆蒸气 */
    DeferredHolder<FluidType, FluidType> MOSCOVIUM_VAPOR_TYPE = registerGas("moscovium_vapor", 0, 0, -10000, 1500, 15, 0.014, false, false, false, false, false, false, false);
    /** 𫟷蒸气 */
    DeferredHolder<FluidType, FluidType> LIVERMORIUM_VAPOR_TYPE = registerGas("livermorium_vapor", 0, 0, -10103, 1300, 15, 0.014, false, false, false, false, false, false, false);
    /** 鿬蒸气 */
    DeferredHolder<FluidType, FluidType> TENNESSINE_VAPOR_TYPE = registerGas("tennessine_vapor", 0, 0, -10138, 850, 13, 0.014, false, false, false, false, false, false, false);
    /** 鿫 */
    DeferredHolder<FluidType, FluidType> OGANESSON_GAS_TYPE = registerGas("oganesson_gas", 0, 0, -10138, 450, 13, 0.05, false, false, false, false, true, false, false);
    /** 鑨蒸气 */
    DeferredHolder<FluidType, FluidType> LONGIUM_VAPOR_TYPE = registerGas("longium_vapor", 0, 0, -10345, 3200, 15, 0.014, false, false, false, false, false, false, false);
    /** 镾蒸气 */
    DeferredHolder<FluidType, FluidType> MYSTERIUM_VAPOR_TYPE = registerGas("mysterium_vapor", 0, 0, -10517, 3500, 15, 0.014, false, false, false, false, false, false, false);

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
    private static DeferredHolder<FluidType, FluidType> registerGas(
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
        return GAS_TYPES.register(name, () -> new FluidType(FluidType.Properties.create()
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
