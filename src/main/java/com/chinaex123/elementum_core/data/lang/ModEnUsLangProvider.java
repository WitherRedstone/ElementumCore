package com.chinaex123.elementum_core.data.lang;

import net.minecraft.data.PackOutput;

public class ModEnUsLangProvider extends ModLangProvider {

    public ModEnUsLangProvider(PackOutput output) {
        super(output, "en_us");
    }

    // ==================== 数据表 ====================
    @Override protected String[][] elements() {
        return ELEMENTS;
    }

    @Override protected String[][] minerals() {
        return MINERALS;
    }

    // ==================== 翻译模板 ====================
    @Override protected String liquidFluidPrefix() { return "Liquid "; }

    @Override protected String gasCylinder()    { return "Gas Cylinder"; }
    @Override protected String ingot(String e)  { return e + " Ingot"; }
    @Override protected String nugget(String e) { return e + " Nugget"; }
    @Override protected String dust(String e)   { return e + " Dust"; }
    @Override protected String plate(String e)  { return e + " Plate"; }
    @Override protected String rod(String e)    { return e + " Rod"; }
    @Override protected String wire(String e)   { return e + " Wire"; }
    @Override protected String gear(String e)   { return e + " Gear"; }
    @Override protected String crushedRaw(String e) { return "Crushed Raw " + e; }
    @Override protected String raw(String e)    { return "Raw " + e; }
    @Override protected String cylinder(String e)   { return e + " Cylinder"; }

    @Override protected String block(String e)  { return "Block of " + e; }
    @Override protected String rawBlock(String e)   { return "Block of Raw " + e; }
    @Override protected String ore(String e)    { return e + " Ore"; }
    @Override protected String deepslateOre(String e)   { return "Deepslate " + e + " Ore"; }
    @Override protected String netherOre(String e)  { return "Nether " + e + " Ore"; }
    @Override protected String endOre(String e) { return "End " + e + " Ore"; }

    @Override protected String fluid(String e)  { return e; }
    @Override protected String bucket(String e) { return e + " Bucket"; }
    @Override protected String fluidBlock(String e) { return e; }

    @Override protected String gas(String e)    { return e; }
    @Override protected String gasBucket(String e)  { return e + " Gas Bucket"; }
    @Override protected String gasBlock(String e)   { return e + " Gas"; }

    @Override protected String mineral(String m)    { return m; }
    @Override protected String deepslateMineral(String m)   { return "Deepslate " + m; }
    @Override protected String netherMineral(String m)  { return "Nether " + m; }
    @Override protected String endMineral(String m) { return "End " + m; }

    @Override protected String tabMaterial()    { return "Elementum Core: Element"; }
    @Override protected String tabItems()   { return "Elementum Core: Element Items"; }
    @Override protected String tabBlocks()  { return "Elementum Core: Element Blocks"; }
    @Override protected String tabFluids()  { return "Elementum Core: Element Fluids"; }
    @Override protected String tabGases()   { return "Elementum Core: Element Gases"; }

