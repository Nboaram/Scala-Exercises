package Day3

object TooHotHotDamn {
  def main(args: Array[String]): Unit = {
    println(tooHot(70,true))
    println(tooHot(95,true))
    println(tooHot(95,false))
    println(tooHot(40,true))


  }

  def tooHot(temperature: Int, isSummer: Boolean): Boolean = {
    if (isSummer) {
      if (temperature > 60  && temperature < 100) {
        true
      } else
        false
    } else {
      if (temperature > 60  && temperature < 90) {
        true
      } else
        false
    }
  }
}
