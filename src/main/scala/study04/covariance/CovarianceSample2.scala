package study04.covariance

object CovarianceSample2 extends App {
  abstract class Fruit { def name: String }

  class Orange extends Fruit { def name = "Orange" }

  class Apple extends Fruit { def name = "Apple" }

  class Box[+A <: Fruit](fruit: A) {
    def name: String = fruit.name
  }

  class Person(box: Box[Fruit]) {
    def say(): Unit = println(s"I have a box of ${box.name}")
  }

  val a: Box[Apple] = new Box(new Apple)
  new Person(a).say()
}
