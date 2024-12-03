package dev.west.realmmomod.Init;

import dev.west.realmmomod.RealmmmoMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import java.util.Optional;


public class ItemGroupInit {
    private static final Text REALM_TITLE = Text.translatable("itemGroup."+ RealmmmoMod.MOD_ID + "realm_group");
    public static final ItemGroup REALM_GROUP = register("realm_group", FabricItemGroup.builder()
            .displayName(REALM_TITLE)
            .icon(InitItem.MITHRIL_ITEM::getDefaultStack)
            .entries((displayContext, entries) -> Registries.ITEM.getIds()
                    .stream()
                    .filter(key -> key.getNamespace().equals(RealmmmoMod.MOD_ID))
                    .map(Registries.ITEM::getOrEmpty)
                    .map(Optional::orElseThrow)
                    .forEach(entries::add))
            .icon(InitItem.MITHRIL_ITEM::getDefaultStack)
            .build());



    public static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, RealmmmoMod.id(name), itemGroup);
   }
    public static void load() {

    }
}
