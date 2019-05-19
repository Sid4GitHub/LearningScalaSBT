package com.sid.learn.common

trait StandardExample {
  def testExample():Unit
  def classLogPrint(): Unit = {
    println("\n==================="+this.getClass.getName+"===================\n")
  }

}
