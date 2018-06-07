package week3

object rationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(62); 
  val x = new Rational(1, 2);System.out.println("""x  : week3.Rational = """ + $show(x ));$skip(10); val res$0 = 
  x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(143); 
  
  def addRational(a: Rational, b: Rational): Rational = {
  	new Rational((a.numer * b.denom) + (a.denom * b.numer), a.denom * b.denom)
  };System.out.println("""addRational: (a: week3.Rational, b: week3.Rational)week3.Rational""");$skip(76); 
  
  def makeString(a: Rational): String = {
  	a.numer + "/" + a.denom
  };System.out.println("""makeString: (a: week3.Rational)String""");$skip(65); 
  
  var s = addRational(new Rational(1, 2), new Rational(1, 2));System.out.println("""s  : week3.Rational = """ + $show(s ));$skip(10); val res$2 = 
  s.numer;System.out.println("""res2: Int = """ + $show(res$2));$skip(10); val res$3 = 
  s.denom;System.out.println("""res3: Int = """ + $show(res$3));$skip(66); val res$4 = 
  makeString(addRational(new Rational(1, 2), new Rational(2, 3)));System.out.println("""res4: String = """ + $show(res$4));$skip(143); val res$5 = 
                                                  
                                                  
  x.add(new Rational(2, 3)).toStringV2();System.out.println("""res5: String = """ + $show(res$5));$skip(37); 
  
  
  
  val a = new Rational(1,3);System.out.println("""a  : week3.Rational = """ + $show(a ));$skip(28); 
  val b = new Rational(5,7);System.out.println("""b  : week3.Rational = """ + $show(b ));$skip(28); 
  val c = new Rational(3,2);System.out.println("""c  : week3.Rational = """ + $show(c ));$skip(29); val res$6 = 
  a.add(b).mul(c).toStringV2;System.out.println("""res6: String = """ + $show(res$6));$skip(29); val res$7 = 
  a.sub(b).sub(c).toStringV2;System.out.println("""res7: String = """ + $show(res$7))}
}

class Rational(x: Int, y: Int) {
	def numer = x
	def denom = y

	def neg: Rational = new Rational(-numer, denom)
	
	def add(that: Rational): Rational = {
		new Rational(
			numer * that.denom + denom * that.numer,
			denom * that.denom)
	}

	def sub(that: Rational): Rational = add(that.neg)

	def mul(that: Rational): Rational = {
		new Rational(
			numer * that.numer,
			denom * that.denom)
	}
	
	def toString(that: Rational): String = {
		that.numer + "/" + that.denom
	}
	
	def toStringV2() = numer + "/" + denom
}
