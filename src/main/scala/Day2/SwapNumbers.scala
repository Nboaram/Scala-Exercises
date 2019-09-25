package Day2

object SwapNumbers {

  def main(args: Array[String]): Unit = {

  }

  def swapNumbers[T](entry: T): Unit = {
    entry match {
      case entry : List[Int] => println(entry.reverse)
      case _ => "Nothing Recognised"
    }
  }

}
