object Hello {
  def sayHi: Unit = println("Hi!")
  def sayWhat: Unit = {
      println("Say something:")
      val phrase: String = scala.io.StdIn.readLine()
      println(s"You just said '$phrase'")
  }
}
