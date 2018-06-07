package week3

object rationals {
  val x = new Rational(1, 2)                      //> x  : week3.Rational = week3.Rational@1a86f2f1
  x.numer                                         //> res0: Int = 1
  x.denom                                         //> res1: Int = 2
  
  def addRational(a: Rational, b: Rational): Rational = {
  	new Rational((a.numer * b.denom) + (a.denom * b.numer), a.denom * b.denom)
  }                                               //> addRational: (a: week3.Rational, b: week3.Rational)week3.Rational
  
  def makeString(a: Rational): String = {
  	a.numer + "/" + a.denom
  }                                               //> makeString: (a: week3.Rational)String
  
  var s = addRational(new Rational(1, 2), new Rational(1, 2))
                                                  //> s  : week3.Rational = week3.Rational@6bdf28bb
  s.numer                                         //> res2: Int = 4
  s.denom                                         //> res3: Int = 4
  makeString(addRational(new Rational(1, 2), new Rational(2, 3)))
                                                  //> res4: String = 7/6
                                                  
                                                  
  x.add(new Rational(2, 3)).toStringV2()          //> res5: String = 7/6
  
  
  
  val a = new Rational(1,3)                       //> a  : week3.Rational = week3.Rational@27f674d
  val b = new Rational(5,7)                       //> b  : week3.Rational = week3.Rational@1d251891
  val c = new Rational(3,2)                       //> c  : week3.Rational = week3.Rational@48140564
  a.add(b).mul(c).toStringV2                      //> res6: String = 66/42
  a.sub(b).sub(c).toStringV2                      //> res7: String = -79/42
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