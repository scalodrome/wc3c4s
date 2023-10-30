object CharacterMatching {
  def getCharacterName: Unit = {    
    var continue = true
    while (continue) {
      println("Enter character's name:")
      val character: String = scala.io.StdIn.readLine()
//  println(s"You chose $character")
      character match {
        case "Artes" => println(s"$character\'s properties:\n" + "  Name: " + Characters.Artes.name + "\n" + "  Level: " + Characters.Artes.level + "\n" + "  Race: " + Characters.Artes.race)
        case "Dark Artes" => println(s"$character\'s properties:\n" + "  Name: " + Characters.DarkArtes.name + "\n" + "  Level: " + Characters.DarkArtes.level + "\n" + "  Race: " + Characters.DarkArtes.race)
        case "" => println("Type at least one character.")
        // cases for abortion
        case "No" | "no" | "n" | "Exit" | "exit" | "Stop" | "stop" | "Нет" | "Не" | "нет" | "не" | "н" => println("Bye!"); continue = false
        case _ => println(s"No character with name $character was found. You could try again.")
      }
    }
  }
}
