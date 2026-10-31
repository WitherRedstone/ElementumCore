package com.chinaex123.elementum_core.init.blocks;

import com.chinaex123.elementum_core.init.fluids.ECFluids;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.registries.DeferredBlock;

import java.util.function.Supplier;

public interface ECElementFluidBlocks {

    /** 氢流体 */
    DeferredBlock<LiquidBlock> LIQUID_HYDROGEN = register("liquid_hydrogen", ECFluids.LIQUID_HYDROGEN.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氦流体 */
    DeferredBlock<LiquidBlock> LIQUID_HELIUM = register("liquid_helium", ECFluids.LIQUID_HELIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锂流体 */
    DeferredBlock<LiquidBlock> LIQUID_LITHIUM = register("liquid_lithium", ECFluids.LIQUID_LITHIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铍流体 */
    DeferredBlock<LiquidBlock> LIQUID_BERYLLIUM = register("liquid_beryllium", ECFluids.LIQUID_BERYLLIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 硼流体 */
    DeferredBlock<LiquidBlock> LIQUID_BORON = register("liquid_boron", ECFluids.LIQUID_BORON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 碳流体 */
    DeferredBlock<LiquidBlock> LIQUID_CARBON = register("liquid_carbon", ECFluids.LIQUID_CARBON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氮流体 */
    DeferredBlock<LiquidBlock> LIQUID_NITROGEN = register("liquid_nitrogen", ECFluids.LIQUID_NITROGEN.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氧流体 */
    DeferredBlock<LiquidBlock> LIQUID_OXYGEN = register("liquid_oxygen", ECFluids.LIQUID_OXYGEN.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氟流体 */
    DeferredBlock<LiquidBlock> LIQUID_FLUORINE = register("liquid_fluorine", ECFluids.LIQUID_FLUORINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氖流体 */
    DeferredBlock<LiquidBlock> LIQUID_NEON = register("liquid_neon", ECFluids.LIQUID_NEON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钠流体 */
    DeferredBlock<LiquidBlock> LIQUID_SODIUM = register("liquid_sodium", ECFluids.LIQUID_SODIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镁流体 */
    DeferredBlock<LiquidBlock> LIQUID_MAGNESIUM = register("liquid_magnesium", ECFluids.LIQUID_MAGNESIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铝流体 */
    DeferredBlock<LiquidBlock> LIQUID_ALUMINUM = register("liquid_aluminum", ECFluids.LIQUID_ALUMINUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 硅流体 */
    DeferredBlock<LiquidBlock> LIQUID_SILICON = register("liquid_silicon", ECFluids.LIQUID_SILICON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 磷流体 */
    DeferredBlock<LiquidBlock> LIQUID_PHOSPHORUS = register("liquid_phosphorus", ECFluids.LIQUID_PHOSPHORUS.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 硫流体 */
    DeferredBlock<LiquidBlock> LIQUID_SULFUR = register("liquid_sulfur", ECFluids.LIQUID_SULFUR.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氯流体 */
    DeferredBlock<LiquidBlock> LIQUID_CHLORINE = register("liquid_chlorine", ECFluids.LIQUID_CHLORINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氩流体 */
    DeferredBlock<LiquidBlock> LIQUID_ARGON = register("liquid_argon", ECFluids.LIQUID_ARGON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钾流体 */
    DeferredBlock<LiquidBlock> LIQUID_POTASSIUM = register("liquid_potassium", ECFluids.LIQUID_POTASSIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钙流体 */
    DeferredBlock<LiquidBlock> LIQUID_CALCIUM = register("liquid_calcium", ECFluids.LIQUID_CALCIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钪流体 */
    DeferredBlock<LiquidBlock> LIQUID_SCANDIUM = register("liquid_scandium", ECFluids.LIQUID_SCANDIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钛流体 */
    DeferredBlock<LiquidBlock> LIQUID_TITANIUM = register("liquid_titanium", ECFluids.LIQUID_TITANIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钒流体 */
    DeferredBlock<LiquidBlock> LIQUID_VANADIUM = register("liquid_vanadium", ECFluids.LIQUID_VANADIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铬流体 */
    DeferredBlock<LiquidBlock> LIQUID_CHROMIUM = register("liquid_chromium", ECFluids.LIQUID_CHROMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锰流体 */
    DeferredBlock<LiquidBlock> LIQUID_MANGANESE = register("liquid_manganese", ECFluids.LIQUID_MANGANESE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铁流体 */
    DeferredBlock<LiquidBlock> LIQUID_IRON = register("liquid_iron", ECFluids.LIQUID_IRON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钴流体 */
    DeferredBlock<LiquidBlock> LIQUID_COBALT = register("liquid_cobalt", ECFluids.LIQUID_COBALT.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镍流体 */
    DeferredBlock<LiquidBlock> LIQUID_NICKEL = register("liquid_nickel", ECFluids.LIQUID_NICKEL.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铜流体 */
    DeferredBlock<LiquidBlock> LIQUID_COPPER = register("liquid_copper", ECFluids.LIQUID_COPPER.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锌流体 */
    DeferredBlock<LiquidBlock> LIQUID_ZINC = register("liquid_zinc", ECFluids.LIQUID_ZINC.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镓流体 */
    DeferredBlock<LiquidBlock> LIQUID_GALLIUM = register("liquid_gallium", ECFluids.LIQUID_GALLIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锗流体 */
    DeferredBlock<LiquidBlock> LIQUID_GERMANIUM = register("liquid_germanium", ECFluids.LIQUID_GERMANIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 砷流体 */
    DeferredBlock<LiquidBlock> LIQUID_ARSENIC = register("liquid_arsenic", ECFluids.LIQUID_ARSENIC.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 硒流体 */
    DeferredBlock<LiquidBlock> LIQUID_SELENIUM = register("liquid_selenium", ECFluids.LIQUID_SELENIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 溴流体 */
    DeferredBlock<LiquidBlock> BROMINE = register("bromine", ECFluids.BROMINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氪流体 */
    DeferredBlock<LiquidBlock> LIQUID_KRYPTON = register("liquid_krypton", ECFluids.LIQUID_KRYPTON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铷流体 */
    DeferredBlock<LiquidBlock> LIQUID_RUBIDIUM = register("liquid_rubidium", ECFluids.LIQUID_RUBIDIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锶流体 */
    DeferredBlock<LiquidBlock> LIQUID_STRONTIUM = register("liquid_strontium", ECFluids.LIQUID_STRONTIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钇流体 */
    DeferredBlock<LiquidBlock> LIQUID_YTTRIUM = register("liquid_yttrium", ECFluids.LIQUID_YTTRIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锆流体 */
    DeferredBlock<LiquidBlock> LIQUID_ZIRCONIUM = register("liquid_zirconium", ECFluids.LIQUID_ZIRCONIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铌流体 */
    DeferredBlock<LiquidBlock> LIQUID_NIOBIUM = register("liquid_niobium", ECFluids.LIQUID_NIOBIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钼流体 */
    DeferredBlock<LiquidBlock> LIQUID_MOLYBDENUM = register("liquid_molybdenum", ECFluids.LIQUID_MOLYBDENUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锝流体 */
    DeferredBlock<LiquidBlock> LIQUID_TECHNETIUM = register("liquid_technetium", ECFluids.LIQUID_TECHNETIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钌流体 */
    DeferredBlock<LiquidBlock> LIQUID_RUTHENIUM = register("liquid_ruthenium", ECFluids.LIQUID_RUTHENIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铑流体 */
    DeferredBlock<LiquidBlock> LIQUID_RHODIUM = register("liquid_rhodium", ECFluids.LIQUID_RHODIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钯流体 */
    DeferredBlock<LiquidBlock> LIQUID_PALLADIUM = register("liquid_palladium", ECFluids.LIQUID_PALLADIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 银流体 */
    DeferredBlock<LiquidBlock> LIQUID_SILVER = register("liquid_silver", ECFluids.LIQUID_SILVER.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镉流体 */
    DeferredBlock<LiquidBlock> LIQUID_CADMIUM = register("liquid_cadmium", ECFluids.LIQUID_CADMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铟流体 */
    DeferredBlock<LiquidBlock> LIQUID_INDIUM = register("liquid_indium", ECFluids.LIQUID_INDIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锡流体 */
    DeferredBlock<LiquidBlock> LIQUID_TIN = register("liquid_tin", ECFluids.LIQUID_TIN.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锑流体 */
    DeferredBlock<LiquidBlock> LIQUID_ANTIMONY = register("liquid_antimony", ECFluids.LIQUID_ANTIMONY.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 碲流体 */
    DeferredBlock<LiquidBlock> LIQUID_TELLURIUM = register("liquid_tellurium", ECFluids.LIQUID_TELLURIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 碘流体 */
    DeferredBlock<LiquidBlock> LIQUID_IODINE = register("liquid_iodine", ECFluids.LIQUID_IODINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氙流体 */
    DeferredBlock<LiquidBlock> LIQUID_XENON = register("liquid_xenon", ECFluids.LIQUID_XENON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铯流体 */
    DeferredBlock<LiquidBlock> LIQUID_CESIUM = register("liquid_cesium", ECFluids.LIQUID_CESIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钡流体 */
    DeferredBlock<LiquidBlock> LIQUID_BARIUM = register("liquid_barium", ECFluids.LIQUID_BARIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镧流体 */
    DeferredBlock<LiquidBlock> LIQUID_LANTHANUM = register("liquid_lanthanum", ECFluids.LIQUID_LANTHANUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铈流体 */
    DeferredBlock<LiquidBlock> LIQUID_CERIUM = register("liquid_cerium", ECFluids.LIQUID_CERIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镨流体 */
    DeferredBlock<LiquidBlock> LIQUID_PRASEODYMIUM = register("liquid_praseodymium", ECFluids.LIQUID_PRASEODYMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钕流体 */
    DeferredBlock<LiquidBlock> LIQUID_NEODYMIUM = register("liquid_neodymium", ECFluids.LIQUID_NEODYMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钷流体 */
    DeferredBlock<LiquidBlock> LIQUID_PROMETHIUM = register("liquid_promethium", ECFluids.LIQUID_PROMETHIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钐流体 */
    DeferredBlock<LiquidBlock> LIQUID_SAMARIUM = register("liquid_samarium", ECFluids.LIQUID_SAMARIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铕流体 */
    DeferredBlock<LiquidBlock> LIQUID_EUROPIUM = register("liquid_europium", ECFluids.LIQUID_EUROPIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钆流体 */
    DeferredBlock<LiquidBlock> LIQUID_GADOLINIUM = register("liquid_gadolinium", ECFluids.LIQUID_GADOLINIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铽流体 */
    DeferredBlock<LiquidBlock> LIQUID_TERBIUM = register("liquid_terbium", ECFluids.LIQUID_TERBIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镝流体 */
    DeferredBlock<LiquidBlock> LIQUID_DYSPROSIUM = register("liquid_dysprosium", ECFluids.LIQUID_DYSPROSIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钬流体 */
    DeferredBlock<LiquidBlock> LIQUID_HOLMIUM = register("liquid_holmium", ECFluids.LIQUID_HOLMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铒流体 */
    DeferredBlock<LiquidBlock> LIQUID_ERBIUM = register("liquid_erbium", ECFluids.LIQUID_ERBIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铥流体 */
    DeferredBlock<LiquidBlock> LIQUID_THULIUM = register("liquid_thulium", ECFluids.LIQUID_THULIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镱流体 */
    DeferredBlock<LiquidBlock> LIQUID_YTTERBIUM = register("liquid_ytterbium", ECFluids.LIQUID_YTTERBIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镥流体 */
    DeferredBlock<LiquidBlock> LIQUID_LUTETIUM = register("liquid_lutetium", ECFluids.LIQUID_LUTETIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铪流体 */
    DeferredBlock<LiquidBlock> LIQUID_HAFNIUM = register("liquid_hafnium", ECFluids.LIQUID_HAFNIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钽流体 */
    DeferredBlock<LiquidBlock> LIQUID_TANTALUM = register("liquid_tantalum", ECFluids.LIQUID_TANTALUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钨流体 */
    DeferredBlock<LiquidBlock> LIQUID_TUNGSTEN = register("liquid_tungsten", ECFluids.LIQUID_TUNGSTEN.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铼流体 */
    DeferredBlock<LiquidBlock> LIQUID_RHENIUM = register("liquid_rhenium", ECFluids.LIQUID_RHENIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锇流体 */
    DeferredBlock<LiquidBlock> LIQUID_OSMIUM = register("liquid_osmium", ECFluids.LIQUID_OSMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铱流体 */
    DeferredBlock<LiquidBlock> LIQUID_IRIDIUM = register("liquid_iridium", ECFluids.LIQUID_IRIDIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铂流体 */
    DeferredBlock<LiquidBlock> LIQUID_PLATINUM = register("liquid_platinum", ECFluids.LIQUID_PLATINUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 金流体 */
    DeferredBlock<LiquidBlock> LIQUID_GOLD = register("liquid_gold", ECFluids.LIQUID_GOLD.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 汞流体 */
    DeferredBlock<LiquidBlock> MERCURY = register("mercury", ECFluids.MERCURY.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铊流体 */
    DeferredBlock<LiquidBlock> LIQUID_THALLIUM = register("liquid_thallium", ECFluids.LIQUID_THALLIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铅流体 */
    DeferredBlock<LiquidBlock> LIQUID_LEAD = register("liquid_lead", ECFluids.LIQUID_LEAD.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铋流体 */
    DeferredBlock<LiquidBlock> LIQUID_BISMUTH = register("liquid_bismuth", ECFluids.LIQUID_BISMUTH.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钋流体 */
    DeferredBlock<LiquidBlock> LIQUID_POLONIUM = register("liquid_polonium", ECFluids.LIQUID_POLONIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 砹流体 */
    DeferredBlock<LiquidBlock> LIQUID_ASTATINE = register("liquid_astatine", ECFluids.LIQUID_ASTATINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氡流体 */
    DeferredBlock<LiquidBlock> LIQUID_RADON = register("liquid_radon", ECFluids.LIQUID_RADON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钫流体 */
    DeferredBlock<LiquidBlock> LIQUID_FRANCIUM = register("liquid_francium", ECFluids.LIQUID_FRANCIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镭流体 */
    DeferredBlock<LiquidBlock> LIQUID_RADIUM = register("liquid_radium", ECFluids.LIQUID_RADIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锕流体 */
    DeferredBlock<LiquidBlock> LIQUID_ACTINIUM = register("liquid_actinium", ECFluids.LIQUID_ACTINIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钍流体 */
    DeferredBlock<LiquidBlock> LIQUID_THORIUM = register("liquid_thorium", ECFluids.LIQUID_THORIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镤流体 */
    DeferredBlock<LiquidBlock> LIQUID_PROTACTINIUM = register("liquid_protactinium", ECFluids.LIQUID_PROTACTINIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铀流体 */
    DeferredBlock<LiquidBlock> LIQUID_URANIUM = register("liquid_uranium", ECFluids.LIQUID_URANIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镎流体 */
    DeferredBlock<LiquidBlock> LIQUID_NEPTUNIUM = register("liquid_neptunium", ECFluids.LIQUID_NEPTUNIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钚流体 */
    DeferredBlock<LiquidBlock> LIQUID_PLUTONIUM = register("liquid_plutonium", ECFluids.LIQUID_PLUTONIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镅流体 */
    DeferredBlock<LiquidBlock> LIQUID_AMERICIUM = register("liquid_americium", ECFluids.LIQUID_AMERICIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锔流体 */
    DeferredBlock<LiquidBlock> LIQUID_CURIUM = register("liquid_curium", ECFluids.LIQUID_CURIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锫流体 */
    DeferredBlock<LiquidBlock> LIQUID_BERKELIUM = register("liquid_berkelium", ECFluids.LIQUID_BERKELIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锎流体 */
    DeferredBlock<LiquidBlock> LIQUID_CALIFORNIUM = register("liquid_californium", ECFluids.LIQUID_CALIFORNIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锿流体 */
    DeferredBlock<LiquidBlock> LIQUID_EINSTEINIUM = register("liquid_einsteinium", ECFluids.LIQUID_EINSTEINIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镄流体 */
    DeferredBlock<LiquidBlock> LIQUID_FERMIUM = register("liquid_fermium", ECFluids.LIQUID_FERMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钔流体 */
    DeferredBlock<LiquidBlock> LIQUID_MENDELEVIUM = register("liquid_mendelevium", ECFluids.LIQUID_MENDELEVIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锘流体 */
    DeferredBlock<LiquidBlock> LIQUID_NOBELIUM = register("liquid_nobelium", ECFluids.LIQUID_NOBELIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铹流体 */
    DeferredBlock<LiquidBlock> LIQUID_LAWRENCIUM = register("liquid_lawrencium", ECFluids.LIQUID_LAWRENCIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 𬬻流体 */
    DeferredBlock<LiquidBlock> LIQUID_RUTHERFORDIUM = register("liquid_rutherfordium", ECFluids.LIQUID_RUTHERFORDIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 𬭊流体 */
    DeferredBlock<LiquidBlock> LIQUID_DUBNIUM = register("liquid_dubnium", ECFluids.LIQUID_DUBNIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 𬭳流体 */
    DeferredBlock<LiquidBlock> LIQUID_SEABORGIUM = register("liquid_seaborgium", ECFluids.LIQUID_SEABORGIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 𬭛流体 */
    DeferredBlock<LiquidBlock> LIQUID_BOHRIUM = register("liquid_bohrium", ECFluids.LIQUID_BOHRIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 𬭶流体 */
    DeferredBlock<LiquidBlock> LIQUID_HASSIUM = register("liquid_hassium", ECFluids.LIQUID_HASSIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 鿏流体 */
    DeferredBlock<LiquidBlock> LIQUID_MEITNERIUM = register("liquid_meitnerium", ECFluids.LIQUID_MEITNERIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 𫟼流体 */
    DeferredBlock<LiquidBlock> LIQUID_DARMSTADTIUM = register("liquid_darmstadtium", ECFluids.LIQUID_DARMSTADTIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 𬬭流体 */
    DeferredBlock<LiquidBlock> LIQUID_ROENTGENIUM = register("liquid_roentgenium", ECFluids.LIQUID_ROENTGENIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 鿔流体 */
    DeferredBlock<LiquidBlock> LIQUID_COPERNICIUM = register("liquid_copernicium", ECFluids.LIQUID_COPERNICIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 鉨流体 */
    DeferredBlock<LiquidBlock> LIQUID_NIHONIUM = register("liquid_nihonium", ECFluids.LIQUID_NIHONIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 鉨流体 */
    DeferredBlock<LiquidBlock> LIQUID_FLEROVIUM = register("liquid_flerovium", ECFluids.LIQUID_FLEROVIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钅莫流体 */
    DeferredBlock<LiquidBlock> LIQUID_MOSCOVIUM = register("liquid_moscovium", ECFluids.LIQUID_MOSCOVIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钅立流体 */
    DeferredBlock<LiquidBlock> LIQUID_LIVERMORIUM = register("liquid_livermorium", ECFluids.LIQUID_LIVERMORIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 鿬流体 */
    DeferredBlock<LiquidBlock> LIQUID_TENNESSINE = register("liquid_tennessine", ECFluids.LIQUID_TENNESSINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 鿫流体 */
    DeferredBlock<LiquidBlock> LIQUID_OGANESSON = register("liquid_oganesson", ECFluids.LIQUID_OGANESSON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 鑨流体 */
    DeferredBlock<LiquidBlock> LIQUID_LONGIUM = register("liquid_longium", ECFluids.LIQUID_LONGIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镾流体 */
    DeferredBlock<LiquidBlock> LIQUID_MYSTERIUM = register("liquid_mysterium", ECFluids.LIQUID_MYSTERIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);

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
        return ECElementBlocks.BLOCK_REGISTER.register(name, () -> new LiquidBlock(fluid.get(), BlockBehaviour.Properties.of()
                .noLootTable().liquid().replaceable().noCollission().strength(hardness).friction(friction)
                .speedFactor(speedFactor).jumpFactor(jumpFactor).mapColor(mapColor).sound(SoundType.EMPTY)));
    }
}