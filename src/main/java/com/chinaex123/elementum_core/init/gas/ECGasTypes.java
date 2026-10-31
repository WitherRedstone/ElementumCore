package com.chinaex123.elementum_core.init.gas;

import com.chinaex123.elementum_core.ElementumCore;
import net.minecraft.sounds.SoundEvents;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.*;

public interface ECGasTypes {
    DeferredRegister<FluidType> GAS_TYPES = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, ElementumCore.MODID);

    /** 氢气 */
    DeferredHolder<FluidType, FluidType> HYDROGEN_GAS_TYPE = registerGas("hydrogen_gas", 0, 0, -1000, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 氦气 */
    DeferredHolder<FluidType, FluidType> HELIUM_GAS_TYPE = registerGas("helium_gas", 0, 0, -1000, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 锂 */
    DeferredHolder<FluidType, FluidType> LITHIUM_GAS_TYPE = registerGas("lithium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铍 */
    DeferredHolder<FluidType, FluidType> BERYLLIUM_GAS_TYPE = registerGas("beryllium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 硼 */
    DeferredHolder<FluidType, FluidType> BORON_GAS_TYPE = registerGas("boron_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 碳 */
    DeferredHolder<FluidType, FluidType> CARBON_GAS_TYPE = registerGas("carbon_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 氮气 */
    DeferredHolder<FluidType, FluidType> NITROGEN_GAS_TYPE = registerGas("nitrogen_gas", 0, 0, -1000, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 氧气 */
    DeferredHolder<FluidType, FluidType> OXYGEN_GAS_TYPE = registerGas("oxygen_gas", 0, 0, -1000, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 氟气 */
    DeferredHolder<FluidType, FluidType> FLUORINE_GAS_TYPE = registerGas("fluorine_gas", 0, 0, -1000, 300, 10, 0.05, false, false, false, true, true, false, false);
    /** 氖气 */
    DeferredHolder<FluidType, FluidType> NEON_GAS_TYPE = registerGas("neon_gas", 0, 0, -1000, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 钠 */
    DeferredHolder<FluidType, FluidType> SODIUM_GAS_TYPE = registerGas("sodium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镁 */
    DeferredHolder<FluidType, FluidType> MAGNESIUM_GAS_TYPE = registerGas("magnesium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铝 */
    DeferredHolder<FluidType, FluidType> ALUMINUM_GAS_TYPE = registerGas("aluminum_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 硅 */
    DeferredHolder<FluidType, FluidType> SILICON_GAS_TYPE = registerGas("silicon_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 磷 */
    DeferredHolder<FluidType, FluidType> PHOSPHORUS_GAS_TYPE = registerGas("phosphorus_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 硫 */
    DeferredHolder<FluidType, FluidType> SULFUR_GAS_TYPE = registerGas("sulfur_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 氯气 */
    DeferredHolder<FluidType, FluidType> CHLORINE_GAS_TYPE = registerGas("chlorine_gas", 0, 0, -1000, 300, 10, 0.05, false, false, false, true, true, true, false);
    /** 氩气 */
    DeferredHolder<FluidType, FluidType> ARGON_GAS_TYPE = registerGas("argon_gas", 0, 0, -1000, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 钾 */
    DeferredHolder<FluidType, FluidType> POTASSIUM_GAS_TYPE = registerGas("potassium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钙 */
    DeferredHolder<FluidType, FluidType> CALCIUM_GAS_TYPE = registerGas("calcium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钪 */
    DeferredHolder<FluidType, FluidType> SCANDIUM_GAS_TYPE = registerGas("scandium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钛 */
    DeferredHolder<FluidType, FluidType> TITANIUM_GAS_TYPE = registerGas("titanium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钒 */
    DeferredHolder<FluidType, FluidType> VANADIUM_GAS_TYPE = registerGas("vanadium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铬 */
    DeferredHolder<FluidType, FluidType> CHROMIUM_GAS_TYPE = registerGas("chromium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锰 */
    DeferredHolder<FluidType, FluidType> MANGANESE_GAS_TYPE = registerGas("manganese_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铁 */
    DeferredHolder<FluidType, FluidType> IRON_GAS_TYPE = registerGas("iron_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钴 */
    DeferredHolder<FluidType, FluidType> COBALT_GAS_TYPE = registerGas("cobalt_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镍 */
    DeferredHolder<FluidType, FluidType> NICKEL_GAS_TYPE = registerGas("nickel_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铜 */
    DeferredHolder<FluidType, FluidType> COPPER_GAS_TYPE = registerGas("copper_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锌 */
    DeferredHolder<FluidType, FluidType> ZINC_GAS_TYPE = registerGas("zinc_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镓 */
    DeferredHolder<FluidType, FluidType> GALLIUM_GAS_TYPE = registerGas("gallium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锗 */
    DeferredHolder<FluidType, FluidType> GERMANIUM_GAS_TYPE = registerGas("germanium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 砷 */
    DeferredHolder<FluidType, FluidType> ARSENIC_GAS_TYPE = registerGas("arsenic_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 硒 */
    DeferredHolder<FluidType, FluidType> SELENIUM_GAS_TYPE = registerGas("selenium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 溴 */
    DeferredHolder<FluidType, FluidType> BROMINE_GAS_TYPE = registerGas("bromine_gas", 0, 0, -1000, 300, 1000, 0.01, false, false, false, true, true, true, true);
    /** 氪气 */
    DeferredHolder<FluidType, FluidType> KRYPTON_GAS_TYPE = registerGas("krypton_gas", 0, 0, -1000, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 铷 */
    DeferredHolder<FluidType, FluidType> RUBIDIUM_GAS_TYPE = registerGas("rubidium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锶 */
    DeferredHolder<FluidType, FluidType> STRONTIUM_GAS_TYPE = registerGas("strontium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钇 */
    DeferredHolder<FluidType, FluidType> YTTRIUM_GAS_TYPE = registerGas("yttrium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锆 */
    DeferredHolder<FluidType, FluidType> ZIRCONIUM_GAS_TYPE = registerGas("zirconium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铌 */
    DeferredHolder<FluidType, FluidType> NIOBIUM_GAS_TYPE = registerGas("niobium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钼 */
    DeferredHolder<FluidType, FluidType> MOLYBDENUM_GAS_TYPE = registerGas("molybdenum_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锝 */
    DeferredHolder<FluidType, FluidType> TECHNETIUM_GAS_TYPE = registerGas("technetium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钌 */
    DeferredHolder<FluidType, FluidType> RUTHENIUM_GAS_TYPE = registerGas("ruthenium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铑 */
    DeferredHolder<FluidType, FluidType> RHODIUM_GAS_TYPE = registerGas("rhodium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钯 */
    DeferredHolder<FluidType, FluidType> PALLADIUM_GAS_TYPE = registerGas("palladium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 银 */
    DeferredHolder<FluidType, FluidType> SILVER_GAS_TYPE = registerGas("silver_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镉 */
    DeferredHolder<FluidType, FluidType> CADMIUM_GAS_TYPE = registerGas("cadmium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铟 */
    DeferredHolder<FluidType, FluidType> INDIUM_GAS_TYPE = registerGas("indium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锡 */
    DeferredHolder<FluidType, FluidType> TIN_GAS_TYPE = registerGas("tin_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锑 */
    DeferredHolder<FluidType, FluidType> ANTIMONY_GAS_TYPE = registerGas("antimony_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 碲 */
    DeferredHolder<FluidType, FluidType> TELLURIUM_GAS_TYPE = registerGas("tellurium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 碘 */
    DeferredHolder<FluidType, FluidType> IODINE_GAS_TYPE = registerGas("iodine_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 氙气 */
    DeferredHolder<FluidType, FluidType> XENON_GAS_TYPE = registerGas("xenon_gas", 0, 0, -1000, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 铯 */
    DeferredHolder<FluidType, FluidType> CESIUM_GAS_TYPE = registerGas("cesium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钡 */
    DeferredHolder<FluidType, FluidType> BARIUM_GAS_TYPE = registerGas("barium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镧 */
    DeferredHolder<FluidType, FluidType> LANTHANUM_GAS_TYPE = registerGas("lanthanum_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铈 */
    DeferredHolder<FluidType, FluidType> CERIUM_GAS_TYPE = registerGas("cerium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镨 */
    DeferredHolder<FluidType, FluidType> PRASEODYMIUM_GAS_TYPE = registerGas("praseodymium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钕 */
    DeferredHolder<FluidType, FluidType> NEODYMIUM_GAS_TYPE = registerGas("neodymium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钷 */
    DeferredHolder<FluidType, FluidType> PROMETHIUM_GAS_TYPE = registerGas("promethium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钐 */
    DeferredHolder<FluidType, FluidType> SAMARIUM_GAS_TYPE = registerGas("samarium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铕 */
    DeferredHolder<FluidType, FluidType> EUROPIUM_GAS_TYPE = registerGas("europium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钆 */
    DeferredHolder<FluidType, FluidType> GADOLINIUM_GAS_TYPE = registerGas("gadolinium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铽 */
    DeferredHolder<FluidType, FluidType> TERBIUM_GAS_TYPE = registerGas("terbium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镝 */
    DeferredHolder<FluidType, FluidType> DYSPROSIUM_GAS_TYPE = registerGas("dysprosium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钬 */
    DeferredHolder<FluidType, FluidType> HOLMIUM_GAS_TYPE = registerGas("holmium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铒 */
    DeferredHolder<FluidType, FluidType> ERBIUM_GAS_TYPE = registerGas("erbium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铥 */
    DeferredHolder<FluidType, FluidType> THULIUM_GAS_TYPE = registerGas("thulium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镱 */
    DeferredHolder<FluidType, FluidType> YTTERBIUM_GAS_TYPE = registerGas("ytterbium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镥 */
    DeferredHolder<FluidType, FluidType> LUTETIUM_GAS_TYPE = registerGas("lutetium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铪 */
    DeferredHolder<FluidType, FluidType> HAFNIUM_GAS_TYPE = registerGas("hafnium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钽 */
    DeferredHolder<FluidType, FluidType> TANTALUM_GAS_TYPE = registerGas("tantalum_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钨 */
    DeferredHolder<FluidType, FluidType> TUNGSTEN_GAS_TYPE = registerGas("tungsten_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铼 */
    DeferredHolder<FluidType, FluidType> RHENIUM_GAS_TYPE = registerGas("rhenium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锇 */
    DeferredHolder<FluidType, FluidType> OSMIUM_GAS_TYPE = registerGas("osmium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铱 */
    DeferredHolder<FluidType, FluidType> IRIDIUM_GAS_TYPE = registerGas("iridium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铂 */
    DeferredHolder<FluidType, FluidType> PLATINUM_GAS_TYPE = registerGas("platinum_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 金 */
    DeferredHolder<FluidType, FluidType> GOLD_GAS_TYPE = registerGas("gold_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 汞（水银） */
    DeferredHolder<FluidType, FluidType> MERCURY_GAS_TYPE = registerGas("mercury_gas", 0, 0, -1000, 300, 1000, 0.01, false, false, true, true, true, true, true);
    /** 铊 */
    DeferredHolder<FluidType, FluidType> THALLIUM_GAS_TYPE = registerGas("thallium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铅 */
    DeferredHolder<FluidType, FluidType> LEAD_GAS_TYPE = registerGas("lead_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铋 */
    DeferredHolder<FluidType, FluidType> BISMUTH_GAS_TYPE = registerGas("bismuth_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钋 */
    DeferredHolder<FluidType, FluidType> POLONIUM_GAS_TYPE = registerGas("polonium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 砹 */
    DeferredHolder<FluidType, FluidType> ASTATINE_GAS_TYPE = registerGas("astatine_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 氡气 */
    DeferredHolder<FluidType, FluidType> RADON_GAS_TYPE = registerGas("radon_gas", 0, 0, -1000, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 钫 */
    DeferredHolder<FluidType, FluidType> FRANCIUM_GAS_TYPE = registerGas("francium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镭 */
    DeferredHolder<FluidType, FluidType> RADIUM_GAS_TYPE = registerGas("radium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锕 */
    DeferredHolder<FluidType, FluidType> ACTINIUM_GAS_TYPE = registerGas("actinium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钍 */
    DeferredHolder<FluidType, FluidType> THORIUM_GAS_TYPE = registerGas("thorium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镤 */
    DeferredHolder<FluidType, FluidType> PROTACTINIUM_GAS_TYPE = registerGas("protactinium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铀 */
    DeferredHolder<FluidType, FluidType> URANIUM_GAS_TYPE = registerGas("uranium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镎 */
    DeferredHolder<FluidType, FluidType> NEPTUNIUM_GAS_TYPE = registerGas("neptunium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钚 */
    DeferredHolder<FluidType, FluidType> PLUTONIUM_GAS_TYPE = registerGas("plutonium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镅 */
    DeferredHolder<FluidType, FluidType> AMERICIUM_GAS_TYPE = registerGas("americium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锔 */
    DeferredHolder<FluidType, FluidType> CURIUM_GAS_TYPE = registerGas("curium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锫 */
    DeferredHolder<FluidType, FluidType> BERKELIUM_GAS_TYPE = registerGas("berkelium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锎 */
    DeferredHolder<FluidType, FluidType> CALIFORNIUM_GAS_TYPE = registerGas("californium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锿 */
    DeferredHolder<FluidType, FluidType> EINSTEINIUM_GAS_TYPE = registerGas("einsteinium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镄 */
    DeferredHolder<FluidType, FluidType> FERMIUM_GAS_TYPE = registerGas("fermium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钔 */
    DeferredHolder<FluidType, FluidType> MENDELEVIUM_GAS_TYPE = registerGas("mendelevium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锘 */
    DeferredHolder<FluidType, FluidType> NOBELIUM_GAS_TYPE = registerGas("nobelium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铹 */
    DeferredHolder<FluidType, FluidType> LAWRENCIUM_GAS_TYPE = registerGas("lawrencium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𬬻 */
    DeferredHolder<FluidType, FluidType> RUTHERFORDIUM_GAS_TYPE = registerGas("rutherfordium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𬭊 */
    DeferredHolder<FluidType, FluidType> DUBNIUM_GAS_TYPE = registerGas("dubnium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𬭳 */
    DeferredHolder<FluidType, FluidType> SEABORGIUM_GAS_TYPE = registerGas("seaborgium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𬭛 */
    DeferredHolder<FluidType, FluidType> BOHRIUM_GAS_TYPE = registerGas("bohrium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𬭶 */
    DeferredHolder<FluidType, FluidType> HASSIUM_GAS_TYPE = registerGas("hassium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 鿏 */
    DeferredHolder<FluidType, FluidType> MEITNERIUM_GAS_TYPE = registerGas("meitnerium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𫟼 */
    DeferredHolder<FluidType, FluidType> DARMSTADTIUM_GAS_TYPE = registerGas("darmstadtium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𬬭 */
    DeferredHolder<FluidType, FluidType> ROENTGENIUM_GAS_TYPE = registerGas("roentgenium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 鎶 */
    DeferredHolder<FluidType, FluidType> COPERNICIUM_GAS_TYPE = registerGas("copernicium_gas", 0, 0, -1000, 300, 1000, 0.01, false, false, true, false, true, true, true);
    /** 鉨 */
    DeferredHolder<FluidType, FluidType> NIHONIUM_GAS_TYPE = registerGas("nihonium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𫓧 */
    DeferredHolder<FluidType, FluidType> FLEROVIUM_GAS_TYPE = registerGas("flerovium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镆 */
    DeferredHolder<FluidType, FluidType> MOSCOVIUM_GAS_TYPE = registerGas("moscovium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 鉝 */
    DeferredHolder<FluidType, FluidType> LIVERMORIUM_GAS_TYPE = registerGas("livermorium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 鿬 */
    DeferredHolder<FluidType, FluidType> TENNESSINE_GAS_TYPE = registerGas("tennessine_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 鿫 */
    DeferredHolder<FluidType, FluidType> OGANESSON_GAS_TYPE = registerGas("oganesson_gas", 0, 0, -1000, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 鑨 */
    DeferredHolder<FluidType, FluidType> LONGIUM_GAS_TYPE = registerGas("longium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镾 */
    DeferredHolder<FluidType, FluidType> MYSTERIUM_GAS_TYPE = registerGas("mysterium_gas", 0, 0, -1000, 300, 100, 0.014, false, false, false, false, false, false, false);

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
