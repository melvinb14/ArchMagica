package com.melvinbur.archmagica.core.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.BlockGetter;

import net.minecraft.world.level.block.BushBlock;

import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;

public class PlantBlock extends BushBlock implements IPlantable {


    public PlantBlock(Properties properties) {
        super(properties);
    }


    public OffsetType getOffsetType() {
        return OffsetType.XZ;
    }

    public PlantType getPlantType(BlockGetter world, BlockPos pos) {
        return PlantType.PLAINS;
    }
}
