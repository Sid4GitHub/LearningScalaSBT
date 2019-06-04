package com.sid.learn.example

import com.sid.learn.common.StandardExample

object CompanionObjectsTest extends StandardExample{
  override def testExample(): Unit = {
    CompanionObjects.sayHi()
    CompanionObjects.callCassInstanceMethod
    val companionObjects:CompanionObjects=new CompanionObjects()
    companionObjects.hello()
    companionObjects.sayHelloWorld()
  }
}
