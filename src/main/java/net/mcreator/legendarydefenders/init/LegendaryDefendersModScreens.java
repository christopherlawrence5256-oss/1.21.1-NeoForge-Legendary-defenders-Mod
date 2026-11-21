/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.legendarydefenders.init;

import net.neoforged.neoforge.client.event.RegisterMenuScreensEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.legendarydefenders.client.gui.BayardinterfaceScreen;

@EventBusSubscriber(Dist.CLIENT)
public class LegendaryDefendersModScreens {
	@SubscribeEvent
	public static void clientLoad(RegisterMenuScreensEvent event) {
		event.register(LegendaryDefendersModMenus.BAYARDINTERFACE.get(), BayardinterfaceScreen::new);
	}

	public interface ScreenAccessor {
		void updateMenuState(int elementType, String name, Object elementState);
	}
}