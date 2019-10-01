package Garage

import java.util.Calendar


object Main {


  def main(args: Array[String]): Unit = {

  val garage = new GarageOperations
    garage.createVehicle(new Bike("Suzuki", 2, "red", 123, Calendar.getInstance().getTime, 20))
    garage.createVehicle(new Bike("Yamaha", 2, "green", 225, Calendar.getInstance().getTime, 70))
    garage.createVehicle(new Car("BMW", 4, "black", 400, Calendar.getInstance().getTime, 4, 10))
    garage.registerEmployee(new Employee("Rodrick", "Mechanic", 3))
    garage.outputContentsOfGarage
  }

}
