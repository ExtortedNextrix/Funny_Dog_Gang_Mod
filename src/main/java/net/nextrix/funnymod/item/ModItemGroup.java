package net.nextrix.funnymod.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.nextrix.funnymod.FunnyMod;

public class ModItemGroup {

    public static final ItemGroup FUNNY_GROUP = FabricItemGroupBuilder.build(new Identifier(FunnyMod.MOD_ID, "funny"),
            () -> new ItemStack(ModItems.DOG_BONK));


}
