
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nwtgtutorial.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.nwtgtutorial.block.BlockOfDirtBlock;
import net.mcreator.nwtgtutorial.NwtgTutorialMod;

public class NwtgTutorialModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, NwtgTutorialMod.MODID);
	public static final RegistryObject<Block> BLOCK_OF_DIRT = REGISTRY.register("block_of_dirt", () -> new BlockOfDirtBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
