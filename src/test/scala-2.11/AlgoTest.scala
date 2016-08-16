package scalatest
import org.scalatest.{FunSuite, Matchers}


import scala.io.Source

class AlgoTest  extends FunSuite{


  test("read n-lines") {
    val builder = new StringBuilder
    val lines = Source.fromFile("/Users/krishna/IdeaProjects/CodeChallange/src/test/resources/test.csv", "utf-8").getLines().take(1).foreach(builder ++=  _ )
    assert(builder.toString() == "ronlnqiregvfvat.pbz")
    }


  test("read file test") {
    val builder = new StringBuilder
    val lines = Source.fromFile("/Users/krishna/IdeaProjects/CodeChallange/src/test/resources/test.csv", "utf-8").getLines().foreach(builder ++=  _ + " ")
    val item = builder.toString().split(" ").toList
    val count = item.size
    assert(count == 10)
  }



}
