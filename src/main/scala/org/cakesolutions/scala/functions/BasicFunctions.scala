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
    assert(concat("Hello, ", "World!") == "Hello, World!")
    assert(sumInts(1, 2) == 3)
    assert(sumDoubles(1, 2) == 3.0)
    assert(sumIntsToString(1, 2) == "3")

  }
}
