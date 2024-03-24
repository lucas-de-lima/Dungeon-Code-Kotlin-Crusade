package org.dungeonCodeKotlinCrusade.types

sealed class EnergyType {
    data object Mana : EnergyType()
    data object Stamina : EnergyType()
}
