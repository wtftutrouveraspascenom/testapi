package fr.ethyngames.api.util;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Instrument;
import org.bukkit.Note;
import org.bukkit.Note.Tone;
import org.bukkit.entity.Player;

import fr.ethyngames.api.util.TitleManager;;
public class timer {

	/**
     * Lance un timer de 30 seconde puis éxécute la commande
     * 
     * @param message
     * 			  Le message a afficher avent le timer ex : "game start dans" donnera game start dans 30 secondes
     * @param commande
     *            La commande à lancer a la fin du timer.
     */
	public void start_timer_30(final String message, String commande){
		fr.ethyngames.api.Main pl = fr.ethyngames.api.Main.plugin;
		 for (Player p : Bukkit.getOnlinePlayers()){
		 		p.sendMessage(ChatColor.GREEN + message + ChatColor.GOLD + " 30 " + ChatColor.GREEN + "secondes");
	 }
	  Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
	      public void run() {
	      for (Player p : Bukkit.getOnlinePlayers()){
				p.sendMessage(ChatColor.GREEN + message + ChatColor.GOLD + " 20 " + ChatColor.GREEN + "secondes");
				 }
	      }
		}, 200);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.GREEN + "15","");
					 p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 300);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.GREEN + "14","");
					 p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 320);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.GREEN + "13","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 340);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.GREEN + "12","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 360);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.GREEN + "11","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 380);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		 p.sendMessage(ChatColor.DARK_PURPLE + message + ChatColor.GOLD + " 10 " + ChatColor.DARK_PURPLE + "secondes");
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.DARK_PURPLE + "10","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 400);
		
		
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.DARK_PURPLE + "9","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 420);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.DARK_PURPLE + "8","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 440);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.DARK_PURPLE + "7","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 460);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.DARK_PURPLE + "6","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 480);
		
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		 p.sendMessage(ChatColor.DARK_PURPLE + message + ChatColor.GOLD + " 5 " + ChatColor.DARK_PURPLE + "secondes");
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.DARK_PURPLE + "5","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 500);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		 p.sendMessage(ChatColor.RED + message + ChatColor.GOLD + " 4 " + ChatColor.RED + "secondes");
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.RED + "4","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 520);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		 p.sendMessage(ChatColor.RED + message + ChatColor.GOLD + " 3 " + ChatColor.RED + "secondes");
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.RED + "3","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 540);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		 p.sendMessage(ChatColor.RED + message + ChatColor.GOLD + " 2 " + ChatColor.RED + "secondes");
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.RED + "2","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 560);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		 p.sendMessage(ChatColor.RED + message + ChatColor.GOLD + " 1 " + ChatColor.RED + "seconde");
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.RED + "1","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 580);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
			  Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "commande");
		  }
		}, 600);

	}
	
	/**
     * Lance un timer de 60 seconde puis éxécute la commande
     * 
     * @param message
     * 			  Le message a afficher avent le timer ex : "game start dans" donnera game start dans 30 secondes
     * @param commande
     *            La commande à lancer a la fin du timer.
     */
	public void start_timer_60(final String message, String commande){
		fr.ethyngames.api.Main pl = fr.ethyngames.api.Main.plugin;
		 for (Player p : Bukkit.getOnlinePlayers()){
		 		p.sendMessage(ChatColor.GREEN + message + ChatColor.GOLD + " 60 " + ChatColor.GREEN + "secondes");
	 }
		  Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		      public void run() {
		      for (Player p : Bukkit.getOnlinePlayers()){
					p.sendMessage(ChatColor.GREEN + message + ChatColor.GOLD + " 45 " + ChatColor.GREEN + "secondes");
					 }
		      }
			}, 300);
		  Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		      public void run() {
		      for (Player p : Bukkit.getOnlinePlayers()){
					p.sendMessage(ChatColor.GREEN + message + ChatColor.GOLD + " 30 " + ChatColor.GREEN + "secondes");
					 }
		      }
			}, 600);
	  Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
	      public void run() {
	      for (Player p : Bukkit.getOnlinePlayers()){
				p.sendMessage(ChatColor.GREEN + message + ChatColor.GOLD + " 20 " + ChatColor.GREEN + "secondes");
				 }
	      }
		}, 900);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.GREEN + "15","");
					 p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 900);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.GREEN + "14","");
					 p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 920);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.GREEN + "13","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 940);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.GREEN + "12","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 960);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.GREEN + "11","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 980);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		 p.sendMessage(ChatColor.DARK_PURPLE + message + ChatColor.GOLD + " 10 " + ChatColor.DARK_PURPLE + "secondes");
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.DARK_PURPLE + "10","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 1000);
		
		
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.DARK_PURPLE + "9","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 1020);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.DARK_PURPLE + "8","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 1040);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.DARK_PURPLE + "7","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 1060);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.DARK_PURPLE + "6","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 1080);
		
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		 p.sendMessage(ChatColor.DARK_PURPLE + message + ChatColor.GOLD + " 5 " + ChatColor.DARK_PURPLE + "secondes");
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.DARK_PURPLE + "5","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 1100);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		 p.sendMessage(ChatColor.RED + message + ChatColor.GOLD + " 4 " + ChatColor.RED + "secondes");
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.RED + "4","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 1120);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		 p.sendMessage(ChatColor.RED + message + ChatColor.GOLD + " 3 " + ChatColor.RED + "secondes");
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.RED + "3","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 1140);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		 p.sendMessage(ChatColor.RED + message + ChatColor.GOLD + " 2 " + ChatColor.RED + "secondes");
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.RED + "2","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 1160);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
		 	 for (Player p : Bukkit.getOnlinePlayers()){
		 		 p.sendMessage(ChatColor.RED + message + ChatColor.GOLD + " 1 " + ChatColor.RED + "seconde");
		 		TitleManager.send_title(p, 2, 16, 2, ChatColor.BOLD + "" + ChatColor.RED + "1","");
					p.playNote(p.getLocation(), Instrument.BASS_DRUM, Note.flat(0, Tone.G));
					 }
		  }
		}, 1180);
		Bukkit.getServer().getScheduler().runTaskLater(pl, new Runnable() {
		  public void run() {
			  Bukkit.dispatchCommand(Bukkit.getServer().getConsoleSender(), "commande");
		  }
		}, 1200);

	}

}
