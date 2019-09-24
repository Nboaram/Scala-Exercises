package Day1

object Main extends App {


  override def main(args: Array[String]): Unit = {

   functionExample("Some wurds")
    println(returnFunction())
}


  def functionExample(thingy : String) = {
    println(thingy)
  }

  def returnFunction(): String = {
    var a = "Stringy"
    a
  }
}
