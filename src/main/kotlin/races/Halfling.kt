package org.dungeonCodeKotlinCrusade.races

class Halfling(name: String, dexterity: Int) : Race(name, dexterity) {
    private var maxLifePoints: Int = 80
    override fun getMaxLifePoints(): Int {
        return maxLifePoints
    }

    companion object {
        private var instances: Int = 0
        fun createRacesInstances(): Int {
            if (instances == 0) {
                instances = 1
                return instances
            }
            instances += 1
            return instances
        }
    }
}
