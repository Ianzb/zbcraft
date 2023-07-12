
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.ianzb.zbcraft.init;

import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.ianzb.zbcraft.item.ZbitemItem;
import net.ianzb.zbcraft.ZbMod;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class ZbModItems {
	public static Item ZBITEM;
	public static Item ZBBLOCK;
	public static Item ZBORE;
	public static Item ZBBOSS_SPAWN_EGG;

	public static void load() {
		ZBITEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ZbMod.MODID, "zbitem"), new ZbitemItem());
		ZBBLOCK = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ZbMod.MODID, "zbblock"), new BlockItem(ZbModBlocks.ZBBLOCK, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ZbModTabs.TAB_ZBTAB).register(content -> content.accept(ZBBLOCK));
		ZBORE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ZbMod.MODID, "zbore"), new BlockItem(ZbModBlocks.ZBORE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ZbModTabs.TAB_ZBTAB).register(content -> content.accept(ZBORE));
		ZBBOSS_SPAWN_EGG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ZbMod.MODID, "zbboss_spawn_egg"), new SpawnEggItem(ZbModEntities.ZBBOSS, -11081, -6272502, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(content -> content.accept(ZBBOSS_SPAWN_EGG));
	}
}
