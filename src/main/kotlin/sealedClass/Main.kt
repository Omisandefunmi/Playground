package sealedClass

fun main() {
    val newGame = GameCreator.createGame(DifficultyLevel.HELP)
    val message = when(newGame){
        is Game.Easy -> "Game is of difficulty level easy"
        is Game.Hard -> "Game is of difficulty level hard"
        Game.Help -> "Game is of difficulty level help" //help does not use the 'is' keyword because its a singleton and of object declaration
        is Game.Medium -> "Game is of difficulty level medium"
    }
    print(message)
}
