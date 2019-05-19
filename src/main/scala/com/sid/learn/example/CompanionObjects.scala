package com.sid.learn.example

class CompanionObjects {

  def hello(){
    println("\n==================="+this.getClass.getName+"(Class)===================\n")
    println("Hello, this is Companion Class. ")
  }
  def sayHelloWorld() {
    println("Hello World");
  }
}
object CompanionObjects{

  def callCassInstanceMethod{
    new CompanionObjects().hello()
    println("And this is Companion Object.")
  }
  def sayHi() {
    println("\n==================="+this.getClass.getName+"(Object)===================\n")
    println("Hi! ");
  }
}
