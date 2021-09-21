package collections

import kotlin.math.roundToInt

fun getTemperature(city: String): String =
    "${(Math.random() * 30).roundToInt() + city.count()}"

fun main(){
    // NOTE: Pair
    println(Pair("Rahul", "Verma"))
    // to does the same thing as that of Pair.
    println(mapOf("rahul" to "verma", "sachin" to "verma"))

    // Practical use of Pair
    var airportList = listOf("Delhi", "Mumbai", "Bangalore")
    val temperatures = airportList.map{ code -> code to getTemperature(code)}

    for (temp in temperatures){
        println("${temp.first} ${temp.second}")
    }

    // Set
    val fruits: Set<String> = setOf("Apple", "Banana", "Apple")
    println(fruits)
}