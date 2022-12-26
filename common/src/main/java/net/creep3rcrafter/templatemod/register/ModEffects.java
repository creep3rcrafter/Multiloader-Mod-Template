package net.creep3rcrafter.templatemod.register;

import dev.architectury.registry.registries.DeferredRegister;
import net.creep3rcrafter.templatemod.TemplateMod;
import net.minecraft.core.Registry;
import net.minecraft.world.effect.MobEffect;

public class ModEffects {
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(TemplateMod.MOD_ID, Registry.MOB_EFFECT_REGISTRY);
}
