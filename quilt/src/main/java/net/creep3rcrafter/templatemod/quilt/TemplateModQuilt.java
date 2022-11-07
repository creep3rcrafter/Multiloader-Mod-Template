package net.creep3rcrafter.templatemod.quilt;

import net.creep3rcrafter.templatemod.fabriclike.TemplateModFabricLike;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;

public class TemplateModQuilt implements ModInitializer {
    @Override
    public void onInitialize(ModContainer mod) {
        TemplateModFabricLike.init();
    }
}