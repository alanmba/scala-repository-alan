package lectures.part2oops

object Methodnotations extends App {

  class Person(val name: String, favoriteMovie: String) {
    def apply(): Any = ???

    def likes(movie: String): Boolean = movie == favoriteMovie

    def hangOutWith(person: Person): String = s" ${this.name} is hanging out with ${person.name}"

    def isAlive: Boolean = true
  }

  val mary = new Person("Mary", "Inception")
  println(mary.likes("Inception"))
  println(mary likes "Inception") // equivalent
  // infinix notation = operator  notation


  //"operators" in scala
  val tom = new Person("Tom", "Fight Club")
  println(mary hangOutWith tom)

  // prefix notation
  val x = -1
  val y = 1.unary_-
  // apply
  println(mary.apply())
  println(mary())

  // infinix notation
  mary.likes("Inception")


}



