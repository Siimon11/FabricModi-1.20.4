package net.siimon.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.siimon.tutorialmod.TutorialMod;
import net.siimon.tutorialmod.block.ModBlocks;

public class ModItemGroups {
    public static final ItemGroup SAPPHIRE_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(TutorialMod.MOD_ID,
            "sapphire"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.sapphire"))
                    .icon(() -> new ItemStack(ModItems.SAPPHIRE)).entries((displayContext, entries) -> {
                        entries.add(ModItems.SAPPHIRE);
                        entries.add(ModItems.CUT_SAPPHIRE);
                        entries.add(ModItems.FLOUR);
                        entries.add(ModItems.BLUEBERRY);
                        entries.add(ModItems.COOKED_BLUEBERRY_PIE);
                        entries.add(ModItems.RAW_BLUEBERRY_PIE);
                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModItems.RUBY_STAFF);
                        entries.add(ModItems.COAL_PILE);
                        entries.add(ModItems.SAPPHIRE_STICK);

                        entries.add(ModItems.BAR_BRAWL_MUSIC_DISC);

                        entries.add(ModBlocks.GEM_POLISHING_STATION);

                        entries.add(ModItems.SAPPHIRE_PICKAXE);
                        entries.add(ModItems.SAPPHIRE_AXE);
                        entries.add(ModItems.SAPPHIRE_HOE);
                        entries.add(ModItems.SAPPHIRE_SHOVEL);
                        entries.add(ModItems.SAPPHIRE_SWORD);

                        entries.add(ModItems.SAPPHIRE_HELMET);
                        entries.add(ModItems.SAPPHIRE_CHESTPLATE);
                        entries.add(ModItems.SAPPHIRE_LEGGINGS);
                        entries.add(ModItems.SAPPHIRE_BOOTS);

                        entries.add(ModBlocks.CUT_SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.SAPPHIRE_BLOCK);
                        entries.add(ModBlocks.SOUND_BLOCK);

                        entries.add(ModItems.TOMATO_SEEDS);
                        entries.add(ModItems.CORN_SEEDS);
                        entries.add(ModItems.TOMATO);
                        entries.add(ModItems.CORN);
                        entries.add(ModBlocks.DAHLIA);
                        entries.add(ModBlocks.KUKKA1);

                        entries.add(ModBlocks.CHESTNUT_LOG);
                        entries.add(ModBlocks.CHESTNUT_WOOD);
                        entries.add(ModBlocks.STRIPPED_CHESTNUT_LOG);
                        entries.add(ModBlocks.STRIPPED_CHESTNUT_WOOD);
                        entries.add(ModBlocks.CHESTNUT_PLANKS);
                        entries.add(ModBlocks.CHESTNUT_LEAVES);

                        //entries.add(ModItems.CHESTNUT_SIGN);
                        //entries.add(ModItems.HANGING_CHESTNUT_SIGN);
                        entries.add(ModItems.DICE);


                        entries.add(ModBlocks.SAPPHIRE_ORE);
                        entries.add(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
                        entries.add(ModBlocks.NETHER_SAPPHIRE_ORE);
                        entries.add(ModBlocks.END_STONE_SAPPHIRE_ORE);


                        entries.add(ModBlocks.SAPPHIRE_FENCE);
                        entries.add(ModBlocks.SAPPHIRE_FENCE_GATE);
                        entries.add(ModBlocks.SAPPHIRE_SLAB);
                        entries.add(ModBlocks.SAPPHIRE_WALL);
                        entries.add(ModBlocks.SAPPHIRE_BUTTON);
                        entries.add(ModBlocks.SAPPHIRE_DOOR);
                        entries.add(ModBlocks.SAPPHIRE_TRAPDOOR);
                        entries.add(ModBlocks.SAPPHIRE_STAIRS);
                        entries.add(ModBlocks.SAPPHIRE_PRESSURE_PLATE);

                        //entries.add(Items.DIAMOND);

                    }).build());
    public static void registerItemGroups() {
        TutorialMod.LOGGER.info("Registering item groups for " + TutorialMod.MOD_ID);
    }
}
