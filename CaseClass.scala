case class Person(name: String, age: Int)

val alice = Person("Alice", 25)
val olderAlice = alice.copy(age = 26)

alice match {
  case Person("Alice", 25) => println("Hi Alice!")
  case _ => println("Who are you?")
}
