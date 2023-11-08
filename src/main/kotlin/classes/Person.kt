package classes

// use the keyword "class" when declaring the classes in Kotlin
// the class may have the primary and secondary constructors
class Person(
    val name: String,
    val gender: String,
    val age: Int
) {
    // the secondary constructors
//    constructor(
//        fullName: String,
//        genderState: String,
//        userAge: Int,
//        maritalStatus: String
//    ): this( fullName = name, genderState = gender, userAge = age)
}