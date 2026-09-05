package com.example.kotlinPractice

//coroutine

fun main() {

 val india=India()
   //  india.a
    india.b
    india.c
   //  india.d
}
open class person{

    private val a=10//within class or file
    public val b=10//whole
    internal val c=10//within module or project
    protected val d=10//only in subclass

}
open class India:person()
{

    fun display()
    {
        //println(a)
        println(b)
        println(c)
        println(d)
    }
}
class Pakistan:India()
{

    fun display1()
    {
        println(b)
        println(c)
        println(d)
    }

}