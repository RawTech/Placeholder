package me.rawtech.placeholder;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerLoginEvent.Result;
import org.bukkit.event.server.ServerListPingEvent;

public class EventListener implements Listener{

	public EventListener(){}
	
	@EventHandler
	public void onPlayerLogin(PlayerLoginEvent event)
	{
		event.disallow(Result.KICK_OTHER, ChatColor.WHITE+"We have a new IP: \n\n "+ChatColor.GOLD+"hub.rawtechnet.co.uk");
	}
	
	@EventHandler
	public void onServerPing(ServerListPingEvent event)
	{
		event.setMaxPlayers(0);
		event.setMotd(ChatColor.GOLD+"24/7 DvZ"+ChatColor.WHITE+" New IP: "+ChatColor.GOLD+"hub.rawtechnet.co.uk");
	}
}
