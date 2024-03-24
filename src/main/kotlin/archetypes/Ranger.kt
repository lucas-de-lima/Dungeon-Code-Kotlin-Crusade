package org.dungeonCodeKotlinCrusade.archetypes

import org.dungeonCodeKotlinCrusade.types.EnergyType
import org.dungeonCodeKotlinCrusade.utils.countInstances

class Ranger(name: String) : Archetype(name) {
    override val energyType: EnergyType = EnergyType.Stamina
    companion object {
        private var instances: Int = 0
        fun createArchetypeInstances(): Int {
            instances = countInstances(instances)
            return instances
        }
    }
}
