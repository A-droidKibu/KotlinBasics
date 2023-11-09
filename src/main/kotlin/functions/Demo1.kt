package functions

fun hello() {
    val name = "Kotlin"
    println("My name is $name")
}

fun addNumbers() {
    val num1 = 5
    val num2 = 3
    println(num1 + num2)
}

fun myDetails(name: String, regNo: String) {
    println(name + " " + regNo)
}

fun multiply(number1: Int, number2: Int) {
    println("The multiplication")
    println(number1 * number2)
}

fun details() : String {
    val name = "Kevin"
    val gender = "Male"

    //println(name + gender)
    return "${println(name + gender)}"
}

fun multiplyNum(n: Int, m: Int) : Int{
    val result = n * m
    print(result)
    return result
}

fun demo(age: Int, name: String) : String{
    println("$name $age")
    return ""
}
/**
 * declare / naming the function
 * parameter
 * return Int, String, Unit, Short
 */

fun main() {
    // calling the function
    //hello()
//    addNumbers()
   // myDetails("Denis", "COM/0001")
  //multiply(3,4)
 //details()
    demo(12, "Java")
    //multiplyNum(4, 6)
}










