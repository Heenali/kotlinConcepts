package com.example.kotlinPractice.JVMFun;


public class JvmOverloads_JavaClass {

    public static void main(String[] args) {

        MyOverloadsClass myOverloadsClass = new MyOverloadsClass();

        // Calling with both parameters
        myOverloadsClass.printMessage("Hello", 3);

        // Calling with only one parameter (using default value for the second parameter)
        myOverloadsClass.printMessage();
    }
}