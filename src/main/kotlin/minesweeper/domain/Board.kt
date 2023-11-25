package minesweeper.domain

import minesweeper.domain.rule.BoardGenerationRule

class Board(metadata: BoardMetadata, rule: BoardGenerationRule) {
    val rows: Rows

    init {
        val rawBoard = rule.generate(metadata)
        rows = Rows(rawBoard.map { Row(it) })
    }
}
