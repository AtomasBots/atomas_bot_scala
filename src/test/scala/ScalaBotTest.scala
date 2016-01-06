import common.Game
import org.scalatest.{FlatSpec, Matchers}

class ScalaBotTest extends FlatSpec with Matchers {

  "Calculate move" should "return value in proper range " in {
    val game: Game = new Game("", List(1, 2, 3, 4, 5), 0, 0, 0)
    ScalaBot.calculateMove(game) should be >= 0
    ScalaBot.calculateMove(game) should be <= 5
  }
}