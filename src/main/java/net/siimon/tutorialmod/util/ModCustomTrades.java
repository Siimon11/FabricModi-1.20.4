package net.siimon.tutorialmod.util;

import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.enchantment.EnchantmentLevelEntry;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.EnchantedBookItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.village.TradeOffer;
import net.minecraft.village.VillagerProfession;
import net.siimon.tutorialmod.block.ModBlocks;
import net.siimon.tutorialmod.item.ModItems;
import net.siimon.tutorialmod.villager.ModVillagers;

public class ModCustomTrades {
    public static void registerCustomTrades() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 5),
                            new ItemStack(ModItems.COOKED_BLUEBERRY_PIE, 1),
                            6, 5,0.05f));
        });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(Items.EMERALD, 1),
                            new ItemStack(Items.BLUE_DYE, 1),
                            new ItemStack(ModItems.BLUEBERRY, 4),
                            12, 2,0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.LIBRARIAN,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.SAPPHIRE, 12),
                            EnchantedBookItem.forEnchantment(new EnchantmentLevelEntry(Enchantments.SOUL_SPEED, 5)),
                            6, 20,0.05f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER,1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.TOMATO, 12),
                            new ItemStack(ModBlocks.SOUND_BLOCK,2),
                            3,12,0.075f));
                });
        TradeOfferHelper.registerVillagerOffers(ModVillagers.SOUND_MASTER,2,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.RUBY_STAFF, 1),
                            new ItemStack(ModItems.SAPPHIRE_SHOVEL,1),
                            3,12,0.075f));
                });
        TradeOfferHelper.registerWanderingTraderOffers(1,
                factories -> {
                    factories.add((entity, random) -> new TradeOffer(
                            new ItemStack(ModItems.CUT_SAPPHIRE, 16),
                            new ItemStack(ModItems.METAL_DETECTOR, 1),
                            1, 12, 0.075f));
                });

    }
}
