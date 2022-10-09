package AdvanceFunctions

fun main() {
    val languages = listOf<String?>("Javascript", "Typescript", "Java", "Brainfuck", "Python", null, null)

    languages
        .filterNotNull()
        .filter {
            it.startsWith("J")
        }
        .forEach {
        println(it)
    }

    languages.filterNotNull()
        .take(3)
        .forEach {
            println(it.length)

        }

    languages.filterNotNull()
        .takeLast(3)
        .forEach {
            println(it.length)

        }

    languages.filterNotNull()
        .associate {
            it to it.length
        }
        .forEach {
            println("${it.key} --> ${it.value}")
        }

    println(languages.first())
    println(languages.last())
    println(languages.filterNotNull().last())
    println(languages.filterNotNull().findLast { it.startsWith("Java") })
    println(languages.filterNotNull().find { it.startsWith("Java") })
    println(languages.filterNotNull().find { it.startsWith("Ruby") })       //returns null
    println(languages.filterNotNull().find { it.startsWith("Ruby") }.orEmpty())     //returns an empty string instead of null
}