package week2

object currying {
  def product(f: Int => Int)(a: Int, b:Int) : Int = {
  	if (a > b) 1
  	else f(a) * product(f)(a + 1, b)
  }                                               //> product: (f: Int => Int)(a: Int, b: Int)Int
  
  product(x => x)(2,4)                            //> res0: Int = 24
  
  
  def factorial(n: Int): Int = {
  	if (n <= 1) 1
  	else n * factorial(n-1)
  }                                               //> factorial: (n: Int)Int
  
  factorial(4)                                    //> res1: Int = 24
  
  def factorialv2(n: Int) = product(x => x)(1, n) //> factorialv2: (n: Int)Int
  factorialv2(4)                                  //> res2: Int = 24
  
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int) : Int = {
  	if (a > b) zero
  	else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
  }                                               //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int
  
  def productv2(f: Int => Int)(a: Int, b:Int) : Int = mapReduce(f, (x, y) => x * y, 1)(a, b)
                                                  //> productv2: (f: Int => Int)(a: Int, b: Int)Int
  productv2(x => x * x)(2, 3)                     //> res3: Int = 36
}