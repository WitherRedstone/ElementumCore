package com.chinaex123.elementum_core.init;

import com.chinaex123.elementum_core.ElementumCore;
import com.chinaex123.elementum_core.init.items.ECMaterialItems;
import com.chinaex123.elementum_core.item.GasBucketItem;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.capabilities.Capabilities;
import net.neoforged.neoforge.capabilities.RegisterCapabilitiesEvent;
import net.neoforged.neoforge.fluids.capability.wrappers.FluidBucketWrapper;
import net.neoforged.neoforge.registries.DeferredHolder;

@EventBusSubscriber(modid = ElementumCore.MODID)
public class ECCapabilities {

    @SubscribeEvent
    public static void registerCapabilities(RegisterCapabilitiesEvent event) {
        for (DeferredHolder<Item, ? extends Item> entry : ECMaterialItems.ITEMS_REGISTER.getEntries()) {
            Item item = entry.get();
            if (item instanceof GasBucketItem) {
                event.registerItem(
                        Capabilities.FluidHandler.ITEM,
                        (stack, ctx) -> new FluidBucketWrapper(stack),
                        item
                );
            }
        }
    }
}