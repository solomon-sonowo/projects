import scala.collection.mutable.Map // Use immutable Map

class AccountDatabase:
  var proamAccounts: Map[String, UserAccount] = Map()

  def createAccount(userAccountInfo: UserAccount): Unit =
    if (proamAccounts.contains(userAccountInfo.username))
      println("Account already exists")
    else if (!isValidUsername(userAccountInfo.username))
      println("Invalid Username")
    else if (!isValidPassword(userAccountInfo.password))
      println("Invalid Password")
    else if (!isValidName(userAccountInfo.firstname))
      println("Invalid Firstname")
    else if (!isValidName(userAccountInfo.surname))
      println("Invalid Surname")
    else if (!isValidEmail(userAccountInfo.email))
      println("Invalid Email")
    else if (userAccountInfo.age <= 16)
      println("You must be at least 16 years old to create an account.")
    else
      proamAccounts += (userAccountInfo.username -> userAccountInfo)
      println(s"\n${userAccountInfo.firstname + " " + userAccountInfo.surname} has successfully been registered.")




  def addUser(userAccountInfo: UserAccount): Unit =
    if (userAccountInfo.age >16)
     proamAccounts += (userAccountInfo.username -> userAccountInfo)
    else println("User cannot be created as they do not meet the age requirements")

  def printAccounts(): Unit =
    val usersAlphabetically = proamAccounts.values.toSeq.sortBy(_.firstname)
    for ((user) <- usersAlphabetically)
      println(s"\nAccount Information for User: ${user.firstname} ${user.surname}\n")
      println(s"Username: ${user.username}")
      println(s"Name: ${user.firstname}")
      println(s"Surname: ${user.surname}")
      println(s"Email: ${user.email}")
      println(s"Age: ${user.age}\n")


  def isValidEmail(email: String): Boolean =
    val emailRegex = "^[A-Za-z0-9+._-]+@(.+)$"
    email.matches(emailRegex)

  def isValidUsername(username:String):Boolean =
    val usernameRegex = "^[A-Za-z0-9+.-_]+$"
    username.matches(usernameRegex)

  def isValidName(name: String): Boolean =
    val nameRegex = "^[A-Za-z]+$"
    name.matches(nameRegex)

  def isValidPassword(password:String):Boolean =
    val minLength = 8
    val inclUpperC = "[A-Z]".r.findFirstIn(password).isDefined
    val inclLowerC ="[a-z]".r.findFirstIn(password).isDefined
    val inclSpecialC = "[!@#\\$%^&*()_+\\-=\\[\\]{};':\",.<>?~\\\\]".r.findFirstIn(password).isDefined
    val inclNumbers = "\\d".r.findFirstIn(password).isDefined

    val strongPassword = password.length >= minLength && inclNumbers
      && inclLowerC && inclUpperC && inclSpecialC
    strongPassword()


