package me.rawtech.placeholder;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	private EventListener EventListener = new EventListener();
	
	public void onEnable()
	{
		this.getServer().getPluginManager().registerEvents(EventListener,this);
	}
}
