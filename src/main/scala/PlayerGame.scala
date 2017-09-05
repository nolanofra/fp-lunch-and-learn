object PlayerGame extends App{

  def printWinner(p: Player): Unit = println("... and the winner is " + p.name)

  def declareWinner(p1: Player, p2:Player): Unit = {
    if (p1.score > p2.score) printWinner(p1)
    else printWinner(p2)
  }

  val player1 = Player("Bob", 4)
  val player2 = Player("Paul", 3)

  declareWinner(player1, player2)
}
