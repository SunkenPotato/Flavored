package codenamed.flavored;

import codenamed.flavored.registry.FlavoredBlocks;
import codenamed.flavored.registry.FlavoredItemGroup;
import codenamed.flavored.registry.FlavoredItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Flavored implements ModInitializer {
	public  static  final String MOD_ID = "flavored";

    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		//
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!");


		FlavoredBlocks.registerModBlocks();
		FlavoredItems.registerModItems();
		FlavoredItemGroup.registerItemGroups();
	}




}