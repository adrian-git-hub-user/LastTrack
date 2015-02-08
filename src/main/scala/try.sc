import scala.collection.JavaConversions._
import java.io.File
import scala.sys.process._
  
object tryitout {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val l = List("2 - 1 - Introduction.mp4,0" , "2 - 10 - Graphics Devices in R (part 2) [7-31].mp4,1")
                                                  //> l  : List[String] = List(2 - 1 - Introduction.mp4,0, 2 - 10 - Graphics Devic
                                                  //| es in R (part 2) [7-31].mp4,1)
  l.sorted                                        //> res0: List[String] = List(2 - 1 - Introduction.mp4,0, 2 - 10 - Graphics Devi
                                                  //| ces in R (part 2) [7-31].mp4,1)
  


}