class Person(var firstName: String, var lastName: String) {
  val fullName = firstName + " " + lastName
  def say() = {
    println("I am " + fullName)
  }
}

val kazuma = new Person("KAZUMA", "Ukyo")
kazuma.say()