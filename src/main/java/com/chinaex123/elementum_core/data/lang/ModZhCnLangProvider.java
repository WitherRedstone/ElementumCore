package com.chinaex123.elementum_core.data.lang;

import net.minecraft.data.PackOutput;

public class ModZhCnLangProvider extends ModLangProvider {

    public ModZhCnLangProvider(PackOutput output) {
        super(output, "zh_cn");
    }

    // ==================== 数据表 ====================
    @Override protected String[][] elements() {
        return ELEMENTS;
    }
    @Override protected String[][] minerals() {
        return MINERALS;
    }

    // ==================== 翻译模板 ====================
    @Override protected String gasCylinder()    { return "气瓶"; }
    @Override protected String ingot(String e)  { return e + "锭"; }
    @Override protected String nugget(String e) { return e + "粒"; }
    @Override protected String dust(String e)   { return e + "粉"; }
    @Override protected String plate(String e)  { return e + "板"; }
    @Override protected String rod(String e)    { return e + "棒"; }
    @Override protected String wire(String e)   { return e + "线"; }
    @Override protected String gear(String e)   { return e + "齿轮"; }
    @Override protected String crushedRaw(String e) { return "粉碎的粗" + e; }
    @Override protected String raw(String e)    { return "粗" + e; }
    @Override protected String cylinder(String e)   { return e + "气瓶"; }

    @Override protected String block(String e)  { return e + "块"; }
    @Override protected String rawBlock(String e)   { return "粗" + e + "块"; }
    @Override protected String ore(String e)    { return e + "矿石"; }
    @Override protected String deepslateOre(String e)   { return "深层" + e + "矿石"; }
    @Override protected String netherOre(String e)  { return "下界" + e + "矿石"; }
    @Override protected String endOre(String e) { return "末地" + e + "矿石"; }

    @Override protected String fluid(String e)  { return e; }
    @Override protected String bucket(String e) { return e + "桶"; }
    @Override protected String fluidBlock(String e) { return e; }

    @Override protected String gas(String e)    { return e; }
    @Override protected String gasBucket(String e)  { return e + "气桶"; }
    @Override protected String gasBlock(String e)   { return e + "气"; }

    @Override protected String mineral(String m)    { return m; }
    @Override protected String deepslateMineral(String m)   { return "深层" + m; }
    @Override protected String netherMineral(String m)  { return "下界" + m; }
    @Override protected String endMineral(String m) { return "末地" + m; }

    @Override protected String tabMaterial()    { return "化学元素核心：材料"; }
    @Override protected String tabItems()   { return "化学元素核心：元素物品"; }
    @Override protected String tabBlocks()  { return "化学元素核心：元素方块"; }
    @Override protected String tabFluids()  { return "化学元素核心：元素流体"; }
    @Override protected String tabGases()   { return "化学元素核心：元素气体"; }

