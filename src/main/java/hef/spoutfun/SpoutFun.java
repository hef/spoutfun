package hef.spoutfun;


import gnu.trove.set.TIntSet;

import java.util.logging.Logger;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.Egg;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.Event;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.player.EntitySkinType;

@SuppressWarnings("unused")
public class SpoutFun extends JavaPlugin {
	Logger log;// = getServer().getLogger();
	SpoutFunCommandExecutor executor;
	TIntSet wandMissle;
	@Override
	public void onDisable() {
		log.info("SpoutFun Disabled");
	}
	@Override
	public void onEnable() {
	    PluginManager pm = this.getServer().getPluginManager();
        log = getServer().getLogger();
        executor = new SpoutFunCommandExecutor(this);
        pm.registerEvent(Event.Type.PROJECTILE_HIT, listener, Event.Priority.Normal, this)
        log.info("SpoutFun Enabling");
        this.getCommand("yoshi").setExecutor(executor);
		log.info("SpoutFun Enabled");
	}
}
