package com.melvinbur.archmagica.common.entitytypes;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class SignBlockEntityInit extends SignBlockEntity {
    public SignBlockEntityInit(BlockPos pWorldPosition, BlockState pBlockState) {
        super(pWorldPosition, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return BlockEntitiesInit.SIGN_BLOCK_ENTITIES.get();
    }
}