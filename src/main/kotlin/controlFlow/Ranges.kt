package controlFlow

fun main() {
    // this the body of the main function
    // ranges in KOTLIN
    // Using the for loop
    for (numbers in 0..9) {
        print("The numbers are: ")
        println(numbers)
    }
    // call the function
    printAlphabets()
}

fun printAlphabets() {
    // use the for loop
    // printing the loop in reverse
    for (alphabets in 'z' downTo 'a') {
        print("Print the Characters in REVERSE: ")
        println(alphabets + " ")
    }
    println()
    // for loop to print the alphabets in Capital
    for (alpha in 'A'.. 'Z') {
        print("$alpha ")
    }
    println()

    // the for loop to count numbers using similar interval
    for (num in 0..50 step 3) {
        print("Step is 3: ")
        println(num)
    }
}