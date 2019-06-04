package com.sid.learn.example

import com.sid.learn.common.StandardExample


object TraitLinearizationOrMethodResolutionOrder extends StandardExample{
  override def testExample(): Unit = {

    println((new A).op)
    println((new B).op)
  }
  trait Base {
    def op: String
  }

  trait Foo extends Base {
    override def op = "foo"
  }

  trait Bar extends Base {
    override def op = "bar"
  }

  class A extends Foo with Bar
  class B extends Bar with Foo


}
