
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
	public static Block ZB_BLOCK;
	public static Block ZB_ORE;

	public static void load() {
		ZB_BLOCK = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(ZbMod.MODID, "zb_block"), new ZbblockBlock());
		ZB_ORE = Registry.register(BuiltInRegistries.BLOCK, new ResourceLocation(ZbMod.MODID, "zb_ore"), new ZboreBlock());
	}

	public static void clientLoad() {
		ZbblockBlock.clientInit();
		ZboreBlock.clientInit();
	}
}
