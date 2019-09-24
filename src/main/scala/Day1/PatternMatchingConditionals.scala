package Day1

object PatternMatchingConditionals {

  def main(args: Array[String]): Unit = {
   val input = new NumberIntake(3,5,true)

    conditionalNumbers(input)
  }

  def conditionalNumbers(numberIntake: NumberIntake): Unit = numberIntake match {
    case numberIntake: NumberIntake =>
    case _ => "Not Identified"
  }


}
