package com.ci3.arms.scenarios

import org.scalatest.junit.{AssertionsForJUnit, JUnitSuite}
import org.junit.Test
import org.ci3.arms.scenarios.Calculator

class TestScenario extends JUnitSuite with AssertionsForJUnit {

  @Test def testPlus() {
    expect(3) {
      Calculator.plus(1, 2)
    }
  }

}
