package week2

object excercise {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(117); 
  def factorial(x: Int): Int = {
    if (x == 0) 1 else (x * factorial(x - 1))
  };System.out.println("""factorial: (x: Int)Int""");$skip(149); 

  def factorial_v2(x: Int): Int = {
    def loop(acc: Int, x: Int): Int =
      if (x == 0) acc
      else loop(acc * x, x - 1)
    loop(1, x)
  };System.out.println("""factorial_v2: (x: Int)Int""");$skip(17); val res$0 = 

  factorial(1);System.out.println("""res0: Int = """ + $show(res$0));$skip(15); val res$1 = 
  factorial(2);System.out.println("""res1: Int = """ + $show(res$1));$skip(15); val res$2 = 
  factorial(3);System.out.println("""res2: Int = """ + $show(res$2));$skip(15); val res$3 = 
  factorial(4);System.out.println("""res3: Int = """ + $show(res$3));$skip(16); val res$4 = 
  factorial(10);System.out.println("""res4: Int = """ + $show(res$4));$skip(26); val res$5 = 
  
  
  factorial_v2(1);System.out.println("""res5: Int = """ + $show(res$5));$skip(18); val res$6 = 
  factorial_v2(2);System.out.println("""res6: Int = """ + $show(res$6));$skip(18); val res$7 = 
  factorial_v2(3);System.out.println("""res7: Int = """ + $show(res$7));$skip(18); val res$8 = 
  factorial_v2(4);System.out.println("""res8: Int = """ + $show(res$8));$skip(19); val res$9 = 
  factorial_v2(10);System.out.println("""res9: Int = """ + $show(res$9))}
}
