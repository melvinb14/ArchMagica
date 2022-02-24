package com.melvinbur.archmagica.core.world.gen.features.stateproviders;

 import java.util.Random;

 import com.melvinbur.archmagica.core.world.FeaturesInit;
 import com.mojang.serialization.Codec;
 import net.minecraft.core.BlockPos;
        import net.minecraft.core.Direction;
        import net.minecraft.core.Direction.Plane;
        import net.minecraft.world.level.block.Block;
        import net.minecraft.world.level.block.HorizontalDirectionalBlock;
        import net.minecraft.world.level.block.state.BlockState;
        import net.minecraft.world.level.block.state.BlockBehaviour.BlockStateBase;
        import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
        import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProviderType;

public class DirectionalStateProvider extends BlockStateProvider {
    public static final Codec<DirectionalStateProvider> CODEC;
    private final Block block;

    public DirectionalStateProvider(Block block) {
        this.block = block;
    }

    protected BlockStateProviderType<?> type() {
        return FeaturesInit.StateProviders.DIRECTIONAL_STATE_PROVIDER;
    }

    public BlockState getState(Random random, BlockPos pos) {
        Direction dir = Plane.HORIZONTAL.getRandomDirection(random);
        return (BlockState)this.block.defaultBlockState().setValue(HorizontalDirectionalBlock.FACING, dir);
    }

    static {
        CODEC = BlockState.CODEC.fieldOf("state").xmap(BlockStateBase::getBlock, Block::defaultBlockState).xmap(DirectionalStateProvider::new, (directionalStateProvider) -> {
            return directionalStateProvider.block;
        }).codec();
    }




}
