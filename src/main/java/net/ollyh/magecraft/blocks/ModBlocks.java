package net.ollyh.magecraft.blocks;

import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.ollyh.magecraft.MageCraft;
import net.ollyh.magecraft.items.ModCreativeModeTab;
import net.ollyh.magecraft.items.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MageCraft.MOD_ID);
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
    public static final RegistryObject<Block> IOLITE_BLOCK = registerBlock("iolite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.MAGE_TAB);
    public static final RegistryObject<Block> POLISHED_IOLITE_BLOCK = registerBlock("polished_iolite_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.MAGE_TAB);
    public static final RegistryObject<Block> IOLITE_ORE = registerBlock("iolite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MAGE_TAB);
    public static final RegistryObject<Block> DEEPSLATE_IOLITE_ORE = registerBlock("deepslate_iolite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MAGE_TAB);

    public static final RegistryObject<Block> AMBER_BLOCK = registerBlock("amber_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops()), ModCreativeModeTab.MAGE_TAB);
    public static final RegistryObject<Block> AMBER_ORE = registerBlock("amber_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MAGE_TAB);
    public static final RegistryObject<Block> DEEPSLATE_AMBER_ORE = registerBlock("deepslate_amber_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(4f).requiresCorrectToolForDrops(),
                    UniformInt.of(3, 7)), ModCreativeModeTab.MAGE_TAB);
/*
    public static final RegistryObject<Block> ARCHAIC_GRASS_BLOCK = registerBlock("archaic_grass_block",
            () -> new GrassBlock(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.MAGE_TAB);
    public static final RegistryObject<Block> ARCHAIC_DIRT = registerBlock("archaic_dirt",
            () -> new Block(BlockBehaviour.Properties.of(Material.DIRT)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.MAGE_TAB);
    public static final RegistryObject<Block> ARCHAIC_STONE = registerBlock("archaic_stone",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(2f).requiresCorrectToolForDrops()), ModCreativeModeTab.MAGE_TAB);
 */
/*
    public static final RegistryObject<Block> ARCHAIC_SAND = registerBlock("archaic_sand",
            () -> new SandBlock(BlockBehaviour.Properties.of(Material.SAND)
                    .strength(2f).requiresCorrectToolForDrops().isSuffocating()), ModCreativeModeTab.MAGE_TAB);
 */



    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
