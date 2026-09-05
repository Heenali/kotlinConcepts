package com.example.kotlinPractice

//main difference between nested and inner classes in Kotlin is that
// inner classes have access to the members of the outer class and
// require an instance of the outer class for instantiation. Nested classes,
// on the other hand, are independent of the outer class and do not have direct access to its members
fun main()
{
    //
    var mainClass=MainClass()
    mainClass.getMainClass()

    var mainClass1=MainClass1()
    mainClass1.getMainClass1()

    //to create nested class instance required mainclass name
    var nestedClass=MainClass.NestedClass()
    nestedClass.getNestedClass()

    //to create inner class instance required mainclass instance
    var nestedClass1=mainClass1.NestedClass1()
    nestedClass1.getNestedClass1()
}

class MainClass
{
    class NestedClass
    {
        fun getNestedClass()
        {
            println("getNestedClass")
        }
    }

    fun getMainClass()
    {
        println("getMainClass")
    }
}



class MainClass1
{
    inner class NestedClass1
    {
         fun getNestedClass1()
        {
            println("getNestedClass")
        }
    }

    fun getMainClass1()
    {
        println("getMainClass")
    }
}