package net.siimon.tutorialmod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent BLUEBERRY = new FoodComponent.Builder().hunger(3).saturationModifier(0.3f).
            statusEffect(new StatusEffectInstance(StatusEffects.LUCK, 200), 0.25f).build();
    public static final FoodComponent COOKED_BLUEBERRY_PIE = new FoodComponent.Builder().hunger(20).saturationModifier(0.9f).
            statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2000), 1f).build();
}
