package ctb.girlfriendmod;

import ctb.girlfriendmod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;


@Mod(modid = GirlfriendMod.modId, name = GirlfriendMod.name, version = GirlfriendMod.version, acceptedMinecraftVersions = "")
public class GirlfriendMod {

    public static final String modId = "girlfriendmod";
    public static final String name = "Girlfriend Mod";
    public static final String version = "1.0.0";

    @SidedProxy(clientSide = "ctb.girlfriendmod.proxy.ClientProxy", serverSide = "ctb.girlfriendmod.proxy.ServerProxy")
    public static CommonProxy proxy;

    @Mod.Instance(modId)
    public static GirlfriendMod instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        System.out.println(name + " is loading!");
        logger = event.getModLog();
        proxy.preInit(event);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

}