package com.sid.learn.example

import com.sid.learn.common.StandardExample

object FunctionWithVariableLengthParameters extends StandardExample{
  override def testExample(): Unit = {
    classLogPrint()
    var sum = add(1,2,3,4,5,6,7,8,9);
    println(sum);
  }

  def add(args: Int*) = {
    var sum = 0;
    println(args.getClass)
    for(a <- args) sum+=a
    sum
  }
  def add(b:String,args: Int*) = {
    var sum = 0;

    for(a <- args) sum+=a
    sum
  }
}
