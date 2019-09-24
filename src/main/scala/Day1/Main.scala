package Day1

object Main {

  def main(args: Array[String]): Unit = {

    functionExample("Some wurds")
    println(returnFunction())
    println(parameterFunction("interesting",4))
    println(replaceFunction("Some Thing of Value","Treetop Place",'e','k'))
    println(numbersFunction(3,5,true))
    println(numbersFunction(3,5,false))
    println(numbersFunction(0,5,false))
    println(numbersFunction(3,0,false))
    println(numbersFunction(0,0,false))
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

  def numbersFunction(num1: Int, num2: Int, cond : Boolean): Int = {
    var result = 0
    var nonZero = true
    if (num1 == 0) {
      result = num2
      nonZero = false
    }
    if (num2 == 0) {
      result = num1
      nonZero = false
    }
    if (nonZero == true) {
      if (cond == true) {
        result = num1 + num2
      }
      else {
        result = num1 * num2
      }
    }
    result
  }
}
