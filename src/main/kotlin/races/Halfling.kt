package org.dungeonCodeKotlinCrusade.races

class Halfling(name: String, dexterity: Int) : Race(name, dexterity) {
    override val maxLifePoints: Int = 60
}