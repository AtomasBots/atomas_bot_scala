package common

import scala.collection.JavaConversions

object GameConverter {

  def toGame(gameJava: GameJava): Game = {
    val scalaIterator: List[Int] = JavaConversions.asScalaIterator(gameJava.board.iterator()).map(_.intValue()).toList
    new Game(gameJava.id, scalaIterator, gameJava.next, gameJava.round, gameJava.score)
  }
}
