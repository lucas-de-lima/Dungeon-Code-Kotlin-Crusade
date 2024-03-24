package org.dungeonCodeKotlinCrusade.races

import org.dungeonCodeKotlinCrusade.utils.countInstances

class Dwarf(name: String, dexterity: Int) : Race(name, dexterity) {
    private var maxLifePoints: Int = 80
    override fun getMaxLifePoints(): Int {
        return maxLifePoints
    }

    companion object {
        private var instances: Int = 0
        fun createRacesInstances(): Int {
            instances = countInstances(instances)
            return instances
        }
    }
}
