package lectures.part2oops

object oobasics extends App {

  val person = new Person("john",26)
  println(person.x)
  person.greet("Daniel")

}

// constructors
   class Person(name : String, val age : Int){
  val x = 2

  println(1+3)

  def greet (name:String): Unit = println(s"$name says: Hi,$name")

  def greet():Unit = println(s"Hi,I am $name")


  def this (name:String)=this(name,0)
  def this() = this("john doe")
}
// class parameters are Not Fields