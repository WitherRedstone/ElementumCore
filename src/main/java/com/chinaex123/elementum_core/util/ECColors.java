package com.chinaex123.elementum_core.util;

public class ECColors {
    private ECColors() {}

    /**
     * 雾色 + 雾距离。
     *
     * @param color    雾色
     * @param distance 雾完全遮住的距离
     */
    public record Fog(int color, float distance) {}

    public static final Fog HYDROGEN_FOG = new Fog(0xC9E4F7, 2.0f); // 氢
    public static final Fog HELIUM_FOG   = new Fog(0xC9E4F7, 2.0f); // 氦
    public static final Fog LITHIUM_FOG  = new Fog(0xC9E4F7, 2.0f); // 锂
    public static final Fog BERYLLIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 铍
    public static final Fog BORON_FOG    = new Fog(0xC9E4F7, 2.0f); // 硼
    public static final Fog CARBON_FOG   = new Fog(0xC9E4F7, 2.0f); // 碳
    public static final Fog NITROGEN_FOG = new Fog(0xC9E4F7, 2.0f); // 氮
    public static final Fog OXYGEN_FOG   = new Fog(0x9CCCF8, 2.0f); // 氧
    public static final Fog FLUORINE_FOG = new Fog(0xC9E4F7, 2.0f); // 氟
    public static final Fog NEON_FOG     = new Fog(0xC9E4F7, 2.0f); // 氖
    public static final Fog SODIUM_FOG   = new Fog(0xC9E4F7, 2.0f); // 钠
    public static final Fog MAGNESIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 镁
    public static final Fog ALUMINUM_FOG = new Fog(0xC9E4F7, 2.0f); // 铝
    public static final Fog SILICON_FOG  = new Fog(0xC9E4F7, 2.0f); // 硅
    public static final Fog PHOSPHORUS_FOG = new Fog(0xC9E4F7, 2.0f); // 磷
    public static final Fog SULFUR_FOG   = new Fog(0xC9E4F7, 2.0f); // 硫
    public static final Fog CHLORINE_FOG = new Fog(0xC9E4F7, 2.0f); // 氯
    public static final Fog ARGON_FOG    = new Fog(0xC9E4F7, 2.0f); // 氩
    public static final Fog POTASSIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 钾
    public static final Fog CALCIUM_FOG  = new Fog(0xC9E4F7, 2.0f); // 钙
    public static final Fog SCANDIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 钪
    public static final Fog TITANIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 钛
    public static final Fog VANADIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 钒
    public static final Fog CHROMIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 铬
    public static final Fog MANGANESE_FOG = new Fog(0xC9E4F7, 2.0f); // 锰
    public static final Fog IRON_FOG     = new Fog(0xC9E4F7, 2.0f); // 铁
    public static final Fog COBALT_FOG   = new Fog(0xC9E4F7, 2.0f); // 钴
    public static final Fog NICKEL_FOG   = new Fog(0xC9E4F7, 2.0f); // 镍
    public static final Fog COPPER_FOG   = new Fog(0xC9E4F7, 2.0f); // 铜
    public static final Fog ZINC_FOG     = new Fog(0xC9E4F7, 2.0f); // 锌
    public static final Fog GALLIUM_FOG  = new Fog(0xC9E4F7, 2.0f); // 镓
    public static final Fog GERMANIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 锗
    public static final Fog ARSENIC_FOG  = new Fog(0xC9E4F7, 2.0f); // 砷
    public static final Fog SELENIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 硒
    public static final Fog BROMINE_FOG  = new Fog(0xC9E4F7, 2.0f); // 溴
    public static final Fog KRYPTON_FOG  = new Fog(0xC9E4F7, 2.0f); // 氪
    public static final Fog RUBIDIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 铷
    public static final Fog STRONTIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 锶
    public static final Fog YTTRIUM_FOG  = new Fog(0xC9E4F7, 2.0f); // 钇
    public static final Fog ZIRCONIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 锆
    public static final Fog NIOBIUM_FOG  = new Fog(0xC9E4F7, 2.0f); // 铌
    public static final Fog MOLYBDENUM_FOG = new Fog(0xC9E4F7, 2.0f); // 钼
    public static final Fog TECHNETIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 锝
    public static final Fog RUTHENIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 钌
    public static final Fog RHODIUM_FOG  = new Fog(0xC9E4F7, 2.0f); // 铑
    public static final Fog PALLADIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 钯
    public static final Fog SILVER_FOG   = new Fog(0xC9E4F7, 2.0f); // 银
    public static final Fog CADMIUM_FOG  = new Fog(0xC9E4F7, 2.0f); // 镉
    public static final Fog INDIUM_FOG   = new Fog(0xC9E4F7, 2.0f); // 铟
    public static final Fog TIN_FOG      = new Fog(0xC9E4F7, 2.0f); // 锡
    public static final Fog ANTIMONY_FOG = new Fog(0xC9E4F7, 2.0f); // 锑
    public static final Fog TELLURIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 碲
    public static final Fog IODINE_FOG   = new Fog(0xC9E4F7, 2.0f); // 碘
    public static final Fog XENON_FOG    = new Fog(0xC9E4F7, 2.0f); // 氙
    public static final Fog CESIUM_FOG   = new Fog(0xC9E4F7, 2.0f); // 铯
    public static final Fog BARIUM_FOG   = new Fog(0xC9E4F7, 2.0f); // 钡
    public static final Fog LANTHANUM_FOG = new Fog(0xC9E4F7, 2.0f); // 镧
    public static final Fog CERIUM_FOG   = new Fog(0xC9E4F7, 2.0f); // 铈
    public static final Fog PRASEODYMIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 镨
    public static final Fog NEODYMIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 钕
    public static final Fog PROMETHIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 钷
    public static final Fog SAMARIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 钐
    public static final Fog EUROPIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 铕
    public static final Fog GADOLINIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 钆
    public static final Fog TERBIUM_FOG  = new Fog(0xC9E4F7, 2.0f); // 铽
    public static final Fog DYSPROSIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 镝
    public static final Fog HOLMIUM_FOG  = new Fog(0xC9E4F7, 2.0f); // 钬
    public static final Fog ERBIUM_FOG   = new Fog(0xC9E4F7, 2.0f); // 铒
    public static final Fog THULIUM_FOG  = new Fog(0xC9E4F7, 2.0f); // 铥
    public static final Fog YTTERBIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 镱
    public static final Fog LUTETIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 镥
    public static final Fog HAFNIUM_FOG  = new Fog(0xC9E4F7, 2.0f); // 铪
    public static final Fog TANTALUM_FOG = new Fog(0xC9E4F7, 2.0f); // 钽
    public static final Fog TUNGSTEN_FOG = new Fog(0xC9E4F7, 2.0f); // 钨
    public static final Fog RHENIUM_FOG  = new Fog(0xC9E4F7, 2.0f); // 铼
    public static final Fog OSMIUM_FOG   = new Fog(0xC9E4F7, 2.0f); // 锇
    public static final Fog IRIDIUM_FOG  = new Fog(0xC9E4F7, 2.0f); // 铱
    public static final Fog PLATINUM_FOG = new Fog(0xC9E4F7, 2.0f); // 铂
    public static final Fog GOLD_FOG     = new Fog(0xC9E4F7, 2.0f); // 金
    public static final Fog HYDRARGYRUM_FOG = new Fog(0xC9E4F7, 2.0f); // 汞
    public static final Fog THALLIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 铊
    public static final Fog LEAD_FOG     = new Fog(0xC9E4F7, 2.0f); // 铅
    public static final Fog BISMUTH_FOG  = new Fog(0xC9E4F7, 2.0f); // 铋
    public static final Fog POLONIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 钋
    public static final Fog ASTATINE_FOG = new Fog(0xC9E4F7, 2.0f); // 砹
    public static final Fog RADON_FOG    = new Fog(0xC9E4F7, 2.0f); // 氡
    public static final Fog FRANCIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 钫
    public static final Fog RADIUM_FOG   = new Fog(0xC9E4F7, 2.0f); // 镭
    public static final Fog ACTINIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 锕
    public static final Fog THORIUM_FOG  = new Fog(0xC9E4F7, 2.0f); // 钍
    public static final Fog PROTACTINIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 镤
    public static final Fog URANIUM_FOG  = new Fog(0xC9E4F7, 2.0f); // 铀
    public static final Fog NEPTUNIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 镎
    public static final Fog PLUTONIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 钚
    public static final Fog AMERICIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 镅
    public static final Fog CURIUM_FOG   = new Fog(0xC9E4F7, 2.0f); // 锔
    public static final Fog BERKELIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 锫
    public static final Fog CALIFORNIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 锎
    public static final Fog EINSTEINIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 锿
    public static final Fog FERMIUM_FOG  = new Fog(0xC9E4F7, 2.0f); // 镄
    public static final Fog MENDELEVIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 钔
    public static final Fog NOBELIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 锘
    public static final Fog LAWRENCIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 铹
    public static final Fog RUTHERFORDIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 𬬻
    public static final Fog DUBNIUM_FOG  = new Fog(0xC9E4F7, 2.0f); // 𬭊
    public static final Fog SEABORGIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 𬭳
    public static final Fog BOHRIUM_FOG  = new Fog(0xC9E4F7, 2.0f); // 𬭛
    public static final Fog HASSIUM_FOG  = new Fog(0xC9E4F7, 2.0f); // 𬭶
    public static final Fog MEITNERIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 鿏
    public static final Fog DARMSTADTIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 𫟼
    public static final Fog ROENTGENIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 𬬭
    public static final Fog COPERNICIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 鿔
    public static final Fog NIHONIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 鿭
    public static final Fog FLEROVIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 𫓧
    public static final Fog MOSCOVIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 镆
    public static final Fog LIVERMORIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 𫟷
    public static final Fog TENNESSINE_FOG = new Fog(0xC9E4F7, 2.0f); // 鿬
    public static final Fog OGANESSON_FOG = new Fog(0xC9E4F7, 2.0f); // 鿫
    public static final Fog LONGIUM_FOG  = new Fog(0xC9E4F7, 2.0f); // 鑨
    public static final Fog MYSTERIUM_FOG = new Fog(0xC9E4F7, 2.0f); // 镾

}