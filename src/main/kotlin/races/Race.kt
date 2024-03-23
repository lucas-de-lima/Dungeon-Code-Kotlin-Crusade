package org.dungeonCodeKotlinCrusade.races

abstract class Race(private val name: String, private val dexterity: Int) {
    abstract val maxLifePoints: Int

    companion object {
        private var instances: Int = 0

        fun createdRacesInstances(): Int {
            if (instances == 0) {
                instances = 1
            } else {
                instances++
            }
            return instances
        }
    }
}
