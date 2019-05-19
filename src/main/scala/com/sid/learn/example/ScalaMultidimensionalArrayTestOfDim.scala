package com.sid.learn.example

import com.sid.learn.common.StandardExample

object ScalaMultidimensionalArrayTest extends StandardExample{
  override def testExample(): Unit = {
    var arr = Array.ofDim[Int](2,2)          // Creating multidimensional array
    arr(1)(0) = 15                          // Assigning value

    for(i<- 0 to 1){                       // Traversing elements by using loop
      for(j<- 0 to 1){
        print(" "+arr(i)(j))
      }
      println()
    }
    println("Third Element = "+ arr(1)(1))        // Accessing elements by using index

  }
}
