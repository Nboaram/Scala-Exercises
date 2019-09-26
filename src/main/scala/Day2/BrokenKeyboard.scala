package Day2

object BrokenKeyboard {
  import scala.io.Source

  def main(args: Array[String]): Unit = {
    longestWord(3, stringLists("adet", "mali", "juke", "walk", "konrad", "baril"), Source.fromURL("http://norvig.com/ngrams/enable1.txt").mkString.split("\\n"))
  }

  def longestWord(numberOfLines: Int, setOfWorkingKeys: Seq[String], words: Array[String]): Unit = {
    for (i <- 0 until numberOfLines) {
      println(remainingWords(setOfWorkingKeys(i), words).maxBy(_.length))
    }
  }

  def stringLists[String](strings: String*): Seq[String] = {
    strings
  }

  def remainingWords(letters: String, words: Array[String]): List[String] = {
    val alphabet = 'a' to 'z'
    val letterList = letters.toList
    var remainingWords = words.toList

    alphabet foreach (letter => {
      if (letterList.contains(letter)) {
        remainingWords = remainingWords.filter(word => word.contains(letter))
      }
      else {
        remainingWords = remainingWords.filter(word => !word.contains(letter))
      }
    })
    remainingWords
  }
}
