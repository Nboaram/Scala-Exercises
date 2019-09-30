package Day4

import Day4.CreditCard.addCheckDigit

import scala.collection.mutable.ListBuffer

object CreditCard {
  def main(args: Array[String]): Unit = {

    addCheckDigit(23456789)
    addCheckDigit(246362)
    addCheckDigit(23421349)
    addCheckDigit(239)
    addCheckDigit(9)
    println(identifyValidNumber(788282119))
    println(identifyValidNumber(49927398716L))
  }


  def addCheckDigit(number: Int): Int = {
    var finalNumber = 0
    for (checkDigit <- 0 to 9) {
      val newNumber = (number.toString + checkDigit.toString).toInt
      if (identifyValidNumber(newNumber)) {
        finalNumber = newNumber
        println(s"New Valid Number: $finalNumber")
      }
    }
    finalNumber
  }

  def identifyValidNumber(inputNumber: Long): Boolean = {
    var digits = new ListBuffer[Long]
    var number = inputNumber
    var alternator = true
    var sumOfNumbers = 0L

    while (number > 0) {
      digits += number % 10
      number /= 10
    }

    digits foreach (digit => {
      if (alternator) {
        sumOfNumbers += digit
        alternator = false
      }
      else {
        (digit * 2).toString.map(_.asDigit).toList foreach (newDigit => sumOfNumbers += newDigit)
        alternator = true
      }
    })

    sumOfNumbers % 10 == 0

  }
}
