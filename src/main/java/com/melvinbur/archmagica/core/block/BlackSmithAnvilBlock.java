package com.melvinbur.archmagica.core.block;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.RenderShape;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.stream.Stream;


public class BlackSmithAnvilBlock extends Block {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;




    public BlackSmithAnvilBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.NORTH));



    }


    private static final VoxelShape SHAPE_N = Stream.of(
            Block.box(17, 8.10000000000001, 6.599999999999998, 19.000000000000025, 10.100000000000009, 8.600000000000001),
            Block.box(14.999999999999982, 7.10000000000001, 5.600000000000001, 17, 10.100000000000009, 9.600000000000005),
            Block.box(12.999999999999991, 6.10000000000001, 4.6, 14.999999999999982, 10.100000000000009, 10.600000000000012),
            Block.box(2.999999999999987, 5.10000000000001, 3.5999999999999943, 12.999999999999991, 10.100000000000009, 11.600000000000014),
            Block.box(3.9999999999999907, 4.100000000000012, 4.6, 10.999999999999988, 5.10000000000001, 10.600000000000012),
            Block.box(4.999999999999991, 1.099999999999999, 5.600000000000001, 9.999999999999984, 4.100000000000012, 9.600000000000005),
            Block.box(2.9499999999999864, 0.09999999999999915, 2.949999999999992, 12.999999999999991, 1.099999999999999, 12.350000000000014)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_W = Stream.of(
            Block.box(7.399999999999999, 8.10000000000001, 17, 9.400000000000002, 10.100000000000009, 19.000000000000025),
            Block.box(6.399999999999996, 7.10000000000001, 14.999999999999982, 10.399999999999999, 10.100000000000009, 17),
            Block.box(5.399999999999987, 6.10000000000001, 12.99999999999999, 11.399999999999999, 10.100000000000009, 14.999999999999982),
            Block.box(4.399999999999984, 5.10000000000001, 2.999999999999986, 12.400000000000006, 10.100000000000009, 12.99999999999999),
            Block.box(5.399999999999987, 4.100000000000012, 3.9999999999999893, 11.399999999999999, 5.10000000000001, 10.999999999999986),
            Block.box(6.399999999999996, 1.099999999999999, 4.999999999999989, 10.399999999999999, 4.100000000000012, 9.999999999999982),
            Block.box(3.6499999999999844, 0.09999999999999915, 2.949999999999985, 13.050000000000008, 1.099999999999999, 12.99999999999999)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_E = Stream.of(
            Block.box(6.599999999999998, 8.10000000000001, -2.000000000000025, 8.600000000000001, 10.100000000000009, 0),
            Block.box(5.600000000000003, 7.10000000000001, 0, 9.600000000000005, 10.100000000000009, 2.0000000000000178),
            Block.box(4.600000000000002, 6.10000000000001, 2.000000000000017, 10.600000000000012, 10.100000000000009, 4.00000000000001),
            Block.box(3.5999999999999943, 5.10000000000001, 4.000000000000011, 11.600000000000016, 10.100000000000009, 14.000000000000014),
            Block.box(4.600000000000002, 4.100000000000012, 6.000000000000014, 10.600000000000012, 5.10000000000001, 13.00000000000001),
            Block.box(5.600000000000003, 1.0999999999999988, 7.000000000000017, 9.600000000000005, 4.100000000000012, 12.000000000000009),
            Block.box(2.949999999999992, 0.09999999999999898, 4.000000000000011, 12.350000000000016, 1.0999999999999988, 14.050000000000015)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();

    private static final VoxelShape SHAPE_S = Stream.of(
            Block.box(-3.000000000000025, 8.10000000000001, 6.599999999999998, -1, 10.100000000000009, 8.600000000000001),
            Block.box(-1, 7.10000000000001, 5.600000000000001, 1.0000000000000178, 10.100000000000009, 9.600000000000005),
            Block.box(1.0000000000000178, 6.10000000000001, 4.6, 3.000000000000009, 10.100000000000009, 10.600000000000012),
            Block.box(3.000000000000009, 5.10000000000001, 3.5999999999999943, 13.000000000000012, 10.100000000000009, 11.600000000000014),
            Block.box(5.000000000000012, 4.100000000000012, 4.6, 12.000000000000009, 5.10000000000001, 10.600000000000012),
            Block.box(6.000000000000016, 1.099999999999999, 5.600000000000001, 11.000000000000009, 4.100000000000012, 9.600000000000005),
            Block.box(3.000000000000009, 0.09999999999999915, 2.949999999999992, 13.050000000000013, 1.099999999999999, 12.350000000000014)
    ).reduce((v1, v2) -> Shapes.join(v1, v2, BooleanOp.OR)).get();


    @Override
    public VoxelShape getShape(BlockState pState, BlockGetter pLevel, BlockPos pPos, CollisionContext pContext) {
        switch (pState.getValue(FACING)) {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            case EAST:
                return SHAPE_E;
            default:
                return SHAPE_N;
        }
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext ctx) {
        return defaultBlockState().setValue(FACING, ctx.getHorizontalDirection().getOpposite());
    }



    @Override
    public RenderShape getRenderShape(BlockState pState) {
        return RenderShape.MODEL;
    }



        @Override
        public BlockState rotate(BlockState pState, Rotation pRotation) {
            return pState.setValue(FACING, pRotation.rotate(pState.getValue(FACING)));
        }

        @Override
        public BlockState mirror(BlockState pState, Mirror pMirror) {
            return pState.rotate(pMirror.getRotation(pState.getValue(FACING)));
        }
        @Override
        protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> pBuilder) {
            pBuilder.add(FACING);
        }






}




















