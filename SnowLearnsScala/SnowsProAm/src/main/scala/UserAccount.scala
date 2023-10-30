case class UserAccount(username:String, password:String, firstname:String, surname:String, email:String, age:Int):
  
  override def toString: String = s"Username:${username}\nName:${firstname}\nSurname:${surname}\nEmail:${email}\nAge:${age}"