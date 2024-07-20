package codenamed.flavored.registry;

import codenamed.flavored.Flavored;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class FlavoredItemGroup {
    public static ItemGroup FLAVORED_GROUP = Registry.register(Registries.ITEM_GROUP, Identifier.of(Flavored.MOD_ID, "flavored_group"),
            FabricItemGroup.builder().displayName(Text.translatable("Flavored"))
                    .icon(() -> new ItemStack(FlavoredItems.TOMATO)).entries((displayContext, entries) -> {

                        entries.add(FlavoredItems.TOMATO_SEEDS);
                        entries.add(FlavoredItems.TOMATO);



                    }).build());

    public static void registerItemGroups() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {

        });
    }
}