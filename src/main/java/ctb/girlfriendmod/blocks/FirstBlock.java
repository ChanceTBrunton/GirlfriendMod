package ctb.girlfriendmod.blocks;

import ctb.girlfriendmod.GirlfriendMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FirstBlock extends Block {

    public FirstBlock() {
        super(Material.ROCK);
        setUnlocalizedName(GirlfriendMod.modId + ".firstblock");
        setRegistryName("firstblock");
        setCreativeTab(CreativeTabs.BUILDING_BLOCKS);
        setHardness((float) 1.0);
    }
}
