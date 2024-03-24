package org.dungeonCodeKotlinCrusade.battle

import org.dungeonCodeKotlinCrusade.fighter.Fighter
import org.dungeonCodeKotlinCrusade.fighter.SimpleFighter

class PVE(player: Fighter, private val monsters: Array<SimpleFighter>) : Battle(player) {

    override fun fight(): Int {
        val playerLifePoints = player.lifePoints
        val monstersLifePoints = monsters.sumOf { it.lifePoints }

        return if (playerLifePoints >= monstersLifePoints) 1 else -1
    }
}
