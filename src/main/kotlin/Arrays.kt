fun main(){
    var names = arrayOf("chi", "cole", "whale")
    println(names[2])
    println(names.size)
    println(names.get(0))

    for(name in names){
        println(name)
    }

    names.forEach {name
        println(name)
    }

    names.forEachIndexed { index, name -> println("$name is at index $index")  }
}