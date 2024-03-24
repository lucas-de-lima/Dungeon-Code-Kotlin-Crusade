package org.dungeonCodeKotlinCrusade

import org.dungeonCodeKotlinCrusade.fighter.SimpleFighter
import kotlin.math.min

class Monster : SimpleFighter {
    override var lifePoints: Int = 85
    override val strength: Int = 63

    override fun receiveDamage(attackPoints: Int): Int {
        val damage = min(attackPoints, lifePoints - 1)
        lifePoints -= damage
        if (lifePoints == 0) {
            lifePoints = -1
        }
        return lifePoints
    }

    override fun attack(enemy: SimpleFighter) {
        val damage = strength
        enemy.receiveDamage(damage)
    }
}
