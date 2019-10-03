package Garage

import java.util.Date

abstract class Vehicle {
  val id : Int
  val name: String
  val wheels: Int
  var colour: String
  val lastMOT: Date
  def beepHorn() : Unit = { println("Beep")}
  var parts : Array[Part]
}

object Vehicle {
  var count = -1
  def getId(): Int = {
    count += 1
    count
  }
}