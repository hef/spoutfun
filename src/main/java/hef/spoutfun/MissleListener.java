/**
 * 
 */
package hef.spoutfun;

import org.bukkit.event.entity.EntityListener;
import org.bukkit.event.entity.ProjectileHitEvent;

/**
 * @author hef
 *
 */
public class MissleListener extends EntityListener {
	SpoutFun plugin;
	MissleListener(SpoutFun plugin)
	{
		this.plugin = plugin;
	}
	public void onProjectileHit(ProjectileHitEvent event)
	{
		int id = event.getEntity().getEntityId();
		if(plugin.wandMissle.contains(id))	
		{
			plugin.getServer().broadcastMessage("A mario spell was cast.");
			plugin.wandMissle.remove(id);
		}
	}
}
