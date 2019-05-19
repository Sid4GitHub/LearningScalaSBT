package com.sid.learn.example

import com.sid.learn.common.StandardExample

object ScalaArrayTest extends StandardExample{
  override def testExample(): Unit = {
    /*var arrayName : Array[arrayType] = new Array[arrayType](arraySize);   or
    var arrayName = new Array[arrayType](arraySize)  or
    var arrayName : Array[arrayType] = new Array(arraySize);   or
    var arrayName = Array(element1, element2 ? elementN)*/
    var arr = Array(1,2,3,4,5)
    arr.foreach((element:Int)=>println(element))       // Iterating by using foreach loop
  }
}
