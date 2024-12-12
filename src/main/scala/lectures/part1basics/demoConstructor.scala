package lectures.part1basics

class Demo{
  val x: Int = 5
  val y: Int = 10

  def addFunction (x: Int, y: Int) : Int = {
    x+y
  }

  def printValue = {
    println(s"Value of x is ${x} and y is ${y}")
  }
}

object demoConstructor extends App {
  val demo1 = new Demo()
  val updated_x = demo1.x + 5
  println("Sum is: "+demo1.addFunction(updated_x, demo1.y))
  demo1.printValue
}
