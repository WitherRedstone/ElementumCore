package com.chinaex123.elementum_core.item;

import com.chinaex123.elementum_core.fluid.GasFluid;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.HitResult;
import org.jetbrains.annotations.NotNull;

public class GasBucketItem extends BucketItem {
    public GasBucketItem(Fluid fluid, Properties properties) {
        super(fluid, properties);
    }

    @Override
    public @NotNull InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        ItemStack stack = player.getItemInHand(hand);
        Fluid fluid = this.content;

        boolean isGas = fluid instanceof GasFluid && fluid.getFluidType().getDensity() < 0;

        if (!isGas) {
            return super.use(level, player, hand);
        }

        if (!level.isClientSide) {
            player.swing(hand, true);

            level.playSound(
                    null, player.getX(), player.getY(), player.getZ(),
                    SoundEvents.FIRE_EXTINGUISH, SoundSource.PLAYERS, 0.5f, 1.0f
            );

            HitResult hit = player.pick(5.0, 0.0f, false);
            double px, py, pz;
            if (hit instanceof BlockHitResult blockHit && hit.getType() == HitResult.Type.BLOCK) {
                BlockPos pos = blockHit.getBlockPos().relative(blockHit.getDirection());
                px = pos.getX() + 0.5;
                py = pos.getY() + 0.5;
                pz = pos.getZ() + 0.5;
            } else {
                var look = player.getLookAngle();
                px = player.getX() + look.x * 1.5;
                py = player.getEyeY() + look.y * 1.5;
                pz = player.getZ() + look.z * 1.5;
            }

            if (level instanceof ServerLevel serverLevel) {
                serverLevel.sendParticles(
                        ParticleTypes.CLOUD,
                        px, py, pz,
                        20,
                        0.3, 0.3, 0.3,
                        0.01
                );
            }

            if (!player.getAbilities().instabuild) {
                stack.shrink(1);
                if (stack.isEmpty()) {
                    player.setItemInHand(hand, new ItemStack(Items.BUCKET));
                } else {
                    player.getInventory().add(new ItemStack(Items.BUCKET));
                }
            }
        }

        return InteractionResultHolder.success(player.getItemInHand(hand));
    }
}