import java.io.{File, FileNotFoundException, IOException, PrintWriter}

object WritingToFile extends App {

  try {
    val file = "example.csv"
    val destination = " "  // ???

    val fileObj = new File(destination + file)
    val writerObj = new PrintWriter(fileObj)

    writerObj.write("This is first line..\n")
    writerObj.write("This is second line..")

    writerObj.close()

  } catch {
      case _: FileNotFoundException => println("Exception: FileNotFoundException")
      case _: IOException => println("Exception: IOException")
  }

}
