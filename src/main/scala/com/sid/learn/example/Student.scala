package com.sid.learn.example

class Student(id:Int, name:String){
  var age:Int = 0
  def show(){
    println(id+" "+name+" "+age)
  }
  def this(id:Int, name:String,age:Int){
    this(id,name)       // Calling primary constructor, and it is first line
    this.age = age
  }
}