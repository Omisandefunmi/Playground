package sealedClass

import java.util.*

object GameCreator{
    fun createGame(type: DifficultyLevel): Game{
        val id = UUID.randomUUID().toString().substring(0, 5)
        val newGame = when(type){
            DifficultyLevel.EASY -> Game.Easy(id, DifficultyLevel.EASY)
            DifficultyLevel.MEDIUM -> Game.Medium(id, DifficultyLevel.MEDIUM)
            DifficultyLevel.HARD -> Game.Hard(id, DifficultyLevel.HARD, 2)
            DifficultyLevel.HELP -> Game.Help
        }
        return newGame
    }
}


