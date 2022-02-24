package com.melvinbur.archmagica.core.world.gen.features.trees;


import com.melvinbur.archmagica.core.world.ConfiguredFeatureInit;
import net.minecraft.world.level.block.grower.AbstractTreeGrower;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import org.jetbrains.annotations.NotNull;


import java.util.Random;

public class CorruptedTreeGrower extends AbstractTreeGrower {





    @Override
    protected ConfiguredFeature<?, ?> getConfiguredFeature(@NotNull Random p_60014_, boolean p_60015_) {
        return ConfiguredFeatureInit.CORRUPTED_TREE;
    }
}