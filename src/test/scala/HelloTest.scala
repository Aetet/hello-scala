import org.scalatest.FunSuite

/**
 * Created by aetetic on 09.03.15.
 */
class HelloTest extends FunSuite {
  test("Hello method works") {
    val hello = new Hello
    assert(hello.sayHello("Scala") == "Hello, Scala!")
  }
}
