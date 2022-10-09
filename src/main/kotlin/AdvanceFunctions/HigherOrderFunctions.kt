package AdvanceFunctions

fun filterStrings(list: List<String>, predicate: (String) -> Boolean){  //higher order function
    list.forEach {
        if(predicate(it)){
            println(it)
        }
    }
}

val predicate: (String) -> Boolean = {      //function as a variable
    it.startsWith("J")
}

fun printPredicate(): (String) -> Boolean  {        //function as a function
    return {it.startsWith("J")}
}

fun main() {
    val languages = listOf<String>("Javascript", "Typescript", "Java", "Brainfuck", "Python")
    filterStrings(languages, predicate)

    filterStrings(languages, printPredicate())
}