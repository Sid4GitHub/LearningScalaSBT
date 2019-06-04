package com.sid.learn.common

trait StandardExample {
  classLogPrint()
  def testExample():Unit
  def classLogPrint(): Unit = {
    println("\n==================="+this.getClass.getName+"===================\n")
  }
  def printlnl(str:Any):Unit={
    for (i <- 0 until Thread.currentThread.getStackTrace().length) {
      if (Thread.currentThread.getStackTrace()(i).getFileName.contains(this.getClass.getSimpleName.substring(0, this.getClass.getSimpleName.length - 1))&& Thread.currentThread.getStackTrace()(i).getMethodName=="testExample") {
        Console.println("Line No. " + Thread.currentThread.getStackTrace()(i).getLineNumber + " :: " + str)
      }
    }
  }
}
