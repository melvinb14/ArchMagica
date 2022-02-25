package com.melvinbur.archmagica.core.block;

import com.melvinbur.archmagica.common.entitytypes.SignBlockEntityInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class StandingSignBlockInit extends StandingSignBlock {
    public StandingSignBlockInit(Properties p_56990_, WoodType p_56991_) {
        super(p_56990_, p_56991_);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new SignBlockEntityInit(pPos, pState);
    }
}