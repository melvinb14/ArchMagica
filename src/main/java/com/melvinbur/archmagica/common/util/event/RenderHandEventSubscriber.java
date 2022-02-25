package com.melvinbur.archmagica.common.util.event;
import com.melvinbur.archmagica.core.item.ICustomAnimationItem;
import com.melvinbur.archmagica.core.item.MaceItem;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import javax.annotation.ParametersAreNonnullByDefault;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemInHandRenderer;
import net.minecraft.client.renderer.block.model.ItemTransforms.TransformType;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.HumanoidArm;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RenderHandEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber(
        modid = "archmagica",
        value = {Dist.CLIENT}
)
public class RenderHandEventSubscriber {
    public RenderHandEventSubscriber() {
    }

    @SubscribeEvent
    @ParametersAreNonnullByDefault
    public static void RenderHandEvent(RenderHandEvent event) {
        ItemStack itemStack = event.getItemStack();
        Item var3 = itemStack.getItem();
        if (var3 instanceof ICustomAnimationItem) {
            ICustomAnimationItem animationItem = (ICustomAnimationItem)var3;
            Minecraft mc = Minecraft.getInstance();
            Player player = mc.player;
            if (player != null && player.isUsingItem() && (player.getUsedItemHand() == event.getHand() || itemStack.getItem() instanceof MaceItem)) {
                float maxCharge = (float)animationItem.getChargeDuration(itemStack);
                float v = Math.min((float)animationItem.getCustomUseDuration(itemStack, player), maxCharge);
                if (v > 0.0F) {
                    event.setCanceled(true);
                    boolean mainHandFlag = event.getHand() == InteractionHand.MAIN_HAND;
                    HumanoidArm humanoidarm = mainHandFlag ? player.getMainArm() : player.getMainArm().getOpposite();
                    boolean rightHandFlag = humanoidarm == HumanoidArm.RIGHT;
                    float rightHandFloat = rightHandFlag ? 1.0F : -1.0F;
                    TransformType transformType = rightHandFlag ? TransformType.FIRST_PERSON_RIGHT_HAND : TransformType.FIRST_PERSON_LEFT_HAND;
                    float m = v / (maxCharge * 10.0F);
                    double sineWave = Math.sin((double)animationItem.getCustomUseDuration(itemStack, player) * 200.0D) * 0.002D;
                    PoseStack poseStack = event.getPoseStack();
                    poseStack.pushPose();
                    poseStack.translate((double)(0.56F * rightHandFloat), -0.5199999809265137D + sineWave, (double)(-0.72F + m));
                    poseStack.mulPose(Vector3f.XP.rotationDegrees(-13.935F + m * 100.0F));
                    poseStack.mulPose(Vector3f.YN.rotationDegrees(rightHandFloat * 9.7F));
                    poseStack.mulPose(Vector3f.ZP.rotationDegrees(rightHandFloat * -9.785F));
                    poseStack.scale(1.0F + (float)sineWave, 1.0F + (float)sineWave, 1.0F + (float)sineWave);
                    (new ItemInHandRenderer(mc)).renderItem(player, itemStack, transformType, !rightHandFlag, poseStack, event.getMultiBufferSource(), event.getPackedLight());
                    poseStack.popPose();
                }
            }
        }

    }
}
