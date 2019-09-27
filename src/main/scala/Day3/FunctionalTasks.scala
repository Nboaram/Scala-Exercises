package Day3

object FunctionalTasks {

  def main(args: Array[String]): Unit = {
    println(java.util.TimeZone.getAvailableIDs.filter(!_.contains("System")).mkString("/").split("/").filter(_.length > 4).filter(!_.contains("Africa")).filter(!_.contains("America"))
      .filter(!_.contains("Asia")).filter(!_.contains("Atlantic")).filter(!_.contains("Australia")).filter(!_.contains("Pacific")).filter(!_.contains("Indian")).filter(!_.contains("Canada"))
      .filter(!_.contains("Antartica")).filter(!_.contains("GMT")).filter(!_.contains("Europe")).mkString(", "))
  }
}
