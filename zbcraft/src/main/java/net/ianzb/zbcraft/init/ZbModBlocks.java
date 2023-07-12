
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.ianzb.zbcraft.init;

import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.ianzb.zbcraft.block.ZboreBlock;
import net.ianzb.zbcraft.block.ZbblockBlock;
import net.ianzb.zbcraft.ZbMod;

public class ZbModBlocks {
	public static Block ZBBLOCK;
	public static Block ZBORE;

	public static void load() {
		ZBBLOCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(ZbMod.MODID, "zbblock"), new ZbblockBlock());
		ZBORE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(ZbMod.MODID, "zbore"), new ZboreBlock());
	}

	public static void clientLoad() {
		ZbblockBlock.clientInit();
		ZboreBlock.clientInit();
	}
}
