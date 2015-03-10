package ch1

/**
 * Created code by aetetic on 09.03.15.
 */
class Coins {
  def countChange (sum: Int, coins: List[Int]) : Int = (sum, coins) match {
    case (_, _) if sum < 0 => 0
    case (0, Nil) => 0
    case (0, _) => 1
    case (_, Nil) => 0
    case (_, head::tail) => countChange(sum, tail) + countChange(sum - head, coins)
  }
}
