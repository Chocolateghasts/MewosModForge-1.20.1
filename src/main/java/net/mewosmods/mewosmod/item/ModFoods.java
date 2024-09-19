package net.mewosmods.mewosmod.item;


import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties MAGMA_FRUIT = new FoodProperties.Builder().alwaysEat().nutrition(5)
            .saturationMod(0.6f).effect(() -> new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 1200), 1.0f).build();
}
