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

  def power(num1: Double, num2: Int): Double = {
    var result = num1
    var count = 1
    if (num2 == 0) {
      result = 1
    }
    else while (count != num2) {
      result = result * num1
      count += 1
    }
    result
  }

  def modulus(num1: Int, num2: Int): Int = {
    num1 % num2

  }
}
