package common

case class Game(id: String,
                board: List[Int],
                next: Int,
                round: Int,
                score: Int) {

  def isEndOfGame: Boolean = {
    next == -1000
  }

  def getId = id

  def getScore = score
}