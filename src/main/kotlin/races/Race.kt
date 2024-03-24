package org.dungeonCodeKotlinCrusade.races

abstract class Race(private val name: String, private val dexterity: Int) {

    fun getName(): String {
        return name
    }

    fun getDexterity(): Int {
        return dexterity
    }

    abstract fun getMaxLifePoints(): Int

    companion object {
        fun createRacesInstances(): Int {
            throw NotImplementedError("Not implemented")
        }
    }
}
