package com.chinaex123.elementum_core.init;

import com.chinaex123.elementum_core.ElementumCore;
import com.chinaex123.elementum_core.util.ECColors;
import com.chinaex123.elementum_core.util.SimpleFluidExtension;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.BucketItem;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.material.Fluid;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.fluids.BaseFlowingFluid;
import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

/** 120个元素流体 */
public interface ECElementFluids {
    DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(BuiltInRegistries.FLUID, ElementumCore.MODID);

    FluidHolder LIQUID_HYDROGEN = registerFluid("liquid_hydrogen", () -> ECElementItems.LIQUID_HYDROGEN_BUCKET, () -> ECElementFluidBlocks.LIQUID_HYDROGEN,
            ECElementFluidTypes.LIQUID_HYDROGEN_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_HELIUM = registerFluid("liquid_helium", () -> ECElementItems.LIQUID_HELIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_HELIUM,
            ECElementFluidTypes.LIQUID_HELIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_LITHIUM = registerFluid("liquid_lithium", () -> ECElementItems.LIQUID_LITHIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_LITHIUM,
            ECElementFluidTypes.LIQUID_LITHIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_BERYLLIUM = registerFluid("liquid_beryllium", () -> ECElementItems.LIQUID_BERYLLIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_BERYLLIUM,
            ECElementFluidTypes.LIQUID_BERYLLIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_BORON = registerFluid("liquid_boron", () -> ECElementItems.LIQUID_BORON_BUCKET, () -> ECElementFluidBlocks.LIQUID_BORON,
            ECElementFluidTypes.LIQUID_BORON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_CARBON = registerFluid("liquid_carbon", () -> ECElementItems.LIQUID_CARBON_BUCKET, () -> ECElementFluidBlocks.LIQUID_CARBON,
            ECElementFluidTypes.LIQUID_CARBON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_NITROGEN = registerFluid("liquid_nitrogen", () -> ECElementItems.LIQUID_NITROGEN_BUCKET, () -> ECElementFluidBlocks.LIQUID_NITROGEN,
            ECElementFluidTypes.LIQUID_NITROGEN_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_OXYGEN = registerFluid("liquid_oxygen", () -> ECElementItems.LIQUID_OXYGEN_BUCKET, () -> ECElementFluidBlocks.LIQUID_OXYGEN,
            ECElementFluidTypes.LIQUID_OXYGEN_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_FLUORINE = registerFluid("liquid_fluorine", () -> ECElementItems.LIQUID_FLUORINE_BUCKET, () -> ECElementFluidBlocks.LIQUID_FLUORINE,
            ECElementFluidTypes.LIQUID_FLUORINE_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_NEON = registerFluid("liquid_neon", () -> ECElementItems.LIQUID_NEON_BUCKET, () -> ECElementFluidBlocks.LIQUID_NEON,
            ECElementFluidTypes.LIQUID_NEON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_SODIUM = registerFluid("liquid_sodium", () -> ECElementItems.LIQUID_SODIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_SODIUM,
            ECElementFluidTypes.LIQUID_SODIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_MAGNESIUM = registerFluid("liquid_magnesium", () -> ECElementItems.LIQUID_MAGNESIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_MAGNESIUM,
            ECElementFluidTypes.LIQUID_MAGNESIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_ALUMINUM = registerFluid("liquid_aluminum", () -> ECElementItems.LIQUID_ALUMINUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_ALUMINUM,
            ECElementFluidTypes.LIQUID_ALUMINUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_SILICON = registerFluid("liquid_silicon", () -> ECElementItems.LIQUID_SILICON_BUCKET, () -> ECElementFluidBlocks.LIQUID_SILICON,
            ECElementFluidTypes.LIQUID_SILICON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_PHOSPHORUS = registerFluid("liquid_phosphorus", () -> ECElementItems.LIQUID_PHOSPHORUS_BUCKET, () -> ECElementFluidBlocks.LIQUID_PHOSPHORUS,
            ECElementFluidTypes.LIQUID_PHOSPHORUS_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_SULFUR = registerFluid("liquid_sulfur", () -> ECElementItems.LIQUID_SULFUR_BUCKET, () -> ECElementFluidBlocks.LIQUID_SULFUR,
            ECElementFluidTypes.LIQUID_SULFUR_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_CHLORINE = registerFluid("liquid_chlorine", () -> ECElementItems.LIQUID_CHLORINE_BUCKET, () -> ECElementFluidBlocks.LIQUID_CHLORINE,
            ECElementFluidTypes.LIQUID_CHLORINE_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_ARGON = registerFluid("liquid_argon", () -> ECElementItems.LIQUID_ARGON_BUCKET, () -> ECElementFluidBlocks.LIQUID_ARGON,
            ECElementFluidTypes.LIQUID_ARGON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_POTASSIUM = registerFluid("liquid_potassium", () -> ECElementItems.LIQUID_POTASSIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_POTASSIUM,
            ECElementFluidTypes.LIQUID_POTASSIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_CALCIUM = registerFluid("liquid_calcium", () -> ECElementItems.LIQUID_CALCIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_CALCIUM,
            ECElementFluidTypes.LIQUID_CALCIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_SCANDIUM = registerFluid("liquid_scandium", () -> ECElementItems.LIQUID_SCANDIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_SCANDIUM,
            ECElementFluidTypes.LIQUID_SCANDIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_TITANIUM = registerFluid("liquid_titanium", () -> ECElementItems.LIQUID_TITANIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_TITANIUM,
            ECElementFluidTypes.LIQUID_TITANIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_VANADIUM = registerFluid("liquid_vanadium", () -> ECElementItems.LIQUID_VANADIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_VANADIUM,
            ECElementFluidTypes.LIQUID_VANADIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_CHROMIUM = registerFluid("liquid_chromium", () -> ECElementItems.LIQUID_CHROMIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_CHROMIUM,
            ECElementFluidTypes.LIQUID_CHROMIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_MANGANESE = registerFluid("liquid_manganese", () -> ECElementItems.LIQUID_MANGANESE_BUCKET, () -> ECElementFluidBlocks.LIQUID_MANGANESE,
            ECElementFluidTypes.LIQUID_MANGANESE_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_IRON = registerFluid("liquid_iron", () -> ECElementItems.LIQUID_IRON_BUCKET, () -> ECElementFluidBlocks.LIQUID_IRON,
            ECElementFluidTypes.LIQUID_IRON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_COBALT = registerFluid("liquid_cobalt", () -> ECElementItems.LIQUID_COBALT_BUCKET, () -> ECElementFluidBlocks.LIQUID_COBALT,
            ECElementFluidTypes.LIQUID_COBALT_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_NICKEL = registerFluid("liquid_nickel", () -> ECElementItems.LIQUID_NICKEL_BUCKET, () -> ECElementFluidBlocks.LIQUID_NICKEL,
            ECElementFluidTypes.LIQUID_NICKEL_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_COPPER = registerFluid("liquid_copper", () -> ECElementItems.LIQUID_COPPER_BUCKET, () -> ECElementFluidBlocks.LIQUID_COPPER,
            ECElementFluidTypes.LIQUID_COPPER_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_ZINC = registerFluid("liquid_zinc", () -> ECElementItems.LIQUID_ZINC_BUCKET, () -> ECElementFluidBlocks.LIQUID_ZINC,
            ECElementFluidTypes.LIQUID_ZINC_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_GALLIUM = registerFluid("liquid_gallium", () -> ECElementItems.LIQUID_GALLIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_GALLIUM,
            ECElementFluidTypes.LIQUID_GALLIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_GERMANIUM = registerFluid("liquid_germanium", () -> ECElementItems.LIQUID_GERMANIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_GERMANIUM,
            ECElementFluidTypes.LIQUID_GERMANIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_ARSENIC = registerFluid("liquid_arsenic", () -> ECElementItems.LIQUID_ARSENIC_BUCKET, () -> ECElementFluidBlocks.LIQUID_ARSENIC,
            ECElementFluidTypes.LIQUID_ARSENIC_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_SELENIUM = registerFluid("liquid_selenium", () -> ECElementItems.LIQUID_SELENIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_SELENIUM,
            ECElementFluidTypes.LIQUID_SELENIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder BROMINE = registerFluid("bromine", () -> ECElementItems.BROMINE_BUCKET, () -> ECElementFluidBlocks.BROMINE,
            ECElementFluidTypes.BROMINE_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_KRYPTON = registerFluid("liquid_krypton", () -> ECElementItems.LIQUID_KRYPTON_BUCKET, () -> ECElementFluidBlocks.LIQUID_KRYPTON,
            ECElementFluidTypes.LIQUID_KRYPTON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_RUBIDIUM = registerFluid("liquid_rubidium", () -> ECElementItems.LIQUID_RUBIDIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_RUBIDIUM,
            ECElementFluidTypes.LIQUID_RUBIDIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_STRONTIUM = registerFluid("liquid_strontium", () -> ECElementItems.LIQUID_STRONTIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_STRONTIUM,
            ECElementFluidTypes.LIQUID_STRONTIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_YTTRIUM = registerFluid("liquid_yttrium", () -> ECElementItems.LIQUID_YTTRIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_YTTRIUM,
            ECElementFluidTypes.LIQUID_YTTRIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_ZIRCONIUM = registerFluid("liquid_zirconium", () -> ECElementItems.LIQUID_ZIRCONIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_ZIRCONIUM,
            ECElementFluidTypes.LIQUID_ZIRCONIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_NIOBIUM = registerFluid("liquid_niobium", () -> ECElementItems.LIQUID_NIOBIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_NIOBIUM,
            ECElementFluidTypes.LIQUID_NIOBIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_MOLYBDENUM = registerFluid("liquid_molybdenum", () -> ECElementItems.LIQUID_MOLYBDENUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_MOLYBDENUM,
            ECElementFluidTypes.LIQUID_MOLYBDENUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_TECHNETIUM = registerFluid("liquid_technetium", () -> ECElementItems.LIQUID_TECHNETIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_TECHNETIUM,
            ECElementFluidTypes.LIQUID_TECHNETIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_RUTHENIUM = registerFluid("liquid_ruthenium", () -> ECElementItems.LIQUID_RUTHENIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_RUTHENIUM,
            ECElementFluidTypes.LIQUID_RUTHENIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_RHODIUM = registerFluid("liquid_rhodium", () -> ECElementItems.LIQUID_RHODIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_RHODIUM,
            ECElementFluidTypes.LIQUID_RHODIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_PALLADIUM = registerFluid("liquid_palladium", () -> ECElementItems.LIQUID_PALLADIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_PALLADIUM,
            ECElementFluidTypes.LIQUID_PALLADIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_SILVER = registerFluid("liquid_silver", () -> ECElementItems.LIQUID_SILVER_BUCKET, () -> ECElementFluidBlocks.LIQUID_SILVER,
            ECElementFluidTypes.LIQUID_SILVER_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_CADMIUM = registerFluid("liquid_cadmium", () -> ECElementItems.LIQUID_CADMIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_CADMIUM,
            ECElementFluidTypes.LIQUID_CADMIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_INDIUM = registerFluid("liquid_indium", () -> ECElementItems.LIQUID_INDIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_INDIUM,
            ECElementFluidTypes.LIQUID_INDIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_TIN = registerFluid("liquid_tin", () -> ECElementItems.LIQUID_TIN_BUCKET, () -> ECElementFluidBlocks.LIQUID_TIN,
            ECElementFluidTypes.LIQUID_TIN_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_ANTIMONY = registerFluid("liquid_antimony", () -> ECElementItems.LIQUID_ANTIMONY_BUCKET, () -> ECElementFluidBlocks.LIQUID_ANTIMONY,
            ECElementFluidTypes.LIQUID_ANTIMONY_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_TELLURIUM = registerFluid("liquid_tellurium", () -> ECElementItems.LIQUID_TELLURIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_TELLURIUM,
            ECElementFluidTypes.LIQUID_TELLURIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_IODINE = registerFluid("liquid_iodine", () -> ECElementItems.LIQUID_IODINE_BUCKET, () -> ECElementFluidBlocks.LIQUID_IODINE,
            ECElementFluidTypes.LIQUID_IODINE_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_XENON = registerFluid("liquid_xenon", () -> ECElementItems.LIQUID_XENON_BUCKET, () -> ECElementFluidBlocks.LIQUID_XENON,
            ECElementFluidTypes.LIQUID_XENON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_CESIUM = registerFluid("liquid_cesium", () -> ECElementItems.LIQUID_CESIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_CESIUM,
            ECElementFluidTypes.LIQUID_CESIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_BARIUM = registerFluid("liquid_barium", () -> ECElementItems.LIQUID_BARIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_BARIUM,
            ECElementFluidTypes.LIQUID_BARIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_LANTHANUM = registerFluid("liquid_lanthanum", () -> ECElementItems.LIQUID_LANTHANUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_LANTHANUM,
            ECElementFluidTypes.LIQUID_LANTHANUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_CERIUM = registerFluid("liquid_cerium", () -> ECElementItems.LIQUID_CERIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_CERIUM,
            ECElementFluidTypes.LIQUID_CERIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_PRASEODYMIUM = registerFluid("liquid_praseodymium", () -> ECElementItems.LIQUID_PRASEODYMIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_PRASEODYMIUM,
            ECElementFluidTypes.LIQUID_PRASEODYMIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_NEODYMIUM = registerFluid("liquid_neodymium", () -> ECElementItems.LIQUID_NEODYMIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_NEODYMIUM,
            ECElementFluidTypes.LIQUID_NEODYMIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_PROMETHIUM = registerFluid("liquid_promethium", () -> ECElementItems.LIQUID_PROMETHIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_PROMETHIUM,
            ECElementFluidTypes.LIQUID_PROMETHIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_SAMARIUM = registerFluid("liquid_samarium", () -> ECElementItems.LIQUID_SAMARIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_SAMARIUM,
            ECElementFluidTypes.LIQUID_SAMARIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_EUROPIUM = registerFluid("liquid_europium", () -> ECElementItems.LIQUID_EUROPIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_EUROPIUM,
            ECElementFluidTypes.LIQUID_EUROPIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_GADOLINIUM = registerFluid("liquid_gadolinium", () -> ECElementItems.LIQUID_GADOLINIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_GADOLINIUM,
            ECElementFluidTypes.LIQUID_GADOLINIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_TERBIUM = registerFluid("liquid_terbium", () -> ECElementItems.LIQUID_TERBIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_TERBIUM,
            ECElementFluidTypes.LIQUID_TERBIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_DYSPROSIUM = registerFluid("liquid_dysprosium", () -> ECElementItems.LIQUID_DYSPROSIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_DYSPROSIUM,
            ECElementFluidTypes.LIQUID_DYSPROSIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_HOLMIUM = registerFluid("liquid_holmium", () -> ECElementItems.LIQUID_HOLMIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_HOLMIUM,
            ECElementFluidTypes.LIQUID_HOLMIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_ERBIUM = registerFluid("liquid_erbium", () -> ECElementItems.LIQUID_ERBIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_ERBIUM,
            ECElementFluidTypes.LIQUID_ERBIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_THULIUM = registerFluid("liquid_thulium", () -> ECElementItems.LIQUID_THULIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_THULIUM,
            ECElementFluidTypes.LIQUID_THULIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_YTTERBIUM = registerFluid("liquid_ytterbium", () -> ECElementItems.LIQUID_YTTERBIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_YTTERBIUM,
            ECElementFluidTypes.LIQUID_YTTERBIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_LUTETIUM = registerFluid("liquid_lutetium", () -> ECElementItems.LIQUID_LUTETIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_LUTETIUM,
            ECElementFluidTypes.LIQUID_LUTETIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_HAFNIUM = registerFluid("liquid_hafnium", () -> ECElementItems.LIQUID_HAFNIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_HAFNIUM,
            ECElementFluidTypes.LIQUID_HAFNIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_TANTALUM = registerFluid("liquid_tantalum", () -> ECElementItems.LIQUID_TANTALUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_TANTALUM,
            ECElementFluidTypes.LIQUID_TANTALUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_TUNGSTEN = registerFluid("liquid_tungsten", () -> ECElementItems.LIQUID_TUNGSTEN_BUCKET, () -> ECElementFluidBlocks.LIQUID_TUNGSTEN,
            ECElementFluidTypes.LIQUID_TUNGSTEN_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_RHENIUM = registerFluid("liquid_rhenium", () -> ECElementItems.LIQUID_RHENIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_RHENIUM,
            ECElementFluidTypes.LIQUID_RHENIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_OSMIUM = registerFluid("liquid_osmium", () -> ECElementItems.LIQUID_OSMIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_OSMIUM,
            ECElementFluidTypes.LIQUID_OSMIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_IRIDIUM = registerFluid("liquid_iridium", () -> ECElementItems.LIQUID_IRIDIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_IRIDIUM,
            ECElementFluidTypes.LIQUID_IRIDIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_PLATINUM = registerFluid("liquid_platinum", () -> ECElementItems.LIQUID_PLATINUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_PLATINUM,
            ECElementFluidTypes.LIQUID_PLATINUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_GOLD = registerFluid("liquid_gold", () -> ECElementItems.LIQUID_GOLD_BUCKET, () -> ECElementFluidBlocks.LIQUID_GOLD,
            ECElementFluidTypes.LIQUID_GOLD_TYPE, 100.0F, 4, 1, 10);

    FluidHolder MERCURY = registerFluid("mercury", () -> ECElementItems.MERCURY_BUCKET, () -> ECElementFluidBlocks.MERCURY,
            ECElementFluidTypes.MERCURY_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_THALLIUM = registerFluid("liquid_thallium", () -> ECElementItems.LIQUID_THALLIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_THALLIUM,
            ECElementFluidTypes.LIQUID_THALLIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_LEAD = registerFluid("liquid_lead", () -> ECElementItems.LIQUID_LEAD_BUCKET, () -> ECElementFluidBlocks.LIQUID_LEAD,
            ECElementFluidTypes.LIQUID_LEAD_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_BISMUTH = registerFluid("liquid_bismuth", () -> ECElementItems.LIQUID_BISMUTH_BUCKET, () -> ECElementFluidBlocks.LIQUID_BISMUTH,
            ECElementFluidTypes.LIQUID_BISMUTH_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_POLONIUM = registerFluid("liquid_polonium", () -> ECElementItems.LIQUID_POLONIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_POLONIUM,
            ECElementFluidTypes.LIQUID_POLONIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_ASTATINE = registerFluid("liquid_astatine", () -> ECElementItems.LIQUID_ASTATINE_BUCKET, () -> ECElementFluidBlocks.LIQUID_ASTATINE,
            ECElementFluidTypes.LIQUID_ASTATINE_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_RADON = registerFluid("liquid_radon", () -> ECElementItems.LIQUID_RADON_BUCKET, () -> ECElementFluidBlocks.LIQUID_RADON,
            ECElementFluidTypes.LIQUID_RADON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_FRANCIUM = registerFluid("liquid_francium", () -> ECElementItems.LIQUID_FRANCIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_FRANCIUM,
            ECElementFluidTypes.LIQUID_FRANCIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_RADIUM = registerFluid("liquid_radium", () -> ECElementItems.LIQUID_RADIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_RADIUM,
            ECElementFluidTypes.LIQUID_RADIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_ACTINIUM = registerFluid("liquid_actinium", () -> ECElementItems.LIQUID_ACTINIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_ACTINIUM,
            ECElementFluidTypes.LIQUID_ACTINIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_THORIUM = registerFluid("liquid_thorium", () -> ECElementItems.LIQUID_THORIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_THORIUM,
            ECElementFluidTypes.LIQUID_THORIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_PROTACTINIUM = registerFluid("liquid_protactinium", () -> ECElementItems.LIQUID_PROTACTINIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_PROTACTINIUM,
            ECElementFluidTypes.LIQUID_PROTACTINIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_URANIUM = registerFluid("liquid_uranium", () -> ECElementItems.LIQUID_URANIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_URANIUM,
            ECElementFluidTypes.LIQUID_URANIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_NEPTUNIUM = registerFluid("liquid_neptunium", () -> ECElementItems.LIQUID_NEPTUNIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_NEPTUNIUM,
            ECElementFluidTypes.LIQUID_NEPTUNIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_PLUTONIUM = registerFluid("liquid_plutonium", () -> ECElementItems.LIQUID_PLUTONIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_PLUTONIUM,
            ECElementFluidTypes.LIQUID_PLUTONIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_AMERICIUM = registerFluid("liquid_americium", () -> ECElementItems.LIQUID_AMERICIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_AMERICIUM,
            ECElementFluidTypes.LIQUID_AMERICIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_CURIUM = registerFluid("liquid_curium", () -> ECElementItems.LIQUID_CURIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_CURIUM,
            ECElementFluidTypes.LIQUID_CURIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_BERKELIUM = registerFluid("liquid_berkelium", () -> ECElementItems.LIQUID_BERKELIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_BERKELIUM,
            ECElementFluidTypes.LIQUID_BERKELIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_CALIFORNIUM = registerFluid("liquid_californium", () -> ECElementItems.LIQUID_CALIFORNIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_CALIFORNIUM,
            ECElementFluidTypes.LIQUID_CALIFORNIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_EINSTEINIUM = registerFluid("liquid_einsteinium", () -> ECElementItems.LIQUID_EINSTEINIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_EINSTEINIUM,
            ECElementFluidTypes.LIQUID_EINSTEINIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_FERMIUM = registerFluid("liquid_fermium", () -> ECElementItems.LIQUID_FERMIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_FERMIUM,
            ECElementFluidTypes.LIQUID_FERMIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_MENDELEVIUM = registerFluid("liquid_mendelevium", () -> ECElementItems.LIQUID_MENDELEVIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_MENDELEVIUM,
            ECElementFluidTypes.LIQUID_MENDELEVIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_NOBELIUM = registerFluid("liquid_nobelium", () -> ECElementItems.LIQUID_NOBELIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_NOBELIUM,
            ECElementFluidTypes.LIQUID_NOBELIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_LAWRENCIUM = registerFluid("liquid_lawrencium", () -> ECElementItems.LIQUID_LAWRENCIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_LAWRENCIUM,
            ECElementFluidTypes.LIQUID_LAWRENCIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_RUTHERFORDIUM = registerFluid("liquid_rutherfordium", () -> ECElementItems.LIQUID_RUTHERFORDIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_RUTHERFORDIUM,
            ECElementFluidTypes.LIQUID_RUTHERFORDIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_DUBNIUM = registerFluid("liquid_dubnium", () -> ECElementItems.LIQUID_DUBNIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_DUBNIUM,
            ECElementFluidTypes.LIQUID_DUBNIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_SEABORGIUM = registerFluid("liquid_seaborgium", () -> ECElementItems.LIQUID_SEABORGIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_SEABORGIUM,
            ECElementFluidTypes.LIQUID_SEABORGIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_BOHRIUM = registerFluid("liquid_bohrium", () -> ECElementItems.LIQUID_BOHRIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_BOHRIUM,
            ECElementFluidTypes.LIQUID_BOHRIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_HASSIUM = registerFluid("liquid_hassium", () -> ECElementItems.LIQUID_HASSIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_HASSIUM,
            ECElementFluidTypes.LIQUID_HASSIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_MEITNERIUM = registerFluid("liquid_meitnerium", () -> ECElementItems.LIQUID_MEITNERIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_MEITNERIUM,
            ECElementFluidTypes.LIQUID_MEITNERIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_DARMSTADTIUM = registerFluid("liquid_darmstadtium", () -> ECElementItems.LIQUID_DARMSTADTIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_DARMSTADTIUM,
            ECElementFluidTypes.LIQUID_DARMSTADTIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_ROENTGENIUM = registerFluid("liquid_roentgenium", () -> ECElementItems.LIQUID_ROENTGENIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_ROENTGENIUM,
            ECElementFluidTypes.LIQUID_ROENTGENIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_COPERNICIUM = registerFluid("liquid_copernicium", () -> ECElementItems.LIQUID_COPERNICIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_COPERNICIUM,
            ECElementFluidTypes.LIQUID_COPERNICIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_NIHONIUM = registerFluid("liquid_nihonium", () -> ECElementItems.LIQUID_NIHONIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_NIHONIUM,
            ECElementFluidTypes.LIQUID_NIHONIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_FLEROVIUM = registerFluid("liquid_flerovium", () -> ECElementItems.LIQUID_FLEROVIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_FLEROVIUM,
            ECElementFluidTypes.LIQUID_FLEROVIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_MOSCOVIUM = registerFluid("liquid_moscovium", () -> ECElementItems.LIQUID_MOSCOVIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_MOSCOVIUM,
            ECElementFluidTypes.LIQUID_MOSCOVIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_LIVERMORIUM = registerFluid("liquid_livermorium", () -> ECElementItems.LIQUID_LIVERMORIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_LIVERMORIUM,
            ECElementFluidTypes.LIQUID_LIVERMORIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_TENNESSINE = registerFluid("liquid_tennessine", () -> ECElementItems.LIQUID_TENNESSINE_BUCKET, () -> ECElementFluidBlocks.LIQUID_TENNESSINE,
            ECElementFluidTypes.LIQUID_TENNESSINE_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_OGANESSON = registerFluid("liquid_oganesson", () -> ECElementItems.LIQUID_OGANESSON_BUCKET, () -> ECElementFluidBlocks.LIQUID_OGANESSON,
            ECElementFluidTypes.LIQUID_OGANESSON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_LONGIUM = registerFluid("liquid_longium", () -> ECElementItems.LIQUID_LONGIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_LONGIUM,
            ECElementFluidTypes.LIQUID_LONGIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_MYSTERIUM = registerFluid("liquid_mysterium", () -> ECElementItems.LIQUID_MYSTERIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_MYSTERIUM,
            ECElementFluidTypes.LIQUID_MYSTERIUM_TYPE, 100.0F, 4, 1, 10);

    /**
     * @param elementName           流体名称
     * @param bucketSupplier        关联桶物品的 Supplier
     * @param blockSupplier         关联液体方块的 Supplier
     * @param typeHolder            已注册的流体类型的 DeferredHolder
     * @param explosionResistance   流体爆炸抗性
     * @param slopeFindDistance     寻找斜坡的距离
     * @param levelDecreasePerBlock 每格流体等级衰减
     * @param tickRate              流体更新刻率
     * @return                      返回持有 type / source / flowing 三个引用的 FluidHolder
     */
    private static FluidHolder registerFluid(
            String elementName,
            Supplier<DeferredItem<BucketItem>> bucketSupplier,
            Supplier<DeferredBlock<LiquidBlock>> blockSupplier,
            DeferredHolder<FluidType, FluidType> typeHolder,
            float explosionResistance,
            int slopeFindDistance,
            int levelDecreasePerBlock,
            int tickRate
    ) {
        FluidHolder holder = new FluidHolder();
        holder.type = typeHolder;

        holder.flowing = ECElementFluids.FLUIDS.register("flowing_" + elementName, () ->
                new BaseFlowingFluid.Flowing(
                        new BaseFlowingFluid.Properties(
                                holder.type,
                                holder.source,
                                holder.flowing
                        )
                                .bucket(bucketSupplier.get())
                                .block(blockSupplier.get())
                                .explosionResistance(explosionResistance)
                                .slopeFindDistance(slopeFindDistance)
                                .levelDecreasePerBlock(levelDecreasePerBlock)
                                .tickRate(tickRate)
                )
        );

        holder.source = ECElementFluids.FLUIDS.register(elementName, () ->
                new BaseFlowingFluid.Source(
                        new BaseFlowingFluid.Properties(
                                holder.type,
                                holder.source,
                                holder.flowing
                        )
                                .bucket(bucketSupplier.get())
                                .block(blockSupplier.get())
                                .explosionResistance(explosionResistance)
                                .slopeFindDistance(slopeFindDistance)
                                .levelDecreasePerBlock(levelDecreasePerBlock)
                                .tickRate(tickRate)
                )
        );

        return holder;
    }

    static void onRegisterFluidType(RegisterClientExtensionsEvent e) {
        registerFluidType(e, ECElementFluidTypes.LIQUID_HYDROGEN_TYPE, ECColors.HYDROGEN_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_HELIUM_TYPE, ECColors.HELIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_LITHIUM_TYPE, ECColors.LITHIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_BERYLLIUM_TYPE, ECColors.BERYLLIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_BORON_TYPE, ECColors.BORON_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_CARBON_TYPE, ECColors.CARBON_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_NITROGEN_TYPE, ECColors.NITROGEN_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_OXYGEN_TYPE, ECColors.OXYGEN_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_FLUORINE_TYPE, ECColors.FLUORINE_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_NEON_TYPE, ECColors.NEON_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_SODIUM_TYPE, ECColors.SODIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_MAGNESIUM_TYPE, ECColors.MAGNESIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_ALUMINUM_TYPE, ECColors.ALUMINUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_SILICON_TYPE, ECColors.SILICON_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_PHOSPHORUS_TYPE, ECColors.PHOSPHORUS_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_SULFUR_TYPE, ECColors.SULFUR_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_CHLORINE_TYPE, ECColors.CHLORINE_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_ARGON_TYPE, ECColors.ARGON_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_POTASSIUM_TYPE, ECColors.POTASSIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_CALCIUM_TYPE, ECColors.CALCIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_SCANDIUM_TYPE, ECColors.SCANDIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_TITANIUM_TYPE, ECColors.TITANIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_VANADIUM_TYPE, ECColors.VANADIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_CHROMIUM_TYPE, ECColors.CHROMIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_MANGANESE_TYPE, ECColors.MANGANESE_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_IRON_TYPE, ECColors.IRON_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_COBALT_TYPE, ECColors.COBALT_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_NICKEL_TYPE, ECColors.NICKEL_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_COPPER_TYPE, ECColors.COPPER_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_ZINC_TYPE, ECColors.ZINC_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_GALLIUM_TYPE, ECColors.GALLIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_GERMANIUM_TYPE, ECColors.GERMANIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_ARSENIC_TYPE, ECColors.ARSENIC_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_SELENIUM_TYPE, ECColors.SELENIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.BROMINE_TYPE, ECColors.BROMINE_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_KRYPTON_TYPE, ECColors.KRYPTON_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_RUBIDIUM_TYPE, ECColors.RUBIDIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_STRONTIUM_TYPE, ECColors.STRONTIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_YTTRIUM_TYPE, ECColors.YTTRIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_ZIRCONIUM_TYPE, ECColors.ZIRCONIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_NIOBIUM_TYPE, ECColors.NIOBIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_MOLYBDENUM_TYPE, ECColors.MOLYBDENUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_TECHNETIUM_TYPE, ECColors.TECHNETIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_RUTHENIUM_TYPE, ECColors.RUTHENIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_RHODIUM_TYPE, ECColors.RHODIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_PALLADIUM_TYPE, ECColors.PALLADIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_SILVER_TYPE, ECColors.SILVER_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_CADMIUM_TYPE, ECColors.CADMIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_INDIUM_TYPE, ECColors.INDIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_TIN_TYPE, ECColors.TIN_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_ANTIMONY_TYPE, ECColors.ANTIMONY_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_TELLURIUM_TYPE, ECColors.TELLURIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_IODINE_TYPE, ECColors.IODINE_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_XENON_TYPE, ECColors.XENON_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_CESIUM_TYPE, ECColors.CESIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_BARIUM_TYPE, ECColors.BARIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_LANTHANUM_TYPE, ECColors.LANTHANUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_CERIUM_TYPE, ECColors.CERIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_PRASEODYMIUM_TYPE, ECColors.PRASEODYMIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_NEODYMIUM_TYPE, ECColors.NEODYMIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_PROMETHIUM_TYPE, ECColors.PROMETHIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_SAMARIUM_TYPE, ECColors.SAMARIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_EUROPIUM_TYPE, ECColors.EUROPIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_GADOLINIUM_TYPE, ECColors.GADOLINIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_TERBIUM_TYPE, ECColors.TERBIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_DYSPROSIUM_TYPE, ECColors.DYSPROSIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_HOLMIUM_TYPE, ECColors.HOLMIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_ERBIUM_TYPE, ECColors.ERBIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_THULIUM_TYPE, ECColors.THULIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_YTTERBIUM_TYPE, ECColors.YTTERBIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_LUTETIUM_TYPE, ECColors.LUTETIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_HAFNIUM_TYPE, ECColors.HAFNIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_TANTALUM_TYPE, ECColors.TANTALUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_TUNGSTEN_TYPE, ECColors.TUNGSTEN_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_RHENIUM_TYPE, ECColors.RHENIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_OSMIUM_TYPE, ECColors.OSMIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_IRIDIUM_TYPE, ECColors.IRIDIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_PLATINUM_TYPE, ECColors.PLATINUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_GOLD_TYPE, ECColors.GOLD_FOG);
        registerFluidType(e, ECElementFluidTypes.MERCURY_TYPE, ECColors.MERCURY_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_THALLIUM_TYPE, ECColors.THALLIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_LEAD_TYPE, ECColors.LEAD_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_BISMUTH_TYPE, ECColors.BISMUTH_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_POLONIUM_TYPE, ECColors.POLONIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_ASTATINE_TYPE, ECColors.ASTATINE_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_RADON_TYPE, ECColors.RADON_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_FRANCIUM_TYPE, ECColors.FRANCIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_RADIUM_TYPE, ECColors.RADIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_ACTINIUM_TYPE, ECColors.ACTINIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_THORIUM_TYPE, ECColors.THORIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_PROTACTINIUM_TYPE, ECColors.PROTACTINIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_URANIUM_TYPE, ECColors.URANIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_NEPTUNIUM_TYPE, ECColors.NEPTUNIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_PLUTONIUM_TYPE, ECColors.PLUTONIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_AMERICIUM_TYPE, ECColors.AMERICIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_CURIUM_TYPE, ECColors.CURIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_BERKELIUM_TYPE, ECColors.BERKELIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_CALIFORNIUM_TYPE, ECColors.CALIFORNIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_EINSTEINIUM_TYPE, ECColors.EINSTEINIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_FERMIUM_TYPE, ECColors.FERMIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_MENDELEVIUM_TYPE, ECColors.MENDELEVIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_NOBELIUM_TYPE, ECColors.NOBELIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_LAWRENCIUM_TYPE, ECColors.LAWRENCIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_RUTHERFORDIUM_TYPE, ECColors.RUTHERFORDIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_DUBNIUM_TYPE, ECColors.DUBNIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_SEABORGIUM_TYPE, ECColors.SEABORGIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_BOHRIUM_TYPE, ECColors.BOHRIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_HASSIUM_TYPE, ECColors.HASSIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_MEITNERIUM_TYPE, ECColors.MEITNERIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_DARMSTADTIUM_TYPE, ECColors.DARMSTADTIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_ROENTGENIUM_TYPE, ECColors.ROENTGENIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_COPERNICIUM_TYPE, ECColors.COPERNICIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_NIHONIUM_TYPE, ECColors.NIHONIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_FLEROVIUM_TYPE, ECColors.FLEROVIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_MOSCOVIUM_TYPE, ECColors.MOSCOVIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_LIVERMORIUM_TYPE, ECColors.LIVERMORIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_TENNESSINE_TYPE, ECColors.TENNESSINE_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_OGANESSON_TYPE, ECColors.OGANESSON_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_LONGIUM_TYPE, ECColors.LONGIUM_FOG);
        registerFluidType(e, ECElementFluidTypes.LIQUID_MYSTERIUM_TYPE, ECColors.MYSTERIUM_FOG);
    }

    private static void registerFluidType(
            RegisterClientExtensionsEvent e,
            DeferredHolder<FluidType, FluidType> type,
            ECColors.Fog fog
    ) {
        e.registerFluidType(
                new SimpleFluidExtension(
                        ResourceLocation.withDefaultNamespace("block/water_still"),
                        ResourceLocation.withDefaultNamespace("block/water_flow"),
                        fog.color(),
                        fog.distance()
                ),
                type
        );
    }

    static void register(IEventBus eventBus) {
        ECElementFluidTypes.FLUID_TYPES.register(eventBus);
        FLUIDS.register(eventBus);
    }

    class FluidHolder {
        public DeferredHolder<FluidType, FluidType> type;
        public DeferredHolder<Fluid, BaseFlowingFluid.Source> source;
        public DeferredHolder<Fluid, BaseFlowingFluid.Flowing> flowing;
    }
}