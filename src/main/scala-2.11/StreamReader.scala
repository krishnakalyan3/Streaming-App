import scala.Some
import scala.io.Source


object StreamReader extends App {

  if (args.length == 0) {
    println("Entering the file path is a must")
    println("First argument file path")
    println("Second argument top-K items")
    println("Third argument number of lines to read")
    System.exit(0)
  }

  val FILE_NAME = args(0)
  val builder = new StringBuilder

  if (args.length == 1) {
    val lines = Source.fromFile(FILE_NAME, "utf-8").getLines().foreach(builder ++=  _ + " ")
    val item = builder.toString().split(" ").toList
    val m = SpaceSaveAlgo.saveSpace(item, item.length)
    m.foreach(println)
  }

  if (args.length == 3) {
    val K_TOP = args(1).toInt
    val N_LINES = args(2).toInt

    val lines = Source.fromFile(FILE_NAME, "utf-8").getLines().take(N_LINES).foreach(builder ++=  _ + " ")
    val item = builder.toString().split(" ").toList
    val m = SpaceSaveAlgo.saveSpace(item, K_TOP)
    m.foreach(println)
    println("Error in counts < = " + (N_LINES/K_TOP).toFloat)
  }

  if (args.length == 2 || args.length > 3 ) {
    println("Incorrect argument length")
  }

}