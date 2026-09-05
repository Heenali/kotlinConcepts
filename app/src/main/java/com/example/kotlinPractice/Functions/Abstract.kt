package com.example.kotlinPractice.Functions

abstract class Abstract {
    //not create instance of class
    //abstract methods is default open

    fun getAbstarct1()
    {
        println("getAbstarct1")
    }
    abstract var valueData:Int//default open
    abstract fun getAbstarct2()

}
class baseClass :Abstract()
{
     override var valueData: Int=10
    override fun getAbstarct2() {
        println("getAbstarct1")
    }

}
fun  main()
{
    var value=baseClass()
    value.getAbstarct1()
    value.getAbstarct2()

}