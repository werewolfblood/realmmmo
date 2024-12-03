package dev.west.realmmomod;



import dev.west.realmmomod.Init.InitBlock;
import dev.west.realmmomod.Init.InitItem;
import dev.west.realmmomod.Init.ItemGroupInit;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RealmmmoMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("MOD_ID");
	public static final String MOD_ID = "realmmmomod";


	@Override
	public void onInitialize() {
		ItemGroupInit.load();
		InitItem.init();
		InitBlock.init();
		LOGGER.info("Loading...");

	}
	public static Identifier id (String path) {
		return Identifier.of(MOD_ID,path);

	}
}