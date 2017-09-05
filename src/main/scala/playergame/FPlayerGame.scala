package playergame

object FPlayerGame extends App{

  def winner(p1: Player, p2:Player) : Player = {
    if (p1.score > p2.score) p1
    else p2
  }

  def printWinner(p: Player): Unit = println("... and the winner is " + p.name)

  def declareWinner(p1: Player, p2:Player): Unit = printWinner(winner(p1, p2))

  val players: List[Player] = List(
    Player("Tom", 1),
    Player("Sam", 10),
    Player("Bob", 3),
    Player("Paul", 4)
  )
  val winnerPlayer = players.reduceRight(winner)
  printWinner(winnerPlayer)
}
