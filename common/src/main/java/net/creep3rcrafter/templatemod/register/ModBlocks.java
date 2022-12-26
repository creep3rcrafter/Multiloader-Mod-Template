package net.creep3rcrafter.templatemod.register;

import dev.architectury.registry.registries.DeferredRegister;
import net.creep3rcrafter.templatemod.TemplateMod;
import net.minecraft.core.Registry;
import net.minecraft.world.level.block.Block;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(TemplateMod.MOD_ID, Registry.BLOCK_REGISTRY);
}
