var immutableMap = Map("a" -> 1, "b" -> 2)

println(immutableMap.get("a")) // Some(1)
println(immutableMap.getOrElse("c", 3)) // 3

immutableMap.get("a").foreach(println) // 1

immutableMap = immutableMap + ("c" -> 3)
println(immutableMap.getOrElse("c", 3)) // 3

immutableMap = immutableMap - "c"
println(immutableMap.contains("c")) // false
