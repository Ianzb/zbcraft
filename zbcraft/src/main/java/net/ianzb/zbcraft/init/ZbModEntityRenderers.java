
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.ianzb.zbcraft.init;

import net.ianzb.zbcraft.client.renderer.ZbbossRenderer;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.api.Environment;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class ZbModEntityRenderers {
	public static void load() {
		EntityRendererRegistry.register(ZbModEntities.ZBBOSS, ZbbossRenderer::new);
	}
}
