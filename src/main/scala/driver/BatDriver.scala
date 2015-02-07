package driver

import com.Details
import java.io._

object BatDriver {

  def main(args: Array[String]): Unit = {

    val fileToWrite = args(0)
    val dirToRead = args(1)

    UIInterface.FW(fileToWrite, dirToRead)
  }

  
}