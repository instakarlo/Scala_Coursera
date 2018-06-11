package week3

object overrides {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
}

abstract class Bae {
	def foo = 1
	def bar: Int
}

class Sub extends Bae {
	override def foo = 2
	def bar = 3
}