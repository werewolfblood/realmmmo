package dev.west.realmmomod.Init;

import dev.west.realmmomod.RealmmmoMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class InitBlock {
    public static final Block MITHRIL_LOG = registerWithItem("mithril_log",
            new Block(AbstractBlock.Settings.create()
            .strength(1.5F, 6.0F)
            .requiresTool() // This is necessary to make the block drop when broken with the right tool
    ));

    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, RealmmmoMod.id(name), block);
    }

    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = register(name, block); // Register the block first (important for the item to work properly)
        InitItem.register(name, new BlockItem(registered, settings));
        return registered;
    }

    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }

    public static void init() {
        // Just to run the static block
    }
}

