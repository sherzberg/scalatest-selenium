package com.ci3.arms.specs

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import java.util
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.selenium.HtmlUnit

@RunWith(classOf[JUnitRunner])
class TestSpec extends FlatSpec with ShouldMatchers with HtmlUnit {

  "The blog app home page" should "have the correct title" in {
    go to ("http://google.com")
    pageTitle should be ("Google")
  }

  "A Stack" should "pop values in last-in-first-out order" in {
    val stack = new util.Stack[Int]
    stack.push(1)
    stack.push(2)
    assert(stack.pop() === 2)
    assert(stack.pop() === 1)
  }

}