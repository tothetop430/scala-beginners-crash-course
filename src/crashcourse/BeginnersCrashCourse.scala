package crashcourse

object BeginnersCrashCourse extends App {
  var var1 = 1;  //Mutable
  val var2 = 2; //Immutable

  val bool: Boolean = true  //or false
  val chr: Char = 'a'   //Make sure you use single quotes for character type value
  val str: String = "String"    //And double quotes for a string type
  val int: Int = 123    //A int value
  val shrt: Short = 123   //A short value
  val lng: Long = 123     //A long value
  val lng2 = 123L   //Make sure to put L to let compiler know that it is of type Long
  val flt: Float = 123.0f   //Make sure to put f at the end of float values
  val dbl: Double = 123.0   //Otherwise compiler will infer it as a type of double

  // Methods
  def greetings(name: String): String = "Hello " + name
  println(greetings("Siddharth"))

  def greetingsModified(name: String): Unit = println("Hello " + name)
  greetingsModified("Sid")

  def greetingsFromSystem: Unit = println("Hello, you are learning Scala!")
  greetingsFromSystem
}
