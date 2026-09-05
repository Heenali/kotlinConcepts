package com.example.kotlinPractice.JVMFun;


public class JvmStatic_javaClass {

    public static void main(String[] args) {
        // Calling static method from Kotlin class
        MyStaticClass.staticMethod();

        // Without @JvmStatic, you need to access the method through the companion object
        MyStaticClass.Companion.nonStaticMethod();
    }
}

