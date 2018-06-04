package week2

object excercise {
  def factorial(x: Int): Int = {
    if (x == 0) 1 else (x * factorial(x - 1))
  }                                               //> factorial: (x: Int)Int

  def factorial_v2(x: Int): Int = {
    def loop(acc: Int, x: Int): Int =
      if (x == 0) acc
      else loop(acc * x, x - 1)
    loop(1, x)
  }                                               //> factorial_v2: (x: Int)Int

  factorial(1)                                    //> res0: Int = 1
  factorial(2)                                    //> res1: Int = 2
  factorial(3)                                    //> res2: Int = 6
  factorial(4)                                    //> res3: Int = 24
  factorial(10)                                   //> res4: Int = 3628800
  
  
  factorial_v2(1)                                 //> res5: Int = 1
  factorial_v2(2)                                 //> res6: Int = 2
  factorial_v2(3)                                 //> res7: Int = 6
  factorial_v2(4)                                 //> res8: Int = 24
  factorial_v2(10)                                //> res9: Int = 3628800
}