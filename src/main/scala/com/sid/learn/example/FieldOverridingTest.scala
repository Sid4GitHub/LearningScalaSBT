package com.sid.learn.example

import com.sid.learn.common.StandardExample

class Vehicle{
  val speed:Int = 60//Should be val in both level

}
class Bike extends Vehicle{
  override val speed:Int = 100     // Override keyword
  def show(){
    println(speed)
  }
}

object FieldOverridingTest extends StandardExample{

  override def testExample(): Unit = {
    var b = new Bike()
    b.show()
  }

}
