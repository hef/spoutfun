/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hef.spoutfun;

import org.bukkit.block.BlockFace;
import org.bukkit.entity.Egg;
import org.bukkit.plugin.Plugin;
import org.getspout.spoutapi.block.SpoutBlock;
import org.getspout.spoutapi.material.item.GenericCustomItem;
import org.getspout.spoutapi.player.SpoutPlayer;

/**
 *
 * @author hef
 */
public class MarioWand extends GenericCustomItem
{
	SpoutFun plugin;
    MarioWand(Plugin plugin)
    {
        super(plugin,"MarioWand","http://acm.cs.uic.edu/~hef/wand.png");
        plugin = (SpoutFun)plugin; 
    }
    
    @Override
    public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face)
    {
    	Egg egg = player.throwEgg();
    	egg.getEntityId();
    	plugin.wandMissle.add(egg.getEntityId());
    	return true;
    }

}
