package part3.functionalprogramming

object Anonymousfunction extends App{
 // anonymous function(lambda)
 val doubler : Int => Int = (x : Int) => x * 2

  // multiple params in lambda
 val adder : (Int,Int ) => Int = (a:Int,b:Int)=>a+b

  // no params
  val justDoSomething: () => Int = () => 3

  println(justDoSomething)
  println(justDoSomething())

  val superAdd = (x:Int) => (y:Int)=> x + y
  println(superAdd(3)(4))
}
