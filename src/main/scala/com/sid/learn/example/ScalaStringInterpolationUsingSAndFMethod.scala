package com.sid.learn.example

import com.sid.learn.common.StandardExample

object ScalaStringInterpolationUsingSAndFMethod extends StandardExample{
  override def testExample(): Unit = {
    classLogPrint()
    var s1 = "Scala string example"
    println(s"This is $s1")

    s1 = "Scala string example"
    var version = 2.1273488
    println(f"This is $s1%s, scala version is $version%2.2f")

    var s2=raw"sid \n bhhj"
    var s3="sid \n bhhj"
    println(s2)
    println(s3)
    println(s2.getClass)
    println(s3.getClass)
    println(s2.getBytes().map(x=>{x.toChar}).mkString(","))
    println(s3.getBytes().map(_.toChar).mkString(","))
  }
}
