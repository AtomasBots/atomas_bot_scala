import common.{AtomasBotRunner, Game, MoveCalculator}

object ScalaBot extends MoveCalculator {

  //TODO: Add your logic here
  override def calculateMove(game: Game): Int = 0

  def main(args: Array[String]): Unit = {
    new AtomasBotRunner(ScalaBot).run(/*Put optional nick here*/)
  }
}