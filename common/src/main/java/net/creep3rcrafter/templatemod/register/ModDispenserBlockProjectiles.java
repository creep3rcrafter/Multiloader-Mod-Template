package net.creep3rcrafter.templatemod.register;

import net.minecraft.core.Position;
import net.minecraft.core.dispenser.AbstractProjectileDispenseBehavior;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.DispenserBlock;
import org.jetbrains.annotations.NotNull;

public class ModDispenserBlockProjectiles {
    public static void registerBasicArrow(ItemLike item, AbstractArrow arrow) {
        DispenserBlock.registerBehavior(item, new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                arrow.setBaseDamage(((AbstractArrow)item).getBaseDamage());
                return arrow;
            }
        });
    }
    static {
        /*
        DispenserBlock.registerBehavior(ModItems.WOOD_ARROW.get(), new AbstractProjectileDispenseBehavior() {
            protected @NotNull Projectile getProjectile(@NotNull Level level, @NotNull Position position, @NotNull ItemStack itemStack) {
                WoodArrow arrow = new WoodArrow(level, position.x(), position.y(), position.z());
                arrow.pickup = AbstractArrow.Pickup.ALLOWED;
                arrow.setEffectsFromItem(itemStack);
                arrow.setBaseDamage(ModItems.WOOD_ARROW.get().getBaseDamage());
                return arrow;
            }
        });
         */
    }
}
