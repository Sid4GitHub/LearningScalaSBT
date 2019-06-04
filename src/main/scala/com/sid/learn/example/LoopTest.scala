package com.sid.learn.example

import com.sid.learn.common.StandardExample

object LoopTest extends StandardExample{

  override def testExample(): Unit ={
    functionExample(25, multiplyBy2)                   // Passing a function as parameter
  }
  def functionExample(a:Int, f:Int=>AnyVal):Unit = {
    println(f(a))                                   // Calling that function
  }
  def multiplyBy2(a:Int):Int = {
    a*2
  }
}
