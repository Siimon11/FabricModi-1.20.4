package net.siimon.tutorialmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.data.family.BlockFamilies;
import net.minecraft.data.family.BlockFamily;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.siimon.tutorialmod.TutorialMod;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.siimon.tutorialmod.block.custom.*;
import net.siimon.tutorialmod.sound.ModSounds;

public class ModBlocks {
    public static final Block CUT_SAPPHIRE_BLOCK = registerBlock("cut_sapphire_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block SAPPHIRE_BLOCK = registerBlock("sapphire_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(BlockSoundGroup.AMETHYST_BLOCK)));
    public static final Block SOUND_BLOCK = registerBlock("sound_block",
            new SoundBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).sounds(ModSounds.SOUND_BLOCK_SOUNDS)));
    public static final Block SAPPHIRE_STAIRS = registerBlock("sapphire_stairs",
            new StairsBlock(ModBlocks.SAPPHIRE_BLOCK.getDefaultState(), FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block SAPPHIRE_SLAB = registerBlock("sapphire_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block SAPPHIRE_BUTTON = registerBlock("sapphire_button",
            new ButtonBlock(BlockSetType.IRON, 10, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block SAPPHIRE_PRESSURE_PLATE = registerBlock("sapphire_pressure_plate",
            new PressurePlateBlock(BlockSetType.IRON, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block SAPPHIRE_FENCE = registerBlock("sapphire_fence",
            new FenceBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block SAPPHIRE_FENCE_GATE = registerBlock("sapphire_fence_gate",
            new FenceGateBlock(WoodType.ACACIA, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block SAPPHIRE_WALL = registerBlock("sapphire_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK)));
    public static final Block SAPPHIRE_DOOR = registerBlock("sapphire_door",
            new DoorBlock(BlockSetType.IRON, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));
    public static final Block SAPPHIRE_TRAPDOOR = registerBlock("sapphire_trapdoor",
            new TrapdoorBlock(BlockSetType.IRON, FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));

    public static final Block SAPPHIRE_ORE = registerBlock("sapphire_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(1, 2), FabricBlockSettings.copyOf(Blocks.STONE).strength(2f)));
    public static final Block DEEPSLATE_SAPPHIRE_ORE = registerBlock("deepslate_sapphire_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(2, 3), FabricBlockSettings.copyOf(Blocks.DEEPSLATE).strength(4f)));
    public static final Block NETHER_SAPPHIRE_ORE = registerBlock("nether_sapphire_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(1, 2), FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(1.5f)));
    public static final Block END_STONE_SAPPHIRE_ORE = registerBlock("end_stone_sapphire_ore",
            new ExperienceDroppingBlock(UniformIntProvider.create(3, 4), FabricBlockSettings.copyOf(Blocks.END_STONE).strength(3f)));

    public static final Block TOMATO_CROP = Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, "tomato_crop"),
            new TomatoCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block CORN_CROP = Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, "corn_crop"),
            new CornCropBlock(FabricBlockSettings.copyOf(Blocks.WHEAT)));
    public static final Block DAHLIA = registerBlock("dahlia",
            new FlowerBlock(StatusEffects.FIRE_RESISTANCE, 10, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_DAHLIA = Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, "potted_dahlia"),
            new FlowerPotBlock(DAHLIA, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block KUKKA1 = registerBlock("kukka1",
            new FlowerBlock(StatusEffects.HASTE, 10, FabricBlockSettings.copyOf(Blocks.ALLIUM).nonOpaque().noCollision()));
    public static final Block POTTED_KUKKA1 = Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, "potted_kukka1"),
            new FlowerPotBlock(KUKKA1, FabricBlockSettings.copyOf(Blocks.POTTED_ALLIUM).nonOpaque()));
    public static final Block GEM_POLISHING_STATION = registerBlock("gem_polishing_station",
            new GemPolishingStationBlock(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).nonOpaque()));
    public static final Block CHESTNUT_LOG = registerBlock("chestnut_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_LOG).strength(4f)));
    public static final Block CHESTNUT_WOOD = registerBlock("chestnut_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.OAK_WOOD).strength(4f)));
    public static final Block STRIPPED_CHESTNUT_LOG = registerBlock("stripped_chestnut_log",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_DARK_OAK_LOG).strength(4f)));
    public static final Block STRIPPED_CHESTNUT_WOOD = registerBlock("stripped_chestnut_wood",
            new PillarBlock(FabricBlockSettings.copyOf(Blocks.STRIPPED_OAK_WOOD).strength(4f)));
    public static final Block CHESTNUT_PLANKS = registerBlock("chestnut_planks",
            new Block(FabricBlockSettings.copyOf(Blocks.OAK_PLANKS).strength(4f)));
    public static final Block CHESTNUT_LEAVES = registerBlock("chestnut_leaves",
            new LeavesBlock(FabricBlockSettings.copyOf(Blocks.OAK_LEAVES).strength(4f).nonOpaque()));
    public static final Identifier CHESTNUT_SIGN_TEXTURE = new Identifier(TutorialMod.MOD_ID, "entity/signs/chestnut");
    public static final Identifier CHESTNUT_HANGING_SIGN_TEXTURE = new Identifier(TutorialMod.MOD_ID, "entity/signs/hanging/chestnut");
    public static final Identifier CHESTNUT_HANGING_GUI_SIGN_TEXTURE = new Identifier(TutorialMod.MOD_ID, "textures/gui/hanging_signs/chestnut");
    /*
    public static final Block STANDING_CHESTNUT_SIGN = Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, "chestnut_standing_sign"),
            new TerraformSignBlock(CHESTNUT_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_SIGN)));
    public static final Block WALL_CHESTNUT_SIGN = Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, "chestnut_wall_sign"),
            new TerraformWallSignBlock(CHESTNUT_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_SIGN)));
    public static final Block HANGING_CHESTNUT_SIGN = Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, "chestnut_hanging_sign"),
            new TerraformHangingSignBlock(CHESTNUT_HANGING_SIGN_TEXTURE, CHESTNUT_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_HANGING_SIGN)));
    public static final Block WALL_HANGING_CHESTNUT_SIGN = Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, "chestnut_wall_hanging_sign"),
            new TerraformWallHangingSignBlock(CHESTNUT_HANGING_SIGN_TEXTURE, CHESTNUT_HANGING_GUI_SIGN_TEXTURE, FabricBlockSettings.copyOf(Blocks.OAK_WALL_HANGING_SIGN)));

     */

    public static final BlockFamily CHESTNUT_FAMILY = BlockFamilies.register(ModBlocks.CHESTNUT_PLANKS)
            //.sign(ModBlocks.STANDING_CHESTNUT_SIGN, ModBlocks.WALL_CHESTNUT_SIGN)
            .group("wooden").unlockCriterionName("has_planks").build();
    public static final Block DICE_BLOCK = Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, "dice_block"),
            new DiceBlock(FabricBlockSettings.copyOf(Blocks.STONE)));



    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(TutorialMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        TutorialMod.LOGGER.info("Registering ModBlocks for " + TutorialMod.MOD_ID);
    }
}
