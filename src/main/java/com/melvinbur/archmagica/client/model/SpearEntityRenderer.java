package com.melvinbur.archmagica.client.model;

import com.melvinbur.archmagica.common.entity.SpearEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import javax.annotation.Nonnull;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.block.model.ItemTransforms.TransformType;
import net.minecraft.client.renderer.entity.EntityRenderer;
import net.minecraft.client.renderer.entity.ItemRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider.Context;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.texture.TextureAtlas;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class SpearEntityRenderer extends EntityRenderer<SpearEntity> {
    private final ItemRenderer itemRenderer;

    public SpearEntityRenderer(Context context) {
        super(context);
        this.itemRenderer = context.getItemRenderer();
        this.shadowRadius= 0.3F;
        this.shadowStrength = 0.75F;
    }

    @ParametersAreNonnullByDefault
    public void render(SpearEntity spearEntity, float v, float v1, PoseStack stack, MultiBufferSource bufferSource, int light) {
        stack.pushPose();
        stack.mulPose(Vector3f.YP.rotationDegrees(Mth.lerp(v1, spearEntity.yRotO, spearEntity.getYRot()) - 90.0F));
        stack.mulPose(Vector3f.ZP.rotationDegrees(Mth.lerp(v1, spearEntity.xRotO, spearEntity.getXRot()) - 45.0F));
        stack.translate(-0.6D, -0.6D, 0.0D);
        stack.scale(1.9F, 1.9F, 1.0F);
        this.itemRenderer.renderStatic(spearEntity.getItem(), TransformType.FIXED, light, OverlayTexture.NO_OVERLAY, stack, bufferSource, spearEntity.getId());
        stack.popPose();
        super.render(spearEntity, v, v1, stack, bufferSource, light);
    }

    @ParametersAreNonnullByDefault
    @Nonnull
    public ResourceLocation getTextureLocation(SpearEntity spearEntity) {
        return TextureAtlas.LOCATION_BLOCKS;
    }
}