    // ==================== 数据 ====================
    private static final String[][] ELEMENTS = {
            {"hydrogen", "Hydrogen"}, {"helium", "Helium"}, {"lithium", "Lithium"}, {"beryllium", "Beryllium"},
            {"boron", "Boron"}, {"carbon", "Carbon"}, {"nitrogen", "Nitrogen"}, {"oxygen", "Oxygen"},
            {"fluorine", "Fluorine"}, {"neon", "Neon"}, {"sodium", "Sodium"}, {"magnesium", "Magnesium"},
            {"aluminum", "Aluminum"}, {"silicon", "Silicon"}, {"phosphorus", "Phosphorus"}, {"sulfur", "Sulfur"},
            {"chlorine", "Chlorine"}, {"argon", "Argon"}, {"potassium", "Potassium"}, {"calcium", "Calcium"},
            {"scandium", "Scandium"}, {"titanium", "Titanium"}, {"vanadium", "Vanadium"}, {"chromium", "Chromium"},
            {"manganese", "Manganese"}, {"iron", "Iron"}, {"cobalt", "Cobalt"}, {"nickel", "Nickel"},
            {"copper", "Copper"}, {"zinc", "Zinc"}, {"gallium", "Gallium"}, {"germanium", "Germanium"},
            {"arsenic", "Arsenic"}, {"selenium", "Selenium"}, {"bromine", "Bromine"}, {"krypton", "Krypton"},
            {"rubidium", "Rubidium"}, {"strontium", "Strontium"}, {"yttrium", "Yttrium"}, {"zirconium", "Zirconium"},
            {"niobium", "Niobium"}, {"molybdenum", "Molybdenum"}, {"technetium", "Technetium"}, {"ruthenium", "Ruthenium"},
            {"rhodium", "Rhodium"}, {"palladium", "Palladium"}, {"silver", "Silver"}, {"cadmium", "Cadmium"},
            {"indium", "Indium"}, {"tin", "Tin"}, {"antimony", "Antimony"}, {"tellurium", "Tellurium"},
            {"iodine", "Iodine"}, {"xenon", "Xenon"}, {"cesium", "Cesium"}, {"barium", "Barium"},
            {"lanthanum", "Lanthanum"}, {"cerium", "Cerium"}, {"praseodymium", "Praseodymium"}, {"neodymium", "Neodymium"},
            {"promethium", "Promethium"}, {"samarium", "Samarium"}, {"europium", "Europium"}, {"gadolinium", "Gadolinium"},
            {"terbium", "Terbium"}, {"dysprosium", "Dysprosium"}, {"holmium", "Holmium"}, {"erbium", "Erbium"},
            {"thulium", "Thulium"}, {"ytterbium", "Ytterbium"}, {"lutetium", "Lutetium"}, {"hafnium", "Hafnium"},
            {"tantalum", "Tantalum"}, {"tungsten", "Tungsten"}, {"rhenium", "Rhenium"}, {"osmium", "Osmium"},
            {"iridium", "Iridium"}, {"platinum", "Platinum"}, {"gold", "Gold"}, {"mercury", "Mercury"},
            {"thallium", "Thallium"}, {"lead", "Lead"}, {"bismuth", "Bismuth"}, {"polonium", "Polonium"},
            {"astatine", "Astatine"}, {"radon", "Radon"}, {"francium", "Francium"}, {"radium", "Radium"},
            {"actinium", "Actinium"}, {"thorium", "Thorium"}, {"protactinium", "Protactinium"}, {"uranium", "Uranium"},
            {"neptunium", "Neptunium"}, {"plutonium", "Plutonium"}, {"americium", "Americium"}, {"curium", "Curium"},
            {"berkelium", "Berkelium"}, {"californium", "Californium"}, {"einsteinium", "Einsteinium"}, {"fermium", "Fermium"},
            {"mendelevium", "Mendelevium"}, {"nobelium", "Nobelium"}, {"lawrencium", "Lawrencium"},
            {"rutherfordium", "Rutherfordium"}, {"dubnium", "Dubnium"}, {"seaborgium", "Seaborgium"}, {"bohrium", "Bohrium"},
            {"hassium", "Hassium"}, {"meitnerium", "Meitnerium"}, {"darmstadtium", "Darmstadtium"}, {"roentgenium", "Roentgenium"},
            {"copernicium", "Copernicium"}, {"nihonium", "Nihonium"}, {"flerovium", "Flerovium"}, {"moscovium", "Moscovium"},
            {"livermorium", "Livermorium"}, {"tennessine", "Tennessine"}, {"oganesson", "Oganesson"},
            {"longium", "Longium"}, {"mysterium", "Mysterium"}
    };

    private static final String[][] MINERALS = {
            {"lepidolite", "Lepidolite"},
            {"beryl", "Beryl"},
            {"borax", "Borax"},
            {"magnesite", "Magnesite"},
            {"nitre", "Niter"},
            {"apatite", "Apatite"},
            {"monazite", "Monazite"},
            {"cinnabar", "Cinnabar"},
            {"sylvite", "Sylvite"},
            {"thortveitite", "Thortveitite"},
            {"ilmenite", "Ilmenite"},
            {"patronite", "Patronite"},
            {"chromite", "Chromite"},
            {"pyrolusite", "Pyrolusite"},
            {"argyrodite", "Argyrodite"},
            {"arsenopyrite", "Arsenopyrite"},
            {"carnallite", "Carnallite"},
            {"celestine", "Celestine"},
            {"cobaltite", "Cobaltite"},
            {"zircon", "Zircon"},
            {"niobite", "Niobite"},
            {"molybdenite", "Molybdenite"},
            {"stibnite", "Stibnite"},
            {"pollucite", "Pollucite"},
            {"barite", "Barite"},
            {"pyrite", "Pyrite"}
    };
}