package ch1

/**
 * Created code by aetetic on 10.03.15.
 */
class PascalTriangle {
  def calculate (num: Int) = {

  }
  def line (line: List) = line match {
    case nil => List(1)
    case 1::nil => List(1, 1)
    case 1::tail => line(List())
  }

}
