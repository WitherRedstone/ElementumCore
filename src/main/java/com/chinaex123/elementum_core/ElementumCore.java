package com.chinaex123.elementum_core;

import com.chinaex123.elementum_core.init.*;
import com.chinaex123.elementum_core.init.blocks.ECElementBlocks;
import com.chinaex123.elementum_core.init.fluids.ECFluids;
import com.chinaex123.elementum_core.init.gas.ECGases;
import com.chinaex123.elementum_core.init.items.ECMaterialItems;
import com.chinaex123.elementum_core.init.items.ECItems;
import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;

@Mod(ElementumCore.MODID)
public class ElementumCore {
    public static final String MODID = "elementum_core";
    public static final Logger LOGGER = LogUtils.getLogger();

    public ElementumCore(IEventBus modEventBus, ModContainer modContainer) {

        ECElementBlocks.register(modEventBus);
        ECMaterialItems.register(modEventBus);
        ECItems.register(modEventBus);
        ECFluids.register(modEventBus);
        ECGases.register(modEventBus);
        ECCreativeTabs.register(modEventBus);
    }

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}
