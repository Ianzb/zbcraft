/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.ianzb.zbcraft;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.ianzb.zbcraft.init.ZbModTabs;
import net.ianzb.zbcraft.init.ZbModParticleTypes;
import net.ianzb.zbcraft.init.ZbModItems;
import net.ianzb.zbcraft.init.ZbModFeatures;
import net.ianzb.zbcraft.init.ZbModEntities;
import net.ianzb.zbcraft.init.ZbModBlocks;

import net.fabricmc.api.ModInitializer;

public class ZbMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "zb";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing ZbMod");
		ZbModParticleTypes.load();
		ZbModTabs.load();

		ZbModEntities.load();
		ZbModBlocks.load();
		ZbModItems.load();

		ZbModFeatures.load();

	}
}
