package ctb.girlfriendmod;

import ctb.girlfriendmod.entity.EntityGirlfriend;
import ctb.girlfriendmod.entity.RenderGirlfriend;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.init.Biomes;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Collection;
import java.util.LinkedList;

public class ModEntities {

    public static void init() {
        // Every entity in our mod has an ID (local to this mod)
        int id = 1;
        EntityRegistry.registerModEntity(new ResourceLocation(GirlfriendMod.modId, "girlfriend"), EntityGirlfriend.class, "Girlfriend", id++, GirlfriendMod.instance, 64, 3, true, 0x996600, 0x00ff00);

        // We want our mob to spawn in Plains and ice plains biomes. If you don't add this then it will not spawn automatically
        // but you can of course still make it spawn manually
        Biome[] spawnBiomes;
        LinkedList<Biome> list = new LinkedList<>();
        Collection<Biome> biomes = ForgeRegistries.BIOMES.getValuesCollection();
        for (Biome bgb : biomes) {
            list.add(bgb);
        }
        spawnBiomes = list.toArray(new Biome[0]);
        EntityRegistry.addSpawn(EntityGirlfriend.class, 1000, 3, 10, EnumCreatureType.CREATURE, spawnBiomes);

        // This is the loot table for our mob
        LootTableList.register(EntityGirlfriend.LOOT);
    }

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        RenderingRegistry.registerEntityRenderingHandler(EntityGirlfriend.class, RenderGirlfriend.FACTORY);
    }
}
