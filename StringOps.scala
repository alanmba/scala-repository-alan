package lectures.part1basics

import scala.Console.println

object StringOps extends App {

  val str : String ="Hello ,I am learning Scala"

  println(str.charAt(3))
  println(str.substring(0,5))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.toUpperCase())
  println(str.length)
  val  aNumberString  = "2"
  val  aNumber = aNumberString.toInt
  println('a'+: aNumberString:+ 'z')
  println(str.reverse)
  println(str.take(2))

  // string interpolators
  // s interpolators


  val name = "David"
  val age = 12
  val greeting = s"Hello , my name is  $name and I am $age years old"
  val anothergreeting = s"Hello,my name is $name and I will  be turning ${age + 1}years old."
  println(anothergreeting)
  println(greeting)


   val newname = "Alan"
   val newage  = 24
   val wish = s"Hello , i am $newname and i am $newage years old"
   val anotherwish = s"Hello , i am $newname and i am going to start  ${age + 1}years old"
   println(wish)
   println(anotherwish)


}
