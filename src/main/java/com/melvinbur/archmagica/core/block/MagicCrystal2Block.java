package com.melvinbur.archmagica.core.block;


import net.minecraft.core.BlockPos;



import net.minecraft.world.level.BlockGetter;

import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;



import net.minecraft.world.level.material.PushReaction;



public class MagicCrystal2Block extends CaveCoverBlock {



    public MagicCrystal2Block(Properties properties) {
        super(properties);



    }





    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }





    public BlockState rotate(BlockState pState, Rotation pRotation) {
        return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
    }


    public BlockState mirror(BlockState pState, Mirror pMirror) {
        return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
    }



    public boolean propagatesSkylightDown(BlockState p_49928_, BlockGetter p_49929_, BlockPos p_49930_) {
        return true;
    }


    public float getShadeBrightness(BlockState p_60472_, BlockGetter p_60473_, BlockPos p_60474_) {
        return 1.0F;
    }


    public PushReaction getPistonPushReaction(BlockState pState) {
        return PushReaction.DESTROY;
    }
}


























