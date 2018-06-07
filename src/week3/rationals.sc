package week3

object rationals {

  def addRational(a: Rational, b: Rational): Rational = {
  	new Rational((a.numer * b.denom) + (a.denom * b.numer), a.denom * b.denom)
  }                                               //> addRational: (a: week3.Rational, b: week3.Rational)week3.Rational
  
  def makeString(a: Rational): String = {
  	a.numer + "/" + a.denom
  }                                               //> makeString: (a: week3.Rational)String
  
  var s = addRational(new Rational(1, 2), new Rational(1, 2))
                                                  //> s  : week3.Rational = week3.Rational@6b71769e
  s.numer                                         //> res0: Int = 1
  s.denom                                         //> res1: Int = 1
  makeString(addRational(new Rational(1, 2), new Rational(2, 3)))
                                                  //> res2: String = 7/6

  val x = new Rational(1, 2)                      //> x  : week3.Rational = week3.Rational@1d251891
  x.numer                                         //> res3: Int = 1
  x.denom                                         //> res4: Int = 2
  x.add(new Rational(2, 3)).toStringV2            //> res5: String = 7/6
  
  val a = new Rational(1,3)                       //> a  : week3.Rational = week3.Rational@48140564
  val b = new Rational(5,7)                       //> b  : week3.Rational = week3.Rational@58ceff1
  val c = new Rational(3,2)                       //> c  : week3.Rational = week3.Rational@7c30a502
  a.add(b).mul(c).toStringV2                      //> res6: String = 11/7
  a.sub(b).sub(c).toStringV2                      //> res7: String = -79/42
  
  b.add(b).toStringV2                             //> res8: String = 10/7
  b.less(a)                                       //> res9: Boolean = false
  b.max(a).toStringV2                             //> res10: String = 5/7
  
  
  //var denzero = new Rational(1,0)


	var z = new Rational(9)                   //> z  : week3.Rational = week3.Rational@49e4cb85
	z.toStringV2                              //> res11: String = 9/1
}

class Rational(x: Int, y: Int) {
	require(y != 0, "Denominator must be nonzero")

	private def gcd(a: Int, b: Int): Int = {
		if (b == 0) a
		else gcd(b, a % b)
	}
	private val g: Int = gcd(x,y)

	//set as constructor in case only one value is given
	def this(x: Int) = this(x, 1)

	def numer: Int = x / g
	def denom: Int = y / g

	def less(that: Rational): Boolean = {
		numer * that.denom < denom * that.numer
	}

	def max(that: Rational): Rational = {
	  if (this.less(that)) that
		else this
	}

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
	
	def toStringV2: String = numer + "/" + denom
}