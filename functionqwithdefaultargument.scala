package part3.functionalprogramming

import lectures.part1basics.Expressions.a
import lectures.part1basics.ValuesVariablesObjects.b

object functionqwithdefaultargument extends App {
  def function (a : Int , b : Int  = 7): Unit = {
    println(a * b)
  }
  function(10 , 20)
  function(10)

  def function0(a : Int , b: Int ):Unit ={
    println(a / b)
  }
  function(20 ,20)


  // functions with named arguments
  def diff(a:Int,b: Int) : Int = {
    println(s"a = $a and b = $b......")
    b-a
  }
  diff(10,100)

  // Scala functions with  variable arguments
  // when we don't know how many arguments we have to pass then we can use variable argument



}
