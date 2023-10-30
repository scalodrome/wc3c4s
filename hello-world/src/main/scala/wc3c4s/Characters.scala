object Characters {
  class Hero(var name: String, var level: Int, var race: String, var health: Int)
  val Artes: Hero = new Hero(name = "Artes", level = 1, race = "Human", health = 300)
  val DarkArtes: Hero = new Hero(name = "Dark Knight", level = 5, race = "Undead", health = 800)
}
