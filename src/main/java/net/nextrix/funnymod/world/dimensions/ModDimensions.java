package net.nextrix.funnymod.world.dimensions;

import net.kyrptonaught.customportalapi.api.CustomPortalBuilder;
import net.minecraft.client.sound.Sound;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import net.nextrix.funnymod.FunnyMod;
import net.nextrix.funnymod.block.ModBlocks;
import net.nextrix.funnymod.item.ModItems;


public class ModDimensions {
    public static final RegistryKey<World> KJDIM_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(FunnyMod.MOD_ID, "kjdim"));
    public static final RegistryKey<DimensionType> KJDIM_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY, KJDIM_DIMENSION_KEY.getValue());

    public static void register() {
        FunnyMod.LOGGER.debug("Registering ModDimensions for " + FunnyMod.MOD_ID);

        CustomPortalBuilder.beginPortal()
                .frameBlock(ModBlocks.GONK_BLOCK)
                .destDimID(KJDIM_DIMENSION_KEY.getValue())
                .tintColor(255, 255, 255)
                .lightWithItem(ModItems.DOG_BONK)
                .onlyLightInOverworld()
                .registerPortal();

    }
}
