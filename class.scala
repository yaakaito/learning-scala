class Person(var firstName: String, var lastName: String) {
  require(firstName != null)
  val fullName = firstName + " " + lastName
  def say() = {
    println("I am " + fullName)
  }
}

val kazuma = new Person("KAZUMA", "Ukyo")
kazuma.say()

new Person(null, "Ukyo")