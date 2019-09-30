package Garage

class Employee( val name: String, var jobTitle: String, workRate: Int) extends Person {
  val id: Int = Person.getId()

  override def toString: String = {
    s"Id: $id Name: $name, Job Title: $jobTitle,"
  }
}
