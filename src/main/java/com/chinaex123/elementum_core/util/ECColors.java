package com.chinaex123.elementum_core.util;

public class ECColors {
    private ECColors() {
    }

    /**
     * 雾色 + 雾距离。
     *
     * @param color    雾色
     * @param distance 雾完全遮住的距离
     */
    public record Fog(int color, float distance) {
    }

    public static final Fog HYDROGEN_FOG = new Fog(0xD6DBDF, 2.0f); // 氢
    public static final Fog HELIUM_FOG = new Fog(0xCEC0CF, 2.0f); // 氦
    public static final Fog LITHIUM_FOG = new Fog(0xB2A49F, 2.0f); // 锂
    public static final Fog BERYLLIUM_FOG = new Fog(0xD1BF74, 2.0f); // 铍
    public static final Fog BORON_FOG = new Fog(0x547991, 2.0f); // 硼
    public static final Fog CARBON_FOG = new Fog(0x3C3C3C, 2.0f); // 碳
    public static final Fog NITROGEN_FOG = new Fog(0xCECBD6, 2.0f); // 氮
    public static final Fog OXYGEN_FOG = new Fog(0xD6DDFA, 2.0f); // 氧
    public static final Fog FLUORINE_FOG = new Fog(0xEDEAC9, 2.0f); // 氟
    public static final Fog NEON_FOG = new Fog(0xDDF5F6, 2.0f); // 氖
    public static final Fog SODIUM_FOG = new Fog(0xD4FFFD, 2.0f); // 钠
    public static final Fog MAGNESIUM_FOG = new Fog(0xAC9A9A, 2.0f); // 镁
    public static final Fog ALUMINUM_FOG = new Fog(0xD2E2F0, 2.0f); // 铝
    public static final Fog SILICON_FOG = new Fog(0x99A3AB, 2.0f); // 硅
    public static final Fog PHOSPHORUS_FOG = new Fog(0xB5B075, 2.0f); // 磷
    public static final Fog SULFUR_FOG = new Fog(0xFFEB7A, 2.0f); // 硫
    public static final Fog CHLORINE_FOG = new Fog(0xBCCABB, 2.0f); // 氯
    public static final Fog ARGON_FOG = new Fog(0xB6A89B, 2.0f); // 氩
    public static final Fog POTASSIUM_FOG = new Fog(0xD5C3C0, 2.0f); // 钾
    public static final Fog CALCIUM_FOG = new Fog(0xEFEBE7, 2.0f); // 钙
    public static final Fog SCANDIUM_FOG = new Fog(0xDBD5B1, 2.0f); // 钪
    public static final Fog TITANIUM_FOG = new Fog(0xE9A192, 2.0f); // 钛
    public static final Fog VANADIUM_FOG = new Fog(0x978EA9, 2.0f); // 钒
    public static final Fog CHROMIUM_FOG = new Fog(0xCAB86F, 2.0f); // 铬
    public static final Fog MANGANESE_FOG = new Fog(0xD7D8D9, 2.0f); // 锰
    public static final Fog IRON_FOG = new Fog(0xC9C9C9, 2.0f); // 铁
    public static final Fog COBALT_FOG = new Fog(0x7CCCEB, 2.0f); // 钴
    public static final Fog NICKEL_FOG = new Fog(0xA0A883, 2.0f); // 镍
    public static final Fog COPPER_FOG = new Fog(0xD78767, 2.0f); // 铜
    public static final Fog ZINC_FOG = new Fog(0xD1D1A5, 2.0f); // 锌
    public static final Fog GALLIUM_FOG = new Fog(0x7787A1, 2.0f); // 镓
    public static final Fog GERMANIUM_FOG = new Fog(0xA6B3CF, 2.0f); // 锗
    public static final Fog ARSENIC_FOG = new Fog(0x900000, 2.0f); // 砷
    public static final Fog SELENIUM_FOG = new Fog(0x958383, 2.0f); // 硒
    public static final Fog BROMINE_FOG = new Fog(0xC5723C, 2.0f); // 溴
    public static final Fog KRYPTON_FOG = new Fog(0xE9E6E1, 2.0f); // 氪
    public static final Fog RUBIDIUM_FOG = new Fog(0xA46B8E, 2.0f); // 铷
    public static final Fog STRONTIUM_FOG = new Fog(0x884640, 2.0f); // 锶
    public static final Fog YTTRIUM_FOG = new Fog(0xFFECB7, 2.0f); // 钇
    public static final Fog ZIRCONIUM_FOG = new Fog(0x69736E, 2.0f); // 锆
    public static final Fog NIOBIUM_FOG = new Fog(0x50697F, 2.0f); // 铌
    public static final Fog MOLYBDENUM_FOG = new Fog(0x99B4C9, 2.0f); // 钼
    public static final Fog TECHNETIUM_FOG = new Fog(0xB8D1D1, 2.0f); // 锝
    public static final Fog RUTHENIUM_FOG = new Fog(0xEDCC29, 2.0f); // 钌
    public static final Fog RHODIUM_FOG = new Fog(0xD6C7AD, 2.0f); // 铑
    public static final Fog PALLADIUM_FOG = new Fog(0xF0A795, 2.0f); // 钯
    public static final Fog SILVER_FOG = new Fog(0xB7DDFF, 2.0f); // 银
    public static final Fog CADMIUM_FOG = new Fog(0x9966B3, 2.0f); // 镉
    public static final Fog INDIUM_FOG = new Fog(0x677389, 2.0f); // 铟
    public static final Fog TIN_FOG = new Fog(0xD8ECFF, 2.0f); // 锡
    public static final Fog ANTIMONY_FOG = new Fog(0xE2F4F4, 2.0f); // 锑
    public static final Fog TELLURIUM_FOG = new Fog(0xA6E0C1, 2.0f); // 碲
    public static final Fog IODINE_FOG = new Fog(0x7131AD, 2.0f); // 碘
    public static final Fog XENON_FOG = new Fog(0xF8FAF6, 2.0f); // 氙
    public static final Fog CESIUM_FOG = new Fog(0xF5F5E1, 2.0f); // 铯
    public static final Fog BARIUM_FOG = new Fog(0xCCB1F4, 2.0f); // 钡
    public static final Fog LANTHANUM_FOG = new Fog(0x63B137, 2.0f); // 镧
    public static final Fog CERIUM_FOG = new Fog(0xC78E4E, 2.0f); // 铈
    public static final Fog PRASEODYMIUM_FOG = new Fog(0xAE87F7, 2.0f); // 镨
    public static final Fog NEODYMIUM_FOG = new Fog(0xAB5CC9, 2.0f); // 钕
    public static final Fog PROMETHIUM_FOG = new Fog(0xBDCBD7, 2.0f); // 钷
    public static final Fog SAMARIUM_FOG = new Fog(0x00CCD2, 2.0f); // 钐
    public static final Fog EUROPIUM_FOG = new Fog(0x3E5691, 2.0f); // 铕
    public static final Fog GADOLINIUM_FOG = new Fog(0x4A217B, 2.0f); // 钆
    public static final Fog TERBIUM_FOG = new Fog(0x4191E3, 2.0f); // 铽
    public static final Fog DYSPROSIUM_FOG = new Fog(0x009D91, 2.0f); // 镝
    public static final Fog HOLMIUM_FOG = new Fog(0xD2BD85, 2.0f); // 钬
    public static final Fog ERBIUM_FOG = new Fog(0xC3336E, 2.0f); // 铒
    public static final Fog THULIUM_FOG = new Fog(0x63393F, 2.0f); // 铥
    public static final Fog YTTERBIUM_FOG = new Fog(0xFF8BC3, 2.0f); // 镱
    public static final Fog LUTETIUM_FOG = new Fog(0x84D0CC, 2.0f); // 镥
    public static final Fog HAFNIUM_FOG = new Fog(0xA5A9AC, 2.0f); // 铪
    public static final Fog TANTALUM_FOG = new Fog(0xD7D5E2, 2.0f); // 钽
    public static final Fog TUNGSTEN_FOG = new Fog(0x7A95A9, 2.0f); // 钨
    public static final Fog RHENIUM_FOG = new Fog(0x767571, 2.0f); // 铼
    public static final Fog OSMIUM_FOG = new Fog(0x95C9C9, 2.0f); // 锇
    public static final Fog IRIDIUM_FOG = new Fog(0xFFA3D5, 2.0f); // 铱
    public static final Fog PLATINUM_FOG = new Fog(0xB0E2FA, 2.0f); // 铂
    public static final Fog GOLD_FOG = new Fog(0xFDF55F, 2.0f); // 金
    public static final Fog MERCURY_FOG = new Fog(0x9CA1C2, 2.0f); // 汞
    public static final Fog THALLIUM_FOG = new Fog(0x8D9EAE, 2.0f); // 铊
    public static final Fog LEAD_FOG = new Fog(0x5C6A7D, 2.0f); // 铅
    public static final Fog BISMUTH_FOG = new Fog(0xF5DD6D, 2.0f); // 铋
    public static final Fog POLONIUM_FOG = new Fog(0x3DE3B9, 2.0f); // 钋
    public static final Fog ASTATINE_FOG = new Fog(0x730BA3, 2.0f); // 砹
    public static final Fog RADON_FOG = new Fog(0xB2B2B2, 2.0f); // 氡
    public static final Fog FRANCIUM_FOG = new Fog(0x656B9D, 2.0f); // 钫
    public static final Fog RADIUM_FOG = new Fog(0xEBBFAE, 2.0f); // 镭
    public static final Fog ACTINIUM_FOG = new Fog(0xC34053, 2.0f); // 锕
    public static final Fog THORIUM_FOG = new Fog(0xC989D3, 2.0f); // 钍
    public static final Fog PROTACTINIUM_FOG = new Fog(0x4C55CF, 2.0f); // 镤
    public static final Fog URANIUM_FOG = new Fog(0x799C46, 2.0f); // 铀
    public static final Fog NEPTUNIUM_FOG = new Fog(0x57958A, 2.0f); // 镎
    public static final Fog PLUTONIUM_FOG = new Fog(0x46909D, 2.0f); // 钚
    public static final Fog AMERICIUM_FOG = new Fog(0x0D3A38, 2.0f); // 镅
    public static final Fog CURIUM_FOG = new Fog(0x8B84A3, 2.0f); // 锔
    public static final Fog BERKELIUM_FOG = new Fog(0xC41319, 2.0f); // 锫
    public static final Fog CALIFORNIUM_FOG = new Fog(0x75FFDF, 2.0f); // 锎
    public static final Fog EINSTEINIUM_FOG = new Fog(0x856173, 2.0f); // 锿
    public static final Fog FERMIUM_FOG = new Fog(0x71A6C8, 2.0f); // 镄
    public static final Fog MENDELEVIUM_FOG = new Fog(0x7400B3, 2.0f); // 钔
    public static final Fog NOBELIUM_FOG = new Fog(0x6ABB8C, 2.0f); // 锘
    public static final Fog LAWRENCIUM_FOG = new Fog(0x8F85B6, 2.0f); // 铹
    public static final Fog RUTHERFORDIUM_FOG = new Fog(0x214D51, 2.0f); // 𬬻
    public static final Fog DUBNIUM_FOG = new Fog(0x073938, 2.0f); // 𬭊
    public static final Fog SEABORGIUM_FOG = new Fog(0x862A3F, 2.0f); // 𬭳
    public static final Fog BOHRIUM_FOG = new Fog(0x649720, 2.0f); // 𬭛
    public static final Fog HASSIUM_FOG = new Fog(0x42042B, 2.0f); // 𬭶
    public static final Fog MEITNERIUM_FOG = new Fog(0x6E5C14, 2.0f); // 鿏
    public static final Fog DARMSTADTIUM_FOG = new Fog(0x075674, 2.0f); // 𫟼
    public static final Fog ROENTGENIUM_FOG = new Fog(0x5A3636, 2.0f); // 𬬭
    public static final Fog COPERNICIUM_FOG = new Fog(0x6A1A9F, 2.0f); // 鿔
    public static final Fog NIHONIUM_FOG = new Fog(0x92A577, 2.0f); // 鿭
    public static final Fog FLEROVIUM_FOG = new Fog(0x8477A5, 2.0f); // 𫓧
    public static final Fog MOSCOVIUM_FOG = new Fog(0xA57784, 2.0f); // 镆
    public static final Fog LIVERMORIUM_FOG = new Fog(0xA4A585, 2.0f); // 𫟷
    public static final Fog TENNESSINE_FOG = new Fog(0x5A9694, 2.0f); // 鿬
    public static final Fog OGANESSON_FOG = new Fog(0xA562A5, 2.0f); // 鿫
    public static final Fog LONGIUM_FOG = new Fog(0xCE3939, 2.0f); // 鑨
    public static final Fog MYSTERIUM_FOG = new Fog(0xDC7A2A, 2.0f); // 镾

}