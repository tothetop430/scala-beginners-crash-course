package crashcourse

import scala.util.{Failure, Success, Try}

object OptionErrorPattern extends App {
  // Code Here

  // a method that does SOMEthing
  def someFunc(): Int = 10

  // a method that can raise NullPointerException
  def noneFunc() = null

  // using Option to get Some or None
  val some = Option(someFunc())
  val none = Option(noneFunc())

  println(some)   // Some(10)
  println(none)   // None

  // a method that raises NullPointerException
  def someErrorProneFunction() = throw new NullPointerException

  // using try-catch block
  try {
    someErrorProneFunction()
  } catch {
    case e: NullPointerException => println("NullPointerException thrown")
  } finally {
    // always evaluate this code block
    println("This code block is evaluated irrespective of an exception is caught or not.")
  }

  // using Try object to wrap exceptions
  val someError = Try(someErrorProneFunction())

  println(someError.isSuccess)    // false
  println(someError.isFailure)    // true

  // pattern matching for options and try
  val matchOption: Unit = some match {
    case Some(x) => println(s"Received $x")
    case _ => println("Received None")    // use _ for default case to avoid MatchError
  }

  val matchTry: Unit = someError match {
    case Success(value) => println(value)
    case Failure(exception) => println(exception)
  }


}
