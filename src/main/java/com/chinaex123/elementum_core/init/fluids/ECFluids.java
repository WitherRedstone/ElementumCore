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

    FluidHolder HYDROGEN = registerFluid("hydrogen", () -> ECMaterialItems.HYDROGEN_BUCKET, () -> ECElementFluidBlocks.HYDROGEN,
            ECFluidTypes.HYDROGEN_TYPE, 100.0F, 4, 1, 10);

    FluidHolder HELIUM = registerFluid("helium", () -> ECMaterialItems.HELIUM_BUCKET, () -> ECElementFluidBlocks.HELIUM,
            ECFluidTypes.HELIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LITHIUM = registerFluid("lithium", () -> ECMaterialItems.LITHIUM_BUCKET, () -> ECElementFluidBlocks.LITHIUM,
            ECFluidTypes.LITHIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder BERYLLIUM = registerFluid("beryllium", () -> ECMaterialItems.BERYLLIUM_BUCKET, () -> ECElementFluidBlocks.BERYLLIUM,
            ECFluidTypes.BERYLLIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder BORON = registerFluid("boron", () -> ECMaterialItems.BORON_BUCKET, () -> ECElementFluidBlocks.BORON,
            ECFluidTypes.BORON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder CARBON = registerFluid("carbon", () -> ECMaterialItems.CARBON_BUCKET, () -> ECElementFluidBlocks.CARBON,
            ECFluidTypes.CARBON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder NITROGEN = registerFluid("nitrogen", () -> ECMaterialItems.NITROGEN_BUCKET, () -> ECElementFluidBlocks.NITROGEN,
            ECFluidTypes.NITROGEN_TYPE, 100.0F, 4, 1, 10);

    FluidHolder OXYGEN = registerFluid("oxygen", () -> ECMaterialItems.OXYGEN_BUCKET, () -> ECElementFluidBlocks.OXYGEN,
            ECFluidTypes.OXYGEN_TYPE, 100.0F, 4, 1, 10);

    FluidHolder FLUORINE = registerFluid("fluorine", () -> ECMaterialItems.FLUORINE_BUCKET, () -> ECElementFluidBlocks.FLUORINE,
            ECFluidTypes.FLUORINE_TYPE, 100.0F, 4, 1, 10);

    FluidHolder NEON = registerFluid("neon", () -> ECMaterialItems.NEON_BUCKET, () -> ECElementFluidBlocks.NEON,
            ECFluidTypes.NEON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder SODIUM = registerFluid("sodium", () -> ECMaterialItems.SODIUM_BUCKET, () -> ECElementFluidBlocks.SODIUM,
            ECFluidTypes.SODIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder MAGNESIUM = registerFluid("magnesium", () -> ECMaterialItems.MAGNESIUM_BUCKET, () -> ECElementFluidBlocks.MAGNESIUM,
            ECFluidTypes.MAGNESIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder ALUMINUM = registerFluid("aluminum", () -> ECMaterialItems.ALUMINUM_BUCKET, () -> ECElementFluidBlocks.ALUMINUM,
            ECFluidTypes.ALUMINUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder SILICON = registerFluid("silicon", () -> ECMaterialItems.SILICON_BUCKET, () -> ECElementFluidBlocks.SILICON,
            ECFluidTypes.SILICON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder PHOSPHORUS = registerFluid("phosphorus", () -> ECMaterialItems.PHOSPHORUS_BUCKET, () -> ECElementFluidBlocks.PHOSPHORUS,
            ECFluidTypes.PHOSPHORUS_TYPE, 100.0F, 4, 1, 10);

    FluidHolder SULFUR = registerFluid("sulfur", () -> ECMaterialItems.SULFUR_BUCKET, () -> ECElementFluidBlocks.SULFUR,
            ECFluidTypes.SULFUR_TYPE, 100.0F, 4, 1, 10);

    FluidHolder CHLORINE = registerFluid("chlorine", () -> ECMaterialItems.CHLORINE_BUCKET, () -> ECElementFluidBlocks.CHLORINE,
            ECFluidTypes.CHLORINE_TYPE, 100.0F, 4, 1, 10);

    FluidHolder ARGON = registerFluid("argon", () -> ECMaterialItems.ARGON_BUCKET, () -> ECElementFluidBlocks.ARGON,
            ECFluidTypes.ARGON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder POTASSIUM = registerFluid("potassium", () -> ECMaterialItems.POTASSIUM_BUCKET, () -> ECElementFluidBlocks.POTASSIUM,
            ECFluidTypes.POTASSIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder CALCIUM = registerFluid("calcium", () -> ECMaterialItems.CALCIUM_BUCKET, () -> ECElementFluidBlocks.CALCIUM,
            ECFluidTypes.CALCIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder SCANDIUM = registerFluid("scandium", () -> ECMaterialItems.SCANDIUM_BUCKET, () -> ECElementFluidBlocks.SCANDIUM,
            ECFluidTypes.SCANDIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder TITANIUM = registerFluid("titanium", () -> ECMaterialItems.TITANIUM_BUCKET, () -> ECElementFluidBlocks.TITANIUM,
            ECFluidTypes.TITANIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder VANADIUM = registerFluid("vanadium", () -> ECMaterialItems.VANADIUM_BUCKET, () -> ECElementFluidBlocks.VANADIUM,
            ECFluidTypes.VANADIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder CHROMIUM = registerFluid("chromium", () -> ECMaterialItems.CHROMIUM_BUCKET, () -> ECElementFluidBlocks.CHROMIUM,
            ECFluidTypes.CHROMIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder MANGANESE = registerFluid("manganese", () -> ECMaterialItems.MANGANESE_BUCKET, () -> ECElementFluidBlocks.MANGANESE,
            ECFluidTypes.MANGANESE_TYPE, 100.0F, 4, 1, 10);

    FluidHolder IRON = registerFluid("iron", () -> ECMaterialItems.IRON_BUCKET, () -> ECElementFluidBlocks.IRON,
            ECFluidTypes.IRON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder COBALT = registerFluid("cobalt", () -> ECMaterialItems.COBALT_BUCKET, () -> ECElementFluidBlocks.COBALT,
            ECFluidTypes.COBALT_TYPE, 100.0F, 4, 1, 10);

    FluidHolder NICKEL = registerFluid("nickel", () -> ECMaterialItems.NICKEL_BUCKET, () -> ECElementFluidBlocks.NICKEL,
            ECFluidTypes.NICKEL_TYPE, 100.0F, 4, 1, 10);

    FluidHolder COPPER = registerFluid("copper", () -> ECMaterialItems.COPPER_BUCKET, () -> ECElementFluidBlocks.COPPER,
            ECFluidTypes.COPPER_TYPE, 100.0F, 4, 1, 10);

    FluidHolder ZINC = registerFluid("zinc", () -> ECMaterialItems.ZINC_BUCKET, () -> ECElementFluidBlocks.ZINC,
            ECFluidTypes.ZINC_TYPE, 100.0F, 4, 1, 10);

    FluidHolder GALLIUM = registerFluid("gallium", () -> ECMaterialItems.GALLIUM_BUCKET, () -> ECElementFluidBlocks.GALLIUM,
            ECFluidTypes.GALLIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder GERMANIUM = registerFluid("germanium", () -> ECMaterialItems.GERMANIUM_BUCKET, () -> ECElementFluidBlocks.GERMANIUM,
            ECFluidTypes.GERMANIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder ARSENIC = registerFluid("arsenic", () -> ECMaterialItems.ARSENIC_BUCKET, () -> ECElementFluidBlocks.ARSENIC,
            ECFluidTypes.ARSENIC_TYPE, 100.0F, 4, 1, 10);

    FluidHolder SELENIUM = registerFluid("selenium", () -> ECMaterialItems.SELENIUM_BUCKET, () -> ECElementFluidBlocks.SELENIUM,
            ECFluidTypes.SELENIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder BROMINE = registerFluid("bromine", () -> ECMaterialItems.BROMINE_BUCKET, () -> ECElementFluidBlocks.BROMINE,
            ECFluidTypes.BROMINE_TYPE, 100.0F, 4, 1, 10);

    FluidHolder KRYPTON = registerFluid("krypton", () -> ECMaterialItems.KRYPTON_BUCKET, () -> ECElementFluidBlocks.KRYPTON,
            ECFluidTypes.KRYPTON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder RUBIDIUM = registerFluid("rubidium", () -> ECMaterialItems.RUBIDIUM_BUCKET, () -> ECElementFluidBlocks.RUBIDIUM,
            ECFluidTypes.RUBIDIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder STRONTIUM = registerFluid("strontium", () -> ECMaterialItems.STRONTIUM_BUCKET, () -> ECElementFluidBlocks.STRONTIUM,
            ECFluidTypes.STRONTIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder YTTRIUM = registerFluid("yttrium", () -> ECMaterialItems.YTTRIUM_BUCKET, () -> ECElementFluidBlocks.YTTRIUM,
            ECFluidTypes.YTTRIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder ZIRCONIUM = registerFluid("zirconium", () -> ECMaterialItems.ZIRCONIUM_BUCKET, () -> ECElementFluidBlocks.ZIRCONIUM,
            ECFluidTypes.ZIRCONIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder NIOBIUM = registerFluid("niobium", () -> ECMaterialItems.NIOBIUM_BUCKET, () -> ECElementFluidBlocks.NIOBIUM,
            ECFluidTypes.NIOBIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder MOLYBDENUM = registerFluid("molybdenum", () -> ECMaterialItems.MOLYBDENUM_BUCKET, () -> ECElementFluidBlocks.MOLYBDENUM,
            ECFluidTypes.MOLYBDENUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder TECHNETIUM = registerFluid("technetium", () -> ECMaterialItems.TECHNETIUM_BUCKET, () -> ECElementFluidBlocks.TECHNETIUM,
            ECFluidTypes.TECHNETIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder RUTHENIUM = registerFluid("ruthenium", () -> ECMaterialItems.RUTHENIUM_BUCKET, () -> ECElementFluidBlocks.RUTHENIUM,
            ECFluidTypes.RUTHENIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder RHODIUM = registerFluid("rhodium", () -> ECMaterialItems.RHODIUM_BUCKET, () -> ECElementFluidBlocks.RHODIUM,
            ECFluidTypes.RHODIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder PALLADIUM = registerFluid("palladium", () -> ECMaterialItems.PALLADIUM_BUCKET, () -> ECElementFluidBlocks.PALLADIUM,
            ECFluidTypes.PALLADIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder SILVER = registerFluid("silver", () -> ECMaterialItems.SILVER_BUCKET, () -> ECElementFluidBlocks.SILVER,
            ECFluidTypes.SILVER_TYPE, 100.0F, 4, 1, 10);

    FluidHolder CADMIUM = registerFluid("cadmium", () -> ECMaterialItems.CADMIUM_BUCKET, () -> ECElementFluidBlocks.CADMIUM,
            ECFluidTypes.CADMIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder INDIUM = registerFluid("indium", () -> ECMaterialItems.INDIUM_BUCKET, () -> ECElementFluidBlocks.INDIUM,
            ECFluidTypes.INDIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder TIN = registerFluid("tin", () -> ECMaterialItems.TIN_BUCKET, () -> ECElementFluidBlocks.TIN,
            ECFluidTypes.TIN_TYPE, 100.0F, 4, 1, 10);

    FluidHolder ANTIMONY = registerFluid("antimony", () -> ECMaterialItems.ANTIMONY_BUCKET, () -> ECElementFluidBlocks.ANTIMONY,
            ECFluidTypes.ANTIMONY_TYPE, 100.0F, 4, 1, 10);

    FluidHolder TELLURIUM = registerFluid("tellurium", () -> ECMaterialItems.TELLURIUM_BUCKET, () -> ECElementFluidBlocks.TELLURIUM,
            ECFluidTypes.TELLURIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder IODINE = registerFluid("iodine", () -> ECMaterialItems.IODINE_BUCKET, () -> ECElementFluidBlocks.IODINE,
            ECFluidTypes.IODINE_TYPE, 100.0F, 4, 1, 10);

    FluidHolder XENON = registerFluid("xenon", () -> ECMaterialItems.XENON_BUCKET, () -> ECElementFluidBlocks.XENON,
            ECFluidTypes.XENON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder CESIUM = registerFluid("cesium", () -> ECMaterialItems.CESIUM_BUCKET, () -> ECElementFluidBlocks.CESIUM,
            ECFluidTypes.CESIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder BARIUM = registerFluid("barium", () -> ECMaterialItems.BARIUM_BUCKET, () -> ECElementFluidBlocks.BARIUM,
            ECFluidTypes.BARIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LANTHANUM = registerFluid("lanthanum", () -> ECMaterialItems.LANTHANUM_BUCKET, () -> ECElementFluidBlocks.LANTHANUM,
            ECFluidTypes.LANTHANUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder CERIUM = registerFluid("cerium", () -> ECMaterialItems.CERIUM_BUCKET, () -> ECElementFluidBlocks.CERIUM,
            ECFluidTypes.CERIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder PRASEODYMIUM = registerFluid("praseodymium", () -> ECMaterialItems.PRASEODYMIUM_BUCKET, () -> ECElementFluidBlocks.PRASEODYMIUM,
            ECFluidTypes.PRASEODYMIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder NEODYMIUM = registerFluid("neodymium", () -> ECMaterialItems.NEODYMIUM_BUCKET, () -> ECElementFluidBlocks.NEODYMIUM,
            ECFluidTypes.NEODYMIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder PROMETHIUM = registerFluid("promethium", () -> ECMaterialItems.PROMETHIUM_BUCKET, () -> ECElementFluidBlocks.PROMETHIUM,
            ECFluidTypes.PROMETHIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder SAMARIUM = registerFluid("samarium", () -> ECMaterialItems.SAMARIUM_BUCKET, () -> ECElementFluidBlocks.SAMARIUM,
            ECFluidTypes.SAMARIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder EUROPIUM = registerFluid("europium", () -> ECMaterialItems.EUROPIUM_BUCKET, () -> ECElementFluidBlocks.EUROPIUM,
            ECFluidTypes.EUROPIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder GADOLINIUM = registerFluid("gadolinium", () -> ECMaterialItems.GADOLINIUM_BUCKET, () -> ECElementFluidBlocks.GADOLINIUM,
            ECFluidTypes.GADOLINIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder TERBIUM = registerFluid("terbium", () -> ECMaterialItems.TERBIUM_BUCKET, () -> ECElementFluidBlocks.TERBIUM,
            ECFluidTypes.TERBIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder DYSPROSIUM = registerFluid("dysprosium", () -> ECMaterialItems.DYSPROSIUM_BUCKET, () -> ECElementFluidBlocks.DYSPROSIUM,
            ECFluidTypes.DYSPROSIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder HOLMIUM = registerFluid("holmium", () -> ECMaterialItems.HOLMIUM_BUCKET, () -> ECElementFluidBlocks.HOLMIUM,
            ECFluidTypes.HOLMIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder ERBIUM = registerFluid("erbium", () -> ECMaterialItems.ERBIUM_BUCKET, () -> ECElementFluidBlocks.ERBIUM,
            ECFluidTypes.ERBIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder THULIUM = registerFluid("thulium", () -> ECMaterialItems.THULIUM_BUCKET, () -> ECElementFluidBlocks.THULIUM,
            ECFluidTypes.THULIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder YTTERBIUM = registerFluid("ytterbium", () -> ECMaterialItems.YTTERBIUM_BUCKET, () -> ECElementFluidBlocks.YTTERBIUM,
            ECFluidTypes.YTTERBIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LUTETIUM = registerFluid("lutetium", () -> ECMaterialItems.LUTETIUM_BUCKET, () -> ECElementFluidBlocks.LUTETIUM,
            ECFluidTypes.LUTETIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder HAFNIUM = registerFluid("hafnium", () -> ECMaterialItems.HAFNIUM_BUCKET, () -> ECElementFluidBlocks.HAFNIUM,
            ECFluidTypes.HAFNIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder TANTALUM = registerFluid("tantalum", () -> ECMaterialItems.TANTALUM_BUCKET, () -> ECElementFluidBlocks.TANTALUM,
            ECFluidTypes.TANTALUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder TUNGSTEN = registerFluid("tungsten", () -> ECMaterialItems.TUNGSTEN_BUCKET, () -> ECElementFluidBlocks.TUNGSTEN,
            ECFluidTypes.TUNGSTEN_TYPE, 100.0F, 4, 1, 10);

    FluidHolder RHENIUM = registerFluid("rhenium", () -> ECMaterialItems.RHENIUM_BUCKET, () -> ECElementFluidBlocks.RHENIUM,
            ECFluidTypes.RHENIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder OSMIUM = registerFluid("osmium", () -> ECMaterialItems.OSMIUM_BUCKET, () -> ECElementFluidBlocks.OSMIUM,
            ECFluidTypes.OSMIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder IRIDIUM = registerFluid("iridium", () -> ECMaterialItems.IRIDIUM_BUCKET, () -> ECElementFluidBlocks.IRIDIUM,
            ECFluidTypes.IRIDIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder PLATINUM = registerFluid("platinum", () -> ECMaterialItems.PLATINUM_BUCKET, () -> ECElementFluidBlocks.PLATINUM,
            ECFluidTypes.PLATINUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder GOLD = registerFluid("gold", () -> ECMaterialItems.GOLD_BUCKET, () -> ECElementFluidBlocks.GOLD,
            ECFluidTypes.GOLD_TYPE, 100.0F, 4, 1, 10);

    FluidHolder MERCURY = registerFluid("mercury", () -> ECMaterialItems.MERCURY_BUCKET, () -> ECElementFluidBlocks.MERCURY,
            ECFluidTypes.MERCURY_TYPE, 100.0F, 4, 1, 10);

    FluidHolder THALLIUM = registerFluid("thallium", () -> ECMaterialItems.THALLIUM_BUCKET, () -> ECElementFluidBlocks.THALLIUM,
            ECFluidTypes.THALLIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LEAD = registerFluid("lead", () -> ECMaterialItems.LEAD_BUCKET, () -> ECElementFluidBlocks.LEAD,
            ECFluidTypes.LEAD_TYPE, 100.0F, 4, 1, 10);

    FluidHolder BISMUTH = registerFluid("bismuth", () -> ECMaterialItems.BISMUTH_BUCKET, () -> ECElementFluidBlocks.BISMUTH,
            ECFluidTypes.BISMUTH_TYPE, 100.0F, 4, 1, 10);

    FluidHolder POLONIUM = registerFluid("polonium", () -> ECMaterialItems.POLONIUM_BUCKET, () -> ECElementFluidBlocks.POLONIUM,
            ECFluidTypes.POLONIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder ASTATINE = registerFluid("astatine", () -> ECMaterialItems.ASTATINE_BUCKET, () -> ECElementFluidBlocks.ASTATINE,
            ECFluidTypes.ASTATINE_TYPE, 100.0F, 4, 1, 10);

    FluidHolder RADON = registerFluid("radon", () -> ECMaterialItems.RADON_BUCKET, () -> ECElementFluidBlocks.RADON,
            ECFluidTypes.RADON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder FRANCIUM = registerFluid("francium", () -> ECMaterialItems.FRANCIUM_BUCKET, () -> ECElementFluidBlocks.FRANCIUM,
            ECFluidTypes.FRANCIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder RADIUM = registerFluid("radium", () -> ECMaterialItems.RADIUM_BUCKET, () -> ECElementFluidBlocks.RADIUM,
            ECFluidTypes.RADIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder ACTINIUM = registerFluid("actinium", () -> ECMaterialItems.ACTINIUM_BUCKET, () -> ECElementFluidBlocks.ACTINIUM,
            ECFluidTypes.ACTINIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder THORIUM = registerFluid("thorium", () -> ECMaterialItems.THORIUM_BUCKET, () -> ECElementFluidBlocks.THORIUM,
            ECFluidTypes.THORIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder PROTACTINIUM = registerFluid("protactinium", () -> ECMaterialItems.PROTACTINIUM_BUCKET, () -> ECElementFluidBlocks.PROTACTINIUM,
            ECFluidTypes.PROTACTINIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder URANIUM = registerFluid("uranium", () -> ECMaterialItems.URANIUM_BUCKET, () -> ECElementFluidBlocks.URANIUM,
            ECFluidTypes.URANIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder NEPTUNIUM = registerFluid("neptunium", () -> ECMaterialItems.NEPTUNIUM_BUCKET, () -> ECElementFluidBlocks.NEPTUNIUM,
            ECFluidTypes.NEPTUNIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder PLUTONIUM = registerFluid("plutonium", () -> ECMaterialItems.PLUTONIUM_BUCKET, () -> ECElementFluidBlocks.PLUTONIUM,
            ECFluidTypes.PLUTONIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder AMERICIUM = registerFluid("americium", () -> ECMaterialItems.AMERICIUM_BUCKET, () -> ECElementFluidBlocks.AMERICIUM,
            ECFluidTypes.AMERICIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder CURIUM = registerFluid("curium", () -> ECMaterialItems.CURIUM_BUCKET, () -> ECElementFluidBlocks.CURIUM,
            ECFluidTypes.CURIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder BERKELIUM = registerFluid("berkelium", () -> ECMaterialItems.BERKELIUM_BUCKET, () -> ECElementFluidBlocks.BERKELIUM,
            ECFluidTypes.BERKELIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder CALIFORNIUM = registerFluid("californium", () -> ECMaterialItems.CALIFORNIUM_BUCKET, () -> ECElementFluidBlocks.CALIFORNIUM,
            ECFluidTypes.CALIFORNIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder EINSTEINIUM = registerFluid("einsteinium", () -> ECMaterialItems.EINSTEINIUM_BUCKET, () -> ECElementFluidBlocks.EINSTEINIUM,
            ECFluidTypes.EINSTEINIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder FERMIUM = registerFluid("fermium", () -> ECMaterialItems.FERMIUM_BUCKET, () -> ECElementFluidBlocks.FERMIUM,
            ECFluidTypes.FERMIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder MENDELEVIUM = registerFluid("mendelevium", () -> ECMaterialItems.MENDELEVIUM_BUCKET, () -> ECElementFluidBlocks.MENDELEVIUM,
            ECFluidTypes.MENDELEVIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder NOBELIUM = registerFluid("nobelium", () -> ECMaterialItems.NOBELIUM_BUCKET, () -> ECElementFluidBlocks.NOBELIUM,
            ECFluidTypes.NOBELIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LAWRENCIUM = registerFluid("lawrencium", () -> ECMaterialItems.LAWRENCIUM_BUCKET, () -> ECElementFluidBlocks.LAWRENCIUM,
            ECFluidTypes.LAWRENCIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder RUTHERFORDIUM = registerFluid("rutherfordium", () -> ECMaterialItems.RUTHERFORDIUM_BUCKET, () -> ECElementFluidBlocks.RUTHERFORDIUM,
            ECFluidTypes.RUTHERFORDIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder DUBNIUM = registerFluid("dubnium", () -> ECMaterialItems.DUBNIUM_BUCKET, () -> ECElementFluidBlocks.DUBNIUM,
            ECFluidTypes.DUBNIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder SEABORGIUM = registerFluid("seaborgium", () -> ECMaterialItems.SEABORGIUM_BUCKET, () -> ECElementFluidBlocks.SEABORGIUM,
            ECFluidTypes.SEABORGIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder BOHRIUM = registerFluid("bohrium", () -> ECMaterialItems.BOHRIUM_BUCKET, () -> ECElementFluidBlocks.BOHRIUM,
            ECFluidTypes.BOHRIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder HASSIUM = registerFluid("hassium", () -> ECMaterialItems.HASSIUM_BUCKET, () -> ECElementFluidBlocks.HASSIUM,
            ECFluidTypes.HASSIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder MEITNERIUM = registerFluid("meitnerium", () -> ECMaterialItems.MEITNERIUM_BUCKET, () -> ECElementFluidBlocks.MEITNERIUM,
            ECFluidTypes.MEITNERIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder DARMSTADTIUM = registerFluid("darmstadtium", () -> ECMaterialItems.DARMSTADTIUM_BUCKET, () -> ECElementFluidBlocks.DARMSTADTIUM,
            ECFluidTypes.DARMSTADTIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder ROENTGENIUM = registerFluid("roentgenium", () -> ECMaterialItems.ROENTGENIUM_BUCKET, () -> ECElementFluidBlocks.ROENTGENIUM,
            ECFluidTypes.ROENTGENIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder COPERNICIUM = registerFluid("copernicium", () -> ECMaterialItems.COPERNICIUM_BUCKET, () -> ECElementFluidBlocks.COPERNICIUM,
            ECFluidTypes.COPERNICIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder NIHONIUM = registerFluid("nihonium", () -> ECMaterialItems.NIHONIUM_BUCKET, () -> ECElementFluidBlocks.NIHONIUM,
            ECFluidTypes.NIHONIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder FLEROVIUM = registerFluid("flerovium", () -> ECMaterialItems.FLEROVIUM_BUCKET, () -> ECElementFluidBlocks.FLEROVIUM,
            ECFluidTypes.FLEROVIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder MOSCOVIUM = registerFluid("moscovium", () -> ECMaterialItems.MOSCOVIUM_BUCKET, () -> ECElementFluidBlocks.MOSCOVIUM,
            ECFluidTypes.MOSCOVIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LIVERMORIUM = registerFluid("livermorium", () -> ECMaterialItems.LIVERMORIUM_BUCKET, () -> ECElementFluidBlocks.LIVERMORIUM,
            ECFluidTypes.LIVERMORIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder TENNESSINE = registerFluid("tennessine", () -> ECMaterialItems.TENNESSINE_BUCKET, () -> ECElementFluidBlocks.TENNESSINE,
            ECFluidTypes.TENNESSINE_TYPE, 100.0F, 4, 1, 10);

    FluidHolder OGANESSON = registerFluid("oganesson", () -> ECMaterialItems.OGANESSON_BUCKET, () -> ECElementFluidBlocks.OGANESSON,
            ECFluidTypes.OGANESSON_TYPE, 100.0F, 4, 1, 10);

    FluidHolder LONGIUM = registerFluid("longium", () -> ECMaterialItems.LONGIUM_BUCKET, () -> ECElementFluidBlocks.LONGIUM,
            ECFluidTypes.LONGIUM_TYPE, 100.0F, 4, 1, 10);

    FluidHolder MYSTERIUM = registerFluid("mysterium", () -> ECMaterialItems.MYSTERIUM_BUCKET, () -> ECElementFluidBlocks.MYSTERIUM,
            ECFluidTypes.MYSTERIUM_TYPE, 100.0F, 4, 1, 10);

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
        registerFluidType(e, ECFluidTypes.HYDROGEN_TYPE, ECColors.HYDROGEN_FOG);
        registerFluidType(e, ECFluidTypes.HELIUM_TYPE, ECColors.HELIUM_FOG);
        registerFluidType(e, ECFluidTypes.LITHIUM_TYPE, ECColors.LITHIUM_FOG);
        registerFluidType(e, ECFluidTypes.BERYLLIUM_TYPE, ECColors.BERYLLIUM_FOG);
        registerFluidType(e, ECFluidTypes.BORON_TYPE, ECColors.BORON_FOG);
        registerFluidType(e, ECFluidTypes.CARBON_TYPE, ECColors.CARBON_FOG);
        registerFluidType(e, ECFluidTypes.NITROGEN_TYPE, ECColors.NITROGEN_FOG);
        registerFluidType(e, ECFluidTypes.OXYGEN_TYPE, ECColors.OXYGEN_FOG);
        registerFluidType(e, ECFluidTypes.FLUORINE_TYPE, ECColors.FLUORINE_FOG);
        registerFluidType(e, ECFluidTypes.NEON_TYPE, ECColors.NEON_FOG);
        registerFluidType(e, ECFluidTypes.SODIUM_TYPE, ECColors.SODIUM_FOG);
        registerFluidType(e, ECFluidTypes.MAGNESIUM_TYPE, ECColors.MAGNESIUM_FOG);
        registerFluidType(e, ECFluidTypes.ALUMINUM_TYPE, ECColors.ALUMINUM_FOG);
        registerFluidType(e, ECFluidTypes.SILICON_TYPE, ECColors.SILICON_FOG);
        registerFluidType(e, ECFluidTypes.PHOSPHORUS_TYPE, ECColors.PHOSPHORUS_FOG);
        registerFluidType(e, ECFluidTypes.SULFUR_TYPE, ECColors.SULFUR_FOG);
        registerFluidType(e, ECFluidTypes.CHLORINE_TYPE, ECColors.CHLORINE_FOG);
        registerFluidType(e, ECFluidTypes.ARGON_TYPE, ECColors.ARGON_FOG);
        registerFluidType(e, ECFluidTypes.POTASSIUM_TYPE, ECColors.POTASSIUM_FOG);
        registerFluidType(e, ECFluidTypes.CALCIUM_TYPE, ECColors.CALCIUM_FOG);
        registerFluidType(e, ECFluidTypes.SCANDIUM_TYPE, ECColors.SCANDIUM_FOG);
        registerFluidType(e, ECFluidTypes.TITANIUM_TYPE, ECColors.TITANIUM_FOG);
        registerFluidType(e, ECFluidTypes.VANADIUM_TYPE, ECColors.VANADIUM_FOG);
        registerFluidType(e, ECFluidTypes.CHROMIUM_TYPE, ECColors.CHROMIUM_FOG);
        registerFluidType(e, ECFluidTypes.MANGANESE_TYPE, ECColors.MANGANESE_FOG);
        registerFluidType(e, ECFluidTypes.IRON_TYPE, ECColors.IRON_FOG);
        registerFluidType(e, ECFluidTypes.COBALT_TYPE, ECColors.COBALT_FOG);
        registerFluidType(e, ECFluidTypes.NICKEL_TYPE, ECColors.NICKEL_FOG);
        registerFluidType(e, ECFluidTypes.COPPER_TYPE, ECColors.COPPER_FOG);
        registerFluidType(e, ECFluidTypes.ZINC_TYPE, ECColors.ZINC_FOG);
        registerFluidType(e, ECFluidTypes.GALLIUM_TYPE, ECColors.GALLIUM_FOG);
        registerFluidType(e, ECFluidTypes.GERMANIUM_TYPE, ECColors.GERMANIUM_FOG);
        registerFluidType(e, ECFluidTypes.ARSENIC_TYPE, ECColors.ARSENIC_FOG);
        registerFluidType(e, ECFluidTypes.SELENIUM_TYPE, ECColors.SELENIUM_FOG);
        registerFluidType(e, ECFluidTypes.BROMINE_TYPE, ECColors.BROMINE_FOG);
        registerFluidType(e, ECFluidTypes.KRYPTON_TYPE, ECColors.KRYPTON_FOG);
        registerFluidType(e, ECFluidTypes.RUBIDIUM_TYPE, ECColors.RUBIDIUM_FOG);
        registerFluidType(e, ECFluidTypes.STRONTIUM_TYPE, ECColors.STRONTIUM_FOG);
        registerFluidType(e, ECFluidTypes.YTTRIUM_TYPE, ECColors.YTTRIUM_FOG);
        registerFluidType(e, ECFluidTypes.ZIRCONIUM_TYPE, ECColors.ZIRCONIUM_FOG);
        registerFluidType(e, ECFluidTypes.NIOBIUM_TYPE, ECColors.NIOBIUM_FOG);
        registerFluidType(e, ECFluidTypes.MOLYBDENUM_TYPE, ECColors.MOLYBDENUM_FOG);
        registerFluidType(e, ECFluidTypes.TECHNETIUM_TYPE, ECColors.TECHNETIUM_FOG);
        registerFluidType(e, ECFluidTypes.RUTHENIUM_TYPE, ECColors.RUTHENIUM_FOG);
        registerFluidType(e, ECFluidTypes.RHODIUM_TYPE, ECColors.RHODIUM_FOG);
        registerFluidType(e, ECFluidTypes.PALLADIUM_TYPE, ECColors.PALLADIUM_FOG);
        registerFluidType(e, ECFluidTypes.SILVER_TYPE, ECColors.SILVER_FOG);
        registerFluidType(e, ECFluidTypes.CADMIUM_TYPE, ECColors.CADMIUM_FOG);
        registerFluidType(e, ECFluidTypes.INDIUM_TYPE, ECColors.INDIUM_FOG);
        registerFluidType(e, ECFluidTypes.TIN_TYPE, ECColors.TIN_FOG);
        registerFluidType(e, ECFluidTypes.ANTIMONY_TYPE, ECColors.ANTIMONY_FOG);
        registerFluidType(e, ECFluidTypes.TELLURIUM_TYPE, ECColors.TELLURIUM_FOG);
        registerFluidType(e, ECFluidTypes.IODINE_TYPE, ECColors.IODINE_FOG);
        registerFluidType(e, ECFluidTypes.XENON_TYPE, ECColors.XENON_FOG);
        registerFluidType(e, ECFluidTypes.CESIUM_TYPE, ECColors.CESIUM_FOG);
        registerFluidType(e, ECFluidTypes.BARIUM_TYPE, ECColors.BARIUM_FOG);
        registerFluidType(e, ECFluidTypes.LANTHANUM_TYPE, ECColors.LANTHANUM_FOG);
        registerFluidType(e, ECFluidTypes.CERIUM_TYPE, ECColors.CERIUM_FOG);
        registerFluidType(e, ECFluidTypes.PRASEODYMIUM_TYPE, ECColors.PRASEODYMIUM_FOG);
        registerFluidType(e, ECFluidTypes.NEODYMIUM_TYPE, ECColors.NEODYMIUM_FOG);
        registerFluidType(e, ECFluidTypes.PROMETHIUM_TYPE, ECColors.PROMETHIUM_FOG);
        registerFluidType(e, ECFluidTypes.SAMARIUM_TYPE, ECColors.SAMARIUM_FOG);
        registerFluidType(e, ECFluidTypes.EUROPIUM_TYPE, ECColors.EUROPIUM_FOG);
        registerFluidType(e, ECFluidTypes.GADOLINIUM_TYPE, ECColors.GADOLINIUM_FOG);
        registerFluidType(e, ECFluidTypes.TERBIUM_TYPE, ECColors.TERBIUM_FOG);
        registerFluidType(e, ECFluidTypes.DYSPROSIUM_TYPE, ECColors.DYSPROSIUM_FOG);
        registerFluidType(e, ECFluidTypes.HOLMIUM_TYPE, ECColors.HOLMIUM_FOG);
        registerFluidType(e, ECFluidTypes.ERBIUM_TYPE, ECColors.ERBIUM_FOG);
        registerFluidType(e, ECFluidTypes.THULIUM_TYPE, ECColors.THULIUM_FOG);
        registerFluidType(e, ECFluidTypes.YTTERBIUM_TYPE, ECColors.YTTERBIUM_FOG);
        registerFluidType(e, ECFluidTypes.LUTETIUM_TYPE, ECColors.LUTETIUM_FOG);
        registerFluidType(e, ECFluidTypes.HAFNIUM_TYPE, ECColors.HAFNIUM_FOG);
        registerFluidType(e, ECFluidTypes.TANTALUM_TYPE, ECColors.TANTALUM_FOG);
        registerFluidType(e, ECFluidTypes.TUNGSTEN_TYPE, ECColors.TUNGSTEN_FOG);
        registerFluidType(e, ECFluidTypes.RHENIUM_TYPE, ECColors.RHENIUM_FOG);
        registerFluidType(e, ECFluidTypes.OSMIUM_TYPE, ECColors.OSMIUM_FOG);
        registerFluidType(e, ECFluidTypes.IRIDIUM_TYPE, ECColors.IRIDIUM_FOG);
        registerFluidType(e, ECFluidTypes.PLATINUM_TYPE, ECColors.PLATINUM_FOG);
        registerFluidType(e, ECFluidTypes.GOLD_TYPE, ECColors.GOLD_FOG);
        registerFluidType(e, ECFluidTypes.MERCURY_TYPE, ECColors.MERCURY_FOG);
        registerFluidType(e, ECFluidTypes.THALLIUM_TYPE, ECColors.THALLIUM_FOG);
        registerFluidType(e, ECFluidTypes.LEAD_TYPE, ECColors.LEAD_FOG);
        registerFluidType(e, ECFluidTypes.BISMUTH_TYPE, ECColors.BISMUTH_FOG);
        registerFluidType(e, ECFluidTypes.POLONIUM_TYPE, ECColors.POLONIUM_FOG);
        registerFluidType(e, ECFluidTypes.ASTATINE_TYPE, ECColors.ASTATINE_FOG);
        registerFluidType(e, ECFluidTypes.RADON_TYPE, ECColors.RADON_FOG);
        registerFluidType(e, ECFluidTypes.FRANCIUM_TYPE, ECColors.FRANCIUM_FOG);
        registerFluidType(e, ECFluidTypes.RADIUM_TYPE, ECColors.RADIUM_FOG);
        registerFluidType(e, ECFluidTypes.ACTINIUM_TYPE, ECColors.ACTINIUM_FOG);
        registerFluidType(e, ECFluidTypes.THORIUM_TYPE, ECColors.THORIUM_FOG);
        registerFluidType(e, ECFluidTypes.PROTACTINIUM_TYPE, ECColors.PROTACTINIUM_FOG);
        registerFluidType(e, ECFluidTypes.URANIUM_TYPE, ECColors.URANIUM_FOG);
        registerFluidType(e, ECFluidTypes.NEPTUNIUM_TYPE, ECColors.NEPTUNIUM_FOG);
        registerFluidType(e, ECFluidTypes.PLUTONIUM_TYPE, ECColors.PLUTONIUM_FOG);
        registerFluidType(e, ECFluidTypes.AMERICIUM_TYPE, ECColors.AMERICIUM_FOG);
        registerFluidType(e, ECFluidTypes.CURIUM_TYPE, ECColors.CURIUM_FOG);
        registerFluidType(e, ECFluidTypes.BERKELIUM_TYPE, ECColors.BERKELIUM_FOG);
        registerFluidType(e, ECFluidTypes.CALIFORNIUM_TYPE, ECColors.CALIFORNIUM_FOG);
        registerFluidType(e, ECFluidTypes.EINSTEINIUM_TYPE, ECColors.EINSTEINIUM_FOG);
        registerFluidType(e, ECFluidTypes.FERMIUM_TYPE, ECColors.FERMIUM_FOG);
        registerFluidType(e, ECFluidTypes.MENDELEVIUM_TYPE, ECColors.MENDELEVIUM_FOG);
        registerFluidType(e, ECFluidTypes.NOBELIUM_TYPE, ECColors.NOBELIUM_FOG);
        registerFluidType(e, ECFluidTypes.LAWRENCIUM_TYPE, ECColors.LAWRENCIUM_FOG);
        registerFluidType(e, ECFluidTypes.RUTHERFORDIUM_TYPE, ECColors.RUTHERFORDIUM_FOG);
        registerFluidType(e, ECFluidTypes.DUBNIUM_TYPE, ECColors.DUBNIUM_FOG);
        registerFluidType(e, ECFluidTypes.SEABORGIUM_TYPE, ECColors.SEABORGIUM_FOG);
        registerFluidType(e, ECFluidTypes.BOHRIUM_TYPE, ECColors.BOHRIUM_FOG);
        registerFluidType(e, ECFluidTypes.HASSIUM_TYPE, ECColors.HASSIUM_FOG);
        registerFluidType(e, ECFluidTypes.MEITNERIUM_TYPE, ECColors.MEITNERIUM_FOG);
        registerFluidType(e, ECFluidTypes.DARMSTADTIUM_TYPE, ECColors.DARMSTADTIUM_FOG);
        registerFluidType(e, ECFluidTypes.ROENTGENIUM_TYPE, ECColors.ROENTGENIUM_FOG);
        registerFluidType(e, ECFluidTypes.COPERNICIUM_TYPE, ECColors.COPERNICIUM_FOG);
        registerFluidType(e, ECFluidTypes.NIHONIUM_TYPE, ECColors.NIHONIUM_FOG);
        registerFluidType(e, ECFluidTypes.FLEROVIUM_TYPE, ECColors.FLEROVIUM_FOG);
        registerFluidType(e, ECFluidTypes.MOSCOVIUM_TYPE, ECColors.MOSCOVIUM_FOG);
        registerFluidType(e, ECFluidTypes.LIVERMORIUM_TYPE, ECColors.LIVERMORIUM_FOG);
        registerFluidType(e, ECFluidTypes.TENNESSINE_TYPE, ECColors.TENNESSINE_FOG);
        registerFluidType(e, ECFluidTypes.OGANESSON_TYPE, ECColors.OGANESSON_FOG);
        registerFluidType(e, ECFluidTypes.LONGIUM_TYPE, ECColors.LONGIUM_FOG);
        registerFluidType(e, ECFluidTypes.MYSTERIUM_TYPE, ECColors.MYSTERIUM_FOG);
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