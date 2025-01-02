val name : String = "chantha"
var greeting: String? = null
fun main() {
    // Test
    println("Hello Kotlin")

    // Variable
    if(greeting !== null){
        println(greeting)
    }
    else{
        println("Hi")
    }
    println(name)

    greeting = "hello"
    val geetingToPrint = if (greeting !=null) greeting else "Hi"
    println(geetingToPrint)
    println(name)
}