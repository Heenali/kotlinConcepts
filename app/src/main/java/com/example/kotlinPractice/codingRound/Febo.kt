/*
Fibonacci Series up to 100: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89
*/
/*0, 1,1,2,3,5,8,13,21,34,55,89,*/
fun main() {
    val n = 100
    var t1 = 0
    var t2 = 1

   // print("Upto $n: ")
    while (t1 <= n) {
        print("$t1 , ")

        val sum = t1 + t2
        t1 = t2
        t2 = sum
    }
}

fun generateFibonacciSeries(limit: Int): List<Int> {
    val series = mutableListOf(0, 1)
    while (true) {
        val nextValue = series[series.size - 1] + series[series.size - 2]
        if (nextValue > limit) break
        series.add(nextValue)
    }
    return series
}

