package minesweeper.domain.rule

import minesweeper.domain.BoardMetadata
import minesweeper.domain.Cell
import minesweeper.domain.CellType
import minesweeper.domain.Coordinate

class RandomMineGenerationRule : MineGenerationRule {
    override fun generate(metadata: BoardMetadata): Map<Coordinate, Cell> {
        val coordinates = (0 until metadata.width).flatMap { row ->
            (0 until metadata.height).map { col ->
                Coordinate(row, col)
            }
        }
        val mineCoordinates = coordinates.shuffled().take(metadata.numOfMine)
        return coordinates.associateWith {
            if (mineCoordinates.contains(it)) {
                return@associateWith Cell(CellType.MINE)
            }

            Cell(CellType.EMPTY)
        }
    }
}
