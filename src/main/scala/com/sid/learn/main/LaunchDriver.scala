package com.sid.learn.main

import com.sid.learn.example.{CompanionObjects, _}

object LaunchDriver {
  def main(args : Array[String]): Unit = {
    //println("----------------------Driver----------------------\n\n")

    FirstClassHighOrderFunction.testExample()

    LoopTest.testExample()

    FunctionCurrying.testExample()

    NestedFunctions.testExample()

    NestedFunctions.testExample()

    FunctionWithVariableLengthParameters.testExample()
    StudentClassTest.testExample()
    CompanionObjectsTest.testExample()
    CaseClassTest.testExample()
    StudentClassTest.testExample()
    ThisPointerExampleTest.testExample()
    TraitLinearizationOrMethodResolutionOrder.testExample()
    FieldOverridingTest.testExample()
    AbstractClassTest.testExample()
    ScalaArrayTest.testExample()
    ScalaMultidimensionalArrayTest.testExample()
    ScalaStringInterpolationUsingSAndFMethod.testExample()
    Exceptionhandeling.testExample()
    ScalaCustomException.testExample()
    BitSetExample.testExample()
    SetExample.testExample()
  }
}
