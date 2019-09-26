package Day3

object UniqueSum {

  def main(args: Array[String]): Unit = {

    println(uniqueSum(1,2,3))
    println(uniqueSum(1,1,3))
    println(uniqueSum(1,2,2))
    println(uniqueSum(3,2,3))

  }

  def uniqueSum(num1: Int, num2 : Int, num3 : Int): Int = {

   var result = 0
    if (num1 == num2) {
      result = num3
    }
    else if (num2 == num3) {
      result = num1
    }
    else if (num3 == num1) {
      result = num2
    }
    else {
      result = num1 + num2 + num3
    }
    result
  }
}
