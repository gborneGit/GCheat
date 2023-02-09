package fr.aang.gcheat;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import fr.aang.gcheat.commands.Commands;
import fr.aang.gcheat.inventory.InventoryListener;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		
		getCommand("ping").setExecutor(new Commands());
		
		Bukkit.getServer().getPluginManager().registerEvents(new InventoryListener(), this);
	}
}
