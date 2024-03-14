package org.example

fun main(args: Array<String>) {
    val pares = arrayListOf(2, 4, 6)
    val impares = arrayListOf(1, 3, 5)

    for (n in impares.union(pares).sorted()) {
        print("$n ")
    }
}