    // ==================== 数据 ====================
    private static final String[][] ELEMENTS = {
            {"hydrogen", "氢"}, {"helium", "氦"}, {"lithium", "锂"}, {"beryllium", "铍"},
            {"boron", "硼"}, {"carbon", "碳"}, {"nitrogen", "氮"}, {"oxygen", "氧"},
            {"fluorine", "氟"}, {"neon", "氖"}, {"sodium", "钠"}, {"magnesium", "镁"},
            {"aluminum", "铝"}, {"silicon", "硅"}, {"phosphorus", "磷"}, {"sulfur", "硫"},
            {"chlorine", "氯"}, {"argon", "氩"}, {"potassium", "钾"}, {"calcium", "钙"},
            {"scandium", "钪"}, {"titanium", "钛"}, {"vanadium", "钒"}, {"chromium", "铬"},
            {"manganese", "锰"}, {"iron", "铁"}, {"cobalt", "钴"}, {"nickel", "镍"},
            {"copper", "铜"}, {"zinc", "锌"}, {"gallium", "镓"}, {"germanium", "锗"},
            {"arsenic", "砷"}, {"selenium", "硒"}, {"bromine", "溴"}, {"krypton", "氪"},
            {"rubidium", "铷"}, {"strontium", "锶"}, {"yttrium", "钇"}, {"zirconium", "锆"},
            {"niobium", "铌"}, {"molybdenum", "钼"}, {"technetium", "锝"}, {"ruthenium", "钌"},
            {"rhodium", "铑"}, {"palladium", "钯"}, {"silver", "银"}, {"cadmium", "镉"},
            {"indium", "铟"}, {"tin", "锡"}, {"antimony", "锑"}, {"tellurium", "碲"},
            {"iodine", "碘"}, {"xenon", "氙"}, {"cesium", "铯"}, {"barium", "钡"},
            {"lanthanum", "镧"}, {"cerium", "铈"}, {"praseodymium", "镨"}, {"neodymium", "钕"},
            {"promethium", "钷"}, {"samarium", "钐"}, {"europium", "铕"}, {"gadolinium", "钆"},
            {"terbium", "铽"}, {"dysprosium", "镝"}, {"holmium", "钬"}, {"erbium", "铒"},
            {"thulium", "铥"}, {"ytterbium", "镱"}, {"lutetium", "镥"}, {"hafnium", "铪"},
            {"tantalum", "钽"}, {"tungsten", "钨"}, {"rhenium", "铼"}, {"osmium", "锇"},
            {"iridium", "铱"}, {"platinum", "铂"}, {"gold", "金"}, {"hydrargyrum", "汞"},
            {"thallium", "铊"}, {"lead", "铅"}, {"bismuth", "铋"}, {"polonium", "钋"},
            {"astatine", "砹"}, {"radon", "氡"}, {"francium", "钫"}, {"radium", "镭"},
            {"actinium", "锕"}, {"thorium", "钍"}, {"protactinium", "镤"}, {"uranium", "铀"},
            {"neptunium", "镎"}, {"plutonium", "钚"}, {"americium", "镅"}, {"curium", "锔"},
            {"berkelium", "锫"}, {"californium", "锎"}, {"einsteinium", "锿"}, {"fermium", "镄"},
            {"mendelevium", "钔"}, {"nobelium", "锘"}, {"lawrencium", "铹"},
            {"rutherfordium", "𬬻"}, {"dubnium", "𬭊"}, {"seaborgium", "𬭳"}, {"bohrium", "𬭛"},
            {"hassium", "𬭶"}, {"meitnerium", "鿏"}, {"darmstadtium", "𫟼"}, {"roentgenium", "𬬭"},
            {"copernicium", "鿔"}, {"nihonium", "鉨"}, {"flerovium", "鈇"}, {"moscovium", "镆"},
            {"livermorium", "鉝"}, {"tennessine", "鿬"}, {"oganesson", "鿫"}, {"longium", "鑨"},
            {"mysterium", "镾"}
    };

    private static final String[][] MINERALS = {
            {"lepidolite", "锂云母"},
            {"beryl", "绿柱石"},
            {"borax", "硼砂"},
            {"magnesite", "菱镁矿"},
            {"nitre", "硝石"},
            {"apatite", "磷灰石"},
            {"monazite", "独居石"},
            {"cinnabar", "朱砂"},
            {"sylvite", "钾石盐"},
            {"thortveitite", "钪钇石"},
            {"ilmenite", "钛铁矿"},
            {"patronite", "绿硫钒矿"},
            {"chromite", "铬铁矿"},
            {"pyrolusite", "软锰矿"},
            {"argyrodite", "硫锗矿"},
            {"arsenopyrite", "毒砂"},
            {"carnallite", "光卤石"},
            {"celestine", "天青石"},
            {"cobaltite", "辉钴矿"},
            {"zircon", "锆英砂"},
            {"niobite", "铌铁矿"},
            {"molybdenite", "辉钼矿"},
            {"stibnite", "辉锑矿"},
            {"pollucite", "铯沸石"},
            {"barite", "重晶石"},
            {"pyrite", "黄铁矿"}
    };
}