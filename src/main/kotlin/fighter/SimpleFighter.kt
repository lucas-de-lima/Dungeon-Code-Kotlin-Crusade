package org.dungeonCodeKotlinCrusade.fighter

interface SimpleFighter {
    var lifePoints: Int
    var strength: Int

    fun attack(enemy: SimpleFighter)
    fun receiveDamage(attackPoints: Int): Int
}
