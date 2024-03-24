package org.dungeonCodeKotlinCrusade

import org.dungeonCodeKotlinCrusade.battle.Battle
import org.dungeonCodeKotlinCrusade.battle.PVP
import org.dungeonCodeKotlinCrusade.battle.PVE

fun main() {
    val player1 = Character("Player 1")
    player1.levelUp()
    player1.levelUp()

    val player2 = Character("Player 2")
    val player3 = Character("Player 3")
    player3.levelUp()
    player3.levelUp()
    player3.levelUp()

    val monster1 = Monster()
    val monster2 = Dragon()

    val pvp = PVP(player2, player3)
    val pve = PVE(player1, arrayOf(monster1, monster2))

    println("PVP Battle Result: ${pvp.fight()}")
    println("PVE Battle Result: ${pve.fight()}")

    val battles = arrayOf<Battle>(pvp, pve)
    runBattles(battles)
}

fun runBattles(battles: Array<Battle>) {
    battles.forEach { battle ->
        println("Battle result: ${battle.fight()}")
    }
}
