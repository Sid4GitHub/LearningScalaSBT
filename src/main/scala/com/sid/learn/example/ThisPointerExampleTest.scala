package com.sid.learn.example

import com.sid.learn.common.StandardExample


object ThisPointerExampleTest extends StandardExample{
  override def testExample(): Unit = {
    classLogPrint()
    var t = new ThisPointerExample(101,"Martin")
    t.show()
  }
}
