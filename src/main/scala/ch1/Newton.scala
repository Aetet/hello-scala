package ch1

/**
 * Created by aetetic on 09.03.15.
 */
class Newton {
  def sqrt(num: Int, guess: Double = 1, precision: Double = 0.001): Double = {
    val div: Double = num / guess
    val average: Double = (div + guess) / 2
    if (math.abs(guess - average) < precision) {
      average
    } else {
      sqrt(num, average, precision)
    }

  }
}
