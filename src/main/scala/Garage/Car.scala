package Garage

import java.util.Date

class Car(val name: String, val wheels: Int, var colour: String,
          val horsepower: Int, val lastMOT: Date, val doors: Int, var damage: Int, var parts : Array[Part]) extends Vehicle  {

  val id : Int = Vehicle.getId

  override def toString: String = {
    s"Id: $id, Name: $name, Number of Wheels: $wheels, Colour: $colour, Horsepower: $horsepower, Date of Last MOT: $lastMOT"
  }

}
