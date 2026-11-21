package net.mcreator.legendarydefenders.client.gui;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.client.gui.components.PlainTextButton;
import net.minecraft.client.gui.components.Button;
import net.minecraft.client.gui.GuiGraphics;

import net.mcreator.legendarydefenders.world.inventory.BayardinterfaceMenu;
import net.mcreator.legendarydefenders.init.LegendaryDefendersModScreens;

import com.mojang.blaze3d.systems.RenderSystem;

public class BayardinterfaceScreen extends AbstractContainerScreen<BayardinterfaceMenu> implements LegendaryDefendersModScreens.ScreenAccessor {
	private final Level world;
	private final int x, y, z;
	private final Player entity;
	private boolean menuStateUpdateActive = false;
	private Button button_sword;
	private Button button_rifle;
	private Button button_minigun;
	private Button button_spear;
	private Button button_grapple;
	private Button button_hammer;
	private static final ResourceLocation IMAGE_0 = ResourceLocation.parse("legendary_defenders:textures/screens/bayardinterface.png");

	public BayardinterfaceScreen(BayardinterfaceMenu container, Inventory inventory, Component text) {
		super(container, inventory, text);
		this.world = container.world;
		this.x = container.x;
		this.y = container.y;
		this.z = container.z;
		this.entity = container.entity;
		this.imageWidth = 176;
		this.imageHeight = 166;
	}

	@Override
	public void updateMenuState(int elementType, String name, Object elementState) {
		menuStateUpdateActive = true;
		menuStateUpdateActive = false;
	}

	@Override
	public void render(GuiGraphics guiGraphics, int mouseX, int mouseY, float partialTicks) {
		super.render(guiGraphics, mouseX, mouseY, partialTicks);
		this.renderTooltip(guiGraphics, mouseX, mouseY);
	}

	@Override
	protected void renderBg(GuiGraphics guiGraphics, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.setShaderColor(1, 1, 1, 1);
		RenderSystem.enableBlend();
		RenderSystem.defaultBlendFunc();
		guiGraphics.blit(IMAGE_0, this.leftPos + -40, this.topPos + -43, 0, 0, 256, 256, 256, 256);
		RenderSystem.disableBlend();
	}

	@Override
	public boolean keyPressed(int key, int b, int c) {
		if (key == 256) {
			this.minecraft.player.closeContainer();
			return true;
		}
		return super.keyPressed(key, b, c);
	}

	@Override
	protected void renderLabels(GuiGraphics guiGraphics, int mouseX, int mouseY) {
	}

	@Override
	public void init() {
		super.init();
		button_sword = new PlainTextButton(this.leftPos + 133, this.topPos + 69, 50, 20, Component.translatable("gui.legendary_defenders.bayardinterface.button_sword"), e -> {
		}, this.font);
		this.addRenderableWidget(button_sword);
		button_rifle = new PlainTextButton(this.leftPos + 13, this.topPos + 88, 50, 20, Component.translatable("gui.legendary_defenders.bayardinterface.button_rifle"), e -> {
		}, this.font);
		this.addRenderableWidget(button_rifle);
		button_minigun = new PlainTextButton(this.leftPos + 71, this.topPos + 123, 38, 20, Component.translatable("gui.legendary_defenders.bayardinterface.button_minigun"), e -> {
		}, this.font);
		this.addRenderableWidget(button_minigun);
		button_spear = new PlainTextButton(this.leftPos + 132, this.topPos + 86, 50, 20, Component.translatable("gui.legendary_defenders.bayardinterface.button_spear"), e -> {
		}, this.font);
		this.addRenderableWidget(button_spear);
		button_grapple = new PlainTextButton(this.leftPos + 69, this.topPos + 28, 60, 20, Component.translatable("gui.legendary_defenders.bayardinterface.button_grapple"), e -> {
		}, this.font);
		this.addRenderableWidget(button_grapple);
		button_hammer = new PlainTextButton(this.leftPos + 12, this.topPos + 69, 55, 20, Component.translatable("gui.legendary_defenders.bayardinterface.button_hammer"), e -> {
		}, this.font);
		this.addRenderableWidget(button_hammer);
	}
}