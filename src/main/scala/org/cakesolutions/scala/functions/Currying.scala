package org.cakesolutions.scala.functions

object Currying {
  private val concat = (prefix: String, content: String, suffix: String) => s"$prefix $content $suffix"

  def main(args: Array[String]) {
    val curried: (String) => (String) => (String) => String = concat.curried
    assert(curried("Hello,")("World")("!") == "Hello, World !")
  }
}
