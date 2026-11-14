package com.chinaex123.elementum_core.init;

import com.chinaex123.elementum_core.ElementumCore;
import com.chinaex123.elementum_core.util.ContentRefs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

/** 120个元素块 */
public class ECElementBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ElementumCore.MODID);

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
    /** 铁（铁块/粗铁块/铁矿石/深层铁矿石沿用原版，不再重复注册） */
    public static final OreBlocks IRON = new OreBlocks("iron", 2.4F, 6.0F, Rarity.EPIC,
            Blocks.IRON_BLOCK, Blocks.RAW_IRON_BLOCK, Blocks.IRON_ORE, Blocks.DEEPSLATE_IRON_ORE, null, null);
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
    /** 金（金块/粗金块/金矿石/深层金矿石/下界金矿石沿用原版，不再重复注册） */
    public static final OreBlocks GOLD = new OreBlocks("gold", 2.4F, 6.0F, Rarity.EPIC,
            Blocks.GOLD_BLOCK, Blocks.RAW_GOLD_BLOCK, Blocks.GOLD_ORE, Blocks.DEEPSLATE_GOLD_ORE, Blocks.NETHER_GOLD_ORE, null);
    /** 汞 */
    public static final OreBlocks MERCURY = new OreBlocks("mercury", 2.4F, 6.0F, Rarity.EPIC);
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
    /** 鿔 */
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

    // ==================== 批量注册 矿石锭/粒/齿轮/板/粉/棍/线/粉碎矿/粗矿 ====================
    public static final class OreBlocks {
        public static final List<DeferredItem<?>> ALL_ITEMS = new ArrayList<>();
        public static final List<DeferredBlock<?>> ALL_BLOCKS = new ArrayList<>();
        public static final List<OreBlocks> ALL_ORE_BLOCKS = new ArrayList<>();

        public final DeferredHolder<Block, Block> BLOCK;
        public final DeferredHolder<Block, Block> RAW_BLOCK;
        public final DeferredHolder<Block, Block> ORE;
        public final DeferredHolder<Block, Block> DEEPSLATE_ORE;
        public final DeferredHolder<Block, Block> NETHER_ORE;
        public final DeferredHolder<Block, Block> END_ORE;

        public OreBlocks(String oreName, float hardness, float resistance, Rarity rarity) {
            this(oreName, hardness, resistance, rarity, null, null, null, null, null, null);
        }

        /**
         * @param vanillaBlock        原版已有的矿块；传 null 表示由本模组注册
         * @param vanillaRawBlock     原版已有的粗矿块；传 null 表示由本模组注册
         * @param vanillaOre          原版已有的矿石；传 null 表示由本模组注册
         * @param vanillaDeepslateOre 原版已有的深层矿石；传 null 表示由本模组注册
         * @param vanillaNetherOre    原版已有的下界矿石；传 null 表示由本模组注册
         * @param vanillaEndOre       原版已有的末地矿石；传 null 表示由本模组注册
         */
        public OreBlocks(String oreName, float hardness, float resistance, Rarity rarity,
                         @Nullable Block vanillaBlock, @Nullable Block vanillaRawBlock, @Nullable Block vanillaOre,
                         @Nullable Block vanillaDeepslateOre, @Nullable Block vanillaNetherOre, @Nullable Block vanillaEndOre) {
            Block.Properties props = Block.Properties.of()
                    .mapColor(MapColor.STONE)
                    .strength(hardness, resistance)
                    .requiresCorrectToolForDrops();

            BLOCK = registerOrLink(oreName + "_block", () -> new Block(props), rarity, vanillaBlock);
            RAW_BLOCK = registerOrLink("raw_" + oreName + "_block", () -> new Block(props), rarity, vanillaRawBlock);
            ORE = registerOrLink(oreName + "_ore", () -> new Block(props), rarity, vanillaOre);
            DEEPSLATE_ORE = registerOrLink("deepslate_" + oreName + "_ore", () -> new Block(props), rarity, vanillaDeepslateOre);
            NETHER_ORE = registerOrLink("nether_" + oreName + "_ore", () -> new Block(props), rarity, vanillaNetherOre);
            END_ORE = registerOrLink("end_" + oreName + "_ore", () -> new Block(props), rarity, vanillaEndOre);
            ALL_ORE_BLOCKS.add(this);
        }

        private DeferredHolder<Block, Block> registerOrLink(String name, Supplier<Block> blockSupplier, Rarity rarity, @Nullable Block vanilla) {
            if (vanilla != null) {
                return ContentRefs.vanillaBlock(vanilla);
            }
            DeferredBlock<Block> block = BLOCKS.register(name, blockSupplier);
            DeferredItem<Item> blockItem = ECElementItems.ITEMS.register(name,
                    () -> new BlockItem(block.get(), new Item.Properties().rarity(rarity)));
            ALL_ITEMS.add(blockItem);
            ALL_BLOCKS.add(block);
            return block;
        }

        public static @Nullable OreBlocks byName(String oreName) {
            for (OreBlocks oreBlock : ALL_ORE_BLOCKS) {
                if (oreBlock.BLOCK.getId().getPath().equals(oreName + "_block")) {
                    return oreBlock;
                }
            }
            return null;
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

    public static <T extends Block> void registerBlockItems(String name, DeferredBlock<T> block, Rarity rarity) {
        ECElementItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().rarity(rarity)));
    }

    public static <T extends Block> DeferredBlock<T> registerBlocks(String name, Supplier<T> block, Rarity rarity) {
        DeferredBlock<T> blocks = BLOCKS.register(name, block);
        DeferredItem<Item> blockItem = ECElementItems.ITEMS.register(name,
                () -> new BlockItem(blocks.get(), new Item.Properties().rarity(rarity)));
        OreBlocks.ALL_ITEMS.add(blockItem);
        return blocks;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
        ECMaterialBlocks.BLOCKS.register(eventBus);
    }
}