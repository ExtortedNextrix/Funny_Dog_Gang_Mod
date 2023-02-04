package net.nextrix.funnymod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nextrix.funnymod.FunnyMod;

public class ModItems {

        public static final Item DOG_BONK = registerItem("dog_bonk",
                new Item(new FabricItemSettings().group(ModItemGroup.FUNNY_GROUP).maxDamage(16)));


        private static Item registerItem(String name, Item item) {
            return Registry.register(Registry.ITEM, new Identifier(FunnyMod.MOD_ID, name), item);
        }

        public static void registerModItems() {
            FunnyMod.LOGGER.info("Registering Mod Items for " + FunnyMod.MOD_ID);
        }

}



