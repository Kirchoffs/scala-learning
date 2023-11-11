import scala.collection.mutable

var map = mutable.Map("a" -> 1, "b" -> 2)

println(map.get("a")) // Some(1)
println(map.getOrElse("c", 3)) // 3

map.get("a").foreach(println) // 1

map("a") = -1
println(map("a")) // -1

map += ("c" -> 3)
println(map.get("c")) // Some(3)

map.remove("c")
println(map.contains("c")) // false
