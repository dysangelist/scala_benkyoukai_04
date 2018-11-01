package study04.bounds

object BoundsExample1 extends App {
  abstract class Fruit { def name: String }

  class Orange extends Fruit { def name = "Orange" }

  class Apple extends Fruit { def name = "Apple" }

  class Box[A <: Fruit](fruit: A) {
    def name = fruit.name
  }

  val a = new Box(new Apple())
  val b = new Box(new Orange)
}
