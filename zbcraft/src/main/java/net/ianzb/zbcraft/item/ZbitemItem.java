
package net.ianzb.zbcraft.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

import net.ianzb.zbcraft.init.ZbModTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class ZbitemItem extends Item {
	public ZbitemItem() {
		super(new Item.Properties().stacksTo(64).fireResistant().rarity(Rarity.UNCOMMON));
		ItemGroupEvents.modifyEntriesEvent(ZbModTabs.TAB_ZBTAB).register(content -> content.accept(this));
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}
}
