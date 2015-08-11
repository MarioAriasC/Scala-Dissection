package org.cakesolutions.scala.functions


object PartialApplied {
  private val concat = (prefix: String, content: String, suffix: String) => s"$prefix $content $suffix"

  private val hello = concat("Hello,", _: String, _: String)

  private val helloXBang = hello(_: String, "!")

  def main(args: Array[String]) {
    assert(helloXBang("World") == "Hello, World !")
  }
}
