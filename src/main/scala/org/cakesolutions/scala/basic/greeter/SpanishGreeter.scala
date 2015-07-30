package org.cakesolutions.scala.basic.greeter

class SpanishGreeter extends Greeter{
   override def greetings() = "Saludos desde Scala"

  override val lang: String = "ES"
}
