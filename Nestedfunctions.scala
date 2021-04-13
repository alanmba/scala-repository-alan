package part3.functionalprogramming

object Nestedfunctions extends App {
  def outer(): Unit = {
    println("In outer")
    def inner (): Unit = {
      println("In innner")
    }
    inner()
  }



}
