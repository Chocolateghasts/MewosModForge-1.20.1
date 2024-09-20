package net.mewosmods.mewosmod.datagen;

import net.mewosmods.mewosmod.MewosMod;
import net.mewosmods.mewosmod.block.ModBlocks;
import net.mewosmods.mewosmod.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MewosMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        this.tag(Tags.Blocks.ORES)
                .add(ModBlocks.DARK_ESSENCE_ORE.get())
                .add(ModBlocks.MAGMA_ESSENCE_ORE.get());
        this.tag(ModTags.Blocks.METAL_DETECTOR_VALUABLES)
            .addTag(Tags.Blocks.ORES);
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.MAGMA_ESSENCE_ORE.get())
                .add(ModBlocks.DARK_ESSENCE_ORE.get())
                .add(ModBlocks.DARK_STEEL_BLOCK.get());
        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.STEEL_BLOCK.get());
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.DARK_ESSENCE_ORE.get())
                .add(ModBlocks.MAGMA_ESSENCE_ORE.get())
                .add(ModBlocks.STEEL_BLOCK.get())
                .add(ModBlocks.DARK_STEEL_BLOCK.get());
    }
}
