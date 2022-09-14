package net.probluecougar.endgameexpanded;

import net.fabricmc.api.ModInitializer;
import net.probluecougar.endgameexpanded.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class EndgameExpanded implements ModInitializer {


	public static final String MOD_ID = "endgameexpanded";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.RegisterModItems();
	}
}
