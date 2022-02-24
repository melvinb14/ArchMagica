package com.melvinbur.archmagica.core.material;

import com.melvinbur.archmagica.ArchMagica;
import com.melvinbur.archmagica.core.item.ItemInit;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.util.LazyLoadedValue;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.crafting.Ingredient;

import java.util.function.Supplier;

public enum CustomArmorMaterial implements ArmorMaterial {
    CELESTINE("celestine", 10, new int[]{ 9, 12, 11, 8 }, 25, SoundEvents.ARMOR_EQUIP_GENERIC,
            6f, 0.0f, () -> {
        return Ingredient.of(ItemInit.CELESTINE_INGOT.get());}),

    EDAPHINE("edaphine", 10, new int[]{ 9, 12, 11, 8 }, 25, SoundEvents.ARMOR_EQUIP_GENERIC,
            6f, 0.0f, () -> {
        return Ingredient.of(ItemInit.EDAPHINE_INGOT.get());}),

    ORICHALGUM("orichalgum", 7, new int[]{ 7, 10, 9, 6 }, 35,SoundEvents.ARMOR_EQUIP_GENERIC,
            4f, 0.0f, () -> {
        return Ingredient.of(ItemInit.ORICHALGUM_INGOT.get());}),

    ETHRIL("ethril", 8, new int[]{ 7, 10, 9, 6 }, 10, SoundEvents.ARMOR_EQUIP_GENERIC,
            4f, 0.0f, () -> {
        return Ingredient.of(ItemInit.ETHRIL_INGOT.get());}),

    CRIMSONSTEEL("crimsonsteel", 3, new int[]{ 5, 8, 7, 4 }, 14, SoundEvents.ARMOR_EQUIP_GENERIC,
            2f, 0.0f, () -> {
        return Ingredient.of(ItemInit.CRIMSONSTEEL_INGOT.get());}),

    SOULSTEEL("soulsteel", 3, new int[]{ 6, 8, 7, 4 }, 16,  SoundEvents.ARMOR_EQUIP_GENERIC,
            2f, 0.0f, () -> {
        return Ingredient.of(ItemInit.SOULSTEEL_INGOT.get());}),

    STYGIUM("stygium", 3, new int[]{ 5, 8, 7, 4 }, 8, SoundEvents.ARMOR_EQUIP_GENERIC,
            0f, 0.0f, () -> {
        return Ingredient.of(ItemInit.STYGIUM_INGOT.get());}),

    ORASINE("orasine", 2, new int[]{ 4, 6, 5, 3 }, 9,  SoundEvents.ARMOR_EQUIP_GENERIC,
            0f, 0.0f, () -> {
        return Ingredient.of(ItemInit.ORASINE_INGOT.get());}),

    MYTHRIL("mythril", 2, new int[]{ 3, 7, 5, 3 }, 13, SoundEvents.ARMOR_EQUIP_GENERIC,
            0f, 0.0f, () -> {
        return Ingredient.of(ItemInit.MYTHRIL_INGOT.get());}),

    JADE("jade", 2, new int[]{ 3, 6, 5, 2 }, 17, SoundEvents.ARMOR_EQUIP_GENERIC,
            0f, 0.0f, () -> {
        return Ingredient.of(ItemInit.JADE.get());}),

    STEEL("steel", 2, new int[]{ 3, 6, 5, 2 }, 9,  SoundEvents.ARMOR_EQUIP_GENERIC,
            1f, 0.0f, () -> {
        return Ingredient.of(ItemInit.STEEL_INGOT.get());});

















    private static final int[] HEALTH_PER_SLOT = new int[]{13, 15, 16, 11};
    private final String name;
    private final int durabilityMultiplier;
    private final int[] slotProtections;
    private final int enchantmentValue;
    private final SoundEvent sound;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyLoadedValue<Ingredient> repairIngredient;

    private CustomArmorMaterial(String p_40474_, int p_40475_, int[] p_40476_, int p_40477_,
                             SoundEvent p_40478_, float p_40479_, float p_40480_, Supplier<Ingredient> p_40481_) {
        this.name = p_40474_;
        this.durabilityMultiplier = p_40475_;
        this.slotProtections = p_40476_;
        this.enchantmentValue = p_40477_;
        this.sound = p_40478_;
        this.toughness = p_40479_;
        this.knockbackResistance = p_40480_;
        this.repairIngredient = new LazyLoadedValue<>(p_40481_);
    }

    public int getDurabilityForSlot(EquipmentSlot pSlot) {
        return HEALTH_PER_SLOT[pSlot.getIndex()] * this.durabilityMultiplier;
    }

    public int getDefenseForSlot(EquipmentSlot pSlot) {
        return this.slotProtections[pSlot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.sound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    public String getName() {
        return ArchMagica.MOD_ID + ":" + this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    /**
     * Gets the percentage of knockback resistance provided by armor of the material.
     */
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}

