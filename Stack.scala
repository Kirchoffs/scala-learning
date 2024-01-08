import scala.collection.mutable.Stack

val stk = new Stack[Int]
stk.push(42)

println(s"First element: ${stk.top}")
// println(s"First element: ${stk.top()}") does not work

println(s"Pop first element: ${stk.pop()}")
// println(s"Pop first element: ${stk.pop}") does work
