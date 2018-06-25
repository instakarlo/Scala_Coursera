package week3

object scratch {
  var a = new week3.Rational(1,2)                 //> a  : week3.Rational = week3.Rational@35bbe5e8
  
  def error(msg: String) = throw new Error(msg)   //> error: (msg: String)Nothing
  
  error("test")                                   //> java.lang.Error: test
                                                  //| 	at week3.scratch$.error$1(week3.scratch.scala:6)
                                                  //| 	at week3.scratch$.$anonfun$main$1(week3.scratch.scala:8)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$anonfun$$ex
                                                  //| ecute$1(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:76)
                                                  //| 	at week3.scratch$.main(week3.scratch.scala:3)
                                                  //| 	at week3.scratch.main(week3.scratch.scala)
   val x = null
   val b: String = x
}