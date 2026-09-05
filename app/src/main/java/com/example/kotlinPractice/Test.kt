package com.example.kotlinPractice

fun main()
{
    var d=ClassB()
    d.bar()

    var c=ClassC()
    c.bar()
    c.foo()

}
open class ClassA {
    open fun foo() {
        println("Foot")
    }
    open fun bar(): Int {
        println("bar")
        return 0
    }
}
//composition example ...composition is loosely coupled
class ClassB {
    var classA=ClassA()
    fun bar() {
        classA.foo()
        classA.bar()
    }
}

//inheritance example...Inheritance is tightly coupled

class ClassC: ClassA()
{
    override fun foo() {
        super<ClassA>.foo()
    }
    override fun bar(): Int {
        super<ClassA>.bar()
        return 0
    }
}