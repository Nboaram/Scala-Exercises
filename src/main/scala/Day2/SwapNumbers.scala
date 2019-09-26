package Day2

object SwapNumbers {

  def main(args: Array[String]): Unit = {
    swapNumbers(List(1,3))
    swapNumbers(Array(1,3))
    swapNumbers((1,3))
    swapNumbers("Three")
  }

  def swapNumbers[T](entry: T): Unit = {
    entry match {

      case entry : List[Int] => println(entry.reverse)
      case entry : Array[Int] => for (i <- entry.length to 1 by -1) {print(entry{i-1})}
      case (a,b) => println(b,a)
      case _ => "Nothing Recognised"
    }
  }

}
