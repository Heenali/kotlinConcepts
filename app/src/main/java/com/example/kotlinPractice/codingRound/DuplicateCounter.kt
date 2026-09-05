package com.example.kotlinPractice.codingRound
//  val array = listOf<Int>(2, 3, 4, 11, 20, 1, 15, 9, 2, 4, 11, 3, 2)
//{2=3, 3=2, 4=2, 11=2}

fun main() {
    val array = listOf<Int>(1,2,3,4,5,1,3,5,8)

    val duplicateCountMap = mutableMapOf<Int, Int>()


 /*   for (number in array.indices) {

        if(duplicateCountMap.containsKey(array.get(number)))
        {
            var s=duplicateCountMap.get(array.get(number))
            if (s != null) {
                duplicateCountMap.put(array.get(number),s+1)
            }
        }
        else
            duplicateCountMap.put(array.get(number),1)

    }*/

    for (number in array) {
      //  Log.e("dd",array.get(number).toString())
        if (duplicateCountMap.containsKey(number)) {
            duplicateCountMap[number] = duplicateCountMap[number]!! + 1
        } else {
            duplicateCountMap[number] = 1
        }

    }

    val result = duplicateCountMap.filter { it.value > 1 }

    println(result)
}
