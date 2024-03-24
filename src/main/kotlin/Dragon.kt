package org.dungeonCodeKotlinCrusade

import org.dungeonCodeKotlinCrusade.fighter.SimpleFighter

class Dragon : SimpleFighter {
    override var lifePoints: Int = 999
    override val strength: Int = 0

    override fun attack(enemy: SimpleFighter) {
        enemy.receiveDamage(strength)
    }
    override fun receiveDamage(attackPoints: Int): Int {
        lifePoints -= attackPoints
        if (lifePoints <= 0) {
            lifePoints = -1
        }
        return lifePoints
    }
}