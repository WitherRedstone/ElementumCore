package com.chinaex123.elementum_core.init.blocks;

import com.chinaex123.elementum_core.ElementumCore;
import com.chinaex123.elementum_core.init.fluids.ECFluids;
import com.chinaex123.elementum_core.init.items.ECMaterialItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ECElementBlocks {
    public static final DeferredRegister.Blocks BLOCK_REGISTER = DeferredRegister.createBlocks(ElementumCore.MODID);

    // ==================== 120个元素，对应矿块/粗矿块/矿石/深层矿石/下界矿石/末地矿石 ====================
    /** 氢 */
    public static final OreBlocks HYDROGEN = new OreBlocks("hydrogen", 2.4F, 6.0F, Rarity.EPIC);
    /** 氦 */
    public static final OreBlocks HELIUM = new OreBlocks("helium", 2.4F, 6.0F, Rarity.EPIC);
    /** 锂 */
    public static final OreBlocks LITHIUM = new OreBlocks("lithium", 2.4F, 6.0F, Rarity.EPIC);
    /** 铍 */
    public static final OreBlocks BERYLLIUM = new OreBlocks("beryllium", 2.4F, 6.0F, Rarity.EPIC);
    /** 硼 */
    public static final OreBlocks BORON = new OreBlocks("boron", 2.4F, 6.0F, Rarity.EPIC);
    /** 碳 */
    public static final OreBlocks CARBON = new OreBlocks("carbon", 2.4F, 6.0F, Rarity.EPIC);
    /** 氮 */
    public static final OreBlocks NITROGEN = new OreBlocks("nitrogen", 2.4F, 6.0F, Rarity.EPIC);
    /** 氧 */
    public static final OreBlocks OXYGEN = new OreBlocks("oxygen", 2.4F, 6.0F, Rarity.EPIC);
    /** 氟 */
    public static final OreBlocks FLUORINE = new OreBlocks("fluorine", 2.4F, 6.0F, Rarity.EPIC);
    /** 氖 */
    public static final OreBlocks NEON = new OreBlocks("neon", 2.4F, 6.0F, Rarity.EPIC);
    /** 钠 */
    public static final OreBlocks SODIUM = new OreBlocks("sodium", 2.4F, 6.0F, Rarity.EPIC);
    /** 镁 */
    public static final OreBlocks MAGNESIUM = new OreBlocks("magnesium", 2.4F, 6.0F, Rarity.EPIC);
    /** 铝 */
    public static final OreBlocks ALUMINUM = new OreBlocks("aluminum", 2.4F, 6.0F, Rarity.EPIC);
    /** 硅 */
    public static final OreBlocks SILICON = new OreBlocks("silicon", 2.4F, 6.0F, Rarity.EPIC);
    /** 磷 */
    public static final OreBlocks PHOSPHORUS = new OreBlocks("phosphorus", 2.4F, 6.0F, Rarity.EPIC);
    /** 硫 */
    public static final OreBlocks SULFUR = new OreBlocks("sulfur", 2.4F, 6.0F, Rarity.EPIC);
    /** 氯 */
    public static final OreBlocks CHLORINE = new OreBlocks("chlorine", 2.4F, 6.0F, Rarity.EPIC);
    /** 氩 */
    public static final OreBlocks ARGON = new OreBlocks("argon", 2.4F, 6.0F, Rarity.EPIC);
    /** 钾 */
    public static final OreBlocks POTASSIUM = new OreBlocks("potassium", 2.4F, 6.0F, Rarity.EPIC);
    /** 钙 */
    public static final OreBlocks CALCIUM = new OreBlocks("calcium", 2.4F, 6.0F, Rarity.EPIC);
    /** 钪 */
    public static final OreBlocks SCANDIUM = new OreBlocks("scandium", 2.4F, 6.0F, Rarity.EPIC);
    /** 钛 */
    public static final OreBlocks TITANIUM = new OreBlocks("titanium", 2.4F, 6.0F, Rarity.EPIC);
    /** 钒 */
    public static final OreBlocks VANADIUM = new OreBlocks("vanadium", 2.4F, 6.0F, Rarity.EPIC);
    /** 铬 */
    public static final OreBlocks CHROMIUM = new OreBlocks("chromium", 2.4F, 6.0F, Rarity.EPIC);
    /** 锰 */
    public static final OreBlocks MANGANESE = new OreBlocks("manganese", 2.4F, 6.0F, Rarity.EPIC);
    /** 铁 */
    public static final OreBlocks IRON = new OreBlocks("iron", 2.4F, 6.0F, Rarity.EPIC);
    /** 钴 */
    public static final OreBlocks COBALT = new OreBlocks("cobalt", 2.4F, 6.0F, Rarity.EPIC);
    /** 镍 */
    public static final OreBlocks NICKEL = new OreBlocks("nickel", 2.4F, 6.0F, Rarity.EPIC);
    /** 铜 */
    public static final OreBlocks COPPER = new OreBlocks("copper", 2.4F, 6.0F, Rarity.EPIC);
    /** 锌 */
    public static final OreBlocks ZINC = new OreBlocks("zinc", 2.4F, 6.0F, Rarity.EPIC);
    /** 镓 */
    public static final OreBlocks GALLIUM = new OreBlocks("gallium", 2.4F, 6.0F, Rarity.EPIC);
    /** 锗 */
    public static final OreBlocks GERMANIUM = new OreBlocks("germanium", 2.4F, 6.0F, Rarity.EPIC);
    /** 砷 */
    public static final OreBlocks ARSENIC = new OreBlocks("arsenic", 2.4F, 6.0F, Rarity.EPIC);
    /** 硒 */
    public static final OreBlocks SELENIUM = new OreBlocks("selenium", 2.4F, 6.0F, Rarity.EPIC);
    /** 溴 */
    public static final OreBlocks BROMINE = new OreBlocks("bromine", 2.4F, 6.0F, Rarity.EPIC);
    /** 氪 */
    public static final OreBlocks KRYPTON = new OreBlocks("krypton", 2.4F, 6.0F, Rarity.EPIC);
    /** 铷 */
    public static final OreBlocks RUBIDIUM = new OreBlocks("rubidium", 2.4F, 6.0F, Rarity.EPIC);
    /** 锶 */
    public static final OreBlocks STRONTIUM = new OreBlocks("strontium", 2.4F, 6.0F, Rarity.EPIC);
    /** 钇 */
    public static final OreBlocks YTTRIUM = new OreBlocks("yttrium", 2.4F, 6.0F, Rarity.EPIC);
    /** 锆 */
    public static final OreBlocks ZIRCONIUM = new OreBlocks("zirconium", 2.4F, 6.0F, Rarity.EPIC);
    /** 铌 */
    public static final OreBlocks NIOBIUM = new OreBlocks("niobium", 2.4F, 6.0F, Rarity.EPIC);
    /** 钼 */
    public static final OreBlocks MOLYBDENUM = new OreBlocks("molybdenum", 2.4F, 6.0F, Rarity.EPIC);
    /** 锝 */
    public static final OreBlocks TECHNETIUM = new OreBlocks("technetium", 2.4F, 6.0F, Rarity.EPIC);
    /** 钌 */
    public static final OreBlocks RUTHENIUM = new OreBlocks("ruthenium", 2.4F, 6.0F, Rarity.EPIC);
    /** 铑 */
    public static final OreBlocks RHODIUM = new OreBlocks("rhodium", 2.4F, 6.0F, Rarity.EPIC);
    /** 钯 */
    public static final OreBlocks PALLADIUM = new OreBlocks("palladium", 2.4F, 6.0F, Rarity.EPIC);
    /** 银 */
    public static final OreBlocks SILVER = new OreBlocks("silver", 2.4F, 6.0F, Rarity.EPIC);
    /** 镉 */
    public static final OreBlocks CADMIUM = new OreBlocks("cadmium", 2.4F, 6.0F, Rarity.EPIC);
    /** 铟 */
    public static final OreBlocks INDIUM = new OreBlocks("indium", 2.4F, 6.0F, Rarity.EPIC);
    /** 锡 */
    public static final OreBlocks TIN = new OreBlocks("tin", 2.4F, 6.0F, Rarity.EPIC);
    /** 锑 */
    public static final OreBlocks ANTIMONY = new OreBlocks("antimony", 2.4F, 6.0F, Rarity.EPIC);
    /** 碲 */
    public static final OreBlocks TELLURIUM = new OreBlocks("tellurium", 2.4F, 6.0F, Rarity.EPIC);
    /** 碘 */
    public static final OreBlocks IODINE = new OreBlocks("iodine", 2.4F, 6.0F, Rarity.EPIC);
    /** 氙 */
    public static final OreBlocks XENON = new OreBlocks("xenon", 2.4F, 6.0F, Rarity.EPIC);
    /** 铯 */
    public static final OreBlocks CESIUM = new OreBlocks("cesium", 2.4F, 6.0F, Rarity.EPIC);
    /** 钡 */
    public static final OreBlocks BARIUM = new OreBlocks("barium", 2.4F, 6.0F, Rarity.EPIC);
    /** 镧 */
    public static final OreBlocks LANTHANUM = new OreBlocks("lanthanum", 2.4F, 6.0F, Rarity.EPIC);
    /** 铈 */
    public static final OreBlocks CERIUM = new OreBlocks("cerium", 2.4F, 6.0F, Rarity.EPIC);
    /** 镨 */
    public static final OreBlocks PRASEODYMIUM = new OreBlocks("praseodymium", 2.4F, 6.0F, Rarity.EPIC);
    /** 钕 */
    public static final OreBlocks NEODYMIUM = new OreBlocks("neodymium", 2.4F, 6.0F, Rarity.EPIC);
    /** 钷 */
    public static final OreBlocks PROMETHIUM = new OreBlocks("promethium", 2.4F, 6.0F, Rarity.EPIC);
    /** 钐 */
    public static final OreBlocks SAMARIUM = new OreBlocks("samarium", 2.4F, 6.0F, Rarity.EPIC);
    /** 铕 */
    public static final OreBlocks EUROPIUM = new OreBlocks("europium", 2.4F, 6.0F, Rarity.EPIC);
    /** 钆 */
    public static final OreBlocks GADOLINIUM = new OreBlocks("gadolinium", 2.4F, 6.0F, Rarity.EPIC);
    /** 铽 */
    public static final OreBlocks TERBIUM = new OreBlocks("terbium", 2.4F, 6.0F, Rarity.EPIC);
    /** 镝 */
    public static final OreBlocks DYSPROSIUM = new OreBlocks("dysprosium", 2.4F, 6.0F, Rarity.EPIC);
    /** 钬 */
    public static final OreBlocks HOLMIUM = new OreBlocks("holmium", 2.4F, 6.0F, Rarity.EPIC);
    /** 铒 */
    public static final OreBlocks ERBIUM = new OreBlocks("erbium", 2.4F, 6.0F, Rarity.EPIC);
    /** 铥 */
    public static final OreBlocks THULIUM = new OreBlocks("thulium", 2.4F, 6.0F, Rarity.EPIC);
    /** 镱 */
    public static final OreBlocks YTTERBIUM = new OreBlocks("ytterbium", 2.4F, 6.0F, Rarity.EPIC);
    /** 镥 */
    public static final OreBlocks LUTETIUM = new OreBlocks("lutetium", 2.4F, 6.0F, Rarity.EPIC);
    /** 铪 */
    public static final OreBlocks HAFNIUM = new OreBlocks("hafnium", 2.4F, 6.0F, Rarity.EPIC);
    /** 钽 */
    public static final OreBlocks TANTALUM = new OreBlocks("tantalum", 2.4F, 6.0F, Rarity.EPIC);
    /** 钨 */
    public static final OreBlocks TUNGSTEN = new OreBlocks("tungsten", 2.4F, 6.0F, Rarity.EPIC);
    /** 铼 */
    public static final OreBlocks RHENIUM = new OreBlocks("rhenium", 2.4F, 6.0F, Rarity.EPIC);
    /** 锇 */
    public static final OreBlocks OSMIUM = new OreBlocks("osmium", 2.4F, 6.0F, Rarity.EPIC);
    /** 铱 */
    public static final OreBlocks IRIDIUM = new OreBlocks("iridium", 2.4F, 6.0F, Rarity.EPIC);
    /** 铂 */
    public static final OreBlocks PLATINUM = new OreBlocks("platinum", 2.4F, 6.0F, Rarity.EPIC);
    /** 金 */
    public static final OreBlocks GOLD = new OreBlocks("gold", 2.4F, 6.0F, Rarity.EPIC);
    /** 汞 */
    public static final OreBlocks HYDRARGYRUM = new OreBlocks("hydrargyrum", 2.4F, 6.0F, Rarity.EPIC);
    /** 铊 */
    public static final OreBlocks THALLIUM = new OreBlocks("thallium", 2.4F, 6.0F, Rarity.EPIC);
    /** 铅 */
    public static final OreBlocks LEAD = new OreBlocks("lead", 2.4F, 6.0F, Rarity.EPIC);
    /** 铋 */
    public static final OreBlocks BISMUTH = new OreBlocks("bismuth", 2.4F, 6.0F, Rarity.EPIC);
    /** 钋 */
    public static final OreBlocks POLONIUM = new OreBlocks("polonium", 2.4F, 6.0F, Rarity.EPIC);
    /** 砹 */
    public static final OreBlocks ASTATINE = new OreBlocks("astatine", 2.4F, 6.0F, Rarity.EPIC);
    /** 氡 */
    public static final OreBlocks RADON = new OreBlocks("radon", 2.4F, 6.0F, Rarity.EPIC);
    /** 钫 */
    public static final OreBlocks FRANCIUM = new OreBlocks("francium", 2.4F, 6.0F, Rarity.EPIC);
    /** 镭 */
    public static final OreBlocks RADIUM = new OreBlocks("radium", 2.4F, 6.0F, Rarity.EPIC);
    /** 锕 */
    public static final OreBlocks ACTINIUM = new OreBlocks("actinium", 2.4F, 6.0F, Rarity.EPIC);
    /** 钍 */
    public static final OreBlocks THORIUM = new OreBlocks("thorium", 2.4F, 6.0F, Rarity.EPIC);
    /** 镤 */
    public static final OreBlocks PROTACTINIUM = new OreBlocks("protactinium", 2.4F, 6.0F, Rarity.EPIC);
    /** 铀 */
    public static final OreBlocks URANIUM = new OreBlocks("uranium", 2.4F, 6.0F, Rarity.EPIC);
    /** 镎 */
    public static final OreBlocks NEPTUNIUM = new OreBlocks("neptunium", 2.4F, 6.0F, Rarity.EPIC);
    /** 钚 */
    public static final OreBlocks PLUTONIUM = new OreBlocks("plutonium", 2.4F, 6.0F, Rarity.EPIC);
    /** 镅 */
    public static final OreBlocks AMERICIUM = new OreBlocks("americium", 2.4F, 6.0F, Rarity.EPIC);
    /** 锔 */
    public static final OreBlocks CURIUM = new OreBlocks("curium", 2.4F, 6.0F, Rarity.EPIC);
    /** 锫 */
    public static final OreBlocks BERKELIUM = new OreBlocks("berkelium", 2.4F, 6.0F, Rarity.EPIC);
    /** 锎 */
    public static final OreBlocks CALIFORNIUM = new OreBlocks("californium", 2.4F, 6.0F, Rarity.EPIC);
    /** 锿 */
    public static final OreBlocks EINSTEINIUM = new OreBlocks("einsteinium", 2.4F, 6.0F, Rarity.EPIC);
    /** 镄 */
    public static final OreBlocks FERMIUM = new OreBlocks("fermium", 2.4F, 6.0F, Rarity.EPIC);
    /** 钔 */
    public static final OreBlocks MENDELEVIUM = new OreBlocks("mendelevium", 2.4F, 6.0F, Rarity.EPIC);
    /** 锘 */
    public static final OreBlocks NOBELIUM = new OreBlocks("nobelium", 2.4F, 6.0F, Rarity.EPIC);
    /** 铹 */
    public static final OreBlocks LAWRENCIUM = new OreBlocks("lawrencium", 2.4F, 6.0F, Rarity.EPIC);
    /** 𬬻 */
    public static final OreBlocks RUTHERFORDIUM = new OreBlocks("rutherfordium", 2.4F, 6.0F, Rarity.EPIC);
    /** 𬭊 */
    public static final OreBlocks DUBNIUM = new OreBlocks("dubnium", 2.4F, 6.0F, Rarity.EPIC);
    /** 𬭳 */
    public static final OreBlocks SEABORGIUM = new OreBlocks("seaborgium", 2.4F, 6.0F, Rarity.EPIC);
    /** 𬭛 */
    public static final OreBlocks BOHRIUM = new OreBlocks("bohrium", 2.4F, 6.0F, Rarity.EPIC);
    /** 𬭶 */
    public static final OreBlocks HASSIUM = new OreBlocks("hassium", 2.4F, 6.0F, Rarity.EPIC);
    /** 鿏 */
    public static final OreBlocks MEITNERIUM = new OreBlocks("meitnerium", 2.4F, 6.0F, Rarity.EPIC);
    /** 𬭊 */
    public static final OreBlocks DARMSTADTIUM = new OreBlocks("darmstadtium", 2.4F, 6.0F, Rarity.EPIC);
    /** 𬬭 */
    public static final OreBlocks ROENTGENIUM = new OreBlocks("roentgenium", 2.4F, 6.0F, Rarity.EPIC);
    /** 鎶 */
    public static final OreBlocks COPERNICIUM = new OreBlocks("copernicium", 2.4F, 6.0F, Rarity.EPIC);
    /** 鿭 */
    public static final OreBlocks NIHONIUM = new OreBlocks("nihonium", 2.4F, 6.0F, Rarity.EPIC);
    /** 𫓧 */
    public static final OreBlocks FLEROVIUM = new OreBlocks("flerovium", 2.4F, 6.0F, Rarity.EPIC);
    /** 镆 */
    public static final OreBlocks MOSCOVIUM = new OreBlocks("moscovium", 2.4F, 6.0F, Rarity.EPIC);
    /** 𫟷 */
    public static final OreBlocks LIVERMORIUM = new OreBlocks("livermorium", 2.4F, 6.0F, Rarity.EPIC);
    /** 鿬 */
    public static final OreBlocks TENNESSINE = new OreBlocks("tennessine", 2.4F, 6.0F, Rarity.EPIC);
    /** 鿫 */
    public static final OreBlocks OGANESSON = new OreBlocks("oganesson", 2.4F, 6.0F, Rarity.EPIC);
    /** 鑨 */
    public static final OreBlocks LONGIUM = new OreBlocks("longium", 2.4F, 6.0F, Rarity.EPIC);
    /** 镾 */
    public static final OreBlocks MYSTERIUM = new OreBlocks("mysterium", 2.4F, 6.0F, Rarity.EPIC);

    // ==================== 24个特殊矿石，对应矿石/深层矿石/下界矿石/末地矿石 ====================
    /** 锂云母 */
    public static final SpecialOreBlocks LEPIDOLITE = new SpecialOreBlocks("lepidolite", 2.4F, 6.0F, Rarity.EPIC);
    /** 绿柱石 */
    public static final SpecialOreBlocks BERYL = new SpecialOreBlocks("beryl", 2.4F, 6.0F, Rarity.EPIC);
    /** 硼砂 */
    public static final SpecialOreBlocks BORAX = new SpecialOreBlocks("borax", 2.4F, 6.0F, Rarity.EPIC);
    /** 菱镁矿 */
    public static final SpecialOreBlocks MAGNESITE = new SpecialOreBlocks("magnesite", 2.4F, 6.0F, Rarity.EPIC);
    /** 硝石 */
    public static final SpecialOreBlocks NITRE = new SpecialOreBlocks("nitre", 2.4F, 6.0F, Rarity.EPIC);
    /** 磷灰石 */
    public static final SpecialOreBlocks APATITE = new SpecialOreBlocks("apatite", 2.4F, 6.0F, Rarity.EPIC);
    /** 独居石 */
    public static final SpecialOreBlocks MONAZITE = new SpecialOreBlocks("monazite", 2.4F, 6.0F, Rarity.EPIC);
    /** 朱砂 */
    public static final SpecialOreBlocks CINNABAR = new SpecialOreBlocks("cinnabar", 2.4F, 6.0F, Rarity.EPIC);
    /** 钾石盐 */
    public static final SpecialOreBlocks SYLVITE = new SpecialOreBlocks("sylvite", 2.4F, 6.0F, Rarity.EPIC);
    /** 钪钇石 */
    public static final SpecialOreBlocks THORTVEITITE = new SpecialOreBlocks("thortveitite", 2.4F, 6.0F, Rarity.EPIC);
    /** 钛铁矿 */
    public static final SpecialOreBlocks ILMENITE = new SpecialOreBlocks("ilmenite", 2.4F, 6.0F, Rarity.EPIC);
    /** 绿硫钒矿 */
    public static final SpecialOreBlocks PATRONITE = new SpecialOreBlocks("patronite", 2.4F, 6.0F, Rarity.EPIC);
    /** 铬铁矿 */
    public static final SpecialOreBlocks CHROMITE = new SpecialOreBlocks("chromite", 2.4F, 6.0F, Rarity.EPIC);
    /** 软锰矿 */
    public static final SpecialOreBlocks PYROLUSITE = new SpecialOreBlocks("pyrolusite", 2.4F, 6.0F, Rarity.EPIC);
    /** 硫锗矿 */
    public static final SpecialOreBlocks ARGYRODITE = new SpecialOreBlocks("argyrodite", 2.4F, 6.0F, Rarity.EPIC);
    /** 毒砂 */
    public static final SpecialOreBlocks ARSENOPYRITE = new SpecialOreBlocks("arsenopyrite", 2.4F, 6.0F, Rarity.EPIC);
    /** 光卤石 */
    public static final SpecialOreBlocks CARNALLITE = new SpecialOreBlocks("carnallite", 2.4F, 6.0F, Rarity.EPIC);
    /** 天青石 */
    public static final SpecialOreBlocks CELESTINE = new SpecialOreBlocks("celestine", 2.4F, 6.0F, Rarity.EPIC);
    /** 辉钴矿 */
    public static final SpecialOreBlocks COBALTITE = new SpecialOreBlocks("cobaltite", 2.4F, 6.0F, Rarity.EPIC);
    /** 锆英砂 */
    public static final SpecialOreBlocks ZIRCON = new SpecialOreBlocks("zircon", 2.4F, 6.0F, Rarity.EPIC);
    /** 铌铁矿 */
    public static final SpecialOreBlocks NIOBITE = new SpecialOreBlocks("niobite", 2.4F, 6.0F, Rarity.EPIC);
    /** 辉钼矿 */
    public static final SpecialOreBlocks MOLYBDENITE = new SpecialOreBlocks("molybdenite", 2.4F, 6.0F, Rarity.EPIC);
    /** 辉锑矿 */
    public static final SpecialOreBlocks STIBNITE = new SpecialOreBlocks("stibnite", 2.4F, 6.0F, Rarity.EPIC);
    /** 铯沸石 */
    public static final SpecialOreBlocks POLLUCITE = new SpecialOreBlocks("pollucite", 2.4F, 6.0F, Rarity.EPIC);
    /** 重晶石 */
    public static final SpecialOreBlocks BARITE = new SpecialOreBlocks("barite", 2.4F, 6.0F, Rarity.EPIC);
    /** 黄铁矿 */
    public static final SpecialOreBlocks PYRITE = new SpecialOreBlocks("pyrite", 2.4F, 6.0F, Rarity.EPIC);

    // ==================== 120个元素的流体方块 ====================
    public static final class FluidBlocks {
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
            return BLOCK_REGISTER.register(name, () -> new LiquidBlock(fluid.get(), BlockBehaviour.Properties.of()
                    .noLootTable().liquid().replaceable().noCollission().strength(hardness).friction(friction)
                    .speedFactor(speedFactor).jumpFactor(jumpFactor).mapColor(mapColor).sound(SoundType.EMPTY)));
        }

        /** 氢流体 */
        public static final DeferredBlock<LiquidBlock> HYDROGEN = register("hydrogen", ECFluids.HYDROGEN.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 氦流体 */
        public static final DeferredBlock<LiquidBlock> HELIUM = register("helium", ECFluids.HELIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 锂流体 */
        public static final DeferredBlock<LiquidBlock> LITHIUM = register("lithium", ECFluids.LITHIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铍流体 */
        public static final DeferredBlock<LiquidBlock> BERYLLIUM = register("beryllium", ECFluids.BERYLLIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 硼流体 */
        public static final DeferredBlock<LiquidBlock> BORON = register("boron", ECFluids.BORON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 碳流体 */
        public static final DeferredBlock<LiquidBlock> CARBON = register("carbon", ECFluids.CARBON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 氮流体 */
        public static final DeferredBlock<LiquidBlock> NITROGEN = register("nitrogen", ECFluids.NITROGEN.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 氧流体 */
        public static final DeferredBlock<LiquidBlock> OXYGEN = register("oxygen", ECFluids.OXYGEN.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 氟流体 */
        public static final DeferredBlock<LiquidBlock> FLUORINE = register("fluorine", ECFluids.FLUORINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 氖流体 */
        public static final DeferredBlock<LiquidBlock> NEON = register("neon", ECFluids.NEON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钠流体 */
        public static final DeferredBlock<LiquidBlock> SODIUM = register("sodium", ECFluids.SODIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 镁流体 */
        public static final DeferredBlock<LiquidBlock> MAGNESIUM = register("magnesium", ECFluids.MAGNESIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铝流体 */
        public static final DeferredBlock<LiquidBlock> ALUMINUM = register("aluminum", ECFluids.ALUMINUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 硅流体 */
        public static final DeferredBlock<LiquidBlock> SILICON = register("silicon", ECFluids.SILICON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 磷流体 */
        public static final DeferredBlock<LiquidBlock> PHOSPHORUS = register("phosphorus", ECFluids.PHOSPHORUS.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 硫流体 */
        public static final DeferredBlock<LiquidBlock> SULFUR = register("sulfur", ECFluids.SULFUR.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 氯流体 */
        public static final DeferredBlock<LiquidBlock> CHLORINE = register("chlorine", ECFluids.CHLORINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 氩流体 */
        public static final DeferredBlock<LiquidBlock> ARGON = register("argon", ECFluids.ARGON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钾流体 */
        public static final DeferredBlock<LiquidBlock> POTASSIUM = register("potassium", ECFluids.POTASSIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钙流体 */
        public static final DeferredBlock<LiquidBlock> CALCIUM = register("calcium", ECFluids.CALCIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钪流体 */
        public static final DeferredBlock<LiquidBlock> SCANDIUM = register("scandium", ECFluids.SCANDIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钛流体 */
        public static final DeferredBlock<LiquidBlock> TITANIUM = register("titanium", ECFluids.TITANIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钒流体 */
        public static final DeferredBlock<LiquidBlock> VANADIUM = register("vanadium", ECFluids.VANADIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铬流体 */
        public static final DeferredBlock<LiquidBlock> CHROMIUM = register("chromium", ECFluids.CHROMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 锰流体 */
        public static final DeferredBlock<LiquidBlock> MANGANESE = register("manganese", ECFluids.MANGANESE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铁流体 */
        public static final DeferredBlock<LiquidBlock> IRON = register("iron", ECFluids.IRON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钴流体 */
        public static final DeferredBlock<LiquidBlock> COBALT = register("cobalt", ECFluids.COBALT.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 镍流体 */
        public static final DeferredBlock<LiquidBlock> NICKEL = register("nickel", ECFluids.NICKEL.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铜流体 */
        public static final DeferredBlock<LiquidBlock> COPPER = register("copper", ECFluids.COPPER.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 锌流体 */
        public static final DeferredBlock<LiquidBlock> ZINC = register("zinc", ECFluids.ZINC.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 镓流体 */
        public static final DeferredBlock<LiquidBlock> GALLIUM = register("gallium", ECFluids.GALLIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 锗流体 */
        public static final DeferredBlock<LiquidBlock> GERMANIUM = register("germanium", ECFluids.GERMANIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 砷流体 */
        public static final DeferredBlock<LiquidBlock> ARSENIC = register("arsenic", ECFluids.ARSENIC.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 硒流体 */
        public static final DeferredBlock<LiquidBlock> SELENIUM = register("selenium", ECFluids.SELENIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 溴流体 */
        public static final DeferredBlock<LiquidBlock> BROMINE = register("bromine", ECFluids.BROMINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 氪流体 */
        public static final DeferredBlock<LiquidBlock> KRYPTON = register("krypton", ECFluids.KRYPTON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铷流体 */
        public static final DeferredBlock<LiquidBlock> RUBIDIUM = register("rubidium", ECFluids.RUBIDIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 锶流体 */
        public static final DeferredBlock<LiquidBlock> STRONTIUM = register("strontium", ECFluids.STRONTIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钇流体 */
        public static final DeferredBlock<LiquidBlock> YTTRIUM = register("yttrium", ECFluids.YTTRIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 锆流体 */
        public static final DeferredBlock<LiquidBlock> ZIRCONIUM = register("zirconium", ECFluids.ZIRCONIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铌流体 */
        public static final DeferredBlock<LiquidBlock> NIOBIUM = register("niobium", ECFluids.NIOBIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钼流体 */
        public static final DeferredBlock<LiquidBlock> MOLYBDENUM = register("molybdenum", ECFluids.MOLYBDENUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 锝流体 */
        public static final DeferredBlock<LiquidBlock> TECHNETIUM = register("technetium", ECFluids.TECHNETIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钌流体 */
        public static final DeferredBlock<LiquidBlock> RUTHENIUM = register("ruthenium", ECFluids.RUTHENIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铑流体 */
        public static final DeferredBlock<LiquidBlock> RHODIUM = register("rhodium", ECFluids.RHODIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钯流体 */
        public static final DeferredBlock<LiquidBlock> PALLADIUM = register("palladium", ECFluids.PALLADIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 银流体 */
        public static final DeferredBlock<LiquidBlock> SILVER = register("silver", ECFluids.SILVER.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 镉流体 */
        public static final DeferredBlock<LiquidBlock> CADMIUM = register("cadmium", ECFluids.CADMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铟流体 */
        public static final DeferredBlock<LiquidBlock> INDIUM = register("indium", ECFluids.INDIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 锡流体 */
        public static final DeferredBlock<LiquidBlock> TIN = register("tin", ECFluids.TIN.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 锑流体 */
        public static final DeferredBlock<LiquidBlock> ANTIMONY = register("antimony", ECFluids.ANTIMONY.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 碲流体 */
        public static final DeferredBlock<LiquidBlock> TELLURIUM = register("tellurium", ECFluids.TELLURIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 碘流体 */
        public static final DeferredBlock<LiquidBlock> IODINE = register("iodine", ECFluids.IODINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 氙流体 */
        public static final DeferredBlock<LiquidBlock> XENON = register("xenon", ECFluids.XENON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铯流体 */
        public static final DeferredBlock<LiquidBlock> CESIUM = register("cesium", ECFluids.CESIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钡流体 */
        public static final DeferredBlock<LiquidBlock> BARIUM = register("barium", ECFluids.BARIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 镧流体 */
        public static final DeferredBlock<LiquidBlock> LANTHANUM = register("lanthanum", ECFluids.LANTHANUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铈流体 */
        public static final DeferredBlock<LiquidBlock> CERIUM = register("cerium", ECFluids.CERIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 镨流体 */
        public static final DeferredBlock<LiquidBlock> PRASEODYMIUM = register("praseodymium", ECFluids.PRASEODYMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钕流体 */
        public static final DeferredBlock<LiquidBlock> NEODYMIUM = register("neodymium", ECFluids.NEODYMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钷流体 */
        public static final DeferredBlock<LiquidBlock> PROMETHIUM = register("promethium", ECFluids.PROMETHIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钐流体 */
        public static final DeferredBlock<LiquidBlock> SAMARIUM = register("samarium", ECFluids.SAMARIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铕流体 */
        public static final DeferredBlock<LiquidBlock> EUROPIUM = register("europium", ECFluids.EUROPIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钆流体 */
        public static final DeferredBlock<LiquidBlock> GADOLINIUM = register("gadolinium", ECFluids.GADOLINIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铽流体 */
        public static final DeferredBlock<LiquidBlock> TERBIUM = register("terbium", ECFluids.TERBIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 镝流体 */
        public static final DeferredBlock<LiquidBlock> DYSPROSIUM = register("dysprosium", ECFluids.DYSPROSIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钬流体 */
        public static final DeferredBlock<LiquidBlock> HOLMIUM = register("holmium", ECFluids.HOLMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铒流体 */
        public static final DeferredBlock<LiquidBlock> ERBIUM = register("erbium", ECFluids.ERBIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铥流体 */
        public static final DeferredBlock<LiquidBlock> THULIUM = register("thulium", ECFluids.THULIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 镱流体 */
        public static final DeferredBlock<LiquidBlock> YTTERBIUM = register("ytterbium", ECFluids.YTTERBIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 镥流体 */
        public static final DeferredBlock<LiquidBlock> LUTETIUM = register("lutetium", ECFluids.LUTETIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铪流体 */
        public static final DeferredBlock<LiquidBlock> HAFNIUM = register("hafnium", ECFluids.HAFNIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钽流体 */
        public static final DeferredBlock<LiquidBlock> TANTALUM = register("tantalum", ECFluids.TANTALUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钨流体 */
        public static final DeferredBlock<LiquidBlock> TUNGSTEN = register("tungsten", ECFluids.TUNGSTEN.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铼流体 */
        public static final DeferredBlock<LiquidBlock> RHENIUM = register("rhenium", ECFluids.RHENIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 锇流体 */
        public static final DeferredBlock<LiquidBlock> OSMIUM = register("osmium", ECFluids.OSMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铱流体 */
        public static final DeferredBlock<LiquidBlock> IRIDIUM = register("iridium", ECFluids.IRIDIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铂流体 */
        public static final DeferredBlock<LiquidBlock> PLATINUM = register("platinum", ECFluids.PLATINUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 金流体 */
        public static final DeferredBlock<LiquidBlock> GOLD = register("gold", ECFluids.GOLD.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 汞流体 */
        public static final DeferredBlock<LiquidBlock> HYDRARGYRUM = register("hydrargyrum", ECFluids.HYDRARGYRUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铊流体 */
        public static final DeferredBlock<LiquidBlock> THALLIUM = register("thallium", ECFluids.THALLIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铅流体 */
        public static final DeferredBlock<LiquidBlock> LEAD = register("lead", ECFluids.LEAD.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铋流体 */
        public static final DeferredBlock<LiquidBlock> BISMUTH = register("bismuth", ECFluids.BISMUTH.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钋流体 */
        public static final DeferredBlock<LiquidBlock> POLONIUM = register("polonium", ECFluids.POLONIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 砹流体 */
        public static final DeferredBlock<LiquidBlock> ASTATINE = register("astatine", ECFluids.ASTATINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 氡流体 */
        public static final DeferredBlock<LiquidBlock> RADON = register("radon", ECFluids.RADON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钫流体 */
        public static final DeferredBlock<LiquidBlock> FRANCIUM = register("francium", ECFluids.FRANCIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 镭流体 */
        public static final DeferredBlock<LiquidBlock> RADIUM = register("radium", ECFluids.RADIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 锕流体 */
        public static final DeferredBlock<LiquidBlock> ACTINIUM = register("actinium", ECFluids.ACTINIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钍流体 */
        public static final DeferredBlock<LiquidBlock> THORIUM = register("thorium", ECFluids.THORIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 镤流体 */
        public static final DeferredBlock<LiquidBlock> PROTACTINIUM = register("protactinium", ECFluids.PROTACTINIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铀流体 */
        public static final DeferredBlock<LiquidBlock> URANIUM = register("uranium", ECFluids.URANIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 镎流体 */
        public static final DeferredBlock<LiquidBlock> NEPTUNIUM = register("neptunium", ECFluids.NEPTUNIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钚流体 */
        public static final DeferredBlock<LiquidBlock> PLUTONIUM = register("plutonium", ECFluids.PLUTONIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 镅流体 */
        public static final DeferredBlock<LiquidBlock> AMERICIUM = register("americium", ECFluids.AMERICIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 锔流体 */
        public static final DeferredBlock<LiquidBlock> CURIUM = register("curium", ECFluids.CURIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 锫流体 */
        public static final DeferredBlock<LiquidBlock> BERKELIUM = register("berkelium", ECFluids.BERKELIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 锎流体 */
        public static final DeferredBlock<LiquidBlock> CALIFORNIUM = register("californium", ECFluids.CALIFORNIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 锿流体 */
        public static final DeferredBlock<LiquidBlock> EINSTEINIUM = register("einsteinium", ECFluids.EINSTEINIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 镄流体 */
        public static final DeferredBlock<LiquidBlock> FERMIUM = register("fermium", ECFluids.FERMIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 钔流体 */
        public static final DeferredBlock<LiquidBlock> MENDELEVIUM = register("mendelevium", ECFluids.MENDELEVIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 锘流体 */
        public static final DeferredBlock<LiquidBlock> NOBELIUM = register("nobelium", ECFluids.NOBELIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 铹流体 */
        public static final DeferredBlock<LiquidBlock> LAWRENCIUM = register("lawrencium", ECFluids.LAWRENCIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 𬬻流体 */
        public static final DeferredBlock<LiquidBlock> RUTHERFORDIUM = register("rutherfordium", ECFluids.RUTHERFORDIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 𬭊流体 */
        public static final DeferredBlock<LiquidBlock> DUBNIUM = register("dubnium", ECFluids.DUBNIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 𬭳流体 */
        public static final DeferredBlock<LiquidBlock> SEABORGIUM = register("seaborgium", ECFluids.SEABORGIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 𬭛流体 */
        public static final DeferredBlock<LiquidBlock> BOHRIUM = register("bohrium", ECFluids.BOHRIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 𬭶流体 */
        public static final DeferredBlock<LiquidBlock> HASSIUM = register("hassium", ECFluids.HASSIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 鿏流体 */
        public static final DeferredBlock<LiquidBlock> MEITNERIUM = register("meitnerium", ECFluids.MEITNERIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 𫟼流体 */
        public static final DeferredBlock<LiquidBlock> DARMSTADTIUM = register("darmstadtium", ECFluids.DARMSTADTIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 𬬭流体 */
        public static final DeferredBlock<LiquidBlock> ROENTGENIUM = register("roentgenium", ECFluids.ROENTGENIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 鿔流体 */
        public static final DeferredBlock<LiquidBlock> COPERNICIUM = register("copernicium", ECFluids.COPERNICIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 鉨流体 */
        public static final DeferredBlock<LiquidBlock> NIHONIUM = register("nihonium", ECFluids.NIHONIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 鈇流体 */
        public static final DeferredBlock<LiquidBlock> FLEROVIUM = register("flerovium", ECFluids.FLEROVIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 镆流体 */
        public static final DeferredBlock<LiquidBlock> MOSCOVIUM = register("moscovium", ECFluids.MOSCOVIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 鉝流体 */
        public static final DeferredBlock<LiquidBlock> LIVERMORIUM = register("livermorium", ECFluids.LIVERMORIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 鿬流体 */
        public static final DeferredBlock<LiquidBlock> TENNESSINE = register("tennessine", ECFluids.TENNESSINE.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 鿫流体 */
        public static final DeferredBlock<LiquidBlock> OGANESSON = register("oganesson", ECFluids.OGANESSON.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 鑨流体 */
        public static final DeferredBlock<LiquidBlock> LONGIUM = register("longium", ECFluids.LONGIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
        /** 镾流体 */
        public static final DeferredBlock<LiquidBlock> MYSTERIUM = register("mysterium", ECFluids.MYSTERIUM.source, 100.0F, 0.8F, 0.4F, 0.3F, MapColor.WATER);
    }

    // ==================== 批量注册 矿石锭/粒/齿轮/板/粉/棍/线/粉碎矿/粗矿 ====================
    public static final class OreBlocks {
        public static final List<DeferredItem<?>> ALL_ITEMS = new ArrayList<>();
        public static final List<DeferredBlock<?>> ALL_BLOCKS = new ArrayList<>();
        public static final List<OreBlocks> ALL_ORE_BLOCKS = new ArrayList<>();

        public final DeferredBlock<Block> BLOCK;
        public final DeferredBlock<Block> RAW_BLOCK;
        public final DeferredBlock<Block> ORE;
        public final DeferredBlock<Block> DEEPSLATE_ORE;
        public final DeferredBlock<Block> NETHER_ORE;
        public final DeferredBlock<Block> END_ORE;

        public OreBlocks(String oreName, float hardness, float resistance, Rarity rarity) {
            Block.Properties props = Block.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(hardness, resistance)
                    .requiresCorrectToolForDrops();

            BLOCK = registerAndAdd(oreName + "_block", () -> new Block(props), rarity);
            RAW_BLOCK = registerAndAdd("raw_" + oreName + "_block", () -> new Block(props), rarity);
            ORE = registerAndAdd(oreName + "_ore", () -> new Block(props), rarity);
            DEEPSLATE_ORE = registerAndAdd("deepslate_" + oreName + "_ore", () -> new Block(props), rarity);
            NETHER_ORE = registerAndAdd("nether_" + oreName + "_ore", () -> new Block(props), rarity);
            END_ORE = registerAndAdd("end_" + oreName + "_ore", () -> new Block(props), rarity);
            ALL_ORE_BLOCKS.add(this);
        }

        private DeferredBlock<Block> registerAndAdd(String name, Supplier<Block> blockSupplier, Rarity rarity) {
            DeferredBlock<Block> block = BLOCK_REGISTER.register(name, blockSupplier);
            DeferredItem<Item> blockItem = ECMaterialItems.ITEMS_REGISTER.register(name,
                    () -> new BlockItem(block.get(), new Item.Properties().rarity(rarity)));
            ALL_ITEMS.add(blockItem);
            ALL_BLOCKS.add(block);
            return block;
        }

        public void addToCreativeTab(Consumer<ItemStack> output) {
            output.accept(new ItemStack(BLOCK.get()));
            output.accept(new ItemStack(RAW_BLOCK.get()));
            output.accept(new ItemStack(ORE.get()));
            output.accept(new ItemStack(DEEPSLATE_ORE.get()));
            output.accept(new ItemStack(NETHER_ORE.get()));
            output.accept(new ItemStack(END_ORE.get()));
        }
    }

    // ==================== 批量注册 特殊矿石锭/粒/齿轮/板/粉/棍/线/粉碎矿/粗矿 ====================
    public static class SpecialOreBlocks {
        public static final List<DeferredItem<?>> ALL_ITEMS = new ArrayList<>();
        public static final List<DeferredBlock<?>> ALL_BLOCKS = new ArrayList<>();
        public static final List<SpecialOreBlocks> ALL_SPECIAL_ORE_BLOCKS = new ArrayList<>();

        public final DeferredBlock<Block> ORE;
        public final DeferredBlock<Block> DEEPSLATE_ORE;
        public final DeferredBlock<Block> NETHER_ORE;
        public final DeferredBlock<Block> END_ORE;

        public SpecialOreBlocks(String oreName, float hardness, float resistance, Rarity rarity) {
            Block.Properties props = Block.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(hardness, resistance)
                    .requiresCorrectToolForDrops();

            ORE = registerBlocks(oreName, () -> new Block(props), rarity);
            DEEPSLATE_ORE = registerBlocks("deepslate_" + oreName, () -> new Block(props), rarity);
            NETHER_ORE = registerBlocks("nether_" + oreName, () -> new Block(props), rarity);
            END_ORE = registerBlocks("end_" + oreName, () -> new Block(props), rarity);
            ALL_SPECIAL_ORE_BLOCKS.add(this);
        }

        public void addToCreativeTab(Consumer<ItemStack> output) {
            output.accept(new ItemStack(ORE.get()));
            output.accept(new ItemStack(DEEPSLATE_ORE.get()));
            output.accept(new ItemStack(NETHER_ORE.get()));
            output.accept(new ItemStack(END_ORE.get()));
        }
    }

    public static <T extends Block> void registerBlockItems(String name, DeferredBlock<T> block, Rarity rarity) {
        ECMaterialItems.ITEMS_REGISTER.register(name, () -> new BlockItem(block.get(), new Item.Properties().rarity(rarity)));
    }

    public static <T extends Block> DeferredBlock<T> registerBlocks(String name, Supplier<T> block, Rarity rarity) {
        DeferredBlock<T> blocks = BLOCK_REGISTER.register(name, block);
        DeferredItem<Item> blockItem = ECMaterialItems.ITEMS_REGISTER.register(name,
                () -> new BlockItem(blocks.get(), new Item.Properties().rarity(rarity)));
        OreBlocks.ALL_ITEMS.add(blockItem);
        return blocks;
    }

    public static void register(IEventBus eventBus) {
        BLOCK_REGISTER.register(eventBus);
    }
}
