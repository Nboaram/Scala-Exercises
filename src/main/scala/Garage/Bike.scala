package Garage

import java.util.Date

class Bike(val name: String, val wheels: Int, var colour: String,
           cc: Int, val lastMOT: Date, var damage : Int) extends Vehicle {

  val id : Int = Vehicle.getId

  override def toString: String = {
  s"ID: $id Name: $name, Number of Wheels: $wheels, Colour: $colour, CC: $cc, Date of Last MOT: $lastMOT"
  }



}
