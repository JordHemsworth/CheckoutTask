import org.scalatest.funsuite.AnyFunSuite
import objects.{Apple, Orange}
class CheckoutSpec extends AnyFunSuite {


  test("Apple has the correct price") {
    val applePrice = Apple.price
    assert(applePrice == 0.6)
  }

  test("Orange has the correct price") {
    val applePrice = Orange.price
    assert(applePrice == 0.25)
  }

  test("Checkout calculates the correct price for one Apple and one Orange") {
    val shoppingList: List[String] = List("Apple", "Orange")
    val totalPrice = Checkout.CheckPrices(shoppingList)
    assert(totalPrice == 0.85)
  }

  test("Checkout calculates the correct price with BOGOF on odd amount of Apples") {
    val shoppingList: List[String] = List("Apple", "Apple", "Apple")
    val totalPrice = Checkout.CheckPrices(shoppingList)
    assert(totalPrice == 1.20)
  }

  test("Checkout calculates the correct price with BOGOF on even amount of Apples") {
    val shoppingList: List[String] = List("Apple", "Apple", "Apple", "Apple")
    val totalPrice = Checkout.CheckPrices(shoppingList)
    assert(totalPrice == 1.20)
  }

  test("Checkout calculates the correct price with 3 for 2 on odd Oranges") {
    val shoppingList: List[String] = List("Orange", "Orange", "Orange")
    val totalPrice = Checkout.CheckPrices(shoppingList)
    assert(totalPrice == 0.50)
  }

  test("Checkout calculates the correct price with 3 for 2 on even Oranges") {
    val shoppingList: List[String] = List("Orange", "Orange", "Orange", "Orange")
    val totalPrice = Checkout.CheckPrices(shoppingList)
    assert(totalPrice == 0.75)
  }

  test("Checkout calculates the correct price when using both discounts") {
    val shoppingList: List[String] = List("Orange", "Orange", "Orange", "Apple", "Apple")
    val totalPrice = Checkout.CheckPrices(shoppingList)
    assert(totalPrice == 1.10)
  }
}
