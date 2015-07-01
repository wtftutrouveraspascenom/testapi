package fr.ethyngames.api.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import fr.ethyngames.api.Main;

public class BDD {

	/**
     * Envoie le joueur sur le serveur demander
     * 
     * @param db
     * 			  La base à laquel vous voulez vous connecter 3 chois possible ("Auth", "Player" et "World").
     * @return conn
     *           une connection a la db /!\ n'oublier pas de la fermer après l'avoir utiliser /!\
     */
	 public static Connection connect(String db){
	 String strUr = "jdbc:mysql://localhost:3306/" + db;
		try {
			java.sql.Connection conn = DriverManager.getConnection(strUr,Main.user,Main.password);
			return conn;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
