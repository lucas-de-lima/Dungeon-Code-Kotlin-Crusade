package org.dungeonCodeKotlinCrusade.battle

import org.dungeonCodeKotlinCrusade.fighter.Fighter

class PVP(player1: Fighter, player2: Fighter) : Battle(player1) {
    private val opponent: Fighter = player2

    override fun fight(): Int {
        val player1Wins = super.fight() == 1
        val player2Wins = opponent.lifePoints == -1

        return when {
            player1Wins && player2Wins -> 0 // Draw
            player1Wins -> 1 // Player 1 wins
            else -> -1 // Player 2 wins or both lose
        }
    }
}
