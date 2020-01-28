package com.github.halotroop2288.unleadablepigs;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.PigEntityRenderer;

public class UnleadablePigsClient implements ClientModInitializer 
{
	@Override
	public void onInitializeClient()
	{
		EntityRendererRegistry.INSTANCE
		.register(UnleadablePigMod.UNLEADABLE_PIG, (entityRenderDispatcher, context) ->
		new PigEntityRenderer(entityRenderDispatcher));
	}
}
