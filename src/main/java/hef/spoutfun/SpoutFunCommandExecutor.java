/**
 * 
 */
package hef.spoutfun;

import org.bukkit.World;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.player.EntitySkinType;

/**
 * @author hef
 *
 */
public class SpoutFunCommandExecutor implements CommandExecutor {
JavaPlugin plugin;
	/* (non-Javadoc)
	 * @see org.bukkit.command.CommandExecutor#onCommand(org.bukkit.command.CommandSender, org.bukkit.command.Command, java.lang.String, java.lang.String[])
	 */
	public SpoutFunCommandExecutor(JavaPlugin plugin)
	{
		this.plugin = plugin;
	}
	@Override
	public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
		Player player;
        if(sender instanceof Player)
        {
        	player = (Player)sender;
        }
        else
        {
        	sender.sendMessage("Not implemented for Console");
        	return false;
        }
        
		player.sendMessage("Searching for Chickens.");
    	for(Entity entity: player.getNearbyEntities(100, 100, 100))
    	{
    		if(entity instanceof Chicken)
    		{
    			player.sendMessage("Converting a chicken to yoshi.");
    			SpoutManager.getAppearanceManager().setGlobalEntitySkin((Chicken)entity, "http://acm.cs.uic.edu/~hef/chicken.png", EntitySkinType.DEFAULT);	
    		}
    	}
    	return true;
	}
}
