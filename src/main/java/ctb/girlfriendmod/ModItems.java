package ctb.girlfriendmod;

import ctb.girlfriendmod.Items.FirstItem;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    @GameRegistry.ObjectHolder(GirlfriendMod.modId+":firstitem")
    public static FirstItem firstItem;

//    @GameRegistry.ObjectHolder("modtut:simpletextureditem")
//    public static SimpleTexturedItem simpleTexturedItem;
//
//    @GameRegistry.ObjectHolder("modtut:multimodelitem")
//    public static MultiModelItem multiModelItem;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        firstItem.initModel();
//        multiModelItem.initModel();
    }

}
