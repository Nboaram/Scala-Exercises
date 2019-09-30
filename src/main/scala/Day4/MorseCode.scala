package Day4

object MorseCode {


  val morseMap: Map[String, String] = Map(
    "a" -> ".-", "b" -> "-...", "c" -> "-.-.", "d" -> "-..",
    "e" -> ".", "f" -> "..-.", "g" -> "--.", "h" -> "....",
    "i" -> "..", "j" -> ".---", "k" -> "-.-", "l" -> ".-..",
    "m" -> "--", "n" -> "-.", "o" -> "---", "p" -> ".--.",
    "q" -> "--.-", "r" -> ".-.", "s" -> "...", "t" -> "-",
    "u" -> "..-", "v" -> "...-", "w" -> ".--", "x" -> "-..-",
    "y" -> "-.--", "z" -> "--..", "1" -> ".----", "2" -> "..---",
    "3" -> "...--", "4" -> "....-", "5" -> ".....", "6" -> "-....",
    "7" -> "--...", "8" -> "---..", "9" -> "----.", "0" -> "-----",
    " " -> "/")


  def main(args: Array[String]): Unit = {
    translateMorseToString("... --- ... / .- -.. .-. .. .- -.")
    translateStringToMorse("Hello World 29")
  }

  def translateMorseToString(morseString: String): Unit = {
    val letters: Array[String] = morseString.split(" ")
    for (letter <- 0 to letters.length - 1) {
      for ((key, value) <- morseMap) {
        if (letters(letter) equals value) {
          letters(letter) = key
        }
      }
    }
    val englishString = letters.mkString
    println(englishString)
  }

  def translateStringToMorse(englishString: String): Unit = {
    val letters = englishString.toLowerCase.split("")
    for (letter <- 0 to letters.length - 1) {
      for ((key, value) <- morseMap) {
        if(letters(letter) == key) {
          letters(letter) = value
        }
      }
    }
    val morseString = letters.mkString
    println(morseString)
  }
}
