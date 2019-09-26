package Day3

import Day3.BlackJack.blackJack

object BlackJack {

  case class Scores(num1: Int, num2: Int)

  def main(args: Array[String]): Unit = {

    blackJack(new Scores(21,18))
    blackJack(new Scores(22,18))
    blackJack(new Scores(2,3))
    blackJack(new Scores(88,188))
    blackJack(new Scores(21,22))
    blackJack(new Scores(20,20))


  }

  def blackJack(scores: Scores): Unit = {

    println( "Winner: " + calculateWinner(scores.num1,scores.num2))

  }

  def calculateWinner(firstScore: Int, secondScore: Int): String = {
    val player1Bust = firstScore > 21
    val player2Bust = secondScore > 21

    if (player1Bust && player2Bust) {
      "0"
    }
    else if (player1Bust) {
      s"Player 2 with a score of $secondScore"
    }
    else if (player2Bust) {
      s"Player 1 with a score of $firstScore"
    }
    else if (firstScore > secondScore){
      s"Player 1 with a score of $firstScore"
    }
    else if (firstScore < secondScore){
      s"Player 2 with a score of $secondScore"
    }
    else {
      "Draw?"
    }
  }
}
