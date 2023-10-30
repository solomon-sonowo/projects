//import Sport.*
import GameMode.*
import  PlayLocation.*

class Matchmaking(gameMode: GameMode,playLocation: PlayLocation,team1:List[Player],team2:List[Player]):
  var points = 0

  def givePoints(team:List[Player]):Unit =
    team1(0).score += 1
    
  def startGame(): Unit =
    println("The game has started")
    //Player[0]

  def endGame():Unit =
      println("e")
