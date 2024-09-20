package net.mewosmods.mewosmod.datagen;

import net.mewosmods.mewosmod.MewosMod;
import net.mewosmods.mewosmod.item.ModItems;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MewosMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.STEELINGOT);
        simpleItem(ModItems.DARKSTEELINGOT);
        simpleItem(ModItems.DARK_ESSENCE);
        simpleItem(ModItems.MAGMA_FRUIT);
        simpleItem(ModItems.METAL_DETECTOR);
        simpleItem(ModItems.MAGMA_ESSENCE);
    }
    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MewosMod.MOD_ID, "item/" + item.getId().getPath()));
    }
}
