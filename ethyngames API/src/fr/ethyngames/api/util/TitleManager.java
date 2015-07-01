package fr.ethyngames.api.util;

import net.minecraft.server.v1_8_R3.IChatBaseComponent;
import net.minecraft.server.v1_8_R3.IChatBaseComponent.ChatSerializer;
import net.minecraft.server.v1_8_R3.PacketPlayOutTitle;
import net.minecraft.server.v1_8_R3.PacketPlayOutTitle.EnumTitleAction;
import net.minecraft.server.v1_8_R3.PlayerConnection;

import org.bukkit.craftbukkit.v1_8_R3.entity.CraftPlayer;
import org.bukkit.entity.Player;

public class TitleManager {

	
	/**
     * Envoyer un title et/ou un subtitle à un joueur 
     * 
     * @param player
     * 			  Le joueur a qui envoyer le title.
     * @param fadeIn
     *            Le durée de l'incrustation du title en tick.
     * @param stay
     *            Le durée du title en tick.
     * @param fadeOut
     *            Le durée de la désincrustation du title en tick.
     * @param title
     *            Le titre
     * @param subtitle
     *            Le sous-titre
     */
	  public static void send_title(Player player, Integer fadeIn, Integer stay, Integer fadeOut, String title, String subtitle)
	    {
	      PlayerConnection connection = ((CraftPlayer)player).getHandle().playerConnection;

	      PacketPlayOutTitle packetPlayOutTimes = new PacketPlayOutTitle(EnumTitleAction.TIMES, null, fadeIn.intValue(), stay.intValue(), fadeOut.intValue());
	      connection.sendPacket(packetPlayOutTimes);
	      if (subtitle != null) {
	        IChatBaseComponent titleSub = ChatSerializer.a("{\"text\": \"" + subtitle + "\"}");
	        PacketPlayOutTitle packetPlayOutSubTitle = new PacketPlayOutTitle(EnumTitleAction.SUBTITLE, titleSub);
	        connection.sendPacket(packetPlayOutSubTitle);
	      }
	      if (title != null) {
	        IChatBaseComponent titleMain = ChatSerializer.a("{\"text\": \"" + title + "\"}");
	        PacketPlayOutTitle packetPlayOutTitle = new PacketPlayOutTitle(EnumTitleAction.TITLE, titleMain);
	        connection.sendPacket(packetPlayOutTitle);
	      }
	      
	    }
	  
}
