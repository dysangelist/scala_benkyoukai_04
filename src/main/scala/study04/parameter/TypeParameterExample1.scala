package study04.parameter

object TypeParameterExample1 extends App {
  abstract class Fruit { def name: String }

  class Orange extends Fruit { def name = "Orange" }

  class Apple extends Fruit { def name = "Apple" }

  abstract class Box {
    def fruit: Fruit
    def name: String = fruit.name
  }

  class OrangeBox(orange: Orange) extends Box {
    def fruit: Orange = orange
  }

  class AppleBox(apple: Apple) extends Box {
    def fruit: Apple = apple
  }
}
