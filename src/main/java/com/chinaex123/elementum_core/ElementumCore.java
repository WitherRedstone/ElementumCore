package com.chinaex123.elementum_core;

import com.chinaex123.elementum_core.init.*;
import com.chinaex123.elementum_core.init.ECElementBlocks;
import com.chinaex123.elementum_core.init.ECElementFluids;
import com.chinaex123.elementum_core.init.ECElementGases;
import com.chinaex123.elementum_core.init.ECElementItems;
import com.chinaex123.elementum_core.init.ECMaterialItems;
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
        ECElementItems.register(modEventBus);
        ECElementFluids.register(modEventBus);
        ECElementGases.register(modEventBus);

        ECCreativeTabs.register(modEventBus);
    }

    public static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(MODID, path);
    }
}
