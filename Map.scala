val strToIntMap = Map("one" -> 1, "two" -> 2, "three" -> 3)
println(strToIntMap("one"))
println(strToIntMap.get("two"))     // Some(2)
println(strToIntMap.get("two").get)

val intToStrMap = Map(1 -> "one", 2 -> "two", 3 -> "three")
println(intToStrMap(1))
println(intToStrMap.get(2))
println(intToStrMap.get(2).get)
