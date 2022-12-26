package net.creep3rcrafter.templatemod;

import net.creep3rcrafter.templatemod.register.*;

public class TemplateMod {
    public static final String MOD_ID = "templatemod";

    public static void init() {
        ModItems.ITEMS.register();
        ModEffects.EFFECTS.register();
        ModBlocks.BLOCKS.register();
        ModFluids.FLUIDS.register();
        ModPotions.POTIONS.register();
        ModEntityTypes.ENTITY_TYPES.register();
        ModRecipeTypes.RECIPE_TYPES.register();
    }
}
