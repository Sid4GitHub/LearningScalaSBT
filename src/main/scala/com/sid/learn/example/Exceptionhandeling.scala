package com.sid.learn.example

import com.sid.learn.common.StandardExample

object Exceptionhandeling extends StandardExample{

  override def testExample(): Unit = {
    classLogPrint()
    var a=10
    var b=0
    try{
      a/b
      var arr = Array(1,2)
      arr(10)
    }catch{
      case e: ArithmeticException => println(e)
      case ex: Throwable =>println("found a unknown exception"+ ex)
    }finally {
      println("Finally Blocked Executed")
    }
    println("Block 1 end\nRest of the code is executing...")

    var e = new ExceptionExample4()
    try{
      e.validate()
    }catch{
      case ex : NumberFormatException => println("Exception handeled here")
    }
    println("Rest of the code executing...")
  }
}
class ExceptionExample4{
  @throws(classOf[NumberFormatException])
  def validate()={
    "abc".toInt
  }
}
