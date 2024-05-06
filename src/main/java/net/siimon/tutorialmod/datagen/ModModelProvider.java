package net.siimon.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.siimon.tutorialmod.block.ModBlocks;
import net.siimon.tutorialmod.block.custom.CornCropBlock;
import net.siimon.tutorialmod.block.custom.TomatoCropBlock;
import net.siimon.tutorialmod.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool sapphirePool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CUT_SAPPHIRE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_SAPPHIRE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);

        sapphirePool.stairs(ModBlocks.SAPPHIRE_STAIRS);
        sapphirePool.slab(ModBlocks.SAPPHIRE_SLAB);
        sapphirePool.wall(ModBlocks.SAPPHIRE_WALL);
        sapphirePool.fence(ModBlocks.SAPPHIRE_FENCE);
        sapphirePool.fenceGate(ModBlocks.SAPPHIRE_FENCE_GATE);
        sapphirePool.button(ModBlocks.SAPPHIRE_BUTTON);
        sapphirePool.pressurePlate(ModBlocks.SAPPHIRE_PRESSURE_PLATE);

        blockStateModelGenerator.registerDoor(ModBlocks.SAPPHIRE_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.SAPPHIRE_TRAPDOOR);

        blockStateModelGenerator.registerCrop(ModBlocks.TOMATO_CROP, TomatoCropBlock.AGE, 0,1,2,3,4,5);
        blockStateModelGenerator.registerCrop(ModBlocks.CORN_CROP, CornCropBlock.AGE, 0,1,2,3,4,5,6,7,8);

        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.DAHLIA, ModBlocks.POTTED_DAHLIA, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerFlowerPotPlant(ModBlocks.KUKKA1, ModBlocks.POTTED_KUKKA1, BlockStateModelGenerator.TintType.NOT_TINTED);

        blockStateModelGenerator.registerSimpleState(ModBlocks.GEM_POLISHING_STATION);

        blockStateModelGenerator.registerLog(ModBlocks.CHESTNUT_LOG).log(ModBlocks.CHESTNUT_LOG).wood(ModBlocks.CHESTNUT_WOOD);
        blockStateModelGenerator.registerLog(ModBlocks.STRIPPED_CHESTNUT_LOG).log(ModBlocks.STRIPPED_CHESTNUT_LOG).wood(ModBlocks.STRIPPED_CHESTNUT_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.CHESTNUT_LEAVES);

        BlockStateModelGenerator.BlockTexturePool chestnut_pool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.CHESTNUT_PLANKS);
        chestnut_pool.family(ModBlocks.CHESTNUT_FAMILY);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.SAPPHIRE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CUT_SAPPHIRE, Models.GENERATED);

        itemModelGenerator.register(ModItems.COAL_PILE, Models.GENERATED);
        itemModelGenerator.register(ModItems.BLUEBERRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);

        itemModelGenerator.register(ModItems.SAPPHIRE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.SAPPHIRE_SWORD, Models.HANDHELD);

        //itemModelGenerator.register(ModItems.HANGING_CHESTNUT_SIGN, Models.GENERATED);

        itemModelGenerator.register(ModItems.CORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BAR_BRAWL_MUSIC_DISC, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.SAPPHIRE_BOOTS));

        itemModelGenerator.register(ModItems.DICE, Models.GENERATED);

    }
}
