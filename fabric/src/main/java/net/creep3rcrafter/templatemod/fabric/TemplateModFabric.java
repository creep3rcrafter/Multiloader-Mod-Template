package net.creep3rcrafter.templatemod.fabric;

import net.creep3rcrafter.templatemod.fabriclike.TemplateModFabricLike;
import net.fabricmc.api.ModInitializer;

public class TemplateModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        TemplateModFabricLike.init();
    }
}
