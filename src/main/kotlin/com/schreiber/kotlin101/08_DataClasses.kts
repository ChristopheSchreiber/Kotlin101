data class Person(val firstName : String, val lastName : String)

val me = Person("Christophe", "Schreiber")
println(me.firstName)

// data classes define getters, setters (for mutable fields), equals, hashcode, copy methods
val otherMe = Person("Christophe", "Schreiber")
println(me == otherMe)

val notMe = me.copy(lastName = "Rebierhcs")
println(notMe)