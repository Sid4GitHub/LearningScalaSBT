package com.sid.learn.example

import com.sid.learn.common.StandardExample

import scala.collection.mutable
import scala.io.Source

object BitSetExample extends StandardExample{
  override def testExample(): Unit = {
    var bitSetNumbers = mutable.BitSet(1,5,8,6,9,0)
    var setNumbers = mutable.Set(1,5,8,6,9,0)
    println("----------------------------------------")
    setNumbers.foreach(println)
    println("----------------------------------------")
    setNumbers+=10
    setNumbers.foreach(println)
    println("----------------------------------------")
    setNumbers-=6
    setNumbers.foreach(println)
    //Source.fromFile()
  }
}
