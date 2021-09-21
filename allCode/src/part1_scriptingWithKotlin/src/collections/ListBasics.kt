package collections

class ListBasics {
    fun basicOperations(){
        // listOf will be immutable by default.
        val fruits: List<String> = listOf<String>("Apple", "Bananga", "Orange")
        println("first fruit: ${fruits[0]}, second fruit: ${fruits[1]}")

        println(fruits.contains("Apple"))
        // fruits.add("sfs") -> wont work on immutable lists

        val fruits2 = fruits + "Kiwi"
        println(fruits2)
        println(fruits) // will remain same

        val fruits3 = fruits - "Orange"
        println(fruits3)
        println(fruits)
    }

    fun operationsMutableList(){
        val fruits: MutableList<String> = mutableListOf<String>("APPLE", "banana", "Orange")
        fruits.add("mango")
    }
}

fun main() {
    ListBasics().basicOperations()
    ListBasics().operationsMutableList()
}
