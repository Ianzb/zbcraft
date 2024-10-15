package org.zb.zbcraft.itemGroup;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.zb.zbcraft.item.*;

public class ZbItemGroups {
    public static final ItemGroup ZbItemGroups = Registry.register(Registries.ITEM_GROUP, Identifier.of("zbcraft", "zbcraft"), FabricItemGroup.builder()
            .icon(() -> new ItemStack(ZbItems.zb_item))
            .displayName(Text.translatable("itemGroup.zbcraft.zb_item_groups"))
            .entries((context, entries) -> {
                entries.add(ZbItems.zb_item);
            })
            .build());

    public static void initialize() {}
}