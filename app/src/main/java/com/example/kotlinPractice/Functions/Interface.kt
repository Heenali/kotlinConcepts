package com.example.kotlinPractice.Functions

fun main()
{

    var classVlaue=BaseClass()
    println(classVlaue.valueInterface)
    classVlaue.getInterface1()
    classVlaue.getInterface2()
}
interface  I1  // You cannot create the instance of interface
{
    var valueInterface:Int
    fun getInterface1()  //Normal methods are public and open by default but NOT FINAL
    {
        println("Base getInterface1")
    }

    //required to override in derived class otherwise give error


}
interface  I2
{
    fun getInterface1()
    fun getInterface2()
}
class BaseClass :I1,I2
{
    override var valueInterface: Int=10

    override fun getInterface1()
     {
         super<I1>.getInterface1()
        println("Drive getInterface1")
     }
    override fun getInterface2()
    {
        println("getInterface2")
    }
}