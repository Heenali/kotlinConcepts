package com.example.kotlinPractice.Functions


sealed class Sealed
{
    open class circle(v1:Int): Sealed()
    data class rec(val v1:Int):Sealed()
    sealed class tri(v1:Int):Sealed()
    object Squ:Sealed()
}
data class rec(val v1:Int):Sealed()
{

}
fun processShape(shape: Sealed) {
    when (shape) {
        is Sealed.circle -> println("Processing a circle")
        is Sealed.Squ -> println("Processing a square")
        is Sealed.tri -> println("Processing a triangle")
        else -> {}
    }
}
fun main()
{
    processShape(Sealed.Squ)

}