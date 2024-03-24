package org.dungeonCodeKotlinCrusade.fighter

import org.dungeonCodeKotlinCrusade.Energy

interface Fighter {
    var lifePoints: Int
    var strength: Int
    var defense: Int
    var energy: Energy?

    fun attack(enemy: SimpleFighter)
    fun special(enemy: SimpleFighter?)
    fun levelUp()
    fun receiveDamage(attackPoints: Int): Int
}