package com.sid.learn.example

import com.sid.learn.common.StandardExample

object StudentClassTest extends StandardExample{

  override def testExample(): Unit = {
    classLogPrint()
    var s1 = new Student(100,"Martin")   // Passing values to constructor
    s1.show()                // Calling a function by using an object
    var s2 = new Student(100,"Martin",10)   // Passing values to constructor
    s2.show()
  }
}
