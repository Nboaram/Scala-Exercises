package Garage

import java.util.Calendar


object Main {

  val garage = new GarageOperations
  var dailyTakings = 0
  var engine = new Part("Engine", 15, 150, true)
  var wheels = new Part("Engine", 1, 40, true)
  var spoiler = new Part("Engine", 5, 60, false)
  var headlightfluid = new Part("Engine", 15, 150, true)
  var engi = new Part("Engine", 15, 150, true)
  var engine = new Part("Engine", 15, 150, true)
  var engine = new Part("Engine", 15, 150, true)
  var engine = new Part("Engine", 15, 150, true)
  var engine = new Part("Engine", 15, 150, true)
  var engine = new Part("Engine", 15, 150, true)



  def main(args: Array[String]): Unit = {


    garage.createVehicle(new Bike("Suzuki", 2, "red", 123, Calendar.getInstance().getTime,)))
    garage.createVehicle(new Bike("Yamaha", 2, "green", 225, Calendar.getInstance().getTime))
    garage.createVehicle(new Car("BMW", 4, "black", 400, Calendar.getInstance().getTime, 4, 10))
    garage.registerEmployee(new Employee("Rodrick", "Mechanic", 3))
    garage.outputContentsOfGarage
    update()
  }

  def sleep(time: Long): Unit = Thread.sleep(time)

  def update(): Unit = {
    var dayTimer = 0
    while(true) {
      sleep(1000)
      if (dayTimer < 9 || dayTimer > 17) {
        hoursWork()
      }
      if (dayTimer == 23) {
        dayTimer = 0
      } else {
        dayTimer += 1
      }
    }
  }

  def hoursWork(): Unit = {
   var currentVehicle = garage.vehicles.head

    while (garage.availableEmployees.nonEmpty) {
      var stillBroken = false
      currentVehicle.parts foreach (part => {
        if (part.broken) {
          if (garage.availableEmployees.nonEmpty) {
            garage.fixPart(part, garage.availableEmployees.head)
            garage.busyEmployees += garage.availableEmployees.head
            garage.availableEmployees -= garage.availableEmployees.head
          }
        }
      })
      currentVehicle.parts foreach(part => {
        if (part.broken){
          stillBroken = true
        }
      })
      if (!stillBroken) {
        dailyTakings = garage.currentVehicleBill
        garage.currentVehicleBill = 0
        garage.vehicles.head
      }
    }
    garage.busyEmployees foreach(employee => {
      garage.availableEmployees += employee
      garage.busyEmployees -= employee
    })
  }

}
