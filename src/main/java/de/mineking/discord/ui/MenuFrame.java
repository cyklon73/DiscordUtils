package de.mineking.discord.ui;

public abstract class MenuFrame {
	public final Menu menu;
	String name;

	public MenuFrame(Menu menu) {
		this.menu = menu;
	}

	public String getName() {
		return name;
	}

	public abstract void render();
	public abstract void cleanup();
}
