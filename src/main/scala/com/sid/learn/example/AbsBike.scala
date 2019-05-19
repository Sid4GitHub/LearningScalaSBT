package com.sid.learn.example

abstract class AbsBike(a:Int){             // Creating constructor
  var b:Int = 20                      // Creating variables
  var c:Int = 25
  def run()                           // Abstract method
  def performance(){                  // Non-abstract method
    println("Performance awesome")
  }
}