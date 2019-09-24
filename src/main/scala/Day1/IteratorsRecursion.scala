package Day1

object IteratorsRecursion {

  def main(args: Array[String]): Unit = {

    simpleIterator("Yo", 3)
  }
   def simpleIterator(text: String, number : Int): Unit = {
     if(number == 1){

     }
     else simpleIterator(text, number - 1)
     println(text + number)
   }

  def rectangleIterator (text: String, number : Int): Unit = {
    if (number == 1){
      println(text)
    }
  }
}