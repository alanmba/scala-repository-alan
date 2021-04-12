package lectures.part1basics

object Expressions  extends App{
  val x = 1 + 2
  println(x)

   var y = 20

  if(y <= 100) {
    println("if condition executed succesfully since x <= 20")
  }

  var z = 200
  if (z <= 100) {
    println("if conditon executed successfully since z<=100")
  }
  else {
    println("else condtion executed successfully since z >= 100 ")
  }


  var c = 50
  if (c <= 100) {
    println("50 is less than the 100")
  }
  else {
    println("50 is not less than the 100")
  }

 var a = 200
  if (a <= 500)
    {
      println("200 is less than the 500")
    }
  else
    {
      println("200 is greater than the 500")
    }


}
