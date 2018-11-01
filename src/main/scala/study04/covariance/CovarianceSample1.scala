package study04.covariance

object CovarianceSample1 extends App {
    abstract class Fruit { def name: String }

    class Orange extends Fruit { def name = "Orange" }

    class Apple extends Fruit { def name = "Apple" }

    class Box[A](fruit: A)

    class Person(box: Box[Fruit])

    val a: Box[Apple] = new Box(new Apple)
//    val b: Person = new Person(a)
}
