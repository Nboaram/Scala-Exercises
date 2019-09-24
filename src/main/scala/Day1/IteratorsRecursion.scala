package Day1

object IteratorsRecursion {

  def main(args: Array[String]): Unit = {

    simpleIterator("Yo", 3)
    rectangleIterator("HA", 5)
  }

  def simpleIterator(text: String, number: Int): Unit = {

    if (number == 1) {
    }
    else simpleIterator(text, number - 1)
    println(text + number)
  }

  def rectangleIterator(text: String, number: Int): Unit = {

    textColumnIterator(text, number, number)
  }

  def textLineIterator(text: String, number: Int): Unit = {

    if (number == 1) {
      println(text)
    }
    else {
      print(text)
      textLineIterator(text, number - 1)
    }
  }

  def textColumnIterator(text: String, colNumber: Int, width: Int): Unit = {

    if (colNumber == 1) {
    }
    else {
      textLineIterator(text, width)
      textColumnIterator(text, colNumber - 1, width)
    }
  }
}