val immutable = 1
var mutable = 2
println(mutable)

mutable = 3
println(mutable)

// won't compile : val can't be reassigned
//immutable = 4