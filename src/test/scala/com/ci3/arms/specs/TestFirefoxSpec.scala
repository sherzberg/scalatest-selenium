package com.ci3.arms.specs

import org.scalatest.FlatSpec
import org.scalatest.matchers.ShouldMatchers
import java.util
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.selenium.{Firefox, HtmlUnit}

@RunWith(classOf[JUnitRunner])
class TestFirefoxSpec extends FlatSpec with ShouldMatchers with Firefox {

  "The blog app home page" should "have the correct title" in {
    go to ("http://google.com")
    pageTitle should be ("Google")
    textField("gbqfq").value = "Cheese!"
    submit()
    close()
  }

}