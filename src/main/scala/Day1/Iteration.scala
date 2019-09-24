package Day1

object Iteration {
  def main(args: Array[String]): Unit = {

    simpleIterator("Yo", 3)
    rectangleIterator("HA", 5)
    println("FizzBuzz:")

    fizzBuzz("fizz","buzz",21)
  }

  def simpleIterator (text : String, number: Int): Unit = {
    for (i <- 1 to number) {
      println(text)
    }
  }

  def rectangleIterator (text: String, number: Int): Unit = {
    for (i <- 1 to number) {
      var printedLine = ""
      for (i <- 1 to number) {
       printedLine += text
      }
      println(printedLine)
    }
  }

  def fizzBuzz(fizz: String, buzz: String, number: Int): Unit = {
    for (i <- 1 to number) {
      val fizzTrue = i % 3 == 0
      val buzzTrue = i % 3 == 0

      if(fizzTrue && buzzTrue) {
        println(fizz + buzz)
      }
      else if(fizzTrue) {
        println(fizz)
      }
      else if (buzzTrue) {
        println(buzz)
      }
      else {
        println(i)
      }
    }
  }
}
