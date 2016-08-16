import scala.collection.immutable.ListMap
/*
http://romania.amazon.com/techon/presentations/DataStreamsAlgorithms_FlorinManolache.pdf
Implementation of space saving algorithm.
Data Structure used Mutable Map.
(The reason I used this data structure is because I am comfortable working with map / filter - functional programming aspect )
O(n) complexity 
*/


object SpaceSaveAlgo {

  val spaceSaveMap = collection.mutable.Map[String, Int]().withDefaultValue(0)

  def saveSpace(items: List[String], topk: Int): ListMap[String, Int] = {

    for (item <- items) {
      if (spaceSaveMap.exists(_._1 == item)) {
        spaceSaveMap.update(item, spaceSaveMap(item) + 1)
      } else {
        if (spaceSaveMap.size > topk - 1) {
          val minkey = spaceSaveMap.keysIterator.reduceLeft((x, y) => if (x.length > y.length) x else y)
          spaceSaveMap -= minkey
          spaceSaveMap.update(item, spaceSaveMap(item) + 1)
        } else {
          spaceSaveMap.update(item, spaceSaveMap(item) + 1)
        }

      }

    }


    return ListMap(spaceSaveMap.toSeq.sortBy(-_._2): _*)
  }
}
