import scala.collection.JavaConversions._
import java.io.File
import scala.sys.process._
 
object tryitout {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val l = List(1,2,3)                             //> l  : List[Int] = List(1, 2, 3)
  
  def inc(i : Int) : Array[Int] = {
  	Array(i + 1)
  }                                               //> inc: (i: Int)Array[Int]
 
	l.map(m => inc(m)).flatten                //> res0: List[Int] = List(2, 3, 4)
	l.flatMap(m => inc(m))                    //> res1: List[Int] = List(2, 3, 4)
}