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
    public static final DeferredItem<BucketItem> LIQUID_HYDROGEN_BUCKET = ITEMS_REGISTER.register("liquid_hydrogen_bucket", () -> new BucketItem(ECFluids.LIQUID_HYDROGEN.source.get(), BUCKET));
    /** 氦桶 */
    public static final DeferredItem<BucketItem> LIQUID_HELIUM_BUCKET = ITEMS_REGISTER.register("liquid_helium_bucket", () -> new BucketItem(ECFluids.LIQUID_HELIUM.source.get(), BUCKET));
    /** 锂桶 */
    public static final DeferredItem<BucketItem> LIQUID_LITHIUM_BUCKET = ITEMS_REGISTER.register("liquid_lithium_bucket", () -> new BucketItem(ECFluids.LIQUID_LITHIUM.source.get(), BUCKET));
    /** 铍桶 */
    public static final DeferredItem<BucketItem> LIQUID_BERYLLIUM_BUCKET = ITEMS_REGISTER.register("liquid_beryllium_bucket", () -> new BucketItem(ECFluids.LIQUID_BERYLLIUM.source.get(), BUCKET));
    /** 硼桶 */
    public static final DeferredItem<BucketItem> LIQUID_BORON_BUCKET = ITEMS_REGISTER.register("liquid_boron_bucket", () -> new BucketItem(ECFluids.LIQUID_BORON.source.get(), BUCKET));
    /** 碳桶 */
    public static final DeferredItem<BucketItem> LIQUID_CARBON_BUCKET = ITEMS_REGISTER.register("liquid_carbon_bucket", () -> new BucketItem(ECFluids.LIQUID_CARBON.source.get(), BUCKET));
    /** 氮桶 */
    public static final DeferredItem<BucketItem> LIQUID_NITROGEN_BUCKET = ITEMS_REGISTER.register("liquid_nitrogen_bucket", () -> new BucketItem(ECFluids.LIQUID_NITROGEN.source.get(), BUCKET));
    /** 氧桶 */
    public static final DeferredItem<BucketItem> LIQUID_OXYGEN_BUCKET = ITEMS_REGISTER.register("liquid_oxygen_bucket", () -> new BucketItem(ECFluids.LIQUID_OXYGEN.source.get(), BUCKET));
    /** 氟桶 */
    public static final DeferredItem<BucketItem> LIQUID_FLUORINE_BUCKET = ITEMS_REGISTER.register("liquid_fluorine_bucket", () -> new BucketItem(ECFluids.LIQUID_FLUORINE.source.get(), BUCKET));
    /** 氖桶 */
    public static final DeferredItem<BucketItem> LIQUID_NEON_BUCKET = ITEMS_REGISTER.register("liquid_neon_bucket", () -> new BucketItem(ECFluids.LIQUID_NEON.source.get(), BUCKET));
    /** 钠桶 */
    public static final DeferredItem<BucketItem> LIQUID_SODIUM_BUCKET = ITEMS_REGISTER.register("liquid_sodium_bucket", () -> new BucketItem(ECFluids.LIQUID_SODIUM.source.get(), BUCKET));
    /** 镁桶 */
    public static final DeferredItem<BucketItem> LIQUID_MAGNESIUM_BUCKET = ITEMS_REGISTER.register("liquid_magnesium_bucket", () -> new BucketItem(ECFluids.LIQUID_MAGNESIUM.source.get(), BUCKET));
    /** 铝桶 */
    public static final DeferredItem<BucketItem> LIQUID_ALUMINUM_BUCKET = ITEMS_REGISTER.register("liquid_aluminum_bucket", () -> new BucketItem(ECFluids.LIQUID_ALUMINUM.source.get(), BUCKET));
    /** 硅桶 */
    public static final DeferredItem<BucketItem> LIQUID_SILICON_BUCKET = ITEMS_REGISTER.register("liquid_silicon_bucket", () -> new BucketItem(ECFluids.LIQUID_SILICON.source.get(), BUCKET));
    /** 磷桶 */
    public static final DeferredItem<BucketItem> LIQUID_PHOSPHORUS_BUCKET = ITEMS_REGISTER.register("liquid_phosphorus_bucket", () -> new BucketItem(ECFluids.LIQUID_PHOSPHORUS.source.get(), BUCKET));
    /** 硫桶 */
    public static final DeferredItem<BucketItem> LIQUID_SULFUR_BUCKET = ITEMS_REGISTER.register("liquid_sulfur_bucket", () -> new BucketItem(ECFluids.LIQUID_SULFUR.source.get(), BUCKET));
    /** 氯桶 */
    public static final DeferredItem<BucketItem> LIQUID_CHLORINE_BUCKET = ITEMS_REGISTER.register("liquid_chlorine_bucket", () -> new BucketItem(ECFluids.LIQUID_CHLORINE.source.get(), BUCKET));
    /** 氩桶 */
    public static final DeferredItem<BucketItem> LIQUID_ARGON_BUCKET = ITEMS_REGISTER.register("liquid_argon_bucket", () -> new BucketItem(ECFluids.LIQUID_ARGON.source.get(), BUCKET));
    /** 钾桶 */
    public static final DeferredItem<BucketItem> LIQUID_POTASSIUM_BUCKET = ITEMS_REGISTER.register("liquid_potassium_bucket", () -> new BucketItem(ECFluids.LIQUID_POTASSIUM.source.get(), BUCKET));
    /** 钙桶 */
    public static final DeferredItem<BucketItem> LIQUID_CALCIUM_BUCKET = ITEMS_REGISTER.register("liquid_calcium_bucket", () -> new BucketItem(ECFluids.LIQUID_CALCIUM.source.get(), BUCKET));
    /** 钪桶 */
    public static final DeferredItem<BucketItem> LIQUID_SCANDIUM_BUCKET = ITEMS_REGISTER.register("liquid_scandium_bucket", () -> new BucketItem(ECFluids.LIQUID_SCANDIUM.source.get(), BUCKET));
    /** 钛桶 */
    public static final DeferredItem<BucketItem> LIQUID_TITANIUM_BUCKET = ITEMS_REGISTER.register("liquid_titanium_bucket", () -> new BucketItem(ECFluids.LIQUID_TITANIUM.source.get(), BUCKET));
    /** 钒桶 */
    public static final DeferredItem<BucketItem> LIQUID_VANADIUM_BUCKET = ITEMS_REGISTER.register("liquid_vanadium_bucket", () -> new BucketItem(ECFluids.LIQUID_VANADIUM.source.get(), BUCKET));
    /** 铬桶 */
    public static final DeferredItem<BucketItem> LIQUID_CHROMIUM_BUCKET = ITEMS_REGISTER.register("liquid_chromium_bucket", () -> new BucketItem(ECFluids.LIQUID_CHROMIUM.source.get(), BUCKET));
    /** 锰桶 */
    public static final DeferredItem<BucketItem> LIQUID_MANGANESE_BUCKET = ITEMS_REGISTER.register("liquid_manganese_bucket", () -> new BucketItem(ECFluids.LIQUID_MANGANESE.source.get(), BUCKET));
    /** 铁桶 */
    public static final DeferredItem<BucketItem> LIQUID_IRON_BUCKET = ITEMS_REGISTER.register("liquid_iron_bucket", () -> new BucketItem(ECFluids.LIQUID_IRON.source.get(), BUCKET));
    /** 钴桶 */
    public static final DeferredItem<BucketItem> LIQUID_COBALT_BUCKET = ITEMS_REGISTER.register("liquid_cobalt_bucket", () -> new BucketItem(ECFluids.LIQUID_COBALT.source.get(), BUCKET));
    /** 镍桶 */
    public static final DeferredItem<BucketItem> LIQUID_NICKEL_BUCKET = ITEMS_REGISTER.register("liquid_nickel_bucket", () -> new BucketItem(ECFluids.LIQUID_NICKEL.source.get(), BUCKET));
    /** 铜桶 */
    public static final DeferredItem<BucketItem> LIQUID_COPPER_BUCKET = ITEMS_REGISTER.register("liquid_copper_bucket", () -> new BucketItem(ECFluids.LIQUID_COPPER.source.get(), BUCKET));
    /** 锌桶 */
    public static final DeferredItem<BucketItem> LIQUID_ZINC_BUCKET = ITEMS_REGISTER.register("liquid_zinc_bucket", () -> new BucketItem(ECFluids.LIQUID_ZINC.source.get(), BUCKET));
    /** 镓桶 */
    public static final DeferredItem<BucketItem> LIQUID_GALLIUM_BUCKET = ITEMS_REGISTER.register("liquid_gallium_bucket", () -> new BucketItem(ECFluids.LIQUID_GALLIUM.source.get(), BUCKET));
    /** 锗桶 */
    public static final DeferredItem<BucketItem> LIQUID_GERMANIUM_BUCKET = ITEMS_REGISTER.register("liquid_germanium_bucket", () -> new BucketItem(ECFluids.LIQUID_GERMANIUM.source.get(), BUCKET));
    /** 砷桶 */
    public static final DeferredItem<BucketItem> LIQUID_ARSENIC_BUCKET = ITEMS_REGISTER.register("liquid_arsenic_bucket", () -> new BucketItem(ECFluids.LIQUID_ARSENIC.source.get(), BUCKET));
    /** 硒桶 */
    public static final DeferredItem<BucketItem> LIQUID_SELENIUM_BUCKET = ITEMS_REGISTER.register("liquid_selenium_bucket", () -> new BucketItem(ECFluids.LIQUID_SELENIUM.source.get(), BUCKET));
    /** 溴桶 */
    public static final DeferredItem<BucketItem> BROMINE_BUCKET = ITEMS_REGISTER.register("bromine_bucket", () -> new BucketItem(ECFluids.BROMINE.source.get(), BUCKET));
    /** 氪桶 */
    public static final DeferredItem<BucketItem> LIQUID_KRYPTON_BUCKET = ITEMS_REGISTER.register("liquid_krypton_bucket", () -> new BucketItem(ECFluids.LIQUID_KRYPTON.source.get(), BUCKET));
    /** 铷桶 */
    public static final DeferredItem<BucketItem> LIQUID_RUBIDIUM_BUCKET = ITEMS_REGISTER.register("liquid_rubidium_bucket", () -> new BucketItem(ECFluids.LIQUID_RUBIDIUM.source.get(), BUCKET));
    /** 锶桶 */
    public static final DeferredItem<BucketItem> LIQUID_STRONTIUM_BUCKET = ITEMS_REGISTER.register("liquid_strontium_bucket", () -> new BucketItem(ECFluids.LIQUID_STRONTIUM.source.get(), BUCKET));
    /** 钇桶 */
    public static final DeferredItem<BucketItem> LIQUID_YTTRIUM_BUCKET = ITEMS_REGISTER.register("liquid_yttrium_bucket", () -> new BucketItem(ECFluids.LIQUID_YTTRIUM.source.get(), BUCKET));
    /** 锆桶 */
    public static final DeferredItem<BucketItem> LIQUID_ZIRCONIUM_BUCKET = ITEMS_REGISTER.register("liquid_zirconium_bucket", () -> new BucketItem(ECFluids.LIQUID_ZIRCONIUM.source.get(), BUCKET));
    /** 铌桶 */
    public static final DeferredItem<BucketItem> LIQUID_NIOBIUM_BUCKET = ITEMS_REGISTER.register("liquid_niobium_bucket", () -> new BucketItem(ECFluids.LIQUID_NIOBIUM.source.get(), BUCKET));
    /** 钼桶 */
    public static final DeferredItem<BucketItem> LIQUID_MOLYBDENUM_BUCKET = ITEMS_REGISTER.register("liquid_molybdenum_bucket", () -> new BucketItem(ECFluids.LIQUID_MOLYBDENUM.source.get(), BUCKET));
    /** 锝桶 */
    public static final DeferredItem<BucketItem> LIQUID_TECHNETIUM_BUCKET = ITEMS_REGISTER.register("liquid_technetium_bucket", () -> new BucketItem(ECFluids.LIQUID_TECHNETIUM.source.get(), BUCKET));
    /** 钌桶 */
    public static final DeferredItem<BucketItem> LIQUID_RUTHENIUM_BUCKET = ITEMS_REGISTER.register("liquid_ruthenium_bucket", () -> new BucketItem(ECFluids.LIQUID_RUTHENIUM.source.get(), BUCKET));
    /** 铑桶 */
    public static final DeferredItem<BucketItem> LIQUID_RHODIUM_BUCKET = ITEMS_REGISTER.register("liquid_rhodium_bucket", () -> new BucketItem(ECFluids.LIQUID_RHODIUM.source.get(), BUCKET));
    /** 钯桶 */
    public static final DeferredItem<BucketItem> LIQUID_PALLADIUM_BUCKET = ITEMS_REGISTER.register("liquid_palladium_bucket", () -> new BucketItem(ECFluids.LIQUID_PALLADIUM.source.get(), BUCKET));
    /** 银桶 */
    public static final DeferredItem<BucketItem> LIQUID_SILVER_BUCKET = ITEMS_REGISTER.register("liquid_silver_bucket", () -> new BucketItem(ECFluids.LIQUID_SILVER.source.get(), BUCKET));
    /** 镉桶 */
    public static final DeferredItem<BucketItem> LIQUID_CADMIUM_BUCKET = ITEMS_REGISTER.register("liquid_cadmium_bucket", () -> new BucketItem(ECFluids.LIQUID_CADMIUM.source.get(), BUCKET));
    /** 铟桶 */
    public static final DeferredItem<BucketItem> LIQUID_INDIUM_BUCKET = ITEMS_REGISTER.register("liquid_indium_bucket", () -> new BucketItem(ECFluids.LIQUID_INDIUM.source.get(), BUCKET));
    /** 锡桶 */
    public static final DeferredItem<BucketItem> LIQUID_TIN_BUCKET = ITEMS_REGISTER.register("liquid_tin_bucket", () -> new BucketItem(ECFluids.LIQUID_TIN.source.get(), BUCKET));
    /** 锑桶 */
    public static final DeferredItem<BucketItem> LIQUID_ANTIMONY_BUCKET = ITEMS_REGISTER.register("liquid_antimony_bucket", () -> new BucketItem(ECFluids.LIQUID_ANTIMONY.source.get(), BUCKET));
    /** 碲桶 */
    public static final DeferredItem<BucketItem> LIQUID_TELLURIUM_BUCKET = ITEMS_REGISTER.register("liquid_tellurium_bucket", () -> new BucketItem(ECFluids.LIQUID_TELLURIUM.source.get(), BUCKET));
    /** 碘桶 */
    public static final DeferredItem<BucketItem> LIQUID_IODINE_BUCKET = ITEMS_REGISTER.register("liquid_iodine_bucket", () -> new BucketItem(ECFluids.LIQUID_IODINE.source.get(), BUCKET));
    /** 氙桶 */
    public static final DeferredItem<BucketItem> LIQUID_XENON_BUCKET = ITEMS_REGISTER.register("liquid_xenon_bucket", () -> new BucketItem(ECFluids.LIQUID_XENON.source.get(), BUCKET));
    /** 铯桶 */
    public static final DeferredItem<BucketItem> LIQUID_CESIUM_BUCKET = ITEMS_REGISTER.register("liquid_cesium_bucket", () -> new BucketItem(ECFluids.LIQUID_CESIUM.source.get(), BUCKET));
    /** 钡桶 */
    public static final DeferredItem<BucketItem> LIQUID_BARIUM_BUCKET = ITEMS_REGISTER.register("liquid_barium_bucket", () -> new BucketItem(ECFluids.LIQUID_BARIUM.source.get(), BUCKET));
    /** 镧桶 */
    public static final DeferredItem<BucketItem> LIQUID_LANTHANUM_BUCKET = ITEMS_REGISTER.register("liquid_lanthanum_bucket", () -> new BucketItem(ECFluids.LIQUID_LANTHANUM.source.get(), BUCKET));
    /** 铈桶 */
    public static final DeferredItem<BucketItem> LIQUID_CERIUM_BUCKET = ITEMS_REGISTER.register("liquid_cerium_bucket", () -> new BucketItem(ECFluids.LIQUID_CERIUM.source.get(), BUCKET));
    /** 镨桶 */
    public static final DeferredItem<BucketItem> LIQUID_PRASEODYMIUM_BUCKET = ITEMS_REGISTER.register("liquid_praseodymium_bucket", () -> new BucketItem(ECFluids.LIQUID_PRASEODYMIUM.source.get(), BUCKET));
    /** 钕桶 */
    public static final DeferredItem<BucketItem> LIQUID_NEODYMIUM_BUCKET = ITEMS_REGISTER.register("liquid_neodymium_bucket", () -> new BucketItem(ECFluids.LIQUID_NEODYMIUM.source.get(), BUCKET));
    /** 钷桶 */
    public static final DeferredItem<BucketItem> LIQUID_PROMETHIUM_BUCKET = ITEMS_REGISTER.register("liquid_promethium_bucket", () -> new BucketItem(ECFluids.LIQUID_PROMETHIUM.source.get(), BUCKET));
    /** 钐桶 */
    public static final DeferredItem<BucketItem> LIQUID_SAMARIUM_BUCKET = ITEMS_REGISTER.register("liquid_samarium_bucket", () -> new BucketItem(ECFluids.LIQUID_SAMARIUM.source.get(), BUCKET));
    /** 铕桶 */
    public static final DeferredItem<BucketItem> LIQUID_EUROPIUM_BUCKET = ITEMS_REGISTER.register("liquid_europium_bucket", () -> new BucketItem(ECFluids.LIQUID_EUROPIUM.source.get(), BUCKET));
    /** 钆桶 */
    public static final DeferredItem<BucketItem> LIQUID_GADOLINIUM_BUCKET = ITEMS_REGISTER.register("liquid_gadolinium_bucket", () -> new BucketItem(ECFluids.LIQUID_GADOLINIUM.source.get(), BUCKET));
    /** 铽桶 */
    public static final DeferredItem<BucketItem> LIQUID_TERBIUM_BUCKET = ITEMS_REGISTER.register("liquid_terbium_bucket", () -> new BucketItem(ECFluids.LIQUID_TERBIUM.source.get(), BUCKET));
    /** 镝桶 */
    public static final DeferredItem<BucketItem> LIQUID_DYSPROSIUM_BUCKET = ITEMS_REGISTER.register("liquid_dysprosium_bucket", () -> new BucketItem(ECFluids.LIQUID_DYSPROSIUM.source.get(), BUCKET));
    /** 钬桶 */
    public static final DeferredItem<BucketItem> LIQUID_HOLMIUM_BUCKET = ITEMS_REGISTER.register("liquid_holmium_bucket", () -> new BucketItem(ECFluids.LIQUID_HOLMIUM.source.get(), BUCKET));
    /** 铒桶 */
    public static final DeferredItem<BucketItem> LIQUID_ERBIUM_BUCKET = ITEMS_REGISTER.register("liquid_erbium_bucket", () -> new BucketItem(ECFluids.LIQUID_ERBIUM.source.get(), BUCKET));
    /** 铥桶 */
    public static final DeferredItem<BucketItem> LIQUID_THULIUM_BUCKET = ITEMS_REGISTER.register("liquid_thulium_bucket", () -> new BucketItem(ECFluids.LIQUID_THULIUM.source.get(), BUCKET));
    /** 镱桶 */
    public static final DeferredItem<BucketItem> LIQUID_YTTERBIUM_BUCKET = ITEMS_REGISTER.register("liquid_ytterbium_bucket", () -> new BucketItem(ECFluids.LIQUID_YTTERBIUM.source.get(), BUCKET));
    /** 镥桶 */
    public static final DeferredItem<BucketItem> LIQUID_LUTETIUM_BUCKET = ITEMS_REGISTER.register("liquid_lutetium_bucket", () -> new BucketItem(ECFluids.LIQUID_LUTETIUM.source.get(), BUCKET));
    /** 铪桶 */
    public static final DeferredItem<BucketItem> LIQUID_HAFNIUM_BUCKET = ITEMS_REGISTER.register("liquid_hafnium_bucket", () -> new BucketItem(ECFluids.LIQUID_HAFNIUM.source.get(), BUCKET));
    /** 钽桶 */
    public static final DeferredItem<BucketItem> LIQUID_TANTALUM_BUCKET = ITEMS_REGISTER.register("liquid_tantalum_bucket", () -> new BucketItem(ECFluids.LIQUID_TANTALUM.source.get(), BUCKET));
    /** 钨桶 */
    public static final DeferredItem<BucketItem> LIQUID_TUNGSTEN_BUCKET = ITEMS_REGISTER.register("liquid_tungsten_bucket", () -> new BucketItem(ECFluids.LIQUID_TUNGSTEN.source.get(), BUCKET));
    /** 铼桶 */
    public static final DeferredItem<BucketItem> LIQUID_RHENIUM_BUCKET = ITEMS_REGISTER.register("liquid_rhenium_bucket", () -> new BucketItem(ECFluids.LIQUID_RHENIUM.source.get(), BUCKET));
    /** 锇桶 */
    public static final DeferredItem<BucketItem> LIQUID_OSMIUM_BUCKET = ITEMS_REGISTER.register("liquid_osmium_bucket", () -> new BucketItem(ECFluids.LIQUID_OSMIUM.source.get(), BUCKET));
    /** 铱桶 */
    public static final DeferredItem<BucketItem> LIQUID_IRIDIUM_BUCKET = ITEMS_REGISTER.register("liquid_iridium_bucket", () -> new BucketItem(ECFluids.LIQUID_IRIDIUM.source.get(), BUCKET));
    /** 铂桶 */
    public static final DeferredItem<BucketItem> LIQUID_PLATINUM_BUCKET = ITEMS_REGISTER.register("liquid_platinum_bucket", () -> new BucketItem(ECFluids.LIQUID_PLATINUM.source.get(), BUCKET));
    /** 金桶 */
    public static final DeferredItem<BucketItem> LIQUID_GOLD_BUCKET = ITEMS_REGISTER.register("liquid_gold_bucket", () -> new BucketItem(ECFluids.LIQUID_GOLD.source.get(), BUCKET));
    /** 汞桶 */
    public static final DeferredItem<BucketItem> MERCURY_BUCKET = ITEMS_REGISTER.register("mercury_bucket", () -> new BucketItem(ECFluids.MERCURY.source.get(), BUCKET));
    /** 铊桶 */
    public static final DeferredItem<BucketItem> LIQUID_THALLIUM_BUCKET = ITEMS_REGISTER.register("liquid_thallium_bucket", () -> new BucketItem(ECFluids.LIQUID_THALLIUM.source.get(), BUCKET));
    /** 铅桶 */
    public static final DeferredItem<BucketItem> LIQUID_LEAD_BUCKET = ITEMS_REGISTER.register("liquid_lead_bucket", () -> new BucketItem(ECFluids.LIQUID_LEAD.source.get(), BUCKET));
    /** 铋桶 */
    public static final DeferredItem<BucketItem> LIQUID_BISMUTH_BUCKET = ITEMS_REGISTER.register("liquid_bismuth_bucket", () -> new BucketItem(ECFluids.LIQUID_BISMUTH.source.get(), BUCKET));
    /** 钋桶 */
    public static final DeferredItem<BucketItem> LIQUID_POLONIUM_BUCKET = ITEMS_REGISTER.register("liquid_polonium_bucket", () -> new BucketItem(ECFluids.LIQUID_POLONIUM.source.get(), BUCKET));
    /** 砹桶 */
    public static final DeferredItem<BucketItem> LIQUID_ASTATINE_BUCKET = ITEMS_REGISTER.register("liquid_astatine_bucket", () -> new BucketItem(ECFluids.LIQUID_ASTATINE.source.get(), BUCKET));
    /** 氡桶 */
    public static final DeferredItem<BucketItem> LIQUID_RADON_BUCKET = ITEMS_REGISTER.register("liquid_radon_bucket", () -> new BucketItem(ECFluids.LIQUID_RADON.source.get(), BUCKET));
    /** 钫桶 */
    public static final DeferredItem<BucketItem> LIQUID_FRANCIUM_BUCKET = ITEMS_REGISTER.register("liquid_francium_bucket", () -> new BucketItem(ECFluids.LIQUID_FRANCIUM.source.get(), BUCKET));
    /** 镭桶 */
    public static final DeferredItem<BucketItem> LIQUID_RADIUM_BUCKET = ITEMS_REGISTER.register("liquid_radium_bucket", () -> new BucketItem(ECFluids.LIQUID_RADIUM.source.get(), BUCKET));
    /** 锕桶 */
    public static final DeferredItem<BucketItem> LIQUID_ACTINIUM_BUCKET = ITEMS_REGISTER.register("liquid_actinium_bucket", () -> new BucketItem(ECFluids.LIQUID_ACTINIUM.source.get(), BUCKET));
    /** 钍桶 */
    public static final DeferredItem<BucketItem> LIQUID_THORIUM_BUCKET = ITEMS_REGISTER.register("liquid_thorium_bucket", () -> new BucketItem(ECFluids.LIQUID_THORIUM.source.get(), BUCKET));
    /** 镤桶 */
    public static final DeferredItem<BucketItem> LIQUID_PROTACTINIUM_BUCKET = ITEMS_REGISTER.register("liquid_protactinium_bucket", () -> new BucketItem(ECFluids.LIQUID_PROTACTINIUM.source.get(), BUCKET));
    /** 铀桶 */
    public static final DeferredItem<BucketItem> LIQUID_URANIUM_BUCKET = ITEMS_REGISTER.register("liquid_uranium_bucket", () -> new BucketItem(ECFluids.LIQUID_URANIUM.source.get(), BUCKET));
    /** 镎桶 */
    public static final DeferredItem<BucketItem> LIQUID_NEPTUNIUM_BUCKET = ITEMS_REGISTER.register("liquid_neptunium_bucket", () -> new BucketItem(ECFluids.LIQUID_NEPTUNIUM.source.get(), BUCKET));
    /** 钚桶 */
    public static final DeferredItem<BucketItem> LIQUID_PLUTONIUM_BUCKET = ITEMS_REGISTER.register("liquid_plutonium_bucket", () -> new BucketItem(ECFluids.LIQUID_PLUTONIUM.source.get(), BUCKET));
    /** 镅桶 */
    public static final DeferredItem<BucketItem> LIQUID_AMERICIUM_BUCKET = ITEMS_REGISTER.register("liquid_americium_bucket", () -> new BucketItem(ECFluids.LIQUID_AMERICIUM.source.get(), BUCKET));
    /** 锔桶 */
    public static final DeferredItem<BucketItem> LIQUID_CURIUM_BUCKET = ITEMS_REGISTER.register("liquid_curium_bucket", () -> new BucketItem(ECFluids.LIQUID_CURIUM.source.get(), BUCKET));
    /** 锫桶 */
    public static final DeferredItem<BucketItem> LIQUID_BERKELIUM_BUCKET = ITEMS_REGISTER.register("liquid_berkelium_bucket", () -> new BucketItem(ECFluids.LIQUID_BERKELIUM.source.get(), BUCKET));
    /** 锎桶 */
    public static final DeferredItem<BucketItem> LIQUID_CALIFORNIUM_BUCKET = ITEMS_REGISTER.register("liquid_californium_bucket", () -> new BucketItem(ECFluids.LIQUID_CALIFORNIUM.source.get(), BUCKET));
    /** 锿桶 */
    public static final DeferredItem<BucketItem> LIQUID_EINSTEINIUM_BUCKET = ITEMS_REGISTER.register("liquid_einsteinium_bucket", () -> new BucketItem(ECFluids.LIQUID_EINSTEINIUM.source.get(), BUCKET));
    /** 镄桶 */
    public static final DeferredItem<BucketItem> LIQUID_FERMIUM_BUCKET = ITEMS_REGISTER.register("liquid_fermium_bucket", () -> new BucketItem(ECFluids.LIQUID_FERMIUM.source.get(), BUCKET));
    /** 钔桶 */
    public static final DeferredItem<BucketItem> LIQUID_MENDELEVIUM_BUCKET = ITEMS_REGISTER.register("liquid_mendelevium_bucket", () -> new BucketItem(ECFluids.LIQUID_MENDELEVIUM.source.get(), BUCKET));
    /** 锘桶 */
    public static final DeferredItem<BucketItem> LIQUID_NOBELIUM_BUCKET = ITEMS_REGISTER.register("liquid_nobelium_bucket", () -> new BucketItem(ECFluids.LIQUID_NOBELIUM.source.get(), BUCKET));
    /** 铹桶 */
    public static final DeferredItem<BucketItem> LIQUID_LAWRENCIUM_BUCKET = ITEMS_REGISTER.register("liquid_lawrencium_bucket", () -> new BucketItem(ECFluids.LIQUID_LAWRENCIUM.source.get(), BUCKET));
    /** 𬬻桶 */
    public static final DeferredItem<BucketItem> LIQUID_RUTHERFORDIUM_BUCKET = ITEMS_REGISTER.register("liquid_rutherfordium_bucket", () -> new BucketItem(ECFluids.LIQUID_RUTHERFORDIUM.source.get(), BUCKET));
    /** 𬭊桶 */
    public static final DeferredItem<BucketItem> LIQUID_DUBNIUM_BUCKET = ITEMS_REGISTER.register("liquid_dubnium_bucket", () -> new BucketItem(ECFluids.LIQUID_DUBNIUM.source.get(), BUCKET));
    /** 𬭳桶 */
    public static final DeferredItem<BucketItem> LIQUID_SEABORGIUM_BUCKET = ITEMS_REGISTER.register("liquid_seaborgium_bucket", () -> new BucketItem(ECFluids.LIQUID_SEABORGIUM.source.get(), BUCKET));
    /** 𬭛桶 */
    public static final DeferredItem<BucketItem> LIQUID_BOHRIUM_BUCKET = ITEMS_REGISTER.register("liquid_bohrium_bucket", () -> new BucketItem(ECFluids.LIQUID_BOHRIUM.source.get(), BUCKET));
    /** 𬭶桶 */
    public static final DeferredItem<BucketItem> LIQUID_HASSIUM_BUCKET = ITEMS_REGISTER.register("liquid_hassium_bucket", () -> new BucketItem(ECFluids.LIQUID_HASSIUM.source.get(), BUCKET));
    /** 鿏桶 */
    public static final DeferredItem<BucketItem> LIQUID_MEITNERIUM_BUCKET = ITEMS_REGISTER.register("liquid_meitnerium_bucket", () -> new BucketItem(ECFluids.LIQUID_MEITNERIUM.source.get(), BUCKET));
    /** 𫟼桶 */
    public static final DeferredItem<BucketItem> LIQUID_DARMSTADTIUM_BUCKET = ITEMS_REGISTER.register("liquid_darmstadtium_bucket", () -> new BucketItem(ECFluids.LIQUID_DARMSTADTIUM.source.get(), BUCKET));
    /** 𬬭桶 */
    public static final DeferredItem<BucketItem> LIQUID_ROENTGENIUM_BUCKET = ITEMS_REGISTER.register("liquid_roentgenium_bucket", () -> new BucketItem(ECFluids.LIQUID_ROENTGENIUM.source.get(), BUCKET));
    /** 鿔桶 */
    public static final DeferredItem<BucketItem> LIQUID_COPERNICIUM_BUCKET = ITEMS_REGISTER.register("liquid_copernicium_bucket", () -> new BucketItem(ECFluids.LIQUID_COPERNICIUM.source.get(), BUCKET));
    /** 鿭桶 */
    public static final DeferredItem<BucketItem> LIQUID_NIHONIUM_BUCKET = ITEMS_REGISTER.register("liquid_nihonium_bucket", () -> new BucketItem(ECFluids.LIQUID_NIHONIUM.source.get(), BUCKET));
    /** 𫓧桶 */
    public static final DeferredItem<BucketItem> LIQUID_FLEROVIUM_BUCKET = ITEMS_REGISTER.register("liquid_flerovium_bucket", () -> new BucketItem(ECFluids.LIQUID_FLEROVIUM.source.get(), BUCKET));
    /** 镆桶 */
    public static final DeferredItem<BucketItem> LIQUID_MOSCOVIUM_BUCKET = ITEMS_REGISTER.register("liquid_moscovium_bucket", () -> new BucketItem(ECFluids.LIQUID_MOSCOVIUM.source.get(), BUCKET));
    /** 𫟷桶 */
    public static final DeferredItem<BucketItem> LIQUID_LIVERMORIUM_BUCKET = ITEMS_REGISTER.register("liquid_livermorium_bucket", () -> new BucketItem(ECFluids.LIQUID_LIVERMORIUM.source.get(), BUCKET));
    /** 鿬桶 */
    public static final DeferredItem<BucketItem> LIQUID_TENNESSINE_BUCKET = ITEMS_REGISTER.register("liquid_tennessine_bucket", () -> new BucketItem(ECFluids.LIQUID_TENNESSINE.source.get(), BUCKET));
    /** 鿫桶 */
    public static final DeferredItem<BucketItem> LIQUID_OGANESSON_BUCKET = ITEMS_REGISTER.register("liquid_oganesson_bucket", () -> new BucketItem(ECFluids.LIQUID_OGANESSON.source.get(), BUCKET));
    /** 鑨桶 */
    public static final DeferredItem<BucketItem> LIQUID_LONGIUM_BUCKET = ITEMS_REGISTER.register("liquid_longium_bucket", () -> new BucketItem(ECFluids.LIQUID_LONGIUM.source.get(), BUCKET));
    /** 镾桶 */
    public static final DeferredItem<BucketItem> LIQUID_MYSTERIUM_BUCKET = ITEMS_REGISTER.register("liquid_mysterium_bucket", () -> new BucketItem(ECFluids.LIQUID_MYSTERIUM.source.get(), BUCKET));

    // ==================== 120个元素的气体/蒸气桶 ====================
    /** 氢气桶 */
    public static final DeferredItem<GasBucketItem> HYDROGEN_GAS_BUCKET = ITEMS_REGISTER.register("hydrogen_gas_bucket", () -> new GasBucketItem(ECGases.HYDROGEN_GAS.get(), BUCKET));
    /** 氦气桶 */
    public static final DeferredItem<GasBucketItem> HELIUM_GAS_BUCKET = ITEMS_REGISTER.register("helium_gas_bucket", () -> new GasBucketItem(ECGases.HELIUM_GAS.get(), BUCKET));
    /** 锂蒸气桶 */
    public static final DeferredItem<GasBucketItem> LITHIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("lithium_vapor_bucket", () -> new GasBucketItem(ECGases.LITHIUM_VAPOR.get(), BUCKET));
    /** 铍蒸气桶 */
    public static final DeferredItem<GasBucketItem> BERYLLIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("beryllium_vapor_bucket", () -> new GasBucketItem(ECGases.BERYLLIUM_VAPOR.get(), BUCKET));
    /** 硼蒸气桶 */
    public static final DeferredItem<GasBucketItem> BORON_VAPOR_BUCKET = ITEMS_REGISTER.register("boron_vapor_bucket", () -> new GasBucketItem(ECGases.BORON_VAPOR.get(), BUCKET));
    /** 碳蒸气桶 */
    public static final DeferredItem<GasBucketItem> CARBON_VAPOR_BUCKET = ITEMS_REGISTER.register("carbon_vapor_bucket", () -> new GasBucketItem(ECGases.CARBON_VAPOR.get(), BUCKET));
    /** 氮气桶 */
    public static final DeferredItem<GasBucketItem> NITROGEN_GAS_BUCKET = ITEMS_REGISTER.register("nitrogen_gas_bucket", () -> new GasBucketItem(ECGases.NITROGEN_GAS.get(), BUCKET));
    /** 氧气桶 */
    public static final DeferredItem<GasBucketItem> OXYGEN_GAS_BUCKET = ITEMS_REGISTER.register("oxygen_gas_bucket", () -> new GasBucketItem(ECGases.OXYGEN_GAS.get(), BUCKET));
    /** 氟气桶 */
    public static final DeferredItem<GasBucketItem> FLUORINE_GAS_BUCKET = ITEMS_REGISTER.register("fluorine_gas_bucket", () -> new GasBucketItem(ECGases.FLUORINE_GAS.get(), BUCKET));
    /** 氖气桶 */
    public static final DeferredItem<GasBucketItem> NEON_GAS_BUCKET = ITEMS_REGISTER.register("neon_gas_bucket", () -> new GasBucketItem(ECGases.NEON_GAS.get(), BUCKET));
    /** 钠蒸气桶 */
    public static final DeferredItem<GasBucketItem> SODIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("sodium_vapor_bucket", () -> new GasBucketItem(ECGases.SODIUM_VAPOR.get(), BUCKET));
    /** 镁蒸气桶 */
    public static final DeferredItem<GasBucketItem> MAGNESIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("magnesium_vapor_bucket", () -> new GasBucketItem(ECGases.MAGNESIUM_VAPOR.get(), BUCKET));
    /** 铝蒸气桶 */
    public static final DeferredItem<GasBucketItem> ALUMINUM_VAPOR_BUCKET = ITEMS_REGISTER.register("aluminum_vapor_bucket", () -> new GasBucketItem(ECGases.ALUMINUM_VAPOR.get(), BUCKET));
    /** 硅蒸气桶 */
    public static final DeferredItem<GasBucketItem> SILICON_VAPOR_BUCKET = ITEMS_REGISTER.register("silicon_vapor_bucket", () -> new GasBucketItem(ECGases.SILICON_VAPOR.get(), BUCKET));
    /** 磷蒸气桶 */
    public static final DeferredItem<GasBucketItem> PHOSPHORUS_VAPOR_BUCKET = ITEMS_REGISTER.register("phosphorus_vapor_bucket", () -> new GasBucketItem(ECGases.PHOSPHORUS_VAPOR.get(), BUCKET));
    /** 硫蒸气桶 */
    public static final DeferredItem<GasBucketItem> SULFUR_VAPOR_BUCKET = ITEMS_REGISTER.register("sulfur_vapor_bucket", () -> new GasBucketItem(ECGases.SULFUR_VAPOR.get(), BUCKET));
    /** 氯气桶 */
    public static final DeferredItem<GasBucketItem> CHLORINE_GAS_BUCKET = ITEMS_REGISTER.register("chlorine_gas_bucket", () -> new GasBucketItem(ECGases.CHLORINE_GAS.get(), BUCKET));
    /** 氩气桶 */
    public static final DeferredItem<GasBucketItem> ARGON_GAS_BUCKET = ITEMS_REGISTER.register("argon_gas_bucket", () -> new GasBucketItem(ECGases.ARGON_GAS.get(), BUCKET));
    /** 钾蒸气桶 */
    public static final DeferredItem<GasBucketItem> POTASSIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("potassium_vapor_bucket", () -> new GasBucketItem(ECGases.POTASSIUM_VAPOR.get(), BUCKET));
    /** 钙蒸气桶 */
    public static final DeferredItem<GasBucketItem> CALCIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("calcium_vapor_bucket", () -> new GasBucketItem(ECGases.CALCIUM_VAPOR.get(), BUCKET));
    /** 钪蒸气桶 */
    public static final DeferredItem<GasBucketItem> SCANDIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("scandium_vapor_bucket", () -> new GasBucketItem(ECGases.SCANDIUM_VAPOR.get(), BUCKET));
    /** 钛蒸气桶 */
    public static final DeferredItem<GasBucketItem> TITANIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("titanium_vapor_bucket", () -> new GasBucketItem(ECGases.TITANIUM_VAPOR.get(), BUCKET));
    /** 钒蒸气桶 */
    public static final DeferredItem<GasBucketItem> VANADIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("vanadium_vapor_bucket", () -> new GasBucketItem(ECGases.VANADIUM_VAPOR.get(), BUCKET));
    /** 铬蒸气桶 */
    public static final DeferredItem<GasBucketItem> CHROMIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("chromium_vapor_bucket", () -> new GasBucketItem(ECGases.CHROMIUM_VAPOR.get(), BUCKET));
    /** 锰蒸气桶 */
    public static final DeferredItem<GasBucketItem> MANGANESE_VAPOR_BUCKET = ITEMS_REGISTER.register("manganese_vapor_bucket", () -> new GasBucketItem(ECGases.MANGANESE_VAPOR.get(), BUCKET));
    /** 铁蒸气桶 */
    public static final DeferredItem<GasBucketItem> IRON_VAPOR_BUCKET = ITEMS_REGISTER.register("iron_vapor_bucket", () -> new GasBucketItem(ECGases.IRON_VAPOR.get(), BUCKET));
    /** 钴蒸气桶 */
    public static final DeferredItem<GasBucketItem> COBALT_VAPOR_BUCKET = ITEMS_REGISTER.register("cobalt_vapor_bucket", () -> new GasBucketItem(ECGases.COBALT_VAPOR.get(), BUCKET));
    /** 镍蒸气桶 */
    public static final DeferredItem<GasBucketItem> NICKEL_VAPOR_BUCKET = ITEMS_REGISTER.register("nickel_vapor_bucket", () -> new GasBucketItem(ECGases.NICKEL_VAPOR.get(), BUCKET));
    /** 铜蒸气桶 */
    public static final DeferredItem<GasBucketItem> COPPER_VAPOR_BUCKET = ITEMS_REGISTER.register("copper_vapor_bucket", () -> new GasBucketItem(ECGases.COPPER_VAPOR.get(), BUCKET));
    /** 锌蒸气桶 */
    public static final DeferredItem<GasBucketItem> ZINC_VAPOR_BUCKET = ITEMS_REGISTER.register("zinc_vapor_bucket", () -> new GasBucketItem(ECGases.ZINC_VAPOR.get(), BUCKET));
    /** 镓蒸气桶 */
    public static final DeferredItem<GasBucketItem> GALLIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("gallium_vapor_bucket", () -> new GasBucketItem(ECGases.GALLIUM_VAPOR.get(), BUCKET));
    /** 锗蒸气桶 */
    public static final DeferredItem<GasBucketItem> GERMANIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("germanium_vapor_bucket", () -> new GasBucketItem(ECGases.GERMANIUM_VAPOR.get(), BUCKET));
    /** 砷蒸气桶 */
    public static final DeferredItem<GasBucketItem> ARSENIC_VAPOR_BUCKET = ITEMS_REGISTER.register("arsenic_vapor_bucket", () -> new GasBucketItem(ECGases.ARSENIC_VAPOR.get(), BUCKET));
    /** 硒蒸气桶 */
    public static final DeferredItem<GasBucketItem> SELENIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("selenium_vapor_bucket", () -> new GasBucketItem(ECGases.SELENIUM_VAPOR.get(), BUCKET));
    /** 溴蒸气桶 */
    public static final DeferredItem<GasBucketItem> BROMINE_VAPOR_BUCKET = ITEMS_REGISTER.register("bromine_vapor_bucket", () -> new GasBucketItem(ECGases.BROMINE_VAPOR.get(), BUCKET));
    /** 氪气桶 */
    public static final DeferredItem<GasBucketItem> KRYPTON_GAS_BUCKET = ITEMS_REGISTER.register("krypton_gas_bucket", () -> new GasBucketItem(ECGases.KRYPTON_GAS.get(), BUCKET));
    /** 铷蒸气桶 */
    public static final DeferredItem<GasBucketItem> RUBIDIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("rubidium_vapor_bucket", () -> new GasBucketItem(ECGases.RUBIDIUM_VAPOR.get(), BUCKET));
    /** 锶蒸气桶 */
    public static final DeferredItem<GasBucketItem> STRONTIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("strontium_vapor_bucket", () -> new GasBucketItem(ECGases.STRONTIUM_VAPOR.get(), BUCKET));
    /** 钇蒸气桶 */
    public static final DeferredItem<GasBucketItem> YTTRIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("yttrium_vapor_bucket", () -> new GasBucketItem(ECGases.YTTRIUM_VAPOR.get(), BUCKET));
    /** 锆蒸气桶 */
    public static final DeferredItem<GasBucketItem> ZIRCONIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("zirconium_vapor_bucket", () -> new GasBucketItem(ECGases.ZIRCONIUM_VAPOR.get(), BUCKET));
    /** 铌蒸气桶 */
    public static final DeferredItem<GasBucketItem> NIOBIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("niobium_vapor_bucket", () -> new GasBucketItem(ECGases.NIOBIUM_VAPOR.get(), BUCKET));
    /** 钼蒸气桶 */
    public static final DeferredItem<GasBucketItem> MOLYBDENUM_VAPOR_BUCKET = ITEMS_REGISTER.register("molybdenum_vapor_bucket", () -> new GasBucketItem(ECGases.MOLYBDENUM_VAPOR.get(), BUCKET));
    /** 锝蒸气桶 */
    public static final DeferredItem<GasBucketItem> TECHNETIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("technetium_vapor_bucket", () -> new GasBucketItem(ECGases.TECHNETIUM_VAPOR.get(), BUCKET));
    /** 钌蒸气桶 */
    public static final DeferredItem<GasBucketItem> RUTHENIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("ruthenium_vapor_bucket", () -> new GasBucketItem(ECGases.RUTHENIUM_VAPOR.get(), BUCKET));
    /** 铑蒸气桶 */
    public static final DeferredItem<GasBucketItem> RHODIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("rhodium_vapor_bucket", () -> new GasBucketItem(ECGases.RHODIUM_VAPOR.get(), BUCKET));
    /** 钯蒸气桶 */
    public static final DeferredItem<GasBucketItem> PALLADIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("palladium_vapor_bucket", () -> new GasBucketItem(ECGases.PALLADIUM_VAPOR.get(), BUCKET));
    /** 银蒸气桶 */
    public static final DeferredItem<GasBucketItem> SILVER_VAPOR_BUCKET = ITEMS_REGISTER.register("silver_vapor_bucket", () -> new GasBucketItem(ECGases.SILVER_VAPOR.get(), BUCKET));
    /** 镉蒸气桶 */
    public static final DeferredItem<GasBucketItem> CADMIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("cadmium_vapor_bucket", () -> new GasBucketItem(ECGases.CADMIUM_VAPOR.get(), BUCKET));
    /** 铟蒸气桶 */
    public static final DeferredItem<GasBucketItem> INDIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("indium_vapor_bucket", () -> new GasBucketItem(ECGases.INDIUM_VAPOR.get(), BUCKET));
    /** 锡蒸气桶 */
    public static final DeferredItem<GasBucketItem> TIN_VAPOR_BUCKET = ITEMS_REGISTER.register("tin_vapor_bucket", () -> new GasBucketItem(ECGases.TIN_VAPOR.get(), BUCKET));
    /** 锑蒸气桶 */
    public static final DeferredItem<GasBucketItem> ANTIMONY_VAPOR_BUCKET = ITEMS_REGISTER.register("antimony_vapor_bucket", () -> new GasBucketItem(ECGases.ANTIMONY_VAPOR.get(), BUCKET));
    /** 碲蒸气桶 */
    public static final DeferredItem<GasBucketItem> TELLURIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("tellurium_vapor_bucket", () -> new GasBucketItem(ECGases.TELLURIUM_VAPOR.get(), BUCKET));
    /** 碘蒸气桶 */
    public static final DeferredItem<GasBucketItem> IODINE_VAPOR_BUCKET = ITEMS_REGISTER.register("iodine_vapor_bucket", () -> new GasBucketItem(ECGases.IODINE_VAPOR.get(), BUCKET));
    /** 氙气桶 */
    public static final DeferredItem<GasBucketItem> XENON_GAS_BUCKET = ITEMS_REGISTER.register("xenon_gas_bucket", () -> new GasBucketItem(ECGases.XENON_GAS.get(), BUCKET));
    /** 铯蒸气桶 */
    public static final DeferredItem<GasBucketItem> CESIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("cesium_vapor_bucket", () -> new GasBucketItem(ECGases.CESIUM_VAPOR.get(), BUCKET));
    /** 钡蒸气桶 */
    public static final DeferredItem<GasBucketItem> BARIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("barium_vapor_bucket", () -> new GasBucketItem(ECGases.BARIUM_VAPOR.get(), BUCKET));
    /** 镧蒸气桶 */
    public static final DeferredItem<GasBucketItem> LANTHANUM_VAPOR_BUCKET = ITEMS_REGISTER.register("lanthanum_vapor_bucket", () -> new GasBucketItem(ECGases.LANTHANUM_VAPOR.get(), BUCKET));
    /** 铈蒸气桶 */
    public static final DeferredItem<GasBucketItem> CERIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("cerium_vapor_bucket", () -> new GasBucketItem(ECGases.CERIUM_VAPOR.get(), BUCKET));
    /** 镨蒸气桶 */
    public static final DeferredItem<GasBucketItem> PRASEODYMIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("praseodymium_vapor_bucket", () -> new GasBucketItem(ECGases.PRASEODYMIUM_VAPOR.get(), BUCKET));
    /** 钕蒸气桶 */
    public static final DeferredItem<GasBucketItem> NEODYMIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("neodymium_vapor_bucket", () -> new GasBucketItem(ECGases.NEODYMIUM_VAPOR.get(), BUCKET));
    /** 钷蒸气桶 */
    public static final DeferredItem<GasBucketItem> PROMETHIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("promethium_vapor_bucket", () -> new GasBucketItem(ECGases.PROMETHIUM_VAPOR.get(), BUCKET));
    /** 钐蒸气桶 */
    public static final DeferredItem<GasBucketItem> SAMARIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("samarium_vapor_bucket", () -> new GasBucketItem(ECGases.SAMARIUM_VAPOR.get(), BUCKET));
    /** 铕蒸气桶 */
    public static final DeferredItem<GasBucketItem> EUROPIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("europium_vapor_bucket", () -> new GasBucketItem(ECGases.EUROPIUM_VAPOR.get(), BUCKET));
    /** 钆蒸气桶 */
    public static final DeferredItem<GasBucketItem> GADOLINIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("gadolinium_vapor_bucket", () -> new GasBucketItem(ECGases.GADOLINIUM_VAPOR.get(), BUCKET));
    /** 铽蒸气桶 */
    public static final DeferredItem<GasBucketItem> TERBIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("terbium_vapor_bucket", () -> new GasBucketItem(ECGases.TERBIUM_VAPOR.get(), BUCKET));
    /** 镝蒸气桶 */
    public static final DeferredItem<GasBucketItem> DYSPROSIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("dysprosium_vapor_bucket", () -> new GasBucketItem(ECGases.DYSPROSIUM_VAPOR.get(), BUCKET));
    /** 钬蒸气桶 */
    public static final DeferredItem<GasBucketItem> HOLMIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("holmium_vapor_bucket", () -> new GasBucketItem(ECGases.HOLMIUM_VAPOR.get(), BUCKET));
    /** 铒蒸气桶 */
    public static final DeferredItem<GasBucketItem> ERBIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("erbium_vapor_bucket", () -> new GasBucketItem(ECGases.ERBIUM_VAPOR.get(), BUCKET));
    /** 铥蒸气桶 */
    public static final DeferredItem<GasBucketItem> THULIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("thulium_vapor_bucket", () -> new GasBucketItem(ECGases.THULIUM_VAPOR.get(), BUCKET));
    /** 镱蒸气桶 */
    public static final DeferredItem<GasBucketItem> YTTERBIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("ytterbium_vapor_bucket", () -> new GasBucketItem(ECGases.YTTERBIUM_VAPOR.get(), BUCKET));
    /** 镥蒸气桶 */
    public static final DeferredItem<GasBucketItem> LUTETIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("lutetium_vapor_bucket", () -> new GasBucketItem(ECGases.LUTETIUM_VAPOR.get(), BUCKET));
    /** 铪蒸气桶 */
    public static final DeferredItem<GasBucketItem> HAFNIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("hafnium_vapor_bucket", () -> new GasBucketItem(ECGases.HAFNIUM_VAPOR.get(), BUCKET));
    /** 钽蒸气桶 */
    public static final DeferredItem<GasBucketItem> TANTALUM_VAPOR_BUCKET = ITEMS_REGISTER.register("tantalum_vapor_bucket", () -> new GasBucketItem(ECGases.TANTALUM_VAPOR.get(), BUCKET));
    /** 钨蒸气桶 */
    public static final DeferredItem<GasBucketItem> TUNGSTEN_VAPOR_BUCKET = ITEMS_REGISTER.register("tungsten_vapor_bucket", () -> new GasBucketItem(ECGases.TUNGSTEN_VAPOR.get(), BUCKET));
    /** 铼蒸气桶 */
    public static final DeferredItem<GasBucketItem> RHENIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("rhenium_vapor_bucket", () -> new GasBucketItem(ECGases.RHENIUM_VAPOR.get(), BUCKET));
    /** 锇蒸气桶 */
    public static final DeferredItem<GasBucketItem> OSMIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("osmium_vapor_bucket", () -> new GasBucketItem(ECGases.OSMIUM_VAPOR.get(), BUCKET));
    /** 铱蒸气桶 */
    public static final DeferredItem<GasBucketItem> IRIDIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("iridium_vapor_bucket", () -> new GasBucketItem(ECGases.IRIDIUM_VAPOR.get(), BUCKET));
    /** 铂蒸气桶 */
    public static final DeferredItem<GasBucketItem> PLATINUM_VAPOR_BUCKET = ITEMS_REGISTER.register("platinum_vapor_bucket", () -> new GasBucketItem(ECGases.PLATINUM_VAPOR.get(), BUCKET));
    /** 金蒸气桶 */
    public static final DeferredItem<GasBucketItem> GOLD_VAPOR_BUCKET = ITEMS_REGISTER.register("gold_vapor_bucket", () -> new GasBucketItem(ECGases.GOLD_VAPOR.get(), BUCKET));
    /** 汞蒸气桶 */
    public static final DeferredItem<GasBucketItem> MERCURY_VAPOR_BUCKET = ITEMS_REGISTER.register("mercury_vapor_bucket", () -> new GasBucketItem(ECGases.MERCURY_VAPOR.get(), BUCKET));
    /** 铊蒸气桶 */
    public static final DeferredItem<GasBucketItem> THALLIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("thallium_vapor_bucket", () -> new GasBucketItem(ECGases.THALLIUM_VAPOR.get(), BUCKET));
    /** 铅蒸气桶 */
    public static final DeferredItem<GasBucketItem> LEAD_VAPOR_BUCKET = ITEMS_REGISTER.register("lead_vapor_bucket", () -> new GasBucketItem(ECGases.LEAD_VAPOR.get(), BUCKET));
    /** 铋蒸气桶 */
    public static final DeferredItem<GasBucketItem> BISMUTH_VAPOR_BUCKET = ITEMS_REGISTER.register("bismuth_vapor_bucket", () -> new GasBucketItem(ECGases.BISMUTH_VAPOR.get(), BUCKET));
    /** 钋蒸气桶 */
    public static final DeferredItem<GasBucketItem> POLONIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("polonium_vapor_bucket", () -> new GasBucketItem(ECGases.POLONIUM_VAPOR.get(), BUCKET));
    /** 砹蒸气桶 */
    public static final DeferredItem<GasBucketItem> ASTATINE_VAPOR_BUCKET = ITEMS_REGISTER.register("astatine_vapor_bucket", () -> new GasBucketItem(ECGases.ASTATINE_VAPOR.get(), BUCKET));
    /** 氡气桶 */
    public static final DeferredItem<GasBucketItem> RADON_GAS_BUCKET = ITEMS_REGISTER.register("radon_gas_bucket", () -> new GasBucketItem(ECGases.RADON_GAS.get(), BUCKET));
    /** 钫蒸气桶 */
    public static final DeferredItem<GasBucketItem> FRANCIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("francium_vapor_bucket", () -> new GasBucketItem(ECGases.FRANCIUM_VAPOR.get(), BUCKET));
    /** 镭蒸气桶 */
    public static final DeferredItem<GasBucketItem> RADIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("radium_vapor_bucket", () -> new GasBucketItem(ECGases.RADIUM_VAPOR.get(), BUCKET));
    /** 锕蒸气桶 */
    public static final DeferredItem<GasBucketItem> ACTINIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("actinium_vapor_bucket", () -> new GasBucketItem(ECGases.ACTINIUM_VAPOR.get(), BUCKET));
    /** 钍蒸气桶 */
    public static final DeferredItem<GasBucketItem> THORIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("thorium_vapor_bucket", () -> new GasBucketItem(ECGases.THORIUM_VAPOR.get(), BUCKET));
    /** 镤蒸气桶 */
    public static final DeferredItem<GasBucketItem> PROTACTINIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("protactinium_vapor_bucket", () -> new GasBucketItem(ECGases.PROTACTINIUM_VAPOR.get(), BUCKET));
    /** 铀蒸气桶 */
    public static final DeferredItem<GasBucketItem> URANIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("uranium_vapor_bucket", () -> new GasBucketItem(ECGases.URANIUM_VAPOR.get(), BUCKET));
    /** 镎蒸气桶 */
    public static final DeferredItem<GasBucketItem> NEPTUNIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("neptunium_vapor_bucket", () -> new GasBucketItem(ECGases.NEPTUNIUM_VAPOR.get(), BUCKET));
    /** 钚蒸气桶 */
    public static final DeferredItem<GasBucketItem> PLUTONIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("plutonium_vapor_bucket", () -> new GasBucketItem(ECGases.PLUTONIUM_VAPOR.get(), BUCKET));
    /** 镅蒸气桶 */
    public static final DeferredItem<GasBucketItem> AMERICIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("americium_vapor_bucket", () -> new GasBucketItem(ECGases.AMERICIUM_VAPOR.get(), BUCKET));
    /** 锔蒸气桶 */
    public static final DeferredItem<GasBucketItem> CURIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("curium_vapor_bucket", () -> new GasBucketItem(ECGases.CURIUM_VAPOR.get(), BUCKET));
    /** 锫蒸气桶 */
    public static final DeferredItem<GasBucketItem> BERKELIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("berkelium_vapor_bucket", () -> new GasBucketItem(ECGases.BERKELIUM_VAPOR.get(), BUCKET));
    /** 锎蒸气桶 */
    public static final DeferredItem<GasBucketItem> CALIFORNIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("californium_vapor_bucket", () -> new GasBucketItem(ECGases.CALIFORNIUM_VAPOR.get(), BUCKET));
    /** 锿蒸气桶 */
    public static final DeferredItem<GasBucketItem> EINSTEINIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("einsteinium_vapor_bucket", () -> new GasBucketItem(ECGases.EINSTEINIUM_VAPOR.get(), BUCKET));
    /** 镄蒸气桶 */
    public static final DeferredItem<GasBucketItem> FERMIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("fermium_vapor_bucket", () -> new GasBucketItem(ECGases.FERMIUM_VAPOR.get(), BUCKET));
    /** 钔蒸气桶 */
    public static final DeferredItem<GasBucketItem> MENDELEVIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("mendelevium_vapor_bucket", () -> new GasBucketItem(ECGases.MENDELEVIUM_VAPOR.get(), BUCKET));
    /** 锘蒸气桶 */
    public static final DeferredItem<GasBucketItem> NOBELIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("nobelium_vapor_bucket", () -> new GasBucketItem(ECGases.NOBELIUM_VAPOR.get(), BUCKET));
    /** 铹蒸气桶 */
    public static final DeferredItem<GasBucketItem> LAWRENCIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("lawrencium_vapor_bucket", () -> new GasBucketItem(ECGases.LAWRENCIUM_VAPOR.get(), BUCKET));
    /** 𬬻蒸气桶 */
    public static final DeferredItem<GasBucketItem> RUTHERFORDIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("rutherfordium_vapor_bucket", () -> new GasBucketItem(ECGases.RUTHERFORDIUM_VAPOR.get(), BUCKET));
    /** 𬭊蒸气桶 */
    public static final DeferredItem<GasBucketItem> DUBNIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("dubnium_vapor_bucket", () -> new GasBucketItem(ECGases.DUBNIUM_VAPOR.get(), BUCKET));
    /** 𬭳蒸气桶 */
    public static final DeferredItem<GasBucketItem> SEABORGIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("seaborgium_vapor_bucket", () -> new GasBucketItem(ECGases.SEABORGIUM_VAPOR.get(), BUCKET));
    /** 𬭛蒸气桶 */
    public static final DeferredItem<GasBucketItem> BOHRIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("bohrium_vapor_bucket", () -> new GasBucketItem(ECGases.BOHRIUM_VAPOR.get(), BUCKET));
    /** 𬭶蒸气桶 */
    public static final DeferredItem<GasBucketItem> HASSIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("hassium_vapor_bucket", () -> new GasBucketItem(ECGases.HASSIUM_VAPOR.get(), BUCKET));
    /** 鿏蒸气桶 */
    public static final DeferredItem<GasBucketItem> MEITNERIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("meitnerium_vapor_bucket", () -> new GasBucketItem(ECGases.MEITNERIUM_VAPOR.get(), BUCKET));
    /** 𫟼蒸气桶 */
    public static final DeferredItem<GasBucketItem> DARMSTADTIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("darmstadtium_vapor_bucket", () -> new GasBucketItem(ECGases.DARMSTADTIUM_VAPOR.get(), BUCKET));
    /** 𬬭蒸气桶 */
    public static final DeferredItem<GasBucketItem> ROENTGENIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("roentgenium_vapor_bucket", () -> new GasBucketItem(ECGases.ROENTGENIUM_VAPOR.get(), BUCKET));
    /** 鿔蒸气桶 */
    public static final DeferredItem<GasBucketItem> COPERNICIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("copernicium_vapor_bucket", () -> new GasBucketItem(ECGases.COPERNICIUM_VAPOR.get(), BUCKET));
    /** 鿭蒸气桶 */
    public static final DeferredItem<GasBucketItem> NIHONIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("nihonium_vapor_bucket", () -> new GasBucketItem(ECGases.NIHONIUM_VAPOR.get(), BUCKET));
    /** 𫓧蒸气桶 */
    public static final DeferredItem<GasBucketItem> FLEROVIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("flerovium_vapor_bucket", () -> new GasBucketItem(ECGases.FLEROVIUM_VAPOR.get(), BUCKET));
    /** 镆蒸气桶 */
    public static final DeferredItem<GasBucketItem> MOSCOVIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("moscovium_vapor_bucket", () -> new GasBucketItem(ECGases.MOSCOVIUM_VAPOR.get(), BUCKET));
    /** 𫟷蒸气桶 */
    public static final DeferredItem<GasBucketItem> LIVERMORIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("livermorium_vapor_bucket", () -> new GasBucketItem(ECGases.LIVERMORIUM_VAPOR.get(), BUCKET));
    /** 鿬蒸气桶 */
    public static final DeferredItem<GasBucketItem> TENNESSINE_VAPOR_BUCKET = ITEMS_REGISTER.register("tennessine_vapor_bucket", () -> new GasBucketItem(ECGases.TENNESSINE_VAPOR.get(), BUCKET));
    /** 鿫气桶 */
    public static final DeferredItem<GasBucketItem> OGANESSON_GAS_BUCKET = ITEMS_REGISTER.register("oganesson_gas_bucket", () -> new GasBucketItem(ECGases.OGANESSON_GAS.get(), BUCKET));
    /** 鑨蒸气桶 */
    public static final DeferredItem<GasBucketItem> LONGIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("longium_vapor_bucket", () -> new GasBucketItem(ECGases.LONGIUM_VAPOR.get(), BUCKET));
    /** 镾蒸气桶 */
    public static final DeferredItem<GasBucketItem> MYSTERIUM_VAPOR_BUCKET = ITEMS_REGISTER.register("mysterium_vapor_bucket", () -> new GasBucketItem(ECGases.MYSTERIUM_VAPOR.get(), BUCKET));

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