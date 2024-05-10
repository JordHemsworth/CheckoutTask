import objects.{Apple, Orange}
object Checkout {
  def CheckPrices(shoppingList: List[String]): Double = {

    val numOfOranges = shoppingList.count(_ == "Orange")
    val numberOfApples = shoppingList.count(_ == "Apple")

    val totalOrangePrice: Double = numOfOranges * Orange.price
    val totalApplePrice: Double = numberOfApples * Apple.price

    val totalCost: Double = totalOrangePrice + totalApplePrice

    totalCost
  }
}
