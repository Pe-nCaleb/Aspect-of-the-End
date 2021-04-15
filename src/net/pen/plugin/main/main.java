package net.pen.plugin.main;

import java.util.ArrayList;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.event.Listener;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

import net.pen.plugin.commands.AoteCMD;
import net.pen.plugin.listeners.RightClick;
import net.pen.plugin.main.main;

public class main extends JavaPlugin{
	
	public final static ItemStack AOTE = new ItemStack(Material.DIAMOND_SWORD);
	public final static ItemMeta AOTEMeta = AOTE.getItemMeta();
	
	public void onEnable() {
		AOTEMeta.setDisplayName("§9Aspect of the End");
		ArrayList<String> lore = new ArrayList<>();
		lore.add(" ");
		lore.add("§6Item Ability: Instant Transmission §l§eRIGHT CLICK");
		lore.add("§7Teleport §a8 blocks §7ahead of");
		lore.add("§7you and gain §a+50 §fSpeed");
		lore.add("§7for §a3 seconds§7.");
		AOTEMeta.setLore(lore);
		AOTEMeta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		AOTE.setItemMeta(AOTEMeta);
		
		Bukkit.getPluginManager().registerEvents(new RightClick(), this);
		
		getCommand("aote").setExecutor(new AoteCMD());
	}}