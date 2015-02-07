package driver
import com.Details
import java.io._
import com.FileOperations._

object UIInterface {

  def getFilesWithPath(dirToRead: String): List[(Int, java.io.File)] = {

    def getDirectory() = new File(dirToRead).getCanonicalPath
    val m = Details.getFileNamesPathWithNumber(getDirectory())

    m

  }

  def FW(fileToWrite: String, dirToRead: String) = {

    val m = getFilesWithPath(dirToRead)
    m.foreach(f => println(f._2.getName + "," + f._1))

    while (true) {

      print("\n(n : file path), (f : file name), (o : open log file), (e : exit)\n\n")
      print("Enter video to launch : ")

      try {
        val line = scala.io.StdIn.readLine()

        if (line.trim().equalsIgnoreCase("e")) {
          System.exit(0)
        }
        if (line.trim().equalsIgnoreCase("o")) {
          openFile(fileToWrite)
        }
        if (line.trim().equalsIgnoreCase("f")) {
          m.foreach(f => println(f._2.getName + "," + f._1))
        }
        if (line.trim().equalsIgnoreCase("n")) {
          m.foreach(f => println(f._2 + "," + f._1))
        }

        val launchPath = m.toMap.get(Integer.valueOf(line)).get.getPath

        writeToFile("\n\n" + launchPath +
          "," + line + "," + new java.util.Date(System.currentTimeMillis()), fileToWrite)

        openFile(launchPath)

      } catch {
        case ex: Exception =>
      }

    }

  }

}