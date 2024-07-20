package codenamed.flavored;

import codenamed.flavored.registry.FlavoredBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class FlavoredClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(FlavoredBlocks.TOMATO_BUSH, RenderLayer.getCutout());
    }
}
