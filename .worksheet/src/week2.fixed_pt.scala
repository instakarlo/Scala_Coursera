package week2

import math.abs

object fixed_pt {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); 
	val tolerance = 0.0001;System.out.println("""tolerance  : Double = """ + $show(tolerance ));$skip(78); 
	def isCloseEnough(x: Double, y: Double) =
		abs((x - y) / x) / x < tolerance;System.out.println("""isCloseEnough: (x: Double, y: Double)Boolean""");$skip(236); 
	def fixedPoint(f: Double => Double)(firstGuess: Double) = {
		def iterate(guess: Double): Double = {
			//println(guess)
			val next = f(guess)
			if (isCloseEnough(guess, next)) next
			else iterate(next)
		}
		iterate(firstGuess)
	};System.out.println("""fixedPoint: (f: Double => Double)(firstGuess: Double)Double""");$skip(33); val res$0 = 
	
	fixedPoint(x => 1 + x / 2)(1);System.out.println("""res0: Double = """ + $show(res$0));$skip(63); 
	
	def sqrt(x: Double) = fixedPoint(y => (y + x / y) / 2)(1.0);System.out.println("""sqrt: (x: Double)Double""");$skip(9); val res$1 = 
	sqrt(2);System.out.println("""res1: Double = """ + $show(res$1));$skip(68); 
	
	def averageDamp(f: Double => Double)(x: Double) = (x + f(x)) / 2;System.out.println("""averageDamp: (f: Double => Double)(x: Double)Double""");$skip(68); 
	
	def sqrtv2(x: Double) = fixedPoint(averageDamp(y => x / y))(1.0);System.out.println("""sqrtv2: (x: Double)Double""");$skip(11); val res$2 = 
	sqrtv2(2);System.out.println("""res2: Double = """ + $show(res$2))}
}
