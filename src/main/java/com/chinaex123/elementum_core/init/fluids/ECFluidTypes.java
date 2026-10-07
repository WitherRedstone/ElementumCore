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
    DeferredHolder<FluidType, FluidType> HYDROGEN_TYPE = registerElement("hydrogen", 0, 0, 1, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 氦气 */
    DeferredHolder<FluidType, FluidType> HELIUM_TYPE = registerElement("helium", 0, 0, 1, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 锂 */
    DeferredHolder<FluidType, FluidType> LITHIUM_TYPE = registerElement("lithium", 0, 0, 1, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铍 */
    DeferredHolder<FluidType, FluidType> BERYLLIUM_TYPE = registerElement("beryllium", 0, 0, 1, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 硼 */
    DeferredHolder<FluidType, FluidType> BORON_TYPE = registerElement("boron", 0, 0, 2, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 碳 */
    DeferredHolder<FluidType, FluidType> CARBON_TYPE = registerElement("carbon", 0, 0, 2, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 氮气 */
    DeferredHolder<FluidType, FluidType> NITROGEN_TYPE = registerElement("nitrogen", 0, 0, 1, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 氧气 */
    DeferredHolder<FluidType, FluidType> OXYGEN_TYPE = registerElement("oxygen", 0, 0, 1, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 氟气 */
    DeferredHolder<FluidType, FluidType> FLUORINE_TYPE = registerElement("fluorine", 0, 0, 1, 300, 10, 0.05, false, false, false, true, true, false, false);
    /** 氖气 */
    DeferredHolder<FluidType, FluidType> NEON_TYPE = registerElement("neon", 0, 0, 1, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 钠 */
    DeferredHolder<FluidType, FluidType> SODIUM_TYPE = registerElement("sodium", 0, 0, 1, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镁 */
    DeferredHolder<FluidType, FluidType> MAGNESIUM_TYPE = registerElement("magnesium", 0, 0, 1, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铝 */
    DeferredHolder<FluidType, FluidType> ALUMINUM_TYPE = registerElement("aluminum", 0, 0, 2, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 硅 */
    DeferredHolder<FluidType, FluidType> SILICON_TYPE = registerElement("silicon", 0, 0, 2, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 磷 */
    DeferredHolder<FluidType, FluidType> PHOSPHORUS_TYPE = registerElement("phosphorus", 0, 0, 2, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 硫 */
    DeferredHolder<FluidType, FluidType> SULFUR_TYPE = registerElement("sulfur", 0, 0, 2, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 氯气 */
    DeferredHolder<FluidType, FluidType> CHLORINE_TYPE = registerElement("chlorine", 0, 0, 2, 300, 10, 0.05, false, false, false, true, true, true, false);
    /** 氩气 */
    DeferredHolder<FluidType, FluidType> ARGON_TYPE = registerElement("argon", 0, 0, 1, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 钾 */
    DeferredHolder<FluidType, FluidType> POTASSIUM_TYPE = registerElement("potassium", 0, 0, 0, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钙 */
    DeferredHolder<FluidType, FluidType> CALCIUM_TYPE = registerElement("calcium", 0, 0, 1, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钪 */
    DeferredHolder<FluidType, FluidType> SCANDIUM_TYPE = registerElement("scandium", 0, 0, 2, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钛 */
    DeferredHolder<FluidType, FluidType> TITANIUM_TYPE = registerElement("titanium", 0, 0, 4, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钒 */
    DeferredHolder<FluidType, FluidType> VANADIUM_TYPE = registerElement("vanadium", 0, 0, 6, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铬 */
    DeferredHolder<FluidType, FluidType> CHROMIUM_TYPE = registerElement("chromium", 0, 0, 7, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锰 */
    DeferredHolder<FluidType, FluidType> MANGANESE_TYPE = registerElement("manganese", 0, 0, 7, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铁 */
    DeferredHolder<FluidType, FluidType> IRON_TYPE = registerElement("iron", 0, 0, 7, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钴 */
    DeferredHolder<FluidType, FluidType> COBALT_TYPE = registerElement("cobalt", 0, 0, 8, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镍 */
    DeferredHolder<FluidType, FluidType> NICKEL_TYPE = registerElement("nickel", 0, 0, 8, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铜 */
    DeferredHolder<FluidType, FluidType> COPPER_TYPE = registerElement("copper", 0, 0, 8, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锌 */
    DeferredHolder<FluidType, FluidType> ZINC_TYPE = registerElement("zinc", 0, 0, 7, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镓 */
    DeferredHolder<FluidType, FluidType> GALLIUM_TYPE = registerElement("gallium", 0, 0, 5, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锗 */
    DeferredHolder<FluidType, FluidType> GERMANIUM_TYPE = registerElement("germanium", 0, 0, 5, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 砷 */
    DeferredHolder<FluidType, FluidType> ARSENIC_TYPE = registerElement("arsenic", 0, 0, 5, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 硒 */
    DeferredHolder<FluidType, FluidType> SELENIUM_TYPE = registerElement("selenium", 0, 0, 4, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 溴 */
    DeferredHolder<FluidType, FluidType> BROMINE_TYPE = registerElement("bromine", 0, 0, 3, 300, 1000, 0.01, false, false, false, true, true, true, true);
    /** 氪气 */
    DeferredHolder<FluidType, FluidType> KRYPTON_TYPE = registerElement("krypton", 0, 0, 2, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 铷 */
    DeferredHolder<FluidType, FluidType> RUBIDIUM_TYPE = registerElement("rubidium", 0, 0, 1, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锶 */
    DeferredHolder<FluidType, FluidType> STRONTIUM_TYPE = registerElement("strontium", 0, 0, 2, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钇 */
    DeferredHolder<FluidType, FluidType> YTTRIUM_TYPE = registerElement("yttrium", 0, 0, 4, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锆 */
    DeferredHolder<FluidType, FluidType> ZIRCONIUM_TYPE = registerElement("zirconium", 0, 0, 6, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铌 */
    DeferredHolder<FluidType, FluidType> NIOBIUM_TYPE = registerElement("niobium", 0, 0, 8, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钼 */
    DeferredHolder<FluidType, FluidType> MOLYBDENUM_TYPE = registerElement("molybdenum", 0, 0, 10, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锝 */
    DeferredHolder<FluidType, FluidType> TECHNETIUM_TYPE = registerElement("technetium", 0, 0, 11, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钌 */
    DeferredHolder<FluidType, FluidType> RUTHENIUM_TYPE = registerElement("ruthenium", 0, 0, 12, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铑 */
    DeferredHolder<FluidType, FluidType> RHODIUM_TYPE = registerElement("rhodium", 0, 0, 12, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钯 */
    DeferredHolder<FluidType, FluidType> PALLADIUM_TYPE = registerElement("palladium", 0, 0, 12, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 银 */
    DeferredHolder<FluidType, FluidType> SILVER_TYPE = registerElement("silver", 0, 0, 10, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镉 */
    DeferredHolder<FluidType, FluidType> CADMIUM_TYPE = registerElement("cadmium", 0, 0, 8, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铟 */
    DeferredHolder<FluidType, FluidType> INDIUM_TYPE = registerElement("indium", 0, 0, 7, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锡 */
    DeferredHolder<FluidType, FluidType> TIN_TYPE = registerElement("tin", 0, 0, 7, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锑 */
    DeferredHolder<FluidType, FluidType> ANTIMONY_TYPE = registerElement("antimony", 0, 0, 6, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 碲 */
    DeferredHolder<FluidType, FluidType> TELLURIUM_TYPE = registerElement("tellurium", 0, 0, 6, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 碘 */
    DeferredHolder<FluidType, FluidType> IODINE_TYPE = registerElement("iodine", 0, 0, 4, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 氙气 */
    DeferredHolder<FluidType, FluidType> XENON_TYPE = registerElement("xenon", 0, 0, 3, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 铯 */
    DeferredHolder<FluidType, FluidType> CESIUM_TYPE = registerElement("cesium", 0, 0, 1, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钡 */
    DeferredHolder<FluidType, FluidType> BARIUM_TYPE = registerElement("barium", 0, 0, 3, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镧 */
    DeferredHolder<FluidType, FluidType> LANTHANUM_TYPE = registerElement("lanthanum", 0, 0, 6, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铈 */
    DeferredHolder<FluidType, FluidType> CERIUM_TYPE = registerElement("cerium", 0, 0, 6, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镨 */
    DeferredHolder<FluidType, FluidType> PRASEODYMIUM_TYPE = registerElement("praseodymium", 0, 0, 6, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钕 */
    DeferredHolder<FluidType, FluidType> NEODYMIUM_TYPE = registerElement("neodymium", 0, 0, 7, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钷 */
    DeferredHolder<FluidType, FluidType> PROMETHIUM_TYPE = registerElement("promethium", 0, 0, 7, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钐 */
    DeferredHolder<FluidType, FluidType> SAMARIUM_TYPE = registerElement("samarium", 0, 0, 7, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铕 */
    DeferredHolder<FluidType, FluidType> EUROPIUM_TYPE = registerElement("europium", 0, 0, 5, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钆 */
    DeferredHolder<FluidType, FluidType> GADOLINIUM_TYPE = registerElement("gadolinium", 0, 0, 7, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铽 */
    DeferredHolder<FluidType, FluidType> TERBIUM_TYPE = registerElement("terbium", 0, 0, 8, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镝 */
    DeferredHolder<FluidType, FluidType> DYSPROSIUM_TYPE = registerElement("dysprosium", 0, 0, 8, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钬 */
    DeferredHolder<FluidType, FluidType> HOLMIUM_TYPE = registerElement("holmium", 0, 0, 8, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铒 */
    DeferredHolder<FluidType, FluidType> ERBIUM_TYPE = registerElement("erbium", 0, 0, 9, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铥 */
    DeferredHolder<FluidType, FluidType> THULIUM_TYPE = registerElement("thulium", 0, 0, 9, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镱 */
    DeferredHolder<FluidType, FluidType> YTTERBIUM_TYPE = registerElement("ytterbium", 0, 0, 6, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镥 */
    DeferredHolder<FluidType, FluidType> LUTETIUM_TYPE = registerElement("lutetium", 0, 0, 9, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铪 */
    DeferredHolder<FluidType, FluidType> HAFNIUM_TYPE = registerElement("hafnium", 0, 0, 13, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钽 */
    DeferredHolder<FluidType, FluidType> TANTALUM_TYPE = registerElement("tantalum", 0, 0, 16, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钨 */
    DeferredHolder<FluidType, FluidType> TUNGSTEN_TYPE = registerElement("tungsten", 0, 0, 19, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铼 */
    DeferredHolder<FluidType, FluidType> RHENIUM_TYPE = registerElement("rhenium", 0, 0, 21, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锇 */
    DeferredHolder<FluidType, FluidType> OSMIUM_TYPE = registerElement("osmium", 0, 0, 22, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铱 */
    DeferredHolder<FluidType, FluidType> IRIDIUM_TYPE = registerElement("iridium", 0, 0, 22, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铂 */
    DeferredHolder<FluidType, FluidType> PLATINUM_TYPE = registerElement("platinum", 0, 0, 21, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 金 */
    DeferredHolder<FluidType, FluidType> GOLD_TYPE = registerElement("gold", 0, 0, 19, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 汞（水银） */
    DeferredHolder<FluidType, FluidType> HYDRARGYRUM_TYPE = registerElement("hydrargyrum", 0, 0, 13, 300, 1000, 0.01, false, false, true, true, true, true, true);
    /** 铊 */
    DeferredHolder<FluidType, FluidType> THALLIUM_TYPE = registerElement("thallium", 0, 0, 11, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铅 */
    DeferredHolder<FluidType, FluidType> LEAD_TYPE = registerElement("lead", 0, 0, 11, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铋 */
    DeferredHolder<FluidType, FluidType> BISMUTH_TYPE = registerElement("bismuth", 0, 0, 9, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钋 */
    DeferredHolder<FluidType, FluidType> POLONIUM_TYPE = registerElement("polonium", 0, 0, 9, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 砹 */
    DeferredHolder<FluidType, FluidType> ASTATINE_TYPE = registerElement("astatine", 0, 0, 6, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 氡气 */
    DeferredHolder<FluidType, FluidType> RADON_TYPE = registerElement("radon", 0, 0, 5, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 钫 */
    DeferredHolder<FluidType, FluidType> FRANCIUM_TYPE = registerElement("francium", 0, 0, 1, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镭 */
    DeferredHolder<FluidType, FluidType> RADIUM_TYPE = registerElement("radium", 0, 0, 5, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锕 */
    DeferredHolder<FluidType, FluidType> ACTINIUM_TYPE = registerElement("actinium", 0, 0, 10, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钍 */
    DeferredHolder<FluidType, FluidType> THORIUM_TYPE = registerElement("thorium", 0, 0, 11, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镤 */
    DeferredHolder<FluidType, FluidType> PROTACTINIUM_TYPE = registerElement("protactinium", 0, 0, 15, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铀 */
    DeferredHolder<FluidType, FluidType> URANIUM_TYPE = registerElement("uranium", 0, 0, 19, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镎 */
    DeferredHolder<FluidType, FluidType> NEPTUNIUM_TYPE = registerElement("neptunium", 0, 0, 20, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钚 */
    DeferredHolder<FluidType, FluidType> PLUTONIUM_TYPE = registerElement("plutonium", 0, 0, 19, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镅 */
    DeferredHolder<FluidType, FluidType> AMERICIUM_TYPE = registerElement("americium", 0, 0, 13, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锔 */
    DeferredHolder<FluidType, FluidType> CURIUM_TYPE = registerElement("curium", 0, 0, 13, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锫 */
    DeferredHolder<FluidType, FluidType> BERKELIUM_TYPE = registerElement("berkelium", 0, 0, 14, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锎 */
    DeferredHolder<FluidType, FluidType> CALIFORNIUM_TYPE = registerElement("californium", 0, 0, 15, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锿 */
    DeferredHolder<FluidType, FluidType> EINSTEINIUM_TYPE = registerElement("einsteinium", 0, 0, 8, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镄 */
    DeferredHolder<FluidType, FluidType> FERMIUM_TYPE = registerElement("fermium", 0, 0, 9, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钔 */
    DeferredHolder<FluidType, FluidType> MENDELEVIUM_TYPE = registerElement("mendelevium", 0, 0, 10, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锘 */
    DeferredHolder<FluidType, FluidType> NOBELIUM_TYPE = registerElement("nobelium", 0, 0, 10, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铹 */
    DeferredHolder<FluidType, FluidType> LAWRENCIUM_TYPE = registerElement("lawrencium", 0, 0, 15, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𬬻 */
    DeferredHolder<FluidType, FluidType> RUTHERFORDIUM_TYPE = registerElement("rutherfordium", 0, 0, 17, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𬭊 */
    DeferredHolder<FluidType, FluidType> DUBNIUM_TYPE = registerElement("dubnium", 0, 0, 21, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𬭳 */
    DeferredHolder<FluidType, FluidType> SEABORGIUM_TYPE = registerElement("seaborgium", 0, 0, 23, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𬭛 */
    DeferredHolder<FluidType, FluidType> BOHRIUM_TYPE = registerElement("bohrium", 0, 0, 26, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𬭶 */
    DeferredHolder<FluidType, FluidType> HASSIUM_TYPE = registerElement("hassium", 0, 0, 27, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 鿏 */
    DeferredHolder<FluidType, FluidType> MEITNERIUM_TYPE = registerElement("meitnerium", 0, 0, 27, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𫟼 */
    DeferredHolder<FluidType, FluidType> DARMSTADTIUM_TYPE = registerElement("darmstadtium", 0, 0, 26, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𬬭 */
    DeferredHolder<FluidType, FluidType> ROENTGENIUM_TYPE = registerElement("roentgenium", 0, 0, 26, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 鎶 */
    DeferredHolder<FluidType, FluidType> COPERNICIUM_TYPE = registerElement("copernicium", 0, 0, 14, 300, 1000, 0.01, false, false, true, false, true, true, true);
    /** 鉨 */
    DeferredHolder<FluidType, FluidType> NIHONIUM_TYPE = registerElement("nihonium", 0, 0, 16, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𫓧 */
    DeferredHolder<FluidType, FluidType> FLEROVIUM_TYPE = registerElement("flerovium", 0, 0, 14, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镆 */
    DeferredHolder<FluidType, FluidType> MOSCOVIUM_TYPE = registerElement("moscovium", 0, 0, 13, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 鉝 */
    DeferredHolder<FluidType, FluidType> LIVERMORIUM_TYPE = registerElement("livermorium", 0, 0, 12, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 鿬 */
    DeferredHolder<FluidType, FluidType> TENNESSINE_TYPE = registerElement("tennessine", 0, 0, 7, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 鿫 */
    DeferredHolder<FluidType, FluidType> OGANESSON_TYPE = registerElement("oganesson", 0, 0, 5, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 鑨 */
    DeferredHolder<FluidType, FluidType> LONGIUM_TYPE = registerElement("longium", 0, 0, 10, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镾 */
    DeferredHolder<FluidType, FluidType> MYSTERIUM_TYPE = registerElement("mysterium", 0, 0, 10, 300, 100, 0.014, false, false, false, false, false, false, false);

    /**
     * @param name            流体名称
     * @param fallDistance    摔落距离修正系数。影响实体落入流体时受到的摔落伤害减免
     * @param lightLevel      发光等级
     * @param density         密度，影响浮沉
     * @param temperature     温度，影响表现与伤害
     * @param viscosity       粘稠度。数值越大流动越慢
     * @param motionScale     实体在流体中的运动速度缩放。数值越小越慢
     * @param canHydrate      是否能湿润耕地
     * @param convertToSource 是否能形成无限源
     * @param canExtinguish   是否能扑灭实体身上的火
     * @param supportsBoating 是否能漂浮在流体中
     * @param canPushEntity   流体是否能推动实体
     * @param canDrown        实体是否会在其中溺水
     * @param canSwim         实体是否能在其中游泳
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