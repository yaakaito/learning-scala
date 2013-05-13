val m = Map("Apple" -> 1)

def hoge(option: Option[Int]) = {
  option match {
    case Some(n) => println(n)
    case None => println("None!")
  }
}

hoge(m.get("Apple"))
hoge(m.get("Orange"))


println(m.get("Apple").get)
println(m.get("Orange").getOrElse(-100))
m.get("Orange").get