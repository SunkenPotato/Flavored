package codenamed.flavored.registry;

import codenamed.flavored.Flavored;
import codenamed.flavored.item.custom.CucumberSeedsItem;
import codenamed.flavored.item.custom.PepperSeedsItem;
import codenamed.flavored.item.custom.TomatoSeedsItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
public class FlavoredItems {

    public static final Item TOMATO = registerItem("tomato",
            new Item(new Item.Settings().food(FlavoredFoodComponents.TOMATO)));

    public static final Item CUCUMBER = registerItem("cucumber",
            new Item(new Item.Settings().food(FlavoredFoodComponents.CUCUMBER)));
    public static final Item PEPPER = registerItem("pepper",
            new Item(new Item.Settings().food(FlavoredFoodComponents.PEPPER)));

    public static final Item TOMATO_SEEDS = registerItem("tomato_seeds",
            new TomatoSeedsItem(FlavoredBlocks.TOMATO_BUSH, new Item.Settings()));

    public static final Item CUCUMBER_SEEDS = registerItem("cucumber_seeds",
            new CucumberSeedsItem(FlavoredBlocks.CUCUMBER_BUSH, new Item.Settings()));

    public static final Item PEPPER_SEEDS = registerItem("pepper_seeds",
            new PepperSeedsItem(FlavoredBlocks.PEPPER_BUSH, new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(Flavored.MOD_ID, name), item);

    }


    public static void registerModItems() {
        Flavored.LOGGER.info("Registering Mod Items for " + Flavored.MOD_ID);


    }

}
