package `0001`

import readInt
import readLong
import kotlin.math.ceil
import kotlin.math.pow

fun main() {
    val n = readLong()
    val m = readLong()
    val a = readLong()
    if(n in 1..10.toDouble().pow(9.toDouble()).toInt() &&
        m in 1..10.toDouble().pow(9.toDouble()).toInt() &&
        a in 1..10.toDouble().pow(9.toDouble()).toInt()) {
        println((ceil(n.toDouble().div(a)) * ceil(m.toDouble().div(a))).toLong())
    }
}