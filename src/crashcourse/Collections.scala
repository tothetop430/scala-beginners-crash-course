package crashcourse

import scala.collection.mutable

object Collections extends App {
  // Code Here

  // sequences
  val seq = Seq(1,2,3,4,5)  // a sequence can be defined using Seq object

  // doing arbitrary operations on given sequence
  println(seq.reverse)
  println(seq(3))   // index based access
  println(seq.sorted)

  // range
  val aRange: Seq[Int] = 1 to 10
  aRange.foreach(println)   // foreach applies the given function on each value
                            // the given function is a side effect method


  // arrays
  val array = Array(1,2,3,4,5)
  val array2 = Array.ofDim[Int](3)    // another way to create arrays
                                           // Try println on array2


  // vectors
  val vector = Vector(1,2,3,4,5)

  // tuples
  val tuple: Tuple1[Int] = Tuple1(1)   // tuple can contain max of 22, Tuple22(...)

  // maps
  val aMap = Map(("", ""), (1, 2))  // it contains pair of elements
  val aMap2 = Map("" -> "", 1 -> 2) // another way to define pairs

  println(aMap.contains(""))  // return boolean
  println(aMap(1))  // evaluate to the value corresponding to the key
  println(aMap.toList)

  // defining a list
  val list = List(1,2,3,4,5)

  // using map
  println(list.map(x => x * 2)) // notice x => x*2 is a function mapped to
                                // each value of the list

  // using filter
  println(list.filter(x => x % 2 == 0)) // notice it is filtering even numbers

  // using flatMap
  println(list.flatMap(x => List(x, x*x))) // it evaluates to a list of lists
                                            // where inner list contains
                                            // value x and its square

  // using for loop
  for {
    v <- list
  } println(v)    // printing all the elements of the list

}
