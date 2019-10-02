package Ants

import org.mongodb.scala.MongoClient

trait MongoConnection {

  val mongoClient: MongoClient = MongoClient("mongodb://localhost")
}
