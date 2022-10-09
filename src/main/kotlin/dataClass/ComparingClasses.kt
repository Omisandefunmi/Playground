package dataClass

import sealedClass.DifficultyLevel
import sealedClass.Game
import sealedClass.GameCreator

fun main() {
    val game1 = GameCreator.createGame(DifficultyLevel.EASY)
    val game2 = GameCreator.createGame(DifficultyLevel.EASY)

    if (game1 == game2) println("Game1 and Game2 are equal")
    else println("Game1 and Game2 are not equal")

    //this returns false because they have different ids

    val snake = Game.Easy("01", DifficultyLevel.EASY)
    val mario = Game.Easy("01", DifficultyLevel.EASY)

    if (snake == mario) println("Snake and mario are equal") // condition is true because both instances have the same values
    else println("Snake and mario are not equal")

    if (snake === mario) println("Snake and mario are equal")
    else println("Snake and mario are not equal")
    /**
    Referential equality (===)
    condition is false because both instances are not referencing same object.
     The condition can however be made to return true by overriding the equals and hashCode methods of the data class.
     **/

    val templeRun = Game.Hard("1234", DifficultyLevel.HARD, 3)
    val subwaySurf = templeRun.copy()

    if (templeRun == subwaySurf) println("Temple run and Subway surf are equal") // condition is true because both instances have the same values
    else println("Temple run and Subway surf are not equal")

    val candyCrush = Game.Easy("321", DifficultyLevel.MEDIUM)
    val bounce = candyCrush.copy(difficultyLevel = DifficultyLevel.HELP)

    if (candyCrush == bounce) println("Candy crush and Bounce are equal") // condition is false because both instances do not have the same values
    else println("Candy crush and Bounce are not equal")
}
