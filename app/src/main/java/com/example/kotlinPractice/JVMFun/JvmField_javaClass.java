package com.example.kotlinPractice.JVMFun;


public class JvmField_javaClass {

    public static void main(String[] args) {
        // Accessing regular property
        MyFieldClass myFieldClass = new MyFieldClass();
      //  System.out.println("Regular Property: " + myFieldClass.regularProperty);

        // Accessing field property directly as a public field
        System.out.println("Field Property: " + myFieldClass.fieldProperty);
    }
}
