package com.example.kotlinPractice.codingRound
/*Original list: [1, 2, 3, 2, 4, 5, 6, 1, 7, 8, 9, 7]
Unique elements: [1, 2, 3, 4, 5, 6, 7, 8, 9]*/


fun findUniqueElements(inputList: List<Int>): List<Int> {
    val uniqueElements = mutableListOf<Int>()
    for (i in 0 until  inputList.size-1)
    {
        if(!uniqueElements.contains(inputList[i])){
            uniqueElements.add(inputList[i])
        }
    }

   /* for (element in inputList) {
        if (seenElements.add(element)) {
            uniqueElements.add(element)
        }
    }*/

    return uniqueElements
}
/*fun findUniqueElements(inputList: List<Int>): List<Int> {
    return inputList.distinct()
}*/

fun main() {
    val originalList = listOf(1, 2, 3, 2, 4, 5, 6, 1, 7, 8, 9, 7)
    val uniqueElements = findUniqueElements(originalList)

    println("Original list: $originalList")
    println("Unique elements: $uniqueElements")
}

fun sort(list:MutableList<Int>)
{
    var ss= mutableSetOf<Int>()
    for(i in list)
    {
        ss.add(i)
    }

}