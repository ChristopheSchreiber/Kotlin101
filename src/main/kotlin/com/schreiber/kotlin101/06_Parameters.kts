fun sayHello(name : String, message : String = "") = println("Hello ${name} ${message}")
sayHello("World")

sayHello("World", ", Kotlin is great")

sayHello(message = ", do you enjoy Kotlin", name = "everybody")
