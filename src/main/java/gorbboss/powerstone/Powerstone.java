package gorbboss.powerstone;

import gorbboss.powerstone.core.PowerstoneBlocks;
import gorbboss.powerstone.core.PowerstoneItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Powerstone implements ModInitializer {

	public static final String MOD_ID = "powerstone";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello from Loqor!");

		PowerstoneBlocks.initialize();
		PowerstoneItems.initialize();

		this.addItemsToGroup();
	}

	private void addItemsToGroup() {
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.REDSTONE).register(itemGroup -> {
			itemGroup.add(PowerstoneItems.REDSTONE_WAND);
			itemGroup.add(PowerstoneBlocks.REDSTONE_GRANULE_BLOCK.asItem());
			itemGroup.add(PowerstoneBlocks.REDSTONE_PEBBLE_BLOCK.asItem());
			itemGroup.add(PowerstoneBlocks.REDSTONE_COBBLE_BLOCK.asItem());
			itemGroup.add(PowerstoneBlocks.REDSTONE_BOULDER_BLOCK.asItem());
		});
	}
}