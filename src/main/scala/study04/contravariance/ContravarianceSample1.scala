package study04.contravariance

object ContravarianceSample1 extends App {
  abstract class Fruit { def name: String }

  class Orange extends Fruit { def name = "Orange" }

  class Apple extends Fruit { def name = "Apple" }

  class Box[-A](fruit: A)

  class ApplePerson(box: Box[Apple])

  val a: Box[Fruit] = new Box(new Apple)
  val b: ApplePerson = new ApplePerson(a)
}
