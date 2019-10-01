package Garage

import scala.collection.mutable.ListBuffer

class GarageOperations {

  var vehicles = new ListBuffer[Vehicle]
  var people = new ListBuffer[Person]

  def createVehicle(newVehicle: Vehicle): Unit ={
    vehicles += newVehicle
  }
  def removeVehicle(vehicleId: Vehicle): Unit ={
    vehicles foreach(vehicle => {
      if (vehicle.id == vehicleId) {
        vehicles -= vehicle
      }
    })
  }
  def registerEmployee(newEmployee: Employee): Unit = {
    people += newEmployee
  }

  def fixVehicle(vehicle: Vehicle, employee: Employee): Int = {
   if (vehicle.damage < 0) {
    0
   } else {
     vehicle.damage / employee.workRate
   }
  }

  def calculateBills(workHours: Int): Int = {
   workHours * 50
  }

  def outputContentsOfGarage(): Unit = {
    printAllVehicles()
    printAllPeople()
  }

  def printAllVehicles(): Unit ={
    vehicles foreach(vehicle => {
      println(vehicle.toString)
    })
  }

  def printAllPeople(): Unit ={
    people foreach(person => {
      println(person.toString)
    })
  }

  //Fix Vehicle
  //Calculate Bills
  //Output the contents of the Garage
  //Open Garage
  //Close Garage
}
