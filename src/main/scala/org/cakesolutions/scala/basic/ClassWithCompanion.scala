package org.cakesolutions.scala.basic

class ClassWithCompanion {
  def myMethod() = ClassWithCompanion.CONSTANT
}

object ClassWithCompanion {
  val CONSTANT = "A constant"
}