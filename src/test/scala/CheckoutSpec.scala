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
}
