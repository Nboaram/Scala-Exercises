package Garage

import java.util.Calendar


object Main {

  val garage = new GarageOperations
  var dailyTakings = 0
  var engine = new Part("Engine", 15, 150, true)
  var wheel = new Part("Wheel", 1, 40, false)
  var spoiler = new Part("Spoiler", 5, 60, false)
  var headlightFluid = new Part("Headlight Fluid", 2, 0, true)
  var headlight = new Part("Headlight", 3, 10, true)
  var brokenWheel = new Part("Broken Wheel", 1, 40, true)
  var door = new Part("Door", 10, 70, true)
  var window = new Part("Window", 5, 100, true)
  var breakLight = new Part("Break Light", 3, 15, true)
  var breaks = new Part("Breaks", 12, 75, true)
  var accelerator = new Part("Accelerator", 20, 50, true)


  def main(args: Array[String]): Unit = {


    garage.createVehicle(new Bike("Suzuki", 2, "red", 123, Calendar.getInstance().getTime, Array(engine, wheel, spoiler, headlight, headlightFluid, breakLight, headlight, breakLight, breaks)))
    garage.createVehicle(new Bike("Yamaha", 2, "green", 225, Calendar.getInstance().getTime, Array(engine, wheel, spoiler, headlight, headlightFluid, breakLight, headlight, breakLight, breaks)))
    garage.createVehicle(new Car("BMW", 4, "black", 400, Calendar.getInstance().getTime, 4, Array(engine, wheel, spoiler, headlight, headlightFluid, breakLight, headlight, breakLight, breaks)))
    garage.registerEmployee(new Employee("Rodrick", "Mechanic", 3))
    garage.outputContentsOfGarage
    update()
  }

  def sleep(time: Long): Unit = Thread.sleep(time)

  def update(): Unit = {
    var dayTimer = 0
    while (true) {
      println(s"Time of Day: $dayTimer")
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
        getWorkersWorking(currentVehicle)

      if (!isVehicleStillBroken(currentVehicle)) {
        collectPaymentForWork()
        garage.vehicles -= garage.vehicles.head
        currentVehicle = garage.vehicles.head
      }
    }
    freeUpEmployees()
  }

  def getWorkersWorking(currentVehicle : Vehicle): Unit = {
    currentVehicle.parts foreach (part => {
      if (part.broken) {
        if (garage.availableEmployees.nonEmpty) {
          garage.fixPart(part, garage.availableEmployees.head)
          garage.busyEmployees += garage.availableEmployees.head
          garage.availableEmployees -= garage.availableEmployees.head
        }
      }
    })
  }

  def isVehicleStillBroken(vehicle: Vehicle): Boolean = {
    var stillBroken = false
    vehicle.parts foreach (part => {
      if (part.broken) {
        stillBroken = true
      }
    })
    stillBroken
  }

  def freeUpEmployees(): Unit = {
    garage.busyEmployees foreach (employee => {
      garage.availableEmployees += employee
      garage.busyEmployees -= employee
    })
  }

  def collectPaymentForWork(): Unit = {
    dailyTakings = garage.currentVehicleBill
    garage.currentVehicleBill = 0
  }


}
