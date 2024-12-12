package lectures.part1basics

class Car {
  var extraCost: Int = 0
  private var roadTax: Int = 100

  def cost(basicCost: Int): Int ={
    basicCost + roadTax + extraCost
  }
  def printTax()={
    roadTax = roadTax+10
    roadTax
  }
  def confirmTax() = {
    roadTax
  }

}
object demoClassObject extends App {
  println("Hello")
  var bmw = new Car ()
  bmw.extraCost = 100
  var roadTaxInObject = bmw.printTax()
  println("The Tax of bmw is: "+roadTaxInObject)
//  in above call updated tax value from class is called so every
//   other calls will be having updated value only
  println("Confirmed Tax is: "+bmw.confirmTax())
  var result = bmw.cost(10000)
  println("Total cost of bmw is: "+result)
}
