package Garage

import java.util.Calendar


object Main {


  def main(args: Array[String]): Unit = {

  val garage = new GarageOperations
    garage.createVehicle(new Bike("Suzuki", 2, "red", 123, Calendar.getInstance().getTime, 20))
  }
}
