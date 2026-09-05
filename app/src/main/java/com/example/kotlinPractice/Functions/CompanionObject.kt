package com.example.kotlinPractice.Functions


class CompanionObject {

    companion object
    {
        var v1=10
        fun getData()
        {
            println("DATA/////")
        }
    }
}
fun main()
{
    CompanionObject.getData()
    println(CompanionObject.v1)
}