package Garage

abstract class Person {
    val id : Int
    val name: String

    def askName() : Unit = { println(s"My name is $name")}

}

object Person {
    var count = -1
    def getId(): Int = {
        count += 1
        count
    }
}