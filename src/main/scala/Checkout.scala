import objects.{Apple, Orange}
object Checkout {
  def CheckPrices(shoppingList: List[String]): Double = {

    val numOfOranges = checkOranges(shoppingList)
    val numberOfApples = checkApples(shoppingList)

    val totalCost: Double = applyDiscount(numOfOranges, numberOfApples)
    totalCost
  }

  private def checkApples(shoppingList: List[String]): Int = {
    val appleCount = shoppingList.count(_ == "Apple")
    appleCount
  }

  private def checkOranges(shoppingList: List[String]): Int = {
    val orangeCount = shoppingList.count(_ == "Orange")
    orangeCount
  }

  private def applyDiscount(numOfOranges: Int, numberOfApples: Int): Double = {
    val discountedOranges: Int = numOfOranges / 3
    val discountedApples: Int = numberOfApples / 2

    val totalOrangePrice = (numOfOranges - discountedOranges) * Orange.price
    val totalApplePrice = (numberOfApples - discountedApples) * Apple.price

    val totalDiscountedCost: Double = totalOrangePrice + totalApplePrice
    totalDiscountedCost
  }
}
