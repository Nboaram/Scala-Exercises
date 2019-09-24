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
       printedLine = printedLine + text;
      }
      println(printedLine)
    }
  }

  def fizzBuzz(fizz: String, buzz: String, number: Int): Unit = {
    for (i <- 1 to number) {
      if(i%3== 0 && i%5 == 0) {
        println(fizz + buzz)
      }
      else if(i%3 == 0) {
        println(fizz)
      }
      else if (i%5 == 0) {
        println(buzz)
      }
      else {
        println(i)
      }
    }
  }
}
