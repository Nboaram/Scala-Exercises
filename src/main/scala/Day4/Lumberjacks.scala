package Day4

object Lumberjacks {


  def main(args: Array[String]): Unit = {
    distributeLogs(3,7, Array(1,1,1,2,1,3,1,4,1))
    distributeLogs(4,25, Array(1,1,1,2,1,3,1,4,1,3,4,5,6,7,3,1))
  }

  def distributeLogs(sizeofGrid: Int, logs : Int, logPiles : Array[Int]): Unit = {
    var lowestLogPile = determineLowestLogPile(logPiles)
    var logCount = logs

    while (logCount > 0) {
      for (logPile <- 0 until logPiles.length) {
        if (logCount > 0) {
          if (logPiles(logPile) == lowestLogPile) {
            val numberOfLogs = logPiles(logPile)
            logPiles(logPile) = numberOfLogs + 1
            logCount -= 1
          }
        }
      }
      lowestLogPile += 1
    }
    printLogPiles(logPiles, sizeofGrid)
  }

  def determineLowestLogPile(logPiles : Array[Int]): Int ={
    var lowestLogPile = 1000
    logPiles foreach(logPile => {
      if (logPile < lowestLogPile) {
        lowestLogPile = logPile
      }
    })
    lowestLogPile
  }

  def printLogPiles(logPiles: Array[Int], width: Int): Unit = {
    var rowCount = 0
    logPiles foreach (logPile => {
      if (rowCount < width - 1){
        rowCount += 1
        print(logPile + " ")
      } else {
        println(logPile)
        rowCount = 0
      }
    })
  }

}
