package com.sid.learn.example

class ThisPointerExample {
  var id:Int = 0
  var name: String = ""
  def this(id:Int, name:String){
    this()
    this.id = id
    this.name = name
  }
  def show(){
    println(id+" "+name)
  }
}
