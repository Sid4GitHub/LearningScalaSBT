package com.sid.learn.example

import com.sid.learn.common.StandardExample

class InvalidAgeException(s:String) extends Exception(s){}
class ExceptionExample{
  @throws(classOf[InvalidAgeException])
  def validate(age:Int){

    if(age<18){
      throw new InvalidAgeException("Not eligible")
    }else{
      println("You are eligible")
    }
  }
}

object ScalaCustomException extends StandardExample{
  override def testExample(): Unit = {
    var e = new ExceptionExample()
    try{
      e.validate(5)
    }catch{
      case e : Exception => println("Exception Occured : "+e)
    }
  }
}
