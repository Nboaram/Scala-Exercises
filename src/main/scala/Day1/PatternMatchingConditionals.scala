package Day1

object PatternMatchingConditionals {

  def main(args: Array[String]): Unit = {

    conditionalNumbers(new NumberIntake(3,5,true))
    conditionalNumbers(new NumberIntake(3,5,false))
    conditionalNumbers(new NumberIntake(0,5,true))
    conditionalNumbers(new NumberIntake(3,0,true))
  }

  def conditionalNumbers(numberIntake: NumberIntake): Unit = numberIntake match {
    case NumberIntake(_,0,_) => println(numberIntake.num1)
    case NumberIntake(0,_,_) => println(numberIntake.num2)
    case NumberIntake(_,_,false) => println(numberIntake.num1 * numberIntake.num2)
    case NumberIntake(_,_,true) => println(numberIntake.num1 + numberIntake.num2)
    case _ => "Not Identified"
  }


}
