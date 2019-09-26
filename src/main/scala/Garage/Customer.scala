package Garage

class Customer(val name: String, val vehicleId: Int)  extends Person {
  val id: Int = Person.getId()

  override def toString: String = {
    s"Id: $id Name: $name, Vehicle ID: $vehicleId,"
  }
}
