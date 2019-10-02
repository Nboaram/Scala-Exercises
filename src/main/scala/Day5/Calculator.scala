package Day5

object Calculator {


  def sum(num1: Int, num2: Int): Int = {
    num1 + num2
  }

  def subtract(num1: Int, num2: Int) = {
    num1 - num2
  }

  def multiply(num1: Int, num2: Int): Int = {
    num1 * num2
  }

  def divide(num1: Double, num2: Double): Any = {
    if (num1 != 0 && num2 != 0) {
      num1 / num2
    }
    else {
      "you cannot divide by zero, silly"
    }
  }

  def powerRecursion(num1: Double, power: Int): Double = {
    if (power == 0) {
      1
    }
    else {
      println(s" Power: $power")
      powerMultiplication(num1,num1,power)
    }
  }

  def powerMultiplication (number: Double, initialNumber: Double, iterations: Int): Double = {
    println(iterations)
    if (iterations > 1) {
      println(number * initialNumber)
      powerMultiplication(number * initialNumber, initialNumber, iterations - 1)
     }
    else
      number
  }

  def modulus(num1: Int, num2: Int): Int = {
    num1 % num2

  }
}
