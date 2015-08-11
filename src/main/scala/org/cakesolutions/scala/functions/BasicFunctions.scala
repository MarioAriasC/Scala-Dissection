package org.cakesolutions.scala.functions


object BasicFunctions {

  private val concat = (a: String, b: String) => {
    a + b
  }

  private val sumInts = (x: Int, y: Int) => {
    x + y
  }

  private val sumDoubles = (x: Double, y: Double) => {
    x + y
  }

  private val sumIntsToString = (x: Int, y: Int) => {
    s"${sumInts(x, y)}"
  }


  def main(args: Array[String]) {
    println(concat("Hello, ", "World!"))
    println(sumInts(1, 2))
    println(sumDoubles(1, 2))
    println(sumIntsToString(1, 2))

  }
}
