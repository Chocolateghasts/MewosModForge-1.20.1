package net.mewosmods.mewosmod.datagen;

import net.mewosmods.mewosmod.MewosMod;
import net.mewosmods.mewosmod.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {

    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MewosMod.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.DARK_ESSENCE_ORE);
        blockWithItem(ModBlocks.MAGMA_ESSENCE_ORE);
        blockWithItem(ModBlocks.DARK_STEEL_BLOCK);
        blockWithItem(ModBlocks.STEEL_BLOCK);
    }
    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
