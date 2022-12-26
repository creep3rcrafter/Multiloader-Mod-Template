package net.creep3rcrafter.templatemod.forge;

import dev.architectury.platform.forge.EventBuses;
import net.creep3rcrafter.templatemod.TemplateMod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import static net.creep3rcrafter.templatemod.TemplateMod.MOD_ID;

@Mod(MOD_ID)
public class TemplateModForge {
    public TemplateModForge() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        EventBuses.registerModEventBus(MOD_ID, eventBus);
        TemplateMod.init();
        eventBus.addListener(this::commonSetupEvent);
    }

    private void commonSetupEvent(FMLCommonSetupEvent event){
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        //eventBus.register(new BrewingRecipes()); //Example
    }
}
