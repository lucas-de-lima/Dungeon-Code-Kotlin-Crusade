package org.dungeonCodeKotlinCrusade.battle

import org.dungeonCodeKotlinCrusade.fighter.Fighter

abstract class Battle(protected val player: Fighter) {
    open fun fight(): Int {
        return if (player.lifePoints == -1) -1 else 1
    }
}
