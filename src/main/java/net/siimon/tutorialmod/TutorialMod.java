package net.siimon.tutorialmod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.siimon.tutorialmod.block.ModBlocks;
import net.siimon.tutorialmod.block.entity.ModBlockEntities;
import net.siimon.tutorialmod.item.ModItemGroups;
import net.siimon.tutorialmod.item.ModItems;
import net.siimon.tutorialmod.recipe.ModRecipes;
import net.siimon.tutorialmod.screen.ModScreenHandlers;
import net.siimon.tutorialmod.sound.ModSounds;
import net.siimon.tutorialmod.util.ModCustomTrades;
import net.siimon.tutorialmod.util.ModLootTableModifiers;
import net.siimon.tutorialmod.villager.ModVillagers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModItemGroups.registerItemGroups();
		ModBlocks.registerModBlocks();

		ModLootTableModifiers.modifyLootTables();

		FuelRegistry.INSTANCE.add(ModItems.COAL_PILE, 600);

		ModCustomTrades.registerCustomTrades();
		ModVillagers.registerVillagers();

		ModBlockEntities.registerBlockEntities();
		ModScreenHandlers.registerScreenHandlers();

		ModRecipes.registerRecipes();

		ModSounds.registerSounds();

		StrippableBlockRegistry.register(ModBlocks.CHESTNUT_LOG, ModBlocks.STRIPPED_CHESTNUT_LOG);
		StrippableBlockRegistry.register(ModBlocks.CHESTNUT_WOOD, ModBlocks.STRIPPED_CHESTNUT_WOOD);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_LOG, 5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_WOOD, 5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CHESTNUT_WOOD, 5,5);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.STRIPPED_CHESTNUT_LOG, 5,5);

		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_PLANKS, 5,20);
		FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CHESTNUT_LEAVES, 30,60);
	}
}