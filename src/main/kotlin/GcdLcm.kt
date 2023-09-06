fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}

fun lcm(a: Int, b: Int): Int {
    return (a * b) / gcd(a, b)
}

fun getTotalX(a: List<Int>, b: List<Int>): Int {
    val lcmA = a.reduce { acc, num -> lcm(acc, num) }
    val gcdB = b.reduce { acc, num -> gcd(acc, num) }

    var count = 0
    var multiple = lcmA
    while (multiple <= gcdB) {
        if (gcdB % multiple == 0) {
            count++
        }
        multiple += lcmA
    }

    return count
}

fun main() {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val a = readLine()!!.split(" ").map { it.toInt() }
    val b = readLine()!!.split(" ").map { it.toInt() }

    val result = getTotalX(a, b)
    println(result)
}
