package study04.parameter

object TypeParameterExample2 extends App {
    abstract class Fruit { def name: String }

    class Orange extends Fruit { def name = "Orange" }

    class Apple extends Fruit { def name = "Apple" }

  class Box[+A](fruit: A) {

      def name = ???
    }

  val a: Box[Apple] = new Box(new Apple)
}
