package lectures.part1basics

object recursion extends App {

  def factorial(n:Int):Int =
    if (n <= 1) 1
    else {
      println("computing factorial of " + n + " - I first  need factorial of "+(n-1))
      val result = n * factorial(n-1)
      println("computed  factorial of" + n)
      result
    }
    println(factorial(20))


}
