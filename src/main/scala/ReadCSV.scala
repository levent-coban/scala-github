import scala.io.BufferedSource

object ReadCSV extends App {


  val file: BufferedSource = io.Source.fromFile("src/main/resources/example.csv")

  for (line <- file.getLines) {
    val cols: Array[String] = line.split(",").map(_.trim)
    println(s"${cols(0)}|${cols(1)}|${cols(2)}|${cols(3)}")
  }

  file.close


}
