package net.mewosmods.mewosmod.item;

import net.mewosmods.mewosmod.MewosMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MewosMod.MOD_ID);

    public static final RegistryObject<Item> STEELINGOT = ITEMS.register("steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARKSTEELINGOT = ITEMS.register("dark_steel_ingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DARK_ESSENCE = ITEMS.register("dark_essence",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
