package com.chinaex123.elementum_core.init;

import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.function.Supplier;

/** 120个元素流体块 */
public interface ECElementFluidBlocks {
    /** 氢流体 */
    DeferredBlock<LiquidBlock> LIQUID_HYDROGEN = register("liquid_hydrogen", ECElementFluids.LIQUID_HYDROGEN.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氦流体 */
    DeferredBlock<LiquidBlock> LIQUID_HELIUM = register("liquid_helium", ECElementFluids.LIQUID_HELIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锂流体 */
    DeferredBlock<LiquidBlock> LIQUID_LITHIUM = register("liquid_lithium", ECElementFluids.LIQUID_LITHIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铍流体 */
    DeferredBlock<LiquidBlock> LIQUID_BERYLLIUM = register("liquid_beryllium", ECElementFluids.LIQUID_BERYLLIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 硼流体 */
    DeferredBlock<LiquidBlock> LIQUID_BORON = register("liquid_boron", ECElementFluids.LIQUID_BORON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 碳流体 */
    DeferredBlock<LiquidBlock> LIQUID_CARBON = register("liquid_carbon", ECElementFluids.LIQUID_CARBON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氮流体 */
    DeferredBlock<LiquidBlock> LIQUID_NITROGEN = register("liquid_nitrogen", ECElementFluids.LIQUID_NITROGEN.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氧流体 */
    DeferredBlock<LiquidBlock> LIQUID_OXYGEN = register("liquid_oxygen", ECElementFluids.LIQUID_OXYGEN.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氟流体 */
    DeferredBlock<LiquidBlock> LIQUID_FLUORINE = register("liquid_fluorine", ECElementFluids.LIQUID_FLUORINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氖流体 */
    DeferredBlock<LiquidBlock> LIQUID_NEON = register("liquid_neon", ECElementFluids.LIQUID_NEON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钠流体 */
    DeferredBlock<LiquidBlock> LIQUID_SODIUM = register("liquid_sodium", ECElementFluids.LIQUID_SODIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镁流体 */
    DeferredBlock<LiquidBlock> LIQUID_MAGNESIUM = register("liquid_magnesium", ECElementFluids.LIQUID_MAGNESIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铝流体 */
    DeferredBlock<LiquidBlock> LIQUID_ALUMINUM = register("liquid_aluminum", ECElementFluids.LIQUID_ALUMINUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 硅流体 */
    DeferredBlock<LiquidBlock> LIQUID_SILICON = register("liquid_silicon", ECElementFluids.LIQUID_SILICON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 磷流体 */
    DeferredBlock<LiquidBlock> LIQUID_PHOSPHORUS = register("liquid_phosphorus", ECElementFluids.LIQUID_PHOSPHORUS.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 硫流体 */
    DeferredBlock<LiquidBlock> LIQUID_SULFUR = register("liquid_sulfur", ECElementFluids.LIQUID_SULFUR.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氯流体 */
    DeferredBlock<LiquidBlock> LIQUID_CHLORINE = register("liquid_chlorine", ECElementFluids.LIQUID_CHLORINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氩流体 */
    DeferredBlock<LiquidBlock> LIQUID_ARGON = register("liquid_argon", ECElementFluids.LIQUID_ARGON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钾流体 */
    DeferredBlock<LiquidBlock> LIQUID_POTASSIUM = register("liquid_potassium", ECElementFluids.LIQUID_POTASSIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钙流体 */
    DeferredBlock<LiquidBlock> LIQUID_CALCIUM = register("liquid_calcium", ECElementFluids.LIQUID_CALCIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钪流体 */
    DeferredBlock<LiquidBlock> LIQUID_SCANDIUM = register("liquid_scandium", ECElementFluids.LIQUID_SCANDIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钛流体 */
    DeferredBlock<LiquidBlock> LIQUID_TITANIUM = register("liquid_titanium", ECElementFluids.LIQUID_TITANIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钒流体 */
    DeferredBlock<LiquidBlock> LIQUID_VANADIUM = register("liquid_vanadium", ECElementFluids.LIQUID_VANADIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铬流体 */
    DeferredBlock<LiquidBlock> LIQUID_CHROMIUM = register("liquid_chromium", ECElementFluids.LIQUID_CHROMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锰流体 */
    DeferredBlock<LiquidBlock> LIQUID_MANGANESE = register("liquid_manganese", ECElementFluids.LIQUID_MANGANESE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铁流体 */
    DeferredBlock<LiquidBlock> LIQUID_IRON = register("liquid_iron", ECElementFluids.LIQUID_IRON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钴流体 */
    DeferredBlock<LiquidBlock> LIQUID_COBALT = register("liquid_cobalt", ECElementFluids.LIQUID_COBALT.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镍流体 */
    DeferredBlock<LiquidBlock> LIQUID_NICKEL = register("liquid_nickel", ECElementFluids.LIQUID_NICKEL.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铜流体 */
    DeferredBlock<LiquidBlock> LIQUID_COPPER = register("liquid_copper", ECElementFluids.LIQUID_COPPER.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锌流体 */
    DeferredBlock<LiquidBlock> LIQUID_ZINC = register("liquid_zinc", ECElementFluids.LIQUID_ZINC.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镓流体 */
    DeferredBlock<LiquidBlock> LIQUID_GALLIUM = register("liquid_gallium", ECElementFluids.LIQUID_GALLIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锗流体 */
    DeferredBlock<LiquidBlock> LIQUID_GERMANIUM = register("liquid_germanium", ECElementFluids.LIQUID_GERMANIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 砷流体 */
    DeferredBlock<LiquidBlock> LIQUID_ARSENIC = register("liquid_arsenic", ECElementFluids.LIQUID_ARSENIC.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 硒流体 */
    DeferredBlock<LiquidBlock> LIQUID_SELENIUM = register("liquid_selenium", ECElementFluids.LIQUID_SELENIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 溴流体 */
    DeferredBlock<LiquidBlock> BROMINE = register("bromine", ECElementFluids.BROMINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氪流体 */
    DeferredBlock<LiquidBlock> LIQUID_KRYPTON = register("liquid_krypton", ECElementFluids.LIQUID_KRYPTON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铷流体 */
    DeferredBlock<LiquidBlock> LIQUID_RUBIDIUM = register("liquid_rubidium", ECElementFluids.LIQUID_RUBIDIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锶流体 */
    DeferredBlock<LiquidBlock> LIQUID_STRONTIUM = register("liquid_strontium", ECElementFluids.LIQUID_STRONTIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钇流体 */
    DeferredBlock<LiquidBlock> LIQUID_YTTRIUM = register("liquid_yttrium", ECElementFluids.LIQUID_YTTRIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锆流体 */
    DeferredBlock<LiquidBlock> LIQUID_ZIRCONIUM = register("liquid_zirconium", ECElementFluids.LIQUID_ZIRCONIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铌流体 */
    DeferredBlock<LiquidBlock> LIQUID_NIOBIUM = register("liquid_niobium", ECElementFluids.LIQUID_NIOBIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钼流体 */
    DeferredBlock<LiquidBlock> LIQUID_MOLYBDENUM = register("liquid_molybdenum", ECElementFluids.LIQUID_MOLYBDENUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锝流体 */
    DeferredBlock<LiquidBlock> LIQUID_TECHNETIUM = register("liquid_technetium", ECElementFluids.LIQUID_TECHNETIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钌流体 */
    DeferredBlock<LiquidBlock> LIQUID_RUTHENIUM = register("liquid_ruthenium", ECElementFluids.LIQUID_RUTHENIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铑流体 */
    DeferredBlock<LiquidBlock> LIQUID_RHODIUM = register("liquid_rhodium", ECElementFluids.LIQUID_RHODIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钯流体 */
    DeferredBlock<LiquidBlock> LIQUID_PALLADIUM = register("liquid_palladium", ECElementFluids.LIQUID_PALLADIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 银流体 */
    DeferredBlock<LiquidBlock> LIQUID_SILVER = register("liquid_silver", ECElementFluids.LIQUID_SILVER.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镉流体 */
    DeferredBlock<LiquidBlock> LIQUID_CADMIUM = register("liquid_cadmium", ECElementFluids.LIQUID_CADMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铟流体 */
    DeferredBlock<LiquidBlock> LIQUID_INDIUM = register("liquid_indium", ECElementFluids.LIQUID_INDIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锡流体 */
    DeferredBlock<LiquidBlock> LIQUID_TIN = register("liquid_tin", ECElementFluids.LIQUID_TIN.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锑流体 */
    DeferredBlock<LiquidBlock> LIQUID_ANTIMONY = register("liquid_antimony", ECElementFluids.LIQUID_ANTIMONY.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 碲流体 */
    DeferredBlock<LiquidBlock> LIQUID_TELLURIUM = register("liquid_tellurium", ECElementFluids.LIQUID_TELLURIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 碘流体 */
    DeferredBlock<LiquidBlock> LIQUID_IODINE = register("liquid_iodine", ECElementFluids.LIQUID_IODINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氙流体 */
    DeferredBlock<LiquidBlock> LIQUID_XENON = register("liquid_xenon", ECElementFluids.LIQUID_XENON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铯流体 */
    DeferredBlock<LiquidBlock> LIQUID_CESIUM = register("liquid_cesium", ECElementFluids.LIQUID_CESIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钡流体 */
    DeferredBlock<LiquidBlock> LIQUID_BARIUM = register("liquid_barium", ECElementFluids.LIQUID_BARIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镧流体 */
    DeferredBlock<LiquidBlock> LIQUID_LANTHANUM = register("liquid_lanthanum", ECElementFluids.LIQUID_LANTHANUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铈流体 */
    DeferredBlock<LiquidBlock> LIQUID_CERIUM = register("liquid_cerium", ECElementFluids.LIQUID_CERIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镨流体 */
    DeferredBlock<LiquidBlock> LIQUID_PRASEODYMIUM = register("liquid_praseodymium", ECElementFluids.LIQUID_PRASEODYMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钕流体 */
    DeferredBlock<LiquidBlock> LIQUID_NEODYMIUM = register("liquid_neodymium", ECElementFluids.LIQUID_NEODYMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钷流体 */
    DeferredBlock<LiquidBlock> LIQUID_PROMETHIUM = register("liquid_promethium", ECElementFluids.LIQUID_PROMETHIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钐流体 */
    DeferredBlock<LiquidBlock> LIQUID_SAMARIUM = register("liquid_samarium", ECElementFluids.LIQUID_SAMARIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铕流体 */
    DeferredBlock<LiquidBlock> LIQUID_EUROPIUM = register("liquid_europium", ECElementFluids.LIQUID_EUROPIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钆流体 */
    DeferredBlock<LiquidBlock> LIQUID_GADOLINIUM = register("liquid_gadolinium", ECElementFluids.LIQUID_GADOLINIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铽流体 */
    DeferredBlock<LiquidBlock> LIQUID_TERBIUM = register("liquid_terbium", ECElementFluids.LIQUID_TERBIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镝流体 */
    DeferredBlock<LiquidBlock> LIQUID_DYSPROSIUM = register("liquid_dysprosium", ECElementFluids.LIQUID_DYSPROSIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钬流体 */
    DeferredBlock<LiquidBlock> LIQUID_HOLMIUM = register("liquid_holmium", ECElementFluids.LIQUID_HOLMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铒流体 */
    DeferredBlock<LiquidBlock> LIQUID_ERBIUM = register("liquid_erbium", ECElementFluids.LIQUID_ERBIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铥流体 */
    DeferredBlock<LiquidBlock> LIQUID_THULIUM = register("liquid_thulium", ECElementFluids.LIQUID_THULIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镱流体 */
    DeferredBlock<LiquidBlock> LIQUID_YTTERBIUM = register("liquid_ytterbium", ECElementFluids.LIQUID_YTTERBIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镥流体 */
    DeferredBlock<LiquidBlock> LIQUID_LUTETIUM = register("liquid_lutetium", ECElementFluids.LIQUID_LUTETIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铪流体 */
    DeferredBlock<LiquidBlock> LIQUID_HAFNIUM = register("liquid_hafnium", ECElementFluids.LIQUID_HAFNIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钽流体 */
    DeferredBlock<LiquidBlock> LIQUID_TANTALUM = register("liquid_tantalum", ECElementFluids.LIQUID_TANTALUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钨流体 */
    DeferredBlock<LiquidBlock> LIQUID_TUNGSTEN = register("liquid_tungsten", ECElementFluids.LIQUID_TUNGSTEN.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铼流体 */
    DeferredBlock<LiquidBlock> LIQUID_RHENIUM = register("liquid_rhenium", ECElementFluids.LIQUID_RHENIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锇流体 */
    DeferredBlock<LiquidBlock> LIQUID_OSMIUM = register("liquid_osmium", ECElementFluids.LIQUID_OSMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铱流体 */
    DeferredBlock<LiquidBlock> LIQUID_IRIDIUM = register("liquid_iridium", ECElementFluids.LIQUID_IRIDIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铂流体 */
    DeferredBlock<LiquidBlock> LIQUID_PLATINUM = register("liquid_platinum", ECElementFluids.LIQUID_PLATINUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 金流体 */
    DeferredBlock<LiquidBlock> LIQUID_GOLD = register("liquid_gold", ECElementFluids.LIQUID_GOLD.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 汞流体 */
    DeferredBlock<LiquidBlock> MERCURY = register("mercury", ECElementFluids.MERCURY.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铊流体 */
    DeferredBlock<LiquidBlock> LIQUID_THALLIUM = register("liquid_thallium", ECElementFluids.LIQUID_THALLIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铅流体 */
    DeferredBlock<LiquidBlock> LIQUID_LEAD = register("liquid_lead", ECElementFluids.LIQUID_LEAD.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铋流体 */
    DeferredBlock<LiquidBlock> LIQUID_BISMUTH = register("liquid_bismuth", ECElementFluids.LIQUID_BISMUTH.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钋流体 */
    DeferredBlock<LiquidBlock> LIQUID_POLONIUM = register("liquid_polonium", ECElementFluids.LIQUID_POLONIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 砹流体 */
    DeferredBlock<LiquidBlock> LIQUID_ASTATINE = register("liquid_astatine", ECElementFluids.LIQUID_ASTATINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氡流体 */
    DeferredBlock<LiquidBlock> LIQUID_RADON = register("liquid_radon", ECElementFluids.LIQUID_RADON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钫流体 */
    DeferredBlock<LiquidBlock> LIQUID_FRANCIUM = register("liquid_francium", ECElementFluids.LIQUID_FRANCIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镭流体 */
    DeferredBlock<LiquidBlock> LIQUID_RADIUM = register("liquid_radium", ECElementFluids.LIQUID_RADIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锕流体 */
    DeferredBlock<LiquidBlock> LIQUID_ACTINIUM = register("liquid_actinium", ECElementFluids.LIQUID_ACTINIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钍流体 */
    DeferredBlock<LiquidBlock> LIQUID_THORIUM = register("liquid_thorium", ECElementFluids.LIQUID_THORIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镤流体 */
    DeferredBlock<LiquidBlock> LIQUID_PROTACTINIUM = register("liquid_protactinium", ECElementFluids.LIQUID_PROTACTINIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铀流体 */
    DeferredBlock<LiquidBlock> LIQUID_URANIUM = register("liquid_uranium", ECElementFluids.LIQUID_URANIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镎流体 */
    DeferredBlock<LiquidBlock> LIQUID_NEPTUNIUM = register("liquid_neptunium", ECElementFluids.LIQUID_NEPTUNIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钚流体 */
    DeferredBlock<LiquidBlock> LIQUID_PLUTONIUM = register("liquid_plutonium", ECElementFluids.LIQUID_PLUTONIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镅流体 */
    DeferredBlock<LiquidBlock> LIQUID_AMERICIUM = register("liquid_americium", ECElementFluids.LIQUID_AMERICIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锔流体 */
    DeferredBlock<LiquidBlock> LIQUID_CURIUM = register("liquid_curium", ECElementFluids.LIQUID_CURIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锫流体 */
    DeferredBlock<LiquidBlock> LIQUID_BERKELIUM = register("liquid_berkelium", ECElementFluids.LIQUID_BERKELIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锎流体 */
    DeferredBlock<LiquidBlock> LIQUID_CALIFORNIUM = register("liquid_californium", ECElementFluids.LIQUID_CALIFORNIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锿流体 */
    DeferredBlock<LiquidBlock> LIQUID_EINSTEINIUM = register("liquid_einsteinium", ECElementFluids.LIQUID_EINSTEINIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镄流体 */
    DeferredBlock<LiquidBlock> LIQUID_FERMIUM = register("liquid_fermium", ECElementFluids.LIQUID_FERMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钔流体 */
    DeferredBlock<LiquidBlock> LIQUID_MENDELEVIUM = register("liquid_mendelevium", ECElementFluids.LIQUID_MENDELEVIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锘流体 */
    DeferredBlock<LiquidBlock> LIQUID_NOBELIUM = register("liquid_nobelium", ECElementFluids.LIQUID_NOBELIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铹流体 */
    DeferredBlock<LiquidBlock> LIQUID_LAWRENCIUM = register("liquid_lawrencium", ECElementFluids.LIQUID_LAWRENCIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 𬬻流体 */
    DeferredBlock<LiquidBlock> LIQUID_RUTHERFORDIUM = register("liquid_rutherfordium", ECElementFluids.LIQUID_RUTHERFORDIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 𬭊流体 */
    DeferredBlock<LiquidBlock> LIQUID_DUBNIUM = register("liquid_dubnium", ECElementFluids.LIQUID_DUBNIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 𬭳流体 */
    DeferredBlock<LiquidBlock> LIQUID_SEABORGIUM = register("liquid_seaborgium", ECElementFluids.LIQUID_SEABORGIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 𬭛流体 */
    DeferredBlock<LiquidBlock> LIQUID_BOHRIUM = register("liquid_bohrium", ECElementFluids.LIQUID_BOHRIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 𬭶流体 */
    DeferredBlock<LiquidBlock> LIQUID_HASSIUM = register("liquid_hassium", ECElementFluids.LIQUID_HASSIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 鿏流体 */
    DeferredBlock<LiquidBlock> LIQUID_MEITNERIUM = register("liquid_meitnerium", ECElementFluids.LIQUID_MEITNERIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 𫟼流体 */
    DeferredBlock<LiquidBlock> LIQUID_DARMSTADTIUM = register("liquid_darmstadtium", ECElementFluids.LIQUID_DARMSTADTIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 𬬭流体 */
    DeferredBlock<LiquidBlock> LIQUID_ROENTGENIUM = register("liquid_roentgenium", ECElementFluids.LIQUID_ROENTGENIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 鿔流体 */
    DeferredBlock<LiquidBlock> LIQUID_COPERNICIUM = register("liquid_copernicium", ECElementFluids.LIQUID_COPERNICIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 鉨流体 */
    DeferredBlock<LiquidBlock> LIQUID_NIHONIUM = register("liquid_nihonium", ECElementFluids.LIQUID_NIHONIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 鉨流体 */
    DeferredBlock<LiquidBlock> LIQUID_FLEROVIUM = register("liquid_flerovium", ECElementFluids.LIQUID_FLEROVIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钅莫流体 */
    DeferredBlock<LiquidBlock> LIQUID_MOSCOVIUM = register("liquid_moscovium", ECElementFluids.LIQUID_MOSCOVIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钅立流体 */
    DeferredBlock<LiquidBlock> LIQUID_LIVERMORIUM = register("liquid_livermorium", ECElementFluids.LIQUID_LIVERMORIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 鿬流体 */
    DeferredBlock<LiquidBlock> LIQUID_TENNESSINE = register("liquid_tennessine", ECElementFluids.LIQUID_TENNESSINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 鿫流体 */
    DeferredBlock<LiquidBlock> LIQUID_OGANESSON = register("liquid_oganesson", ECElementFluids.LIQUID_OGANESSON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 鑨流体 */
    DeferredBlock<LiquidBlock> LIQUID_LONGIUM = register("liquid_longium", ECElementFluids.LIQUID_LONGIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镾流体 */
    DeferredBlock<LiquidBlock> LIQUID_MYSTERIUM = register("liquid_mysterium", ECElementFluids.LIQUID_MYSTERIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);

    /**
     * @param name         方块的注册名称
     * @param fluid        源流体的 Supplier，延迟获取 Source 实例
     * @param hardness     方块硬度（挖掘难度）
     * @param friction     方块摩擦力（影响实体在其上的滑行）
     * @param speedFactor  速度因子（影响实体在该方块中的移动速度）
     * @param jumpFactor   跳跃因子（影响实体在该方块上的跳跃高度）
     * @param mapColor     地图颜色（用于地图上显示的颜色）
     * @return             返回延迟注册的 LiquidBlock 方块对象
     */
    private static DeferredBlock<LiquidBlock> register(String name, Supplier<BaseFlowingFluid.Source> fluid, float hardness, float friction, float speedFactor, float jumpFactor, MapColor mapColor) {
        return ECElementBlocks.BLOCKS.register(name, () -> new LiquidBlock(fluid.get(), BlockBehaviour.Properties.of()
                .noLootTable().liquid().replaceable().noCollission().strength(hardness).friction(friction)
                .speedFactor(speedFactor).jumpFactor(jumpFactor).mapColor(mapColor).sound(SoundType.EMPTY)));
    }
}