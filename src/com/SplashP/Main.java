package com.SplashP.CNR;

import net.amigocraft.mglib.api.Minigame;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
	
	
	public void onEnable() {
		System.out.println("Cops N Robbers has been enabled!");
		mg = Minigame.registerPlugin(this);
	}
	
	public void onDisable() {
		System.out.println("Cops N Robbers has been disabled!");
	}
	
	public static Minigame mg;
	
		// Main class = WIP
}
