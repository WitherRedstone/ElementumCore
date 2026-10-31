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
    DeferredBlock<LiquidBlock> HYDROGEN = register("hydrogen", ECFluids.HYDROGEN.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氦流体 */
    DeferredBlock<LiquidBlock> HELIUM = register("helium", ECFluids.HELIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锂流体 */
    DeferredBlock<LiquidBlock> LITHIUM = register("lithium", ECFluids.LITHIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铍流体 */
    DeferredBlock<LiquidBlock> BERYLLIUM = register("beryllium", ECFluids.BERYLLIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 硼流体 */
    DeferredBlock<LiquidBlock> BORON = register("boron", ECFluids.BORON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 碳流体 */
    DeferredBlock<LiquidBlock> CARBON = register("carbon", ECFluids.CARBON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氮流体 */
    DeferredBlock<LiquidBlock> NITROGEN = register("nitrogen", ECFluids.NITROGEN.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氧流体 */
    DeferredBlock<LiquidBlock> OXYGEN = register("oxygen", ECFluids.OXYGEN.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氟流体 */
    DeferredBlock<LiquidBlock> FLUORINE = register("fluorine", ECFluids.FLUORINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氖流体 */
    DeferredBlock<LiquidBlock> NEON = register("neon", ECFluids.NEON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钠流体 */
    DeferredBlock<LiquidBlock> SODIUM = register("sodium", ECFluids.SODIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镁流体 */
    DeferredBlock<LiquidBlock> MAGNESIUM = register("magnesium", ECFluids.MAGNESIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铝流体 */
    DeferredBlock<LiquidBlock> ALUMINUM = register("aluminum", ECFluids.ALUMINUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 硅流体 */
    DeferredBlock<LiquidBlock> SILICON = register("silicon", ECFluids.SILICON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 磷流体 */
    DeferredBlock<LiquidBlock> PHOSPHORUS = register("phosphorus", ECFluids.PHOSPHORUS.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 硫流体 */
    DeferredBlock<LiquidBlock> SULFUR = register("sulfur", ECFluids.SULFUR.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氯流体 */
    DeferredBlock<LiquidBlock> CHLORINE = register("chlorine", ECFluids.CHLORINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氩流体 */
    DeferredBlock<LiquidBlock> ARGON = register("argon", ECFluids.ARGON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钾流体 */
    DeferredBlock<LiquidBlock> POTASSIUM = register("potassium", ECFluids.POTASSIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钙流体 */
    DeferredBlock<LiquidBlock> CALCIUM = register("calcium", ECFluids.CALCIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钪流体 */
    DeferredBlock<LiquidBlock> SCANDIUM = register("scandium", ECFluids.SCANDIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钛流体 */
    DeferredBlock<LiquidBlock> TITANIUM = register("titanium", ECFluids.TITANIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钒流体 */
    DeferredBlock<LiquidBlock> VANADIUM = register("vanadium", ECFluids.VANADIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铬流体 */
    DeferredBlock<LiquidBlock> CHROMIUM = register("chromium", ECFluids.CHROMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锰流体 */
    DeferredBlock<LiquidBlock> MANGANESE = register("manganese", ECFluids.MANGANESE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铁流体 */
    DeferredBlock<LiquidBlock> IRON = register("iron", ECFluids.IRON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钴流体 */
    DeferredBlock<LiquidBlock> COBALT = register("cobalt", ECFluids.COBALT.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镍流体 */
    DeferredBlock<LiquidBlock> NICKEL = register("nickel", ECFluids.NICKEL.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铜流体 */
    DeferredBlock<LiquidBlock> COPPER = register("copper", ECFluids.COPPER.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锌流体 */
    DeferredBlock<LiquidBlock> ZINC = register("zinc", ECFluids.ZINC.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镓流体 */
    DeferredBlock<LiquidBlock> GALLIUM = register("gallium", ECFluids.GALLIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锗流体 */
    DeferredBlock<LiquidBlock> GERMANIUM = register("germanium", ECFluids.GERMANIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 砷流体 */
    DeferredBlock<LiquidBlock> ARSENIC = register("arsenic", ECFluids.ARSENIC.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 硒流体 */
    DeferredBlock<LiquidBlock> SELENIUM = register("selenium", ECFluids.SELENIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 溴流体 */
    DeferredBlock<LiquidBlock> BROMINE = register("bromine", ECFluids.BROMINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氪流体 */
    DeferredBlock<LiquidBlock> KRYPTON = register("krypton", ECFluids.KRYPTON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铷流体 */
    DeferredBlock<LiquidBlock> RUBIDIUM = register("rubidium", ECFluids.RUBIDIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锶流体 */
    DeferredBlock<LiquidBlock> STRONTIUM = register("strontium", ECFluids.STRONTIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钇流体 */
    DeferredBlock<LiquidBlock> YTTRIUM = register("yttrium", ECFluids.YTTRIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锆流体 */
    DeferredBlock<LiquidBlock> ZIRCONIUM = register("zirconium", ECFluids.ZIRCONIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铌流体 */
    DeferredBlock<LiquidBlock> NIOBIUM = register("niobium", ECFluids.NIOBIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钼流体 */
    DeferredBlock<LiquidBlock> MOLYBDENUM = register("molybdenum", ECFluids.MOLYBDENUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锝流体 */
    DeferredBlock<LiquidBlock> TECHNETIUM = register("technetium", ECFluids.TECHNETIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钌流体 */
    DeferredBlock<LiquidBlock> RUTHENIUM = register("ruthenium", ECFluids.RUTHENIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铑流体 */
    DeferredBlock<LiquidBlock> RHODIUM = register("rhodium", ECFluids.RHODIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钯流体 */
    DeferredBlock<LiquidBlock> PALLADIUM = register("palladium", ECFluids.PALLADIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 银流体 */
    DeferredBlock<LiquidBlock> SILVER = register("silver", ECFluids.SILVER.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镉流体 */
    DeferredBlock<LiquidBlock> CADMIUM = register("cadmium", ECFluids.CADMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铟流体 */
    DeferredBlock<LiquidBlock> INDIUM = register("indium", ECFluids.INDIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锡流体 */
    DeferredBlock<LiquidBlock> TIN = register("tin", ECFluids.TIN.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锑流体 */
    DeferredBlock<LiquidBlock> ANTIMONY = register("antimony", ECFluids.ANTIMONY.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 碲流体 */
    DeferredBlock<LiquidBlock> TELLURIUM = register("tellurium", ECFluids.TELLURIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 碘流体 */
    DeferredBlock<LiquidBlock> IODINE = register("iodine", ECFluids.IODINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氙流体 */
    DeferredBlock<LiquidBlock> XENON = register("xenon", ECFluids.XENON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铯流体 */
    DeferredBlock<LiquidBlock> CESIUM = register("cesium", ECFluids.CESIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钡流体 */
    DeferredBlock<LiquidBlock> BARIUM = register("barium", ECFluids.BARIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镧流体 */
    DeferredBlock<LiquidBlock> LANTHANUM = register("lanthanum", ECFluids.LANTHANUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铈流体 */
    DeferredBlock<LiquidBlock> CERIUM = register("cerium", ECFluids.CERIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镨流体 */
    DeferredBlock<LiquidBlock> PRASEODYMIUM = register("praseodymium", ECFluids.PRASEODYMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钕流体 */
    DeferredBlock<LiquidBlock> NEODYMIUM = register("neodymium", ECFluids.NEODYMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钷流体 */
    DeferredBlock<LiquidBlock> PROMETHIUM = register("promethium", ECFluids.PROMETHIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钐流体 */
    DeferredBlock<LiquidBlock> SAMARIUM = register("samarium", ECFluids.SAMARIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铕流体 */
    DeferredBlock<LiquidBlock> EUROPIUM = register("europium", ECFluids.EUROPIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钆流体 */
    DeferredBlock<LiquidBlock> GADOLINIUM = register("gadolinium", ECFluids.GADOLINIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铽流体 */
    DeferredBlock<LiquidBlock> TERBIUM = register("terbium", ECFluids.TERBIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镝流体 */
    DeferredBlock<LiquidBlock> DYSPROSIUM = register("dysprosium", ECFluids.DYSPROSIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钬流体 */
    DeferredBlock<LiquidBlock> HOLMIUM = register("holmium", ECFluids.HOLMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铒流体 */
    DeferredBlock<LiquidBlock> ERBIUM = register("erbium", ECFluids.ERBIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铥流体 */
    DeferredBlock<LiquidBlock> THULIUM = register("thulium", ECFluids.THULIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镱流体 */
    DeferredBlock<LiquidBlock> YTTERBIUM = register("ytterbium", ECFluids.YTTERBIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镥流体 */
    DeferredBlock<LiquidBlock> LUTETIUM = register("lutetium", ECFluids.LUTETIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铪流体 */
    DeferredBlock<LiquidBlock> HAFNIUM = register("hafnium", ECFluids.HAFNIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钽流体 */
    DeferredBlock<LiquidBlock> TANTALUM = register("tantalum", ECFluids.TANTALUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钨流体 */
    DeferredBlock<LiquidBlock> TUNGSTEN = register("tungsten", ECFluids.TUNGSTEN.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铼流体 */
    DeferredBlock<LiquidBlock> RHENIUM = register("rhenium", ECFluids.RHENIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锇流体 */
    DeferredBlock<LiquidBlock> OSMIUM = register("osmium", ECFluids.OSMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铱流体 */
    DeferredBlock<LiquidBlock> IRIDIUM = register("iridium", ECFluids.IRIDIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铂流体 */
    DeferredBlock<LiquidBlock> PLATINUM = register("platinum", ECFluids.PLATINUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 金流体 */
    DeferredBlock<LiquidBlock> GOLD = register("gold", ECFluids.GOLD.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 汞流体 */
    DeferredBlock<LiquidBlock> MERCURY = register("mercury", ECFluids.MERCURY.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铊流体 */
    DeferredBlock<LiquidBlock> THALLIUM = register("thallium", ECFluids.THALLIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铅流体 */
    DeferredBlock<LiquidBlock> LEAD = register("lead", ECFluids.LEAD.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铋流体 */
    DeferredBlock<LiquidBlock> BISMUTH = register("bismuth", ECFluids.BISMUTH.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钋流体 */
    DeferredBlock<LiquidBlock> POLONIUM = register("polonium", ECFluids.POLONIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 砹流体 */
    DeferredBlock<LiquidBlock> ASTATINE = register("astatine", ECFluids.ASTATINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 氡流体 */
    DeferredBlock<LiquidBlock> RADON = register("radon", ECFluids.RADON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钫流体 */
    DeferredBlock<LiquidBlock> FRANCIUM = register("francium", ECFluids.FRANCIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镭流体 */
    DeferredBlock<LiquidBlock> RADIUM = register("radium", ECFluids.RADIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锕流体 */
    DeferredBlock<LiquidBlock> ACTINIUM = register("actinium", ECFluids.ACTINIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钍流体 */
    DeferredBlock<LiquidBlock> THORIUM = register("thorium", ECFluids.THORIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镤流体 */
    DeferredBlock<LiquidBlock> PROTACTINIUM = register("protactinium", ECFluids.PROTACTINIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铀流体 */
    DeferredBlock<LiquidBlock> URANIUM = register("uranium", ECFluids.URANIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镎流体 */
    DeferredBlock<LiquidBlock> NEPTUNIUM = register("neptunium", ECFluids.NEPTUNIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钚流体 */
    DeferredBlock<LiquidBlock> PLUTONIUM = register("plutonium", ECFluids.PLUTONIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镅流体 */
    DeferredBlock<LiquidBlock> AMERICIUM = register("americium", ECFluids.AMERICIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锔流体 */
    DeferredBlock<LiquidBlock> CURIUM = register("curium", ECFluids.CURIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锫流体 */
    DeferredBlock<LiquidBlock> BERKELIUM = register("berkelium", ECFluids.BERKELIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锎流体 */
    DeferredBlock<LiquidBlock> CALIFORNIUM = register("californium", ECFluids.CALIFORNIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锿流体 */
    DeferredBlock<LiquidBlock> EINSTEINIUM = register("einsteinium", ECFluids.EINSTEINIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镄流体 */
    DeferredBlock<LiquidBlock> FERMIUM = register("fermium", ECFluids.FERMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钔流体 */
    DeferredBlock<LiquidBlock> MENDELEVIUM = register("mendelevium", ECFluids.MENDELEVIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 锘流体 */
    DeferredBlock<LiquidBlock> NOBELIUM = register("nobelium", ECFluids.NOBELIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 铹流体 */
    DeferredBlock<LiquidBlock> LAWRENCIUM = register("lawrencium", ECFluids.LAWRENCIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 𬬻流体 */
    DeferredBlock<LiquidBlock> RUTHERFORDIUM = register("rutherfordium", ECFluids.RUTHERFORDIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 𬭊流体 */
    DeferredBlock<LiquidBlock> DUBNIUM = register("dubnium", ECFluids.DUBNIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 𬭳流体 */
    DeferredBlock<LiquidBlock> SEABORGIUM = register("seaborgium", ECFluids.SEABORGIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 𬭛流体 */
    DeferredBlock<LiquidBlock> BOHRIUM = register("bohrium", ECFluids.BOHRIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 𬭶流体 */
    DeferredBlock<LiquidBlock> HASSIUM = register("hassium", ECFluids.HASSIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 鿏流体 */
    DeferredBlock<LiquidBlock> MEITNERIUM = register("meitnerium", ECFluids.MEITNERIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 𫟼流体 */
    DeferredBlock<LiquidBlock> DARMSTADTIUM = register("darmstadtium", ECFluids.DARMSTADTIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 𬬭流体 */
    DeferredBlock<LiquidBlock> ROENTGENIUM = register("roentgenium", ECFluids.ROENTGENIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 鿔流体 */
    DeferredBlock<LiquidBlock> COPERNICIUM = register("copernicium", ECFluids.COPERNICIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 鉨流体 */
    DeferredBlock<LiquidBlock> NIHONIUM = register("nihonium", ECFluids.NIHONIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 鉨流体 */
    DeferredBlock<LiquidBlock> FLEROVIUM = register("flerovium", ECFluids.FLEROVIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钅莫流体 */
    DeferredBlock<LiquidBlock> MOSCOVIUM = register("moscovium", ECFluids.MOSCOVIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 钅立流体 */
    DeferredBlock<LiquidBlock> LIVERMORIUM = register("livermorium", ECFluids.LIVERMORIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 鿬流体 */
    DeferredBlock<LiquidBlock> TENNESSINE = register("tennessine", ECFluids.TENNESSINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 鿫流体 */
    DeferredBlock<LiquidBlock> OGANESSON = register("oganesson", ECFluids.OGANESSON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 鑨流体 */
    DeferredBlock<LiquidBlock> LONGIUM = register("longium", ECFluids.LONGIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    /** 镾流体 */
    DeferredBlock<LiquidBlock> MYSTERIUM = register("mysterium", ECFluids.MYSTERIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);

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