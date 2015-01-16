package com.SplashP.CNR;

import java.util.logging.Logger;

import me.cybermaxke.materialapi.material.CustomMaterial;
import net.amigocraft.mglib.api.Minigame;

import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {
	
	public static Minigame mg;
	public Main plugin;
	Logger l = Bukkit.getLogger();
	FileConfiguration c = getConfig();
	public static CustomMaterial Wand;
	
	public Main(Main instance){
	    this.plugin = instance;
	}
	
	public void onEnable() {
		mg = Minigame.registerPlugin(this);
		c.options().copyDefaults(true);
		saveConfig();
		l.info("CopNRobbers is now enabled.");
	}
	
	public void onDisable() {
		l.info("CopsNRobbers is now disabled.");
	}
	
	
	public void saveleftclicklocation(float x, float y, float z) {
		c.set("leftx", x);
		c.set("lefty", y);
		c.set("leftz", z);
		saveConfig();
	}

	public void saverightclicklocation(float x, float y, float z) {
		c.set("rightx", x);
		c.set("righty", y);
		c.set("rightz", z);
		saveConfig();
	}
}
