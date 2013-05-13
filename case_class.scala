case class Apple(name: String)
case class Orange(name: String)

val apple = Apple("ringo")

//val v: Any = apple
val v: Any = Orange("mikan")

v match {
  case Apple(name) => println(name)
  case Orange("mikan") => println("mikan")
  case _ => println("other")
}