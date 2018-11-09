package ctb.girlfriendmod.Items;

import ctb.girlfriendmod.GirlfriendMod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FirstItem extends Item {

    public FirstItem() {
        setRegistryName("firstitem");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(GirlfriendMod.modId + ".firstitem");     // Used for localization (en_US.lang)
        setCreativeTab(CreativeTabs.SEARCH);
    }

}
