package com.example.tester48

class Math {

    fun add(a: String, b: String): String {
        var c = ""
        if (a.contains("-") || b.contains("-")) {
            c = "Нельзя закидывать отрицательное"
        } else if (a.contains(".") || b.contains(".")) {
            var num1 = a.toDouble()
            var num2 = b.toDouble()
            c = (num1 + num2).toString()
        } else if (!isNumeric(a) || !isNumeric(b)) {
            c = "Нельзя вводить буквы"
        } else {
            var num1 = a.toInt()
            var num2 = b.toInt()
            c = (num1 + num2).toString()
        }
        return c
    }

    fun minus(a: String, b: String): String {
        var c = ""
        var num1 = a.toInt()
        var num2 = b.toInt()
        c = (num1 - num2).toString()
        return c
    }

    fun isNumeric(str: String) = str.all { it in '0'..'9' }

    fun divide(a: String, b: String): String {
        var c = ""
        if (b == "0") {
            c = "Делить на ноль нельзя"
        } else {
            var num1 = a.toInt()
            var num2 = b.toInt()
            c = (num1 / num2).toString()
        }
        return c
    }
}
