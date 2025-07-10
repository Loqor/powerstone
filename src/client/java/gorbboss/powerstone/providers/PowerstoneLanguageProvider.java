package gorbboss.powerstone.providers;

import gorbboss.powerstone.core.PowerstoneBlocks;
import gorbboss.powerstone.core.PowerstoneItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class PowerstoneLanguageProvider extends FabricLanguageProvider {
    public PowerstoneLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, "en_us", registryLookup);
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(PowerstoneItems.REDSTONE_WAND.getTranslationKey(), "Redstone Wand");
        translationBuilder.add(PowerstoneBlocks.REDSTONE_GRANULE_BLOCK.asItem().getTranslationKey(), "Redstone Granules");
        translationBuilder.add(PowerstoneBlocks.REDSTONE_PEBBLE_BLOCK.asItem().getTranslationKey(), "Redstone Pebbles");
        translationBuilder.add(PowerstoneBlocks.REDSTONE_COBBLE_BLOCK.asItem().getTranslationKey(), "Redstone Cobbles");
        translationBuilder.add(PowerstoneBlocks.REDSTONE_BOULDER_BLOCK.asItem().getTranslationKey(), "Redstone Boulder");
    }
}