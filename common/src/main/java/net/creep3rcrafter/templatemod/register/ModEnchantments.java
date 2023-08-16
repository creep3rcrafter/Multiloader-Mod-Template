package net.creep3rcrafter.templatemod.register;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import net.creep3rcrafter.templatemod.TemplateMod;
import net.minecraft.core.Registry;
import net.minecraft.world.item.enchantment.Enchantment;

public class ModEnchantments {

    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister.create(TemplateMod.MOD_ID, Registry.ENCHANTMENT_REGISTRY);
    //public static final RegistrySupplier<Enchantment> MOMENTUM_ENCHANTMENT = ENCHANTMENTS.register("momentum_enchantment", ()-> new MomentumEnchantment(Enchantment.Rarity.RARE, EnchantmentCategory.DIGGER, new EquipmentSlot[]{EquipmentSlot.MAINHAND}));
}
