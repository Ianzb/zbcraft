
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.ianzb.zbcraft.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.ianzb.zbcraft.ZbMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class ZbModTabs {
	public static ResourceKey<CreativeModeTab> TAB_ZBTAB = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(ZbMod.MODID, "zbtab"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_ZBTAB, FabricItemGroup.builder().title(Component.translatable("item_group." + ZbMod.MODID + ".zbtab")).icon(() -> new ItemStack(ZbModItems.ZBITEM)).build());
	}
}
