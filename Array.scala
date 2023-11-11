val x = 10
val y = 20
val z = 30

val array3d = Array.ofDim[Int](x, y, z)
array3d(1)(2)(3) = 5
println(array3d(1)(2)(3))

val array2d = Array(1, 2, 3)
val mappedArray2d = array2d.map { element => element * 2 }
println(mappedArray2d.mkString(", "))

val array2dString = Array("One", "Two", "Three")
val mappedArray2dString = array2dString.map { element => 
    Map(
        element -> element.toUpperCase
    )
}
println(mappedArray2dString.mkString(", "))
println(mappedArray2dString(0)("One"))
