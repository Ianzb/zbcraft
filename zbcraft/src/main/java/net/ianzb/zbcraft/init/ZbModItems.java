
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
	public static Item ZB_ITEM;
	public static Item ZB_BLOCK;
	public static Item ZB_ORE;
	public static Item ZB_BOSS_SPAWN_EGG;

	public static void load() {
		ZB_ITEM = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ZbMod.MODID, "zb_item"), new ZbitemItem());
		ZB_BLOCK = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ZbMod.MODID, "zb_block"), new BlockItem(ZbModBlocks.ZB_BLOCK, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ZbModTabs.TAB_ZBTAB).register(content -> content.accept(ZB_BLOCK));
		ZB_ORE = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ZbMod.MODID, "zb_ore"), new BlockItem(ZbModBlocks.ZB_ORE, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(ZbModTabs.TAB_ZBTAB).register(content -> content.accept(ZB_ORE));
		ZB_BOSS_SPAWN_EGG = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ZbMod.MODID, "zb_boss_spawn_egg"), new SpawnEggItem(ZbModEntities.ZB_BOSS, -11081, -6272502, new Item.Properties()));
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.SPAWN_EGGS).register(content -> content.accept(ZB_BOSS_SPAWN_EGG));
	}
}
