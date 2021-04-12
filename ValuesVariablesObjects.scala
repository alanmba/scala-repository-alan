package lectures.part1basics

object ValuesVariablesObjects extends App{
 val x  = 42
  println(x)
 val aString = "hello"
 val anotherString = "goodbye"
 println(aString)
 println(anotherString)
 val aBoolean = false
 println(aBoolean)
 val aChar = 'a'
 println(aChar)
 val aInt = x
 println(aInt)

 // Variables
 var aVariable = 4
 println(aVariable)


 var y = 1
 y += 1
 println(y)

 val aCondition = true
 val aConditionedValue = if(aCondition) 5 else 3
 println(aConditionedValue)

 var b = 20
 if (b <= 50)
  {
   println("20 is less than the 50")
  }
 else
  {
   println("20 is greter than the 50")
  }

 var i = 0
 while (i < 10)
 {
  println(i)
  i += 1
 }
var j = 50
 while ( j < 200) {
  println(j)
  j += 1
 }


}
