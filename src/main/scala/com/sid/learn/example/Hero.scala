package com.sid.learn.example

class Hero(a:Int) extends AbsBike(a){
  c = 30
  def run(){
    println("Running fine...")
    println("a = "+a)
    println("b = "+b)
    println("c = "+c)
  }
}
