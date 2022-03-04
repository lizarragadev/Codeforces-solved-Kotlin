package `0001`

import readLong
import kotlin.math.ceil
import kotlin.math.pow

/*
    Author  :   Gustavo Lizárraga
    Link    :   http://codeforces.com/problemset/problem/1/A
*/

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