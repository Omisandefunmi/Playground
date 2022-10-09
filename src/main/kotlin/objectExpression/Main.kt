package objectExpression

import inheritance.Male

fun main(){
    val human =object: Male(){
        override fun talk() {
            super.talk()
            println("Talking like object male")
        }
        fun walk() = println("Object male is walking with 2 legs")
    }
    human.talk()
    human.walk()
}

