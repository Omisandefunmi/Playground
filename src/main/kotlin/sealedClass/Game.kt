package sealedClass

sealed class Game (){
    object Help: Game(){
        val name = "HELP"
        override fun toString(): String {
            return "$name"
        }
    }
    data class Easy(val id: String, val difficultyLevel: DifficultyLevel): Game()
    data class Medium(val id :String, val difficultyLevel: DifficultyLevel): Game()
    data class Hard(val id: String, val difficultyLevel: DifficultyLevel, val steps: Int): Game()
}
