package com.chinaex123.elementum_core.init.items;

import com.chinaex123.elementum_core.ElementumCore;
import com.chinaex123.elementum_core.init.fluids.ECFluids;
import com.chinaex123.elementum_core.init.gas.ECGases;
import com.chinaex123.elementum_core.item.GasBucketItem;
import net.minecraft.world.item.*;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ECMaterialItems {
    public static final DeferredRegister.Items ITEMS_REGISTER = DeferredRegister.createItems(ElementumCore.MODID);
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
    /** 铁 */
    public static final OreItems IRON = new OreItems("iron", Rarity.EPIC);
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
    /** 金 */
    public static final OreItems GOLD = new OreItems("gold", Rarity.EPIC);
    /** 汞 */
    public static final OreItems HYDRARGYRUM = new OreItems("hydrargyrum", Rarity.EPIC);
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
    /** 鉨 */
    public static final OreItems NIHONIUM = new OreItems("nihonium", Rarity.EPIC);
    /** 鈇 */
    public static final OreItems FLEROVIUM = new OreItems("flerovium", Rarity.EPIC);
    /** 镆 */
    public static final OreItems MOSCOVIUM = new OreItems("moscovium", Rarity.EPIC);
    /** 鉝 */
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
    public static final DeferredItem<BucketItem> HYDROGEN_BUCKET = ITEMS_REGISTER.register("hydrogen_bucket", () -> new BucketItem(ECFluids.HYDROGEN.source.get(), BUCKET));
    /** 氦桶 */
    public static final DeferredItem<BucketItem> HELIUM_BUCKET = ITEMS_REGISTER.register("helium_bucket", () -> new BucketItem(ECFluids.HELIUM.source.get(), BUCKET));
    /** 锂桶 */
    public static final DeferredItem<BucketItem> LITHIUM_BUCKET = ITEMS_REGISTER.register("lithium_bucket", () -> new BucketItem(ECFluids.LITHIUM.source.get(), BUCKET));
    /** 铍桶 */
    public static final DeferredItem<BucketItem> BERYLLIUM_BUCKET = ITEMS_REGISTER.register("beryllium_bucket", () -> new BucketItem(ECFluids.BERYLLIUM.source.get(), BUCKET));
    /** 硼桶 */
    public static final DeferredItem<BucketItem> BORON_BUCKET = ITEMS_REGISTER.register("boron_bucket", () -> new BucketItem(ECFluids.BORON.source.get(), BUCKET));
    /** 碳桶 */
    public static final DeferredItem<BucketItem> CARBON_BUCKET = ITEMS_REGISTER.register("carbon_bucket", () -> new BucketItem(ECFluids.CARBON.source.get(), BUCKET));
    /** 氮桶 */
    public static final DeferredItem<BucketItem> NITROGEN_BUCKET = ITEMS_REGISTER.register("nitrogen_bucket", () -> new BucketItem(ECFluids.NITROGEN.source.get(), BUCKET));
    /** 氧桶 */
    public static final DeferredItem<BucketItem> OXYGEN_BUCKET = ITEMS_REGISTER.register("oxygen_bucket", () -> new BucketItem(ECFluids.OXYGEN.source.get(), BUCKET));
    /** 氟桶 */
    public static final DeferredItem<BucketItem> FLUORINE_BUCKET = ITEMS_REGISTER.register("fluorine_bucket", () -> new BucketItem(ECFluids.FLUORINE.source.get(), BUCKET));
    /** 氖桶 */
    public static final DeferredItem<BucketItem> NEON_BUCKET = ITEMS_REGISTER.register("neon_bucket", () -> new BucketItem(ECFluids.NEON.source.get(), BUCKET));
    /** 钠桶 */
    public static final DeferredItem<BucketItem> SODIUM_BUCKET = ITEMS_REGISTER.register("sodium_bucket", () -> new BucketItem(ECFluids.SODIUM.source.get(), BUCKET));
    /** 镁桶 */
    public static final DeferredItem<BucketItem> MAGNESIUM_BUCKET = ITEMS_REGISTER.register("magnesium_bucket", () -> new BucketItem(ECFluids.MAGNESIUM.source.get(), BUCKET));
    /** 铝桶 */
    public static final DeferredItem<BucketItem> ALUMINUM_BUCKET = ITEMS_REGISTER.register("aluminum_bucket", () -> new BucketItem(ECFluids.ALUMINUM.source.get(), BUCKET));
    /** 硅桶 */
    public static final DeferredItem<BucketItem> SILICON_BUCKET = ITEMS_REGISTER.register("silicon_bucket", () -> new BucketItem(ECFluids.SILICON.source.get(), BUCKET));
    /** 磷桶 */
    public static final DeferredItem<BucketItem> PHOSPHORUS_BUCKET = ITEMS_REGISTER.register("phosphorus_bucket", () -> new BucketItem(ECFluids.PHOSPHORUS.source.get(), BUCKET));
    /** 硫桶 */
    public static final DeferredItem<BucketItem> SULFUR_BUCKET = ITEMS_REGISTER.register("sulfur_bucket", () -> new BucketItem(ECFluids.SULFUR.source.get(), BUCKET));
    /** 氯桶 */
    public static final DeferredItem<BucketItem> CHLORINE_BUCKET = ITEMS_REGISTER.register("chlorine_bucket", () -> new BucketItem(ECFluids.CHLORINE.source.get(), BUCKET));
    /** 氩桶 */
    public static final DeferredItem<BucketItem> ARGON_BUCKET = ITEMS_REGISTER.register("argon_bucket", () -> new BucketItem(ECFluids.ARGON.source.get(), BUCKET));
    /** 钾桶 */
    public static final DeferredItem<BucketItem> POTASSIUM_BUCKET = ITEMS_REGISTER.register("potassium_bucket", () -> new BucketItem(ECFluids.POTASSIUM.source.get(), BUCKET));
    /** 钙桶 */
    public static final DeferredItem<BucketItem> CALCIUM_BUCKET = ITEMS_REGISTER.register("calcium_bucket", () -> new BucketItem(ECFluids.CALCIUM.source.get(), BUCKET));
    /** 钪桶 */
    public static final DeferredItem<BucketItem> SCANDIUM_BUCKET = ITEMS_REGISTER.register("scandium_bucket", () -> new BucketItem(ECFluids.SCANDIUM.source.get(), BUCKET));
    /** 钛桶 */
    public static final DeferredItem<BucketItem> TITANIUM_BUCKET = ITEMS_REGISTER.register("titanium_bucket", () -> new BucketItem(ECFluids.TITANIUM.source.get(), BUCKET));
    /** 钒桶 */
    public static final DeferredItem<BucketItem> VANADIUM_BUCKET = ITEMS_REGISTER.register("vanadium_bucket", () -> new BucketItem(ECFluids.VANADIUM.source.get(), BUCKET));
    /** 铬桶 */
    public static final DeferredItem<BucketItem> CHROMIUM_BUCKET = ITEMS_REGISTER.register("chromium_bucket", () -> new BucketItem(ECFluids.CHROMIUM.source.get(), BUCKET));
    /** 锰桶 */
    public static final DeferredItem<BucketItem> MANGANESE_BUCKET = ITEMS_REGISTER.register("manganese_bucket", () -> new BucketItem(ECFluids.MANGANESE.source.get(), BUCKET));
    /** 铁桶 */
    public static final DeferredItem<BucketItem> IRON_BUCKET = ITEMS_REGISTER.register("iron_bucket", () -> new BucketItem(ECFluids.IRON.source.get(), BUCKET));
    /** 钴桶 */
    public static final DeferredItem<BucketItem> COBALT_BUCKET = ITEMS_REGISTER.register("cobalt_bucket", () -> new BucketItem(ECFluids.COBALT.source.get(), BUCKET));
    /** 镍桶 */
    public static final DeferredItem<BucketItem> NICKEL_BUCKET = ITEMS_REGISTER.register("nickel_bucket", () -> new BucketItem(ECFluids.NICKEL.source.get(), BUCKET));
    /** 铜桶 */
    public static final DeferredItem<BucketItem> COPPER_BUCKET = ITEMS_REGISTER.register("copper_bucket", () -> new BucketItem(ECFluids.COPPER.source.get(), BUCKET));
    /** 锌桶 */
    public static final DeferredItem<BucketItem> ZINC_BUCKET = ITEMS_REGISTER.register("zinc_bucket", () -> new BucketItem(ECFluids.ZINC.source.get(), BUCKET));
    /** 镓桶 */
    public static final DeferredItem<BucketItem> GALLIUM_BUCKET = ITEMS_REGISTER.register("gallium_bucket", () -> new BucketItem(ECFluids.GALLIUM.source.get(), BUCKET));
    /** 锗桶 */
    public static final DeferredItem<BucketItem> GERMANIUM_BUCKET = ITEMS_REGISTER.register("germanium_bucket", () -> new BucketItem(ECFluids.GERMANIUM.source.get(), BUCKET));
    /** 砷桶 */
    public static final DeferredItem<BucketItem> ARSENIC_BUCKET = ITEMS_REGISTER.register("arsenic_bucket", () -> new BucketItem(ECFluids.ARSENIC.source.get(), BUCKET));
    /** 硒桶 */
    public static final DeferredItem<BucketItem> SELENIUM_BUCKET = ITEMS_REGISTER.register("selenium_bucket", () -> new BucketItem(ECFluids.SELENIUM.source.get(), BUCKET));
    /** 溴桶 */
    public static final DeferredItem<BucketItem> BROMINE_BUCKET = ITEMS_REGISTER.register("bromine_bucket", () -> new BucketItem(ECFluids.BROMINE.source.get(), BUCKET));
    /** 氪桶 */
    public static final DeferredItem<BucketItem> KRYPTON_BUCKET = ITEMS_REGISTER.register("krypton_bucket", () -> new BucketItem(ECFluids.KRYPTON.source.get(), BUCKET));
    /** 铷桶 */
    public static final DeferredItem<BucketItem> RUBIDIUM_BUCKET = ITEMS_REGISTER.register("rubidium_bucket", () -> new BucketItem(ECFluids.RUBIDIUM.source.get(), BUCKET));
    /** 锶桶 */
    public static final DeferredItem<BucketItem> STRONTIUM_BUCKET = ITEMS_REGISTER.register("strontium_bucket", () -> new BucketItem(ECFluids.STRONTIUM.source.get(), BUCKET));
    /** 钇桶 */
    public static final DeferredItem<BucketItem> YTTRIUM_BUCKET = ITEMS_REGISTER.register("yttrium_bucket", () -> new BucketItem(ECFluids.YTTRIUM.source.get(), BUCKET));
    /** 锆桶 */
    public static final DeferredItem<BucketItem> ZIRCONIUM_BUCKET = ITEMS_REGISTER.register("zirconium_bucket", () -> new BucketItem(ECFluids.ZIRCONIUM.source.get(), BUCKET));
    /** 铌桶 */
    public static final DeferredItem<BucketItem> NIOBIUM_BUCKET = ITEMS_REGISTER.register("niobium_bucket", () -> new BucketItem(ECFluids.NIOBIUM.source.get(), BUCKET));
    /** 钼桶 */
    public static final DeferredItem<BucketItem> MOLYBDENUM_BUCKET = ITEMS_REGISTER.register("molybdenum_bucket", () -> new BucketItem(ECFluids.MOLYBDENUM.source.get(), BUCKET));
    /** 锝桶 */
    public static final DeferredItem<BucketItem> TECHNETIUM_BUCKET = ITEMS_REGISTER.register("technetium_bucket", () -> new BucketItem(ECFluids.TECHNETIUM.source.get(), BUCKET));
    /** 钌桶 */
    public static final DeferredItem<BucketItem> RUTHENIUM_BUCKET = ITEMS_REGISTER.register("ruthenium_bucket", () -> new BucketItem(ECFluids.RUTHENIUM.source.get(), BUCKET));
    /** 铑桶 */
    public static final DeferredItem<BucketItem> RHODIUM_BUCKET = ITEMS_REGISTER.register("rhodium_bucket", () -> new BucketItem(ECFluids.RHODIUM.source.get(), BUCKET));
    /** 钯桶 */
    public static final DeferredItem<BucketItem> PALLADIUM_BUCKET = ITEMS_REGISTER.register("palladium_bucket", () -> new BucketItem(ECFluids.PALLADIUM.source.get(), BUCKET));
    /** 银桶 */
    public static final DeferredItem<BucketItem> SILVER_BUCKET = ITEMS_REGISTER.register("silver_bucket", () -> new BucketItem(ECFluids.SILVER.source.get(), BUCKET));
    /** 镉桶 */
    public static final DeferredItem<BucketItem> CADMIUM_BUCKET = ITEMS_REGISTER.register("cadmium_bucket", () -> new BucketItem(ECFluids.CADMIUM.source.get(), BUCKET));
    /** 铟桶 */
    public static final DeferredItem<BucketItem> INDIUM_BUCKET = ITEMS_REGISTER.register("indium_bucket", () -> new BucketItem(ECFluids.INDIUM.source.get(), BUCKET));
    /** 锡桶 */
    public static final DeferredItem<BucketItem> TIN_BUCKET = ITEMS_REGISTER.register("tin_bucket", () -> new BucketItem(ECFluids.TIN.source.get(), BUCKET));
    /** 锑桶 */
    public static final DeferredItem<BucketItem> ANTIMONY_BUCKET = ITEMS_REGISTER.register("antimony_bucket", () -> new BucketItem(ECFluids.ANTIMONY.source.get(), BUCKET));
    /** 碲桶 */
    public static final DeferredItem<BucketItem> TELLURIUM_BUCKET = ITEMS_REGISTER.register("tellurium_bucket", () -> new BucketItem(ECFluids.TELLURIUM.source.get(), BUCKET));
    /** 碘桶 */
    public static final DeferredItem<BucketItem> IODINE_BUCKET = ITEMS_REGISTER.register("iodine_bucket", () -> new BucketItem(ECFluids.IODINE.source.get(), BUCKET));
    /** 氙桶 */
    public static final DeferredItem<BucketItem> XENON_BUCKET = ITEMS_REGISTER.register("xenon_bucket", () -> new BucketItem(ECFluids.XENON.source.get(), BUCKET));
    /** 铯桶 */
    public static final DeferredItem<BucketItem> CESIUM_BUCKET = ITEMS_REGISTER.register("cesium_bucket", () -> new BucketItem(ECFluids.CESIUM.source.get(), BUCKET));
    /** 钡桶 */
    public static final DeferredItem<BucketItem> BARIUM_BUCKET = ITEMS_REGISTER.register("barium_bucket", () -> new BucketItem(ECFluids.BARIUM.source.get(), BUCKET));
    /** 镧桶 */
    public static final DeferredItem<BucketItem> LANTHANUM_BUCKET = ITEMS_REGISTER.register("lanthanum_bucket", () -> new BucketItem(ECFluids.LANTHANUM.source.get(), BUCKET));
    /** 铈桶 */
    public static final DeferredItem<BucketItem> CERIUM_BUCKET = ITEMS_REGISTER.register("cerium_bucket", () -> new BucketItem(ECFluids.CERIUM.source.get(), BUCKET));
    /** 镨桶 */
    public static final DeferredItem<BucketItem> PRASEODYMIUM_BUCKET = ITEMS_REGISTER.register("praseodymium_bucket", () -> new BucketItem(ECFluids.PRASEODYMIUM.source.get(), BUCKET));
    /** 钕桶 */
    public static final DeferredItem<BucketItem> NEODYMIUM_BUCKET = ITEMS_REGISTER.register("neodymium_bucket", () -> new BucketItem(ECFluids.NEODYMIUM.source.get(), BUCKET));
    /** 钷桶 */
    public static final DeferredItem<BucketItem> PROMETHIUM_BUCKET = ITEMS_REGISTER.register("promethium_bucket", () -> new BucketItem(ECFluids.PROMETHIUM.source.get(), BUCKET));
    /** 钐桶 */
    public static final DeferredItem<BucketItem> SAMARIUM_BUCKET = ITEMS_REGISTER.register("samarium_bucket", () -> new BucketItem(ECFluids.SAMARIUM.source.get(), BUCKET));
    /** 铕桶 */
    public static final DeferredItem<BucketItem> EUROPIUM_BUCKET = ITEMS_REGISTER.register("europium_bucket", () -> new BucketItem(ECFluids.EUROPIUM.source.get(), BUCKET));
    /** 钆桶 */
    public static final DeferredItem<BucketItem> GADOLINIUM_BUCKET = ITEMS_REGISTER.register("gadolinium_bucket", () -> new BucketItem(ECFluids.GADOLINIUM.source.get(), BUCKET));
    /** 铽桶 */
    public static final DeferredItem<BucketItem> TERBIUM_BUCKET = ITEMS_REGISTER.register("terbium_bucket", () -> new BucketItem(ECFluids.TERBIUM.source.get(), BUCKET));
    /** 镝桶 */
    public static final DeferredItem<BucketItem> DYSPROSIUM_BUCKET = ITEMS_REGISTER.register("dysprosium_bucket", () -> new BucketItem(ECFluids.DYSPROSIUM.source.get(), BUCKET));
    /** 钬桶 */
    public static final DeferredItem<BucketItem> HOLMIUM_BUCKET = ITEMS_REGISTER.register("holmium_bucket", () -> new BucketItem(ECFluids.HOLMIUM.source.get(), BUCKET));
    /** 铒桶 */
    public static final DeferredItem<BucketItem> ERBIUM_BUCKET = ITEMS_REGISTER.register("erbium_bucket", () -> new BucketItem(ECFluids.ERBIUM.source.get(), BUCKET));
    /** 铥桶 */
    public static final DeferredItem<BucketItem> THULIUM_BUCKET = ITEMS_REGISTER.register("thulium_bucket", () -> new BucketItem(ECFluids.THULIUM.source.get(), BUCKET));
    /** 镱桶 */
    public static final DeferredItem<BucketItem> YTTERBIUM_BUCKET = ITEMS_REGISTER.register("ytterbium_bucket", () -> new BucketItem(ECFluids.YTTERBIUM.source.get(), BUCKET));
    /** 镥桶 */
    public static final DeferredItem<BucketItem> LUTETIUM_BUCKET = ITEMS_REGISTER.register("lutetium_bucket", () -> new BucketItem(ECFluids.LUTETIUM.source.get(), BUCKET));
    /** 铪桶 */
    public static final DeferredItem<BucketItem> HAFNIUM_BUCKET = ITEMS_REGISTER.register("hafnium_bucket", () -> new BucketItem(ECFluids.HAFNIUM.source.get(), BUCKET));
    /** 钽桶 */
    public static final DeferredItem<BucketItem> TANTALUM_BUCKET = ITEMS_REGISTER.register("tantalum_bucket", () -> new BucketItem(ECFluids.TANTALUM.source.get(), BUCKET));
    /** 钨桶 */
    public static final DeferredItem<BucketItem> TUNGSTEN_BUCKET = ITEMS_REGISTER.register("tungsten_bucket", () -> new BucketItem(ECFluids.TUNGSTEN.source.get(), BUCKET));
    /** 铼桶 */
    public static final DeferredItem<BucketItem> RHENIUM_BUCKET = ITEMS_REGISTER.register("rhenium_bucket", () -> new BucketItem(ECFluids.RHENIUM.source.get(), BUCKET));
    /** 锇桶 */
    public static final DeferredItem<BucketItem> OSMIUM_BUCKET = ITEMS_REGISTER.register("osmium_bucket", () -> new BucketItem(ECFluids.OSMIUM.source.get(), BUCKET));
    /** 铱桶 */
    public static final DeferredItem<BucketItem> IRIDIUM_BUCKET = ITEMS_REGISTER.register("iridium_bucket", () -> new BucketItem(ECFluids.IRIDIUM.source.get(), BUCKET));
    /** 铂桶 */
    public static final DeferredItem<BucketItem> PLATINUM_BUCKET = ITEMS_REGISTER.register("platinum_bucket", () -> new BucketItem(ECFluids.PLATINUM.source.get(), BUCKET));
    /** 金桶 */
    public static final DeferredItem<BucketItem> GOLD_BUCKET = ITEMS_REGISTER.register("gold_bucket", () -> new BucketItem(ECFluids.GOLD.source.get(), BUCKET));
    /** 汞桶 */
    public static final DeferredItem<BucketItem> HYDRARGYRUM_BUCKET = ITEMS_REGISTER.register("hydrargyrum_bucket", () -> new BucketItem(ECFluids.HYDRARGYRUM.source.get(), BUCKET));
    /** 铊桶 */
    public static final DeferredItem<BucketItem> THALLIUM_BUCKET = ITEMS_REGISTER.register("thallium_bucket", () -> new BucketItem(ECFluids.THALLIUM.source.get(), BUCKET));
    /** 铅桶 */
    public static final DeferredItem<BucketItem> LEAD_BUCKET = ITEMS_REGISTER.register("lead_bucket", () -> new BucketItem(ECFluids.LEAD.source.get(), BUCKET));
    /** 铋桶 */
    public static final DeferredItem<BucketItem> BISMUTH_BUCKET = ITEMS_REGISTER.register("bismuth_bucket", () -> new BucketItem(ECFluids.BISMUTH.source.get(), BUCKET));
    /** 钋桶 */
    public static final DeferredItem<BucketItem> POLONIUM_BUCKET = ITEMS_REGISTER.register("polonium_bucket", () -> new BucketItem(ECFluids.POLONIUM.source.get(), BUCKET));
    /** 砹桶 */
    public static final DeferredItem<BucketItem> ASTATINE_BUCKET = ITEMS_REGISTER.register("astatine_bucket", () -> new BucketItem(ECFluids.ASTATINE.source.get(), BUCKET));
    /** 氡桶 */
    public static final DeferredItem<BucketItem> RADON_BUCKET = ITEMS_REGISTER.register("radon_bucket", () -> new BucketItem(ECFluids.RADON.source.get(), BUCKET));
    /** 钫桶 */
    public static final DeferredItem<BucketItem> FRANCIUM_BUCKET = ITEMS_REGISTER.register("francium_bucket", () -> new BucketItem(ECFluids.FRANCIUM.source.get(), BUCKET));
    /** 镭桶 */
    public static final DeferredItem<BucketItem> RADIUM_BUCKET = ITEMS_REGISTER.register("radium_bucket", () -> new BucketItem(ECFluids.RADIUM.source.get(), BUCKET));
    /** 锕桶 */
    public static final DeferredItem<BucketItem> ACTINIUM_BUCKET = ITEMS_REGISTER.register("actinium_bucket", () -> new BucketItem(ECFluids.ACTINIUM.source.get(), BUCKET));
    /** 钍桶 */
    public static final DeferredItem<BucketItem> THORIUM_BUCKET = ITEMS_REGISTER.register("thorium_bucket", () -> new BucketItem(ECFluids.THORIUM.source.get(), BUCKET));
    /** 镤桶 */
    public static final DeferredItem<BucketItem> PROTACTINIUM_BUCKET = ITEMS_REGISTER.register("protactinium_bucket", () -> new BucketItem(ECFluids.PROTACTINIUM.source.get(), BUCKET));
    /** 铀桶 */
    public static final DeferredItem<BucketItem> URANIUM_BUCKET = ITEMS_REGISTER.register("uranium_bucket", () -> new BucketItem(ECFluids.URANIUM.source.get(), BUCKET));
    /** 镎桶 */
    public static final DeferredItem<BucketItem> NEPTUNIUM_BUCKET = ITEMS_REGISTER.register("neptunium_bucket", () -> new BucketItem(ECFluids.NEPTUNIUM.source.get(), BUCKET));
    /** 钚桶 */
    public static final DeferredItem<BucketItem> PLUTONIUM_BUCKET = ITEMS_REGISTER.register("plutonium_bucket", () -> new BucketItem(ECFluids.PLUTONIUM.source.get(), BUCKET));
    /** 镅桶 */
    public static final DeferredItem<BucketItem> AMERICIUM_BUCKET = ITEMS_REGISTER.register("americium_bucket", () -> new BucketItem(ECFluids.AMERICIUM.source.get(), BUCKET));
    /** 锔桶 */
    public static final DeferredItem<BucketItem> CURIUM_BUCKET = ITEMS_REGISTER.register("curium_bucket", () -> new BucketItem(ECFluids.CURIUM.source.get(), BUCKET));
    /** 锫桶 */
    public static final DeferredItem<BucketItem> BERKELIUM_BUCKET = ITEMS_REGISTER.register("berkelium_bucket", () -> new BucketItem(ECFluids.BERKELIUM.source.get(), BUCKET));
    /** 锎桶 */
    public static final DeferredItem<BucketItem> CALIFORNIUM_BUCKET = ITEMS_REGISTER.register("californium_bucket", () -> new BucketItem(ECFluids.CALIFORNIUM.source.get(), BUCKET));
    /** 锿桶 */
    public static final DeferredItem<BucketItem> EINSTEINIUM_BUCKET = ITEMS_REGISTER.register("einsteinium_bucket", () -> new BucketItem(ECFluids.EINSTEINIUM.source.get(), BUCKET));
    /** 镄桶 */
    public static final DeferredItem<BucketItem> FERMIUM_BUCKET = ITEMS_REGISTER.register("fermium_bucket", () -> new BucketItem(ECFluids.FERMIUM.source.get(), BUCKET));
    /** 钔桶 */
    public static final DeferredItem<BucketItem> MENDELEVIUM_BUCKET = ITEMS_REGISTER.register("mendelevium_bucket", () -> new BucketItem(ECFluids.MENDELEVIUM.source.get(), BUCKET));
    /** 锘桶 */
    public static final DeferredItem<BucketItem> NOBELIUM_BUCKET = ITEMS_REGISTER.register("nobelium_bucket", () -> new BucketItem(ECFluids.NOBELIUM.source.get(), BUCKET));
    /** 铹桶 */
    public static final DeferredItem<BucketItem> LAWRENCIUM_BUCKET = ITEMS_REGISTER.register("lawrencium_bucket", () -> new BucketItem(ECFluids.LAWRENCIUM.source.get(), BUCKET));
    /** 𬬻桶 */
    public static final DeferredItem<BucketItem> RUTHERFORDIUM_BUCKET = ITEMS_REGISTER.register("rutherfordium_bucket", () -> new BucketItem(ECFluids.RUTHERFORDIUM.source.get(), BUCKET));
    /** 𬭊桶 */
    public static final DeferredItem<BucketItem> DUBNIUM_BUCKET = ITEMS_REGISTER.register("dubnium_bucket", () -> new BucketItem(ECFluids.DUBNIUM.source.get(), BUCKET));
    /** 𬭳桶 */
    public static final DeferredItem<BucketItem> SEABORGIUM_BUCKET = ITEMS_REGISTER.register("seaborgium_bucket", () -> new BucketItem(ECFluids.SEABORGIUM.source.get(), BUCKET));
    /** 𬭛桶 */
    public static final DeferredItem<BucketItem> BOHRIUM_BUCKET = ITEMS_REGISTER.register("bohrium_bucket", () -> new BucketItem(ECFluids.BOHRIUM.source.get(), BUCKET));
    /** 𬭶桶 */
    public static final DeferredItem<BucketItem> HASSIUM_BUCKET = ITEMS_REGISTER.register("hassium_bucket", () -> new BucketItem(ECFluids.HASSIUM.source.get(), BUCKET));
    /** 鿏桶 */
    public static final DeferredItem<BucketItem> MEITNERIUM_BUCKET = ITEMS_REGISTER.register("meitnerium_bucket", () -> new BucketItem(ECFluids.MEITNERIUM.source.get(), BUCKET));
    /** 𫟼桶 */
    public static final DeferredItem<BucketItem> DARMSTADTIUM_BUCKET = ITEMS_REGISTER.register("darmstadtium_bucket", () -> new BucketItem(ECFluids.DARMSTADTIUM.source.get(), BUCKET));
    /** 𬬭桶 */
    public static final DeferredItem<BucketItem> ROENTGENIUM_BUCKET = ITEMS_REGISTER.register("roentgenium_bucket", () -> new BucketItem(ECFluids.ROENTGENIUM.source.get(), BUCKET));
    /** 鿔桶 */
    public static final DeferredItem<BucketItem> COPERNICIUM_BUCKET = ITEMS_REGISTER.register("copernicium_bucket", () -> new BucketItem(ECFluids.COPERNICIUM.source.get(), BUCKET));
    /** 鉨桶 */
    public static final DeferredItem<BucketItem> NIHONIUM_BUCKET = ITEMS_REGISTER.register("nihonium_bucket", () -> new BucketItem(ECFluids.NIHONIUM.source.get(), BUCKET));
    /** 鈇桶 */
    public static final DeferredItem<BucketItem> FLEROVIUM_BUCKET = ITEMS_REGISTER.register("flerovium_bucket", () -> new BucketItem(ECFluids.FLEROVIUM.source.get(), BUCKET));
    /** 镆桶 */
    public static final DeferredItem<BucketItem> MOSCOVIUM_BUCKET = ITEMS_REGISTER.register("moscovium_bucket", () -> new BucketItem(ECFluids.MOSCOVIUM.source.get(), BUCKET));
    /** 鉝桶 */
    public static final DeferredItem<BucketItem> LIVERMORIUM_BUCKET = ITEMS_REGISTER.register("livermorium_bucket", () -> new BucketItem(ECFluids.LIVERMORIUM.source.get(), BUCKET));
    /** 鿬桶 */
    public static final DeferredItem<BucketItem> TENNESSINE_BUCKET = ITEMS_REGISTER.register("tennessine_bucket", () -> new BucketItem(ECFluids.TENNESSINE.source.get(), BUCKET));
    /** 鿫桶 */
    public static final DeferredItem<BucketItem> OGANESSON_BUCKET = ITEMS_REGISTER.register("oganesson_bucket", () -> new BucketItem(ECFluids.OGANESSON.source.get(), BUCKET));
    /** 鑨桶 */
    public static final DeferredItem<BucketItem> LONGIUM_BUCKET = ITEMS_REGISTER.register("longium_bucket", () -> new BucketItem(ECFluids.LONGIUM.source.get(), BUCKET));
    /** 镾桶 */
    public static final DeferredItem<BucketItem> MYSTERIUM_BUCKET = ITEMS_REGISTER.register("mysterium_bucket", () -> new BucketItem(ECFluids.MYSTERIUM.source.get(), BUCKET));

    // ==================== 120个元素的气体桶 ====================
    /** 氢气桶 */
    public static final DeferredItem<GasBucketItem> HYDROGEN_GAS_BUCKET = ITEMS_REGISTER.register("hydrogen_gas_bucket", () -> new GasBucketItem(ECGases.HYDROGEN_GAS.get(), BUCKET));
    /** 氦气桶 */
    public static final DeferredItem<GasBucketItem> HELIUM_GAS_BUCKET = ITEMS_REGISTER.register("helium_gas_bucket", () -> new GasBucketItem(ECGases.HELIUM_GAS.get(), BUCKET));
    /** 锂气桶 */
    public static final DeferredItem<GasBucketItem> LITHIUM_GAS_BUCKET = ITEMS_REGISTER.register("lithium_gas_bucket", () -> new GasBucketItem(ECGases.LITHIUM_GAS.get(), BUCKET));
    /** 铍气桶 */
    public static final DeferredItem<GasBucketItem> BERYLLIUM_GAS_BUCKET = ITEMS_REGISTER.register("beryllium_gas_bucket", () -> new GasBucketItem(ECGases.BERYLLIUM_GAS.get(), BUCKET));
    /** 硼气桶 */
    public static final DeferredItem<GasBucketItem> BORON_GAS_BUCKET = ITEMS_REGISTER.register("boron_gas_bucket", () -> new GasBucketItem(ECGases.BORON_GAS.get(), BUCKET));
    /** 碳气桶 */
    public static final DeferredItem<GasBucketItem> CARBON_GAS_BUCKET = ITEMS_REGISTER.register("carbon_gas_bucket", () -> new GasBucketItem(ECGases.CARBON_GAS.get(), BUCKET));
    /** 氮气桶 */
    public static final DeferredItem<GasBucketItem> NITROGEN_GAS_BUCKET = ITEMS_REGISTER.register("nitrogen_gas_bucket", () -> new GasBucketItem(ECGases.NITROGEN_GAS.get(), BUCKET));
    /** 氧气桶 */
    public static final DeferredItem<GasBucketItem> OXYGEN_GAS_BUCKET = ITEMS_REGISTER.register("oxygen_gas_bucket", () -> new GasBucketItem(ECGases.OXYGEN_GAS.get(), BUCKET));
    /** 氟气桶 */
    public static final DeferredItem<GasBucketItem> FLUORINE_GAS_BUCKET = ITEMS_REGISTER.register("fluorine_gas_bucket", () -> new GasBucketItem(ECGases.FLUORINE_GAS.get(), BUCKET));
    /** 氖气桶 */
    public static final DeferredItem<GasBucketItem> NEON_GAS_BUCKET = ITEMS_REGISTER.register("neon_gas_bucket", () -> new GasBucketItem(ECGases.NEON_GAS.get(), BUCKET));
    /** 钠气桶 */
    public static final DeferredItem<GasBucketItem> SODIUM_GAS_BUCKET = ITEMS_REGISTER.register("sodium_gas_bucket", () -> new GasBucketItem(ECGases.SODIUM_GAS.get(), BUCKET));
    /** 镁气桶 */
    public static final DeferredItem<GasBucketItem> MAGNESIUM_GAS_BUCKET = ITEMS_REGISTER.register("magnesium_gas_bucket", () -> new GasBucketItem(ECGases.MAGNESIUM_GAS.get(), BUCKET));
    /** 铝气桶 */
    public static final DeferredItem<GasBucketItem> ALUMINUM_GAS_BUCKET = ITEMS_REGISTER.register("aluminum_gas_bucket", () -> new GasBucketItem(ECGases.ALUMINUM_GAS.get(), BUCKET));
    /** 硅气桶 */
    public static final DeferredItem<GasBucketItem> SILICON_GAS_BUCKET = ITEMS_REGISTER.register("silicon_gas_bucket", () -> new GasBucketItem(ECGases.SILICON_GAS.get(), BUCKET));
    /** 磷气桶 */
    public static final DeferredItem<GasBucketItem> PHOSPHORUS_GAS_BUCKET = ITEMS_REGISTER.register("phosphorus_gas_bucket", () -> new GasBucketItem(ECGases.PHOSPHORUS_GAS.get(), BUCKET));
    /** 硫气桶 */
    public static final DeferredItem<GasBucketItem> SULFUR_GAS_BUCKET = ITEMS_REGISTER.register("sulfur_gas_bucket", () -> new GasBucketItem(ECGases.SULFUR_GAS.get(), BUCKET));
    /** 氯气桶 */
    public static final DeferredItem<GasBucketItem> CHLORINE_GAS_BUCKET = ITEMS_REGISTER.register("chlorine_gas_bucket", () -> new GasBucketItem(ECGases.CHLORINE_GAS.get(), BUCKET));
    /** 氩气桶 */
    public static final DeferredItem<GasBucketItem> ARGON_GAS_BUCKET = ITEMS_REGISTER.register("argon_gas_bucket", () -> new GasBucketItem(ECGases.ARGON_GAS.get(), BUCKET));
    /** 钾气桶 */
    public static final DeferredItem<GasBucketItem> POTASSIUM_GAS_BUCKET = ITEMS_REGISTER.register("potassium_gas_bucket", () -> new GasBucketItem(ECGases.POTASSIUM_GAS.get(), BUCKET));
    /** 钙气桶 */
    public static final DeferredItem<GasBucketItem> CALCIUM_GAS_BUCKET = ITEMS_REGISTER.register("calcium_gas_bucket", () -> new GasBucketItem(ECGases.CALCIUM_GAS.get(), BUCKET));
    /** 钪气桶 */
    public static final DeferredItem<GasBucketItem> SCANDIUM_GAS_BUCKET = ITEMS_REGISTER.register("scandium_gas_bucket", () -> new GasBucketItem(ECGases.SCANDIUM_GAS.get(), BUCKET));
    /** 钛气桶 */
    public static final DeferredItem<GasBucketItem> TITANIUM_GAS_BUCKET = ITEMS_REGISTER.register("titanium_gas_bucket", () -> new GasBucketItem(ECGases.TITANIUM_GAS.get(), BUCKET));
    /** 钒气桶 */
    public static final DeferredItem<GasBucketItem> VANADIUM_GAS_BUCKET = ITEMS_REGISTER.register("vanadium_gas_bucket", () -> new GasBucketItem(ECGases.VANADIUM_GAS.get(), BUCKET));
    /** 铬气桶 */
    public static final DeferredItem<GasBucketItem> CHROMIUM_GAS_BUCKET = ITEMS_REGISTER.register("chromium_gas_bucket", () -> new GasBucketItem(ECGases.CHROMIUM_GAS.get(), BUCKET));
    /** 锰气桶 */
    public static final DeferredItem<GasBucketItem> MANGANESE_GAS_BUCKET = ITEMS_REGISTER.register("manganese_gas_bucket", () -> new GasBucketItem(ECGases.MANGANESE_GAS.get(), BUCKET));
    /** 铁气桶 */
    public static final DeferredItem<GasBucketItem> IRON_GAS_BUCKET = ITEMS_REGISTER.register("iron_gas_bucket", () -> new GasBucketItem(ECGases.IRON_GAS.get(), BUCKET));
    /** 钴气桶 */
    public static final DeferredItem<GasBucketItem> COBALT_GAS_BUCKET = ITEMS_REGISTER.register("cobalt_gas_bucket", () -> new GasBucketItem(ECGases.COBALT_GAS.get(), BUCKET));
    /** 镍气桶 */
    public static final DeferredItem<GasBucketItem> NICKEL_GAS_BUCKET = ITEMS_REGISTER.register("nickel_gas_bucket", () -> new GasBucketItem(ECGases.NICKEL_GAS.get(), BUCKET));
    /** 铜气桶 */
    public static final DeferredItem<GasBucketItem> COPPER_GAS_BUCKET = ITEMS_REGISTER.register("copper_gas_bucket", () -> new GasBucketItem(ECGases.COPPER_GAS.get(), BUCKET));
    /** 锌气桶 */
    public static final DeferredItem<GasBucketItem> ZINC_GAS_BUCKET = ITEMS_REGISTER.register("zinc_gas_bucket", () -> new GasBucketItem(ECGases.ZINC_GAS.get(), BUCKET));
    /** 镓气桶 */
    public static final DeferredItem<GasBucketItem> GALLIUM_GAS_BUCKET = ITEMS_REGISTER.register("gallium_gas_bucket", () -> new GasBucketItem(ECGases.GALLIUM_GAS.get(), BUCKET));
    /** 锗气桶 */
    public static final DeferredItem<GasBucketItem> GERMANIUM_GAS_BUCKET = ITEMS_REGISTER.register("germanium_gas_bucket", () -> new GasBucketItem(ECGases.GERMANIUM_GAS.get(), BUCKET));
    /** 砷气桶 */
    public static final DeferredItem<GasBucketItem> ARSENIC_GAS_BUCKET = ITEMS_REGISTER.register("arsenic_gas_bucket", () -> new GasBucketItem(ECGases.ARSENIC_GAS.get(), BUCKET));
    /** 硒气桶 */
    public static final DeferredItem<GasBucketItem> SELENIUM_GAS_BUCKET = ITEMS_REGISTER.register("selenium_gas_bucket", () -> new GasBucketItem(ECGases.SELENIUM_GAS.get(), BUCKET));
    /** 溴气桶 */
    public static final DeferredItem<GasBucketItem> BROMINE_GAS_BUCKET = ITEMS_REGISTER.register("bromine_gas_bucket", () -> new GasBucketItem(ECGases.BROMINE_GAS.get(), BUCKET));
    /** 氪气桶 */
    public static final DeferredItem<GasBucketItem> KRYPTON_GAS_BUCKET = ITEMS_REGISTER.register("krypton_gas_bucket", () -> new GasBucketItem(ECGases.KRYPTON_GAS.get(), BUCKET));
    /** 铷气桶 */
    public static final DeferredItem<GasBucketItem> RUBIDIUM_GAS_BUCKET = ITEMS_REGISTER.register("rubidium_gas_bucket", () -> new GasBucketItem(ECGases.RUBIDIUM_GAS.get(), BUCKET));
    /** 锶气桶 */
    public static final DeferredItem<GasBucketItem> STRONTIUM_GAS_BUCKET = ITEMS_REGISTER.register("strontium_gas_bucket", () -> new GasBucketItem(ECGases.STRONTIUM_GAS.get(), BUCKET));
    /** 钇气桶 */
    public static final DeferredItem<GasBucketItem> YTTRIUM_GAS_BUCKET = ITEMS_REGISTER.register("yttrium_gas_bucket", () -> new GasBucketItem(ECGases.YTTRIUM_GAS.get(), BUCKET));
    /** 锆气桶 */
    public static final DeferredItem<GasBucketItem> ZIRCONIUM_GAS_BUCKET = ITEMS_REGISTER.register("zirconium_gas_bucket", () -> new GasBucketItem(ECGases.ZIRCONIUM_GAS.get(), BUCKET));
    /** 铌气桶 */
    public static final DeferredItem<GasBucketItem> NIOBIUM_GAS_BUCKET = ITEMS_REGISTER.register("niobium_gas_bucket", () -> new GasBucketItem(ECGases.NIOBIUM_GAS.get(), BUCKET));
    /** 钼气桶 */
    public static final DeferredItem<GasBucketItem> MOLYBDENUM_GAS_BUCKET = ITEMS_REGISTER.register("molybdenum_gas_bucket", () -> new GasBucketItem(ECGases.MOLYBDENUM_GAS.get(), BUCKET));
    /** 锝气桶 */
    public static final DeferredItem<GasBucketItem> TECHNETIUM_GAS_BUCKET = ITEMS_REGISTER.register("technetium_gas_bucket", () -> new GasBucketItem(ECGases.TECHNETIUM_GAS.get(), BUCKET));
    /** 钌气桶 */
    public static final DeferredItem<GasBucketItem> RUTHENIUM_GAS_BUCKET = ITEMS_REGISTER.register("ruthenium_gas_bucket", () -> new GasBucketItem(ECGases.RUTHENIUM_GAS.get(), BUCKET));
    /** 铑气桶 */
    public static final DeferredItem<GasBucketItem> RHODIUM_GAS_BUCKET = ITEMS_REGISTER.register("rhodium_gas_bucket", () -> new GasBucketItem(ECGases.RHODIUM_GAS.get(), BUCKET));
    /** 钯气桶 */
    public static final DeferredItem<GasBucketItem> PALLADIUM_GAS_BUCKET = ITEMS_REGISTER.register("palladium_gas_bucket", () -> new GasBucketItem(ECGases.PALLADIUM_GAS.get(), BUCKET));
    /** 银气桶 */
    public static final DeferredItem<GasBucketItem> SILVER_GAS_BUCKET = ITEMS_REGISTER.register("silver_gas_bucket", () -> new GasBucketItem(ECGases.SILVER_GAS.get(), BUCKET));
    /** 镉气桶 */
    public static final DeferredItem<GasBucketItem> CADMIUM_GAS_BUCKET = ITEMS_REGISTER.register("cadmium_gas_bucket", () -> new GasBucketItem(ECGases.CADMIUM_GAS.get(), BUCKET));
    /** 铟气桶 */
    public static final DeferredItem<GasBucketItem> INDIUM_GAS_BUCKET = ITEMS_REGISTER.register("indium_gas_bucket", () -> new GasBucketItem(ECGases.INDIUM_GAS.get(), BUCKET));
    /** 锡气桶 */
    public static final DeferredItem<GasBucketItem> TIN_GAS_BUCKET = ITEMS_REGISTER.register("tin_gas_bucket", () -> new GasBucketItem(ECGases.TIN_GAS.get(), BUCKET));
    /** 锑气桶 */
    public static final DeferredItem<GasBucketItem> ANTIMONY_GAS_BUCKET = ITEMS_REGISTER.register("antimony_gas_bucket", () -> new GasBucketItem(ECGases.ANTIMONY_GAS.get(), BUCKET));
    /** 碲气桶 */
    public static final DeferredItem<GasBucketItem> TELLURIUM_GAS_BUCKET = ITEMS_REGISTER.register("tellurium_gas_bucket", () -> new GasBucketItem(ECGases.TELLURIUM_GAS.get(), BUCKET));
    /** 碘气桶 */
    public static final DeferredItem<GasBucketItem> IODINE_GAS_BUCKET = ITEMS_REGISTER.register("iodine_gas_bucket", () -> new GasBucketItem(ECGases.IODINE_GAS.get(), BUCKET));
    /** 氙气桶 */
    public static final DeferredItem<GasBucketItem> XENON_GAS_BUCKET = ITEMS_REGISTER.register("xenon_gas_bucket", () -> new GasBucketItem(ECGases.XENON_GAS.get(), BUCKET));
    /** 铯气桶 */
    public static final DeferredItem<GasBucketItem> CESIUM_GAS_BUCKET = ITEMS_REGISTER.register("cesium_gas_bucket", () -> new GasBucketItem(ECGases.CESIUM_GAS.get(), BUCKET));
    /** 钡气桶 */
    public static final DeferredItem<GasBucketItem> BARIUM_GAS_BUCKET = ITEMS_REGISTER.register("barium_gas_bucket", () -> new GasBucketItem(ECGases.BARIUM_GAS.get(), BUCKET));
    /** 镧气桶 */
    public static final DeferredItem<GasBucketItem> LANTHANUM_GAS_BUCKET = ITEMS_REGISTER.register("lanthanum_gas_bucket", () -> new GasBucketItem(ECGases.LANTHANUM_GAS.get(), BUCKET));
    /** 铈气桶 */
    public static final DeferredItem<GasBucketItem> CERIUM_GAS_BUCKET = ITEMS_REGISTER.register("cerium_gas_bucket", () -> new GasBucketItem(ECGases.CERIUM_GAS.get(), BUCKET));
    /** 镨气桶 */
    public static final DeferredItem<GasBucketItem> PRASEODYMIUM_GAS_BUCKET = ITEMS_REGISTER.register("praseodymium_gas_bucket", () -> new GasBucketItem(ECGases.PRASEODYMIUM_GAS.get(), BUCKET));
    /** 钕气桶 */
    public static final DeferredItem<GasBucketItem> NEODYMIUM_GAS_BUCKET = ITEMS_REGISTER.register("neodymium_gas_bucket", () -> new GasBucketItem(ECGases.NEODYMIUM_GAS.get(), BUCKET));
    /** 钷气桶 */
    public static final DeferredItem<GasBucketItem> PROMETHIUM_GAS_BUCKET = ITEMS_REGISTER.register("promethium_gas_bucket", () -> new GasBucketItem(ECGases.PROMETHIUM_GAS.get(), BUCKET));
    /** 钐气桶 */
    public static final DeferredItem<GasBucketItem> SAMARIUM_GAS_BUCKET = ITEMS_REGISTER.register("samarium_gas_bucket", () -> new GasBucketItem(ECGases.SAMARIUM_GAS.get(), BUCKET));
    /** 铕气桶 */
    public static final DeferredItem<GasBucketItem> EUROPIUM_GAS_BUCKET = ITEMS_REGISTER.register("europium_gas_bucket", () -> new GasBucketItem(ECGases.EUROPIUM_GAS.get(), BUCKET));
    /** 钆气桶 */
    public static final DeferredItem<GasBucketItem> GADOLINIUM_GAS_BUCKET = ITEMS_REGISTER.register("gadolinium_gas_bucket", () -> new GasBucketItem(ECGases.GADOLINIUM_GAS.get(), BUCKET));
    /** 铽气桶 */
    public static final DeferredItem<GasBucketItem> TERBIUM_GAS_BUCKET = ITEMS_REGISTER.register("terbium_gas_bucket", () -> new GasBucketItem(ECGases.TERBIUM_GAS.get(), BUCKET));
    /** 镝气桶 */
    public static final DeferredItem<GasBucketItem> DYSPROSIUM_GAS_BUCKET = ITEMS_REGISTER.register("dysprosium_gas_bucket", () -> new GasBucketItem(ECGases.DYSPROSIUM_GAS.get(), BUCKET));
    /** 钬气桶 */
    public static final DeferredItem<GasBucketItem> HOLMIUM_GAS_BUCKET = ITEMS_REGISTER.register("holmium_gas_bucket", () -> new GasBucketItem(ECGases.HOLMIUM_GAS.get(), BUCKET));
    /** 铒气桶 */
    public static final DeferredItem<GasBucketItem> ERBIUM_GAS_BUCKET = ITEMS_REGISTER.register("erbium_gas_bucket", () -> new GasBucketItem(ECGases.ERBIUM_GAS.get(), BUCKET));
    /** 铥气桶 */
    public static final DeferredItem<GasBucketItem> THULIUM_GAS_BUCKET = ITEMS_REGISTER.register("thulium_gas_bucket", () -> new GasBucketItem(ECGases.THULIUM_GAS.get(), BUCKET));
    /** 镱气桶 */
    public static final DeferredItem<GasBucketItem> YTTERBIUM_GAS_BUCKET = ITEMS_REGISTER.register("ytterbium_gas_bucket", () -> new GasBucketItem(ECGases.YTTERBIUM_GAS.get(), BUCKET));
    /** 镥气桶 */
    public static final DeferredItem<GasBucketItem> LUTETIUM_GAS_BUCKET = ITEMS_REGISTER.register("lutetium_gas_bucket", () -> new GasBucketItem(ECGases.LUTETIUM_GAS.get(), BUCKET));
    /** 铪气桶 */
    public static final DeferredItem<GasBucketItem> HAFNIUM_GAS_BUCKET = ITEMS_REGISTER.register("hafnium_gas_bucket", () -> new GasBucketItem(ECGases.HAFNIUM_GAS.get(), BUCKET));
    /** 钽气桶 */
    public static final DeferredItem<GasBucketItem> TANTALUM_GAS_BUCKET = ITEMS_REGISTER.register("tantalum_gas_bucket", () -> new GasBucketItem(ECGases.TANTALUM_GAS.get(), BUCKET));
    /** 钨气桶 */
    public static final DeferredItem<GasBucketItem> TUNGSTEN_GAS_BUCKET = ITEMS_REGISTER.register("tungsten_gas_bucket", () -> new GasBucketItem(ECGases.TUNGSTEN_GAS.get(), BUCKET));
    /** 铼气桶 */
    public static final DeferredItem<GasBucketItem> RHENIUM_GAS_BUCKET = ITEMS_REGISTER.register("rhenium_gas_bucket", () -> new GasBucketItem(ECGases.RHENIUM_GAS.get(), BUCKET));
    /** 锇气桶 */
    public static final DeferredItem<GasBucketItem> OSMIUM_GAS_BUCKET = ITEMS_REGISTER.register("osmium_gas_bucket", () -> new GasBucketItem(ECGases.OSMIUM_GAS.get(), BUCKET));
    /** 铱气桶 */
    public static final DeferredItem<GasBucketItem> IRIDIUM_GAS_BUCKET = ITEMS_REGISTER.register("iridium_gas_bucket", () -> new GasBucketItem(ECGases.IRIDIUM_GAS.get(), BUCKET));
    /** 铂气桶 */
    public static final DeferredItem<GasBucketItem> PLATINUM_GAS_BUCKET = ITEMS_REGISTER.register("platinum_gas_bucket", () -> new GasBucketItem(ECGases.PLATINUM_GAS.get(), BUCKET));
    /** 金气桶 */
    public static final DeferredItem<GasBucketItem> GOLD_GAS_BUCKET = ITEMS_REGISTER.register("gold_gas_bucket", () -> new GasBucketItem(ECGases.GOLD_GAS.get(), BUCKET));
    /** 汞气桶 */
    public static final DeferredItem<GasBucketItem> HYDRARGYRUM_GAS_BUCKET = ITEMS_REGISTER.register("hydrargyrum_gas_bucket", () -> new GasBucketItem(ECGases.HYDRARGYRUM_GAS.get(), BUCKET));
    /** 铊气桶 */
    public static final DeferredItem<GasBucketItem> THALLIUM_GAS_BUCKET = ITEMS_REGISTER.register("thallium_gas_bucket", () -> new GasBucketItem(ECGases.THALLIUM_GAS.get(), BUCKET));
    /** 铅气桶 */
    public static final DeferredItem<GasBucketItem> LEAD_GAS_BUCKET = ITEMS_REGISTER.register("lead_gas_bucket", () -> new GasBucketItem(ECGases.LEAD_GAS.get(), BUCKET));
    /** 铋气桶 */
    public static final DeferredItem<GasBucketItem> BISMUTH_GAS_BUCKET = ITEMS_REGISTER.register("bismuth_gas_bucket", () -> new GasBucketItem(ECGases.BISMUTH_GAS.get(), BUCKET));
    /** 钋气桶 */
    public static final DeferredItem<GasBucketItem> POLONIUM_GAS_BUCKET = ITEMS_REGISTER.register("polonium_gas_bucket", () -> new GasBucketItem(ECGases.POLONIUM_GAS.get(), BUCKET));
    /** 砹气桶 */
    public static final DeferredItem<GasBucketItem> ASTATINE_GAS_BUCKET = ITEMS_REGISTER.register("astatine_gas_bucket", () -> new GasBucketItem(ECGases.ASTATINE_GAS.get(), BUCKET));
    /** 氡气桶 */
    public static final DeferredItem<GasBucketItem> RADON_GAS_BUCKET = ITEMS_REGISTER.register("radon_gas_bucket", () -> new GasBucketItem(ECGases.RADON_GAS.get(), BUCKET));
    /** 钫气桶 */
    public static final DeferredItem<GasBucketItem> FRANCIUM_GAS_BUCKET = ITEMS_REGISTER.register("francium_gas_bucket", () -> new GasBucketItem(ECGases.FRANCIUM_GAS.get(), BUCKET));
    /** 镭气桶 */
    public static final DeferredItem<GasBucketItem> RADIUM_GAS_BUCKET = ITEMS_REGISTER.register("radium_gas_bucket", () -> new GasBucketItem(ECGases.RADIUM_GAS.get(), BUCKET));
    /** 锕气桶 */
    public static final DeferredItem<GasBucketItem> ACTINIUM_GAS_BUCKET = ITEMS_REGISTER.register("actinium_gas_bucket", () -> new GasBucketItem(ECGases.ACTINIUM_GAS.get(), BUCKET));
    /** 钍气桶 */
    public static final DeferredItem<GasBucketItem> THORIUM_GAS_BUCKET = ITEMS_REGISTER.register("thorium_gas_bucket", () -> new GasBucketItem(ECGases.THORIUM_GAS.get(), BUCKET));
    /** 镤气桶 */
    public static final DeferredItem<GasBucketItem> PROTACTINIUM_GAS_BUCKET = ITEMS_REGISTER.register("protactinium_gas_bucket", () -> new GasBucketItem(ECGases.PROTACTINIUM_GAS.get(), BUCKET));
    /** 铀气桶 */
    public static final DeferredItem<GasBucketItem> URANIUM_GAS_BUCKET = ITEMS_REGISTER.register("uranium_gas_bucket", () -> new GasBucketItem(ECGases.URANIUM_GAS.get(), BUCKET));
    /** 镎气桶 */
    public static final DeferredItem<GasBucketItem> NEPTUNIUM_GAS_BUCKET = ITEMS_REGISTER.register("neptunium_gas_bucket", () -> new GasBucketItem(ECGases.NEPTUNIUM_GAS.get(), BUCKET));
    /** 钚气桶 */
    public static final DeferredItem<GasBucketItem> PLUTONIUM_GAS_BUCKET = ITEMS_REGISTER.register("plutonium_gas_bucket", () -> new GasBucketItem(ECGases.PLUTONIUM_GAS.get(), BUCKET));
    /** 镅气桶 */
    public static final DeferredItem<GasBucketItem> AMERICIUM_GAS_BUCKET = ITEMS_REGISTER.register("americium_gas_bucket", () -> new GasBucketItem(ECGases.AMERICIUM_GAS.get(), BUCKET));
    /** 锔气桶 */
    public static final DeferredItem<GasBucketItem> CURIUM_GAS_BUCKET = ITEMS_REGISTER.register("curium_gas_bucket", () -> new GasBucketItem(ECGases.CURIUM_GAS.get(), BUCKET));
    /** 锫气桶 */
    public static final DeferredItem<GasBucketItem> BERKELIUM_GAS_BUCKET = ITEMS_REGISTER.register("berkelium_gas_bucket", () -> new GasBucketItem(ECGases.BERKELIUM_GAS.get(), BUCKET));
    /** 锎气桶 */
    public static final DeferredItem<GasBucketItem> CALIFORNIUM_GAS_BUCKET = ITEMS_REGISTER.register("californium_gas_bucket", () -> new GasBucketItem(ECGases.CALIFORNIUM_GAS.get(), BUCKET));
    /** 锿气桶 */
    public static final DeferredItem<GasBucketItem> EINSTEINIUM_GAS_BUCKET = ITEMS_REGISTER.register("einsteinium_gas_bucket", () -> new GasBucketItem(ECGases.EINSTEINIUM_GAS.get(), BUCKET));
    /** 镄气桶 */
    public static final DeferredItem<GasBucketItem> FERMIUM_GAS_BUCKET = ITEMS_REGISTER.register("fermium_gas_bucket", () -> new GasBucketItem(ECGases.FERMIUM_GAS.get(), BUCKET));
    /** 钔气桶 */
    public static final DeferredItem<GasBucketItem> MENDELEVIUM_GAS_BUCKET = ITEMS_REGISTER.register("mendelevium_gas_bucket", () -> new GasBucketItem(ECGases.MENDELEVIUM_GAS.get(), BUCKET));
    /** 锘气桶 */
    public static final DeferredItem<GasBucketItem> NOBELIUM_GAS_BUCKET = ITEMS_REGISTER.register("nobelium_gas_bucket", () -> new GasBucketItem(ECGases.NOBELIUM_GAS.get(), BUCKET));
    /** 铹气桶 */
    public static final DeferredItem<GasBucketItem> LAWRENCIUM_GAS_BUCKET = ITEMS_REGISTER.register("lawrencium_gas_bucket", () -> new GasBucketItem(ECGases.LAWRENCIUM_GAS.get(), BUCKET));
    /** 𬬻气桶 */
    public static final DeferredItem<GasBucketItem> RUTHERFORDIUM_GAS_BUCKET = ITEMS_REGISTER.register("rutherfordium_gas_bucket", () -> new GasBucketItem(ECGases.RUTHERFORDIUM_GAS.get(), BUCKET));
    /** 𬭊气桶 */
    public static final DeferredItem<GasBucketItem> DUBNIUM_GAS_BUCKET = ITEMS_REGISTER.register("dubnium_gas_bucket", () -> new GasBucketItem(ECGases.DUBNIUM_GAS.get(), BUCKET));
    /** 𬭳气桶 */
    public static final DeferredItem<GasBucketItem> SEABORGIUM_GAS_BUCKET = ITEMS_REGISTER.register("seaborgium_gas_bucket", () -> new GasBucketItem(ECGases.SEABORGIUM_GAS.get(), BUCKET));
    /** 𬭛气桶 */
    public static final DeferredItem<GasBucketItem> BOHRIUM_GAS_BUCKET = ITEMS_REGISTER.register("bohrium_gas_bucket", () -> new GasBucketItem(ECGases.BOHRIUM_GAS.get(), BUCKET));
    /** 𬭶气桶 */
    public static final DeferredItem<GasBucketItem> HASSIUM_GAS_BUCKET = ITEMS_REGISTER.register("hassium_gas_bucket", () -> new GasBucketItem(ECGases.HASSIUM_GAS.get(), BUCKET));
    /** 鿏气桶 */
    public static final DeferredItem<GasBucketItem> MEITNERIUM_GAS_BUCKET = ITEMS_REGISTER.register("meitnerium_gas_bucket", () -> new GasBucketItem(ECGases.MEITNERIUM_GAS.get(), BUCKET));
    /** 𫟼气桶 */
    public static final DeferredItem<GasBucketItem> DARMSTADTIUM_GAS_BUCKET = ITEMS_REGISTER.register("darmstadtium_gas_bucket", () -> new GasBucketItem(ECGases.DARMSTADTIUM_GAS.get(), BUCKET));
    /** 𬬭气桶 */
    public static final DeferredItem<GasBucketItem> ROENTGENIUM_GAS_BUCKET = ITEMS_REGISTER.register("roentgenium_gas_bucket", () -> new GasBucketItem(ECGases.ROENTGENIUM_GAS.get(), BUCKET));
    /** 鿔气桶 */
    public static final DeferredItem<GasBucketItem> COPERNICIUM_GAS_BUCKET = ITEMS_REGISTER.register("copernicium_gas_bucket", () -> new GasBucketItem(ECGases.COPERNICIUM_GAS.get(), BUCKET));
    /** 鉨气桶 */
    public static final DeferredItem<GasBucketItem> NIHONIUM_GAS_BUCKET = ITEMS_REGISTER.register("nihonium_gas_bucket", () -> new GasBucketItem(ECGases.NIHONIUM_GAS.get(), BUCKET));
    /** 鈇气桶 */
    public static final DeferredItem<GasBucketItem> FLEROVIUM_GAS_BUCKET = ITEMS_REGISTER.register("flerovium_gas_bucket", () -> new GasBucketItem(ECGases.FLEROVIUM_GAS.get(), BUCKET));
    /** 镆气桶 */
    public static final DeferredItem<GasBucketItem> MOSCOVIUM_GAS_BUCKET = ITEMS_REGISTER.register("moscovium_gas_bucket", () -> new GasBucketItem(ECGases.MOSCOVIUM_GAS.get(), BUCKET));
    /** 鉝气桶 */
    public static final DeferredItem<GasBucketItem> LIVERMORIUM_GAS_BUCKET = ITEMS_REGISTER.register("livermorium_gas_bucket", () -> new GasBucketItem(ECGases.LIVERMORIUM_GAS.get(), BUCKET));
    /** 鿬气桶 */
    public static final DeferredItem<GasBucketItem> TENNESSINE_GAS_BUCKET = ITEMS_REGISTER.register("tennessine_gas_bucket", () -> new GasBucketItem(ECGases.TENNESSINE_GAS.get(), BUCKET));
    /** 鿫气桶 */
    public static final DeferredItem<GasBucketItem> OGANESSON_GAS_BUCKET = ITEMS_REGISTER.register("oganesson_gas_bucket", () -> new GasBucketItem(ECGases.OGANESSON_GAS.get(), BUCKET));
    /** 鑨气桶 */
    public static final DeferredItem<GasBucketItem> LONGIUM_GAS_BUCKET = ITEMS_REGISTER.register("longium_gas_bucket", () -> new GasBucketItem(ECGases.LONGIUM_GAS.get(), BUCKET));
    /** 镾气桶 */
    public static final DeferredItem<GasBucketItem> MYSTERIUM_GAS_BUCKET = ITEMS_REGISTER.register("mysterium_gas_bucket", () -> new GasBucketItem(ECGases.MYSTERIUM_GAS.get(), BUCKET));

    // ==================== 批量注册 矿锭/粒/齿轮/板/粉/棍/线/粉碎粗矿/粗矿 ====================
    public static final class OreItems {
        public static final List<DeferredItem<?>> ALL_ITEMS = new ArrayList<>();
        public static final List<ECMaterialItems.OreItems> ALL_ORE_ITEMS = new ArrayList<>();

        public final DeferredItem<Item> INGOT;
        public final DeferredItem<Item> NUGGET;
        public final DeferredItem<Item> GEAR;
        public final DeferredItem<Item> DUST;
        public final DeferredItem<Item> PLATE;
        public final DeferredItem<Item> ROD;
        public final DeferredItem<Item> WIRE;
        public final DeferredItem<Item> CRUSHED_RAW;
        public final DeferredItem<Item> RAW;

        public OreItems(String materialName, Rarity rarity) {
            INGOT = registerAndAdd(materialName + "_ingot", rarity);
            NUGGET = registerAndAdd(materialName + "_nugget", rarity);
            GEAR = registerAndAdd(materialName + "_gear", rarity);
            DUST = registerAndAdd(materialName + "_dust", rarity);
            PLATE = registerAndAdd(materialName + "_plate", rarity);
            ROD = registerAndAdd(materialName + "_rod", rarity);
            WIRE = registerAndAdd(materialName + "_wire", rarity);
            CRUSHED_RAW = registerAndAdd("crushed_raw_" + materialName, rarity);
            RAW = registerAndAdd("raw_" + materialName, rarity);
            ALL_ORE_ITEMS.add(this);
        }

        private DeferredItem<Item> registerAndAdd(String name, Rarity rarity) {
            DeferredItem<Item> item = ITEMS_REGISTER.register(name, () -> new Item(new Item.Properties().rarity(rarity)));
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
            output.accept(new ItemStack(CRUSHED_RAW.get()));
            output.accept(new ItemStack(RAW.get()));
        }
    }

    // ==================== 批量注册 合金锭/粒/齿轮/板/粉/棍/线 ====================
    public static final class NoOreItems {
        public static final List<DeferredItem<?>> ALL_ITEMS = new ArrayList<>();
        public static final List<ECMaterialItems.NoOreItems> ALL_NOE_ORE_ITEMS = new ArrayList<>();

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
            DeferredItem<Item> item = ITEMS_REGISTER.register(name, () -> new Item(new Item.Properties().rarity(rarity)));
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
        ITEMS_REGISTER.register(eventBus);
    }
}