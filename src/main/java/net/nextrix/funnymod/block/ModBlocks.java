package net.nextrix.funnymod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nextrix.funnymod.FunnyMod;
import net.nextrix.funnymod.item.ModItemGroup;

public class ModBlocks {
        public static final Block GONK_BLOCK = registerBlock("gonk_block",
                new Block(FabricBlockSettings.copy(Blocks.WHITE_WOOL).requiresTool().strength(4.0f)), ModItemGroup.FUNNY_GROUP);



    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(FunnyMod.MOD_ID, name), block);
    }

    public static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(FunnyMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        FunnyMod.LOGGER.info("Registering ModBlocks for " + FunnyMod.MOD_ID);
    }
}



