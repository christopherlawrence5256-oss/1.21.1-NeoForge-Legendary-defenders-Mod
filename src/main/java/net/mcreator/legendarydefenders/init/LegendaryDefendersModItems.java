/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.legendarydefenders.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.legendarydefenders.item.YellowBayardItem;
import net.mcreator.legendarydefenders.item.RedBayardItem;
import net.mcreator.legendarydefenders.item.GreenBayardItem;
import net.mcreator.legendarydefenders.item.BlueBayardItem;
import net.mcreator.legendarydefenders.item.BlackBayardItem;
import net.mcreator.legendarydefenders.LegendaryDefendersMod;

public class LegendaryDefendersModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(LegendaryDefendersMod.MODID);
	public static final DeferredItem<Item> BLACK_BAYARD;
	public static final DeferredItem<Item> RED_BAYARD;
	public static final DeferredItem<Item> YELLOW_BAYARD;
	public static final DeferredItem<Item> BLUE_BAYARD;
	public static final DeferredItem<Item> GREEN_BAYARD;
	static {
		BLACK_BAYARD = REGISTRY.register("black_bayard", BlackBayardItem::new);
		RED_BAYARD = REGISTRY.register("red_bayard", RedBayardItem::new);
		YELLOW_BAYARD = REGISTRY.register("yellow_bayard", YellowBayardItem::new);
		BLUE_BAYARD = REGISTRY.register("blue_bayard", BlueBayardItem::new);
		GREEN_BAYARD = REGISTRY.register("green_bayard", GreenBayardItem::new);
	}
	// Start of user code block custom items
	// End of user code block custom items
}