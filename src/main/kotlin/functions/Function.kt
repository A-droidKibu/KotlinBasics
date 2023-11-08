package functions

// Function - is a block of code/ set of instruction the performs a specific task and
// only runs when called/invoked
// example a function to print hello Kotlin
// use "fun" keyword to initialize your functions followed by the function name
// then braces { //function body }
fun printName() {
    // the function body
    val name = "Kotlin"
    print("Hello $name")
}

// function to and add 2 Integers
fun addInt() {
    val a = 3
    val b = 4
    println(a + b)
}

// function with parameter
// parameters are the local variables within the function and
// the arguments has to be passed when the function is called
fun sumNum(c: Int, d: Int) {
    val result = c + d
    println(result)
}

// functions with return types &
// they initialed after the full colon just after the colon and
// the 'return' keyword has to be used
// NOTE: All functions have return types
fun addNum() : Int {
    val num1 = 2
    val num2 = 3
    // return keyword
    return num1 + num2
}

// the entry point to our program/ main function
fun main() {
    // invoke the function
    printName()
    addInt()
    // pass the arguments in the function
    // where 2 and 6 are the arguments in this case
    sumNum(2,6)
    // call the function
    addNum()

}
