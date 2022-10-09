fun doSomething(word: String, vararg things: String){
    things.forEach{thing -> println("$word --> $thing") }
}

fun doSomething(word: String, things: List<String>){
    things.forEach{thing -> println("$word --> $thing") }
}


fun main() {
    val places = listOf("austria", "belgium","lagos", "poland")
//    places is immutable
    places.forEach { place -> println("${place.uppercase()} is in the list") }
    println()
    val morePlaces = mutableListOf<String>()
//    morePlaces is a mutable list
    morePlaces.addAll(places)
    morePlaces.add("sokoto")
    morePlaces.forEach { morePlace -> println("${morePlace.uppercase()} is in the new list") }
    println()


    morePlaces.remove("lagos")
    morePlaces.forEach { areas -> println("${areas.uppercase()} is in the updated list") }
    println()

    doSomething("place", places)
    doSomething("A place like", "Dopemu", "Ikeja", "Yaba")
    doSomething("No place")
    val otherPlaces = arrayOf("Dopemu", "Ikeja", "Yaba")
    doSomething("other places are", *otherPlaces)   //the varargs can't take in an array be String is its specified type, therefore the spread operator '*' allows varargs to accept an array


}