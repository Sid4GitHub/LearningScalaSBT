package com.sid.learn.example

import com.sid.learn.common.StandardExample

object AbstractClassTest extends StandardExample{
  override def testExample(): Unit = {
    classLogPrint()
    var h = new Hero(10)
    h.run()
  }
}
