import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
 * Complete the 'sockMerchant' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER_ARRAY ar
 */

fun sockMerchant(n: Int, ar: Array<Int>): Int {
    var totalPairOfShock = 0
    val newList = ar.toMutableList()
    newList.sortBy { it }
    var skipNext = false
    for (index in 0 until newList.size - 1) {
        if (skipNext) {
            skipNext = false
            continue
        }
        if (newList[index] == newList[index + 1]) {
            totalPairOfShock++
            skipNext = true
        }
    }

    return totalPairOfShock
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()
    val ar = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    val result = sockMerchant(n, ar)

//    val sample = intArrayOf(10, 20, 20, 10, 10, 30, 50, 10, 20).toTypedArray()
//    val result = sockMerchant(9, sample)

    println(result)
}
