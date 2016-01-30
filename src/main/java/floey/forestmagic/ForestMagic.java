package floey.forestmagic;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import floey.forestmagic.common.ForestMagicObjs;
import floey.forestmagic.common.world.WorldGenCrystalFlower;

@Mod(name = ForestMagic.NAME, modid = ForestMagic.MODID, version = ForestMagic.VERSION)
public class ForestMagic {

    public static final String NAME = "Forest Magic: The Alpha";
    public static final String MODID = "ForestMagic";
    public static final String VERSION = "0.0.1-F";

    @Mod.Instance(MODID)
    public static ForestMagic instance;

    @SidedProxy(clientSide = "floey.forestmagic.client.ClientProxy", serverSide = "floey.forestmagic.common.CommonProxy")
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        ForestMagicObjs.load();
        ForestMagicObjs.recipes();
    }

    @Mod.EventHandler
    public void load(FMLInitializationEvent event) {
        GameRegistry.registerWorldGenerator(new WorldGenCrystalFlower(), 0);
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}