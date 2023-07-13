
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.ianzb.zbcraft.init;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.EntityDimensions;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.ianzb.zbcraft.entity.ZbbossEntity;
import net.ianzb.zbcraft.ZbMod;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;

public class ZbModEntities {
	public static EntityType<ZbbossEntity> ZB_BOSS;

	public static void load() {
		ZB_BOSS = Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(ZbMod.MODID, "zb_boss"),
				FabricEntityTypeBuilder.create(MobCategory.MONSTER, ZbbossEntity::new).dimensions(new EntityDimensions(0.6f, 1.8f, true)).fireImmune().trackRangeBlocks(256).forceTrackedVelocityUpdates(true).trackedUpdateRate(3).build());
		ZbbossEntity.init();
		FabricDefaultAttributeRegistry.register(ZB_BOSS, ZbbossEntity.createAttributes());
	}

	private static <T extends Entity> EntityType<T> createArrowEntityType(EntityType.EntityFactory<T> factory) {
		return FabricEntityTypeBuilder.create(MobCategory.MISC, factory).dimensions(EntityDimensions.fixed(0.5f, 0.5f)).trackRangeBlocks(1).trackedUpdateRate(64).build();
	}
}
