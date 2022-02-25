package com.melvinbur.archmagica.core.item;
import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import com.google.common.collect.ImmutableMultimap.Builder;
import java.util.UUID;
import javax.annotation.Nonnull;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.AttributeModifier.Operation;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.ForgeMod;
import net.minecraftforge.common.extensions.IForgeItem;

public interface ICustomReachItem extends IForgeItem {
    UUID REACH_DISTANCE_MODIFIER = UUID.fromString("b7d3df52-d360-491b-9bb5-2e8e3b5b279a");

    Multimap<Attribute, AttributeModifier> getCustomAttributesField();

    void setCustomAttributesField(Multimap<Attribute, AttributeModifier> var1);

    double getReachDistanceBonus();

    @Nonnull
    Multimap<Attribute, AttributeModifier> execSuperGetAttributeModifiers(EquipmentSlot var1, ItemStack var2);

    default Multimap<Attribute, AttributeModifier> getAttributeModifiers(EquipmentSlot slot, ItemStack stack) {
        if (slot == EquipmentSlot.MAINHAND) {
            if (this.getCustomAttributesField() == null) {
                Builder<Attribute, AttributeModifier> attributeBuilder = ImmutableMultimap.builder();
                this.execSuperGetAttributeModifiers(slot, stack).forEach((attribute, attributeMod) -> {
                    attributeBuilder.put(attribute, attributeMod);
                });
                attributeBuilder.put((Attribute)ForgeMod.REACH_DISTANCE.get(), new AttributeModifier(REACH_DISTANCE_MODIFIER, "Weapon modifier", this.getReachDistanceBonus(), Operation.ADDITION));
                this.setCustomAttributesField(attributeBuilder.build());
            }

            return this.getCustomAttributesField();
        } else {
            return this.execSuperGetAttributeModifiers(slot, stack);
        }
    }
}
