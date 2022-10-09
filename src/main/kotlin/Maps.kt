fun doSomething(word: String, things: Map<String, String>){
    things.forEach{thing -> println("$word can $thing") }
}

fun main() {
    val map = mapOf("move" to "car", "dance" to "feet", "fly" to "airplane", "sail" to "ship")
//    map is an immutable collection
    map.forEach { key, value -> println("$key is the key and $value is the corresponding value") }

    var mapAgain = mutableMapOf("1" to "A", "2" to "B", "3" to "C")
    mapAgain.forEach { key, value -> println("$key is the key and $value is the corresponding value of new map") }
    mapAgain.putAll(map)
    mapAgain.forEach { key, value -> println("$key is the key and $value is the corresponding value of the updated map") }
    println()

    doSomething("I", map)

}