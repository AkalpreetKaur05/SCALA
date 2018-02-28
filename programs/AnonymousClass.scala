class AnonymousClass {
  trait HelloWorld {  //Trait with two methods
    def greet() : Unit
    def greetSomeone(someone: String) : Unit
  }


  def sayHello() : Unit = { //function
    class EnglishGreeting extends HelloWorld { //Local class inside function
      var name = "world"
      override def greet(): Unit =  greetSomeone(name)
      override def greetSomeone(someone: String): Unit =  println("Hello, "+someone)
    }

      var englishGreeting  = new EnglishGreeting() //instance of Local class

      var frenchGreeting  = new HelloWorld { // Anonymous class

      var name = "Hashmap"
      override def greetSomeone(someone: String): Unit =  println("Salut, "+someone)
      override def greet(): Unit = greetSomeone(name)
    }

    var spanishGreeting = new HelloWorld {
      var name = "Joe"
      override def greetSomeone(someone: String): Unit = println("Hola, "+ someone)
      override def greet(): Unit = greetSomeone(name)
    }

    englishGreeting.greet()
    englishGreeting.greetSomeone("AlFred")
    frenchGreeting.greet()
    frenchGreeting.greetSomeone("Alfred")
    spanishGreeting.greet()
    spanishGreeting.greetSomeone("Alfred")
  }

}
object main extends App{
  var myApp : AnonymousClass = new AnonymousClass()
  myApp.sayHello()
}
