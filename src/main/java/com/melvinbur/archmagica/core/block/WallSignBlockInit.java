package com.melvinbur.archmagica.core.block;

import com.melvinbur.archmagica.common.entitytypes.SignBlockEntityInit;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class WallSignBlockInit  extends WallSignBlock {

    public WallSignBlockInit(Properties p_58068_, WoodType p_58069_) {
        super(p_58068_, p_58069_);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new SignBlockEntityInit(pPos, pState);
    }
}