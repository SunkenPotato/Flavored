package codenamed.flavored.registry;

import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class FlavoredBlockKeys {
    public static final RegistryKey<Block> CAULIFLOWER = of("cauliflower");
    public static final RegistryKey<Block> CAULIFLOWER_STEM = of("cauliflower_stem");
    public static final RegistryKey<Block> ATTACHED_CAULIFLOWER_STEM = of("attached_cauliflower_stem");


    public FlavoredBlockKeys() {
    }

    private static RegistryKey<Block> of(String id) {
        return RegistryKey.of(RegistryKeys.BLOCK, Identifier.ofVanilla(id));
    }
}