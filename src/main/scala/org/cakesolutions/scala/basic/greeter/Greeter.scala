package org.cakesolutions.scala.basic.greeter

trait Greeter {

  val lang: String = "EN"

  def greetings(): String

  def goodbye() = "See you later, Alligator"
}
