package ch2_KotlinForJavaEyes

fun canVote(name:String, age:Int): String{
    var status:String
    if (age>10){
        status = "yes pleaes vote"
    } else {
        status = "no dont vote"
    }

    // way 2
    status = if (age>10) "yes please vote" else "nopes dont vote"
    return "$name $status"

}

// Vararg can be used to pass multiple values.
fun max(vararg numbers:Int): Int{
    var large = Int.MIN_VALUE
    for (number in numbers){
        large = if (number > large) number else large
    }
    return large
}

fun main(){
    println(Runtime.getRuntime().availableProcessors())

    val greeting: String = """
        Dear Emma, we are your mom and dad and we love you,
        stay safe and stay strong
    """.trimIndent()

    println(greeting)
    println(max(1,2,3,4))
    val values = intArrayOf(1,2,3,4)
    // spread operator. You cant pass a intArray directly.
    max(*values)

}