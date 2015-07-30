package org.cakesolutions.scala.basic

class SimpleClass {
  def hello() = "Hello"

  def hola = {
    var message = hello()
    message = "Hola"
    message
  }
}
