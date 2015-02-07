package com

import java.io._

object Details {

  def getFileNamesPathWithNumber(f: String): List[(Int, File)] = {
    val files: Array[File] = getFileNamesWithPath(new File(f));

    val v: Array[(java.io.File, Int)] = files.zipWithIndex;

    val map = v.toMap.map(_ swap).toList.sortBy(_._1)
    map
  }

  def getFileNamesWithPath(f: File): Array[File] = {

    var files = recursiveListFiles(f)

    files = files.filterNot(f => f.isDirectory)

    files
  }

  def recursiveListFiles(f: File): Array[File] = {
    
    val these = f.listFiles
    these ++ these.filter(_.isDirectory).flatMap(f => recursiveListFiles(f))
  
  }

}