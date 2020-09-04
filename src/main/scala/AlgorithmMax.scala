object AlgorithmMax extends App {

  /**
   *
   * A function gets the maximum value from in a list using for loop
   *
   * val l = List(5, 7, 12, 9, 19, 0, 50)
   *
   * getMax(l)  // 50
   *
   */


  def getMax(list: List[Int]): Int = {

    var max: Int = list.head

    for (i <- list.indices) {
      if (max < list(i)) {
        max = list(i)
      }
    }

    max

  }


}
