/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hef.spoutfun;

import org.bukkit.block.BlockFace;
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
    MarioWand(Plugin plugin)
    {
        super(plugin,"MarioWand","http://acm.cs.uic.edu/~hef/wand.png");
    }
    
    @Override
    public boolean onItemInteract(SpoutPlayer player, SpoutBlock block, BlockFace face)
    {
        return false;
    }

}
