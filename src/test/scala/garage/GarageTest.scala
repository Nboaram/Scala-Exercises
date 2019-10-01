package garage

import java.util.Calendar

import Garage.{Car, Employee}
import resources.BaseTestingClass
import Garage.GarageOperations

class GarageTest extends BaseTestingClass {



  var garage : GarageOperations = _

  before {
    garage = new GarageOperations
  }

  "Garage repairs when the employee  has a workrate of 2 and the damage equals 50" should "return 25 hours" in {
    val testEmployee = new Employee("Dave","Testee", 2)
    val testVehicle = new Car("Land Rover", 4, "silver", 700, Calendar.getInstance().getTime, 4, 50)
    assert(garage.fixVehicle(testVehicle, testEmployee) == 25)
  }

  "Garage repairs when the employee  has a workrate of 5 and the damage equals 50" should "return 10 hours" in {
    val testEmployee = new Employee("Ralph","BossMan", 5)
    val testVehicle = new Car("Land Rover", 4, "silver", 700, Calendar.getInstance().getTime, 4, 50)
    assert(garage.fixVehicle(testVehicle, testEmployee) == 10)
  }

  "Garage repairs when the employee  has a workrate of 5 and the damage equals -5" should "return 0 hours" in {
    val testEmployee = new Employee("Ralph","BossMan", 5)
    val testVehicle = new Car("Land Rover", 4, "silver", 700, Calendar.getInstance().getTime, 4, -5)
    assert(garage.fixVehicle(testVehicle, testEmployee) == 0)
  }

  "Garage repair costs for 10 hours of work" should " return £500" in {
    val testEmployee = new Employee("Ralph","BossMan", 5)
    val testVehicle = new Car("Land Rover", 4, "silver", 700, Calendar.getInstance().getTime, 4, 50)
    assert(garage.calculateBills(garage.fixVehicle(testVehicle, testEmployee)) == 500)
  }

  "Garage repair costs for 25 hours of work" should "return £1250" in {
    val testEmployee = new Employee("Dave","Testee", 2)
    val testVehicle = new Car("Land Rover", 4, "silver", 700, Calendar.getInstance().getTime, 4, 50)
    assert(garage.calculateBills(garage.fixVehicle(testVehicle, testEmployee)) == 1250)
  }

  "If the hour in the day is outside of working hour" should "return shut" in {

  }
}
