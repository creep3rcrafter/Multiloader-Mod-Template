package net.creep3rcrafter.templatemod.register;

import dev.architectury.registry.registries.DeferredRegister;
import net.creep3rcrafter.templatemod.TemplateMod;
import net.minecraft.core.Registry;
import net.minecraft.world.level.material.Fluid;
public class ModFluids {
    public static final DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(TemplateMod.MOD_ID, Registry.FLUID_REGISTRY);
}
