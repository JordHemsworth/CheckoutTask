import org.scalatest.funsuite.AnyFunSuite
class CheckoutSpec extends AnyFunSuite {

  test("Apple has the correct price") {
    val applePrice = Apple.price
    assert(applePrice == 0.6)
  }

  test("Orange has the correct price") {
    val applePrice = Orange.price
    assert(applePrice == 0.25)
  }
}
