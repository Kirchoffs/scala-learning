def divide(dividend: Int, divisor: Int): Option[Int] = {
    if (divisor == 0) {
        None
    } else {
        Some(dividend / divisor)
    }
}

val resultAlpha: Option[Int] = divide(10, 2)
val resultBeta: Option[Int] = divide(10, 0)

resultAlpha match {
    case Some(value) => println(s"Result: $value")
    case None        => println("Cannot divide by zero")
}

resultBeta match {
    case Some(value) => println(s"Result: $value")
    case None        => println("Cannot divide by zero")
}

val resultGamma: Option[Int] = divide(10, 2)
val resultDelta: Option[Int] = divide(10, 0)

resultGamma.foreach { value =>
    println(s"Result: $value")
}

resultDelta.foreach { value =>
    println(s"Result: $value")
}
