package com

import java.io._

object FileOperations {

  def openFile(fileName: String) = {
    java.awt.Desktop.getDesktop.open(new File(fileName))
  }

  def writeToFile(str: String, file: String) = {
    val fw = new FileWriter(file, true)
    try {
      fw.write(str)
    } finally fw.close()
  }

}