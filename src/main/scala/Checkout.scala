import objects.{Apple, Orange}

object Checkout {
  def CheckPrices(shoppingList: List[String]): Double = {

    val cleansedShoppingList: List[String] = shoppingList.map(_.trim.toLowerCase)

    val numOfOranges = checkOranges(cleansedShoppingList)
    val numberOfApples = checkApples(cleansedShoppingList)

    val totalCost: Double = applyDiscount(numOfOranges, numberOfApples)
    totalCost
  }

  private def checkApples(cleansedShoppingList: List[String]): Int = {
    val appleCount = cleansedShoppingList.count(_ == "apple")
    appleCount
  }

  private def checkOranges(cleansedShoppingList: List[String]): Int = {
    val orangeCount = cleansedShoppingList.count(_ == "orange")
    orangeCount
  }

  def applyDiscount(numOfOranges: Int, numberOfApples: Int): Double = {
    val discountedOranges: Int = numOfOranges / 3
    val discountedApples: Int = numberOfApples / 2

    val totalOrangePrice = (numOfOranges - discountedOranges) * Orange.price
    val totalApplePrice = (numberOfApples - discountedApples) * Apple.price

    val totalDiscountedCost: Double = totalOrangePrice + totalApplePrice
    totalDiscountedCost
  }
}
