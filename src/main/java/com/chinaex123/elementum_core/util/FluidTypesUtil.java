package com.chinaex123.elementum_core.util;

import com.chinaex123.elementum_core.ElementumCore;
import com.chinaex123.elementum_core.init.ECElementFluidTypes;
import com.chinaex123.elementum_core.init.ECElementGasTypes;
import net.minecraft.sounds.SoundEvents;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredHolder;

public class FluidTypesUtil {

    /**
     * @param name            流体名称
     * @param fallDistance    摔落距离修正系数(默认0.5)
     * @param lightLevel      发光等级(默认0)
     * @param density         密度，影响浮沉(默认1000)
     * @param temperature     温度，影响表现与伤害(默认300)
     * @param viscosity       粘稠度。数值越大流动越慢(默认1000)
     * @param motionScale     实体在流体中的运动速度缩放。数值越小越慢(默认0.014)
     * @param canHydrate      是否能湿润耕地(默认false)
     * @param convertToSource 是否能形成无限源(默认false)
     * @param canExtinguish   是否能扑灭实体身上的火(默认false)
     * @param supportsBoating 是否能漂浮在流体中(默认false)
     * @param canPushEntity   流体是否能推动实体(默认true)
     * @param canDrown        实体是否会在其中溺水(默认true)
     * @param canSwim         实体是否能在其中游泳(默认true)
     *
     * @return 用于延迟获取注册结果。
     */
    public static DeferredHolder<FluidType, FluidType> registerFluid(
            String name,
            float fallDistance,
            int lightLevel,
            int density,
            int temperature,
            int viscosity,
            double motionScale,
            boolean canHydrate,
            boolean convertToSource,
            boolean supportsBoating,
            boolean canExtinguish,
            boolean canPushEntity,
            boolean canDrown,
            boolean canSwim
    ) {
        return ECElementFluidTypes.FLUID_TYPES.register(name, () -> new FluidType(FluidType.Properties.create()
                .descriptionId("block." + ElementumCore.MODID + "." + name)
                .fallDistanceModifier(fallDistance)
                .lightLevel(lightLevel)
                .density(density)
                .temperature(temperature)
                .viscosity(viscosity)
                .canHydrate(canHydrate)
                .canConvertToSource(convertToSource)
                .canSwim(canSwim)
                .canDrown(canDrown)
                .canPushEntity(canPushEntity)
                .canExtinguish(canExtinguish)
                .supportsBoating(supportsBoating)
                .motionScale(motionScale)
                .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
        ));
    }

    /**
     * @param name            流体名称
     * @param fallDistance    摔落距离修正系数(默认0.5)
     * @param lightLevel      发光等级(默认0)
     * @param density         密度，影响浮沉(默认1000)
     * @param temperature     温度，影响表现与伤害(默认300)
     * @param viscosity       粘稠度。数值越大流动越慢(默认1000)
     * @param motionScale     实体在流体中的运动速度缩放。数值越小越慢(默认0.014)
     * @param canHydrate      是否能湿润耕地(默认false)
     * @param convertToSource 是否能形成无限源(默认false)
     * @param canExtinguish   是否能扑灭实体身上的火(默认false)
     * @param supportsBoating 是否能漂浮在流体中(默认false)
     * @param canPushEntity   流体是否能推动实体(默认true)
     * @param canDrown        实体是否会在其中溺水(默认true)
     * @param canSwim         实体是否能在其中游泳(默认true)
     *
     * @return 用于延迟获取注册结果。
     */
    public static DeferredHolder<FluidType, FluidType> registerGas(
            String name,
            float fallDistance,
            int lightLevel,
            int density,
            int temperature,
            int viscosity,
            double motionScale,
            boolean canHydrate,
            boolean convertToSource,
            boolean supportsBoating,
            boolean canExtinguish,
            boolean canPushEntity,
            boolean canDrown,
            boolean canSwim
    ) {
        return ECElementGasTypes.GAS_TYPES.register(name, () -> new FluidType(FluidType.Properties.create()
                .descriptionId("block." + ElementumCore.MODID + "." + name)
                .fallDistanceModifier(fallDistance)
                .lightLevel(lightLevel)
                .density(density)
                .temperature(temperature)
                .viscosity(viscosity)
                .canHydrate(canHydrate)
                .canConvertToSource(convertToSource)
                .canSwim(canSwim)
                .canDrown(canDrown)
                .canPushEntity(canPushEntity)
                .canExtinguish(canExtinguish)
                .supportsBoating(supportsBoating)
                .motionScale(motionScale)
                .sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
                .sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY)
        ));
    }
}
