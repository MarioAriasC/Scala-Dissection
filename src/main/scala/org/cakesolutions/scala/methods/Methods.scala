package org.cakesolutions.scala.methods


object Methods {

  def sum(a: Int, b: Int) = a + b

  def curriedSum(a: Int)(b: Int) = a + b

  def sumWithImplicits(a: Int)(implicit b: Int) = a + b

  def sumWithDefault(a: Int = 5, b: Int = 7) = a + b

  def intOperation(a: Int, b: Int, f: (Int, Int) => Int) = f(a, b)

  def structural(op: {def operation(): Int}) = op.operation()

  def structuralField(f: {val value: Int}) = f.value


  def main(args: Array[String]) {
    //vanilla call
    assert(sum(5, 7) == 12)

    //named argument
    assert(sum(b = 5, a = 7) == 12)

    //new val from curried
    val sum5 = curriedSum(5) _
    assert(sum5(7) == 12)

    //curried call
    assert(curriedSum(5)(7) == 12)

    //implicit parameter call
    implicit val b = 7
    assert(sumWithImplicits(5) == 12)

    //setting the implicit parameter by hand
    assert(sumWithImplicits(5)(8) == 13)

    //calling without default parameters
    assert(sumWithDefault(5, 7) == 12)

    //calling with default parameters
    assert(sumWithDefault() == 12)

    //calling with just one default parameter
    assert(sumWithDefault(b = 5) == 10)

    //calling with inline function
    assert(intOperation(5, 7, { (a, b) => a + b }) == 12)

    //calling with function
    val f = { (a: Int, b: Int) => a + b }
    assert(intOperation(5, 7, f) == 12)

    //calling with inline placeholders parameters function
    assert(intOperation(5, 7, _ + _) == 12)

    //calling with method reference
    assert(intOperation(5, 7, sum) == 12)

    //calling with partial applied function
    val partial = { (a: Int, b: Int, c: Int) => a + b + c }
    assert(intOperation(5, 7, partial(_, _, 0)) == 12)

    //calling a partial applied method
    val partialMethod = sum(5, _:Int)
    assert(partialMethod(7) == 12)

    //calling a method on a structural type parameter
    assert(structural(SumOperation(5, 7)) == 12)
    assert(structural(new ZeroOperation()) == 0)
    assert(structural(new Operation[Int] {
      override def operation(): Int = 12
    }) == 12)

    //getting a value on a structural type parameter
    assert(structuralField(IntValue(12)) == 12)
  }
}

case class SumOperation(a: Int, b: Int) {
  def operation() = a + b
}

case class IntValue(value:Int)

trait Operation[T] {
  def operation(): T
}

class ZeroOperation() extends Operation[Int] {
  override def operation(): Int = 0
}