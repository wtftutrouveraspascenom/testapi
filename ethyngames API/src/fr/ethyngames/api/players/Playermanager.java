package fr.ethyngames.api.players;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;

public class Playermanager {
	
	
	/**
     * Envoie le joueur sur le serveur demander
     * 
     * @param player
     * 			  Le joueur a qui envoyer le title.
     * @param plugin
     *            Votre plugin.
     * @param server
     *           Le nom du serveur ou envoyer un joueur (ex : "lobby" pour le lobby)
     */
	  public static void sendToServer(Player player, Plugin plugin, String server)
	  {
	    ByteArrayOutputStream b = new ByteArrayOutputStream();
	    DataOutputStream out = new DataOutputStream(b);
	    try {
	      out.writeUTF("Connect");
	      out.writeUTF(server);
	    }
	    catch (Exception e) {
	      sendToServer(player, plugin, server);
	    }
	    player.sendPluginMessage(plugin, "BungeeCord", b.toByteArray());
	  }
}
