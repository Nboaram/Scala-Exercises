package Garage

import scala.collection.mutable.ListBuffer

class GarageOperations {

  var vehicles = new ListBuffer[Vehicle]
  var people = new ListBuffer[Person]
  var availableEmployees = new ListBuffer[Employee]
  var busyEmployees = new ListBuffer[Employee]
  var currentVehicleBill = 0

  def createVehicle(newVehicle: Vehicle): Unit ={
    vehicles += newVehicle
  }

  def removeVehicle(vehicleId: Int): Unit ={
    vehicles foreach(vehicle => {
      if (vehicle.id == vehicleId) {
        vehicles -= vehicle
      }
    })
  }

  def registerEmployee(newEmployee: Employee): Unit = {
    people += newEmployee
    availableEmployees += newEmployee
  }

  def fixPart(part: Part, employee: Employee): Int = {
    part.repairProgress = part.repairProgress - employee.workRate
    calculateBills(part, employee)
    part.repairProgress
  }

  def calculateBills(part : Part, employee: Employee): Unit = {
    if (part.repairProgress < 0) {
      part.broken = false
      currentVehicleBill = currentVehicleBill + (employee.workRate * 20 ) + part.costOfPart
    } else {
      currentVehicleBill = currentVehicleBill + (employee.workRate * 20 )
    }
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

  def isOpen(hourOfDay: Int): Boolean = {
    if (hourOfDay < 9 || hourOfDay > 17) {
      false
    } else {
      true
    }
  }
}
