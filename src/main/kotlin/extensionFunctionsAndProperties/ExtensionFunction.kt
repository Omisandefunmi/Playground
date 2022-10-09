package extensionFunctionsAndProperties

import sealedClass.DifficultyLevel
import sealedClass.Game

fun Game.Medium.getGameSpeed(){         //extension function
    println("Speed is at medium level")
}

val Game.Medium.instructions: String       //extension property
    get() = "Medium level instructions"

fun main() {
    val myGame = Game.Medium("01", DifficultyLevel.MEDIUM)
    myGame.getGameSpeed()
    println(myGame.instructions)
}