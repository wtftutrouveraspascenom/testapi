package fr.ethyngames.api.players;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.bukkit.entity.Player;

import fr.ethyngames.api.util.BDD;

public class Playerinfos {

	/**
     * Récupère le guid d'un joueur
     * 
     * @param player
     * 			  Le joueur dont vous voulez obtenir le guid
     * @return guid
     *          Le guid du joueur
     */
	public int getguid(Player player){
		Connection conn = BDD.connect("Auth");
		int guid = 0;
		 String Query = "SELECT * FROM account WHERE UUID = '" + player.getUniqueId() + "';"; 
			ResultSet rs1;
			try {
				rs1 = conn.createStatement().executeQuery(Query);
				while(rs1.next()) { 
					if (rs1.getInt("guid") > 0){
						guid = rs1.getInt("guid");
					}
					
				}
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		return guid;
	}
	
	
	/**
     * Récupère le rang d'un joueur
     * 
     * @param player
     * 			  Le joueur dont vous voulez obtenir le rang
     * @return rank
     *          Le rang du joueur
     */
	public String getrank(Player player){
		Connection conn = BDD.connect("Auth");
		String rank = null;
		 String Query = "SELECT * FROM account WHERE UUID = '" + player.getUniqueId() + "';"; 
			ResultSet rs1;
			try {
				rs1 = conn.createStatement().executeQuery(Query);
				while(rs1.next()) { 
					if (rs1.getInt("guid") > 0){
						rank = rs1.getString("rank");
					}
					
				}
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		return rank;
	}
	
	
	/**
     * Récupère le gmlevel d'un joueur
     * 
     * @param player
     * 			  Le joueur dont vous voulez obtenir le gmlevel
     * @return gmlevel
     *          Le gmlevel du joueur
     */
	public int getgmlevel(Player player){
		Connection conn = BDD.connect("Auth");
		int gmlevel = 0;
		 String Query = "SELECT * FROM account_access WHERE guid = '" + getguid(player) + "';"; 
			ResultSet rs1;
			try {
				rs1 = conn.createStatement().executeQuery(Query);
				while(rs1.next()) { 
					if (rs1.getInt("guid") > 0){
						gmlevel = rs1.getInt("gm_lvl");
					}
					
				}
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		return gmlevel;
	}
	
	
	/**
     * Récupère le gmlevel d'un joueur
     * 
     * @param player
     * 			  Le joueur dont vous voulez obtenir le gmlevel
     * @return gmlevel
     *          Le gmlevel du joueur
     */
	public int ismuted(Player player){
		Connection conn = BDD.connect("Auth");
		int ok = 0;
		 String Query = "SELECT * FROM account_muted WHERE guid = '" + getguid(player) + "';"; 
			ResultSet rs1;
			try {
				rs1 = conn.createStatement().executeQuery(Query);
				while(rs1.next()) { 
					if (rs1.getInt("guid") > 0){
						if(rs1.getInt("active") == 1){
							ok = 1;
						}
					}
					
				}
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
			
		return ok;
	}
}
