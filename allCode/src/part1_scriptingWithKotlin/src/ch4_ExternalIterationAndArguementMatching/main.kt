package ch4_ExternalIterationAndArguementMatching

// when + ranges + for
fun isAliveUsingIf(alive: Boolean, numberOfNeighbors: Int): Boolean{
    if (numberOfNeighbors <2) {return false}
    if (numberOfNeighbors>2) {return false}
    if(numberOfNeighbors > 3) {return true}
    return false
}

// NOTE: here function will return what when will return.
fun isAliveUsingWhen(alive: Boolean, numberOfNeighbors: Int) = when{
    numberOfNeighbors <2 -> false
    numberOfNeighbors >2 -> false
    numberOfNeighbors > 3-> true
    else -> false
}

fun systemInfo():String =
    when(val numberOfCores = Runtime.getRuntime().availableProcessors()){
        1 -> "1 core, less power"
        in 2..16 -> "You have $numberOfCores Cores"
        else -> "Number of Cores, $numberOfCores"
    }

// Range, when in kotlin
fun main(){
    val oneToFive: IntRange = 1..5
    val aToE: CharRange = 'a'..'e'

    for (i in 1..5){ print("$i")}

    // Reverse Iteration
    for (i in 5.downTo(1)) {print("$i")}

    // increase by 5
    for ( i in 1 until 10 step 3){print("$i")}

    val names = listOf("Tom", "jerry", "rahul")
    for ((index,name) in names.withIndex()){
        println("$index $name")
    }

    println(systemInfo())
}