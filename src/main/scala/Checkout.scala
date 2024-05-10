import objects.{Apple, Orange}
object Checkout {
  def CheckPrices(shoppingList: List[String]): Double = {

    val numOfOranges = shoppingList.count(_ == "Orange")
    val numberOfApples = shoppingList.count(_ == "Apple")

    val discountedOranges: Int = numOfOranges / 3
    val discountedApples: Int = numberOfApples / 2

    val totalOrangePrice = (numOfOranges - discountedOranges) * Orange.price
    val totalApplePrice = (numberOfApples - discountedApples) * Apple.price

    val totalCost: Double = totalOrangePrice + totalApplePrice

    totalCost
  }
}
