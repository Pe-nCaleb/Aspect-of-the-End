package net.pen.plugin.listeners;

import java.util.Set;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.Sound;
import org.bukkit.block.Block;
import org.bukkit.entity.Player;
import org.bukkit.entity.Snowball;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.player.PlayerFishEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import org.bukkit.util.Vector;

public class RightClick implements Listener{
	
	  @EventHandler
	  public void onRightClick(PlayerInteractEvent e) {
	    Player p = e.getPlayer();
	    if (p.getItemInHand().getItemMeta().getDisplayName().equals("§9Aspect of the End"))
	      if (e.getAction() == Action.RIGHT_CLICK_AIR || e.getAction() == Action.RIGHT_CLICK_BLOCK) {
	        Block b = p.getTargetBlock(null, 8);
	        Location loc = new Location(b.getWorld(), b.getX(), b.getY(), b.getZ(), p.getLocation().getYaw(), p.getLocation().getPitch());
	        p.teleport(loc);
	        p.playSound(loc, Sound.ENTITY_ENDERMAN_TELEPORT, 1.0F, 1.0F);
	      }  
	  }}