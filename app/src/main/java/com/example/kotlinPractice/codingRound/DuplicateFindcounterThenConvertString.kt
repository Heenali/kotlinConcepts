package com.example.kotlinPractice.codingRound
//  val array = listOf<Int>(2, 3, 4, 11, 20, 1, 15, 9, 2, 4, 11, 3, 2)
//{2=3, 3=2, 4=2, 11=2}

fun main() {

    val myString="heenalilakhani"

    val array=myString.toCharArray()

    val duplicateCountMap = mutableMapOf<Char, Int>()

    for (number in array.indices)
    {
        if(duplicateCountMap.containsKey(array[number]))
        {
            var s=duplicateCountMap.get(array[number])
            if(s!=null)
            {
                duplicateCountMap.put(array[number],s+1)
            }

        }
        else
            duplicateCountMap.put(array[number],1)
    }
    val stringBuilder = StringBuilder()

    duplicateCountMap.forEach { (key, value) ->
        if(value==1)
            stringBuilder.append("$key")
        else
            stringBuilder.append("$key$value")
    }

    val hashMapString = stringBuilder.toString()
    println(hashMapString)
}

fun main1()
{
    val myString="Anill"
    var maps= hashMapOf<Char,Int>()
    for(i in myString)
    {

        if(maps.containsKey(i))
        {
            maps[i]=maps[i]!!+1
        }
        else
            maps[i]=1

    }
    maps.forEach {

        if(it.value==1)
            print("${it.key}")
        else
            print("${it.key}${it.value}")
    }
}

