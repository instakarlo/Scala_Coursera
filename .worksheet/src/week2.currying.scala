package week2

object currying {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(142); 
  def product(f: Int => Int)(a: Int, b:Int) : Int = {
  	if (a > b) 1
  	else f(a) * product(f)(a + 1, b)
  };System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(26); val res$0 = 
  
  product(x => x)(2,4);System.out.println("""res0: Int = """ + $show(res$0));$skip(87); 
  
  
  def factorial(n: Int): Int = {
  	if (n <= 1) 1
  	else n * factorial(n-1)
  };System.out.println("""factorial: (n: Int)Int""");$skip(18); val res$1 = 
  
  factorial(4);System.out.println("""res1: Int = """ + $show(res$1));$skip(53); 
  
  def factorialv2(n: Int) = product(x => x)(1, n);System.out.println("""factorialv2: (n: Int)Int""");$skip(17); val res$2 = 
  factorialv2(4);System.out.println("""res2: Int = """ + $show(res$2));$skip(183); 
  
  def mapReduce(f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int) : Int = {
  	if (a > b) zero
  	else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
  };System.out.println("""mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int)Int""");$skip(96); 
  
  def productv2(f: Int => Int)(a: Int, b:Int) : Int = mapReduce(f, (x, y) => x * y, 1)(a, b);System.out.println("""productv2: (f: Int => Int)(a: Int, b: Int)Int""");$skip(30); val res$3 = 
  productv2(x => x * x)(2, 3);System.out.println("""res3: Int = """ + $show(res$3))}
}
