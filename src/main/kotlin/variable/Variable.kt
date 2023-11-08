package variable

// the main function is the entry point our program
fun main() {
   // variable - named memory locations
    // use either val or var to declare variables
    val name = "Kotlin"
    var age = 6
    println("I am $name and am $age years old")

    // the variable type inference
    // data types
    /**
     * major types of data types are
     * numbers - Integers are:Byte, Short, Int, Long;;
     * numbers - floating-point are: Double and Float
     * String - sequence of characters enclosed in quotes (" ")
     * Character - single alphabet enclosed with the single quote ('')
     * Boolean has two states which are true and false
     */
    // variables with the type inference
    val name1: String = "KotlinIs"
    val name2: String = "Simple"
    val firstNum: Byte = 2
    val secondNum: Short = 4
    val thirdNum: Int = 8
    val num: Long = 16
    var alpha: Char = 'A'
    var alive: Boolean = true

    // printing the variable value use the this $ symbol before the variable name
    // when enclosed in double quotes
    // example
    println("name = $name1")
    println("name2 = $name2")
    // otherwise
    println(firstNum)
    println(secondNum)
    println(thirdNum)
    println(num)
    println(alpha)
    println(alive)

    // val - refers to value and used it immutable values e.g
    val gender: String = "Male"
    //gender = "female"
    // re-assigning the val variables leads to compiler to raise an alarm of error

    // var - is stores a mutable value/ value that can be re-assigned e.g
    var health: Boolean = true
    health = false // meaning the updated value of the health is false

}