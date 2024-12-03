package dev.west.realmmomod.Init;

import dev.west.realmmomod.RealmmmoMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class InitItem {
public static final Item MITHRIL_ITEM = register("mithril_item", new Item(new Item.Settings()));
    public static <T extends Item> T register(String name, T item) {
        return Registry.register(Registries.ITEM, RealmmmoMod.id(name), item);
    }

    public static void init() {
        // This method is used to load the class and therefore the static fields.
    }
}

