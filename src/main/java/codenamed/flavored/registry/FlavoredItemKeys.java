package codenamed.flavored.registry;

import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class FlavoredItemKeys {
    public static final RegistryKey<Item> CAULIFLOWER_SEEDS = of("cauliflower_seeds");

    public FlavoredItemKeys() {
    }

    private static RegistryKey<Item> of(String id) {
        return RegistryKey.of(RegistryKeys.ITEM, Identifier.ofVanilla(id));
    }
}