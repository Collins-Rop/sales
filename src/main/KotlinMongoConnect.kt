import com.mongodb.MongoClient
import com.mongodb.MongoException

object KotlinMongoConnect {
    @JvmStatic
    fun main(args: Array<String>){
        var mongoClient: MongoClient? = null
        try {
            mongoClient = MongoClient("127.0.0.1", 27017)
            println("Kotlin connected to MongoDB!")
        } catch (e: MongoException) {
            e.printStackTrace()
        } finally {
            mongoClient!!.close()
        }
    }
}