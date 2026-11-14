package com.chinaex123.elementum_core.init;

import com.chinaex123.elementum_core.ElementumCore;
import com.chinaex123.elementum_core.item.GasBucketItem;
import com.chinaex123.elementum_core.util.ContentRefs;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/** 120个元素物品 */
public class ECElementItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ElementumCore.MODID);
    public static final Item.Properties BUCKET = new Item.Properties().stacksTo(1).craftRemainder(Items.BUCKET);

    // ==================== 120个元素，对应锭/粒/齿轮/板/粉/棍/线/粉碎矿/粗矿 ====================
    /** 氢 */
    public static final OreItems HYDROGEN = new OreItems("hydrogen", Rarity.EPIC);
    /** 氦 */
    public static final OreItems HELIUM = new OreItems("helium", Rarity.EPIC);
    /** 锂 */
    public static final OreItems LITHIUM = new OreItems("lithium", Rarity.EPIC);
    /** 铍 */
    public static final OreItems BERYLLIUM = new OreItems("beryllium", Rarity.EPIC);
    /** 硼 */
    public static final OreItems BORON = new OreItems("boron", Rarity.EPIC);
    /** 碳 */
    public static final OreItems CARBON = new OreItems("carbon", Rarity.EPIC);
    /** 氮 */
    public static final OreItems NITROGEN = new OreItems("nitrogen", Rarity.EPIC);
    /** 氧 */
    public static final OreItems OXYGEN = new OreItems("oxygen", Rarity.EPIC);
    /** 氟 */
    public static final OreItems FLUORINE = new OreItems("fluorine", Rarity.EPIC);
    /** 氖 */
    public static final OreItems NEON = new OreItems("neon", Rarity.EPIC);
    /** 钠 */
    public static final OreItems SODIUM = new OreItems("sodium", Rarity.EPIC);
    /** 镁 */
    public static final OreItems MAGNESIUM = new OreItems("magnesium", Rarity.EPIC);
    /** 铝 */
    public static final OreItems ALUMINUM = new OreItems("aluminum", Rarity.EPIC);
    /** 硅 */
    public static final OreItems SILICON = new OreItems("silicon", Rarity.EPIC);
    /** 磷 */
    public static final OreItems PHOSPHORUS = new OreItems("phosphorus", Rarity.EPIC);
    /** 硫 */
    public static final OreItems SULFUR = new OreItems("sulfur", Rarity.EPIC);
    /** 氯 */
    public static final OreItems CHLORINE = new OreItems("chlorine", Rarity.EPIC);
    /** 氩 */
    public static final OreItems ARGON = new OreItems("argon", Rarity.EPIC);
    /** 钾 */
    public static final OreItems POTASSIUM = new OreItems("potassium", Rarity.EPIC);
    /** 钙 */
    public static final OreItems CALCIUM = new OreItems("calcium", Rarity.EPIC);
    /** 钪 */
    public static final OreItems SCANDIUM = new OreItems("scandium", Rarity.EPIC);
    /** 钛 */
    public static final OreItems TITANIUM = new OreItems("titanium", Rarity.EPIC);
    /** 钒 */
    public static final OreItems VANADIUM = new OreItems("vanadium", Rarity.EPIC);
    /** 铬 */
    public static final OreItems CHROMIUM = new OreItems("chromium", Rarity.EPIC);
    /** 锰 */
    public static final OreItems MANGANESE = new OreItems("manganese", Rarity.EPIC);
    /** 铁（锭/粒/粗铁沿用原版，不再重复注册） */
    public static final OreItems IRON = new OreItems("iron", Rarity.EPIC, Items.IRON_INGOT, Items.IRON_NUGGET, Items.RAW_IRON);
    /** 钴 */
    public static final OreItems COBALT = new OreItems("cobalt", Rarity.EPIC);
    /** 镍 */
    public static final OreItems NICKEL = new OreItems("nickel", Rarity.EPIC);
    /** 铜 */
    public static final OreItems COPPER = new OreItems("copper", Rarity.EPIC);
    /** 锌 */
    public static final OreItems ZINC = new OreItems("zinc", Rarity.EPIC);
    /** 镓 */
    public static final OreItems GALLIUM = new OreItems("gallium", Rarity.EPIC);
    /** 锗 */
    public static final OreItems GERMANIUM = new OreItems("germanium", Rarity.EPIC);
    /** 砷 */
    public static final OreItems ARSENIC = new OreItems("arsenic", Rarity.EPIC);
    /** 硒 */
    public static final OreItems SELENIUM = new OreItems("selenium", Rarity.EPIC);
    /** 溴 */
    public static final OreItems BROMINE = new OreItems("bromine", Rarity.EPIC);
    /** 氪 */
    public static final OreItems KRYPTON = new OreItems("krypton", Rarity.EPIC);
    /** 铷 */
    public static final OreItems RUBIDIUM = new OreItems("rubidium", Rarity.EPIC);
    /** 锶 */
    public static final OreItems STRONTIUM = new OreItems("strontium", Rarity.EPIC);
    /** 钇 */
    public static final OreItems YTTRIUM = new OreItems("yttrium", Rarity.EPIC);
    /** 锆 */
    public static final OreItems ZIRCONIUM = new OreItems("zirconium", Rarity.EPIC);
    /** 铌 */
    public static final OreItems NIOBIUM = new OreItems("niobium", Rarity.EPIC);
    /** 钼 */
    public static final OreItems MOLYBDENUM = new OreItems("molybdenum", Rarity.EPIC);
    /** 锝 */
    public static final OreItems TECHNETIUM = new OreItems("technetium", Rarity.EPIC);
    /** � */
    public static final OreItems RUTHENIUM = new OreItems("ruthenium", Rarity.EPIC);
    /** 铑 */
    public static final OreItems RHODIUM = new OreItems("rhodium", Rarity.EPIC);
    /** 钯 */
    public static final OreItems PALLADIUM = new OreItems("palladium", Rarity.EPIC);
    /** 银 */
    public static final OreItems SILVER = new OreItems("silver", Rarity.EPIC);
    /** 镉 */
    public static final OreItems CADMIUM = new OreItems("cadmium", Rarity.EPIC);
    /** 铟 */
    public static final OreItems INDIUM = new OreItems("indium", Rarity.EPIC);
    /** 锡 */
    public static final OreItems TIN = new OreItems("tin", Rarity.EPIC);
    /** 锑 */
    public static final OreItems ANTIMONY = new OreItems("antimony", Rarity.EPIC);
    /** 碲 */
    public static final OreItems TELLURIUM = new OreItems("tellurium", Rarity.EPIC);
    /** 碘 */
    public static final OreItems IODINE = new OreItems("iodine", Rarity.EPIC);
    /** 氙 */
    public static final OreItems XENON = new OreItems("xenon", Rarity.EPIC);
    /** 铯 */
    public static final OreItems CESIUM = new OreItems("cesium", Rarity.EPIC);
    /** 钡 */
    public static final OreItems BARIUM = new OreItems("barium", Rarity.EPIC);
    /** 镧 */
    public static final OreItems LANTHANUM = new OreItems("lanthanum", Rarity.EPIC);
    /** 铈 */
    public static final OreItems CERIUM = new OreItems("cerium", Rarity.EPIC);
    /** 镨 */
    public static final OreItems PRASEODYMIUM = new OreItems("praseodymium", Rarity.EPIC);
    /** 钕 */
    public static final OreItems NEODYMIUM = new OreItems("neodymium", Rarity.EPIC);
    /** 钷 */
    public static final OreItems PROMETHIUM = new OreItems("promethium", Rarity.EPIC);
    /** 钐 */
    public static final OreItems SAMARIUM = new OreItems("samarium", Rarity.EPIC);
    /** 铕 */
    public static final OreItems EUROPIUM = new OreItems("europium", Rarity.EPIC);
    /** 钆 */
    public static final OreItems GADOLINIUM = new OreItems("gadolinium", Rarity.EPIC);
    /** 铽 */
    public static final OreItems TERBIUM = new OreItems("terbium", Rarity.EPIC);
    /** 镝 */
    public static final OreItems DYSPROSIUM = new OreItems("dysprosium", Rarity.EPIC);
    /** 钬 */
    public static final OreItems HOLMIUM = new OreItems("holmium", Rarity.EPIC);
    /** 铒 */
    public static final OreItems ERBIUM = new OreItems("erbium", Rarity.EPIC);
    /** 铥 */
    public static final OreItems THULIUM = new OreItems("thulium", Rarity.EPIC);
    /** 镱 */
    public static final OreItems YTTERBIUM = new OreItems("ytterbium", Rarity.EPIC);
    /** 镥 */
    public static final OreItems LUTETIUM = new OreItems("lutetium", Rarity.EPIC);
    /** 铪 */
    public static final OreItems HAFNIUM = new OreItems("hafnium", Rarity.EPIC);
    /** 钽 */
    public static final OreItems TANTALUM = new OreItems("tantalum", Rarity.EPIC);
    /** 钨 */
    public static final OreItems TUNGSTEN = new OreItems("tungsten", Rarity.EPIC);
    /** 铼 */
    public static final OreItems RHENIUM = new OreItems("rhenium", Rarity.EPIC);
    /** 锇 */
    public static final OreItems OSMIUM = new OreItems("osmium", Rarity.EPIC);
    /** 铱 */
    public static final OreItems IRIDIUM = new OreItems("iridium", Rarity.EPIC);
    /** 铂 */
    public static final OreItems PLATINUM = new OreItems("platinum", Rarity.EPIC);
    /** 金（锭/粒/粗金沿用原版，不再重复注册） */
    public static final OreItems GOLD = new OreItems("gold", Rarity.EPIC, Items.GOLD_INGOT, Items.GOLD_NUGGET, Items.RAW_GOLD);
    /** 汞 */
    public static final OreItems MERCURY = new OreItems("mercury", Rarity.EPIC);
    /** 铊 */
    public static final OreItems THALLIUM = new OreItems("thallium", Rarity.EPIC);
    /** 铅 */
    public static final OreItems LEAD = new OreItems("lead", Rarity.EPIC);
    /** 铋 */
    public static final OreItems BISMUTH = new OreItems("bismuth", Rarity.EPIC);
    /** 钋 */
    public static final OreItems POLONIUM = new OreItems("polonium", Rarity.EPIC);
    /** 砹 */
    public static final OreItems ASTATINE = new OreItems("astatine", Rarity.EPIC);
    /** 氡 */
    public static final OreItems RADON = new OreItems("radon", Rarity.EPIC);
    /** 钫 */
    public static final OreItems FRANCIUM = new OreItems("francium", Rarity.EPIC);
    /** 镭 */
    public static final OreItems RADIUM = new OreItems("radium", Rarity.EPIC);
    /** 锕 */
    public static final OreItems ACTINIUM = new OreItems("actinium", Rarity.EPIC);
    /** 钍 */
    public static final OreItems THORIUM = new OreItems("thorium", Rarity.EPIC);
    /** 镤 */
    public static final OreItems PROTACTINIUM = new OreItems("protactinium", Rarity.EPIC);
    /** 铀 */
    public static final OreItems URANIUM = new OreItems("uranium", Rarity.EPIC);
    /** 镎 */
    public static final OreItems NEPTUNIUM = new OreItems("neptunium", Rarity.EPIC);
    /** 钚 */
    public static final OreItems PLUTONIUM = new OreItems("plutonium", Rarity.EPIC);
    /** 镅 */
    public static final OreItems AMERICIUM = new OreItems("americium", Rarity.EPIC);
    /** 锔 */
    public static final OreItems CURIUM = new OreItems("curium", Rarity.EPIC);
    /** 锫 */
    public static final OreItems BERKELIUM = new OreItems("berkelium", Rarity.EPIC);
    /** 锎 */
    public static final OreItems CALIFORNIUM = new OreItems("californium", Rarity.EPIC);
    /** 锿 */
    public static final OreItems EINSTEINIUM = new OreItems("einsteinium", Rarity.EPIC);
    /** 镄 */
    public static final OreItems FERMIUM = new OreItems("fermium", Rarity.EPIC);
    /** 钔 */
    public static final OreItems MENDELEVIUM = new OreItems("mendelevium", Rarity.EPIC);
    /** 锘 */
    public static final OreItems NOBELIUM = new OreItems("nobelium", Rarity.EPIC);
    /** 铹 */
    public static final OreItems LAWRENCIUM = new OreItems("lawrencium", Rarity.EPIC);
    /** 𬬻 */
    public static final OreItems RUTHERFORDIUM = new OreItems("rutherfordium", Rarity.EPIC);
    /** 𬭊 */
    public static final OreItems DUBNIUM = new OreItems("dubnium", Rarity.EPIC);
    /** 𬭳 */
    public static final OreItems SEABORGIUM = new OreItems("seaborgium", Rarity.EPIC);
    /** 𬭛 */
    public static final OreItems BOHRIUM = new OreItems("bohrium", Rarity.EPIC);
    /** 𬭶 */
    public static final OreItems HASSIUM = new OreItems("hassium", Rarity.EPIC);
    /** 鿏 */
    public static final OreItems MEITNERIUM = new OreItems("meitnerium", Rarity.EPIC);
    /** 𫟼 */
    public static final OreItems DARMSTADTIUM = new OreItems("darmstadtium", Rarity.EPIC);
    /** 𬬭 */
    public static final OreItems ROENTGENIUM = new OreItems("roentgenium", Rarity.EPIC);
    /** 鿔 */
    public static final OreItems COPERNICIUM = new OreItems("copernicium", Rarity.EPIC);
    /** 鿭 */
    public static final OreItems NIHONIUM = new OreItems("nihonium", Rarity.EPIC);
    /** 𫓧 */
    public static final OreItems FLEROVIUM = new OreItems("flerovium", Rarity.EPIC);
    /** 镆 */
    public static final OreItems MOSCOVIUM = new OreItems("moscovium", Rarity.EPIC);
    /** 𫟷 */
    public static final OreItems LIVERMORIUM = new OreItems("livermorium", Rarity.EPIC);
    /** 鿬 */
    public static final OreItems TENNESSINE = new OreItems("tennessine", Rarity.EPIC);
    /** 鿫 */
    public static final OreItems OGANESSON = new OreItems("oganesson", Rarity.EPIC);
    /** 鑨 */
    public static final OreItems LONGIUM = new OreItems("longium", Rarity.EPIC);
    /** 镾 */
    public static final OreItems MYSTERIUM = new OreItems("mysterium", Rarity.EPIC);

    // ==================== 120个元素的流体桶 ====================
    /** 氢桶 */
    public static final DeferredItem<BucketItem> LIQUID_HYDROGEN_BUCKET = ITEMS.register("liquid_hydrogen_bucket", () -> new BucketItem(ECElementFluids.LIQUID_HYDROGEN.source.get(), BUCKET));
    /** 氦桶 */
    public static final DeferredItem<BucketItem> LIQUID_HELIUM_BUCKET = ITEMS.register("liquid_helium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_HELIUM.source.get(), BUCKET));
    /** 锂桶 */
    public static final DeferredItem<BucketItem> LIQUID_LITHIUM_BUCKET = ITEMS.register("liquid_lithium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_LITHIUM.source.get(), BUCKET));
    /** 铍桶 */
    public static final DeferredItem<BucketItem> LIQUID_BERYLLIUM_BUCKET = ITEMS.register("liquid_beryllium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_BERYLLIUM.source.get(), BUCKET));
    /** 硼桶 */
    public static final DeferredItem<BucketItem> LIQUID_BORON_BUCKET = ITEMS.register("liquid_boron_bucket", () -> new BucketItem(ECElementFluids.LIQUID_BORON.source.get(), BUCKET));
    /** 碳桶 */
    public static final DeferredItem<BucketItem> LIQUID_CARBON_BUCKET = ITEMS.register("liquid_carbon_bucket", () -> new BucketItem(ECElementFluids.LIQUID_CARBON.source.get(), BUCKET));
    /** 氮桶 */
    public static final DeferredItem<BucketItem> LIQUID_NITROGEN_BUCKET = ITEMS.register("liquid_nitrogen_bucket", () -> new BucketItem(ECElementFluids.LIQUID_NITROGEN.source.get(), BUCKET));
    /** 氧桶 */
    public static final DeferredItem<BucketItem> LIQUID_OXYGEN_BUCKET = ITEMS.register("liquid_oxygen_bucket", () -> new BucketItem(ECElementFluids.LIQUID_OXYGEN.source.get(), BUCKET));
    /** 氟桶 */
    public static final DeferredItem<BucketItem> LIQUID_FLUORINE_BUCKET = ITEMS.register("liquid_fluorine_bucket", () -> new BucketItem(ECElementFluids.LIQUID_FLUORINE.source.get(), BUCKET));
    /** 氖桶 */
    public static final DeferredItem<BucketItem> LIQUID_NEON_BUCKET = ITEMS.register("liquid_neon_bucket", () -> new BucketItem(ECElementFluids.LIQUID_NEON.source.get(), BUCKET));
    /** 钠桶 */
    public static final DeferredItem<BucketItem> LIQUID_SODIUM_BUCKET = ITEMS.register("liquid_sodium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_SODIUM.source.get(), BUCKET));
    /** 镁桶 */
    public static final DeferredItem<BucketItem> LIQUID_MAGNESIUM_BUCKET = ITEMS.register("liquid_magnesium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_MAGNESIUM.source.get(), BUCKET));
    /** 铝桶 */
    public static final DeferredItem<BucketItem> LIQUID_ALUMINUM_BUCKET = ITEMS.register("liquid_aluminum_bucket", () -> new BucketItem(ECElementFluids.LIQUID_ALUMINUM.source.get(), BUCKET));
    /** 硅桶 */
    public static final DeferredItem<BucketItem> LIQUID_SILICON_BUCKET = ITEMS.register("liquid_silicon_bucket", () -> new BucketItem(ECElementFluids.LIQUID_SILICON.source.get(), BUCKET));
    /** 磷桶 */
    public static final DeferredItem<BucketItem> LIQUID_PHOSPHORUS_BUCKET = ITEMS.register("liquid_phosphorus_bucket", () -> new BucketItem(ECElementFluids.LIQUID_PHOSPHORUS.source.get(), BUCKET));
    /** 硫桶 */
    public static final DeferredItem<BucketItem> LIQUID_SULFUR_BUCKET = ITEMS.register("liquid_sulfur_bucket", () -> new BucketItem(ECElementFluids.LIQUID_SULFUR.source.get(), BUCKET));
    /** 氯桶 */
    public static final DeferredItem<BucketItem> LIQUID_CHLORINE_BUCKET = ITEMS.register("liquid_chlorine_bucket", () -> new BucketItem(ECElementFluids.LIQUID_CHLORINE.source.get(), BUCKET));
    /** 氩桶 */
    public static final DeferredItem<BucketItem> LIQUID_ARGON_BUCKET = ITEMS.register("liquid_argon_bucket", () -> new BucketItem(ECElementFluids.LIQUID_ARGON.source.get(), BUCKET));
    /** 钾桶 */
    public static final DeferredItem<BucketItem> LIQUID_POTASSIUM_BUCKET = ITEMS.register("liquid_potassium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_POTASSIUM.source.get(), BUCKET));
    /** 钙桶 */
    public static final DeferredItem<BucketItem> LIQUID_CALCIUM_BUCKET = ITEMS.register("liquid_calcium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_CALCIUM.source.get(), BUCKET));
    /** 钪桶 */
    public static final DeferredItem<BucketItem> LIQUID_SCANDIUM_BUCKET = ITEMS.register("liquid_scandium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_SCANDIUM.source.get(), BUCKET));
    /** 钛桶 */
    public static final DeferredItem<BucketItem> LIQUID_TITANIUM_BUCKET = ITEMS.register("liquid_titanium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_TITANIUM.source.get(), BUCKET));
    /** 钒桶 */
    public static final DeferredItem<BucketItem> LIQUID_VANADIUM_BUCKET = ITEMS.register("liquid_vanadium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_VANADIUM.source.get(), BUCKET));
    /** 铬桶 */
    public static final DeferredItem<BucketItem> LIQUID_CHROMIUM_BUCKET = ITEMS.register("liquid_chromium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_CHROMIUM.source.get(), BUCKET));
    /** 锰桶 */
    public static final DeferredItem<BucketItem> LIQUID_MANGANESE_BUCKET = ITEMS.register("liquid_manganese_bucket", () -> new BucketItem(ECElementFluids.LIQUID_MANGANESE.source.get(), BUCKET));
    /** 铁桶 */
    public static final DeferredItem<BucketItem> LIQUID_IRON_BUCKET = ITEMS.register("liquid_iron_bucket", () -> new BucketItem(ECElementFluids.LIQUID_IRON.source.get(), BUCKET));
    /** 钴桶 */
    public static final DeferredItem<BucketItem> LIQUID_COBALT_BUCKET = ITEMS.register("liquid_cobalt_bucket", () -> new BucketItem(ECElementFluids.LIQUID_COBALT.source.get(), BUCKET));
    /** 镍桶 */
    public static final DeferredItem<BucketItem> LIQUID_NICKEL_BUCKET = ITEMS.register("liquid_nickel_bucket", () -> new BucketItem(ECElementFluids.LIQUID_NICKEL.source.get(), BUCKET));
    /** 铜桶 */
    public static final DeferredItem<BucketItem> LIQUID_COPPER_BUCKET = ITEMS.register("liquid_copper_bucket", () -> new BucketItem(ECElementFluids.LIQUID_COPPER.source.get(), BUCKET));
    /** 锌桶 */
    public static final DeferredItem<BucketItem> LIQUID_ZINC_BUCKET = ITEMS.register("liquid_zinc_bucket", () -> new BucketItem(ECElementFluids.LIQUID_ZINC.source.get(), BUCKET));
    /** 镓桶 */
    public static final DeferredItem<BucketItem> LIQUID_GALLIUM_BUCKET = ITEMS.register("liquid_gallium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_GALLIUM.source.get(), BUCKET));
    /** 锗桶 */
    public static final DeferredItem<BucketItem> LIQUID_GERMANIUM_BUCKET = ITEMS.register("liquid_germanium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_GERMANIUM.source.get(), BUCKET));
    /** 砷桶 */
    public static final DeferredItem<BucketItem> LIQUID_ARSENIC_BUCKET = ITEMS.register("liquid_arsenic_bucket", () -> new BucketItem(ECElementFluids.LIQUID_ARSENIC.source.get(), BUCKET));
    /** 硒桶 */
    public static final DeferredItem<BucketItem> LIQUID_SELENIUM_BUCKET = ITEMS.register("liquid_selenium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_SELENIUM.source.get(), BUCKET));
    /** 溴桶 */
    public static final DeferredItem<BucketItem> BROMINE_BUCKET = ITEMS.register("bromine_bucket", () -> new BucketItem(ECElementFluids.BROMINE.source.get(), BUCKET));
    /** 氪桶 */
    public static final DeferredItem<BucketItem> LIQUID_KRYPTON_BUCKET = ITEMS.register("liquid_krypton_bucket", () -> new BucketItem(ECElementFluids.LIQUID_KRYPTON.source.get(), BUCKET));
    /** 铷桶 */
    public static final DeferredItem<BucketItem> LIQUID_RUBIDIUM_BUCKET = ITEMS.register("liquid_rubidium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_RUBIDIUM.source.get(), BUCKET));
    /** 锶桶 */
    public static final DeferredItem<BucketItem> LIQUID_STRONTIUM_BUCKET = ITEMS.register("liquid_strontium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_STRONTIUM.source.get(), BUCKET));
    /** 钇桶 */
    public static final DeferredItem<BucketItem> LIQUID_YTTRIUM_BUCKET = ITEMS.register("liquid_yttrium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_YTTRIUM.source.get(), BUCKET));
    /** 锆桶 */
    public static final DeferredItem<BucketItem> LIQUID_ZIRCONIUM_BUCKET = ITEMS.register("liquid_zirconium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_ZIRCONIUM.source.get(), BUCKET));
    /** 铌桶 */
    public static final DeferredItem<BucketItem> LIQUID_NIOBIUM_BUCKET = ITEMS.register("liquid_niobium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_NIOBIUM.source.get(), BUCKET));
    /** 钼桶 */
    public static final DeferredItem<BucketItem> LIQUID_MOLYBDENUM_BUCKET = ITEMS.register("liquid_molybdenum_bucket", () -> new BucketItem(ECElementFluids.LIQUID_MOLYBDENUM.source.get(), BUCKET));
    /** 锝桶 */
    public static final DeferredItem<BucketItem> LIQUID_TECHNETIUM_BUCKET = ITEMS.register("liquid_technetium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_TECHNETIUM.source.get(), BUCKET));
    /** 钌桶 */
    public static final DeferredItem<BucketItem> LIQUID_RUTHENIUM_BUCKET = ITEMS.register("liquid_ruthenium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_RUTHENIUM.source.get(), BUCKET));
    /** 铑桶 */
    public static final DeferredItem<BucketItem> LIQUID_RHODIUM_BUCKET = ITEMS.register("liquid_rhodium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_RHODIUM.source.get(), BUCKET));
    /** 钯桶 */
    public static final DeferredItem<BucketItem> LIQUID_PALLADIUM_BUCKET = ITEMS.register("liquid_palladium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_PALLADIUM.source.get(), BUCKET));
    /** 银桶 */
    public static final DeferredItem<BucketItem> LIQUID_SILVER_BUCKET = ITEMS.register("liquid_silver_bucket", () -> new BucketItem(ECElementFluids.LIQUID_SILVER.source.get(), BUCKET));
    /** 镉桶 */
    public static final DeferredItem<BucketItem> LIQUID_CADMIUM_BUCKET = ITEMS.register("liquid_cadmium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_CADMIUM.source.get(), BUCKET));
    /** 铟桶 */
    public static final DeferredItem<BucketItem> LIQUID_INDIUM_BUCKET = ITEMS.register("liquid_indium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_INDIUM.source.get(), BUCKET));
    /** 锡桶 */
    public static final DeferredItem<BucketItem> LIQUID_TIN_BUCKET = ITEMS.register("liquid_tin_bucket", () -> new BucketItem(ECElementFluids.LIQUID_TIN.source.get(), BUCKET));
    /** 锑桶 */
    public static final DeferredItem<BucketItem> LIQUID_ANTIMONY_BUCKET = ITEMS.register("liquid_antimony_bucket", () -> new BucketItem(ECElementFluids.LIQUID_ANTIMONY.source.get(), BUCKET));
    /** 碲桶 */
    public static final DeferredItem<BucketItem> LIQUID_TELLURIUM_BUCKET = ITEMS.register("liquid_tellurium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_TELLURIUM.source.get(), BUCKET));
    /** 碘桶 */
    public static final DeferredItem<BucketItem> LIQUID_IODINE_BUCKET = ITEMS.register("liquid_iodine_bucket", () -> new BucketItem(ECElementFluids.LIQUID_IODINE.source.get(), BUCKET));
    /** 氙桶 */
    public static final DeferredItem<BucketItem> LIQUID_XENON_BUCKET = ITEMS.register("liquid_xenon_bucket", () -> new BucketItem(ECElementFluids.LIQUID_XENON.source.get(), BUCKET));
    /** 铯桶 */
    public static final DeferredItem<BucketItem> LIQUID_CESIUM_BUCKET = ITEMS.register("liquid_cesium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_CESIUM.source.get(), BUCKET));
    /** 钡桶 */
    public static final DeferredItem<BucketItem> LIQUID_BARIUM_BUCKET = ITEMS.register("liquid_barium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_BARIUM.source.get(), BUCKET));
    /** 镧桶 */
    public static final DeferredItem<BucketItem> LIQUID_LANTHANUM_BUCKET = ITEMS.register("liquid_lanthanum_bucket", () -> new BucketItem(ECElementFluids.LIQUID_LANTHANUM.source.get(), BUCKET));
    /** 铈桶 */
    public static final DeferredItem<BucketItem> LIQUID_CERIUM_BUCKET = ITEMS.register("liquid_cerium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_CERIUM.source.get(), BUCKET));
    /** 镨桶 */
    public static final DeferredItem<BucketItem> LIQUID_PRASEODYMIUM_BUCKET = ITEMS.register("liquid_praseodymium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_PRASEODYMIUM.source.get(), BUCKET));
    /** 钕桶 */
    public static final DeferredItem<BucketItem> LIQUID_NEODYMIUM_BUCKET = ITEMS.register("liquid_neodymium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_NEODYMIUM.source.get(), BUCKET));
    /** 钷桶 */
    public static final DeferredItem<BucketItem> LIQUID_PROMETHIUM_BUCKET = ITEMS.register("liquid_promethium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_PROMETHIUM.source.get(), BUCKET));
    /** 钐桶 */
    public static final DeferredItem<BucketItem> LIQUID_SAMARIUM_BUCKET = ITEMS.register("liquid_samarium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_SAMARIUM.source.get(), BUCKET));
    /** 铕桶 */
    public static final DeferredItem<BucketItem> LIQUID_EUROPIUM_BUCKET = ITEMS.register("liquid_europium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_EUROPIUM.source.get(), BUCKET));
    /** 钆桶 */
    public static final DeferredItem<BucketItem> LIQUID_GADOLINIUM_BUCKET = ITEMS.register("liquid_gadolinium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_GADOLINIUM.source.get(), BUCKET));
    /** 铽桶 */
    public static final DeferredItem<BucketItem> LIQUID_TERBIUM_BUCKET = ITEMS.register("liquid_terbium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_TERBIUM.source.get(), BUCKET));
    /** 镝桶 */
    public static final DeferredItem<BucketItem> LIQUID_DYSPROSIUM_BUCKET = ITEMS.register("liquid_dysprosium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_DYSPROSIUM.source.get(), BUCKET));
    /** 钬桶 */
    public static final DeferredItem<BucketItem> LIQUID_HOLMIUM_BUCKET = ITEMS.register("liquid_holmium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_HOLMIUM.source.get(), BUCKET));
    /** 铒桶 */
    public static final DeferredItem<BucketItem> LIQUID_ERBIUM_BUCKET = ITEMS.register("liquid_erbium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_ERBIUM.source.get(), BUCKET));
    /** 铥桶 */
    public static final DeferredItem<BucketItem> LIQUID_THULIUM_BUCKET = ITEMS.register("liquid_thulium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_THULIUM.source.get(), BUCKET));
    /** 镱桶 */
    public static final DeferredItem<BucketItem> LIQUID_YTTERBIUM_BUCKET = ITEMS.register("liquid_ytterbium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_YTTERBIUM.source.get(), BUCKET));
    /** 镥桶 */
    public static final DeferredItem<BucketItem> LIQUID_LUTETIUM_BUCKET = ITEMS.register("liquid_lutetium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_LUTETIUM.source.get(), BUCKET));
    /** 铪桶 */
    public static final DeferredItem<BucketItem> LIQUID_HAFNIUM_BUCKET = ITEMS.register("liquid_hafnium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_HAFNIUM.source.get(), BUCKET));
    /** 钽桶 */
    public static final DeferredItem<BucketItem> LIQUID_TANTALUM_BUCKET = ITEMS.register("liquid_tantalum_bucket", () -> new BucketItem(ECElementFluids.LIQUID_TANTALUM.source.get(), BUCKET));
    /** 钨桶 */
    public static final DeferredItem<BucketItem> LIQUID_TUNGSTEN_BUCKET = ITEMS.register("liquid_tungsten_bucket", () -> new BucketItem(ECElementFluids.LIQUID_TUNGSTEN.source.get(), BUCKET));
    /** 铼桶 */
    public static final DeferredItem<BucketItem> LIQUID_RHENIUM_BUCKET = ITEMS.register("liquid_rhenium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_RHENIUM.source.get(), BUCKET));
    /** 锇桶 */
    public static final DeferredItem<BucketItem> LIQUID_OSMIUM_BUCKET = ITEMS.register("liquid_osmium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_OSMIUM.source.get(), BUCKET));
    /** 铱桶 */
    public static final DeferredItem<BucketItem> LIQUID_IRIDIUM_BUCKET = ITEMS.register("liquid_iridium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_IRIDIUM.source.get(), BUCKET));
    /** 铂桶 */
    public static final DeferredItem<BucketItem> LIQUID_PLATINUM_BUCKET = ITEMS.register("liquid_platinum_bucket", () -> new BucketItem(ECElementFluids.LIQUID_PLATINUM.source.get(), BUCKET));
    /** 金桶 */
    public static final DeferredItem<BucketItem> LIQUID_GOLD_BUCKET = ITEMS.register("liquid_gold_bucket", () -> new BucketItem(ECElementFluids.LIQUID_GOLD.source.get(), BUCKET));
    /** 汞桶 */
    public static final DeferredItem<BucketItem> MERCURY_BUCKET = ITEMS.register("mercury_bucket", () -> new BucketItem(ECElementFluids.MERCURY.source.get(), BUCKET));
    /** 铊桶 */
    public static final DeferredItem<BucketItem> LIQUID_THALLIUM_BUCKET = ITEMS.register("liquid_thallium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_THALLIUM.source.get(), BUCKET));
    /** 铅桶 */
    public static final DeferredItem<BucketItem> LIQUID_LEAD_BUCKET = ITEMS.register("liquid_lead_bucket", () -> new BucketItem(ECElementFluids.LIQUID_LEAD.source.get(), BUCKET));
    /** 铋桶 */
    public static final DeferredItem<BucketItem> LIQUID_BISMUTH_BUCKET = ITEMS.register("liquid_bismuth_bucket", () -> new BucketItem(ECElementFluids.LIQUID_BISMUTH.source.get(), BUCKET));
    /** 钋桶 */
    public static final DeferredItem<BucketItem> LIQUID_POLONIUM_BUCKET = ITEMS.register("liquid_polonium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_POLONIUM.source.get(), BUCKET));
    /** 砹桶 */
    public static final DeferredItem<BucketItem> LIQUID_ASTATINE_BUCKET = ITEMS.register("liquid_astatine_bucket", () -> new BucketItem(ECElementFluids.LIQUID_ASTATINE.source.get(), BUCKET));
    /** 氡桶 */
    public static final DeferredItem<BucketItem> LIQUID_RADON_BUCKET = ITEMS.register("liquid_radon_bucket", () -> new BucketItem(ECElementFluids.LIQUID_RADON.source.get(), BUCKET));
    /** 钫桶 */
    public static final DeferredItem<BucketItem> LIQUID_FRANCIUM_BUCKET = ITEMS.register("liquid_francium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_FRANCIUM.source.get(), BUCKET));
    /** 镭桶 */
    public static final DeferredItem<BucketItem> LIQUID_RADIUM_BUCKET = ITEMS.register("liquid_radium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_RADIUM.source.get(), BUCKET));
    /** 锕桶 */
    public static final DeferredItem<BucketItem> LIQUID_ACTINIUM_BUCKET = ITEMS.register("liquid_actinium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_ACTINIUM.source.get(), BUCKET));
    /** 钍桶 */
    public static final DeferredItem<BucketItem> LIQUID_THORIUM_BUCKET = ITEMS.register("liquid_thorium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_THORIUM.source.get(), BUCKET));
    /** 镤桶 */
    public static final DeferredItem<BucketItem> LIQUID_PROTACTINIUM_BUCKET = ITEMS.register("liquid_protactinium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_PROTACTINIUM.source.get(), BUCKET));
    /** 铀桶 */
    public static final DeferredItem<BucketItem> LIQUID_URANIUM_BUCKET = ITEMS.register("liquid_uranium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_URANIUM.source.get(), BUCKET));
    /** 镎桶 */
    public static final DeferredItem<BucketItem> LIQUID_NEPTUNIUM_BUCKET = ITEMS.register("liquid_neptunium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_NEPTUNIUM.source.get(), BUCKET));
    /** 钚桶 */
    public static final DeferredItem<BucketItem> LIQUID_PLUTONIUM_BUCKET = ITEMS.register("liquid_plutonium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_PLUTONIUM.source.get(), BUCKET));
    /** 镅桶 */
    public static final DeferredItem<BucketItem> LIQUID_AMERICIUM_BUCKET = ITEMS.register("liquid_americium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_AMERICIUM.source.get(), BUCKET));
    /** 锔桶 */
    public static final DeferredItem<BucketItem> LIQUID_CURIUM_BUCKET = ITEMS.register("liquid_curium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_CURIUM.source.get(), BUCKET));
    /** 锫桶 */
    public static final DeferredItem<BucketItem> LIQUID_BERKELIUM_BUCKET = ITEMS.register("liquid_berkelium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_BERKELIUM.source.get(), BUCKET));
    /** 锎桶 */
    public static final DeferredItem<BucketItem> LIQUID_CALIFORNIUM_BUCKET = ITEMS.register("liquid_californium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_CALIFORNIUM.source.get(), BUCKET));
    /** 锿桶 */
    public static final DeferredItem<BucketItem> LIQUID_EINSTEINIUM_BUCKET = ITEMS.register("liquid_einsteinium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_EINSTEINIUM.source.get(), BUCKET));
    /** 镄桶 */
    public static final DeferredItem<BucketItem> LIQUID_FERMIUM_BUCKET = ITEMS.register("liquid_fermium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_FERMIUM.source.get(), BUCKET));
    /** 钔桶 */
    public static final DeferredItem<BucketItem> LIQUID_MENDELEVIUM_BUCKET = ITEMS.register("liquid_mendelevium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_MENDELEVIUM.source.get(), BUCKET));
    /** 锘桶 */
    public static final DeferredItem<BucketItem> LIQUID_NOBELIUM_BUCKET = ITEMS.register("liquid_nobelium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_NOBELIUM.source.get(), BUCKET));
    /** 铹桶 */
    public static final DeferredItem<BucketItem> LIQUID_LAWRENCIUM_BUCKET = ITEMS.register("liquid_lawrencium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_LAWRENCIUM.source.get(), BUCKET));
    /** 𬬻桶 */
    public static final DeferredItem<BucketItem> LIQUID_RUTHERFORDIUM_BUCKET = ITEMS.register("liquid_rutherfordium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_RUTHERFORDIUM.source.get(), BUCKET));
    /** 𬭊桶 */
    public static final DeferredItem<BucketItem> LIQUID_DUBNIUM_BUCKET = ITEMS.register("liquid_dubnium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_DUBNIUM.source.get(), BUCKET));
    /** 𬭳桶 */
    public static final DeferredItem<BucketItem> LIQUID_SEABORGIUM_BUCKET = ITEMS.register("liquid_seaborgium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_SEABORGIUM.source.get(), BUCKET));
    /** 𬭛桶 */
    public static final DeferredItem<BucketItem> LIQUID_BOHRIUM_BUCKET = ITEMS.register("liquid_bohrium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_BOHRIUM.source.get(), BUCKET));
    /** 𬭶桶 */
    public static final DeferredItem<BucketItem> LIQUID_HASSIUM_BUCKET = ITEMS.register("liquid_hassium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_HASSIUM.source.get(), BUCKET));
    /** 鿏桶 */
    public static final DeferredItem<BucketItem> LIQUID_MEITNERIUM_BUCKET = ITEMS.register("liquid_meitnerium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_MEITNERIUM.source.get(), BUCKET));
    /** 𫟼桶 */
    public static final DeferredItem<BucketItem> LIQUID_DARMSTADTIUM_BUCKET = ITEMS.register("liquid_darmstadtium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_DARMSTADTIUM.source.get(), BUCKET));
    /** 𬬭桶 */
    public static final DeferredItem<BucketItem> LIQUID_ROENTGENIUM_BUCKET = ITEMS.register("liquid_roentgenium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_ROENTGENIUM.source.get(), BUCKET));
    /** 鿔桶 */
    public static final DeferredItem<BucketItem> LIQUID_COPERNICIUM_BUCKET = ITEMS.register("liquid_copernicium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_COPERNICIUM.source.get(), BUCKET));
    /** 鿭桶 */
    public static final DeferredItem<BucketItem> LIQUID_NIHONIUM_BUCKET = ITEMS.register("liquid_nihonium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_NIHONIUM.source.get(), BUCKET));
    /** 𫓧桶 */
    public static final DeferredItem<BucketItem> LIQUID_FLEROVIUM_BUCKET = ITEMS.register("liquid_flerovium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_FLEROVIUM.source.get(), BUCKET));
    /** 镆桶 */
    public static final DeferredItem<BucketItem> LIQUID_MOSCOVIUM_BUCKET = ITEMS.register("liquid_moscovium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_MOSCOVIUM.source.get(), BUCKET));
    /** 𫟷桶 */
    public static final DeferredItem<BucketItem> LIQUID_LIVERMORIUM_BUCKET = ITEMS.register("liquid_livermorium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_LIVERMORIUM.source.get(), BUCKET));
    /** 鿬桶 */
    public static final DeferredItem<BucketItem> LIQUID_TENNESSINE_BUCKET = ITEMS.register("liquid_tennessine_bucket", () -> new BucketItem(ECElementFluids.LIQUID_TENNESSINE.source.get(), BUCKET));
    /** 鿫桶 */
    public static final DeferredItem<BucketItem> LIQUID_OGANESSON_BUCKET = ITEMS.register("liquid_oganesson_bucket", () -> new BucketItem(ECElementFluids.LIQUID_OGANESSON.source.get(), BUCKET));
    /** 鑨桶 */
    public static final DeferredItem<BucketItem> LIQUID_LONGIUM_BUCKET = ITEMS.register("liquid_longium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_LONGIUM.source.get(), BUCKET));
    /** 镾桶 */
    public static final DeferredItem<BucketItem> LIQUID_MYSTERIUM_BUCKET = ITEMS.register("liquid_mysterium_bucket", () -> new BucketItem(ECElementFluids.LIQUID_MYSTERIUM.source.get(), BUCKET));

    // ==================== 120个元素的气体/蒸气桶 ====================
    /** 氢气桶 */
    public static final DeferredItem<GasBucketItem> HYDROGEN_GAS_BUCKET = ITEMS.register("hydrogen_gas_bucket", () -> new GasBucketItem(ECElementGases.HYDROGEN_GAS.get(), BUCKET));
    /** 氦气桶 */
    public static final DeferredItem<GasBucketItem> HELIUM_GAS_BUCKET = ITEMS.register("helium_gas_bucket", () -> new GasBucketItem(ECElementGases.HELIUM_GAS.get(), BUCKET));
    /** 锂蒸气桶 */
    public static final DeferredItem<GasBucketItem> LITHIUM_VAPOR_BUCKET = ITEMS.register("lithium_vapor_bucket", () -> new GasBucketItem(ECElementGases.LITHIUM_VAPOR.get(), BUCKET));
    /** 铍蒸气桶 */
    public static final DeferredItem<GasBucketItem> BERYLLIUM_VAPOR_BUCKET = ITEMS.register("beryllium_vapor_bucket", () -> new GasBucketItem(ECElementGases.BERYLLIUM_VAPOR.get(), BUCKET));
    /** 硼蒸气桶 */
    public static final DeferredItem<GasBucketItem> BORON_VAPOR_BUCKET = ITEMS.register("boron_vapor_bucket", () -> new GasBucketItem(ECElementGases.BORON_VAPOR.get(), BUCKET));
    /** 碳蒸气桶 */
    public static final DeferredItem<GasBucketItem> CARBON_VAPOR_BUCKET = ITEMS.register("carbon_vapor_bucket", () -> new GasBucketItem(ECElementGases.CARBON_VAPOR.get(), BUCKET));
    /** 氮气桶 */
    public static final DeferredItem<GasBucketItem> NITROGEN_GAS_BUCKET = ITEMS.register("nitrogen_gas_bucket", () -> new GasBucketItem(ECElementGases.NITROGEN_GAS.get(), BUCKET));
    /** 氧气桶 */
    public static final DeferredItem<GasBucketItem> OXYGEN_GAS_BUCKET = ITEMS.register("oxygen_gas_bucket", () -> new GasBucketItem(ECElementGases.OXYGEN_GAS.get(), BUCKET));
    /** 氟气桶 */
    public static final DeferredItem<GasBucketItem> FLUORINE_GAS_BUCKET = ITEMS.register("fluorine_gas_bucket", () -> new GasBucketItem(ECElementGases.FLUORINE_GAS.get(), BUCKET));
    /** 氖气桶 */
    public static final DeferredItem<GasBucketItem> NEON_GAS_BUCKET = ITEMS.register("neon_gas_bucket", () -> new GasBucketItem(ECElementGases.NEON_GAS.get(), BUCKET));
    /** 钠蒸气桶 */
    public static final DeferredItem<GasBucketItem> SODIUM_VAPOR_BUCKET = ITEMS.register("sodium_vapor_bucket", () -> new GasBucketItem(ECElementGases.SODIUM_VAPOR.get(), BUCKET));
    /** 镁蒸气桶 */
    public static final DeferredItem<GasBucketItem> MAGNESIUM_VAPOR_BUCKET = ITEMS.register("magnesium_vapor_bucket", () -> new GasBucketItem(ECElementGases.MAGNESIUM_VAPOR.get(), BUCKET));
    /** 铝蒸气桶 */
    public static final DeferredItem<GasBucketItem> ALUMINUM_VAPOR_BUCKET = ITEMS.register("aluminum_vapor_bucket", () -> new GasBucketItem(ECElementGases.ALUMINUM_VAPOR.get(), BUCKET));
    /** 硅蒸气桶 */
    public static final DeferredItem<GasBucketItem> SILICON_VAPOR_BUCKET = ITEMS.register("silicon_vapor_bucket", () -> new GasBucketItem(ECElementGases.SILICON_VAPOR.get(), BUCKET));
    /** 磷蒸气桶 */
    public static final DeferredItem<GasBucketItem> PHOSPHORUS_VAPOR_BUCKET = ITEMS.register("phosphorus_vapor_bucket", () -> new GasBucketItem(ECElementGases.PHOSPHORUS_VAPOR.get(), BUCKET));
    /** 硫蒸气桶 */
    public static final DeferredItem<GasBucketItem> SULFUR_VAPOR_BUCKET = ITEMS.register("sulfur_vapor_bucket", () -> new GasBucketItem(ECElementGases.SULFUR_VAPOR.get(), BUCKET));
    /** 氯气桶 */
    public static final DeferredItem<GasBucketItem> CHLORINE_GAS_BUCKET = ITEMS.register("chlorine_gas_bucket", () -> new GasBucketItem(ECElementGases.CHLORINE_GAS.get(), BUCKET));
    /** 氩气桶 */
    public static final DeferredItem<GasBucketItem> ARGON_GAS_BUCKET = ITEMS.register("argon_gas_bucket", () -> new GasBucketItem(ECElementGases.ARGON_GAS.get(), BUCKET));
    /** 钾蒸气桶 */
    public static final DeferredItem<GasBucketItem> POTASSIUM_VAPOR_BUCKET = ITEMS.register("potassium_vapor_bucket", () -> new GasBucketItem(ECElementGases.POTASSIUM_VAPOR.get(), BUCKET));
    /** 钙蒸气桶 */
    public static final DeferredItem<GasBucketItem> CALCIUM_VAPOR_BUCKET = ITEMS.register("calcium_vapor_bucket", () -> new GasBucketItem(ECElementGases.CALCIUM_VAPOR.get(), BUCKET));
    /** 钪蒸气桶 */
    public static final DeferredItem<GasBucketItem> SCANDIUM_VAPOR_BUCKET = ITEMS.register("scandium_vapor_bucket", () -> new GasBucketItem(ECElementGases.SCANDIUM_VAPOR.get(), BUCKET));
    /** 钛蒸气桶 */
    public static final DeferredItem<GasBucketItem> TITANIUM_VAPOR_BUCKET = ITEMS.register("titanium_vapor_bucket", () -> new GasBucketItem(ECElementGases.TITANIUM_VAPOR.get(), BUCKET));
    /** 钒蒸气桶 */
    public static final DeferredItem<GasBucketItem> VANADIUM_VAPOR_BUCKET = ITEMS.register("vanadium_vapor_bucket", () -> new GasBucketItem(ECElementGases.VANADIUM_VAPOR.get(), BUCKET));
    /** 铬蒸气桶 */
    public static final DeferredItem<GasBucketItem> CHROMIUM_VAPOR_BUCKET = ITEMS.register("chromium_vapor_bucket", () -> new GasBucketItem(ECElementGases.CHROMIUM_VAPOR.get(), BUCKET));
    /** 锰蒸气桶 */
    public static final DeferredItem<GasBucketItem> MANGANESE_VAPOR_BUCKET = ITEMS.register("manganese_vapor_bucket", () -> new GasBucketItem(ECElementGases.MANGANESE_VAPOR.get(), BUCKET));
    /** 铁蒸气桶 */
    public static final DeferredItem<GasBucketItem> IRON_VAPOR_BUCKET = ITEMS.register("iron_vapor_bucket", () -> new GasBucketItem(ECElementGases.IRON_VAPOR.get(), BUCKET));
    /** 钴蒸气桶 */
    public static final DeferredItem<GasBucketItem> COBALT_VAPOR_BUCKET = ITEMS.register("cobalt_vapor_bucket", () -> new GasBucketItem(ECElementGases.COBALT_VAPOR.get(), BUCKET));
    /** 镍蒸气桶 */
    public static final DeferredItem<GasBucketItem> NICKEL_VAPOR_BUCKET = ITEMS.register("nickel_vapor_bucket", () -> new GasBucketItem(ECElementGases.NICKEL_VAPOR.get(), BUCKET));
    /** 铜蒸气桶 */
    public static final DeferredItem<GasBucketItem> COPPER_VAPOR_BUCKET = ITEMS.register("copper_vapor_bucket", () -> new GasBucketItem(ECElementGases.COPPER_VAPOR.get(), BUCKET));
    /** 锌蒸气桶 */
    public static final DeferredItem<GasBucketItem> ZINC_VAPOR_BUCKET = ITEMS.register("zinc_vapor_bucket", () -> new GasBucketItem(ECElementGases.ZINC_VAPOR.get(), BUCKET));
    /** 镓蒸气桶 */
    public static final DeferredItem<GasBucketItem> GALLIUM_VAPOR_BUCKET = ITEMS.register("gallium_vapor_bucket", () -> new GasBucketItem(ECElementGases.GALLIUM_VAPOR.get(), BUCKET));
    /** 锗蒸气桶 */
    public static final DeferredItem<GasBucketItem> GERMANIUM_VAPOR_BUCKET = ITEMS.register("germanium_vapor_bucket", () -> new GasBucketItem(ECElementGases.GERMANIUM_VAPOR.get(), BUCKET));
    /** 砷蒸气桶 */
    public static final DeferredItem<GasBucketItem> ARSENIC_VAPOR_BUCKET = ITEMS.register("arsenic_vapor_bucket", () -> new GasBucketItem(ECElementGases.ARSENIC_VAPOR.get(), BUCKET));
    /** 硒蒸气桶 */
    public static final DeferredItem<GasBucketItem> SELENIUM_VAPOR_BUCKET = ITEMS.register("selenium_vapor_bucket", () -> new GasBucketItem(ECElementGases.SELENIUM_VAPOR.get(), BUCKET));
    /** 溴蒸气桶 */
    public static final DeferredItem<GasBucketItem> BROMINE_VAPOR_BUCKET = ITEMS.register("bromine_vapor_bucket", () -> new GasBucketItem(ECElementGases.BROMINE_VAPOR.get(), BUCKET));
    /** 氪气桶 */
    public static final DeferredItem<GasBucketItem> KRYPTON_GAS_BUCKET = ITEMS.register("krypton_gas_bucket", () -> new GasBucketItem(ECElementGases.KRYPTON_GAS.get(), BUCKET));
    /** 铷蒸气桶 */
    public static final DeferredItem<GasBucketItem> RUBIDIUM_VAPOR_BUCKET = ITEMS.register("rubidium_vapor_bucket", () -> new GasBucketItem(ECElementGases.RUBIDIUM_VAPOR.get(), BUCKET));
    /** 锶蒸气桶 */
    public static final DeferredItem<GasBucketItem> STRONTIUM_VAPOR_BUCKET = ITEMS.register("strontium_vapor_bucket", () -> new GasBucketItem(ECElementGases.STRONTIUM_VAPOR.get(), BUCKET));
    /** 钇蒸气桶 */
    public static final DeferredItem<GasBucketItem> YTTRIUM_VAPOR_BUCKET = ITEMS.register("yttrium_vapor_bucket", () -> new GasBucketItem(ECElementGases.YTTRIUM_VAPOR.get(), BUCKET));
    /** 锆蒸气桶 */
    public static final DeferredItem<GasBucketItem> ZIRCONIUM_VAPOR_BUCKET = ITEMS.register("zirconium_vapor_bucket", () -> new GasBucketItem(ECElementGases.ZIRCONIUM_VAPOR.get(), BUCKET));
    /** 铌蒸气桶 */
    public static final DeferredItem<GasBucketItem> NIOBIUM_VAPOR_BUCKET = ITEMS.register("niobium_vapor_bucket", () -> new GasBucketItem(ECElementGases.NIOBIUM_VAPOR.get(), BUCKET));
    /** 钼蒸气桶 */
    public static final DeferredItem<GasBucketItem> MOLYBDENUM_VAPOR_BUCKET = ITEMS.register("molybdenum_vapor_bucket", () -> new GasBucketItem(ECElementGases.MOLYBDENUM_VAPOR.get(), BUCKET));
    /** 锝蒸气桶 */
    public static final DeferredItem<GasBucketItem> TECHNETIUM_VAPOR_BUCKET = ITEMS.register("technetium_vapor_bucket", () -> new GasBucketItem(ECElementGases.TECHNETIUM_VAPOR.get(), BUCKET));
    /** 钌蒸气桶 */
    public static final DeferredItem<GasBucketItem> RUTHENIUM_VAPOR_BUCKET = ITEMS.register("ruthenium_vapor_bucket", () -> new GasBucketItem(ECElementGases.RUTHENIUM_VAPOR.get(), BUCKET));
    /** 铑蒸气桶 */
    public static final DeferredItem<GasBucketItem> RHODIUM_VAPOR_BUCKET = ITEMS.register("rhodium_vapor_bucket", () -> new GasBucketItem(ECElementGases.RHODIUM_VAPOR.get(), BUCKET));
    /** 钯蒸气桶 */
    public static final DeferredItem<GasBucketItem> PALLADIUM_VAPOR_BUCKET = ITEMS.register("palladium_vapor_bucket", () -> new GasBucketItem(ECElementGases.PALLADIUM_VAPOR.get(), BUCKET));
    /** 银蒸气桶 */
    public static final DeferredItem<GasBucketItem> SILVER_VAPOR_BUCKET = ITEMS.register("silver_vapor_bucket", () -> new GasBucketItem(ECElementGases.SILVER_VAPOR.get(), BUCKET));
    /** 镉蒸气桶 */
    public static final DeferredItem<GasBucketItem> CADMIUM_VAPOR_BUCKET = ITEMS.register("cadmium_vapor_bucket", () -> new GasBucketItem(ECElementGases.CADMIUM_VAPOR.get(), BUCKET));
    /** 铟蒸气桶 */
    public static final DeferredItem<GasBucketItem> INDIUM_VAPOR_BUCKET = ITEMS.register("indium_vapor_bucket", () -> new GasBucketItem(ECElementGases.INDIUM_VAPOR.get(), BUCKET));
    /** 锡蒸气桶 */
    public static final DeferredItem<GasBucketItem> TIN_VAPOR_BUCKET = ITEMS.register("tin_vapor_bucket", () -> new GasBucketItem(ECElementGases.TIN_VAPOR.get(), BUCKET));
    /** 锑蒸气桶 */
    public static final DeferredItem<GasBucketItem> ANTIMONY_VAPOR_BUCKET = ITEMS.register("antimony_vapor_bucket", () -> new GasBucketItem(ECElementGases.ANTIMONY_VAPOR.get(), BUCKET));
    /** 碲蒸气桶 */
    public static final DeferredItem<GasBucketItem> TELLURIUM_VAPOR_BUCKET = ITEMS.register("tellurium_vapor_bucket", () -> new GasBucketItem(ECElementGases.TELLURIUM_VAPOR.get(), BUCKET));
    /** 碘蒸气桶 */
    public static final DeferredItem<GasBucketItem> IODINE_VAPOR_BUCKET = ITEMS.register("iodine_vapor_bucket", () -> new GasBucketItem(ECElementGases.IODINE_VAPOR.get(), BUCKET));
    /** 氙气桶 */
    public static final DeferredItem<GasBucketItem> XENON_GAS_BUCKET = ITEMS.register("xenon_gas_bucket", () -> new GasBucketItem(ECElementGases.XENON_GAS.get(), BUCKET));
    /** 铯蒸气桶 */
    public static final DeferredItem<GasBucketItem> CESIUM_VAPOR_BUCKET = ITEMS.register("cesium_vapor_bucket", () -> new GasBucketItem(ECElementGases.CESIUM_VAPOR.get(), BUCKET));
    /** 钡蒸气桶 */
    public static final DeferredItem<GasBucketItem> BARIUM_VAPOR_BUCKET = ITEMS.register("barium_vapor_bucket", () -> new GasBucketItem(ECElementGases.BARIUM_VAPOR.get(), BUCKET));
    /** 镧蒸气桶 */
    public static final DeferredItem<GasBucketItem> LANTHANUM_VAPOR_BUCKET = ITEMS.register("lanthanum_vapor_bucket", () -> new GasBucketItem(ECElementGases.LANTHANUM_VAPOR.get(), BUCKET));
    /** 铈蒸气桶 */
    public static final DeferredItem<GasBucketItem> CERIUM_VAPOR_BUCKET = ITEMS.register("cerium_vapor_bucket", () -> new GasBucketItem(ECElementGases.CERIUM_VAPOR.get(), BUCKET));
    /** 镨蒸气桶 */
    public static final DeferredItem<GasBucketItem> PRASEODYMIUM_VAPOR_BUCKET = ITEMS.register("praseodymium_vapor_bucket", () -> new GasBucketItem(ECElementGases.PRASEODYMIUM_VAPOR.get(), BUCKET));
    /** 钕蒸气桶 */
    public static final DeferredItem<GasBucketItem> NEODYMIUM_VAPOR_BUCKET = ITEMS.register("neodymium_vapor_bucket", () -> new GasBucketItem(ECElementGases.NEODYMIUM_VAPOR.get(), BUCKET));
    /** 钷蒸气桶 */
    public static final DeferredItem<GasBucketItem> PROMETHIUM_VAPOR_BUCKET = ITEMS.register("promethium_vapor_bucket", () -> new GasBucketItem(ECElementGases.PROMETHIUM_VAPOR.get(), BUCKET));
    /** 钐蒸气桶 */
    public static final DeferredItem<GasBucketItem> SAMARIUM_VAPOR_BUCKET = ITEMS.register("samarium_vapor_bucket", () -> new GasBucketItem(ECElementGases.SAMARIUM_VAPOR.get(), BUCKET));
    /** 铕蒸气桶 */
    public static final DeferredItem<GasBucketItem> EUROPIUM_VAPOR_BUCKET = ITEMS.register("europium_vapor_bucket", () -> new GasBucketItem(ECElementGases.EUROPIUM_VAPOR.get(), BUCKET));
    /** 钆蒸气桶 */
    public static final DeferredItem<GasBucketItem> GADOLINIUM_VAPOR_BUCKET = ITEMS.register("gadolinium_vapor_bucket", () -> new GasBucketItem(ECElementGases.GADOLINIUM_VAPOR.get(), BUCKET));
    /** 铽蒸气桶 */
    public static final DeferredItem<GasBucketItem> TERBIUM_VAPOR_BUCKET = ITEMS.register("terbium_vapor_bucket", () -> new GasBucketItem(ECElementGases.TERBIUM_VAPOR.get(), BUCKET));
    /** 镝蒸气桶 */
    public static final DeferredItem<GasBucketItem> DYSPROSIUM_VAPOR_BUCKET = ITEMS.register("dysprosium_vapor_bucket", () -> new GasBucketItem(ECElementGases.DYSPROSIUM_VAPOR.get(), BUCKET));
    /** 钬蒸气桶 */
    public static final DeferredItem<GasBucketItem> HOLMIUM_VAPOR_BUCKET = ITEMS.register("holmium_vapor_bucket", () -> new GasBucketItem(ECElementGases.HOLMIUM_VAPOR.get(), BUCKET));
    /** 铒蒸气桶 */
    public static final DeferredItem<GasBucketItem> ERBIUM_VAPOR_BUCKET = ITEMS.register("erbium_vapor_bucket", () -> new GasBucketItem(ECElementGases.ERBIUM_VAPOR.get(), BUCKET));
    /** 铥蒸气桶 */
    public static final DeferredItem<GasBucketItem> THULIUM_VAPOR_BUCKET = ITEMS.register("thulium_vapor_bucket", () -> new GasBucketItem(ECElementGases.THULIUM_VAPOR.get(), BUCKET));
    /** 镱蒸气桶 */
    public static final DeferredItem<GasBucketItem> YTTERBIUM_VAPOR_BUCKET = ITEMS.register("ytterbium_vapor_bucket", () -> new GasBucketItem(ECElementGases.YTTERBIUM_VAPOR.get(), BUCKET));
    /** 镥蒸气桶 */
    public static final DeferredItem<GasBucketItem> LUTETIUM_VAPOR_BUCKET = ITEMS.register("lutetium_vapor_bucket", () -> new GasBucketItem(ECElementGases.LUTETIUM_VAPOR.get(), BUCKET));
    /** 铪蒸气桶 */
    public static final DeferredItem<GasBucketItem> HAFNIUM_VAPOR_BUCKET = ITEMS.register("hafnium_vapor_bucket", () -> new GasBucketItem(ECElementGases.HAFNIUM_VAPOR.get(), BUCKET));
    /** 钽蒸气桶 */
    public static final DeferredItem<GasBucketItem> TANTALUM_VAPOR_BUCKET = ITEMS.register("tantalum_vapor_bucket", () -> new GasBucketItem(ECElementGases.TANTALUM_VAPOR.get(), BUCKET));
    /** 钨蒸气桶 */
    public static final DeferredItem<GasBucketItem> TUNGSTEN_VAPOR_BUCKET = ITEMS.register("tungsten_vapor_bucket", () -> new GasBucketItem(ECElementGases.TUNGSTEN_VAPOR.get(), BUCKET));
    /** 铼蒸气桶 */
    public static final DeferredItem<GasBucketItem> RHENIUM_VAPOR_BUCKET = ITEMS.register("rhenium_vapor_bucket", () -> new GasBucketItem(ECElementGases.RHENIUM_VAPOR.get(), BUCKET));
    /** 锇蒸气桶 */
    public static final DeferredItem<GasBucketItem> OSMIUM_VAPOR_BUCKET = ITEMS.register("osmium_vapor_bucket", () -> new GasBucketItem(ECElementGases.OSMIUM_VAPOR.get(), BUCKET));
    /** 铱蒸气桶 */
    public static final DeferredItem<GasBucketItem> IRIDIUM_VAPOR_BUCKET = ITEMS.register("iridium_vapor_bucket", () -> new GasBucketItem(ECElementGases.IRIDIUM_VAPOR.get(), BUCKET));
    /** 铂蒸气桶 */
    public static final DeferredItem<GasBucketItem> PLATINUM_VAPOR_BUCKET = ITEMS.register("platinum_vapor_bucket", () -> new GasBucketItem(ECElementGases.PLATINUM_VAPOR.get(), BUCKET));
    /** 金蒸气桶 */
    public static final DeferredItem<GasBucketItem> GOLD_VAPOR_BUCKET = ITEMS.register("gold_vapor_bucket", () -> new GasBucketItem(ECElementGases.GOLD_VAPOR.get(), BUCKET));
    /** 汞蒸气桶 */
    public static final DeferredItem<GasBucketItem> MERCURY_VAPOR_BUCKET = ITEMS.register("mercury_vapor_bucket", () -> new GasBucketItem(ECElementGases.MERCURY_VAPOR.get(), BUCKET));
    /** 铊蒸气桶 */
    public static final DeferredItem<GasBucketItem> THALLIUM_VAPOR_BUCKET = ITEMS.register("thallium_vapor_bucket", () -> new GasBucketItem(ECElementGases.THALLIUM_VAPOR.get(), BUCKET));
    /** 铅蒸气桶 */
    public static final DeferredItem<GasBucketItem> LEAD_VAPOR_BUCKET = ITEMS.register("lead_vapor_bucket", () -> new GasBucketItem(ECElementGases.LEAD_VAPOR.get(), BUCKET));
    /** 铋蒸气桶 */
    public static final DeferredItem<GasBucketItem> BISMUTH_VAPOR_BUCKET = ITEMS.register("bismuth_vapor_bucket", () -> new GasBucketItem(ECElementGases.BISMUTH_VAPOR.get(), BUCKET));
    /** 钋蒸气桶 */
    public static final DeferredItem<GasBucketItem> POLONIUM_VAPOR_BUCKET = ITEMS.register("polonium_vapor_bucket", () -> new GasBucketItem(ECElementGases.POLONIUM_VAPOR.get(), BUCKET));
    /** 砹蒸气桶 */
    public static final DeferredItem<GasBucketItem> ASTATINE_VAPOR_BUCKET = ITEMS.register("astatine_vapor_bucket", () -> new GasBucketItem(ECElementGases.ASTATINE_VAPOR.get(), BUCKET));
    /** 氡气桶 */
    public static final DeferredItem<GasBucketItem> RADON_GAS_BUCKET = ITEMS.register("radon_gas_bucket", () -> new GasBucketItem(ECElementGases.RADON_GAS.get(), BUCKET));
    /** 钫蒸气桶 */
    public static final DeferredItem<GasBucketItem> FRANCIUM_VAPOR_BUCKET = ITEMS.register("francium_vapor_bucket", () -> new GasBucketItem(ECElementGases.FRANCIUM_VAPOR.get(), BUCKET));
    /** 镭蒸气桶 */
    public static final DeferredItem<GasBucketItem> RADIUM_VAPOR_BUCKET = ITEMS.register("radium_vapor_bucket", () -> new GasBucketItem(ECElementGases.RADIUM_VAPOR.get(), BUCKET));
    /** 锕蒸气桶 */
    public static final DeferredItem<GasBucketItem> ACTINIUM_VAPOR_BUCKET = ITEMS.register("actinium_vapor_bucket", () -> new GasBucketItem(ECElementGases.ACTINIUM_VAPOR.get(), BUCKET));
    /** 钍蒸气桶 */
    public static final DeferredItem<GasBucketItem> THORIUM_VAPOR_BUCKET = ITEMS.register("thorium_vapor_bucket", () -> new GasBucketItem(ECElementGases.THORIUM_VAPOR.get(), BUCKET));
    /** 镤蒸气桶 */
    public static final DeferredItem<GasBucketItem> PROTACTINIUM_VAPOR_BUCKET = ITEMS.register("protactinium_vapor_bucket", () -> new GasBucketItem(ECElementGases.PROTACTINIUM_VAPOR.get(), BUCKET));
    /** 铀蒸气桶 */
    public static final DeferredItem<GasBucketItem> URANIUM_VAPOR_BUCKET = ITEMS.register("uranium_vapor_bucket", () -> new GasBucketItem(ECElementGases.URANIUM_VAPOR.get(), BUCKET));
    /** 镎蒸气桶 */
    public static final DeferredItem<GasBucketItem> NEPTUNIUM_VAPOR_BUCKET = ITEMS.register("neptunium_vapor_bucket", () -> new GasBucketItem(ECElementGases.NEPTUNIUM_VAPOR.get(), BUCKET));
    /** 钚蒸气桶 */
    public static final DeferredItem<GasBucketItem> PLUTONIUM_VAPOR_BUCKET = ITEMS.register("plutonium_vapor_bucket", () -> new GasBucketItem(ECElementGases.PLUTONIUM_VAPOR.get(), BUCKET));
    /** 镅蒸气桶 */
    public static final DeferredItem<GasBucketItem> AMERICIUM_VAPOR_BUCKET = ITEMS.register("americium_vapor_bucket", () -> new GasBucketItem(ECElementGases.AMERICIUM_VAPOR.get(), BUCKET));
    /** 锔蒸气桶 */
    public static final DeferredItem<GasBucketItem> CURIUM_VAPOR_BUCKET = ITEMS.register("curium_vapor_bucket", () -> new GasBucketItem(ECElementGases.CURIUM_VAPOR.get(), BUCKET));
    /** 锫蒸气桶 */
    public static final DeferredItem<GasBucketItem> BERKELIUM_VAPOR_BUCKET = ITEMS.register("berkelium_vapor_bucket", () -> new GasBucketItem(ECElementGases.BERKELIUM_VAPOR.get(), BUCKET));
    /** 锎蒸气桶 */
    public static final DeferredItem<GasBucketItem> CALIFORNIUM_VAPOR_BUCKET = ITEMS.register("californium_vapor_bucket", () -> new GasBucketItem(ECElementGases.CALIFORNIUM_VAPOR.get(), BUCKET));
    /** 锿蒸气桶 */
    public static final DeferredItem<GasBucketItem> EINSTEINIUM_VAPOR_BUCKET = ITEMS.register("einsteinium_vapor_bucket", () -> new GasBucketItem(ECElementGases.EINSTEINIUM_VAPOR.get(), BUCKET));
    /** 镄蒸气桶 */
    public static final DeferredItem<GasBucketItem> FERMIUM_VAPOR_BUCKET = ITEMS.register("fermium_vapor_bucket", () -> new GasBucketItem(ECElementGases.FERMIUM_VAPOR.get(), BUCKET));
    /** 钔蒸气桶 */
    public static final DeferredItem<GasBucketItem> MENDELEVIUM_VAPOR_BUCKET = ITEMS.register("mendelevium_vapor_bucket", () -> new GasBucketItem(ECElementGases.MENDELEVIUM_VAPOR.get(), BUCKET));
    /** 锘蒸气桶 */
    public static final DeferredItem<GasBucketItem> NOBELIUM_VAPOR_BUCKET = ITEMS.register("nobelium_vapor_bucket", () -> new GasBucketItem(ECElementGases.NOBELIUM_VAPOR.get(), BUCKET));
    /** 铹蒸气桶 */
    public static final DeferredItem<GasBucketItem> LAWRENCIUM_VAPOR_BUCKET = ITEMS.register("lawrencium_vapor_bucket", () -> new GasBucketItem(ECElementGases.LAWRENCIUM_VAPOR.get(), BUCKET));
    /** 𬬻蒸气桶 */
    public static final DeferredItem<GasBucketItem> RUTHERFORDIUM_VAPOR_BUCKET = ITEMS.register("rutherfordium_vapor_bucket", () -> new GasBucketItem(ECElementGases.RUTHERFORDIUM_VAPOR.get(), BUCKET));
    /** 𬭊蒸气桶 */
    public static final DeferredItem<GasBucketItem> DUBNIUM_VAPOR_BUCKET = ITEMS.register("dubnium_vapor_bucket", () -> new GasBucketItem(ECElementGases.DUBNIUM_VAPOR.get(), BUCKET));
    /** 𬭳蒸气桶 */
    public static final DeferredItem<GasBucketItem> SEABORGIUM_VAPOR_BUCKET = ITEMS.register("seaborgium_vapor_bucket", () -> new GasBucketItem(ECElementGases.SEABORGIUM_VAPOR.get(), BUCKET));
    /** 𬭛蒸气桶 */
    public static final DeferredItem<GasBucketItem> BOHRIUM_VAPOR_BUCKET = ITEMS.register("bohrium_vapor_bucket", () -> new GasBucketItem(ECElementGases.BOHRIUM_VAPOR.get(), BUCKET));
    /** 𬭶蒸气桶 */
    public static final DeferredItem<GasBucketItem> HASSIUM_VAPOR_BUCKET = ITEMS.register("hassium_vapor_bucket", () -> new GasBucketItem(ECElementGases.HASSIUM_VAPOR.get(), BUCKET));
    /** 鿏蒸气桶 */
    public static final DeferredItem<GasBucketItem> MEITNERIUM_VAPOR_BUCKET = ITEMS.register("meitnerium_vapor_bucket", () -> new GasBucketItem(ECElementGases.MEITNERIUM_VAPOR.get(), BUCKET));
    /** 𫟼蒸气桶 */
    public static final DeferredItem<GasBucketItem> DARMSTADTIUM_VAPOR_BUCKET = ITEMS.register("darmstadtium_vapor_bucket", () -> new GasBucketItem(ECElementGases.DARMSTADTIUM_VAPOR.get(), BUCKET));
    /** 𬬭蒸气桶 */
    public static final DeferredItem<GasBucketItem> ROENTGENIUM_VAPOR_BUCKET = ITEMS.register("roentgenium_vapor_bucket", () -> new GasBucketItem(ECElementGases.ROENTGENIUM_VAPOR.get(), BUCKET));
    /** 鿔蒸气桶 */
    public static final DeferredItem<GasBucketItem> COPERNICIUM_VAPOR_BUCKET = ITEMS.register("copernicium_vapor_bucket", () -> new GasBucketItem(ECElementGases.COPERNICIUM_VAPOR.get(), BUCKET));
    /** 鿭蒸气桶 */
    public static final DeferredItem<GasBucketItem> NIHONIUM_VAPOR_BUCKET = ITEMS.register("nihonium_vapor_bucket", () -> new GasBucketItem(ECElementGases.NIHONIUM_VAPOR.get(), BUCKET));
    /** 𫓧蒸气桶 */
    public static final DeferredItem<GasBucketItem> FLEROVIUM_VAPOR_BUCKET = ITEMS.register("flerovium_vapor_bucket", () -> new GasBucketItem(ECElementGases.FLEROVIUM_VAPOR.get(), BUCKET));
    /** 镆蒸气桶 */
    public static final DeferredItem<GasBucketItem> MOSCOVIUM_VAPOR_BUCKET = ITEMS.register("moscovium_vapor_bucket", () -> new GasBucketItem(ECElementGases.MOSCOVIUM_VAPOR.get(), BUCKET));
    /** 𫟷蒸气桶 */
    public static final DeferredItem<GasBucketItem> LIVERMORIUM_VAPOR_BUCKET = ITEMS.register("livermorium_vapor_bucket", () -> new GasBucketItem(ECElementGases.LIVERMORIUM_VAPOR.get(), BUCKET));
    /** 鿬蒸气桶 */
    public static final DeferredItem<GasBucketItem> TENNESSINE_VAPOR_BUCKET = ITEMS.register("tennessine_vapor_bucket", () -> new GasBucketItem(ECElementGases.TENNESSINE_VAPOR.get(), BUCKET));
    /** 鿫气桶 */
    public static final DeferredItem<GasBucketItem> OGANESSON_GAS_BUCKET = ITEMS.register("oganesson_gas_bucket", () -> new GasBucketItem(ECElementGases.OGANESSON_GAS.get(), BUCKET));
    /** 鑨蒸气桶 */
    public static final DeferredItem<GasBucketItem> LONGIUM_VAPOR_BUCKET = ITEMS.register("longium_vapor_bucket", () -> new GasBucketItem(ECElementGases.LONGIUM_VAPOR.get(), BUCKET));
    /** 镾蒸气桶 */
    public static final DeferredItem<GasBucketItem> MYSTERIUM_VAPOR_BUCKET = ITEMS.register("mysterium_vapor_bucket", () -> new GasBucketItem(ECElementGases.MYSTERIUM_VAPOR.get(), BUCKET));

    // ==================== 批量注册 矿锭/粒/齿轮/板/粉/棍/线/粉碎粗矿/粗矿 ====================
    public static final class OreItems {
        public static final List<DeferredItem<?>> ALL_ITEMS = new ArrayList<>();
        public static final List<ECElementItems.OreItems> ALL_ORE_ITEMS = new ArrayList<>();

        public final DeferredHolder<Item, Item> INGOT;
        public final DeferredHolder<Item, Item> NUGGET;
        public final DeferredHolder<Item, Item> GEAR;
        public final DeferredHolder<Item, Item> DUST;
        public final DeferredHolder<Item, Item> PLATE;
        public final DeferredHolder<Item, Item> ROD;
        public final DeferredHolder<Item, Item> WIRE;
        public final DeferredHolder<Item, Item> CRUSHED_RAW;
        public final DeferredHolder<Item, Item> RAW;

        public OreItems(String materialName, Rarity rarity) {
            this(materialName, rarity, null, null, null);
        }

        /**
         * @param vanillaIngot  原版已有的锭；传 null 表示由本模组注册
         * @param vanillaNugget 原版已有的粒；传 null 表示由本模组注册
         * @param vanillaRaw    原版已有的粗矿；传 null 表示由本模组注册
         */
        public OreItems(String materialName, Rarity rarity,
                        @Nullable Item vanillaIngot, @Nullable Item vanillaNugget, @Nullable Item vanillaRaw) {
            INGOT = registerOrLink(materialName + "_ingot", rarity, vanillaIngot);
            NUGGET = registerOrLink(materialName + "_nugget", rarity, vanillaNugget);
            GEAR = registerAndAdd(materialName + "_gear", rarity);
            DUST = registerAndAdd(materialName + "_dust", rarity);
            PLATE = registerAndAdd(materialName + "_plate", rarity);
            ROD = registerAndAdd(materialName + "_rod", rarity);
            WIRE = registerAndAdd(materialName + "_wire", rarity);
            CRUSHED_RAW = registerAndAdd("crushed_raw_" + materialName, rarity);
            RAW = registerOrLink("raw_" + materialName, rarity, vanillaRaw);
            ALL_ORE_ITEMS.add(this);
        }

        private DeferredHolder<Item, Item> registerOrLink(String name, Rarity rarity, @Nullable Item vanilla) {
            return vanilla == null ? registerAndAdd(name, rarity) : ContentRefs.vanillaItem(vanilla);
        }

        private DeferredHolder<Item, Item> registerAndAdd(String name, Rarity rarity) {
            DeferredItem<Item> item = ITEMS.register(name, () -> new Item(new Item.Properties().rarity(rarity)));
            ALL_ITEMS.add(item);
            return item;
        }

        public static @Nullable OreItems byName(String materialName) {
            for (OreItems ore : ALL_ORE_ITEMS) {
                if (ore.INGOT.getId().getPath().equals(materialName + "_ingot")) {
                    return ore;
                }
            }
            return null;
        }

        public void addToCreativeTab(Consumer<ItemStack> output) {
            output.accept(new ItemStack(INGOT.get()));
            output.accept(new ItemStack(NUGGET.get()));
            output.accept(new ItemStack(GEAR.get()));
            output.accept(new ItemStack(DUST.get()));
            output.accept(new ItemStack(PLATE.get()));
            output.accept(new ItemStack(ROD.get()));
            output.accept(new ItemStack(WIRE.get()));
            output.accept(new ItemStack(CRUSHED_RAW.get()));
            output.accept(new ItemStack(RAW.get()));
        }
    }

    // ==================== 批量注册 合金锭/粒/齿轮/板/粉/棍/线 ====================
    public static final class NoOreItems {
        public static final List<DeferredItem<?>> ALL_ITEMS = new ArrayList<>();
        public static final List<ECElementItems.NoOreItems> ALL_NOE_ORE_ITEMS = new ArrayList<>();

        public final DeferredItem<Item> INGOT;
        public final DeferredItem<Item> NUGGET;
        public final DeferredItem<Item> GEAR;
        public final DeferredItem<Item> DUST;
        public final DeferredItem<Item> PLATE;
        public final DeferredItem<Item> ROD;
        public final DeferredItem<Item> WIRE;

        public NoOreItems(String materialName, Rarity rarity) {
            INGOT = registerAndAdd(materialName + "_ingot", rarity);
            NUGGET = registerAndAdd(materialName + "_nugget", rarity);
            GEAR = registerAndAdd(materialName + "_gear", rarity);
            DUST = registerAndAdd(materialName + "_dust", rarity);
            PLATE = registerAndAdd(materialName + "_plate", rarity);
            ROD = registerAndAdd(materialName + "_rod", rarity);
            WIRE = registerAndAdd(materialName + "_wire", rarity);
            ALL_NOE_ORE_ITEMS.add(this);
        }

        private DeferredItem<Item> registerAndAdd(String name, Rarity rarity) {
            DeferredItem<Item> item = ITEMS.register(name, () -> new Item(new Item.Properties().rarity(rarity)));
            ALL_ITEMS.add(item);
            return item;
        }

        public void addToCreativeTab(Consumer<ItemStack> output) {
            output.accept(new ItemStack(INGOT.get()));
            output.accept(new ItemStack(NUGGET.get()));
            output.accept(new ItemStack(GEAR.get()));
            output.accept(new ItemStack(DUST.get()));
            output.accept(new ItemStack(PLATE.get()));
            output.accept(new ItemStack(ROD.get()));
            output.accept(new ItemStack(WIRE.get()));
        }
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
        ECMaterialItems.ITEMS.register(eventBus);
    }
}