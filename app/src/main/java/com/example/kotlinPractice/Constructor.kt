package com.example.kotlinPractice


fun main() {

    var a=student("Heenali",20)

    println("Student name as ${a.age} and age is ${a.name}")

}

class student(var name:String)
{
    var age:Int=0
    init {
        println("Student name as $name and age is $age")
    }
    constructor(name:String,age:Int):this(name)
    {
        this.age=age
    }

}

