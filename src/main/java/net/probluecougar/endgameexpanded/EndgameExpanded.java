package net.probluecougar.endgameexpanded;

import net.fabricmc.api.ModInitializer;
import net.probluecougar.endgameexpanded.block.ModBlocks;
import net.probluecougar.endgameexpanded.item.ModItems;
import net.probluecougar.endgameexpanded.portal.Portal;
import net.probluecougar.endgameexpanded.world.feature.ModConfiguredFeatures;
import net.probluecougar.endgameexpanded.world.gen.ModOreGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EndgameExpanded implements ModInitializer {


	public static final String MOD_ID = "endgameexpanded";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();

		ModItems.RegisterModItems();
		Portal.portalRegister();
		ModBlocks.RegisterModBlocks();
		ModOreGeneration.generateOres();
	}
}
