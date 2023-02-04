package net.nextrix.funnymod;

import net.fabricmc.api.ModInitializer;
import net.nextrix.funnymod.block.ModBlocks;
import net.nextrix.funnymod.item.ModItems;
import net.nextrix.funnymod.world.dimensions.ModDimensions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FunnyMod implements ModInitializer {
	public static final String MOD_ID = "funnymod";
	public static final Logger LOGGER = LoggerFactory.getLogger("funnymod");

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();

		ModDimensions.register();

		LOGGER.info("A MEMBER OF FUNNY DOG GANG HAS ENTERED UR LOBBY!");
	}
}
