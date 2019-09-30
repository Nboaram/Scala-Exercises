package calculator

import resources.BaseTestingClass
import Day5.Calculator._

class CalculatorTest extends BaseTestingClass{

  "Calculator Sum when fed 1 and 1" should "return 2" in {
    assert(sum(1,1) == 2)
  }

  "Calculator Sum when fed 2 and 3" should "return 5" in {
    assert(sum(2,3) == 5)
  }

  "Calculator Subtract when fed 1 and 1" should "return 0" in {
    assert(subtract(1, 1) == 0)
  }

  "Calculator Subtract when fed 2 and 3" should "return -1" in {
    assert(subtract(2, 3) == -1)
  }

  "Calculator Subtract when fed -12 and 3" should "return -9" in {
    assert(subtract(-12, 3) == -15)
  }

  "Calculator multiply when fed 2 and 3" should "return 6" in {
    assert(multiply(2, 3) == 6)
  }

  "Calculator multiply when fed 5 and 3" should "return 15" in {
    assert(multiply(5, 3) == 15)
  }

  "Calculator multiply when fed 5 and 0" should "return 0" in {
    assert(multiply(5, 0) == 0)
  }

  "Calculator divide when fed 5 and 1" should "return 5" in {
    assert(divide(5, 1) == 5)
  }

  "Calculator divide when fed 5 and 0" should "return you cannot divide by 0 silly." in {
    assert(divide(5, 0) == "you cannot divide by zero, silly")
  }

  "Calculator divide when fed 0 and 12773" should "return you cannot divide by 0 silly." in {
    assert(divide(0, 12773) == "you cannot divide by zero, silly")
  }

  "Calculator power when fed 2 and 3" should "should return 8" in {
    assert(power(2, 3) == 8)
  }

  "Calculator power when fed 5 and 1" should "should return 5" in {
    assert(power(5, 1) == 5)
  }

  "Calculator power when fed 7 and 0" should "should return 1" in {
    assert(power(5, 0) == 1)
  }

  "Calculator modulus when fed 13 and 10" should "should return 3" in {
    assert(modulus(13, 10) == 3)
  }

  "Calculator modulus when fed 13 and 2" should "should return 1" in {
    assert(modulus(13, 2) == 1)
  }

}
