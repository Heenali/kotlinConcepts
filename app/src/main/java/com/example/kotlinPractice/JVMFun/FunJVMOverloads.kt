package com.example.kotlinPractice.JVMFun

fun  main()
{
   val result= MyOverloadsClass()
    result.printMessage("Hello",2)
    result.printMessage()
}

class MyOverloadsClass {
    @JvmOverloads
    fun printMessage(message: String = "Default Message", count: Int = 1) {
        repeat(count) {
            println(message)
        }
    }
}




