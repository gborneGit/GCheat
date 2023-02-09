package fr.aang.gcheat.inventory;

import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

public class InventoryListener implements Listener {

	@EventHandler(priority = EventPriority.HIGH)
	public void onInventoryClick(InventoryClickEvent event) {
		
		if (event.getWhoClicked() instanceof Player) {
			
			Player player = (Player)event.getWhoClicked();
			
			if (player.getPing() > 500) {
				event.setCancelled(true);
				player.closeInventory();
				player.updateInventory();
				player.kickPlayer("§cDélais de connexion dépasser");
			}
		}
	}
}
