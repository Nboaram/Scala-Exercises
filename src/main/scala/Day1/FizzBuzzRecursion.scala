package Day1

object FizzBuzzRecursion {

  def main(args: Array[String]): Unit = {
    fizzBuzz("Fizz","Buzz",21)
  }

  def fizzBuzz(fizz: String, buzz: String, number: Int): Unit = {


    if(number % 3 == 0 && number % 5 == 0) {
      println(fizz + buzz)
    }
    else if(number % 3 == 0) {
      println(fizz)
    }
    else if (number % 5 == 0) {
      println(buzz)
    }
    else {
      println(number)
    }

    if (number == 1) {
    } else {
      fizzBuzz(fizz, buzz, number - 1)
    }
  }
}
