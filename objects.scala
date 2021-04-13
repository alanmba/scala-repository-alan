package lectures.part2oops

object objects extends App{

  // scala Does not have class-level functionality("static") or  scala doesn't have  "static" values / methods
  object person {
    val N_EYES = 2
    def canFLY : Boolean = false
  }
    println(person.N_EYES)
    println(person.canFLY)
  //scala object = SINGLETON
  val mary  = person
  val john  = person
  println(mary == john)

  // scala object is a singleton
}

