package org.zb.zbcraft.item;

import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public final class ZbItems {

    // 新物品的实例
    public static final Item zb_item = register("zb_item", new ZbItem(new Item.Settings()));

    private ZbItems() {}

    public static <T extends Item> T register(String path, T item) {
        // 对于 1.21 之前的版本，请将 ''Identifier.of'' 替换为 ''new Identifier''
        return Registry.register(Registries.ITEM, Identifier.of("zbcraft", path), item);
    }

    public static void initialize() {
    }
}
