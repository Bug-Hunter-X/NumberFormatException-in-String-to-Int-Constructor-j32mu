```scala
class MyClass(val x: Int) {
  def this(s: String) = this(s.toInt)
}

val myObj = new MyClass("abc") // This will throw a NumberFormatException
```