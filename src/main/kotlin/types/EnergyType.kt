package org.dungeonCodeKotlinCrusade.types

sealed class EnergyType {
    object Mana : EnergyType()
    object Stamina : EnergyType()
}
