package net.creep3rcrafter.templatemod.register;

import dev.architectury.registry.registries.DeferredRegister;
import net.creep3rcrafter.templatemod.TemplateMod;
import net.minecraft.core.Registry;
import net.minecraft.world.item.alchemy.Potion;

public class ModPotions {
    public static final DeferredRegister<Potion> POTIONS = DeferredRegister.create(TemplateMod.MOD_ID, Registry.POTION_REGISTRY);
}
