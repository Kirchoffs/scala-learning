object DefaultArguments extends App {
    def tailRecursiveFactorial(n: Int, acc: Int = 1): Int = {
        if (n <= 0) acc
        else tailRecursiveFactorial(n - 1, n * acc)
    }

    println(tailRecursiveFactorial(5))
}
