package com.sid.learn.example

import com.sid.learn.common.StandardExample

import scala.collection.mutable

object SetExample extends StandardExample with App {
  testExample()
  override def testExample(): Unit = {
    var s=Set(1,4,4,3)
    // by default immutable
    val s1=scala.collection.mutable.Set(5,6,7)
    val s2=scala.collection.immutable.Set(5,6,7)
    var s3=scala.collection.immutable.Set(5,6,7)
    printlnl(s1++(s))
    printlnl(s.++(s1))
    printlnl(s.min)
    printlnl(s)
    printlnl(s1)
    printlnl(s1+(8))
    printlnl(s+(8))
    printlnl(s)
    printlnl(s1)
    s++=s1

    s1+=(8)
    printlnl(s1)

    val s5=s1
    s1++=s
    printlnl(s5 eq s1)//true
    //s2++=s s2 immutable and val then new reference won't be assigned
    val s4=s3
    s3++=s
    printlnl(s3 eq s4)//false
    printlnl(s)
    printlnl(s1)

    printlnl(s.exists(x=>{x%4==0}))//true
    printlnl(s.forall(x=>{x%1==0}))//true
    printlnl(s.forall(x=>{x%2==0}))//false
    printlnl(s.filter(x=>{x%2==0}))
    printlnl(s1.intersect(s2))    
  }
}
