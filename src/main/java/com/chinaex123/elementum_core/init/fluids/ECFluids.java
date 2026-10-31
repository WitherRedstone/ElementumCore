package com.chinaex123.elementum_core.init.fluids;

import com.chinaex123.elementum_core.ElementumCore;
import com.chinaex123.elementum_core.init.blocks.ECElementFluidBlocks;
import com.chinaex123.elementum_core.init.items.ECMaterialItems;
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

public interface ECFluids {
    DeferredRegister<Fluid> FLUIDS = DeferredRegister.create(BuiltInRegistries.FLUID, ElementumCore.MODID);

    FluidHolder LIQUID_HYDROGEN = registerFluid("liquid_hydrogen", () -> ECMaterialItems.LIQUID_HYDROGEN_BUCKET, () -> ECElementFluidBlocks.LIQUID_HYDROGEN,
            ECFluidTypes.LIQUID_HYDROGEN_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_HELIUM = registerFluid("liquid_helium", () -> ECMaterialItems.LIQUID_HELIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_HELIUM,
            ECFluidTypes.LIQUID_HELIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_LITHIUM = registerFluid("liquid_lithium", () -> ECMaterialItems.LIQUID_LITHIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_LITHIUM,
            ECFluidTypes.LIQUID_LITHIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_BERYLLIUM = registerFluid("liquid_beryllium", () -> ECMaterialItems.LIQUID_BERYLLIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_BERYLLIUM,
            ECFluidTypes.LIQUID_BERYLLIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_BORON = registerFluid("liquid_boron", () -> ECMaterialItems.LIQUID_BORON_BUCKET, () -> ECElementFluidBlocks.LIQUID_BORON,
            ECFluidTypes.LIQUID_BORON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_CARBON = registerFluid("liquid_carbon", () -> ECMaterialItems.LIQUID_CARBON_BUCKET, () -> ECElementFluidBlocks.LIQUID_CARBON,
            ECFluidTypes.LIQUID_CARBON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_NITROGEN = registerFluid("liquid_nitrogen", () -> ECMaterialItems.LIQUID_NITROGEN_BUCKET, () -> ECElementFluidBlocks.LIQUID_NITROGEN,
            ECFluidTypes.LIQUID_NITROGEN_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_OXYGEN = registerFluid("liquid_oxygen", () -> ECMaterialItems.LIQUID_OXYGEN_BUCKET, () -> ECElementFluidBlocks.LIQUID_OXYGEN,
            ECFluidTypes.LIQUID_OXYGEN_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_FLUORINE = registerFluid("liquid_fluorine", () -> ECMaterialItems.LIQUID_FLUORINE_BUCKET, () -> ECElementFluidBlocks.LIQUID_FLUORINE,
            ECFluidTypes.LIQUID_FLUORINE_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_NEON = registerFluid("liquid_neon", () -> ECMaterialItems.LIQUID_NEON_BUCKET, () -> ECElementFluidBlocks.LIQUID_NEON,
            ECFluidTypes.LIQUID_NEON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_SODIUM = registerFluid("liquid_sodium", () -> ECMaterialItems.LIQUID_SODIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_SODIUM,
            ECFluidTypes.LIQUID_SODIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_MAGNESIUM = registerFluid("liquid_magnesium", () -> ECMaterialItems.LIQUID_MAGNESIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_MAGNESIUM,
            ECFluidTypes.LIQUID_MAGNESIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_ALUMINUM = registerFluid("liquid_aluminum", () -> ECMaterialItems.LIQUID_ALUMINUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_ALUMINUM,
            ECFluidTypes.LIQUID_ALUMINUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_SILICON = registerFluid("liquid_silicon", () -> ECMaterialItems.LIQUID_SILICON_BUCKET, () -> ECElementFluidBlocks.LIQUID_SILICON,
            ECFluidTypes.LIQUID_SILICON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_PHOSPHORUS = registerFluid("liquid_phosphorus", () -> ECMaterialItems.LIQUID_PHOSPHORUS_BUCKET, () -> ECElementFluidBlocks.LIQUID_PHOSPHORUS,
            ECFluidTypes.LIQUID_PHOSPHORUS_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_SULFUR = registerFluid("liquid_sulfur", () -> ECMaterialItems.LIQUID_SULFUR_BUCKET, () -> ECElementFluidBlocks.LIQUID_SULFUR,
            ECFluidTypes.LIQUID_SULFUR_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_CHLORINE = registerFluid("liquid_chlorine", () -> ECMaterialItems.LIQUID_CHLORINE_BUCKET, () -> ECElementFluidBlocks.LIQUID_CHLORINE,
            ECFluidTypes.LIQUID_CHLORINE_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_ARGON = registerFluid("liquid_argon", () -> ECMaterialItems.LIQUID_ARGON_BUCKET, () -> ECElementFluidBlocks.LIQUID_ARGON,
            ECFluidTypes.LIQUID_ARGON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_POTASSIUM = registerFluid("liquid_potassium", () -> ECMaterialItems.LIQUID_POTASSIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_POTASSIUM,
            ECFluidTypes.LIQUID_POTASSIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_CALCIUM = registerFluid("liquid_calcium", () -> ECMaterialItems.LIQUID_CALCIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_CALCIUM,
            ECFluidTypes.LIQUID_CALCIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_SCANDIUM = registerFluid("liquid_scandium", () -> ECMaterialItems.LIQUID_SCANDIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_SCANDIUM,
            ECFluidTypes.LIQUID_SCANDIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_TITANIUM = registerFluid("liquid_titanium", () -> ECMaterialItems.LIQUID_TITANIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_TITANIUM,
            ECFluidTypes.LIQUID_TITANIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_VANADIUM = registerFluid("liquid_vanadium", () -> ECMaterialItems.LIQUID_VANADIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_VANADIUM,
            ECFluidTypes.LIQUID_VANADIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_CHROMIUM = registerFluid("liquid_chromium", () -> ECMaterialItems.LIQUID_CHROMIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_CHROMIUM,
            ECFluidTypes.LIQUID_CHROMIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_MANGANESE = registerFluid("liquid_manganese", () -> ECMaterialItems.LIQUID_MANGANESE_BUCKET, () -> ECElementFluidBlocks.LIQUID_MANGANESE,
            ECFluidTypes.LIQUID_MANGANESE_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_IRON = registerFluid("liquid_iron", () -> ECMaterialItems.LIQUID_IRON_BUCKET, () -> ECElementFluidBlocks.LIQUID_IRON,
            ECFluidTypes.LIQUID_IRON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_COBALT = registerFluid("liquid_cobalt", () -> ECMaterialItems.LIQUID_COBALT_BUCKET, () -> ECElementFluidBlocks.LIQUID_COBALT,
            ECFluidTypes.LIQUID_COBALT_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_NICKEL = registerFluid("liquid_nickel", () -> ECMaterialItems.LIQUID_NICKEL_BUCKET, () -> ECElementFluidBlocks.LIQUID_NICKEL,
            ECFluidTypes.LIQUID_NICKEL_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_COPPER = registerFluid("liquid_copper", () -> ECMaterialItems.LIQUID_COPPER_BUCKET, () -> ECElementFluidBlocks.LIQUID_COPPER,
            ECFluidTypes.LIQUID_COPPER_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_ZINC = registerFluid("liquid_zinc", () -> ECMaterialItems.LIQUID_ZINC_BUCKET, () -> ECElementFluidBlocks.LIQUID_ZINC,
            ECFluidTypes.LIQUID_ZINC_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_GALLIUM = registerFluid("liquid_gallium", () -> ECMaterialItems.LIQUID_GALLIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_GALLIUM,
            ECFluidTypes.LIQUID_GALLIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_GERMANIUM = registerFluid("liquid_germanium", () -> ECMaterialItems.LIQUID_GERMANIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_GERMANIUM,
            ECFluidTypes.LIQUID_GERMANIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_ARSENIC = registerFluid("liquid_arsenic", () -> ECMaterialItems.LIQUID_ARSENIC_BUCKET, () -> ECElementFluidBlocks.LIQUID_ARSENIC,
            ECFluidTypes.LIQUID_ARSENIC_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_SELENIUM = registerFluid("liquid_selenium", () -> ECMaterialItems.LIQUID_SELENIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_SELENIUM,
            ECFluidTypes.LIQUID_SELENIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder BROMINE = registerFluid("bromine", () -> ECMaterialItems.BROMINE_BUCKET, () -> ECElementFluidBlocks.BROMINE,
            ECFluidTypes.BROMINE_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_KRYPTON = registerFluid("liquid_krypton", () -> ECMaterialItems.LIQUID_KRYPTON_BUCKET, () -> ECElementFluidBlocks.LIQUID_KRYPTON,
            ECFluidTypes.LIQUID_KRYPTON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_RUBIDIUM = registerFluid("liquid_rubidium", () -> ECMaterialItems.LIQUID_RUBIDIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_RUBIDIUM,
            ECFluidTypes.LIQUID_RUBIDIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_STRONTIUM = registerFluid("liquid_strontium", () -> ECMaterialItems.LIQUID_STRONTIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_STRONTIUM,
            ECFluidTypes.LIQUID_STRONTIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_YTTRIUM = registerFluid("liquid_yttrium", () -> ECMaterialItems.LIQUID_YTTRIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_YTTRIUM,
            ECFluidTypes.LIQUID_YTTRIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_ZIRCONIUM = registerFluid("liquid_zirconium", () -> ECMaterialItems.LIQUID_ZIRCONIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_ZIRCONIUM,
            ECFluidTypes.LIQUID_ZIRCONIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_NIOBIUM = registerFluid("liquid_niobium", () -> ECMaterialItems.LIQUID_NIOBIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_NIOBIUM,
            ECFluidTypes.LIQUID_NIOBIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_MOLYBDENUM = registerFluid("liquid_molybdenum", () -> ECMaterialItems.LIQUID_MOLYBDENUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_MOLYBDENUM,
            ECFluidTypes.LIQUID_MOLYBDENUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_TECHNETIUM = registerFluid("liquid_technetium", () -> ECMaterialItems.LIQUID_TECHNETIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_TECHNETIUM,
            ECFluidTypes.LIQUID_TECHNETIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_RUTHENIUM = registerFluid("liquid_ruthenium", () -> ECMaterialItems.LIQUID_RUTHENIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_RUTHENIUM,
            ECFluidTypes.LIQUID_RUTHENIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_RHODIUM = registerFluid("liquid_rhodium", () -> ECMaterialItems.LIQUID_RHODIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_RHODIUM,
            ECFluidTypes.LIQUID_RHODIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_PALLADIUM = registerFluid("liquid_palladium", () -> ECMaterialItems.LIQUID_PALLADIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_PALLADIUM,
            ECFluidTypes.LIQUID_PALLADIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_SILVER = registerFluid("liquid_silver", () -> ECMaterialItems.LIQUID_SILVER_BUCKET, () -> ECElementFluidBlocks.LIQUID_SILVER,
            ECFluidTypes.LIQUID_SILVER_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_CADMIUM = registerFluid("liquid_cadmium", () -> ECMaterialItems.LIQUID_CADMIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_CADMIUM,
            ECFluidTypes.LIQUID_CADMIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_INDIUM = registerFluid("liquid_indium", () -> ECMaterialItems.LIQUID_INDIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_INDIUM,
            ECFluidTypes.LIQUID_INDIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_TIN = registerFluid("liquid_tin", () -> ECMaterialItems.LIQUID_TIN_BUCKET, () -> ECElementFluidBlocks.LIQUID_TIN,
            ECFluidTypes.LIQUID_TIN_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_ANTIMONY = registerFluid("liquid_antimony", () -> ECMaterialItems.LIQUID_ANTIMONY_BUCKET, () -> ECElementFluidBlocks.LIQUID_ANTIMONY,
            ECFluidTypes.LIQUID_ANTIMONY_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_TELLURIUM = registerFluid("liquid_tellurium", () -> ECMaterialItems.LIQUID_TELLURIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_TELLURIUM,
            ECFluidTypes.LIQUID_TELLURIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_IODINE = registerFluid("liquid_iodine", () -> ECMaterialItems.LIQUID_IODINE_BUCKET, () -> ECElementFluidBlocks.LIQUID_IODINE,
            ECFluidTypes.LIQUID_IODINE_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_XENON = registerFluid("liquid_xenon", () -> ECMaterialItems.LIQUID_XENON_BUCKET, () -> ECElementFluidBlocks.LIQUID_XENON,
            ECFluidTypes.LIQUID_XENON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_CESIUM = registerFluid("liquid_cesium", () -> ECMaterialItems.LIQUID_CESIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_CESIUM,
            ECFluidTypes.LIQUID_CESIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_BARIUM = registerFluid("liquid_barium", () -> ECMaterialItems.LIQUID_BARIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_BARIUM,
            ECFluidTypes.LIQUID_BARIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_LANTHANUM = registerFluid("liquid_lanthanum", () -> ECMaterialItems.LIQUID_LANTHANUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_LANTHANUM,
            ECFluidTypes.LIQUID_LANTHANUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_CERIUM = registerFluid("liquid_cerium", () -> ECMaterialItems.LIQUID_CERIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_CERIUM,
            ECFluidTypes.LIQUID_CERIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_PRASEODYMIUM = registerFluid("liquid_praseodymium", () -> ECMaterialItems.LIQUID_PRASEODYMIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_PRASEODYMIUM,
            ECFluidTypes.LIQUID_PRASEODYMIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_NEODYMIUM = registerFluid("liquid_neodymium", () -> ECMaterialItems.LIQUID_NEODYMIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_NEODYMIUM,
            ECFluidTypes.LIQUID_NEODYMIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_PROMETHIUM = registerFluid("liquid_promethium", () -> ECMaterialItems.LIQUID_PROMETHIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_PROMETHIUM,
            ECFluidTypes.LIQUID_PROMETHIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_SAMARIUM = registerFluid("liquid_samarium", () -> ECMaterialItems.LIQUID_SAMARIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_SAMARIUM,
            ECFluidTypes.LIQUID_SAMARIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_EUROPIUM = registerFluid("liquid_europium", () -> ECMaterialItems.LIQUID_EUROPIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_EUROPIUM,
            ECFluidTypes.LIQUID_EUROPIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_GADOLINIUM = registerFluid("liquid_gadolinium", () -> ECMaterialItems.LIQUID_GADOLINIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_GADOLINIUM,
            ECFluidTypes.LIQUID_GADOLINIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_TERBIUM = registerFluid("liquid_terbium", () -> ECMaterialItems.LIQUID_TERBIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_TERBIUM,
            ECFluidTypes.LIQUID_TERBIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_DYSPROSIUM = registerFluid("liquid_dysprosium", () -> ECMaterialItems.LIQUID_DYSPROSIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_DYSPROSIUM,
            ECFluidTypes.LIQUID_DYSPROSIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_HOLMIUM = registerFluid("liquid_holmium", () -> ECMaterialItems.LIQUID_HOLMIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_HOLMIUM,
            ECFluidTypes.LIQUID_HOLMIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_ERBIUM = registerFluid("liquid_erbium", () -> ECMaterialItems.LIQUID_ERBIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_ERBIUM,
            ECFluidTypes.LIQUID_ERBIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_THULIUM = registerFluid("liquid_thulium", () -> ECMaterialItems.LIQUID_THULIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_THULIUM,
            ECFluidTypes.LIQUID_THULIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_YTTERBIUM = registerFluid("liquid_ytterbium", () -> ECMaterialItems.LIQUID_YTTERBIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_YTTERBIUM,
            ECFluidTypes.LIQUID_YTTERBIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_LUTETIUM = registerFluid("liquid_lutetium", () -> ECMaterialItems.LIQUID_LUTETIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_LUTETIUM,
            ECFluidTypes.LIQUID_LUTETIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_HAFNIUM = registerFluid("liquid_hafnium", () -> ECMaterialItems.LIQUID_HAFNIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_HAFNIUM,
            ECFluidTypes.LIQUID_HAFNIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_TANTALUM = registerFluid("liquid_tantalum", () -> ECMaterialItems.LIQUID_TANTALUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_TANTALUM,
            ECFluidTypes.LIQUID_TANTALUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_TUNGSTEN = registerFluid("liquid_tungsten", () -> ECMaterialItems.LIQUID_TUNGSTEN_BUCKET, () -> ECElementFluidBlocks.LIQUID_TUNGSTEN,
            ECFluidTypes.LIQUID_TUNGSTEN_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_RHENIUM = registerFluid("liquid_rhenium", () -> ECMaterialItems.LIQUID_RHENIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_RHENIUM,
            ECFluidTypes.LIQUID_RHENIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_OSMIUM = registerFluid("liquid_osmium", () -> ECMaterialItems.LIQUID_OSMIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_OSMIUM,
            ECFluidTypes.LIQUID_OSMIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_IRIDIUM = registerFluid("liquid_iridium", () -> ECMaterialItems.LIQUID_IRIDIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_IRIDIUM,
            ECFluidTypes.LIQUID_IRIDIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_PLATINUM = registerFluid("liquid_platinum", () -> ECMaterialItems.LIQUID_PLATINUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_PLATINUM,
            ECFluidTypes.LIQUID_PLATINUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_GOLD = registerFluid("liquid_gold", () -> ECMaterialItems.LIQUID_GOLD_BUCKET, () -> ECElementFluidBlocks.LIQUID_GOLD,
            ECFluidTypes.LIQUID_GOLD_TYPE, 100.0F, 4, 1, 10);

    FluidHolder MERCURY = registerFluid("mercury", () -> ECMaterialItems.MERCURY_BUCKET, () -> ECElementFluidBlocks.MERCURY,
            ECFluidTypes.MERCURY_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_THALLIUM = registerFluid("liquid_thallium", () -> ECMaterialItems.LIQUID_THALLIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_THALLIUM,
            ECFluidTypes.LIQUID_THALLIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_LEAD = registerFluid("liquid_lead", () -> ECMaterialItems.LIQUID_LEAD_BUCKET, () -> ECElementFluidBlocks.LIQUID_LEAD,
            ECFluidTypes.LIQUID_LEAD_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_BISMUTH = registerFluid("liquid_bismuth", () -> ECMaterialItems.LIQUID_BISMUTH_BUCKET, () -> ECElementFluidBlocks.LIQUID_BISMUTH,
            ECFluidTypes.LIQUID_BISMUTH_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_POLONIUM = registerFluid("liquid_polonium", () -> ECMaterialItems.LIQUID_POLONIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_POLONIUM,
            ECFluidTypes.LIQUID_POLONIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_ASTATINE = registerFluid("liquid_astatine", () -> ECMaterialItems.LIQUID_ASTATINE_BUCKET, () -> ECElementFluidBlocks.LIQUID_ASTATINE,
            ECFluidTypes.LIQUID_ASTATINE_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_RADON = registerFluid("liquid_radon", () -> ECMaterialItems.LIQUID_RADON_BUCKET, () -> ECElementFluidBlocks.LIQUID_RADON,
            ECFluidTypes.LIQUID_RADON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_FRANCIUM = registerFluid("liquid_francium", () -> ECMaterialItems.LIQUID_FRANCIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_FRANCIUM,
            ECFluidTypes.LIQUID_FRANCIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_RADIUM = registerFluid("liquid_radium", () -> ECMaterialItems.LIQUID_RADIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_RADIUM,
            ECFluidTypes.LIQUID_RADIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_ACTINIUM = registerFluid("liquid_actinium", () -> ECMaterialItems.LIQUID_ACTINIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_ACTINIUM,
            ECFluidTypes.LIQUID_ACTINIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_THORIUM = registerFluid("liquid_thorium", () -> ECMaterialItems.LIQUID_THORIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_THORIUM,
            ECFluidTypes.LIQUID_THORIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_PROTACTINIUM = registerFluid("liquid_protactinium", () -> ECMaterialItems.LIQUID_PROTACTINIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_PROTACTINIUM,
            ECFluidTypes.LIQUID_PROTACTINIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_URANIUM = registerFluid("liquid_uranium", () -> ECMaterialItems.LIQUID_URANIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_URANIUM,
            ECFluidTypes.LIQUID_URANIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_NEPTUNIUM = registerFluid("liquid_neptunium", () -> ECMaterialItems.LIQUID_NEPTUNIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_NEPTUNIUM,
            ECFluidTypes.LIQUID_NEPTUNIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_PLUTONIUM = registerFluid("liquid_plutonium", () -> ECMaterialItems.LIQUID_PLUTONIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_PLUTONIUM,
            ECFluidTypes.LIQUID_PLUTONIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_AMERICIUM = registerFluid("liquid_americium", () -> ECMaterialItems.LIQUID_AMERICIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_AMERICIUM,
            ECFluidTypes.LIQUID_AMERICIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_CURIUM = registerFluid("liquid_curium", () -> ECMaterialItems.LIQUID_CURIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_CURIUM,
            ECFluidTypes.LIQUID_CURIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_BERKELIUM = registerFluid("liquid_berkelium", () -> ECMaterialItems.LIQUID_BERKELIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_BERKELIUM,
            ECFluidTypes.LIQUID_BERKELIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_CALIFORNIUM = registerFluid("liquid_californium", () -> ECMaterialItems.LIQUID_CALIFORNIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_CALIFORNIUM,
            ECFluidTypes.LIQUID_CALIFORNIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_EINSTEINIUM = registerFluid("liquid_einsteinium", () -> ECMaterialItems.LIQUID_EINSTEINIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_EINSTEINIUM,
            ECFluidTypes.LIQUID_EINSTEINIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_FERMIUM = registerFluid("liquid_fermium", () -> ECMaterialItems.LIQUID_FERMIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_FERMIUM,
            ECFluidTypes.LIQUID_FERMIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_MENDELEVIUM = registerFluid("liquid_mendelevium", () -> ECMaterialItems.LIQUID_MENDELEVIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_MENDELEVIUM,
            ECFluidTypes.LIQUID_MENDELEVIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_NOBELIUM = registerFluid("liquid_nobelium", () -> ECMaterialItems.LIQUID_NOBELIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_NOBELIUM,
            ECFluidTypes.LIQUID_NOBELIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_LAWRENCIUM = registerFluid("liquid_lawrencium", () -> ECMaterialItems.LIQUID_LAWRENCIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_LAWRENCIUM,
            ECFluidTypes.LIQUID_LAWRENCIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_RUTHERFORDIUM = registerFluid("liquid_rutherfordium", () -> ECMaterialItems.LIQUID_RUTHERFORDIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_RUTHERFORDIUM,
            ECFluidTypes.LIQUID_RUTHERFORDIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_DUBNIUM = registerFluid("liquid_dubnium", () -> ECMaterialItems.LIQUID_DUBNIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_DUBNIUM,
            ECFluidTypes.LIQUID_DUBNIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_SEABORGIUM = registerFluid("liquid_seaborgium", () -> ECMaterialItems.LIQUID_SEABORGIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_SEABORGIUM,
            ECFluidTypes.LIQUID_SEABORGIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_BOHRIUM = registerFluid("liquid_bohrium", () -> ECMaterialItems.LIQUID_BOHRIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_BOHRIUM,
            ECFluidTypes.LIQUID_BOHRIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_HASSIUM = registerFluid("liquid_hassium", () -> ECMaterialItems.LIQUID_HASSIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_HASSIUM,
            ECFluidTypes.LIQUID_HASSIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_MEITNERIUM = registerFluid("liquid_meitnerium", () -> ECMaterialItems.LIQUID_MEITNERIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_MEITNERIUM,
            ECFluidTypes.LIQUID_MEITNERIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_DARMSTADTIUM = registerFluid("liquid_darmstadtium", () -> ECMaterialItems.LIQUID_DARMSTADTIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_DARMSTADTIUM,
            ECFluidTypes.LIQUID_DARMSTADTIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_ROENTGENIUM = registerFluid("liquid_roentgenium", () -> ECMaterialItems.LIQUID_ROENTGENIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_ROENTGENIUM,
            ECFluidTypes.LIQUID_ROENTGENIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_COPERNICIUM = registerFluid("liquid_copernicium", () -> ECMaterialItems.LIQUID_COPERNICIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_COPERNICIUM,
            ECFluidTypes.LIQUID_COPERNICIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_NIHONIUM = registerFluid("liquid_nihonium", () -> ECMaterialItems.LIQUID_NIHONIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_NIHONIUM,
            ECFluidTypes.LIQUID_NIHONIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_FLEROVIUM = registerFluid("liquid_flerovium", () -> ECMaterialItems.LIQUID_FLEROVIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_FLEROVIUM,
            ECFluidTypes.LIQUID_FLEROVIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_MOSCOVIUM = registerFluid("liquid_moscovium", () -> ECMaterialItems.LIQUID_MOSCOVIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_MOSCOVIUM,
            ECFluidTypes.LIQUID_MOSCOVIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_LIVERMORIUM = registerFluid("liquid_livermorium", () -> ECMaterialItems.LIQUID_LIVERMORIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_LIVERMORIUM,
            ECFluidTypes.LIQUID_LIVERMORIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_TENNESSINE = registerFluid("liquid_tennessine", () -> ECMaterialItems.LIQUID_TENNESSINE_BUCKET, () -> ECElementFluidBlocks.LIQUID_TENNESSINE,
            ECFluidTypes.LIQUID_TENNESSINE_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_OGANESSON = registerFluid("liquid_oganesson", () -> ECMaterialItems.LIQUID_OGANESSON_BUCKET, () -> ECElementFluidBlocks.LIQUID_OGANESSON,
            ECFluidTypes.LIQUID_OGANESSON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_LONGIUM = registerFluid("liquid_longium", () -> ECMaterialItems.LIQUID_LONGIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_LONGIUM,
            ECFluidTypes.LIQUID_LONGIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIQUID_MYSTERIUM = registerFluid("liquid_mysterium", () -> ECMaterialItems.LIQUID_MYSTERIUM_BUCKET, () -> ECElementFluidBlocks.LIQUID_MYSTERIUM,
            ECFluidTypes.LIQUID_MYSTERIUM_TYPE, 100.0F, 4, 1, 10);

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

        holder.flowing = ECFluids.FLUIDS.register("flowing_" + elementName, () ->
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

        holder.source = ECFluids.FLUIDS.register(elementName, () ->
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
        registerFluidType(e, ECFluidTypes.LIQUID_HYDROGEN_TYPE, ECColors.HYDROGEN_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_HELIUM_TYPE, ECColors.HELIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_LITHIUM_TYPE, ECColors.LITHIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_BERYLLIUM_TYPE, ECColors.BERYLLIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_BORON_TYPE, ECColors.BORON_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_CARBON_TYPE, ECColors.CARBON_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_NITROGEN_TYPE, ECColors.NITROGEN_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_OXYGEN_TYPE, ECColors.OXYGEN_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_FLUORINE_TYPE, ECColors.FLUORINE_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_NEON_TYPE, ECColors.NEON_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_SODIUM_TYPE, ECColors.SODIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_MAGNESIUM_TYPE, ECColors.MAGNESIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_ALUMINUM_TYPE, ECColors.ALUMINUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_SILICON_TYPE, ECColors.SILICON_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_PHOSPHORUS_TYPE, ECColors.PHOSPHORUS_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_SULFUR_TYPE, ECColors.SULFUR_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_CHLORINE_TYPE, ECColors.CHLORINE_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_ARGON_TYPE, ECColors.ARGON_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_POTASSIUM_TYPE, ECColors.POTASSIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_CALCIUM_TYPE, ECColors.CALCIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_SCANDIUM_TYPE, ECColors.SCANDIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_TITANIUM_TYPE, ECColors.TITANIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_VANADIUM_TYPE, ECColors.VANADIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_CHROMIUM_TYPE, ECColors.CHROMIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_MANGANESE_TYPE, ECColors.MANGANESE_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_IRON_TYPE, ECColors.IRON_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_COBALT_TYPE, ECColors.COBALT_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_NICKEL_TYPE, ECColors.NICKEL_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_COPPER_TYPE, ECColors.COPPER_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_ZINC_TYPE, ECColors.ZINC_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_GALLIUM_TYPE, ECColors.GALLIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_GERMANIUM_TYPE, ECColors.GERMANIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_ARSENIC_TYPE, ECColors.ARSENIC_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_SELENIUM_TYPE, ECColors.SELENIUM_FOG);
        registerFluidType(e, ECFluidTypes.BROMINE_TYPE, ECColors.BROMINE_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_KRYPTON_TYPE, ECColors.KRYPTON_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_RUBIDIUM_TYPE, ECColors.RUBIDIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_STRONTIUM_TYPE, ECColors.STRONTIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_YTTRIUM_TYPE, ECColors.YTTRIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_ZIRCONIUM_TYPE, ECColors.ZIRCONIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_NIOBIUM_TYPE, ECColors.NIOBIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_MOLYBDENUM_TYPE, ECColors.MOLYBDENUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_TECHNETIUM_TYPE, ECColors.TECHNETIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_RUTHENIUM_TYPE, ECColors.RUTHENIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_RHODIUM_TYPE, ECColors.RHODIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_PALLADIUM_TYPE, ECColors.PALLADIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_SILVER_TYPE, ECColors.SILVER_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_CADMIUM_TYPE, ECColors.CADMIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_INDIUM_TYPE, ECColors.INDIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_TIN_TYPE, ECColors.TIN_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_ANTIMONY_TYPE, ECColors.ANTIMONY_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_TELLURIUM_TYPE, ECColors.TELLURIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_IODINE_TYPE, ECColors.IODINE_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_XENON_TYPE, ECColors.XENON_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_CESIUM_TYPE, ECColors.CESIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_BARIUM_TYPE, ECColors.BARIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_LANTHANUM_TYPE, ECColors.LANTHANUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_CERIUM_TYPE, ECColors.CERIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_PRASEODYMIUM_TYPE, ECColors.PRASEODYMIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_NEODYMIUM_TYPE, ECColors.NEODYMIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_PROMETHIUM_TYPE, ECColors.PROMETHIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_SAMARIUM_TYPE, ECColors.SAMARIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_EUROPIUM_TYPE, ECColors.EUROPIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_GADOLINIUM_TYPE, ECColors.GADOLINIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_TERBIUM_TYPE, ECColors.TERBIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_DYSPROSIUM_TYPE, ECColors.DYSPROSIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_HOLMIUM_TYPE, ECColors.HOLMIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_ERBIUM_TYPE, ECColors.ERBIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_THULIUM_TYPE, ECColors.THULIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_YTTERBIUM_TYPE, ECColors.YTTERBIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_LUTETIUM_TYPE, ECColors.LUTETIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_HAFNIUM_TYPE, ECColors.HAFNIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_TANTALUM_TYPE, ECColors.TANTALUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_TUNGSTEN_TYPE, ECColors.TUNGSTEN_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_RHENIUM_TYPE, ECColors.RHENIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_OSMIUM_TYPE, ECColors.OSMIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_IRIDIUM_TYPE, ECColors.IRIDIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_PLATINUM_TYPE, ECColors.PLATINUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_GOLD_TYPE, ECColors.GOLD_FOG);
        registerFluidType(e, ECFluidTypes.MERCURY_TYPE, ECColors.MERCURY_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_THALLIUM_TYPE, ECColors.THALLIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_LEAD_TYPE, ECColors.LEAD_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_BISMUTH_TYPE, ECColors.BISMUTH_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_POLONIUM_TYPE, ECColors.POLONIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_ASTATINE_TYPE, ECColors.ASTATINE_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_RADON_TYPE, ECColors.RADON_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_FRANCIUM_TYPE, ECColors.FRANCIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_RADIUM_TYPE, ECColors.RADIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_ACTINIUM_TYPE, ECColors.ACTINIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_THORIUM_TYPE, ECColors.THORIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_PROTACTINIUM_TYPE, ECColors.PROTACTINIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_URANIUM_TYPE, ECColors.URANIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_NEPTUNIUM_TYPE, ECColors.NEPTUNIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_PLUTONIUM_TYPE, ECColors.PLUTONIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_AMERICIUM_TYPE, ECColors.AMERICIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_CURIUM_TYPE, ECColors.CURIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_BERKELIUM_TYPE, ECColors.BERKELIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_CALIFORNIUM_TYPE, ECColors.CALIFORNIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_EINSTEINIUM_TYPE, ECColors.EINSTEINIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_FERMIUM_TYPE, ECColors.FERMIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_MENDELEVIUM_TYPE, ECColors.MENDELEVIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_NOBELIUM_TYPE, ECColors.NOBELIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_LAWRENCIUM_TYPE, ECColors.LAWRENCIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_RUTHERFORDIUM_TYPE, ECColors.RUTHERFORDIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_DUBNIUM_TYPE, ECColors.DUBNIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_SEABORGIUM_TYPE, ECColors.SEABORGIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_BOHRIUM_TYPE, ECColors.BOHRIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_HASSIUM_TYPE, ECColors.HASSIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_MEITNERIUM_TYPE, ECColors.MEITNERIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_DARMSTADTIUM_TYPE, ECColors.DARMSTADTIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_ROENTGENIUM_TYPE, ECColors.ROENTGENIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_COPERNICIUM_TYPE, ECColors.COPERNICIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_NIHONIUM_TYPE, ECColors.NIHONIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_FLEROVIUM_TYPE, ECColors.FLEROVIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_MOSCOVIUM_TYPE, ECColors.MOSCOVIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_LIVERMORIUM_TYPE, ECColors.LIVERMORIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_TENNESSINE_TYPE, ECColors.TENNESSINE_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_OGANESSON_TYPE, ECColors.OGANESSON_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_LONGIUM_TYPE, ECColors.LONGIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIQUID_MYSTERIUM_TYPE, ECColors.MYSTERIUM_FOG);
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
        ECFluidTypes.FLUID_TYPES.register(eventBus);
        FLUIDS.register(eventBus);
    }

    class FluidHolder {
        public DeferredHolder<FluidType, FluidType> type;
        public DeferredHolder<Fluid, BaseFlowingFluid.Source> source;
        public DeferredHolder<Fluid, BaseFlowingFluid.Flowing> flowing;
    }
}