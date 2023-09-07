import scala.annotation.tailrec


class Rat(ni : Int, val di : Int) {
  private val commonFactor = Rat.gcd(ni,di)
  val n : Int = ni / commonFactor
  val d : Int = di / commonFactor

  def +(r : Rat) : Rat =
    Rat(n * r.d + r.n * d, d * r.d)

  def *(r : Rat) : Rat =
    Rat(n * r.n , d * r.d)

  def ==(r : Rat) : Boolean =
    n == r.n && d == r.d


  override def toString : String = {
    if(d == 1) n.toString
    else s"$n/$d"
  }
}








object Rat {

  def apply(n : Int, d : Int = 1) = new Rat(n,d)

  @tailrec
  def gcd(a: Int, b: Int): Int =
    if(b ==0) a else gcd(b, a % b)
}