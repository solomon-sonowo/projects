import scala.io.StdIn
import GameMode.*
import PlayLocation.*

@main def main(): Unit =
  println("Launching Snows ProAm...\n")
  println("\nWHERE ATHLETES BELONG\n")


  val accountDatabase = AccountDatabase()

  val user1 =  UserAccount("Snow", "snowman", "Solomon", "Sonowo", "solomonsnow22@gmail.com", 23)
  val user2 = UserAccount("alexa", "afhgtuj", "Alexis", "Turner", "alexist@gmail.com", 19)
  val user3 = UserAccount("aa", "atuj", "Ales", "Tuer", "alt@gmail.com", 39)

  accountDatabase.addUser(user1)
  accountDatabase.addUser(user2)
  accountDatabase.addUser(user3)


  val userProfile1 = new UserProfile(user1)
  val userProfile2 = new UserProfile(user2)
  val userProfile3 = new UserProfile(user3)

  val player1 = new Player(userProfile1)
  val player2 = new Player(userProfile2)
  val player3 = new Player(userProfile3)


  player1.score = 8
  player3.score = 4
  val team1: List[Player] = List(player1,player3)
  val team2: List[Player] = List(player2)

  val liveMatchmaking = new Matchmaking(Casual,Outdoor,team1,team2)
  for (eachPlayer <- team1)
    println(eachPlayer.score)

  liveMatchmaking.givePoints(team1)

  println(team1(0).score)
  println(team1(1).score)



//println(s"${userProfile1.username} has ${userProfile1.proamTrophies} trophies")






/*
   println("Enter the following information to create an account\n")

   println("Username:")
   val username = StdIn.readLine()
   println("Password:")
   val password = StdIn.readLine()
   println("Firstname:")
   val firstname = StdIn.readLine()
   println("Surname:")
   val surname =  StdIn.readLine()
   println("Email:")
   val email = StdIn.readLine()
   println("Age:")
   val age = StdIn.readInt()

   val user3 =  UserAccount(username, password, firstname, surname, email, age)

   accountDatabase.createAccount(user3)
*/

  //accountDatabase.printAccounts()

  /*player1.score = 23
  player2.score = 27
  println(player1.compare(player2))

  if (player1.score > player2.score)
    println("player 1 is the winner")
  else
    println("player 2 is the winner")]
*/







