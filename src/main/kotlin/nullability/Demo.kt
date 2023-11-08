package nullability

class Demo {
    // declare the variable hunger
    var hunger: Int? = null
    // function eat with null return type
    fun eat() : String? {
        if (hunger == 0) println("Eat some food")
        return "Hunger is $hunger"
    }
}

class Demo1 {
    var c: Demo? = Demo()
    fun doSomeWork() {
        println("Work consistently daily")
    }
}

// main function
fun main() {
    // object a and b
    var a: Demo? = null
    var b: Demo1? = Demo1()
    // refer to the objects
    if (a?.hunger != null) println("Hunger is ${a.hunger}")
    println(a?.eat())
    b?.c?.hunger
    a?.eat()
    b?.doSomeWork()
    b?.c?.eat()
    // re-assigning the variable hunger to d if a is null
    // d must of be type Int? 
    var d = a?.hunger
    a?.hunger = 43
    println(d)
}