package com.sid.learn.example

import com.sid.learn.common.StandardExample

object CaseClassTest extends StandardExample{
 // trait SuperTrait
  case class CaseClass1(a:Int,b:Int) //extends SuperTrait
  case class CaseClass2(a:Int) //extends SuperTrait         // Case class
  case object CaseObject //extends SuperTrait               // Case object
  override def testExample(): Unit = {
    callCase(CaseClass1(10,10))
    callCase(CaseClass2(10))
    callCase(CaseObject)
  }
  def callCase(f:Any) = f match{
    case CaseClass1(f,g)=>println("a = "+f+" b ="+g)
    case CaseClass2(f)=>println("a = "+f)
    case CaseObject=>println("No Argument")
    case _=>throw new IllegalArgumentException
  }

}
