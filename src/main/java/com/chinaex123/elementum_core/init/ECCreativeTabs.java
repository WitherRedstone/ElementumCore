package com.chinaex123.elementum_core.init;

import com.chinaex123.elementum_core.ElementumCore;
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
                    .icon(() -> new ItemStack(ECItemMaterials.NEODYMIUM.INGOT.get()))
                    .title(Component.translatable("itemGroup.elementum_core.rce_element_item_tab"))
                    .displayItems((parameters, output) -> {

                        ECItemMaterials.HYDROGEN.addToCreativeTab(output::accept); // 氢
                        ECItemMaterials.HELIUM.addToCreativeTab(output::accept); // 氦
                        ECItemMaterials.LITHIUM.addToCreativeTab(output::accept); // 锂
                        ECItemMaterials.BERYLLIUM.addToCreativeTab(output::accept); // 铍
                        ECItemMaterials.BORON.addToCreativeTab(output::accept); // 硼
                        ECItemMaterials.CARBON.addToCreativeTab(output::accept); // 碳
                        ECItemMaterials.NITROGEN.addToCreativeTab(output::accept); // 氮
                        ECItemMaterials.OXYGEN.addToCreativeTab(output::accept); // 氧
                        ECItemMaterials.FLUORINE.addToCreativeTab(output::accept); // 氟
                        ECItemMaterials.NEON.addToCreativeTab(output::accept); // 氖
                        ECItemMaterials.SODIUM.addToCreativeTab(output::accept); // 钠
                        ECItemMaterials.MAGNESIUM.addToCreativeTab(output::accept); // 镁
                        ECItemMaterials.ALUMINUM.addToCreativeTab(output::accept); // 铝
                        ECItemMaterials.SILICON.addToCreativeTab(output::accept); // 硅
                        ECItemMaterials.PHOSPHORUS.addToCreativeTab(output::accept); // 磷
                        ECItemMaterials.SULFUR.addToCreativeTab(output::accept); // 硫
                        ECItemMaterials.CHLORINE.addToCreativeTab(output::accept); // 氯
                        ECItemMaterials.ARGON.addToCreativeTab(output::accept); // 氩
                        ECItemMaterials.POTASSIUM.addToCreativeTab(output::accept); // 钾
                        ECItemMaterials.CALCIUM.addToCreativeTab(output::accept); // 钙
                        ECItemMaterials.SCANDIUM.addToCreativeTab(output::accept); // 钪
                        ECItemMaterials.TITANIUM.addToCreativeTab(output::accept); // 钛
                        ECItemMaterials.VANADIUM.addToCreativeTab(output::accept); // 钒
                        ECItemMaterials.CHROMIUM.addToCreativeTab(output::accept); // 铬
                        ECItemMaterials.MANGANESE.addToCreativeTab(output::accept); // 锰
                        ECItemMaterials.IRON.addToCreativeTab(output::accept); // 铁
                        ECItemMaterials.COBALT.addToCreativeTab(output::accept); // 钴
                        ECItemMaterials.NICKEL.addToCreativeTab(output::accept); // 镍
                        ECItemMaterials.COPPER.addToCreativeTab(output::accept); // 铜
                        ECItemMaterials.ZINC.addToCreativeTab(output::accept); // 锌
                        ECItemMaterials.GALLIUM.addToCreativeTab(output::accept); // 镓
                        ECItemMaterials.GERMANIUM.addToCreativeTab(output::accept); // 锗
                        ECItemMaterials.ARSENIC.addToCreativeTab(output::accept); // 砷
                        ECItemMaterials.SELENIUM.addToCreativeTab(output::accept); // 硒
                        ECItemMaterials.BROMINE.addToCreativeTab(output::accept); // 溴
                        ECItemMaterials.KRYPTON.addToCreativeTab(output::accept); // 氪
                        ECItemMaterials.RUBIDIUM.addToCreativeTab(output::accept); // 铷
                        ECItemMaterials.STRONTIUM.addToCreativeTab(output::accept); // 锶
                        ECItemMaterials.YTTRIUM.addToCreativeTab(output::accept); // 钇
                        ECItemMaterials.ZIRCONIUM.addToCreativeTab(output::accept); // 锆
                        ECItemMaterials.NIOBIUM.addToCreativeTab(output::accept); // 铌
                        ECItemMaterials.MOLYBDENUM.addToCreativeTab(output::accept); // 钼
                        ECItemMaterials.TECHNETIUM.addToCreativeTab(output::accept); // 锝
                        ECItemMaterials.RUTHENIUM.addToCreativeTab(output::accept); // 钌
                        ECItemMaterials.RHODIUM.addToCreativeTab(output::accept); // 铑
                        ECItemMaterials.PALLADIUM.addToCreativeTab(output::accept); // 钯
                        ECItemMaterials.SILVER.addToCreativeTab(output::accept); // 银
                        ECItemMaterials.CADMIUM.addToCreativeTab(output::accept); // 镉
                        ECItemMaterials.INDIUM.addToCreativeTab(output::accept); // 铟
                        ECItemMaterials.TIN.addToCreativeTab(output::accept); // 锡
                        ECItemMaterials.ANTIMONY.addToCreativeTab(output::accept); // 锑
                        ECItemMaterials.TELLURIUM.addToCreativeTab(output::accept); // 碲
                        ECItemMaterials.IODINE.addToCreativeTab(output::accept); // 碘
                        ECItemMaterials.XENON.addToCreativeTab(output::accept); // 氙
                        ECItemMaterials.CESIUM.addToCreativeTab(output::accept); // 铯
                        ECItemMaterials.BARIUM.addToCreativeTab(output::accept); // 钡
                        ECItemMaterials.LANTHANUM.addToCreativeTab(output::accept); // 镧
                        ECItemMaterials.CERIUM.addToCreativeTab(output::accept); // 铈
                        ECItemMaterials.PRASEODYMIUM.addToCreativeTab(output::accept); // 镨
                        ECItemMaterials.NEODYMIUM.addToCreativeTab(output::accept); // 钕
                        ECItemMaterials.PROMETHIUM.addToCreativeTab(output::accept); // 钷
                        ECItemMaterials.SAMARIUM.addToCreativeTab(output::accept); // 钐
                        ECItemMaterials.EUROPIUM.addToCreativeTab(output::accept); // 铕
                        ECItemMaterials.GADOLINIUM.addToCreativeTab(output::accept); // 钆
                        ECItemMaterials.TERBIUM.addToCreativeTab(output::accept); // 铽
                        ECItemMaterials.DYSPROSIUM.addToCreativeTab(output::accept); // 镝
                        ECItemMaterials.HOLMIUM.addToCreativeTab(output::accept); // 钬
                        ECItemMaterials.ERBIUM.addToCreativeTab(output::accept); // 铒
                        ECItemMaterials.THULIUM.addToCreativeTab(output::accept); // 铥
                        ECItemMaterials.YTTERBIUM.addToCreativeTab(output::accept); // 镱
                        ECItemMaterials.LUTETIUM.addToCreativeTab(output::accept); // 镥
                        ECItemMaterials.HAFNIUM.addToCreativeTab(output::accept); // 铪
                        ECItemMaterials.TANTALUM.addToCreativeTab(output::accept); // 钽
                        ECItemMaterials.TUNGSTEN.addToCreativeTab(output::accept); // 钨
                        ECItemMaterials.RHENIUM.addToCreativeTab(output::accept); // 铼
                        ECItemMaterials.OSMIUM.addToCreativeTab(output::accept); // 锇
                        ECItemMaterials.IRIDIUM.addToCreativeTab(output::accept); // 铱
                        ECItemMaterials.PLATINUM.addToCreativeTab(output::accept); // 铂
                        ECItemMaterials.GOLD.addToCreativeTab(output::accept); // 金
                        ECItemMaterials.MERCURY.addToCreativeTab(output::accept); // 汞
                        ECItemMaterials.THALLIUM.addToCreativeTab(output::accept); // 铊
                        ECItemMaterials.LEAD.addToCreativeTab(output::accept); // 铅
                        ECItemMaterials.BISMUTH.addToCreativeTab(output::accept); // 铋
                        ECItemMaterials.POLONIUM.addToCreativeTab(output::accept); // 钋
                        ECItemMaterials.ASTATINE.addToCreativeTab(output::accept); // 砹
                        ECItemMaterials.RADON.addToCreativeTab(output::accept); // 氡
                        ECItemMaterials.FRANCIUM.addToCreativeTab(output::accept); // 钫
                        ECItemMaterials.RADIUM.addToCreativeTab(output::accept); // 镭
                        ECItemMaterials.ACTINIUM.addToCreativeTab(output::accept); // 锕
                        ECItemMaterials.THORIUM.addToCreativeTab(output::accept); // 钍
                        ECItemMaterials.PROTACTINIUM.addToCreativeTab(output::accept); // 镤
                        ECItemMaterials.URANIUM.addToCreativeTab(output::accept); // 铀
                        ECItemMaterials.NEPTUNIUM.addToCreativeTab(output::accept); // 镎
                        ECItemMaterials.PLUTONIUM.addToCreativeTab(output::accept); // 钚
                        ECItemMaterials.AMERICIUM.addToCreativeTab(output::accept); // 镅
                        ECItemMaterials.CURIUM.addToCreativeTab(output::accept); // 锔
                        ECItemMaterials.BERKELIUM.addToCreativeTab(output::accept); // 锫
                        ECItemMaterials.CALIFORNIUM.addToCreativeTab(output::accept); // 锎
                        ECItemMaterials.EINSTEINIUM.addToCreativeTab(output::accept); // 锿
                        ECItemMaterials.FERMIUM.addToCreativeTab(output::accept); // 镄
                        ECItemMaterials.MENDELEVIUM.addToCreativeTab(output::accept); // 钔
                        ECItemMaterials.NOBELIUM.addToCreativeTab(output::accept); // 锘
                        ECItemMaterials.LAWRENCIUM.addToCreativeTab(output::accept); // 铹
                        ECItemMaterials.RUTHERFORDIUM.addToCreativeTab(output::accept); // 𬬻
                        ECItemMaterials.DUBNIUM.addToCreativeTab(output::accept); // 𬭊
                        ECItemMaterials.SEABORGIUM.addToCreativeTab(output::accept); // 𬭳
                        ECItemMaterials.BOHRIUM.addToCreativeTab(output::accept); // 𬭛
                        ECItemMaterials.HASSIUM.addToCreativeTab(output::accept); // 𬭶
                        ECItemMaterials.MEITNERIUM.addToCreativeTab(output::accept); // 鿏
                        ECItemMaterials.DARMSTADTIUM.addToCreativeTab(output::accept); // 𫟼
                        ECItemMaterials.ROENTGENIUM.addToCreativeTab(output::accept); // 𬬭
                        ECItemMaterials.COPERNICIUM.addToCreativeTab(output::accept); // 鿔
                        ECItemMaterials.NIHONIUM.addToCreativeTab(output::accept); // 鿭
                        ECItemMaterials.FLEROVIUM.addToCreativeTab(output::accept); // 𫓧
                        ECItemMaterials.MOSCOVIUM.addToCreativeTab(output::accept); // 镆
                        ECItemMaterials.LIVERMORIUM.addToCreativeTab(output::accept); // 𫟷
                        ECItemMaterials.TENNESSINE.addToCreativeTab(output::accept); // 鿬
                        ECItemMaterials.OGANESSON.addToCreativeTab(output::accept); // 鿫
                        ECItemMaterials.LONGIUM.addToCreativeTab(output::accept); // 鑨
                        ECItemMaterials.MYSTERIUM.addToCreativeTab(output::accept); // 镾

                    })
                    .build());

    // 化学元素核心：元素方块
    public static final Supplier<CreativeModeTab> RCE_ELEMENT_BLOCK_TAB =
            CREATIVE_MODE_TAB.register("rce_element_block_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ECBlockElements.NEODYMIUM.BLOCK.get()))
                    .title(Component.translatable("itemGroup.elementum_core.rce_element_block_tab"))
                    .displayItems((parameters, output) -> {

                        ECBlockElements.HYDROGEN.addToCreativeTab(output::accept); // 氢
                        ECBlockElements.HELIUM.addToCreativeTab(output::accept); // 氦
                        ECBlockElements.LITHIUM.addToCreativeTab(output::accept); // 锂
                        ECBlockElements.BERYLLIUM.addToCreativeTab(output::accept); // 铍
                        ECBlockElements.BORON.addToCreativeTab(output::accept); // 硼
                        ECBlockElements.CARBON.addToCreativeTab(output::accept); // 碳
                        ECBlockElements.NITROGEN.addToCreativeTab(output::accept); // 氮
                        ECBlockElements.OXYGEN.addToCreativeTab(output::accept); // 氧
                        ECBlockElements.FLUORINE.addToCreativeTab(output::accept); // 氟
                        ECBlockElements.NEON.addToCreativeTab(output::accept); // 氖
                        ECBlockElements.SODIUM.addToCreativeTab(output::accept); // 钠
                        ECBlockElements.MAGNESIUM.addToCreativeTab(output::accept); // 镁
                        ECBlockElements.ALUMINUM.addToCreativeTab(output::accept); // 铝
                        ECBlockElements.SILICON.addToCreativeTab(output::accept); // 硅
                        ECBlockElements.PHOSPHORUS.addToCreativeTab(output::accept); // 磷
                        ECBlockElements.SULFUR.addToCreativeTab(output::accept); // 硫
                        ECBlockElements.CHLORINE.addToCreativeTab(output::accept); // 氯
                        ECBlockElements.ARGON.addToCreativeTab(output::accept); // 氩
                        ECBlockElements.POTASSIUM.addToCreativeTab(output::accept); // 钾
                        ECBlockElements.CALCIUM.addToCreativeTab(output::accept); // 钙
                        ECBlockElements.SCANDIUM.addToCreativeTab(output::accept); // 钪
                        ECBlockElements.TITANIUM.addToCreativeTab(output::accept); // 钛
                        ECBlockElements.VANADIUM.addToCreativeTab(output::accept); // 钒
                        ECBlockElements.CHROMIUM.addToCreativeTab(output::accept); // 铬
                        ECBlockElements.MANGANESE.addToCreativeTab(output::accept); // 锰
                        ECBlockElements.IRON.addToCreativeTab(output::accept); // 铁
                        ECBlockElements.COBALT.addToCreativeTab(output::accept); // 钴
                        ECBlockElements.NICKEL.addToCreativeTab(output::accept); // 镍
                        ECBlockElements.COPPER.addToCreativeTab(output::accept); // 铜
                        ECBlockElements.ZINC.addToCreativeTab(output::accept); // 锌
                        ECBlockElements.GALLIUM.addToCreativeTab(output::accept); // 镓
                        ECBlockElements.GERMANIUM.addToCreativeTab(output::accept); // 锗
                        ECBlockElements.ARSENIC.addToCreativeTab(output::accept); // 砷
                        ECBlockElements.SELENIUM.addToCreativeTab(output::accept); // 硒
                        ECBlockElements.BROMINE.addToCreativeTab(output::accept); // 溴
                        ECBlockElements.KRYPTON.addToCreativeTab(output::accept); // 氪
                        ECBlockElements.RUBIDIUM.addToCreativeTab(output::accept); // 铷
                        ECBlockElements.STRONTIUM.addToCreativeTab(output::accept); // 锶
                        ECBlockElements.YTTRIUM.addToCreativeTab(output::accept); // 钇
                        ECBlockElements.ZIRCONIUM.addToCreativeTab(output::accept); // 锆
                        ECBlockElements.NIOBIUM.addToCreativeTab(output::accept); // 铌
                        ECBlockElements.MOLYBDENUM.addToCreativeTab(output::accept); // 钼
                        ECBlockElements.TECHNETIUM.addToCreativeTab(output::accept); // 锝
                        ECBlockElements.RUTHENIUM.addToCreativeTab(output::accept); // 钌
                        ECBlockElements.RHODIUM.addToCreativeTab(output::accept); // 铑
                        ECBlockElements.PALLADIUM.addToCreativeTab(output::accept); // 钯
                        ECBlockElements.SILVER.addToCreativeTab(output::accept); // 银
                        ECBlockElements.CADMIUM.addToCreativeTab(output::accept); // 镉
                        ECBlockElements.INDIUM.addToCreativeTab(output::accept); // 铟
                        ECBlockElements.TIN.addToCreativeTab(output::accept); // 锡
                        ECBlockElements.ANTIMONY.addToCreativeTab(output::accept); // 锑
                        ECBlockElements.TELLURIUM.addToCreativeTab(output::accept); // 碲
                        ECBlockElements.IODINE.addToCreativeTab(output::accept); // 碘
                        ECBlockElements.XENON.addToCreativeTab(output::accept); // 氙
                        ECBlockElements.CESIUM.addToCreativeTab(output::accept); // 铯
                        ECBlockElements.BARIUM.addToCreativeTab(output::accept); // 钡
                        ECBlockElements.LANTHANUM.addToCreativeTab(output::accept); // 镧
                        ECBlockElements.CERIUM.addToCreativeTab(output::accept); // 铈
                        ECBlockElements.PRASEODYMIUM.addToCreativeTab(output::accept); // 镨
                        ECBlockElements.NEODYMIUM.addToCreativeTab(output::accept); // 钕
                        ECBlockElements.PROMETHIUM.addToCreativeTab(output::accept); // 钷
                        ECBlockElements.SAMARIUM.addToCreativeTab(output::accept); // 钐
                        ECBlockElements.EUROPIUM.addToCreativeTab(output::accept); // 铕
                        ECBlockElements.GADOLINIUM.addToCreativeTab(output::accept); // 钆
                        ECBlockElements.TERBIUM.addToCreativeTab(output::accept); // 铽
                        ECBlockElements.DYSPROSIUM.addToCreativeTab(output::accept); // 镝
                        ECBlockElements.HOLMIUM.addToCreativeTab(output::accept); // 钬
                        ECBlockElements.ERBIUM.addToCreativeTab(output::accept); // 铒
                        ECBlockElements.THULIUM.addToCreativeTab(output::accept); // 铥
                        ECBlockElements.YTTERBIUM.addToCreativeTab(output::accept); // 镱
                        ECBlockElements.LUTETIUM.addToCreativeTab(output::accept); // 镥
                        ECBlockElements.HAFNIUM.addToCreativeTab(output::accept); // 铪
                        ECBlockElements.TANTALUM.addToCreativeTab(output::accept); // 钽
                        ECBlockElements.TUNGSTEN.addToCreativeTab(output::accept); // 钨
                        ECBlockElements.RHENIUM.addToCreativeTab(output::accept); // 铼
                        ECBlockElements.OSMIUM.addToCreativeTab(output::accept); // 锇
                        ECBlockElements.IRIDIUM.addToCreativeTab(output::accept); // 铱
                        ECBlockElements.PLATINUM.addToCreativeTab(output::accept); // 铂
                        ECBlockElements.GOLD.addToCreativeTab(output::accept); // 金
                        ECBlockElements.MERCURY.addToCreativeTab(output::accept); // 汞
                        ECBlockElements.THALLIUM.addToCreativeTab(output::accept); // 铊
                        ECBlockElements.LEAD.addToCreativeTab(output::accept); // 铅
                        ECBlockElements.BISMUTH.addToCreativeTab(output::accept); // 铋
                        ECBlockElements.POLONIUM.addToCreativeTab(output::accept); // 钋
                        ECBlockElements.ASTATINE.addToCreativeTab(output::accept); // 砹
                        ECBlockElements.RADON.addToCreativeTab(output::accept); // 氡
                        ECBlockElements.FRANCIUM.addToCreativeTab(output::accept); // 钫
                        ECBlockElements.RADIUM.addToCreativeTab(output::accept); // 镭
                        ECBlockElements.ACTINIUM.addToCreativeTab(output::accept); // 锕
                        ECBlockElements.THORIUM.addToCreativeTab(output::accept); // 钍
                        ECBlockElements.PROTACTINIUM.addToCreativeTab(output::accept); // 镤
                        ECBlockElements.URANIUM.addToCreativeTab(output::accept); // 铀
                        ECBlockElements.NEPTUNIUM.addToCreativeTab(output::accept); // 镎
                        ECBlockElements.PLUTONIUM.addToCreativeTab(output::accept); // 钚
                        ECBlockElements.AMERICIUM.addToCreativeTab(output::accept); // 镅
                        ECBlockElements.CURIUM.addToCreativeTab(output::accept); // 锔
                        ECBlockElements.BERKELIUM.addToCreativeTab(output::accept); // 锫
                        ECBlockElements.CALIFORNIUM.addToCreativeTab(output::accept); // 锎
                        ECBlockElements.EINSTEINIUM.addToCreativeTab(output::accept); // 锿
                        ECBlockElements.FERMIUM.addToCreativeTab(output::accept); // 镄
                        ECBlockElements.MENDELEVIUM.addToCreativeTab(output::accept); // 钔
                        ECBlockElements.NOBELIUM.addToCreativeTab(output::accept); // 锘
                        ECBlockElements.LAWRENCIUM.addToCreativeTab(output::accept); // 铹
                        ECBlockElements.RUTHERFORDIUM.addToCreativeTab(output::accept); // 𬬻
                        ECBlockElements.DUBNIUM.addToCreativeTab(output::accept); // 𬭊
                        ECBlockElements.SEABORGIUM.addToCreativeTab(output::accept); // 𬭳
                        ECBlockElements.BOHRIUM.addToCreativeTab(output::accept); // 𬭛
                        ECBlockElements.HASSIUM.addToCreativeTab(output::accept); // 𬭶
                        ECBlockElements.MEITNERIUM.addToCreativeTab(output::accept); // 鿏
                        ECBlockElements.DARMSTADTIUM.addToCreativeTab(output::accept); // 𬭊
                        ECBlockElements.ROENTGENIUM.addToCreativeTab(output::accept); // 𬬭
                        ECBlockElements.COPERNICIUM.addToCreativeTab(output::accept); // 鿔
                        ECBlockElements.NIHONIUM.addToCreativeTab(output::accept); // 鿭
                        ECBlockElements.FLEROVIUM.addToCreativeTab(output::accept); // 𫓧
                        ECBlockElements.MOSCOVIUM.addToCreativeTab(output::accept); // 镆
                        ECBlockElements.LIVERMORIUM.addToCreativeTab(output::accept); // 𫟷
                        ECBlockElements.TENNESSINE.addToCreativeTab(output::accept); // 鿬
                        ECBlockElements.OGANESSON.addToCreativeTab(output::accept); // 鿫
                        ECBlockElements.LONGIUM.addToCreativeTab(output::accept); // 鑨
                        ECBlockElements.MYSTERIUM.addToCreativeTab(output::accept); // 镾

                        ECBlockElements.LEPIDOLITE.addToCreativeTab(output::accept); // 锂云母
                        ECBlockElements.BERYL.addToCreativeTab(output::accept); // 绿柱石
                        ECBlockElements.BORAX.addToCreativeTab(output::accept); // 硼砂
                        ECBlockElements.MAGNESITE.addToCreativeTab(output::accept); // 菱镁矿
                        ECBlockElements.NITRE.addToCreativeTab(output::accept); // 硝石
                        ECBlockElements.APATITE.addToCreativeTab(output::accept); // 磷灰石
                        ECBlockElements.MONAZITE.addToCreativeTab(output::accept); // 独居石
                        ECBlockElements.CINNABAR.addToCreativeTab(output::accept); // 朱砂
                        ECBlockElements.SYLVITE.addToCreativeTab(output::accept); // 钾石盐
                        ECBlockElements.THORTVEITITE.addToCreativeTab(output::accept); // 钪钇石
                        ECBlockElements.ILMENITE.addToCreativeTab(output::accept); // 钛铁矿
                        ECBlockElements.PATRONITE.addToCreativeTab(output::accept); // 绿硫钒矿
                        ECBlockElements.CHROMITE.addToCreativeTab(output::accept); // 铬铁矿
                        ECBlockElements.PYROLUSITE.addToCreativeTab(output::accept); // 软锰矿
                        ECBlockElements.ARGYRODITE.addToCreativeTab(output::accept); // 硫锗矿
                        ECBlockElements.ARSENOPYRITE.addToCreativeTab(output::accept); // 毒砂
                        ECBlockElements.CARNALLITE.addToCreativeTab(output::accept); // 光卤石
                        ECBlockElements.CELESTINE.addToCreativeTab(output::accept); // 天青石
                        ECBlockElements.COBALTITE.addToCreativeTab(output::accept); // 辉钴矿
                        ECBlockElements.ZIRCON.addToCreativeTab(output::accept); // 锆英砂
                        ECBlockElements.NIOBITE.addToCreativeTab(output::accept); // 铌铁矿
                        ECBlockElements.MOLYBDENITE.addToCreativeTab(output::accept); // 辉钼矿
                        ECBlockElements.STIBNITE.addToCreativeTab(output::accept); // 辉锑矿
                        ECBlockElements.POLLUCITE.addToCreativeTab(output::accept); // 铯沸石
                        ECBlockElements.BARITE.addToCreativeTab(output::accept); // 重晶石
                        ECBlockElements.PYRITE.addToCreativeTab(output::accept); // 黄铁矿

                    })
                    .build());


    // 化学元素核心：元素流体
    public static final Supplier<CreativeModeTab> RCE_ELEMENT_FLUID_TAB =
            CREATIVE_MODE_TAB.register("rce_element_fluid_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ECItemMaterials.LIQUID_NEODYMIUM_BUCKET.get()))
                    .title(Component.translatable("itemGroup.elementum_core.rce_element_fluid_tab"))
                    .displayItems((parameters, output) -> {

                        output.accept(ECItemMaterials.LIQUID_HYDROGEN_BUCKET.get()); // 氢桶
                        output.accept(ECItemMaterials.LIQUID_HELIUM_BUCKET.get()); // 氦桶
                        output.accept(ECItemMaterials.LIQUID_LITHIUM_BUCKET.get()); // 锂桶
                        output.accept(ECItemMaterials.LIQUID_BERYLLIUM_BUCKET.get()); // 铍桶
                        output.accept(ECItemMaterials.LIQUID_BORON_BUCKET.get()); // 硼桶
                        output.accept(ECItemMaterials.LIQUID_CARBON_BUCKET.get()); // 碳桶
                        output.accept(ECItemMaterials.LIQUID_NITROGEN_BUCKET.get()); // 氮桶
                        output.accept(ECItemMaterials.LIQUID_OXYGEN_BUCKET.get()); // 氧桶
                        output.accept(ECItemMaterials.LIQUID_FLUORINE_BUCKET.get()); // 氟桶
                        output.accept(ECItemMaterials.LIQUID_NEON_BUCKET.get()); // 氖桶
                        output.accept(ECItemMaterials.LIQUID_SODIUM_BUCKET.get()); // 钠桶
                        output.accept(ECItemMaterials.LIQUID_MAGNESIUM_BUCKET.get()); // 镁桶
                        output.accept(ECItemMaterials.LIQUID_ALUMINUM_BUCKET.get()); // 铝桶
                        output.accept(ECItemMaterials.LIQUID_SILICON_BUCKET.get()); // 硅桶
                        output.accept(ECItemMaterials.LIQUID_PHOSPHORUS_BUCKET.get()); // 磷桶
                        output.accept(ECItemMaterials.LIQUID_SULFUR_BUCKET.get()); // 硫桶
                        output.accept(ECItemMaterials.LIQUID_CHLORINE_BUCKET.get()); // 氯桶
                        output.accept(ECItemMaterials.LIQUID_ARGON_BUCKET.get()); // 氩桶
                        output.accept(ECItemMaterials.LIQUID_POTASSIUM_BUCKET.get()); // 钾桶
                        output.accept(ECItemMaterials.LIQUID_CALCIUM_BUCKET.get()); // 钙桶
                        output.accept(ECItemMaterials.LIQUID_SCANDIUM_BUCKET.get()); // 钪桶
                        output.accept(ECItemMaterials.LIQUID_TITANIUM_BUCKET.get()); // 钛桶
                        output.accept(ECItemMaterials.LIQUID_VANADIUM_BUCKET.get()); // 钒桶
                        output.accept(ECItemMaterials.LIQUID_CHROMIUM_BUCKET.get()); // 铬桶
                        output.accept(ECItemMaterials.LIQUID_MANGANESE_BUCKET.get()); // 锰桶
                        output.accept(ECItemMaterials.LIQUID_IRON_BUCKET.get()); // 铁桶
                        output.accept(ECItemMaterials.LIQUID_COBALT_BUCKET.get()); // 钴桶
                        output.accept(ECItemMaterials.LIQUID_NICKEL_BUCKET.get()); // 镍桶
                        output.accept(ECItemMaterials.LIQUID_COPPER_BUCKET.get()); // 铜桶
                        output.accept(ECItemMaterials.LIQUID_ZINC_BUCKET.get()); // 锌桶
                        output.accept(ECItemMaterials.LIQUID_GALLIUM_BUCKET.get()); // 镓桶
                        output.accept(ECItemMaterials.LIQUID_GERMANIUM_BUCKET.get()); // 锗桶
                        output.accept(ECItemMaterials.LIQUID_ARSENIC_BUCKET.get()); // 砷桶
                        output.accept(ECItemMaterials.LIQUID_SELENIUM_BUCKET.get()); // 硒桶
                        output.accept(ECItemMaterials.BROMINE_BUCKET.get()); // 溴桶
                        output.accept(ECItemMaterials.LIQUID_KRYPTON_BUCKET.get()); // 氪桶
                        output.accept(ECItemMaterials.LIQUID_RUBIDIUM_BUCKET.get()); // 铷桶
                        output.accept(ECItemMaterials.LIQUID_STRONTIUM_BUCKET.get()); // 锶桶
                        output.accept(ECItemMaterials.LIQUID_YTTRIUM_BUCKET.get()); // 钇桶
                        output.accept(ECItemMaterials.LIQUID_ZIRCONIUM_BUCKET.get()); // 锆桶
                        output.accept(ECItemMaterials.LIQUID_NIOBIUM_BUCKET.get()); // 铌桶
                        output.accept(ECItemMaterials.LIQUID_MOLYBDENUM_BUCKET.get()); // 钼桶
                        output.accept(ECItemMaterials.LIQUID_TECHNETIUM_BUCKET.get()); // 锝桶
                        output.accept(ECItemMaterials.LIQUID_RUTHENIUM_BUCKET.get()); // 钌桶
                        output.accept(ECItemMaterials.LIQUID_RHODIUM_BUCKET.get()); // 铑桶
                        output.accept(ECItemMaterials.LIQUID_PALLADIUM_BUCKET.get()); // 钯桶
                        output.accept(ECItemMaterials.LIQUID_SILVER_BUCKET.get()); // 银桶
                        output.accept(ECItemMaterials.LIQUID_CADMIUM_BUCKET.get()); // 镉桶
                        output.accept(ECItemMaterials.LIQUID_INDIUM_BUCKET.get()); // 铟桶
                        output.accept(ECItemMaterials.LIQUID_TIN_BUCKET.get()); // 锡桶
                        output.accept(ECItemMaterials.LIQUID_ANTIMONY_BUCKET.get()); // 锑桶
                        output.accept(ECItemMaterials.LIQUID_TELLURIUM_BUCKET.get()); // 碲桶
                        output.accept(ECItemMaterials.LIQUID_IODINE_BUCKET.get()); // 碘桶
                        output.accept(ECItemMaterials.LIQUID_XENON_BUCKET.get()); // 氙桶
                        output.accept(ECItemMaterials.LIQUID_CESIUM_BUCKET.get()); // 铯桶
                        output.accept(ECItemMaterials.LIQUID_BARIUM_BUCKET.get()); // 钡桶
                        output.accept(ECItemMaterials.LIQUID_LANTHANUM_BUCKET.get()); // 镧桶
                        output.accept(ECItemMaterials.LIQUID_CERIUM_BUCKET.get()); // 铈桶
                        output.accept(ECItemMaterials.LIQUID_PRASEODYMIUM_BUCKET.get()); // 镨桶
                        output.accept(ECItemMaterials.LIQUID_NEODYMIUM_BUCKET.get()); // 钕桶
                        output.accept(ECItemMaterials.LIQUID_PROMETHIUM_BUCKET.get()); // 钷桶
                        output.accept(ECItemMaterials.LIQUID_SAMARIUM_BUCKET.get()); // 钐桶
                        output.accept(ECItemMaterials.LIQUID_EUROPIUM_BUCKET.get()); // 铕桶
                        output.accept(ECItemMaterials.LIQUID_GADOLINIUM_BUCKET.get()); // 钆桶
                        output.accept(ECItemMaterials.LIQUID_TERBIUM_BUCKET.get()); // 铽桶
                        output.accept(ECItemMaterials.LIQUID_DYSPROSIUM_BUCKET.get()); // 镝桶
                        output.accept(ECItemMaterials.LIQUID_HOLMIUM_BUCKET.get()); // 钬桶
                        output.accept(ECItemMaterials.LIQUID_ERBIUM_BUCKET.get()); // 铒桶
                        output.accept(ECItemMaterials.LIQUID_THULIUM_BUCKET.get()); // 铥桶
                        output.accept(ECItemMaterials.LIQUID_YTTERBIUM_BUCKET.get()); // 镱桶
                        output.accept(ECItemMaterials.LIQUID_LUTETIUM_BUCKET.get()); // 镥桶
                        output.accept(ECItemMaterials.LIQUID_HAFNIUM_BUCKET.get()); // 铪桶
                        output.accept(ECItemMaterials.LIQUID_TANTALUM_BUCKET.get()); // 钽桶
                        output.accept(ECItemMaterials.LIQUID_TUNGSTEN_BUCKET.get()); // 钨桶
                        output.accept(ECItemMaterials.LIQUID_RHENIUM_BUCKET.get()); // 铼桶
                        output.accept(ECItemMaterials.LIQUID_OSMIUM_BUCKET.get()); // 锇桶
                        output.accept(ECItemMaterials.LIQUID_IRIDIUM_BUCKET.get()); // 铱桶
                        output.accept(ECItemMaterials.LIQUID_PLATINUM_BUCKET.get()); // 铂桶
                        output.accept(ECItemMaterials.LIQUID_GOLD_BUCKET.get()); // 金桶
                        output.accept(ECItemMaterials.MERCURY_BUCKET.get()); // 汞桶
                        output.accept(ECItemMaterials.LIQUID_THALLIUM_BUCKET.get()); // 铊桶
                        output.accept(ECItemMaterials.LIQUID_LEAD_BUCKET.get()); // 铅桶
                        output.accept(ECItemMaterials.LIQUID_BISMUTH_BUCKET.get()); // 铋桶
                        output.accept(ECItemMaterials.LIQUID_POLONIUM_BUCKET.get()); // 钋桶
                        output.accept(ECItemMaterials.LIQUID_ASTATINE_BUCKET.get()); // 砹桶
                        output.accept(ECItemMaterials.LIQUID_RADON_BUCKET.get()); // 氡桶
                        output.accept(ECItemMaterials.LIQUID_FRANCIUM_BUCKET.get()); // 钫桶
                        output.accept(ECItemMaterials.LIQUID_RADIUM_BUCKET.get()); // 镭桶
                        output.accept(ECItemMaterials.LIQUID_ACTINIUM_BUCKET.get()); // 锕桶
                        output.accept(ECItemMaterials.LIQUID_THORIUM_BUCKET.get()); // 钍桶
                        output.accept(ECItemMaterials.LIQUID_PROTACTINIUM_BUCKET.get()); // 镤桶
                        output.accept(ECItemMaterials.LIQUID_URANIUM_BUCKET.get()); // 铀桶
                        output.accept(ECItemMaterials.LIQUID_NEPTUNIUM_BUCKET.get()); // 镎桶
                        output.accept(ECItemMaterials.LIQUID_PLUTONIUM_BUCKET.get()); // 钚桶
                        output.accept(ECItemMaterials.LIQUID_AMERICIUM_BUCKET.get()); // 镅桶
                        output.accept(ECItemMaterials.LIQUID_CURIUM_BUCKET.get()); // 锔桶
                        output.accept(ECItemMaterials.LIQUID_BERKELIUM_BUCKET.get()); // 锫桶
                        output.accept(ECItemMaterials.LIQUID_CALIFORNIUM_BUCKET.get()); // 锎桶
                        output.accept(ECItemMaterials.LIQUID_EINSTEINIUM_BUCKET.get()); // 锿桶
                        output.accept(ECItemMaterials.LIQUID_FERMIUM_BUCKET.get()); // 镄桶
                        output.accept(ECItemMaterials.LIQUID_MENDELEVIUM_BUCKET.get()); // 钔桶
                        output.accept(ECItemMaterials.LIQUID_NOBELIUM_BUCKET.get()); // 锘桶
                        output.accept(ECItemMaterials.LIQUID_LAWRENCIUM_BUCKET.get()); // 铹桶
                        output.accept(ECItemMaterials.LIQUID_RUTHERFORDIUM_BUCKET.get()); // 𬬻桶
                        output.accept(ECItemMaterials.LIQUID_DUBNIUM_BUCKET.get()); // 𬭊桶
                        output.accept(ECItemMaterials.LIQUID_SEABORGIUM_BUCKET.get()); // 𬭳桶
                        output.accept(ECItemMaterials.LIQUID_BOHRIUM_BUCKET.get()); // 𬭛桶
                        output.accept(ECItemMaterials.LIQUID_HASSIUM_BUCKET.get()); // 𬭶桶
                        output.accept(ECItemMaterials.LIQUID_MEITNERIUM_BUCKET.get()); // 鿏桶
                        output.accept(ECItemMaterials.LIQUID_DARMSTADTIUM_BUCKET.get()); // 𫟼桶
                        output.accept(ECItemMaterials.LIQUID_ROENTGENIUM_BUCKET.get()); // 𬬭桶
                        output.accept(ECItemMaterials.LIQUID_COPERNICIUM_BUCKET.get()); // 鿔桶
                        output.accept(ECItemMaterials.LIQUID_NIHONIUM_BUCKET.get()); // 鿭桶
                        output.accept(ECItemMaterials.LIQUID_FLEROVIUM_BUCKET.get()); // 𫓧桶
                        output.accept(ECItemMaterials.LIQUID_MOSCOVIUM_BUCKET.get()); // 镆桶
                        output.accept(ECItemMaterials.LIQUID_LIVERMORIUM_BUCKET.get()); // 𫟷桶
                        output.accept(ECItemMaterials.LIQUID_TENNESSINE_BUCKET.get()); // 鿬桶
                        output.accept(ECItemMaterials.LIQUID_OGANESSON_BUCKET.get()); // 鿫桶
                        output.accept(ECItemMaterials.LIQUID_LONGIUM_BUCKET.get()); // 鑨桶
                        output.accept(ECItemMaterials.LIQUID_MYSTERIUM_BUCKET.get()); // 镾桶

                    })
                    .build());


    // 化学元素核心：元素气体
    public static final Supplier<CreativeModeTab> RCE_ELEMENT_GAS_TAB =
            CREATIVE_MODE_TAB.register("rce_element_gas_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ECItemMaterials.HYDROGEN_GAS_BUCKET.get()))
                    .title(Component.translatable("itemGroup.elementum_core.rce_element_gas_tab"))
                    .displayItems((parameters, output) -> {

                        output.accept(ECItemMaterials.HYDROGEN_GAS_BUCKET.get());
                        output.accept(ECItemMaterials.HELIUM_GAS_BUCKET.get());
                        output.accept(ECItemMaterials.LITHIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.BERYLLIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.BORON_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.CARBON_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.NITROGEN_GAS_BUCKET.get());
                        output.accept(ECItemMaterials.OXYGEN_GAS_BUCKET.get());
                        output.accept(ECItemMaterials.FLUORINE_GAS_BUCKET.get());
                        output.accept(ECItemMaterials.NEON_GAS_BUCKET.get());
                        output.accept(ECItemMaterials.SODIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.MAGNESIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.ALUMINUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.SILICON_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.PHOSPHORUS_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.SULFUR_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.CHLORINE_GAS_BUCKET.get());
                        output.accept(ECItemMaterials.ARGON_GAS_BUCKET.get());
                        output.accept(ECItemMaterials.POTASSIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.CALCIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.SCANDIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.TITANIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.VANADIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.CHROMIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.MANGANESE_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.IRON_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.COBALT_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.NICKEL_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.COPPER_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.ZINC_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.GALLIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.GERMANIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.ARSENIC_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.SELENIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.BROMINE_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.KRYPTON_GAS_BUCKET.get());
                        output.accept(ECItemMaterials.RUBIDIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.STRONTIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.YTTRIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.ZIRCONIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.NIOBIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.MOLYBDENUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.TECHNETIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.RUTHENIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.RHODIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.PALLADIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.SILVER_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.CADMIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.INDIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.TIN_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.ANTIMONY_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.TELLURIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.IODINE_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.XENON_GAS_BUCKET.get());
                        output.accept(ECItemMaterials.CESIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.BARIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.LANTHANUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.CERIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.PRASEODYMIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.NEODYMIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.PROMETHIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.SAMARIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.EUROPIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.GADOLINIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.TERBIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.DYSPROSIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.HOLMIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.ERBIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.THULIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.YTTERBIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.LUTETIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.HAFNIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.TANTALUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.TUNGSTEN_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.RHENIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.OSMIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.IRIDIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.PLATINUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.GOLD_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.MERCURY_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.THALLIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.LEAD_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.BISMUTH_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.POLONIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.ASTATINE_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.RADON_GAS_BUCKET.get());
                        output.accept(ECItemMaterials.FRANCIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.RADIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.ACTINIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.THORIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.PROTACTINIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.URANIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.NEPTUNIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.PLUTONIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.AMERICIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.CURIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.BERKELIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.CALIFORNIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.EINSTEINIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.FERMIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.MENDELEVIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.NOBELIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.LAWRENCIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.RUTHERFORDIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.DUBNIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.SEABORGIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.BOHRIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.HASSIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.MEITNERIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.DARMSTADTIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.ROENTGENIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.COPERNICIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.NIHONIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.FLEROVIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.MOSCOVIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.LIVERMORIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.TENNESSINE_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.OGANESSON_GAS_BUCKET.get());
                        output.accept(ECItemMaterials.LONGIUM_VAPOR_BUCKET.get());
                        output.accept(ECItemMaterials.MYSTERIUM_VAPOR_BUCKET.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}