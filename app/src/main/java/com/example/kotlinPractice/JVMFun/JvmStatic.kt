package com.example.kotlinPractice.JVMFun

class MyStaticClass {

    companion object {

        // Regular non-static method
        fun nonStaticMethod() {
            println("This is a non-static method")
        }

        // Static method using @JvmStatic
        @JvmStatic
        fun staticMethod() {
            println("This is a static method")
        }
    }
}
fun main() {
    // Calling non-static method
    MyStaticClass.nonStaticMethod()

    // Calling static method
    MyStaticClass.staticMethod()
}


