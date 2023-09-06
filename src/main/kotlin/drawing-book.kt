import java.io.*
import java.lang.Math.abs
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
import kotlin.math.min
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
https://www.hackerrank.com/challenges/drawing-book/problem?isFullScreen=true
 * Complete the 'pageCount' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER n
 *  2. INTEGER p
 */

fun pageCount(n: Int, p: Int): Int {
     return min(p / 2, n / 2 - p / 2)
}

fun main(args: Array<String>) {
//    val n = readLine()!!.trim().toInt()
//    val p = readLine()!!.trim().toInt()
//    val result = pageCount(n, p)

    val result = pageCount(5, 4)

    println(result)
}
