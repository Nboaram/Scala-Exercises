package Garage

import scala.collection.mutable.ListBuffer

class Garage {

  var vehicles = new ListBuffer[Vehicle]
  //Create Vehicle
  def createVehicle(newVehicle: Vehicle): Unit ={
    vehicles += newVehicle
  }
  //Remove Vehicle
  //Add Employee(Register)
  //Fix Vehicle
  //Calculate Bills
  //Output the contents of the Garage
  //Open Garage
  //Close Garage
}
