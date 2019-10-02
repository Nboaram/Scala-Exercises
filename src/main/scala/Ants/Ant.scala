package Ants

case class Ant(antName : String){

  val ant_id: Double = Ant.getId()
}

object Ant {
  var count: Double = -1

  def getId(): Double = {
    count += 1
    count
  }
}


