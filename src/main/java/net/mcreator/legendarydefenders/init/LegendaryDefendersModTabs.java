/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.legendarydefenders.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.legendarydefenders.LegendaryDefendersMod;

public class LegendaryDefendersModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, LegendaryDefendersMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> VOLTRON = REGISTRY.register("voltron",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.legendary_defenders.voltron")).icon(() -> new ItemStack(LegendaryDefendersModItems.BLACK_BAYARD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(LegendaryDefendersModItems.BLACK_BAYARD.get());
				tabData.accept(LegendaryDefendersModItems.RED_BAYARD.get());
				tabData.accept(LegendaryDefendersModItems.YELLOW_BAYARD.get());
				tabData.accept(LegendaryDefendersModItems.BLUE_BAYARD.get());
				tabData.accept(LegendaryDefendersModItems.GREEN_BAYARD.get());
			}).withSearchBar().build());
}