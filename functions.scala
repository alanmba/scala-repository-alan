package lectures.part1basics

object functions extends App {

  def aFunction (a:String, b: Int):String = {
    a +" "+b
  }
  println(aFunction("hello",3))

  def sum(a:Int, b:Int): Unit ={
    println(a+b)
  }
  sum(2,5)

  def sub(a:Int,b:Int):Unit = {
    println(a-b)
  }
  sub(5 ,1000)

  def mul(a:Int,b:Int):Unit = {
    println(a * b)
  }
  mul(100 , 1000)

  def aRepeatedFunction(aString:String,n:Int):String = {
    if(n == 1)aString
    else aString + aRepeatedFunction(aString,n=1)
  }
    println(aRepeatedFunction("hello ",4))

  def greetingForkids(name:String,age:Int): String =
    "Hi,my name is "+ name +" "+ "and i am "+ age +" " + "years old."
    println(greetingForkids("Alan", 24 ))

  def factorial(n:Int):Int=
    if (n<=0)1
    else n* factorial(n-1)
    println(factorial(5))

  def fibonacci(n:Int):Int=
    if(n <= 2) 1
    else fibonacci(n-1)+fibonacci(n-2)

  println(fibonacci(8))



}

