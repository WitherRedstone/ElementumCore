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
                    .icon(() -> new ItemStack(ECMaterialItems.GAS_CYLINDER.get()))
                    .title(Component.translatable("itemGroup.elementum_core.rce_material_item_tab"))
                    .displayItems((parameters, output) -> {

                        output.accept(ECMaterialItems.GAS_CYLINDER.get());
                        output.accept(ECMaterialItems.HYDROGEN_CYLINDER.get());
                        output.accept(ECMaterialItems.HELIUM_CYLINDER.get());
                        output.accept(ECMaterialItems.NITROGEN_CYLINDER.get());
                        output.accept(ECMaterialItems.OXYGEN_CYLINDER.get());
                        output.accept(ECMaterialItems.FLUORINE_CYLINDER.get());
                        output.accept(ECMaterialItems.NEON_CYLINDER.get());
                        output.accept(ECMaterialItems.CHLORINE_CYLINDER.get());
                        output.accept(ECMaterialItems.ARGON_CYLINDER.get());
                        output.accept(ECMaterialItems.KRYPTON_CYLINDER.get());
                        output.accept(ECMaterialItems.XENON_CYLINDER.get());
                        output.accept(ECMaterialItems.RADON_CYLINDER.get());
                        output.accept(ECMaterialItems.OGANESSON_CYLINDER.get());

                    })
                    .build());

    // 化学元素核心：元素物品
    public static final Supplier<CreativeModeTab> RCE_ELEMENT_ITEM_TAB =
            CREATIVE_MODE_TAB.register("rce_element_item_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ECElementItems.NEODYMIUM.INGOT.get()))
                    .title(Component.translatable("itemGroup.elementum_core.rce_element_item_tab"))
                    .displayItems((parameters, output) -> {

                        ECElementItems.HYDROGEN.addToCreativeTab(output::accept); // 氢
                        ECElementItems.HELIUM.addToCreativeTab(output::accept); // 氦
                        ECElementItems.LITHIUM.addToCreativeTab(output::accept); // 锂
                        ECElementItems.BERYLLIUM.addToCreativeTab(output::accept); // 铍
                        ECElementItems.BORON.addToCreativeTab(output::accept); // 硼
                        ECElementItems.CARBON.addToCreativeTab(output::accept); // 碳
                        ECElementItems.NITROGEN.addToCreativeTab(output::accept); // 氮
                        ECElementItems.OXYGEN.addToCreativeTab(output::accept); // 氧
                        ECElementItems.FLUORINE.addToCreativeTab(output::accept); // 氟
                        ECElementItems.NEON.addToCreativeTab(output::accept); // 氖
                        ECElementItems.SODIUM.addToCreativeTab(output::accept); // 钠
                        ECElementItems.MAGNESIUM.addToCreativeTab(output::accept); // 镁
                        ECElementItems.ALUMINUM.addToCreativeTab(output::accept); // 铝
                        ECElementItems.SILICON.addToCreativeTab(output::accept); // 硅
                        ECElementItems.PHOSPHORUS.addToCreativeTab(output::accept); // 磷
                        ECElementItems.SULFUR.addToCreativeTab(output::accept); // 硫
                        ECElementItems.CHLORINE.addToCreativeTab(output::accept); // 氯
                        ECElementItems.ARGON.addToCreativeTab(output::accept); // 氩
                        ECElementItems.POTASSIUM.addToCreativeTab(output::accept); // 钾
                        ECElementItems.CALCIUM.addToCreativeTab(output::accept); // 钙
                        ECElementItems.SCANDIUM.addToCreativeTab(output::accept); // 钪
                        ECElementItems.TITANIUM.addToCreativeTab(output::accept); // 钛
                        ECElementItems.VANADIUM.addToCreativeTab(output::accept); // 钒
                        ECElementItems.CHROMIUM.addToCreativeTab(output::accept); // 铬
                        ECElementItems.MANGANESE.addToCreativeTab(output::accept); // 锰
                        ECElementItems.IRON.addToCreativeTab(output::accept); // 铁
                        ECElementItems.COBALT.addToCreativeTab(output::accept); // 钴
                        ECElementItems.NICKEL.addToCreativeTab(output::accept); // 镍
                        ECElementItems.COPPER.addToCreativeTab(output::accept); // 铜
                        ECElementItems.ZINC.addToCreativeTab(output::accept); // 锌
                        ECElementItems.GALLIUM.addToCreativeTab(output::accept); // 镓
                        ECElementItems.GERMANIUM.addToCreativeTab(output::accept); // 锗
                        ECElementItems.ARSENIC.addToCreativeTab(output::accept); // 砷
                        ECElementItems.SELENIUM.addToCreativeTab(output::accept); // 硒
                        ECElementItems.BROMINE.addToCreativeTab(output::accept); // 溴
                        ECElementItems.KRYPTON.addToCreativeTab(output::accept); // 氪
                        ECElementItems.RUBIDIUM.addToCreativeTab(output::accept); // 铷
                        ECElementItems.STRONTIUM.addToCreativeTab(output::accept); // 锶
                        ECElementItems.YTTRIUM.addToCreativeTab(output::accept); // 钇
                        ECElementItems.ZIRCONIUM.addToCreativeTab(output::accept); // 锆
                        ECElementItems.NIOBIUM.addToCreativeTab(output::accept); // 铌
                        ECElementItems.MOLYBDENUM.addToCreativeTab(output::accept); // 钼
                        ECElementItems.TECHNETIUM.addToCreativeTab(output::accept); // 锝
                        ECElementItems.RUTHENIUM.addToCreativeTab(output::accept); // 钌
                        ECElementItems.RHODIUM.addToCreativeTab(output::accept); // 铑
                        ECElementItems.PALLADIUM.addToCreativeTab(output::accept); // 钯
                        ECElementItems.SILVER.addToCreativeTab(output::accept); // 银
                        ECElementItems.CADMIUM.addToCreativeTab(output::accept); // 镉
                        ECElementItems.INDIUM.addToCreativeTab(output::accept); // 铟
                        ECElementItems.TIN.addToCreativeTab(output::accept); // 锡
                        ECElementItems.ANTIMONY.addToCreativeTab(output::accept); // 锑
                        ECElementItems.TELLURIUM.addToCreativeTab(output::accept); // 碲
                        ECElementItems.IODINE.addToCreativeTab(output::accept); // 碘
                        ECElementItems.XENON.addToCreativeTab(output::accept); // 氙
                        ECElementItems.CESIUM.addToCreativeTab(output::accept); // 铯
                        ECElementItems.BARIUM.addToCreativeTab(output::accept); // 钡
                        ECElementItems.LANTHANUM.addToCreativeTab(output::accept); // 镧
                        ECElementItems.CERIUM.addToCreativeTab(output::accept); // 铈
                        ECElementItems.PRASEODYMIUM.addToCreativeTab(output::accept); // 镨
                        ECElementItems.NEODYMIUM.addToCreativeTab(output::accept); // 钕
                        ECElementItems.PROMETHIUM.addToCreativeTab(output::accept); // 钷
                        ECElementItems.SAMARIUM.addToCreativeTab(output::accept); // 钐
                        ECElementItems.EUROPIUM.addToCreativeTab(output::accept); // 铕
                        ECElementItems.GADOLINIUM.addToCreativeTab(output::accept); // 钆
                        ECElementItems.TERBIUM.addToCreativeTab(output::accept); // 铽
                        ECElementItems.DYSPROSIUM.addToCreativeTab(output::accept); // 镝
                        ECElementItems.HOLMIUM.addToCreativeTab(output::accept); // 钬
                        ECElementItems.ERBIUM.addToCreativeTab(output::accept); // 铒
                        ECElementItems.THULIUM.addToCreativeTab(output::accept); // 铥
                        ECElementItems.YTTERBIUM.addToCreativeTab(output::accept); // 镱
                        ECElementItems.LUTETIUM.addToCreativeTab(output::accept); // 镥
                        ECElementItems.HAFNIUM.addToCreativeTab(output::accept); // 铪
                        ECElementItems.TANTALUM.addToCreativeTab(output::accept); // 钽
                        ECElementItems.TUNGSTEN.addToCreativeTab(output::accept); // 钨
                        ECElementItems.RHENIUM.addToCreativeTab(output::accept); // 铼
                        ECElementItems.OSMIUM.addToCreativeTab(output::accept); // 锇
                        ECElementItems.IRIDIUM.addToCreativeTab(output::accept); // 铱
                        ECElementItems.PLATINUM.addToCreativeTab(output::accept); // 铂
                        ECElementItems.GOLD.addToCreativeTab(output::accept); // 金
                        ECElementItems.MERCURY.addToCreativeTab(output::accept); // 汞
                        ECElementItems.THALLIUM.addToCreativeTab(output::accept); // 铊
                        ECElementItems.LEAD.addToCreativeTab(output::accept); // 铅
                        ECElementItems.BISMUTH.addToCreativeTab(output::accept); // 铋
                        ECElementItems.POLONIUM.addToCreativeTab(output::accept); // 钋
                        ECElementItems.ASTATINE.addToCreativeTab(output::accept); // 砹
                        ECElementItems.RADON.addToCreativeTab(output::accept); // 氡
                        ECElementItems.FRANCIUM.addToCreativeTab(output::accept); // 钫
                        ECElementItems.RADIUM.addToCreativeTab(output::accept); // 镭
                        ECElementItems.ACTINIUM.addToCreativeTab(output::accept); // 锕
                        ECElementItems.THORIUM.addToCreativeTab(output::accept); // 钍
                        ECElementItems.PROTACTINIUM.addToCreativeTab(output::accept); // 镤
                        ECElementItems.URANIUM.addToCreativeTab(output::accept); // 铀
                        ECElementItems.NEPTUNIUM.addToCreativeTab(output::accept); // 镎
                        ECElementItems.PLUTONIUM.addToCreativeTab(output::accept); // 钚
                        ECElementItems.AMERICIUM.addToCreativeTab(output::accept); // 镅
                        ECElementItems.CURIUM.addToCreativeTab(output::accept); // 锔
                        ECElementItems.BERKELIUM.addToCreativeTab(output::accept); // 锫
                        ECElementItems.CALIFORNIUM.addToCreativeTab(output::accept); // 锎
                        ECElementItems.EINSTEINIUM.addToCreativeTab(output::accept); // 锿
                        ECElementItems.FERMIUM.addToCreativeTab(output::accept); // 镄
                        ECElementItems.MENDELEVIUM.addToCreativeTab(output::accept); // 钔
                        ECElementItems.NOBELIUM.addToCreativeTab(output::accept); // 锘
                        ECElementItems.LAWRENCIUM.addToCreativeTab(output::accept); // 铹
                        ECElementItems.RUTHERFORDIUM.addToCreativeTab(output::accept); // 𬬻
                        ECElementItems.DUBNIUM.addToCreativeTab(output::accept); // 𬭊
                        ECElementItems.SEABORGIUM.addToCreativeTab(output::accept); // 𬭳
                        ECElementItems.BOHRIUM.addToCreativeTab(output::accept); // 𬭛
                        ECElementItems.HASSIUM.addToCreativeTab(output::accept); // 𬭶
                        ECElementItems.MEITNERIUM.addToCreativeTab(output::accept); // 鿏
                        ECElementItems.DARMSTADTIUM.addToCreativeTab(output::accept); // 𫟼
                        ECElementItems.ROENTGENIUM.addToCreativeTab(output::accept); // 𬬭
                        ECElementItems.COPERNICIUM.addToCreativeTab(output::accept); // 鿔
                        ECElementItems.NIHONIUM.addToCreativeTab(output::accept); // 鿭
                        ECElementItems.FLEROVIUM.addToCreativeTab(output::accept); // 𫓧
                        ECElementItems.MOSCOVIUM.addToCreativeTab(output::accept); // 镆
                        ECElementItems.LIVERMORIUM.addToCreativeTab(output::accept); // 𫟷
                        ECElementItems.TENNESSINE.addToCreativeTab(output::accept); // 鿬
                        ECElementItems.OGANESSON.addToCreativeTab(output::accept); // 鿫
                        ECElementItems.LONGIUM.addToCreativeTab(output::accept); // 鑨
                        ECElementItems.MYSTERIUM.addToCreativeTab(output::accept); // 镾

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
                        ECElementBlocks.COPERNICIUM.addToCreativeTab(output::accept); // 鿔
                        ECElementBlocks.NIHONIUM.addToCreativeTab(output::accept); // 鿭
                        ECElementBlocks.FLEROVIUM.addToCreativeTab(output::accept); // 𫓧
                        ECElementBlocks.MOSCOVIUM.addToCreativeTab(output::accept); // 镆
                        ECElementBlocks.LIVERMORIUM.addToCreativeTab(output::accept); // 𫟷
                        ECElementBlocks.TENNESSINE.addToCreativeTab(output::accept); // 鿬
                        ECElementBlocks.OGANESSON.addToCreativeTab(output::accept); // 鿫
                        ECElementBlocks.LONGIUM.addToCreativeTab(output::accept); // 鑨
                        ECElementBlocks.MYSTERIUM.addToCreativeTab(output::accept); // 镾

                        ECMaterialBlocks.LEPIDOLITE.addToCreativeTab(output::accept); // 锂云母
                        ECMaterialBlocks.BERYL.addToCreativeTab(output::accept); // 绿柱石
                        ECMaterialBlocks.BORAX.addToCreativeTab(output::accept); // 硼砂
                        ECMaterialBlocks.MAGNESITE.addToCreativeTab(output::accept); // 菱镁矿
                        ECMaterialBlocks.NITRE.addToCreativeTab(output::accept); // 硝石
                        ECMaterialBlocks.APATITE.addToCreativeTab(output::accept); // 磷灰石
                        ECMaterialBlocks.MONAZITE.addToCreativeTab(output::accept); // 独居石
                        ECMaterialBlocks.CINNABAR.addToCreativeTab(output::accept); // 朱砂
                        ECMaterialBlocks.SYLVITE.addToCreativeTab(output::accept); // 钾石盐
                        ECMaterialBlocks.THORTVEITITE.addToCreativeTab(output::accept); // 钪钇石
                        ECMaterialBlocks.ILMENITE.addToCreativeTab(output::accept); // 钛铁矿
                        ECMaterialBlocks.PATRONITE.addToCreativeTab(output::accept); // 绿硫钒矿
                        ECMaterialBlocks.CHROMITE.addToCreativeTab(output::accept); // 铬铁矿
                        ECMaterialBlocks.PYROLUSITE.addToCreativeTab(output::accept); // 软锰矿
                        ECMaterialBlocks.ARGYRODITE.addToCreativeTab(output::accept); // 硫锗矿
                        ECMaterialBlocks.ARSENOPYRITE.addToCreativeTab(output::accept); // 毒砂
                        ECMaterialBlocks.CARNALLITE.addToCreativeTab(output::accept); // 光卤石
                        ECMaterialBlocks.CELESTINE.addToCreativeTab(output::accept); // 天青石
                        ECMaterialBlocks.COBALTITE.addToCreativeTab(output::accept); // 辉钴矿
                        ECMaterialBlocks.ZIRCON.addToCreativeTab(output::accept); // 锆英砂
                        ECMaterialBlocks.NIOBITE.addToCreativeTab(output::accept); // 铌铁矿
                        ECMaterialBlocks.MOLYBDENITE.addToCreativeTab(output::accept); // 辉钼矿
                        ECMaterialBlocks.STIBNITE.addToCreativeTab(output::accept); // 辉锑矿
                        ECMaterialBlocks.POLLUCITE.addToCreativeTab(output::accept); // 铯沸石
                        ECMaterialBlocks.BARITE.addToCreativeTab(output::accept); // 重晶石
                        ECMaterialBlocks.PYRITE.addToCreativeTab(output::accept); // 黄铁矿

                    })
                    .build());


    // 化学元素核心：元素流体
    public static final Supplier<CreativeModeTab> RCE_ELEMENT_FLUID_TAB =
            CREATIVE_MODE_TAB.register("rce_element_fluid_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ECElementItems.LIQUID_NEODYMIUM_BUCKET.get()))
                    .title(Component.translatable("itemGroup.elementum_core.rce_element_fluid_tab"))
                    .displayItems((parameters, output) -> {

                        output.accept(ECElementItems.LIQUID_HYDROGEN_BUCKET.get()); // 氢桶
                        output.accept(ECElementItems.LIQUID_HELIUM_BUCKET.get()); // 氦桶
                        output.accept(ECElementItems.LIQUID_LITHIUM_BUCKET.get()); // 锂桶
                        output.accept(ECElementItems.LIQUID_BERYLLIUM_BUCKET.get()); // 铍桶
                        output.accept(ECElementItems.LIQUID_BORON_BUCKET.get()); // 硼桶
                        output.accept(ECElementItems.LIQUID_CARBON_BUCKET.get()); // 碳桶
                        output.accept(ECElementItems.LIQUID_NITROGEN_BUCKET.get()); // 氮桶
                        output.accept(ECElementItems.LIQUID_OXYGEN_BUCKET.get()); // 氧桶
                        output.accept(ECElementItems.LIQUID_FLUORINE_BUCKET.get()); // 氟桶
                        output.accept(ECElementItems.LIQUID_NEON_BUCKET.get()); // 氖桶
                        output.accept(ECElementItems.LIQUID_SODIUM_BUCKET.get()); // 钠桶
                        output.accept(ECElementItems.LIQUID_MAGNESIUM_BUCKET.get()); // 镁桶
                        output.accept(ECElementItems.LIQUID_ALUMINUM_BUCKET.get()); // 铝桶
                        output.accept(ECElementItems.LIQUID_SILICON_BUCKET.get()); // 硅桶
                        output.accept(ECElementItems.LIQUID_PHOSPHORUS_BUCKET.get()); // 磷桶
                        output.accept(ECElementItems.LIQUID_SULFUR_BUCKET.get()); // 硫桶
                        output.accept(ECElementItems.LIQUID_CHLORINE_BUCKET.get()); // 氯桶
                        output.accept(ECElementItems.LIQUID_ARGON_BUCKET.get()); // 氩桶
                        output.accept(ECElementItems.LIQUID_POTASSIUM_BUCKET.get()); // 钾桶
                        output.accept(ECElementItems.LIQUID_CALCIUM_BUCKET.get()); // 钙桶
                        output.accept(ECElementItems.LIQUID_SCANDIUM_BUCKET.get()); // 钪桶
                        output.accept(ECElementItems.LIQUID_TITANIUM_BUCKET.get()); // 钛桶
                        output.accept(ECElementItems.LIQUID_VANADIUM_BUCKET.get()); // 钒桶
                        output.accept(ECElementItems.LIQUID_CHROMIUM_BUCKET.get()); // 铬桶
                        output.accept(ECElementItems.LIQUID_MANGANESE_BUCKET.get()); // 锰桶
                        output.accept(ECElementItems.LIQUID_IRON_BUCKET.get()); // 铁桶
                        output.accept(ECElementItems.LIQUID_COBALT_BUCKET.get()); // 钴桶
                        output.accept(ECElementItems.LIQUID_NICKEL_BUCKET.get()); // 镍桶
                        output.accept(ECElementItems.LIQUID_COPPER_BUCKET.get()); // 铜桶
                        output.accept(ECElementItems.LIQUID_ZINC_BUCKET.get()); // 锌桶
                        output.accept(ECElementItems.LIQUID_GALLIUM_BUCKET.get()); // 镓桶
                        output.accept(ECElementItems.LIQUID_GERMANIUM_BUCKET.get()); // 锗桶
                        output.accept(ECElementItems.LIQUID_ARSENIC_BUCKET.get()); // 砷桶
                        output.accept(ECElementItems.LIQUID_SELENIUM_BUCKET.get()); // 硒桶
                        output.accept(ECElementItems.BROMINE_BUCKET.get()); // 溴桶
                        output.accept(ECElementItems.LIQUID_KRYPTON_BUCKET.get()); // 氪桶
                        output.accept(ECElementItems.LIQUID_RUBIDIUM_BUCKET.get()); // 铷桶
                        output.accept(ECElementItems.LIQUID_STRONTIUM_BUCKET.get()); // 锶桶
                        output.accept(ECElementItems.LIQUID_YTTRIUM_BUCKET.get()); // 钇桶
                        output.accept(ECElementItems.LIQUID_ZIRCONIUM_BUCKET.get()); // 锆桶
                        output.accept(ECElementItems.LIQUID_NIOBIUM_BUCKET.get()); // 铌桶
                        output.accept(ECElementItems.LIQUID_MOLYBDENUM_BUCKET.get()); // 钼桶
                        output.accept(ECElementItems.LIQUID_TECHNETIUM_BUCKET.get()); // 锝桶
                        output.accept(ECElementItems.LIQUID_RUTHENIUM_BUCKET.get()); // 钌桶
                        output.accept(ECElementItems.LIQUID_RHODIUM_BUCKET.get()); // 铑桶
                        output.accept(ECElementItems.LIQUID_PALLADIUM_BUCKET.get()); // 钯桶
                        output.accept(ECElementItems.LIQUID_SILVER_BUCKET.get()); // 银桶
                        output.accept(ECElementItems.LIQUID_CADMIUM_BUCKET.get()); // 镉桶
                        output.accept(ECElementItems.LIQUID_INDIUM_BUCKET.get()); // 铟桶
                        output.accept(ECElementItems.LIQUID_TIN_BUCKET.get()); // 锡桶
                        output.accept(ECElementItems.LIQUID_ANTIMONY_BUCKET.get()); // 锑桶
                        output.accept(ECElementItems.LIQUID_TELLURIUM_BUCKET.get()); // 碲桶
                        output.accept(ECElementItems.LIQUID_IODINE_BUCKET.get()); // 碘桶
                        output.accept(ECElementItems.LIQUID_XENON_BUCKET.get()); // 氙桶
                        output.accept(ECElementItems.LIQUID_CESIUM_BUCKET.get()); // 铯桶
                        output.accept(ECElementItems.LIQUID_BARIUM_BUCKET.get()); // 钡桶
                        output.accept(ECElementItems.LIQUID_LANTHANUM_BUCKET.get()); // 镧桶
                        output.accept(ECElementItems.LIQUID_CERIUM_BUCKET.get()); // 铈桶
                        output.accept(ECElementItems.LIQUID_PRASEODYMIUM_BUCKET.get()); // 镨桶
                        output.accept(ECElementItems.LIQUID_NEODYMIUM_BUCKET.get()); // 钕桶
                        output.accept(ECElementItems.LIQUID_PROMETHIUM_BUCKET.get()); // 钷桶
                        output.accept(ECElementItems.LIQUID_SAMARIUM_BUCKET.get()); // 钐桶
                        output.accept(ECElementItems.LIQUID_EUROPIUM_BUCKET.get()); // 铕桶
                        output.accept(ECElementItems.LIQUID_GADOLINIUM_BUCKET.get()); // 钆桶
                        output.accept(ECElementItems.LIQUID_TERBIUM_BUCKET.get()); // 铽桶
                        output.accept(ECElementItems.LIQUID_DYSPROSIUM_BUCKET.get()); // 镝桶
                        output.accept(ECElementItems.LIQUID_HOLMIUM_BUCKET.get()); // 钬桶
                        output.accept(ECElementItems.LIQUID_ERBIUM_BUCKET.get()); // 铒桶
                        output.accept(ECElementItems.LIQUID_THULIUM_BUCKET.get()); // 铥桶
                        output.accept(ECElementItems.LIQUID_YTTERBIUM_BUCKET.get()); // 镱桶
                        output.accept(ECElementItems.LIQUID_LUTETIUM_BUCKET.get()); // 镥桶
                        output.accept(ECElementItems.LIQUID_HAFNIUM_BUCKET.get()); // 铪桶
                        output.accept(ECElementItems.LIQUID_TANTALUM_BUCKET.get()); // 钽桶
                        output.accept(ECElementItems.LIQUID_TUNGSTEN_BUCKET.get()); // 钨桶
                        output.accept(ECElementItems.LIQUID_RHENIUM_BUCKET.get()); // 铼桶
                        output.accept(ECElementItems.LIQUID_OSMIUM_BUCKET.get()); // 锇桶
                        output.accept(ECElementItems.LIQUID_IRIDIUM_BUCKET.get()); // 铱桶
                        output.accept(ECElementItems.LIQUID_PLATINUM_BUCKET.get()); // 铂桶
                        output.accept(ECElementItems.LIQUID_GOLD_BUCKET.get()); // 金桶
                        output.accept(ECElementItems.MERCURY_BUCKET.get()); // 汞桶
                        output.accept(ECElementItems.LIQUID_THALLIUM_BUCKET.get()); // 铊桶
                        output.accept(ECElementItems.LIQUID_LEAD_BUCKET.get()); // 铅桶
                        output.accept(ECElementItems.LIQUID_BISMUTH_BUCKET.get()); // 铋桶
                        output.accept(ECElementItems.LIQUID_POLONIUM_BUCKET.get()); // 钋桶
                        output.accept(ECElementItems.LIQUID_ASTATINE_BUCKET.get()); // 砹桶
                        output.accept(ECElementItems.LIQUID_RADON_BUCKET.get()); // 氡桶
                        output.accept(ECElementItems.LIQUID_FRANCIUM_BUCKET.get()); // 钫桶
                        output.accept(ECElementItems.LIQUID_RADIUM_BUCKET.get()); // 镭桶
                        output.accept(ECElementItems.LIQUID_ACTINIUM_BUCKET.get()); // 锕桶
                        output.accept(ECElementItems.LIQUID_THORIUM_BUCKET.get()); // 钍桶
                        output.accept(ECElementItems.LIQUID_PROTACTINIUM_BUCKET.get()); // 镤桶
                        output.accept(ECElementItems.LIQUID_URANIUM_BUCKET.get()); // 铀桶
                        output.accept(ECElementItems.LIQUID_NEPTUNIUM_BUCKET.get()); // 镎桶
                        output.accept(ECElementItems.LIQUID_PLUTONIUM_BUCKET.get()); // 钚桶
                        output.accept(ECElementItems.LIQUID_AMERICIUM_BUCKET.get()); // 镅桶
                        output.accept(ECElementItems.LIQUID_CURIUM_BUCKET.get()); // 锔桶
                        output.accept(ECElementItems.LIQUID_BERKELIUM_BUCKET.get()); // 锫桶
                        output.accept(ECElementItems.LIQUID_CALIFORNIUM_BUCKET.get()); // 锎桶
                        output.accept(ECElementItems.LIQUID_EINSTEINIUM_BUCKET.get()); // 锿桶
                        output.accept(ECElementItems.LIQUID_FERMIUM_BUCKET.get()); // 镄桶
                        output.accept(ECElementItems.LIQUID_MENDELEVIUM_BUCKET.get()); // 钔桶
                        output.accept(ECElementItems.LIQUID_NOBELIUM_BUCKET.get()); // 锘桶
                        output.accept(ECElementItems.LIQUID_LAWRENCIUM_BUCKET.get()); // 铹桶
                        output.accept(ECElementItems.LIQUID_RUTHERFORDIUM_BUCKET.get()); // 𬬻桶
                        output.accept(ECElementItems.LIQUID_DUBNIUM_BUCKET.get()); // 𬭊桶
                        output.accept(ECElementItems.LIQUID_SEABORGIUM_BUCKET.get()); // 𬭳桶
                        output.accept(ECElementItems.LIQUID_BOHRIUM_BUCKET.get()); // 𬭛桶
                        output.accept(ECElementItems.LIQUID_HASSIUM_BUCKET.get()); // 𬭶桶
                        output.accept(ECElementItems.LIQUID_MEITNERIUM_BUCKET.get()); // 鿏桶
                        output.accept(ECElementItems.LIQUID_DARMSTADTIUM_BUCKET.get()); // 𫟼桶
                        output.accept(ECElementItems.LIQUID_ROENTGENIUM_BUCKET.get()); // 𬬭桶
                        output.accept(ECElementItems.LIQUID_COPERNICIUM_BUCKET.get()); // 鿔桶
                        output.accept(ECElementItems.LIQUID_NIHONIUM_BUCKET.get()); // 鿭桶
                        output.accept(ECElementItems.LIQUID_FLEROVIUM_BUCKET.get()); // 𫓧桶
                        output.accept(ECElementItems.LIQUID_MOSCOVIUM_BUCKET.get()); // 镆桶
                        output.accept(ECElementItems.LIQUID_LIVERMORIUM_BUCKET.get()); // 𫟷桶
                        output.accept(ECElementItems.LIQUID_TENNESSINE_BUCKET.get()); // 鿬桶
                        output.accept(ECElementItems.LIQUID_OGANESSON_BUCKET.get()); // 鿫桶
                        output.accept(ECElementItems.LIQUID_LONGIUM_BUCKET.get()); // 鑨桶
                        output.accept(ECElementItems.LIQUID_MYSTERIUM_BUCKET.get()); // 镾桶

                    })
                    .build());


    // 化学元素核心：元素气体
    public static final Supplier<CreativeModeTab> RCE_ELEMENT_GAS_TAB =
            CREATIVE_MODE_TAB.register("rce_element_gas_tab", () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ECElementItems.HYDROGEN_GAS_BUCKET.get()))
                    .title(Component.translatable("itemGroup.elementum_core.rce_element_gas_tab"))
                    .displayItems((parameters, output) -> {

                        output.accept(ECElementItems.HYDROGEN_GAS_BUCKET.get());
                        output.accept(ECElementItems.HELIUM_GAS_BUCKET.get());
                        output.accept(ECElementItems.LITHIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.BERYLLIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.BORON_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.CARBON_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.NITROGEN_GAS_BUCKET.get());
                        output.accept(ECElementItems.OXYGEN_GAS_BUCKET.get());
                        output.accept(ECElementItems.FLUORINE_GAS_BUCKET.get());
                        output.accept(ECElementItems.NEON_GAS_BUCKET.get());
                        output.accept(ECElementItems.SODIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.MAGNESIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.ALUMINUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.SILICON_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.PHOSPHORUS_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.SULFUR_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.CHLORINE_GAS_BUCKET.get());
                        output.accept(ECElementItems.ARGON_GAS_BUCKET.get());
                        output.accept(ECElementItems.POTASSIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.CALCIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.SCANDIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.TITANIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.VANADIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.CHROMIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.MANGANESE_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.IRON_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.COBALT_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.NICKEL_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.COPPER_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.ZINC_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.GALLIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.GERMANIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.ARSENIC_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.SELENIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.BROMINE_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.KRYPTON_GAS_BUCKET.get());
                        output.accept(ECElementItems.RUBIDIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.STRONTIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.YTTRIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.ZIRCONIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.NIOBIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.MOLYBDENUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.TECHNETIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.RUTHENIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.RHODIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.PALLADIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.SILVER_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.CADMIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.INDIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.TIN_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.ANTIMONY_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.TELLURIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.IODINE_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.XENON_GAS_BUCKET.get());
                        output.accept(ECElementItems.CESIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.BARIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.LANTHANUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.CERIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.PRASEODYMIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.NEODYMIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.PROMETHIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.SAMARIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.EUROPIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.GADOLINIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.TERBIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.DYSPROSIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.HOLMIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.ERBIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.THULIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.YTTERBIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.LUTETIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.HAFNIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.TANTALUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.TUNGSTEN_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.RHENIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.OSMIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.IRIDIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.PLATINUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.GOLD_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.MERCURY_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.THALLIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.LEAD_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.BISMUTH_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.POLONIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.ASTATINE_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.RADON_GAS_BUCKET.get());
                        output.accept(ECElementItems.FRANCIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.RADIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.ACTINIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.THORIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.PROTACTINIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.URANIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.NEPTUNIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.PLUTONIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.AMERICIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.CURIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.BERKELIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.CALIFORNIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.EINSTEINIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.FERMIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.MENDELEVIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.NOBELIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.LAWRENCIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.RUTHERFORDIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.DUBNIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.SEABORGIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.BOHRIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.HASSIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.MEITNERIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.DARMSTADTIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.ROENTGENIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.COPERNICIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.NIHONIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.FLEROVIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.MOSCOVIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.LIVERMORIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.TENNESSINE_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.OGANESSON_GAS_BUCKET.get());
                        output.accept(ECElementItems.LONGIUM_VAPOR_BUCKET.get());
                        output.accept(ECElementItems.MYSTERIUM_VAPOR_BUCKET.get());

                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}