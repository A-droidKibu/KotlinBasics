package operators

import java.lang.Math.pow

// operators help us to manipulate the data
// they are Arithmetic operators example -, +, /, * &&
// Assignment Operator = &
// logical operators &&-rep AND ||-rep OR && !-rep NOT
// READ MORE ON ==, ===, % and many others
fun main() {
    // body
    val num1 = 10
    val num2 = 5
    // operators
    // - subtraction
    val r = num1 + num2
    val num3 = num1 * num2
    val num = num1 / num2
    val x = num1 % num2
    // pow() function of class Any and only takes Double
    val w = pow(num2.toDouble(), num1.toDouble())
    println("num1 + num2 = $r")
    println("num1 * num2 = $num3")
    println("num1 / num2 = $num")
    println("num1 % num2 = $x")
    println("num1 * (num2) = $w")

    val b: Boolean = num1 != num2
    // prints true
    print(b)

    // String concatenation
    val name = "Kotlin"
    val state = "Easy"
    val z = name + state
    println(z)
    // or
    println(" Hey $name is $state")
    println("hey $name" + "is $state")
}
