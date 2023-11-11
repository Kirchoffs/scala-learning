// Option
val optionNumber: Option[Int] = Some(42)

// Option map
val mappedOptionNumber1 = optionNumber.map(x => x * 2)
println(mappedOptionNumber1)     // Some(84)
val mappedOptionNumber2 = optionNumber.map(x => Some(x * 2))
println(mappedOptionNumber2)     // Some(Some(84))

// Option flatMap
val flatMappedOptionNumber = optionNumber.flatMap(x => Some(x * 2))
println(flatMappedOptionNumber) // Some(84)

// List
val list = List(1, 2, 3)

// List map
val mappedList1 = list.map(x => x * 2)
println(mappedList1)     // List(2, 4, 6)
val mappedList2 = list.map(x => List(x, x * 2))
println(mappedList2)     // List(List(1, 2), List(2, 4), List(3, 6))

// List flatMap
val flatMappedList = list.flatMap(x => List(x, x * 2))
println(flatMappedList) // List(1, 2, 2, 4, 3, 6)

// Future
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.Random

val future = Future { println("a"); Random.nextInt(42) }

// Future map
val mappedFuture = future.map(x => { println("b"); Random.nextInt(42) })

// Future flatMap
val flatMappedFuture = future.flatMap(x => Future { println("c"); Random.nextInt(42) })
