// won't compile because String is a non nullable type
//val name : String = null
// use the following to define a nullable String variable
//val name : String? = null

val name : String? = functionThatMayReturnNullStringReference()
// won't compile because you have to check nullability before accessing any member or function of the variable
//println(name.length)

fun functionThatMayReturnNullStringReference(): String? {return "Christophe"}
// check non null value before accessing its member
if (name != null) {
    println(name.length)
}
// use the ?. operator to check directly when you want to use a member of a nullable variable
val name2 : String? = null
println(name2?.length)
// use the Elvis operator ?: to specify the value to be used if the variable is null
val name3 : String? = null
println(name3?.length ?: 0)