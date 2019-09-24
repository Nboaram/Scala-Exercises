package Day1

object Main {

  def main(args: Array[String]): Unit = {

    functionExample("Some wurds")
    println(returnFunction())
    println(parameterFunction("interesting",4))
    println(replaceFunction("Some Thing of Value","Treetop Place",'e','k'))

}


  def functionExample(thingy : String) = {
    println(thingy)
  }

  def returnFunction(): String = {
    var a = "Stringy"
    a
  }

  def parameterFunction(stringy: String, inty : Int): String = {
     var result = stringy.takeRight(inty)
      result
  }

  def replaceFunction(stringOne: String, StringTwo: String, characterOne : Char, characterTwo: Char): String = {
    var newString = stringOne + StringTwo
    var replacedString = newString.replace(characterOne, characterTwo)
    replacedString
  }
}
