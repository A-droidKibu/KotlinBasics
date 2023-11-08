package controlFlow

fun main() {
    // when statement used when you have many conditions to check for
    var alive = true
    var health: String? = "Dangerous & Short"
    // when keyword
    when (alive) {
        false -> println("Dead")
        true -> println("YOU ARE ALIVE")
    }
    // invoke the function checkHealth
    checkHealth()
}

// function to check on the health state
fun checkHealth() {
    val health = "Healthy"
    // when statement
    when(health) {
        "Sick" -> println("You are dead")
        "Healthy" -> println("Your life is a wealth and an Asset")
        "Love" -> println("Its good to appreciate yourself")
    }
}