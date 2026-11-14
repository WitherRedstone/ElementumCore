package com.chinaex123.elementum_core.init;

import com.chinaex123.elementum_core.ElementumCore;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.material.MapColor;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import static com.chinaex123.elementum_core.init.ECElementBlocks.registerBlocks;

/** 材料方块 */
public class ECMaterialBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(ElementumCore.MODID);

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
    
}
