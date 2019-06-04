package com.sid.learn.example

import com.sid.learn.common.StandardExample

object NestedFunctions extends StandardExample{

  override def testExample(): Unit ={
    var result = add(10,10,10)
    println(result)

  }
  def add(a:Int, b:Int, c:Int) = {
    def add2(x:Int,y:Int) = {
      x+y
    }
    add2(a,add2(b,c))
  }
}
