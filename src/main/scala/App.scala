/**
 * Created code by aetetic on 09.03.15.
 */
import ch1.{Coins }
object App {
  def main (args: Array[String]): Unit = {
    val coins = new Coins
    println(coins.countChange(100, List(2, 1, 3)))
  }
}
