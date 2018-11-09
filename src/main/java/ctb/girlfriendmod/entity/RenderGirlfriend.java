package ctb.girlfriendmod.entity;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelPlayer;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

import javax.annotation.Nonnull;

public class RenderGirlfriend extends RenderLiving<EntityGirlfriend> {

    private ResourceLocation mobTexture = new ResourceLocation("girlfriendmod:textures/entity/girlfriend.png");

    public static final Factory FACTORY = new Factory();

    public RenderGirlfriend(RenderManager rendermanagerIn) {
        // We use the vanilla zombie model here and we simply
        // retexture it. Of course you can make your own model
        super(rendermanagerIn, new ModelPlayer(1,true), 0.5F);
    }

    @Override
    @Nonnull
    protected ResourceLocation getEntityTexture(@Nonnull EntityGirlfriend entity) {
        return mobTexture;
    }

    public static class Factory implements IRenderFactory<EntityGirlfriend> {

        @Override
        public Render<? super EntityGirlfriend> createRenderFor(RenderManager manager) {
            return new ctb.girlfriendmod.entity.RenderGirlfriend(manager);
        }

    }

}
