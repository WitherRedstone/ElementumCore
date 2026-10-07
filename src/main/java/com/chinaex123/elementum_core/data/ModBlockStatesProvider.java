package com.chinaex123.elementum_core.data;

import com.chinaex123.elementum_core.ElementumCore;
import com.chinaex123.elementum_core.init.blocks.ECElementBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;

public class ModBlockStatesProvider extends BlockStateProvider {
    public ModBlockStatesProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ElementumCore.MODID, exFileHelper);
    }

    protected void registerStatesAndModels() {
        ECElementBlocks.OreBlocks.ALL_BLOCKS.forEach(this::simpleBlock);
    }

    private void simpleBlock(DeferredBlock<?> block) {
        String blockName = block.getId().getPath();
        String materialName = extractMaterialName(blockName);

        ModelFile model = models().cubeAll(blockName,
                ResourceLocation.fromNamespaceAndPath(ElementumCore.MODID, "block/elements/" + materialName + "/" + blockName));

        simpleBlock(block.get(), model);
    }

    private String extractMaterialName(String blockName) {
        if (blockName.startsWith("deepslate_")) {
            return blockName.substring("deepslate_".length(), blockName.lastIndexOf("_ore"));
        }
        if (blockName.startsWith("nether_") || blockName.startsWith("end_")) {
            return blockName.substring(blockName.indexOf("_") + 1, blockName.lastIndexOf("_ore"));
        }
        if (blockName.startsWith("raw_")) {
            return blockName.substring("raw_".length(), blockName.lastIndexOf("_block"));
        }
        return blockName.substring(0, blockName.lastIndexOf('_'));
    }
}
