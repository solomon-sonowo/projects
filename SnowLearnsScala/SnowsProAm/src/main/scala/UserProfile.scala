class UserProfile(userInfo:UserAccount):
  def displayInfo = println(userInfo)

  val username:String = userInfo.username
  val password:String = userInfo.password
  val firstname:String = userInfo.firstname
  val surname:String = userInfo.surname
  val email:String = userInfo.email
  val age:Int = userInfo.age

  val proamCoins = 0
  val proamTrophies = 0
