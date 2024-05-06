package net.siimon.tutorialmod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.loot.condition.AnyOfLootCondition;
import net.minecraft.loot.condition.BlockStatePropertyLootCondition;
import net.minecraft.predicate.StatePredicate;
import net.siimon.tutorialmod.block.ModBlocks;
import net.siimon.tutorialmod.block.custom.CornCropBlock;
import net.siimon.tutorialmod.block.custom.TomatoCropBlock;
import net.siimon.tutorialmod.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.server.loottable.BlockLootTableGenerator;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.entry.LeafEntry;
import net.minecraft.loot.entry.LootPoolEntry;
import net.minecraft.loot.function.ApplyBonusLootFunction;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.SAPPHIRE_BLOCK);
        addDrop(ModBlocks.CUT_SAPPHIRE_BLOCK);
        addDrop(ModBlocks.SOUND_BLOCK);

        addDrop(ModBlocks.SAPPHIRE_ORE, copperLikeOreDrops(ModBlocks.SAPPHIRE_ORE, ModItems.SAPPHIRE));
        addDrop(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, copperLikeOreDrops(ModBlocks.DEEPSLATE_SAPPHIRE_ORE, ModItems.SAPPHIRE));
        addDrop(ModBlocks.NETHER_SAPPHIRE_ORE, copperLikeOreDrops(ModBlocks.NETHER_SAPPHIRE_ORE, ModItems.SAPPHIRE));
        addDrop(ModBlocks.END_STONE_SAPPHIRE_ORE, copperLikeOreDrops(ModBlocks.END_STONE_SAPPHIRE_ORE, ModItems.SAPPHIRE));

        addDrop(ModBlocks.SAPPHIRE_STAIRS);
        addDrop(ModBlocks.SAPPHIRE_TRAPDOOR);
        addDrop(ModBlocks.SAPPHIRE_FENCE);
        addDrop(ModBlocks.SAPPHIRE_FENCE_GATE);
        addDrop(ModBlocks.SAPPHIRE_WALL);
        addDrop(ModBlocks.SAPPHIRE_BUTTON);
        addDrop(ModBlocks.SAPPHIRE_PRESSURE_PLATE);

        addDrop(ModBlocks.SAPPHIRE_DOOR, doorDrops(ModBlocks.SAPPHIRE_DOOR));
        addDrop(ModBlocks.SAPPHIRE_SLAB, slabDrops(ModBlocks.SAPPHIRE_SLAB));

        BlockStatePropertyLootCondition.Builder builder = BlockStatePropertyLootCondition.builder(ModBlocks.TOMATO_CROP).properties(StatePredicate.Builder.create()
                .exactMatch(TomatoCropBlock.AGE, 5));
        addDrop(ModBlocks.TOMATO_CROP, cropDrops(ModBlocks.TOMATO_CROP, ModItems.TOMATO, ModItems.TOMATO_SEEDS, builder));

        AnyOfLootCondition.Builder builder2 =
                BlockStatePropertyLootCondition.builder(ModBlocks.CORN_CROP).properties(StatePredicate.Builder.create()
                                .exactMatch(CornCropBlock.AGE, 7))
                        .or(BlockStatePropertyLootCondition.builder(ModBlocks.CORN_CROP).properties(StatePredicate.Builder.create()
                                .exactMatch(CornCropBlock.AGE, 8)));

        addDrop(ModBlocks.CORN_CROP, cropDrops(ModBlocks.CORN_CROP, ModItems.CORN, ModItems.CORN_SEEDS, builder2));

        addDrop(ModBlocks.DAHLIA);
        addPottedPlantDrops(ModBlocks.POTTED_DAHLIA);
        addDrop(ModBlocks.KUKKA1);
        addPottedPlantDrops(ModBlocks.POTTED_KUKKA1);

        addDrop(ModBlocks.CHESTNUT_LOG);
        addDrop(ModBlocks.CHESTNUT_WOOD);
        addDrop(ModBlocks.STRIPPED_CHESTNUT_LOG);
        addDrop(ModBlocks.STRIPPED_CHESTNUT_WOOD);
        addDrop(ModBlocks.CHESTNUT_PLANKS);

        addDrop(ModBlocks.CHESTNUT_LEAVES, leavesDrops(ModBlocks.CHESTNUT_LEAVES, ModBlocks.SAPPHIRE_BLOCK, 0.025f));
    }

    public LootTable.Builder copperLikeOreDrops(Block drop, Item item) {
        return BlockLootTableGenerator.dropsWithSilkTouch(drop, (LootPoolEntry.Builder)this.applyExplosionDecay(drop,
                ((LeafEntry.Builder)
                        ItemEntry.builder(item).apply(SetCountLootFunction
                                .builder(UniformLootNumberProvider.create(2.0f, 5.0f)))).apply(ApplyBonusLootFunction.oreDrops(Enchantments.FORTUNE))));
    }
}