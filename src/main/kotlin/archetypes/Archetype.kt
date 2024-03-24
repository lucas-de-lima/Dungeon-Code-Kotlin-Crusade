package org.dungeonCodeKotlinCrusade.archetypes

import org.dungeonCodeKotlinCrusade.types.EnergyType

abstract class Archetype(private val name: String) {
    private var special: Int = 0
    private var cost: Int = 0

    abstract val energyType: EnergyType

    companion object {
        fun createArchetypeInstances(): Int {
            throw NotImplementedError("Not implemented")
        }
    }
}