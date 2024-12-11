package lectures.part1basics

object HelloWorld {
  def main(args: Array[String]) : Unit = {
    println("Hello World")
    var result = add(10, 20)
//    println("Addition of given numbers is: "+result)
    println(s"Addition of given numbers is: $result")
  }
  def add(x: Int, y:Int): Int = {
    var z = x + y
    return z
  }
}
