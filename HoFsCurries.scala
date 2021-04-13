package part3.functionalprogramming

object HoFsCurries extends App{
  val superFunction : (Int,(String,(Int => Boolean)) => Int) =>(Int => Int) = null

  def nTimes (f: Int => Int , n: Int , x: Int):Unit = {
    if (n <= 0)
    else nTimes(f, n-1, f(x))
    val plusOne = (x:Int)=>x +1
    println(nTimes(plusOne,10,1))

    def nTimesBetter(f:Int => Int , n: Int): (Int => Int) =
      if (n <= 0) (x:Int) => x
      else (x: Int) => nTimesBetter(f,n-1)(f(x))

    val plus10 = nTimesBetter(plusOne,10)
    println(plus10(1))
  }


  // curried functions
   val superAdder : Int => Int => Int = (x:Int) =>(y:Int) => x +y
   val add3 = superAdder(3)
  println(add3(10))
  println(superAdder(3)(10))

  def sum(a:Int) (b: Int) = {
    a + b
  }
  sum(2)(5)
}
