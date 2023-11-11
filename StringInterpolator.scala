var discount = 70
val message = s"A discount of $discount% has been applied"
println(message)

var price = 90
val totalPrice = s"The amount of discount is ${price * discount / 100} dollars"
println(totalPrice)

val totalPriceFormatted = f"The amount of discount ($discount%%) is $$${price * discount / 100.0}%2.2f dollars"
println(totalPriceFormatted)
