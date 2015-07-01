package fr.ethyngames.api;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener
{
	protected ArrayList<String> players;
	protected ArrayList<String> muted;
	protected HashMap<String,Integer> eff;
	static Logger logger = Logger.getLogger("Minecraft");
	public static Main plugin;
	
	  static String user2, password2;
	  public static String user;
	  public static String password;
	 public static void registerIdentification() {
	  FileReader fileReader;
	  try {
	   fileReader = new FileReader("/home/57qQL8qt.txt");
	   @SuppressWarnings("resource")
	   BufferedReader reader = new BufferedReader(fileReader);

	   try {
	    user2 = reader.readLine();
	    password2 = reader.readLine();
	   } catch (IOException e) {
	   }

	  } catch (FileNotFoundException e) {
	   Bukkit.broadcastMessage("erreur file db");
	  }
	 }
	 
	public void onEnable() // Déclenchée lors du démarrage du serveur
	{
		logger.info("[EthynGames] demarage de l'api !");
		registerIdentification();
		getServer().getPluginManager().registerEvents(this, this);
		user = user2;
		password = password2;
		plugin = this;
		getServer().getMessenger().registerOutgoingPluginChannel(this, "BungeeCord");
		logger.info("[EthynGames] api demarer  !");
	}
	public void onDisable() // Déclenchée lors de l'arrêt du serveur
	{
		logger.info("[SwiftiaJump] arret de l'api...");
	}
	
}