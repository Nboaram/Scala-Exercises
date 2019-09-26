package Garage

import java.util.Calendar


object Garage {


  def main(args: Array[String]): Unit = {

   var bikey = new Bike("Yamaha", 2, "Green", 180, Calendar.getInstance().getTime)
    println(bikey.toString)
    println(new Customer("Jeremy", 0).toString)
    println(new Customer("Richard", 1).toString)
  }

}
