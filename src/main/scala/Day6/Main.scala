package Day6

import org.mongodb.scala.{MongoClient, MongoDatabase}
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

object Main {

    val mongoClient: MongoClient = MongoClient("mongodb://localhost")
    val database: MongoDatabase = mongoClient.getDatabase("interestingthings")
    val antCollection = database.getCollection("ants")

    def main(args: Array[String]): Unit = {
        getAllDocuments()
    }

    def getAllDocuments() = {
         antCollection.find().headOption().onComplete{
          case Success(value) => println(value)
          case Failure(error) => error.printStackTrace()
        }
    }

  Thread.sleep(15000)
  mongoClient.close()

}
