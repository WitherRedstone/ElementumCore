package com.chinaex123.elementum_core.init.items;

import com.chinaex123.elementum_core.ElementumCore;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ECItems {
    public static final DeferredRegister.Items ITEMS_REGISTER = DeferredRegister.createItems(ElementumCore.MODID);

    // ==================== 12个元素的气瓶 ====================
    /** 气瓶 */
    public static final DeferredItem<Item> GAS_CYLINDER = ITEMS_REGISTER.register("gas_cylinder", () -> new Item(new Item.Properties()));
    /** 氢气瓶 */
    public static final DeferredItem<Item> HYDROGEN_CYLINDER = ITEMS_REGISTER.register("hydrogen_cylinder", () -> new Item(new Item.Properties()));
    /** 氦气瓶 */
    public static final DeferredItem<Item> HELIUM_CYLINDER = ITEMS_REGISTER.register("helium_cylinder", () -> new Item(new Item.Properties()));
    /** 氮气瓶 */
    public static final DeferredItem<Item> NITROGEN_CYLINDER = ITEMS_REGISTER.register("nitrogen_cylinder", () -> new Item(new Item.Properties()));
    /** 氧气瓶 */
    public static final DeferredItem<Item> OXYGEN_CYLINDER = ITEMS_REGISTER.register("oxygen_cylinder", () -> new Item(new Item.Properties()));
    /** 氟气瓶 */
    public static final DeferredItem<Item> FLUORINE_CYLINDER = ITEMS_REGISTER.register("fluorine_cylinder", () -> new Item(new Item.Properties()));
    /** 氖气瓶 */
    public static final DeferredItem<Item> NEON_CYLINDER = ITEMS_REGISTER.register("neon_cylinder", () -> new Item(new Item.Properties()));
    /** 氯气瓶 */
    public static final DeferredItem<Item> CHLORINE_CYLINDER = ITEMS_REGISTER.register("chlorine_cylinder", () -> new Item(new Item.Properties()));
    /** 氩气瓶 */
    public static final DeferredItem<Item> ARGON_CYLINDER = ITEMS_REGISTER.register("argon_cylinder", () -> new Item(new Item.Properties()));
    /** 氪气瓶 */
    public static final DeferredItem<Item> KRYPTON_CYLINDER = ITEMS_REGISTER.register("krypton_cylinder", () -> new Item(new Item.Properties()));
    /** 氙气瓶 */
    public static final DeferredItem<Item> XENON_CYLINDER = ITEMS_REGISTER.register("xenon_cylinder", () -> new Item(new Item.Properties()));
    /** 氡气瓶 */
    public static final DeferredItem<Item> RADON_CYLINDER = ITEMS_REGISTER.register("radon_cylinder", () -> new Item(new Item.Properties()));
    /** 鿫气瓶 */
    public static final DeferredItem<Item> OGANESSON_CYLINDER = ITEMS_REGISTER.register("oganesson_cylinder", () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS_REGISTER.register(eventBus);
    }
}
