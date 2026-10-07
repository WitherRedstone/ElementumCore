package com.chinaex123.elementum_core.util;

public class MaterialName {

    /**
     * 从物品名中提取材料名
     */
    public static String extractMaterialName(String itemName) {
        if (itemName.startsWith("crushed_raw_")) {
            return itemName.substring("crushed_raw_".length());
        }
        if (itemName.startsWith("raw_")) {
            return itemName.substring("raw_".length());
        }

        int lastUnderscore = itemName.lastIndexOf('_');
        if (lastUnderscore > 0) {
            return itemName.substring(0, lastUnderscore);
        }

        return itemName;
    }

    /**
     * 从方块名中提取材料名
     */
    public static String extractBlockMaterialName(String blockName) {
        if (blockName.startsWith("deepslate_")) {
            int oreIndex = blockName.lastIndexOf("_ore");
            if (oreIndex > 0) {
                return blockName.substring("deepslate_".length(), oreIndex);
            }
            return blockName.substring("deepslate_".length());
        }
        if (blockName.startsWith("nether_") || blockName.startsWith("end_")) {
            int oreIndex = blockName.lastIndexOf("_ore");
            if (oreIndex > 0) {
                return blockName.substring(blockName.indexOf("_") + 1, oreIndex);
            }
            return blockName.substring(blockName.indexOf("_") + 1);
        }
        if (blockName.startsWith("raw_")) {
            int blockIndex = blockName.lastIndexOf("_block");
            if (blockIndex > 0) {
                return blockName.substring("raw_".length(), blockIndex);
            }
            return blockName.substring("raw_".length());
        }

        int lastUnderscore = blockName.lastIndexOf('_');
        if (lastUnderscore > 0) {
            int blockIndex = blockName.lastIndexOf("_block");
            int oreIndex = blockName.lastIndexOf("_ore");
            if (blockIndex > 0) {
                return blockName.substring(0, blockIndex);
            }
            if (oreIndex > 0) {
                return blockName.substring(0, oreIndex);
            }
            return blockName.substring(0, lastUnderscore);
        }

        return blockName;
    }
}
