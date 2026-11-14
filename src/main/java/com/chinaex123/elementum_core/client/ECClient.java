package com.chinaex123.elementum_core.client;

import com.chinaex123.elementum_core.ElementumCore;
import com.chinaex123.elementum_core.init.ECElementFluids;
import com.chinaex123.elementum_core.init.ECElementGases;
import com.chinaex123.elementum_core.init.ECElementItems;
import com.chinaex123.elementum_core.item.GasBucketItem;
import net.minecraft.client.color.item.ItemColor;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.Item;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.model.DynamicFluidContainerModel;

@Mod(value = ElementumCore.MODID, dist = Dist.CLIENT)
public class ECClient {

    public ECClient(IEventBus modEventBus) {
        modEventBus.addListener(RegisterClientExtensionsEvent.class, ECElementFluids::onRegisterFluidType);
        modEventBus.addListener(RegisterClientExtensionsEvent.class, ECElementGases::onRegisterGasType);

        modEventBus.addListener(RegisterColorHandlersEvent.Item.class, ECClient::registerItemColors);
    }

    private static void registerItemColors(RegisterColorHandlersEvent.Item event) {
        ItemColor gasColor = new DynamicFluidContainerModel.Colors();
        ItemColor fluidColor = new DynamicFluidContainerModel.Colors();

        for (var entry : ECElementItems.ITEMS.getEntries()) {
            Item item = entry.get();
            if (item instanceof GasBucketItem) {
                event.register(gasColor, item);
            } else if (item instanceof BucketItem) {
                event.register(fluidColor, item);
            }
        }
    }
}