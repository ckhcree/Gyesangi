package org.example

class Calculator {
    var num1: Int = 0
    var num2: Int = 0
    val op: String = ""

    fun Sum(): Int {
        val plus = num1 + num2
        return plus
    }


    fun Sub(): Int {
        val minus = num1 - num2
        return minus
    }

    fun Multi(): Int {
        val star = num1 * num2
        return star
    }

    fun Div(): Int {
        val div = num1 / num2
        return div
    }

    fun Rem(): Int {
        val rem = num1 % num2
        return rem
    }
}

fun main() {

    println("첫번째 정수 입력")
    val a = readLine()!!.toInt()
    println("사칙연산 연산자 입력")
    val operator = readLine().toString()
    println("두번째 정수 입력")
    val b = readLine()!!.toInt()

    println("${a} ${operator} ${b} =")
    val result = Calculator()

    result.num1 = a
    result.num2 = b

    result.Sum()
    result.Sub()
    result.Multi()
    result.Div()
    result.Rem()

    when (operator) {
        "+" -> {
            println(result.Sum())
        }

        "-" -> {
            println(result.Sub())
        }

        "*" -> {
            println(result.Multi())
        }

        "/" -> {
            println(result.Div())
        }

        "%" -> {
            println(result.Rem())
        }
    }
}