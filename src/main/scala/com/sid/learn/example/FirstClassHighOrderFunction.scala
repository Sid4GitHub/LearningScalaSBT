package com.sid.learn.example

import com.sid.learn.common.StandardExample

object FirstClassHighOrderFunction extends StandardExample {

  override def testExample(): Unit ={
    classLogPrint()
    val a= -5 to 5
    println(a.mkString(", "))
    a.map(x=>{getOps(x)(x)+", "}).foreach(print(_))
  }

  def getOps(i: Int) :Int => Int ={
    val d=(x:Int)=>{x*2}:Int
    val t=(x:Int)=>{x*3}:Int
    if (i>0) return d
    else return t
  }

}
