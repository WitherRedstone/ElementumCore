package com.chinaex123.elementum_core.init;

import com.chinaex123.elementum_core.ElementumCore;
import com.chinaex123.elementum_core.init.blocks.ECElementBlocks;
import com.chinaex123.elementum_core.init.items.ECMaterialItems;
import com.chinaex123.elementum_core.init.items.ECItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ECCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ElementumCore.MODID);

    // 化学元素核心：材料
    public static final Supplier<CreativeModeTab> RCE_MATERIALS_ITEM_TAB =
            CREATIVE_MODE_TAB.register("rce_materials_item_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ECItems.GAS_CYLINDER.get()))
                    .title(Component.translatable("itemGroup.elementum_core.rce_material_item_tab"))
                    .displayItems((parameters, output) -> {

                        output.accept(ECItems.GAS_CYLINDER.get());
                        output.accept(ECItems.HYDROGEN_CYLINDER.get());
                        output.accept(ECItems.HELIUM_CYLINDER.get());
                        output.accept(ECItems.NITROGEN_CYLINDER.get());
                        output.accept(ECItems.OXYGEN_CYLINDER.get());
                        output.accept(ECItems.FLUORINE_CYLINDER.get());
                        output.accept(ECItems.NEON_CYLINDER.get());
                        output.accept(ECItems.CHLORINE_CYLINDER.get());
                        output.accept(ECItems.ARGON_CYLINDER.get());
                        output.accept(ECItems.KRYPTON_CYLINDER.get());
                        output.accept(ECItems.XENON_CYLINDER.get());
                        output.accept(ECItems.RADON_CYLINDER.get());
                        output.accept(ECItems.OGANESSON_CYLINDER.get());

                    })
                    .build());

    // 化学元素核心：元素物品
    public static final Supplier<CreativeModeTab> RCE_ELEMENT_ITEM_TAB =
            CREATIVE_MODE_TAB.register("rce_element_item_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ECMaterialItems.NEODYMIUM.INGOT.get()))
                    .title(Component.translatable("itemGroup.elementum_core.rce_element_item_tab"))
                    .displayItems((parameters, output) -> {

                        ECMaterialItems.HYDROGEN.addToCreativeTab(output::accept); // 氢
                        ECMaterialItems.HELIUM.addToCreativeTab(output::accept); // 氦
                        ECMaterialItems.LITHIUM.addToCreativeTab(output::accept); // 锂
                        ECMaterialItems.BERYLLIUM.addToCreativeTab(output::accept); // 铍
                        ECMaterialItems.BORON.addToCreativeTab(output::accept); // 硼
                        ECMaterialItems.CARBON.addToCreativeTab(output::accept); // 碳
                        ECMaterialItems.NITROGEN.addToCreativeTab(output::accept); // 氮
                        ECMaterialItems.OXYGEN.addToCreativeTab(output::accept); // 氧
                        ECMaterialItems.FLUORINE.addToCreativeTab(output::accept); // 氟
                        ECMaterialItems.NEON.addToCreativeTab(output::accept); // 氖
                        ECMaterialItems.SODIUM.addToCreativeTab(output::accept); // 钠
                        ECMaterialItems.MAGNESIUM.addToCreativeTab(output::accept); // 镁
                        ECMaterialItems.ALUMINUM.addToCreativeTab(output::accept); // 铝
                        ECMaterialItems.SILICON.addToCreativeTab(output::accept); // 硅
                        ECMaterialItems.PHOSPHORUS.addToCreativeTab(output::accept); // 磷
                        ECMaterialItems.SULFUR.addToCreativeTab(output::accept); // 硫
                        ECMaterialItems.CHLORINE.addToCreativeTab(output::accept); // 氯
                        ECMaterialItems.ARGON.addToCreativeTab(output::accept); // 氩
                        ECMaterialItems.POTASSIUM.addToCreativeTab(output::accept); // 钾
                        ECMaterialItems.CALCIUM.addToCreativeTab(output::accept); // 钙
                        ECMaterialItems.SCANDIUM.addToCreativeTab(output::accept); // 钪
                        ECMaterialItems.TITANIUM.addToCreativeTab(output::accept); // 钛
                        ECMaterialItems.VANADIUM.addToCreativeTab(output::accept); // 钒
                        ECMaterialItems.CHROMIUM.addToCreativeTab(output::accept); // 铬
                        ECMaterialItems.MANGANESE.addToCreativeTab(output::accept); // 锰
                        ECMaterialItems.IRON.addToCreativeTab(output::accept); // 铁
                        ECMaterialItems.COBALT.addToCreativeTab(output::accept); // 钴
                        ECMaterialItems.NICKEL.addToCreativeTab(output::accept); // 镍
                        ECMaterialItems.COPPER.addToCreativeTab(output::accept); // 铜
                        ECMaterialItems.ZINC.addToCreativeTab(output::accept); // 锌
                        ECMaterialItems.GALLIUM.addToCreativeTab(output::accept); // 镓
                        ECMaterialItems.GERMANIUM.addToCreativeTab(output::accept); // 锗
                        ECMaterialItems.ARSENIC.addToCreativeTab(output::accept); // 砷
                        ECMaterialItems.SELENIUM.addToCreativeTab(output::accept); // 硒
                        ECMaterialItems.BROMINE.addToCreativeTab(output::accept); // 溴
                        ECMaterialItems.KRYPTON.addToCreativeTab(output::accept); // 氪
                        ECMaterialItems.RUBIDIUM.addToCreativeTab(output::accept); // 铷
                        ECMaterialItems.STRONTIUM.addToCreativeTab(output::accept); // 锶
                        ECMaterialItems.YTTRIUM.addToCreativeTab(output::accept); // 钇
                        ECMaterialItems.ZIRCONIUM.addToCreativeTab(output::accept); // 锆
                        ECMaterialItems.NIOBIUM.addToCreativeTab(output::accept); // 铌
                        ECMaterialItems.MOLYBDENUM.addToCreativeTab(output::accept); // 钼
                        ECMaterialItems.TECHNETIUM.addToCreativeTab(output::accept); // 锝
                        ECMaterialItems.RUTHENIUM.addToCreativeTab(output::accept); // 钌
                        ECMaterialItems.RHODIUM.addToCreativeTab(output::accept); // 铑
                        ECMaterialItems.PALLADIUM.addToCreativeTab(output::accept); // 钯
                        ECMaterialItems.SILVER.addToCreativeTab(output::accept); // 银
                        ECMaterialItems.CADMIUM.addToCreativeTab(output::accept); // 镉
                        ECMaterialItems.INDIUM.addToCreativeTab(output::accept); // 铟
                        ECMaterialItems.TIN.addToCreativeTab(output::accept); // 锡
                        ECMaterialItems.ANTIMONY.addToCreativeTab(output::accept); // 锑
                        ECMaterialItems.TELLURIUM.addToCreativeTab(output::accept); // 碲
                        ECMaterialItems.IODINE.addToCreativeTab(output::accept); // 碘
                        ECMaterialItems.XENON.addToCreativeTab(output::accept); // 氙
                        ECMaterialItems.CESIUM.addToCreativeTab(output::accept); // 铯
                        ECMaterialItems.BARIUM.addToCreativeTab(output::accept); // 钡
                        ECMaterialItems.LANTHANUM.addToCreativeTab(output::accept); // 镧
                        ECMaterialItems.CERIUM.addToCreativeTab(output::accept); // 铈
                        ECMaterialItems.PRASEODYMIUM.addToCreativeTab(output::accept); // 镨
                        ECMaterialItems.NEODYMIUM.addToCreativeTab(output::accept); // 钕
                        ECMaterialItems.PROMETHIUM.addToCreativeTab(output::accept); // 钷
                        ECMaterialItems.SAMARIUM.addToCreativeTab(output::accept); // 钐
                        ECMaterialItems.EUROPIUM.addToCreativeTab(output::accept); // 铕
                        ECMaterialItems.GADOLINIUM.addToCreativeTab(output::accept); // 钆
                        ECMaterialItems.TERBIUM.addToCreativeTab(output::accept); // 铽
                        ECMaterialItems.DYSPROSIUM.addToCreativeTab(output::accept); // 镝
                        ECMaterialItems.HOLMIUM.addToCreativeTab(output::accept); // 钬
                        ECMaterialItems.ERBIUM.addToCreativeTab(output::accept); // 铒
                        ECMaterialItems.THULIUM.addToCreativeTab(output::accept); // 铥
                        ECMaterialItems.YTTERBIUM.addToCreativeTab(output::accept); // 镱
                        ECMaterialItems.LUTETIUM.addToCreativeTab(output::accept); // 镥
                        ECMaterialItems.HAFNIUM.addToCreativeTab(output::accept); // 铪
                        ECMaterialItems.TANTALUM.addToCreativeTab(output::accept); // 钽
                        ECMaterialItems.TUNGSTEN.addToCreativeTab(output::accept); // 钨
                        ECMaterialItems.RHENIUM.addToCreativeTab(output::accept); // 铼
                        ECMaterialItems.OSMIUM.addToCreativeTab(output::accept); // 锇
                        ECMaterialItems.IRIDIUM.addToCreativeTab(output::accept); // 铱
                        ECMaterialItems.PLATINUM.addToCreativeTab(output::accept); // 铂
                        ECMaterialItems.GOLD.addToCreativeTab(output::accept); // 金
                        ECMaterialItems.MERCURY.addToCreativeTab(output::accept); // 汞
                        ECMaterialItems.THALLIUM.addToCreativeTab(output::accept); // 铊
                        ECMaterialItems.LEAD.addToCreativeTab(output::accept); // 铅
                        ECMaterialItems.BISMUTH.addToCreativeTab(output::accept); // 铋
                        ECMaterialItems.POLONIUM.addToCreativeTab(output::accept); // 钋
                        ECMaterialItems.ASTATINE.addToCreativeTab(output::accept); // 砹
                        ECMaterialItems.RADON.addToCreativeTab(output::accept); // 氡
                        ECMaterialItems.FRANCIUM.addToCreativeTab(output::accept); // 钫
                        ECMaterialItems.RADIUM.addToCreativeTab(output::accept); // 镭
                        ECMaterialItems.ACTINIUM.addToCreativeTab(output::accept); // 锕
                        ECMaterialItems.THORIUM.addToCreativeTab(output::accept); // 钍
                        ECMaterialItems.PROTACTINIUM.addToCreativeTab(output::accept); // 镤
                        ECMaterialItems.URANIUM.addToCreativeTab(output::accept); // 铀
                        ECMaterialItems.NEPTUNIUM.addToCreativeTab(output::accept); // 镎
                        ECMaterialItems.PLUTONIUM.addToCreativeTab(output::accept); // 钚
                        ECMaterialItems.AMERICIUM.addToCreativeTab(output::accept); // 镅
                        ECMaterialItems.CURIUM.addToCreativeTab(output::accept); // 锔
                        ECMaterialItems.BERKELIUM.addToCreativeTab(output::accept); // 锫
                        ECMaterialItems.CALIFORNIUM.addToCreativeTab(output::accept); // 锎
                        ECMaterialItems.EINSTEINIUM.addToCreativeTab(output::accept); // 锿
                        ECMaterialItems.FERMIUM.addToCreativeTab(output::accept); // 镄
                        ECMaterialItems.MENDELEVIUM.addToCreativeTab(output::accept); // 钔
                        ECMaterialItems.NOBELIUM.addToCreativeTab(output::accept); // 锘
                        ECMaterialItems.LAWRENCIUM.addToCreativeTab(output::accept); // 铹
                        ECMaterialItems.RUTHERFORDIUM.addToCreativeTab(output::accept); // 𬬻
                        ECMaterialItems.DUBNIUM.addToCreativeTab(output::accept); // 𬭊
                        ECMaterialItems.SEABORGIUM.addToCreativeTab(output::accept); // 𬭳
                        ECMaterialItems.BOHRIUM.addToCreativeTab(output::accept); // 𬭛
                        ECMaterialItems.HASSIUM.addToCreativeTab(output::accept); // 𬭶
                        ECMaterialItems.MEITNERIUM.addToCreativeTab(output::accept); // 鿏
                        ECMaterialItems.DARMSTADTIUM.addToCreativeTab(output::accept); // 𫟼
                        ECMaterialItems.ROENTGENIUM.addToCreativeTab(output::accept); // 𬬭
                        ECMaterialItems.COPERNICIUM.addToCreativeTab(output::accept); // 鿔
                        ECMaterialItems.NIHONIUM.addToCreativeTab(output::accept); // 鉨
                        ECMaterialItems.FLEROVIUM.addToCreativeTab(output::accept); // 鈇
                        ECMaterialItems.MOSCOVIUM.addToCreativeTab(output::accept); // 镆
                        ECMaterialItems.LIVERMORIUM.addToCreativeTab(output::accept); // 鉝
                        ECMaterialItems.TENNESSINE.addToCreativeTab(output::accept); // 鿬
                        ECMaterialItems.OGANESSON.addToCreativeTab(output::accept); // 鿫
                        ECMaterialItems.LONGIUM.addToCreativeTab(output::accept); // 鑨
                        ECMaterialItems.MYSTERIUM.addToCreativeTab(output::accept); // 镾

                    })
                    .build());

    // 化学元素核心：元素方块
    public static final Supplier<CreativeModeTab> RCE_ELEMENT_BLOCK_TAB =
            CREATIVE_MODE_TAB.register("rce_element_block_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ECElementBlocks.NEODYMIUM.BLOCK.get()))
                    .title(Component.translatable("itemGroup.elementum_core.rce_element_block_tab"))
                    .displayItems((parameters, output) -> {

                        ECElementBlocks.HYDROGEN.addToCreativeTab(output::accept); // 氢
                        ECElementBlocks.HELIUM.addToCreativeTab(output::accept); // 氦
                        ECElementBlocks.LITHIUM.addToCreativeTab(output::accept); // 锂
                        ECElementBlocks.BERYLLIUM.addToCreativeTab(output::accept); // 铍
                        ECElementBlocks.BORON.addToCreativeTab(output::accept); // 硼
                        ECElementBlocks.CARBON.addToCreativeTab(output::accept); // 碳
                        ECElementBlocks.NITROGEN.addToCreativeTab(output::accept); // 氮
                        ECElementBlocks.OXYGEN.addToCreativeTab(output::accept); // 氧
                        ECElementBlocks.FLUORINE.addToCreativeTab(output::accept); // 氟
                        ECElementBlocks.NEON.addToCreativeTab(output::accept); // 氖
                        ECElementBlocks.SODIUM.addToCreativeTab(output::accept); // 钠
                        ECElementBlocks.MAGNESIUM.addToCreativeTab(output::accept); // 镁
                        ECElementBlocks.ALUMINUM.addToCreativeTab(output::accept); // 铝
                        ECElementBlocks.SILICON.addToCreativeTab(output::accept); // 硅
                        ECElementBlocks.PHOSPHORUS.addToCreativeTab(output::accept); // 磷
                        ECElementBlocks.SULFUR.addToCreativeTab(output::accept); // 硫
                        ECElementBlocks.CHLORINE.addToCreativeTab(output::accept); // 氯
                        ECElementBlocks.ARGON.addToCreativeTab(output::accept); // 氩
                        ECElementBlocks.POTASSIUM.addToCreativeTab(output::accept); // 钾
                        ECElementBlocks.CALCIUM.addToCreativeTab(output::accept); // 钙
                        ECElementBlocks.SCANDIUM.addToCreativeTab(output::accept); // 钪
                        ECElementBlocks.TITANIUM.addToCreativeTab(output::accept); // 钛
                        ECElementBlocks.VANADIUM.addToCreativeTab(output::accept); // 钒
                        ECElementBlocks.CHROMIUM.addToCreativeTab(output::accept); // 铬
                        ECElementBlocks.MANGANESE.addToCreativeTab(output::accept); // 锰
                        ECElementBlocks.IRON.addToCreativeTab(output::accept); // 铁
                        ECElementBlocks.COBALT.addToCreativeTab(output::accept); // 钴
                        ECElementBlocks.NICKEL.addToCreativeTab(output::accept); // 镍
                        ECElementBlocks.COPPER.addToCreativeTab(output::accept); // 铜
                        ECElementBlocks.ZINC.addToCreativeTab(output::accept); // 锌
                        ECElementBlocks.GALLIUM.addToCreativeTab(output::accept); // 镓
                        ECElementBlocks.GERMANIUM.addToCreativeTab(output::accept); // 锗
                        ECElementBlocks.ARSENIC.addToCreativeTab(output::accept); // 砷
                        ECElementBlocks.SELENIUM.addToCreativeTab(output::accept); // 硒
                        ECElementBlocks.BROMINE.addToCreativeTab(output::accept); // 溴
                        ECElementBlocks.KRYPTON.addToCreativeTab(output::accept); // 氪
                        ECElementBlocks.RUBIDIUM.addToCreativeTab(output::accept); // 铷
                        ECElementBlocks.STRONTIUM.addToCreativeTab(output::accept); // 锶
                        ECElementBlocks.YTTRIUM.addToCreativeTab(output::accept); // 钇
                        ECElementBlocks.ZIRCONIUM.addToCreativeTab(output::accept); // 锆
                        ECElementBlocks.NIOBIUM.addToCreativeTab(output::accept); // 铌
                        ECElementBlocks.MOLYBDENUM.addToCreativeTab(output::accept); // 钼
                        ECElementBlocks.TECHNETIUM.addToCreativeTab(output::accept); // 锝
                        ECElementBlocks.RUTHENIUM.addToCreativeTab(output::accept); // 钌
                        ECElementBlocks.RHODIUM.addToCreativeTab(output::accept); // 铑
                        ECElementBlocks.PALLADIUM.addToCreativeTab(output::accept); // 钯
                        ECElementBlocks.SILVER.addToCreativeTab(output::accept); // 银
                        ECElementBlocks.CADMIUM.addToCreativeTab(output::accept); // 镉
                        ECElementBlocks.INDIUM.addToCreativeTab(output::accept); // 铟
                        ECElementBlocks.TIN.addToCreativeTab(output::accept); // 锡
                        ECElementBlocks.ANTIMONY.addToCreativeTab(output::accept); // 锑
                        ECElementBlocks.TELLURIUM.addToCreativeTab(output::accept); // 碲
                        ECElementBlocks.IODINE.addToCreativeTab(output::accept); // 碘
                        ECElementBlocks.XENON.addToCreativeTab(output::accept); // 氙
                        ECElementBlocks.CESIUM.addToCreativeTab(output::accept); // 铯
                        ECElementBlocks.BARIUM.addToCreativeTab(output::accept); // 钡
                        ECElementBlocks.LANTHANUM.addToCreativeTab(output::accept); // 镧
                        ECElementBlocks.CERIUM.addToCreativeTab(output::accept); // 铈
                        ECElementBlocks.PRASEODYMIUM.addToCreativeTab(output::accept); // 镨
                        ECElementBlocks.NEODYMIUM.addToCreativeTab(output::accept); // 钕
                        ECElementBlocks.PROMETHIUM.addToCreativeTab(output::accept); // 钷
                        ECElementBlocks.SAMARIUM.addToCreativeTab(output::accept); // 钐
                        ECElementBlocks.EUROPIUM.addToCreativeTab(output::accept); // 铕
                        ECElementBlocks.GADOLINIUM.addToCreativeTab(output::accept); // 钆
                        ECElementBlocks.TERBIUM.addToCreativeTab(output::accept); // 铽
                        ECElementBlocks.DYSPROSIUM.addToCreativeTab(output::accept); // 镝
                        ECElementBlocks.HOLMIUM.addToCreativeTab(output::accept); // 钬
                        ECElementBlocks.ERBIUM.addToCreativeTab(output::accept); // 铒
                        ECElementBlocks.THULIUM.addToCreativeTab(output::accept); // 铥
                        ECElementBlocks.YTTERBIUM.addToCreativeTab(output::accept); // 镱
                        ECElementBlocks.LUTETIUM.addToCreativeTab(output::accept); // 镥
                        ECElementBlocks.HAFNIUM.addToCreativeTab(output::accept); // 铪
                        ECElementBlocks.TANTALUM.addToCreativeTab(output::accept); // 钽
                        ECElementBlocks.TUNGSTEN.addToCreativeTab(output::accept); // 钨
                        ECElementBlocks.RHENIUM.addToCreativeTab(output::accept); // 铼
                        ECElementBlocks.OSMIUM.addToCreativeTab(output::accept); // 锇
                        ECElementBlocks.IRIDIUM.addToCreativeTab(output::accept); // 铱
                        ECElementBlocks.PLATINUM.addToCreativeTab(output::accept); // 铂
                        ECElementBlocks.GOLD.addToCreativeTab(output::accept); // 金
                        ECElementBlocks.MERCURY.addToCreativeTab(output::accept); // 汞
                        ECElementBlocks.THALLIUM.addToCreativeTab(output::accept); // 铊
                        ECElementBlocks.LEAD.addToCreativeTab(output::accept); // 铅
                        ECElementBlocks.BISMUTH.addToCreativeTab(output::accept); // 铋
                        ECElementBlocks.POLONIUM.addToCreativeTab(output::accept); // 钋
                        ECElementBlocks.ASTATINE.addToCreativeTab(output::accept); // 砹
                        ECElementBlocks.RADON.addToCreativeTab(output::accept); // 氡
                        ECElementBlocks.FRANCIUM.addToCreativeTab(output::accept); // 钫
                        ECElementBlocks.RADIUM.addToCreativeTab(output::accept); // 镭
                        ECElementBlocks.ACTINIUM.addToCreativeTab(output::accept); // 锕
                        ECElementBlocks.THORIUM.addToCreativeTab(output::accept); // 钍
                        ECElementBlocks.PROTACTINIUM.addToCreativeTab(output::accept); // 镤
                        ECElementBlocks.URANIUM.addToCreativeTab(output::accept); // 铀
                        ECElementBlocks.NEPTUNIUM.addToCreativeTab(output::accept); // 镎
                        ECElementBlocks.PLUTONIUM.addToCreativeTab(output::accept); // 钚
                        ECElementBlocks.AMERICIUM.addToCreativeTab(output::accept); // 镅
                        ECElementBlocks.CURIUM.addToCreativeTab(output::accept); // 锔
                        ECElementBlocks.BERKELIUM.addToCreativeTab(output::accept); // 锫
                        ECElementBlocks.CALIFORNIUM.addToCreativeTab(output::accept); // 锎
                        ECElementBlocks.EINSTEINIUM.addToCreativeTab(output::accept); // 锿
                        ECElementBlocks.FERMIUM.addToCreativeTab(output::accept); // 镄
                        ECElementBlocks.MENDELEVIUM.addToCreativeTab(output::accept); // 钔
                        ECElementBlocks.NOBELIUM.addToCreativeTab(output::accept); // 锘
                        ECElementBlocks.LAWRENCIUM.addToCreativeTab(output::accept); // 铹
                        ECElementBlocks.RUTHERFORDIUM.addToCreativeTab(output::accept); // 𬬻
                        ECElementBlocks.DUBNIUM.addToCreativeTab(output::accept); // 𬭊
                        ECElementBlocks.SEABORGIUM.addToCreativeTab(output::accept); // 𬭳
                        ECElementBlocks.BOHRIUM.addToCreativeTab(output::accept); // 𬭛
                        ECElementBlocks.HASSIUM.addToCreativeTab(output::accept); // 𬭶
                        ECElementBlocks.MEITNERIUM.addToCreativeTab(output::accept); // 鿏
                        ECElementBlocks.DARMSTADTIUM.addToCreativeTab(output::accept); // 𬭊
                        ECElementBlocks.ROENTGENIUM.addToCreativeTab(output::accept); // 𬬭
                        ECElementBlocks.COPERNICIUM.addToCreativeTab(output::accept); // 鎶
                        ECElementBlocks.NIHONIUM.addToCreativeTab(output::accept); // 鿭
                        ECElementBlocks.FLEROVIUM.addToCreativeTab(output::accept); // 𫓧
                        ECElementBlocks.MOSCOVIUM.addToCreativeTab(output::accept); // 镆
                        ECElementBlocks.LIVERMORIUM.addToCreativeTab(output::accept); // 𫟷
                        ECElementBlocks.TENNESSINE.addToCreativeTab(output::accept); // 鿬
                        ECElementBlocks.OGANESSON.addToCreativeTab(output::accept); // 鿫
                        ECElementBlocks.LONGIUM.addToCreativeTab(output::accept); // 鑨
                        ECElementBlocks.MYSTERIUM.addToCreativeTab(output::accept); // 镾

                        ECElementBlocks.LEPIDOLITE.addToCreativeTab(output::accept); // 锂云母
                        ECElementBlocks.BERYL.addToCreativeTab(output::accept); // 绿柱石
                        ECElementBlocks.BORAX.addToCreativeTab(output::accept); // 硼砂
                        ECElementBlocks.MAGNESITE.addToCreativeTab(output::accept); // 菱镁矿
                        ECElementBlocks.NITRE.addToCreativeTab(output::accept); // 硝石
                        ECElementBlocks.APATITE.addToCreativeTab(output::accept); // 磷灰石
                        ECElementBlocks.MONAZITE.addToCreativeTab(output::accept); // 独居石
                        ECElementBlocks.CINNABAR.addToCreativeTab(output::accept); // 朱砂
                        ECElementBlocks.SYLVITE.addToCreativeTab(output::accept); // 钾石盐
                        ECElementBlocks.THORTVEITITE.addToCreativeTab(output::accept); // 钪钇石
                        ECElementBlocks.ILMENITE.addToCreativeTab(output::accept); // 钛铁矿
                        ECElementBlocks.PATRONITE.addToCreativeTab(output::accept); // 绿硫钒矿
                        ECElementBlocks.CHROMITE.addToCreativeTab(output::accept); // 铬铁矿
                        ECElementBlocks.PYROLUSITE.addToCreativeTab(output::accept); // 软锰矿
                        ECElementBlocks.ARGYRODITE.addToCreativeTab(output::accept); // 硫锗矿
                        ECElementBlocks.ARSENOPYRITE.addToCreativeTab(output::accept); // 毒砂
                        ECElementBlocks.CARNALLITE.addToCreativeTab(output::accept); // 光卤石
                        ECElementBlocks.CELESTINE.addToCreativeTab(output::accept); // 天青石
                        ECElementBlocks.COBALTITE.addToCreativeTab(output::accept); // 辉钴矿
                        ECElementBlocks.ZIRCON.addToCreativeTab(output::accept); // 锆英砂
                        ECElementBlocks.NIOBITE.addToCreativeTab(output::accept); // 铌铁矿
                        ECElementBlocks.MOLYBDENITE.addToCreativeTab(output::accept); // 辉钼矿
                        ECElementBlocks.STIBNITE.addToCreativeTab(output::accept); // 辉锑矿
                        ECElementBlocks.POLLUCITE.addToCreativeTab(output::accept); // 铯沸石
                        ECElementBlocks.BARITE.addToCreativeTab(output::accept); // 重晶石
                        ECElementBlocks.PYRITE.addToCreativeTab(output::accept); // 黄铁矿

                    })
                    .build());


    // 化学元素核心：元素流体
    public static final Supplier<CreativeModeTab> RCE_ELEMENT_FLUID_TAB =
            CREATIVE_MODE_TAB.register("rce_element_fluid_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ECMaterialItems.NEODYMIUM_BUCKET.get()))
                    .title(Component.translatable("itemGroup.elementum_core.rce_element_fluid_tab"))
                    .displayItems((parameters, output) -> {

                        output.accept(ECMaterialItems.HYDROGEN_BUCKET.get()); // 氢桶
                        output.accept(ECMaterialItems.HELIUM_BUCKET.get()); // 氦桶
                        output.accept(ECMaterialItems.LITHIUM_BUCKET.get()); // 锂桶
                        output.accept(ECMaterialItems.BERYLLIUM_BUCKET.get()); // 铍桶
                        output.accept(ECMaterialItems.BORON_BUCKET.get()); // 硼桶
                        output.accept(ECMaterialItems.CARBON_BUCKET.get()); // 碳桶
                        output.accept(ECMaterialItems.NITROGEN_BUCKET.get()); // 氮桶
                        output.accept(ECMaterialItems.OXYGEN_BUCKET.get()); // 氧桶
                        output.accept(ECMaterialItems.FLUORINE_BUCKET.get()); // 氟桶
                        output.accept(ECMaterialItems.NEON_BUCKET.get()); // 氖桶
                        output.accept(ECMaterialItems.SODIUM_BUCKET.get()); // 钠桶
                        output.accept(ECMaterialItems.MAGNESIUM_BUCKET.get()); // 镁桶
                        output.accept(ECMaterialItems.ALUMINUM_BUCKET.get()); // 铝桶
                        output.accept(ECMaterialItems.SILICON_BUCKET.get()); // 硅桶
                        output.accept(ECMaterialItems.PHOSPHORUS_BUCKET.get()); // 磷桶
                        output.accept(ECMaterialItems.SULFUR_BUCKET.get()); // 硫桶
                        output.accept(ECMaterialItems.CHLORINE_BUCKET.get()); // 氯桶
                        output.accept(ECMaterialItems.ARGON_BUCKET.get()); // 氩桶
                        output.accept(ECMaterialItems.POTASSIUM_BUCKET.get()); // 钾桶
                        output.accept(ECMaterialItems.CALCIUM_BUCKET.get()); // 钙桶
                        output.accept(ECMaterialItems.SCANDIUM_BUCKET.get()); // 钪桶
                        output.accept(ECMaterialItems.TITANIUM_BUCKET.get()); // 钛桶
                        output.accept(ECMaterialItems.VANADIUM_BUCKET.get()); // 钒桶
                        output.accept(ECMaterialItems.CHROMIUM_BUCKET.get()); // 铬桶
                        output.accept(ECMaterialItems.MANGANESE_BUCKET.get()); // 锰桶
                        output.accept(ECMaterialItems.IRON_BUCKET.get()); // 铁桶
                        output.accept(ECMaterialItems.COBALT_BUCKET.get()); // 钴桶
                        output.accept(ECMaterialItems.NICKEL_BUCKET.get()); // 镍桶
                        output.accept(ECMaterialItems.COPPER_BUCKET.get()); // 铜桶
                        output.accept(ECMaterialItems.ZINC_BUCKET.get()); // 锌桶
                        output.accept(ECMaterialItems.GALLIUM_BUCKET.get()); // 镓桶
                        output.accept(ECMaterialItems.GERMANIUM_BUCKET.get()); // 锗桶
                        output.accept(ECMaterialItems.ARSENIC_BUCKET.get()); // 砷桶
                        output.accept(ECMaterialItems.SELENIUM_BUCKET.get()); // 硒桶
                        output.accept(ECMaterialItems.BROMINE_BUCKET.get()); // 溴桶
                        output.accept(ECMaterialItems.KRYPTON_BUCKET.get()); // 氪桶
                        output.accept(ECMaterialItems.RUBIDIUM_BUCKET.get()); // 铷桶
                        output.accept(ECMaterialItems.STRONTIUM_BUCKET.get()); // 锶桶
                        output.accept(ECMaterialItems.YTTRIUM_BUCKET.get()); // 钇桶
                        output.accept(ECMaterialItems.ZIRCONIUM_BUCKET.get()); // 锆桶
                        output.accept(ECMaterialItems.NIOBIUM_BUCKET.get()); // 铌桶
                        output.accept(ECMaterialItems.MOLYBDENUM_BUCKET.get()); // 钼桶
                        output.accept(ECMaterialItems.TECHNETIUM_BUCKET.get()); // 锝桶
                        output.accept(ECMaterialItems.RUTHENIUM_BUCKET.get()); // 钌桶
                        output.accept(ECMaterialItems.RHODIUM_BUCKET.get()); // 铑桶
                        output.accept(ECMaterialItems.PALLADIUM_BUCKET.get()); // 钯桶
                        output.accept(ECMaterialItems.SILVER_BUCKET.get()); // 银桶
                        output.accept(ECMaterialItems.CADMIUM_BUCKET.get()); // 镉桶
                        output.accept(ECMaterialItems.INDIUM_BUCKET.get()); // 铟桶
                        output.accept(ECMaterialItems.TIN_BUCKET.get()); // 锡桶
                        output.accept(ECMaterialItems.ANTIMONY_BUCKET.get()); // 锑桶
                        output.accept(ECMaterialItems.TELLURIUM_BUCKET.get()); // 碲桶
                        output.accept(ECMaterialItems.IODINE_BUCKET.get()); // 碘桶
                        output.accept(ECMaterialItems.XENON_BUCKET.get()); // 氙桶
                        output.accept(ECMaterialItems.CESIUM_BUCKET.get()); // 铯桶
                        output.accept(ECMaterialItems.BARIUM_BUCKET.get()); // 钡桶
                        output.accept(ECMaterialItems.LANTHANUM_BUCKET.get()); // 镧桶
                        output.accept(ECMaterialItems.CERIUM_BUCKET.get()); // 铈桶
                        output.accept(ECMaterialItems.PRASEODYMIUM_BUCKET.get()); // 镨桶
                        output.accept(ECMaterialItems.NEODYMIUM_BUCKET.get()); // 钕桶
                        output.accept(ECMaterialItems.PROMETHIUM_BUCKET.get()); // 钷桶
                        output.accept(ECMaterialItems.SAMARIUM_BUCKET.get()); // 钐桶
                        output.accept(ECMaterialItems.EUROPIUM_BUCKET.get()); // 铕桶
                        output.accept(ECMaterialItems.GADOLINIUM_BUCKET.get()); // 钆桶
                        output.accept(ECMaterialItems.TERBIUM_BUCKET.get()); // 铽桶
                        output.accept(ECMaterialItems.DYSPROSIUM_BUCKET.get()); // 镝桶
                        output.accept(ECMaterialItems.HOLMIUM_BUCKET.get()); // 钬桶
                        output.accept(ECMaterialItems.ERBIUM_BUCKET.get()); // 铒桶
                        output.accept(ECMaterialItems.THULIUM_BUCKET.get()); // 铥桶
                        output.accept(ECMaterialItems.YTTERBIUM_BUCKET.get()); // 镱桶
                        output.accept(ECMaterialItems.LUTETIUM_BUCKET.get()); // 镥桶
                        output.accept(ECMaterialItems.HAFNIUM_BUCKET.get()); // 铪桶
                        output.accept(ECMaterialItems.TANTALUM_BUCKET.get()); // 钽桶
                        output.accept(ECMaterialItems.TUNGSTEN_BUCKET.get()); // 钨桶
                        output.accept(ECMaterialItems.RHENIUM_BUCKET.get()); // 铼桶
                        output.accept(ECMaterialItems.OSMIUM_BUCKET.get()); // 锇桶
                        output.accept(ECMaterialItems.IRIDIUM_BUCKET.get()); // 铱桶
                        output.accept(ECMaterialItems.PLATINUM_BUCKET.get()); // 铂桶
                        output.accept(ECMaterialItems.GOLD_BUCKET.get()); // 金桶
                        output.accept(ECMaterialItems.MERCURY_BUCKET.get()); // 汞桶
                        output.accept(ECMaterialItems.THALLIUM_BUCKET.get()); // 铊桶
                        output.accept(ECMaterialItems.LEAD_BUCKET.get()); // 铅桶
                        output.accept(ECMaterialItems.BISMUTH_BUCKET.get()); // 铋桶
                        output.accept(ECMaterialItems.POLONIUM_BUCKET.get()); // 钋桶
                        output.accept(ECMaterialItems.ASTATINE_BUCKET.get()); // 砹桶
                        output.accept(ECMaterialItems.RADON_BUCKET.get()); // 氡桶
                        output.accept(ECMaterialItems.FRANCIUM_BUCKET.get()); // 钫桶
                        output.accept(ECMaterialItems.RADIUM_BUCKET.get()); // 镭桶
                        output.accept(ECMaterialItems.ACTINIUM_BUCKET.get()); // 锕桶
                        output.accept(ECMaterialItems.THORIUM_BUCKET.get()); // 钍桶
                        output.accept(ECMaterialItems.PROTACTINIUM_BUCKET.get()); // 镤桶
                        output.accept(ECMaterialItems.URANIUM_BUCKET.get()); // 铀桶
                        output.accept(ECMaterialItems.NEPTUNIUM_BUCKET.get()); // 镎桶
                        output.accept(ECMaterialItems.PLUTONIUM_BUCKET.get()); // 钚桶
                        output.accept(ECMaterialItems.AMERICIUM_BUCKET.get()); // 镅桶
                        output.accept(ECMaterialItems.CURIUM_BUCKET.get()); // 锔桶
                        output.accept(ECMaterialItems.BERKELIUM_BUCKET.get()); // 锫桶
                        output.accept(ECMaterialItems.CALIFORNIUM_BUCKET.get()); // 锎桶
                        output.accept(ECMaterialItems.EINSTEINIUM_BUCKET.get()); // 锿桶
                        output.accept(ECMaterialItems.FERMIUM_BUCKET.get()); // 镄桶
                        output.accept(ECMaterialItems.MENDELEVIUM_BUCKET.get()); // 钔桶
                        output.accept(ECMaterialItems.NOBELIUM_BUCKET.get()); // 锘桶
                        output.accept(ECMaterialItems.LAWRENCIUM_BUCKET.get()); // 铹桶
                        output.accept(ECMaterialItems.RUTHERFORDIUM_BUCKET.get()); // 𬬻桶
                        output.accept(ECMaterialItems.DUBNIUM_BUCKET.get()); // 𬭊桶
                        output.accept(ECMaterialItems.SEABORGIUM_BUCKET.get()); // 𬭳桶
                        output.accept(ECMaterialItems.BOHRIUM_BUCKET.get()); // 𬭛桶
                        output.accept(ECMaterialItems.HASSIUM_BUCKET.get()); // 𬭶桶
                        output.accept(ECMaterialItems.MEITNERIUM_BUCKET.get()); // 鿏桶
                        output.accept(ECMaterialItems.DARMSTADTIUM_BUCKET.get()); // 𫟼桶
                        output.accept(ECMaterialItems.ROENTGENIUM_BUCKET.get()); // 𬬭桶
                        output.accept(ECMaterialItems.COPERNICIUM_BUCKET.get()); // 鿔桶
                        output.accept(ECMaterialItems.NIHONIUM_BUCKET.get()); // 鉨桶
                        output.accept(ECMaterialItems.FLEROVIUM_BUCKET.get()); // 鈇桶
                        output.accept(ECMaterialItems.MOSCOVIUM_BUCKET.get()); // 镆桶
                        output.accept(ECMaterialItems.LIVERMORIUM_BUCKET.get()); // 鉝桶
                        output.accept(ECMaterialItems.TENNESSINE_BUCKET.get()); // 鿬桶
                        output.accept(ECMaterialItems.OGANESSON_BUCKET.get()); // 鿫桶
                        output.accept(ECMaterialItems.LONGIUM_BUCKET.get()); // 鑨桶
                        output.accept(ECMaterialItems.MYSTERIUM_BUCKET.get()); // 镾桶

                    })
                    .build());


    // 化学元素核心：元素气体
    public static final Supplier<CreativeModeTab> RCE_ELEMENT_GAS_TAB =
            CREATIVE_MODE_TAB.register("rce_element_gas_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ECMaterialItems.HYDROGEN_BUCKET.get()))
                    .title(Component.translatable("itemGroup.elementum_core.rce_element_gas_tab"))
                    .displayItems((parameters, output) -> {

                        output.accept(ECMaterialItems.HYDROGEN_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.HELIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.LITHIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.BERYLLIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.BORON_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.CARBON_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.NITROGEN_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.OXYGEN_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.FLUORINE_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.NEON_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.SODIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.MAGNESIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.ALUMINUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.SILICON_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.PHOSPHORUS_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.SULFUR_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.CHLORINE_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.ARGON_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.POTASSIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.CALCIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.SCANDIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.TITANIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.VANADIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.CHROMIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.MANGANESE_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.IRON_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.COBALT_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.NICKEL_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.COPPER_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.ZINC_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.GALLIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.GERMANIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.ARSENIC_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.SELENIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.BROMINE_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.KRYPTON_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.RUBIDIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.STRONTIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.YTTRIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.ZIRCONIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.NIOBIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.MOLYBDENUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.TECHNETIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.RUTHENIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.RHODIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.PALLADIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.SILVER_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.CADMIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.INDIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.TIN_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.ANTIMONY_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.TELLURIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.IODINE_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.XENON_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.CESIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.BARIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.LANTHANUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.CERIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.PRASEODYMIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.NEODYMIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.PROMETHIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.SAMARIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.EUROPIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.GADOLINIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.TERBIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.DYSPROSIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.HOLMIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.ERBIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.THULIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.YTTERBIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.LUTETIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.HAFNIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.TANTALUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.TUNGSTEN_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.RHENIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.OSMIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.IRIDIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.PLATINUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.GOLD_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.MERCURY_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.THALLIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.LEAD_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.BISMUTH_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.POLONIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.ASTATINE_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.RADON_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.FRANCIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.RADIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.ACTINIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.THORIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.PROTACTINIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.URANIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.NEPTUNIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.PLUTONIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.AMERICIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.CURIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.BERKELIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.CALIFORNIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.EINSTEINIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.FERMIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.MENDELEVIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.NOBELIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.LAWRENCIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.RUTHERFORDIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.DUBNIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.SEABORGIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.BOHRIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.HASSIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.MEITNERIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.DARMSTADTIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.ROENTGENIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.COPERNICIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.NIHONIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.FLEROVIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.MOSCOVIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.LIVERMORIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.TENNESSINE_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.OGANESSON_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.LONGIUM_GAS_BUCKET.get());
                        output.accept(ECMaterialItems.MYSTERIUM_GAS_BUCKET.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}