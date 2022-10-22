package org.valkyrienskies.mod.common.networking

import net.minecraft.world.level.ChunkPos
import org.valkyrienskies.core.game.ships.ShipId
import org.valkyrienskies.core.networking.simple.SimplePacket

data class PacketStopChunkUpdates(val chunks: List<ChunkPos>) : SimplePacket
data class PacketRestartChunkUpdates(
    val chunks: List<ChunkPos>,
    val linkedChunks: List<Pair<ChunkPos, ChunkPos>>,
    val waitForShip: ShipId
) : SimplePacket