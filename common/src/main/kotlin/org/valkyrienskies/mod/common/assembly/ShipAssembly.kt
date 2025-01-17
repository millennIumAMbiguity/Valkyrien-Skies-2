package org.valkyrienskies.mod.common.assembly

import net.minecraft.core.BlockPos
import net.minecraft.server.level.ServerLevel
import org.valkyrienskies.core.api.ships.ServerShip
import org.valkyrienskies.core.util.datastructures.DenseBlockPosSet
import org.valkyrienskies.mod.common.util.toBlockPos

@Deprecated("Use [ShipAssembler.assembleToShip] instead")
fun createNewShipWithBlocks(
    centerBlock: BlockPos, blocks: DenseBlockPosSet, level: ServerLevel
): ServerShip {
    if (blocks.isEmpty()) throw IllegalArgumentException()

    val blockList: MutableList<BlockPos> = mutableListOf()

    blocks.toList().forEach { blockList.add(it.toBlockPos()) }
    return ShipAssembler.assembleToShip(level, blockList, true, 1.0)
}
