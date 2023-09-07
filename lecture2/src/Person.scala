class Person(var firstName : String, var lastName: String, var birthYear : Int ) {
  println("PersonCreated!")

  def copy() : Person =
    new Person(firstName, lastName, birthYear)

  def info() : String =
    firstName + " " + lastName + " was born in " + birthYear
}
