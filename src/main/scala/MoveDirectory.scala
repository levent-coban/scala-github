import java.io.IOException
import java.nio.file.Files
import java.nio.file.Paths
import java.nio.file.StandardCopyOption

object MoveDirectory extends App {

  val sourceDirectoryName = " "  // ???
  val sourceDirectoryPath = " "  // ???
  val targetDirectoryPath = " "  // ???

  try {
    val sourcePath = Paths.get(sourceDirectoryPath + "/" + sourceDirectoryName)
    val destinationPath = Paths.get(targetDirectoryPath + "/" + sourceDirectoryName)

    Files.move(sourcePath, destinationPath, StandardCopyOption.REPLACE_EXISTING)

  } catch {
    case e: IOException => e.printStackTrace()
  }

}
