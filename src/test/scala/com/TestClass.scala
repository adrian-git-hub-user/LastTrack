package com;

import org.scalatest.FlatSpec;
import org.scalatest._;
import java.io.File;

class TestClass extends FlatSpec {

/*  "Valid words" should "be returned" in {

    val f = new java.io.File("C:\\workspaces\\31012015\\LastTrack")

    val v = Details.getFileNamesWithPath(f);

    v foreach (println)

    Details.getFileNamesWithNumber("C:\\workspaces\\31012015\\LastTrack").toList.sortBy { _._1 }.foreach(println)

  }*/

/*  "this" should "order" in {

    val v: Array[(java.io.File, Int)] = Array((new File("name 5"), 5), (new File("name 2"), 2)
        , (new File("name 2"), 2)
        , (new File("name 1"), 1)
        , (new File("name 4"), 4)
        , (new File("name 7"), 7)
        , (new File("name 0"), 0)
        , (new File("name 3"), 3))

    val map = v.toMap.map(_ swap).toList.sortBy(_._2).toMap
    
    map foreach (println)
  }
*/
/*  "filenames" should "be" in {

    val s = "C:\\Users\\Adrian\\Google Drive\\Johns Hopkins University - Data Science (Specialization)\\Exploratory Data Analysis"
    Details.getFileNames(new File(s)) foreach(println)
    
  }
*/

   def recursiveListFiles(f: File): Array[File] = {
    val these = f.listFiles
    these ++ these.filter(_.isDirectory).flatMap(f => recursiveListFiles(f))
  }
  
   
  "this " should "recurse " in {
  val f = new File("C:\\Exploratory Data Analysis\\")

  recursiveListFiles(f)
  
  
  }
}
