package com.sid.learn.example

import com.sid.learn.common.StandardExample

object FunctionCurrying extends StandardExample{

  override def testExample(): Unit ={

    var result = add(10)(10)
    println("10 + 10 = "+result)
    var addIt = add(10)_
    var result2 = addIt(3)
    printlnl("10 + 3 = "+result2)

  }
  def add(a:Int)(b:Int) = {
    a+b
  }
}
