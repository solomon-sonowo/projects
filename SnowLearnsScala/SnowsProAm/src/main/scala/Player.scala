class Player(userProfile: UserProfile) extends Ordered[Player]:
  var score: Int = 0
  def compare(otherPlayer:Player) = score - otherPlayer.score




  
  
  
