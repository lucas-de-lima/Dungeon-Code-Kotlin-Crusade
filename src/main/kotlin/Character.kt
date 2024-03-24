package org.dungeonCodeKotlinCrusade

import org.dungeonCodeKotlinCrusade.archetypes.Archetype
import org.dungeonCodeKotlinCrusade.archetypes.Mage
import org.dungeonCodeKotlinCrusade.fighter.Fighter
import org.dungeonCodeKotlinCrusade.fighter.SimpleFighter
import org.dungeonCodeKotlinCrusade.races.Elf
import org.dungeonCodeKotlinCrusade.races.Race
import kotlin.random.Random

class Character(name: String) : Fighter {
    private val race: Race = Elf(name, Random.nextInt(1, 10))
    private val archetype: Archetype = Mage(name)
    private val maxLifePoints: Int = race.getMaxLifePoints()
    override var lifePoints: Int = maxLifePoints / 2
    override var strength: Int = Random.nextInt(1, 10)
    override var defense: Int = Random.nextInt(1, 10)
    private var dexterity: Int = Random.nextInt(1, 10)
    override var energy: Energy? = Energy(archetype.energyType, Random.nextInt(1, 10))
    private val name: String = name

    override fun attack(enemy: SimpleFighter) {
        enemy.receiveDamage(strength)
    }

    override fun special(enemy: SimpleFighter?) {
        TODO("Not yet implemented")
    }

    override fun levelUp() {
        val increment = Random.nextInt(1, 10)

        lifePoints += increment
        if (lifePoints > maxLifePoints) {
            lifePoints = maxLifePoints
        }
        strength += increment
        defense += increment
        dexterity += increment
        energy?.amount = 10
    }

    override fun receiveDamage(attackPoints: Int): Int {
        var damage = attackPoints - defense
        if (damage > 0) {
            lifePoints -= damage
        } else {
            damage = 0
        }
        if (lifePoints <= 0) {
            lifePoints = -1
        }
        return damage
    }
}
