package com.example.kotlinPractice.JVMFun

class MyFieldClass {

    // Regular property
    var regularProperty: String = "Regular Property"

    // Property exposed as a public field using @JvmField
    @JvmField
    var fieldProperty: String = "Field Property"
}
