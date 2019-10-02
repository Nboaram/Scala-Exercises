package Ants

import org.mongodb.scala.bson.collection.mutable.Document
import org.mongodb.scala.{MongoClient, MongoDatabase, Observable}

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
            println(value)
          }
          case Failure(error) => error.printStackTrace()
        }
      Thread.sleep(3000)
    }

  def closeConnection(): Unit = {

    mongoClient.close()
  }
}
