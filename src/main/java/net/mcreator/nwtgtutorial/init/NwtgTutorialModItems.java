
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.nwtgtutorial.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.nwtgtutorial.NwtgTutorialMod;

public class NwtgTutorialModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, NwtgTutorialMod.MODID);
	public static final RegistryObject<Item> BLOCK_OF_DIRT = block(NwtgTutorialModBlocks.BLOCK_OF_DIRT);

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
