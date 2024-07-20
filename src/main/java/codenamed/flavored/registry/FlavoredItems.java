package codenamed.flavored.registry;

import codenamed.flavored.Flavored;
import codenamed.flavored.item.custom.TomatoSeedItem;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
public class FlavoredItems {

    public static final Item TOMATO = registerItem("tomato",
            new Item(new Item.Settings().food(FlavoredFoodComponents.TOMATO)));


    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new TomatoSeedItem(FlavoredBlocks.TOMATO_BUSH, new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Flavored.MOD_ID, name), item);

    }


    public static void registerModItems() {
        Flavored.LOGGER.info("Registering Mod Items for " + Flavored.MOD_ID);


    }

}
