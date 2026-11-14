package com.chinaex123.elementum_core.init;

import com.chinaex123.elementum_core.ElementumCore;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

/** 材料物品 */
public interface ECMaterialItems {
    DeferredRegister.Items ITEMS = DeferredRegister.createItems(ElementumCore.MODID);

    // ==================== 12个元素的气瓶 ====================
    /** 气瓶 */
    DeferredItem<Item> GAS_CYLINDER = ITEMS.register("gas_cylinder", () -> new Item(new Item.Properties()));
    /** 氢气瓶 */
    DeferredItem<Item> HYDROGEN_CYLINDER = ITEMS.register("hydrogen_cylinder", () -> new Item(new Item.Properties()));
    /** 氦气瓶 */
    DeferredItem<Item> HELIUM_CYLINDER = ITEMS.register("helium_cylinder", () -> new Item(new Item.Properties()));
    /** 氮气瓶 */
    DeferredItem<Item> NITROGEN_CYLINDER = ITEMS.register("nitrogen_cylinder", () -> new Item(new Item.Properties()));
    /** 氧气瓶 */
    DeferredItem<Item> OXYGEN_CYLINDER = ITEMS.register("oxygen_cylinder", () -> new Item(new Item.Properties()));
    /** 氟气瓶 */
    DeferredItem<Item> FLUORINE_CYLINDER = ITEMS.register("fluorine_cylinder", () -> new Item(new Item.Properties()));
    /** 氖气瓶 */
    DeferredItem<Item> NEON_CYLINDER = ITEMS.register("neon_cylinder", () -> new Item(new Item.Properties()));
    /** 氯气瓶 */
    DeferredItem<Item> CHLORINE_CYLINDER = ITEMS.register("chlorine_cylinder", () -> new Item(new Item.Properties()));
    /** 氩气瓶 */
    DeferredItem<Item> ARGON_CYLINDER = ITEMS.register("argon_cylinder", () -> new Item(new Item.Properties()));
    /** 氪气瓶 */
    DeferredItem<Item> KRYPTON_CYLINDER = ITEMS.register("krypton_cylinder", () -> new Item(new Item.Properties()));
    /** 氙气瓶 */
    DeferredItem<Item> XENON_CYLINDER = ITEMS.register("xenon_cylinder", () -> new Item(new Item.Properties()));
    /** 氡气瓶 */
    DeferredItem<Item> RADON_CYLINDER = ITEMS.register("radon_cylinder", () -> new Item(new Item.Properties()));
    /** 鿫气瓶 */
    DeferredItem<Item> OGANESSON_CYLINDER = ITEMS.register("oganesson_cylinder", () -> new Item(new Item.Properties()));

}
