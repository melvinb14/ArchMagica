package com.melvinbur.archmagica.core.item;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;
import net.minecraftforge.common.ForgeTier;


public class BattleaxeItem extends SwordItem {
    public BattleaxeItem(Tiers tier, int attackDamageIn, Properties builderIn) {
        super(tier, attackDamageIn, -3.1F, builderIn);
    }


    public BattleaxeItem(ForgeTier tier, int attackDamageIn, Properties builderIn) {
        super(tier, attackDamageIn, -3.1F, builderIn);
    }
}
