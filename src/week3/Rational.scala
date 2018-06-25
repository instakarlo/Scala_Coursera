package week3

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