package Ants

import org.mongodb.scala._
import org.mongodb.scala.model.Filters._
import org.mongodb.scala.model.Updates._

import scala.concurrent.ExecutionContext.Implicits.global
import scala.io.StdIn
import scala.util.{Failure, Success}

object Main {

    val mongoClient: MongoClient = MongoClient("mongodb://localhost")
    var database: MongoDatabase = mongoClient.getDatabase("interestingthings")
    var currentCollection = database.getCollection("ants")

    def main(args: Array[String]): Unit = {
      getDatabase()
      getCollection()
      getOneDocument()
      insertDocument(antToDocument(new Ant("Fire Ant")))
      insertDocument(antToDocument(new Ant("Red Ant")))
      insertDocument(antToDocument(new Ant("Blue Ant")))
      insertDocument(antToDocument(new Ant("Green Ant")))
      insertDocument(antToDocument(new Ant("Yellow Ant")))
      insertDocument(antToDocument(new Ant("Pink Ant")))

     // removeById(10)
      updateNameById(10, "Black Ant")
      closeConnection()
    }


    def getDatabase(): Unit = {
        print("Database Name: ")
      val databaseName = StdIn.readLine()
        println(s"Database: $databaseName")
        database = mongoClient.getDatabase(databaseName)
    }

  def getCollection(): Unit = {
    print("Collection Name: ")
    val collectionName = StdIn.readLine()
    println(s"Collection: $collectionName")
    currentCollection = database.getCollection(collectionName)
  }

    def getOneDocument() = {
         currentCollection.find().headOption().onComplete{
          case Success(value) => {
            val document : Document = value.get
            val newAnt = documentToAnt(document)
          }
          case Failure(error) => error.printStackTrace()
        }
    }

  def insertDocument(document: Document) ={
    currentCollection.insertOne(document).subscribe(new Observer[Completed] {
      override def onNext(result: Completed): Unit = println("Inserted")

      override def onError(e: Throwable): Unit = println(s"Failed ${e.getStackTrace.toString}")

      override def onComplete(): Unit = println("Completed Insertion")
    } )
  }

  def removeById(id: Int): Unit = {
    currentCollection.deleteOne(equal("ant_id", 1)).headOption().onComplete{
      case Success(value) => println("Removed")
      case Failure(error) => error.printStackTrace()
    }
  }

  def updateNameById(id : Int, newName: String): Unit = {
    currentCollection.updateOne(equal(("ant_id"), id), set("antName", newName)).headOption().onComplete{
      case Success(value) => println("Value Updated")
      case Failure(error) => error.printStackTrace()
    }
  }

  def documentToAnt(document: Document): Ant = {
    Ant (
      document("antName").asString().getValue()
    )
  }

  def antToDocument(ant: Ant): Document = {
    Document (
      "ant_id" -> ant.ant_id,
      "antName" -> ant.antName
    )
  }

  def closeConnection(): Unit = {
    Thread.sleep(3000)
    mongoClient.close()
  }
}
