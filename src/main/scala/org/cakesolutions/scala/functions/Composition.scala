package org.cakesolutions.scala.functions


object Composition {

  private val toUpperCase = (s: String) => s.toUpperCase

  private val trim = (s: String) => s.trim

  private val add2 = (i: Int) => i + 2

  private val multiplyBy5 = (i: Int) => i * 5

  def main(args: Array[String]) {
    val trimUpperCase: (String) => String = trim andThen toUpperCase
    assert(trimUpperCase(" foo     ") == "FOO")
    val add2multiply5 = add2 andThen multiplyBy5
    assert(add2multiply5(2) == 20)
    // first multiply by 5 then add 2
    assert((add2 compose multiplyBy5)(2) == 12)
  }
}
