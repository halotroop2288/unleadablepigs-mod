package com.github.halotroop2288.unleadablepigs;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityCategory;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.registry.Registry;

public class UnleadablePigMod implements ModInitializer
{
	static EntityType<UnleadablePigEntity> UNLEADABLE_PIG = FabricEntityTypeBuilder
		.create(EntityCategory.CREATURE, UnleadablePigEntity::new).size(EntityDimensions.fixed(1, 1)).build();
	
	@Override
	public void onInitialize()
	{
		Registry.register(Registry.ENTITY_TYPE, "unleadablepigs:unleadable_pig", UNLEADABLE_PIG);
		Registry.register(Registry.ITEM, "unleadablepigs:unleadable_pig_egg",
			new SpawnEggItem(UNLEADABLE_PIG, 15771043, 14377824, new Item.Settings().group(ItemGroup.MISC)));
	}
}
