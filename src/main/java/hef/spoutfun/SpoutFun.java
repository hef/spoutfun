package hef.spoutfun;


import java.util.logging.Logger;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Chicken;
import org.bukkit.entity.LivingEntity;
import org.bukkit.plugin.java.JavaPlugin;
import org.getspout.spoutapi.SpoutManager;
import org.getspout.spoutapi.player.EntitySkinType;

@SuppressWarnings("unused")
public class SpoutFun extends JavaPlugin {
	Logger log;// = getServer().getLogger();
	SpoutFunCommandExecutor executor;
	@Override
	public void onDisable() {
		log.info("SpoutFun Disabled");
	}
	@Override
	public void onEnable() {
        log = getServer().getLogger();
        executor = new SpoutFunCommandExecutor(this);

        log.info("SpoutFun Enabling");
        for(World world: getServer().getWorlds())
        {
        	for(LivingEntity livingEntity: world.getLivingEntities())
        	{
        		if(livingEntity instanceof Chicken)
        		{
        			SpoutManager.getAppearanceManager().setGlobalEntitySkin(livingEntity, "http://acm.cs.uic.edu/~hef/chicken.png", EntitySkinType.DEFAULT);	
        		}
        	}
        }
        this.getCommand("yoshi").setExecutor(executor);
		log.info("SpoutFun Enabled");
	}
}
