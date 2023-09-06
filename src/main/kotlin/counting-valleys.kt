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
https://www.hackerrank.com/challenges/counting-valleys/problem?isFullScreen=true&h_r=next-challenge&h_v=zen
 * Complete the 'countingValleys' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts following parameters:
 *  1. INTEGER steps
 *  2. STRING path
 */

fun countingValleys(steps: Int, path: String): Int {
    // Write your code here
    var countedValley = 0
    var seaLevel = 0
    path.forEach {
        if (it.equals('U')) {
            if (seaLevel == 0) {
                seaLevel += 1
            }
        } else if (it.equals('D')) {
            if (seaLevel >= 0) {
                seaLevel -= 1
            }
            countedValley += 1
            seaLevel -= 1
        }
    }
    return countedValley
}

fun main(args: Array<String>) {
//    val steps = readLine()!!.trim().toInt()
//    val path = readLine()!!
//    val result = countingValleys(steps, path)

    val result = countingValleys(8, "UDDDUDUU")

    println(result)
}
