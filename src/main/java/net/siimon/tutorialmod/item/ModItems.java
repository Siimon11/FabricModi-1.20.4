package net.siimon.tutorialmod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.siimon.tutorialmod.TutorialMod;
import net.siimon.tutorialmod.block.ModBlocks;
import net.siimon.tutorialmod.item.custom.DiceItem;
import net.siimon.tutorialmod.item.custom.MetalDetectorItem;
import net.siimon.tutorialmod.item.custom.ModArmorItem;
import net.siimon.tutorialmod.sound.ModSounds;

public class ModItems {

    public static final  Item SAPPHIRE = registerItem("sapphire", new Item(new FabricItemSettings()));
    public static final  Item SAPPHIRE_STICK = registerItem("sapphire_stick", new Item(new FabricItemSettings()));
    public static final  Item COAL_PILE = registerItem("coal_pile", new Item(new FabricItemSettings()));
    public static final  Item TOMATO = registerItem("tomato", new Item(new FabricItemSettings()));
    public static final  Item BLUEBERRY = registerItem("blueberry", new Item(new FabricItemSettings().food(ModFoodComponents.BLUEBERRY)));
    public static final  Item CUT_SAPPHIRE = registerItem("cut_sapphire", new Item(new FabricItemSettings()));
    public static final  Item FLOUR = registerItem("flour", new Item(new FabricItemSettings()));
    public static final  Item BAR_BRAWL_MUSIC_DISC = registerItem("bar_brawl_music_disc", new MusicDiscItem(7, ModSounds.BAR_BRAWL, new  FabricItemSettings().maxCount(1), 122));
    public static final  Item RAW_BLUEBERRY_PIE = registerItem("raw_blueberry_pie", new Item(new FabricItemSettings()));
    public static final  Item COOKED_BLUEBERRY_PIE = registerItem("cooked_blueberry_pie", new Item(new FabricItemSettings().food(ModFoodComponents.COOKED_BLUEBERRY_PIE)));
    public static final  Item METAL_DETECTOR = registerItem("metal_detector", new MetalDetectorItem(new FabricItemSettings().maxDamage(64)));
    public static final  Item RUBY_STAFF = registerItem("ruby_staff", new Item(new FabricItemSettings().maxCount(1)));
    public static final  Item SAPPHIRE_PICKAXE = registerItem("sapphire_pickaxe", new PickaxeItem(ModToolMaterial.SAPPHIRE, 1,-2.8f, new FabricItemSettings()));
    public static final  Item SAPPHIRE_HOE = registerItem("sapphire_hoe", new HoeItem(ModToolMaterial.SAPPHIRE, -4,0f, new FabricItemSettings()));
    public static final  Item SAPPHIRE_AXE = registerItem("sapphire_axe", new AxeItem(ModToolMaterial.SAPPHIRE, 7,-3f, new FabricItemSettings()));
    public static final  Item SAPPHIRE_SHOVEL = registerItem("sapphire_shovel", new ShovelItem(ModToolMaterial.SAPPHIRE, 1,-3f, new FabricItemSettings()));
    public static final  Item SAPPHIRE_SWORD = registerItem("sapphire_sword", new SwordItem(ModToolMaterial.SAPPHIRE, 4,-2.4f, new FabricItemSettings()));
    public static final  Item SAPPHIRE_HELMET = registerItem("sapphire_helmet", new ModArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.HELMET, new FabricItemSettings()));
    public static final  Item SAPPHIRE_CHESTPLATE = registerItem("sapphire_chestplate", new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.CHESTPLATE, new FabricItemSettings()));
    public static final  Item SAPPHIRE_LEGGINGS = registerItem("sapphire_leggings", new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.LEGGINGS, new FabricItemSettings()));
    public static final  Item SAPPHIRE_BOOTS = registerItem("sapphire_boots", new ArmorItem(ModArmorMaterials.SAPPHIRE, ArmorItem.Type.BOOTS, new FabricItemSettings()));
    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new AliasedBlockItem(ModBlocks.TOMATO_CROP, new FabricItemSettings()));
    public static final Item CORN_SEEDS = registerItem("corn_seeds",
            new AliasedBlockItem(ModBlocks.CORN_CROP, new FabricItemSettings()));
    public static final Item CORN = registerItem("corn",
            new Item(new FabricItemSettings()));
    //public static final  Item CHESTNUT_SIGN = registerItem("chestnut_sign",
           // new SignItem(new FabricItemSettings().maxCount(16), ModBlocks.STANDING_CHESTNUT_SIGN, ModBlocks.WALL_CHESTNUT_SIGN));
    //public static final  Item HANGING_CHESTNUT_SIGN = registerItem("chestnut_hanging_sign",
            //new HangingSignItem(ModBlocks.HANGING_CHESTNUT_SIGN, ModBlocks.WALL_HANGING_CHESTNUT_SIGN, new FabricItemSettings().maxCount(16)));
    public static final Item DICE = registerItem("dice",
            new DiceItem(new FabricItemSettings()));



    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(SAPPHIRE);
        entries.add(CUT_SAPPHIRE);
        entries.add(FLOUR);
    }
    private static void addItemsToFoodItemGroup(FabricItemGroupEntries entries) {
        entries.add(FLOUR);
        entries.add(BLUEBERRY);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(TutorialMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        TutorialMod.LOGGER.info("Registering mod items for " + TutorialMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(ModItems::addItemsToFoodItemGroup);
    }
}
