package net.mewosmods.mewosmod.item;

import net.mewosmods.mewosmod.MewosMod;
import net.mewosmods.mewosmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MewosMod.MOD_ID);

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }

    public static final RegistryObject<CreativeModeTab> Materials = CREATIVE_MODE_TABS.register("materials",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.STEELINGOT.get()))
                    .title(Component.translatable("materials"))
                    .displayItems((pParamaters, pOutput) -> {
                        pOutput.accept(ModItems.STEELINGOT.get());
                        pOutput.accept(ModBlocks.STEEL_BLOCK.get());
                        pOutput.accept(ModItems.DARKSTEELINGOT.get());
                        pOutput.accept(ModBlocks.DARK_STEEL_BLOCK.get());
                        pOutput.accept(ModBlocks.DARK_ESSENCE_ORE.get());
                        pOutput.accept(ModItems.DARK_ESSENCE.get());
                    })
                    .build());

}
