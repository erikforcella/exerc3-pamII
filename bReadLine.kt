package org.example

fun main(args: Array<String>) {
    println("Digite o primeiro número: ")
    val X  = readLine()!!.toInt()

    println("Digite o segundo número: ")
    val Y  = readLine()!!.toInt()

    val resultado = multiplica(X, Y)
    println("O resultado da multiplicação é = $resultado")
}

fun multiplica(X: Int, Y: Int): Int {
    return X * Y;
}