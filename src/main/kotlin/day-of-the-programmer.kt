import kotlin.io.*
import kotlin.text.*

/*
 * Complete the 'dayOfProgrammer' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts INTEGER year as parameter.
 */

/**
 * https://www.hackerrank.com/challenges/day-of-the-programmer/problem?isFullScreen=true
 */

fun dayOfProgrammer(year: Int): String {
    val isJulian = year < 1919
    val month = "09"

    if (isJulian) {

        if (year == 1918) {
            val febOneFour = 32
            val dayDiff = 256 - 198 - febOneFour

            return "$dayDiff.$month.$year"
        }

        return if (year % 4 == 0) "12.$month.$year" else "13.$month.$year"
    }

    return when {
        year % 400 == 0 -> "12.$month.$year"
        year % 4 == 0 && year % 100 != 0 -> "12.$month.$year"
        else -> "13.$month.$year"
    }
}

fun main(args: Array<String>) {
    val year = readLine()!!.trim().toInt()

    val result = dayOfProgrammer(year)

    println(result)
}
