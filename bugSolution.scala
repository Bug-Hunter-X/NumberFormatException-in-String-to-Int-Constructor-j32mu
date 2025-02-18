```scala
class MyClass(val x: Int) {
  def this(s: String) = {
    try {
      this(s.toInt)
    } catch {
      case e: NumberFormatException =>
        println("Error: Invalid input string. Using default value 0.")
        this(0)
    }
  }
}

val myObj1 = new MyClass("123")
val myObj2 = new MyClass("abc") // Will not throw an exception, will use default value 0
println(myObj1.x) // Output: 123
println(myObj2.x) // Output: 0
```