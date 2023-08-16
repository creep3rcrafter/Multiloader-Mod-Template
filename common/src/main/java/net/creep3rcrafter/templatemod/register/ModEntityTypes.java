package net.creep3rcrafter.templatemod.register;

import dev.architectury.registry.registries.DeferredRegister;
import net.creep3rcrafter.templatemod.TemplateMod;
import net.minecraft.core.Registry;
import net.minecraft.world.entity.EntityType;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(TemplateMod.MOD_ID, Registry.ENTITY_TYPE_REGISTRY);

    /*
    public static final RegistrySupplier<EntityType<AmethystArrow>> AMETHYST_ARROW = ENTITY_TYPES.register("amethyst_arrow", () ->
            EntityType.Builder.<AmethystArrow>of(AmethystArrow::new, MobCategory.MISC).sized(0.5F, 0.5F).clientTrackingRange(4).updateInterval(20).build(
                    new ResourceLocation(Projectiles.MOD_ID, "amethyst_arrow").toString()));
     */
}
