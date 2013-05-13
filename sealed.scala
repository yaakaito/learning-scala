sealed abstract class Human
case class A extends Human
case class B extends Human
case class C extends Human

def hoge(h: Human) = {
  h match {
    case a:A => println("a")
    case b:B => println("b")
  //  case c:C => println("c")
  }
}