package crashcourse

object ClassAndObject extends App {
  // Code Here

  class Student   // defining a Students class

  val aStudent = new Student    // instantiating a class

  class Student1(name: String, rollno: Int)   // not class fields/members

  class Student2(val name: String, val rollno: Int)   // class fields/members

  class Student3(val name: String, val rollno: Int) {
    def greetings(name: String): Unit = {
      println(this.name)    // prints name passed as class parameter
      println(name)   // prints name passed to greetings method
    }
  }
  val student3 = new Student3("Ash", 1)
  student3.greetings("Sid")

  object Student4 {
    val name: String = "Ash"    // Student4 object values
    val rollno: Int = 1
    println("This a Student object")
  }
  // directly use object values without instantiating it, like a static class
  println(Student4.name)

  // A companion object of class Student2
  object Student2 {
    def apply(name: String, roll: Int): Student2 = {
      new Student2(name, roll)
    }
  }
  val student2 = Student2("Sid", 2)   // instantiate Student2 class without new keyword

  val anonClass = new Student {
    def greeting(name: String): Unit = println(name)
  }
  anonClass.greeting("Ash")

  case class Student5(name: String, rollno: Int)    // case class with member values

  class Student6 extends Student    // single level inheritance

  abstract class StudentX {   // abstract class, defines student itself
    def name: String
    def rollno: Int
  }

  trait Eat {   // trait, defines a trait of student
    def eating(): Unit
  }



}
