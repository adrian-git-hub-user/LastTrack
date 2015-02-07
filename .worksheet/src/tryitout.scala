import scala.collection.JavaConversions._
import java.io.File
import scala.sys.process._
 
object tryitout {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(153); 
  println("Welcome to the Scala worksheet");$skip(25); 
  
  val l = List(1,2,3);System.out.println("""l  : List[Int] = """ + $show(l ));$skip(59); 
  
  def inc(i : Int) : Array[Int] = {
  	Array(i + 1)
  };System.out.println("""inc: (i: Int)Array[Int]""");$skip(30); val res$0 = 
 
	l.map(m => inc(m)).flatten;System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(24); val res$1 = 
	l.flatMap(m => inc(m));System.out.println("""res1: List[Int] = """ + $show(res$1))}
}
