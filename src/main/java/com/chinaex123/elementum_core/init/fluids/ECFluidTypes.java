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
    DeferredHolder<FluidType, FluidType> LIQUID_HYDROGEN_TYPE = registerElement("liquid_hydrogen", 0, 0, 1, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 氦气 */
    DeferredHolder<FluidType, FluidType> LIQUID_HELIUM_TYPE = registerElement("liquid_helium", 0, 0, 1, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 锂 */
    DeferredHolder<FluidType, FluidType> LIQUID_LITHIUM_TYPE = registerElement("liquid_lithium", 0, 0, 1, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铍 */
    DeferredHolder<FluidType, FluidType> LIQUID_BERYLLIUM_TYPE = registerElement("liquid_beryllium", 0, 0, 1, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 硼 */
    DeferredHolder<FluidType, FluidType> LIQUID_BORON_TYPE = registerElement("liquid_boron", 0, 0, 2, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 碳 */
    DeferredHolder<FluidType, FluidType> LIQUID_CARBON_TYPE = registerElement("liquid_carbon", 0, 0, 2, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 氮气 */
    DeferredHolder<FluidType, FluidType> LIQUID_NITROGEN_TYPE = registerElement("liquid_nitrogen", 0, 0, 1, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 氧气 */
    DeferredHolder<FluidType, FluidType> LIQUID_OXYGEN_TYPE = registerElement("liquid_oxygen", 0, 0, 1, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 氟气 */
    DeferredHolder<FluidType, FluidType> LIQUID_FLUORINE_TYPE = registerElement("liquid_fluorine", 0, 0, 1, 300, 10, 0.05, false, false, false, true, true, false, false);
    /** 氖气 */
    DeferredHolder<FluidType, FluidType> LIQUID_NEON_TYPE = registerElement("liquid_neon", 0, 0, 1, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 钠 */
    DeferredHolder<FluidType, FluidType> LIQUID_SODIUM_TYPE = registerElement("liquid_sodium", 0, 0, 1, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镁 */
    DeferredHolder<FluidType, FluidType> LIQUID_MAGNESIUM_TYPE = registerElement("liquid_magnesium", 0, 0, 1, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铝 */
    DeferredHolder<FluidType, FluidType> LIQUID_ALUMINUM_TYPE = registerElement("liquid_aluminum", 0, 0, 2, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 硅 */
    DeferredHolder<FluidType, FluidType> LIQUID_SILICON_TYPE = registerElement("liquid_silicon", 0, 0, 2, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 磷 */
    DeferredHolder<FluidType, FluidType> LIQUID_PHOSPHORUS_TYPE = registerElement("liquid_phosphorus", 0, 0, 2, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 硫 */
    DeferredHolder<FluidType, FluidType> LIQUID_SULFUR_TYPE = registerElement("liquid_sulfur", 0, 0, 2, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 氯气 */
    DeferredHolder<FluidType, FluidType> LIQUID_CHLORINE_TYPE = registerElement("liquid_chlorine", 0, 0, 2, 300, 10, 0.05, false, false, false, true, true, true, false);
    /** 氩气 */
    DeferredHolder<FluidType, FluidType> LIQUID_ARGON_TYPE = registerElement("liquid_argon", 0, 0, 1, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 钾 */
    DeferredHolder<FluidType, FluidType> LIQUID_POTASSIUM_TYPE = registerElement("liquid_potassium", 0, 0, 0, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钙 */
    DeferredHolder<FluidType, FluidType> LIQUID_CALCIUM_TYPE = registerElement("liquid_calcium", 0, 0, 1, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钪 */
    DeferredHolder<FluidType, FluidType> LIQUID_SCANDIUM_TYPE = registerElement("liquid_scandium", 0, 0, 2, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钛 */
    DeferredHolder<FluidType, FluidType> LIQUID_TITANIUM_TYPE = registerElement("liquid_titanium", 0, 0, 4, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钒 */
    DeferredHolder<FluidType, FluidType> LIQUID_VANADIUM_TYPE = registerElement("liquid_vanadium", 0, 0, 6, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铬 */
    DeferredHolder<FluidType, FluidType> LIQUID_CHROMIUM_TYPE = registerElement("liquid_chromium", 0, 0, 7, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锰 */
    DeferredHolder<FluidType, FluidType> LIQUID_MANGANESE_TYPE = registerElement("liquid_manganese", 0, 0, 7, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铁 */
    DeferredHolder<FluidType, FluidType> LIQUID_IRON_TYPE = registerElement("liquid_iron", 0, 0, 7, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钴 */
    DeferredHolder<FluidType, FluidType> LIQUID_COBALT_TYPE = registerElement("liquid_cobalt", 0, 0, 8, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镍 */
    DeferredHolder<FluidType, FluidType> LIQUID_NICKEL_TYPE = registerElement("liquid_nickel", 0, 0, 8, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铜 */
    DeferredHolder<FluidType, FluidType> LIQUID_COPPER_TYPE = registerElement("liquid_copper", 0, 0, 8, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锌 */
    DeferredHolder<FluidType, FluidType> LIQUID_ZINC_TYPE = registerElement("liquid_zinc", 0, 0, 7, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镓 */
    DeferredHolder<FluidType, FluidType> LIQUID_GALLIUM_TYPE = registerElement("liquid_gallium", 0, 0, 5, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锗 */
    DeferredHolder<FluidType, FluidType> LIQUID_GERMANIUM_TYPE = registerElement("liquid_germanium", 0, 0, 5, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 砷 */
    DeferredHolder<FluidType, FluidType> LIQUID_ARSENIC_TYPE = registerElement("liquid_arsenic", 0, 0, 5, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 硒 */
    DeferredHolder<FluidType, FluidType> LIQUID_SELENIUM_TYPE = registerElement("liquid_selenium", 0, 0, 4, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 溴 */
    DeferredHolder<FluidType, FluidType> BROMINE_TYPE = registerElement("bromine", 0, 0, 3, 300, 1000, 0.01, false, false, false, true, true, true, true);
    /** 氪气 */
    DeferredHolder<FluidType, FluidType> LIQUID_KRYPTON_TYPE = registerElement("liquid_krypton", 0, 0, 2, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 铷 */
    DeferredHolder<FluidType, FluidType> LIQUID_RUBIDIUM_TYPE = registerElement("liquid_rubidium", 0, 0, 1, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锶 */
    DeferredHolder<FluidType, FluidType> LIQUID_STRONTIUM_TYPE = registerElement("liquid_strontium", 0, 0, 2, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钇 */
    DeferredHolder<FluidType, FluidType> LIQUID_YTTRIUM_TYPE = registerElement("liquid_yttrium", 0, 0, 4, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锆 */
    DeferredHolder<FluidType, FluidType> LIQUID_ZIRCONIUM_TYPE = registerElement("liquid_zirconium", 0, 0, 6, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铌 */
    DeferredHolder<FluidType, FluidType> LIQUID_NIOBIUM_TYPE = registerElement("liquid_niobium", 0, 0, 8, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钼 */
    DeferredHolder<FluidType, FluidType> LIQUID_MOLYBDENUM_TYPE = registerElement("liquid_molybdenum", 0, 0, 10, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锝 */
    DeferredHolder<FluidType, FluidType> LIQUID_TECHNETIUM_TYPE = registerElement("liquid_technetium", 0, 0, 11, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钌 */
    DeferredHolder<FluidType, FluidType> LIQUID_RUTHENIUM_TYPE = registerElement("liquid_ruthenium", 0, 0, 12, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铑 */
    DeferredHolder<FluidType, FluidType> LIQUID_RHODIUM_TYPE = registerElement("liquid_rhodium", 0, 0, 12, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钯 */
    DeferredHolder<FluidType, FluidType> LIQUID_PALLADIUM_TYPE = registerElement("liquid_palladium", 0, 0, 12, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 银 */
    DeferredHolder<FluidType, FluidType> LIQUID_SILVER_TYPE = registerElement("liquid_silver", 0, 0, 10, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镉 */
    DeferredHolder<FluidType, FluidType> LIQUID_CADMIUM_TYPE = registerElement("liquid_cadmium", 0, 0, 8, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铟 */
    DeferredHolder<FluidType, FluidType> LIQUID_INDIUM_TYPE = registerElement("liquid_indium", 0, 0, 7, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锡 */
    DeferredHolder<FluidType, FluidType> LIQUID_TIN_TYPE = registerElement("liquid_tin", 0, 0, 7, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锑 */
    DeferredHolder<FluidType, FluidType> LIQUID_ANTIMONY_TYPE = registerElement("liquid_antimony", 0, 0, 6, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 碲 */
    DeferredHolder<FluidType, FluidType> LIQUID_TELLURIUM_TYPE = registerElement("liquid_tellurium", 0, 0, 6, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 碘 */
    DeferredHolder<FluidType, FluidType> LIQUID_IODINE_TYPE = registerElement("liquid_iodine", 0, 0, 4, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 氙气 */
    DeferredHolder<FluidType, FluidType> LIQUID_XENON_TYPE = registerElement("liquid_xenon", 0, 0, 3, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 铯 */
    DeferredHolder<FluidType, FluidType> LIQUID_CESIUM_TYPE = registerElement("liquid_cesium", 0, 0, 1, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钡 */
    DeferredHolder<FluidType, FluidType> LIQUID_BARIUM_TYPE = registerElement("liquid_barium", 0, 0, 3, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镧 */
    DeferredHolder<FluidType, FluidType> LIQUID_LANTHANUM_TYPE = registerElement("liquid_lanthanum", 0, 0, 6, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铈 */
    DeferredHolder<FluidType, FluidType> LIQUID_CERIUM_TYPE = registerElement("liquid_cerium", 0, 0, 6, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镨 */
    DeferredHolder<FluidType, FluidType> LIQUID_PRASEODYMIUM_TYPE = registerElement("liquid_praseodymium", 0, 0, 6, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钕 */
    DeferredHolder<FluidType, FluidType> LIQUID_NEODYMIUM_TYPE = registerElement("liquid_neodymium", 0, 0, 7, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钷 */
    DeferredHolder<FluidType, FluidType> LIQUID_PROMETHIUM_TYPE = registerElement("liquid_promethium", 0, 0, 7, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钐 */
    DeferredHolder<FluidType, FluidType> LIQUID_SAMARIUM_TYPE = registerElement("liquid_samarium", 0, 0, 7, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铕 */
    DeferredHolder<FluidType, FluidType> LIQUID_EUROPIUM_TYPE = registerElement("liquid_europium", 0, 0, 5, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钆 */
    DeferredHolder<FluidType, FluidType> LIQUID_GADOLINIUM_TYPE = registerElement("liquid_gadolinium", 0, 0, 7, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铽 */
    DeferredHolder<FluidType, FluidType> LIQUID_TERBIUM_TYPE = registerElement("liquid_terbium", 0, 0, 8, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镝 */
    DeferredHolder<FluidType, FluidType> LIQUID_DYSPROSIUM_TYPE = registerElement("liquid_dysprosium", 0, 0, 8, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钬 */
    DeferredHolder<FluidType, FluidType> LIQUID_HOLMIUM_TYPE = registerElement("liquid_holmium", 0, 0, 8, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铒 */
    DeferredHolder<FluidType, FluidType> LIQUID_ERBIUM_TYPE = registerElement("liquid_erbium", 0, 0, 9, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铥 */
    DeferredHolder<FluidType, FluidType> LIQUID_THULIUM_TYPE = registerElement("liquid_thulium", 0, 0, 9, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镱 */
    DeferredHolder<FluidType, FluidType> LIQUID_YTTERBIUM_TYPE = registerElement("liquid_ytterbium", 0, 0, 6, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镥 */
    DeferredHolder<FluidType, FluidType> LIQUID_LUTETIUM_TYPE = registerElement("liquid_lutetium", 0, 0, 9, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铪 */
    DeferredHolder<FluidType, FluidType> LIQUID_HAFNIUM_TYPE = registerElement("liquid_hafnium", 0, 0, 13, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钽 */
    DeferredHolder<FluidType, FluidType> LIQUID_TANTALUM_TYPE = registerElement("liquid_tantalum", 0, 0, 16, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钨 */
    DeferredHolder<FluidType, FluidType> LIQUID_TUNGSTEN_TYPE = registerElement("liquid_tungsten", 0, 0, 19, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铼 */
    DeferredHolder<FluidType, FluidType> LIQUID_RHENIUM_TYPE = registerElement("liquid_rhenium", 0, 0, 21, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锇 */
    DeferredHolder<FluidType, FluidType> LIQUID_OSMIUM_TYPE = registerElement("liquid_osmium", 0, 0, 22, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铱 */
    DeferredHolder<FluidType, FluidType> LIQUID_IRIDIUM_TYPE = registerElement("liquid_iridium", 0, 0, 22, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铂 */
    DeferredHolder<FluidType, FluidType> LIQUID_PLATINUM_TYPE = registerElement("liquid_platinum", 0, 0, 21, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 金 */
    DeferredHolder<FluidType, FluidType> LIQUID_GOLD_TYPE = registerElement("liquid_gold", 0, 0, 19, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 汞（水银） */
    DeferredHolder<FluidType, FluidType> MERCURY_TYPE = registerElement("mercury", 0, 0, 13, 300, 1000, 0.01, false, false, true, true, true, true, true);
    /** 铊 */
    DeferredHolder<FluidType, FluidType> LIQUID_THALLIUM_TYPE = registerElement("liquid_thallium", 0, 0, 11, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铅 */
    DeferredHolder<FluidType, FluidType> LIQUID_LEAD_TYPE = registerElement("liquid_lead", 0, 0, 11, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铋 */
    DeferredHolder<FluidType, FluidType> LIQUID_BISMUTH_TYPE = registerElement("liquid_bismuth", 0, 0, 9, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钋 */
    DeferredHolder<FluidType, FluidType> LIQUID_POLONIUM_TYPE = registerElement("liquid_polonium", 0, 0, 9, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 砹 */
    DeferredHolder<FluidType, FluidType> LIQUID_ASTATINE_TYPE = registerElement("liquid_astatine", 0, 0, 6, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 氡气 */
    DeferredHolder<FluidType, FluidType> LIQUID_RADON_TYPE = registerElement("liquid_radon", 0, 0, 5, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 钫 */
    DeferredHolder<FluidType, FluidType> LIQUID_FRANCIUM_TYPE = registerElement("liquid_francium", 0, 0, 1, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镭 */
    DeferredHolder<FluidType, FluidType> LIQUID_RADIUM_TYPE = registerElement("liquid_radium", 0, 0, 5, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锕 */
    DeferredHolder<FluidType, FluidType> LIQUID_ACTINIUM_TYPE = registerElement("liquid_actinium", 0, 0, 10, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钍 */
    DeferredHolder<FluidType, FluidType> LIQUID_THORIUM_TYPE = registerElement("liquid_thorium", 0, 0, 11, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镤 */
    DeferredHolder<FluidType, FluidType> LIQUID_PROTACTINIUM_TYPE = registerElement("liquid_protactinium", 0, 0, 15, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铀 */
    DeferredHolder<FluidType, FluidType> LIQUID_URANIUM_TYPE = registerElement("liquid_uranium", 0, 0, 19, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镎 */
    DeferredHolder<FluidType, FluidType> LIQUID_NEPTUNIUM_TYPE = registerElement("liquid_neptunium", 0, 0, 20, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钚 */
    DeferredHolder<FluidType, FluidType> LIQUID_PLUTONIUM_TYPE = registerElement("liquid_plutonium", 0, 0, 19, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镅 */
    DeferredHolder<FluidType, FluidType> LIQUID_AMERICIUM_TYPE = registerElement("liquid_americium", 0, 0, 13, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锔 */
    DeferredHolder<FluidType, FluidType> LIQUID_CURIUM_TYPE = registerElement("liquid_curium", 0, 0, 13, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锫 */
    DeferredHolder<FluidType, FluidType> LIQUID_BERKELIUM_TYPE = registerElement("liquid_berkelium", 0, 0, 14, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锎 */
    DeferredHolder<FluidType, FluidType> LIQUID_CALIFORNIUM_TYPE = registerElement("liquid_californium", 0, 0, 15, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锿 */
    DeferredHolder<FluidType, FluidType> LIQUID_EINSTEINIUM_TYPE = registerElement("liquid_einsteinium", 0, 0, 8, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镄 */
    DeferredHolder<FluidType, FluidType> LIQUID_FERMIUM_TYPE = registerElement("liquid_fermium", 0, 0, 9, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 钔 */
    DeferredHolder<FluidType, FluidType> LIQUID_MENDELEVIUM_TYPE = registerElement("liquid_mendelevium", 0, 0, 10, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 锘 */
    DeferredHolder<FluidType, FluidType> LIQUID_NOBELIUM_TYPE = registerElement("liquid_nobelium", 0, 0, 10, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 铹 */
    DeferredHolder<FluidType, FluidType> LIQUID_LAWRENCIUM_TYPE = registerElement("liquid_lawrencium", 0, 0, 15, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𬬻 */
    DeferredHolder<FluidType, FluidType> LIQUID_RUTHERFORDIUM_TYPE = registerElement("liquid_rutherfordium", 0, 0, 17, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𬭊 */
    DeferredHolder<FluidType, FluidType> LIQUID_DUBNIUM_TYPE = registerElement("liquid_dubnium", 0, 0, 21, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𬭳 */
    DeferredHolder<FluidType, FluidType> LIQUID_SEABORGIUM_TYPE = registerElement("liquid_seaborgium", 0, 0, 23, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𬭛 */
    DeferredHolder<FluidType, FluidType> LIQUID_BOHRIUM_TYPE = registerElement("liquid_bohrium", 0, 0, 26, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𬭶 */
    DeferredHolder<FluidType, FluidType> LIQUID_HASSIUM_TYPE = registerElement("liquid_hassium", 0, 0, 27, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 鿏 */
    DeferredHolder<FluidType, FluidType> LIQUID_MEITNERIUM_TYPE = registerElement("liquid_meitnerium", 0, 0, 27, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𫟼 */
    DeferredHolder<FluidType, FluidType> LIQUID_DARMSTADTIUM_TYPE = registerElement("liquid_darmstadtium", 0, 0, 26, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𬬭 */
    DeferredHolder<FluidType, FluidType> LIQUID_ROENTGENIUM_TYPE = registerElement("liquid_roentgenium", 0, 0, 26, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 鿔 */
    DeferredHolder<FluidType, FluidType> LIQUID_COPERNICIUM_TYPE = registerElement("liquid_copernicium", 0, 0, 14, 300, 1000, 0.01, false, false, true, false, true, true, true);
    /** 鿭 */
    DeferredHolder<FluidType, FluidType> LIQUID_NIHONIUM_TYPE = registerElement("liquid_nihonium", 0, 0, 16, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𫓧 */
    DeferredHolder<FluidType, FluidType> LIQUID_FLEROVIUM_TYPE = registerElement("liquid_flerovium", 0, 0, 14, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镆 */
    DeferredHolder<FluidType, FluidType> LIQUID_MOSCOVIUM_TYPE = registerElement("liquid_moscovium", 0, 0, 13, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 𫟷 */
    DeferredHolder<FluidType, FluidType> LIQUID_LIVERMORIUM_TYPE = registerElement("liquid_livermorium", 0, 0, 12, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 鿬 */
    DeferredHolder<FluidType, FluidType> LIQUID_TENNESSINE_TYPE = registerElement("liquid_tennessine", 0, 0, 7, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 鿫 */
    DeferredHolder<FluidType, FluidType> LIQUID_OGANESSON_TYPE = registerElement("liquid_oganesson", 0, 0, 5, 300, 10, 0.05, false, false, false, false, true, false, false);
    /** 鑨 */
    DeferredHolder<FluidType, FluidType> LIQUID_LONGIUM_TYPE = registerElement("liquid_longium", 0, 0, 10, 300, 100, 0.014, false, false, false, false, false, false, false);
    /** 镾 */
    DeferredHolder<FluidType, FluidType> LIQUID_MYSTERIUM_TYPE = registerElement("liquid_mysterium", 0, 0, 10, 300, 100, 0.014, false, false, false, false, false, false, false);

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