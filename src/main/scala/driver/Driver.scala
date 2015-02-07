package driver

import com.Details


object Driver {

    def main(args: Array[String]): Unit = {

    val fileToWrite = "c:\\data\\test.txt"
    val dirToRead = "C:\\Users\\Adrian\\Google Drive\\Johns Hopkins University - Data Science (Specialization)\\Exploratory Data Analysis"

    UIInterface.FW(fileToWrite, dirToRead)
  }
   
}