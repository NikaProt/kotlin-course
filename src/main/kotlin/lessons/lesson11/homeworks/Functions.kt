package lessons.lesson11.homeworks

fun main() {
    println(multiplyByTwo(5))
    println(isEven(7))
    printNumbersUntil(5)
    println(findFirstNegative(listOf(5, 6, -3, 3, -1)))
    processList(listOf("cat", null, "dog"))
}

//  1. Задачи на сигнатуру метода
//  1.1. Не принимает аргументов и не возвращает значения.
    fun example1() {

    }

//  1.2. Принимает два целых числа и возвращает их сумму.
    fun example2 (a: Int, b: Int): Int {
        return a + b
    }

//  1.3. Принимает строку и ничего не возвращает.
    fun example3 (arg: String) {

    }

//  1.4. Принимает список целых чисел и возвращает среднее значение типа Double.
    fun example4 (arg: List<Int>): Double {
        return 2.0
    }

//  1.5. Принимает nullable строку и возвращает её длину в виде nullable целого числа и доступна только в текущем файле.
    private fun example1 (arg: String?): Int? {
        return arg?.length
    }

//  1.6. Не принимает аргументов и возвращает nullable вещественное число.
    fun example6 (): Double? {
        return null
    }
//  1.7. Принимает nullable список целых чисел, не возвращает значения и доступна только в текущем файле.
    private fun example7 (arg: List<Int>?) {

    }

//  1.8. Принимает целое число и возвращает nullable строку.
    fun example8 (arg: Int): String? {
        return "Hello"
    }

//  1.9. Не принимает аргументов и возвращает список nullable строк.
    fun example9 (): List<String>? {
        return listOf("a", "b", "c")
    }

//  1.10. Принимает nullable строку и nullable целое число и возвращает nullable булево значение.
    fun example10 (a: String?, b: Int?): Boolean? {
        return true
    }

//  2. Задачи на написание кода
//  Напишите валидную сигнатуру метода а так же рабочий код для задач.
//
//  2.1. Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
    fun multiplyByTwo (x: Int): Int {
        return x * 2
    }

//  2.2. Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
    fun isEven (x: Int): Boolean {
        return if (x %2 == 0) {
            true
        } else false
    }

//  2.3. Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
//       Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
    fun printNumbersUntil (n: Int) {
    if (n < 1) {
        return
    } else {
        for (x in 1..n) {
            println(x)
        }
    }
}


//  2.4. Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает
//       первое отрицательное число в списке. Если отрицательных чисел нет, функция должна вернуть null.
    fun findFirstNegative (arg: List<Int>): Int? {
        for (i in arg) {
            if (i < 0) {
                return i
            }
        }
        return null
    }

//  2.5. Напишите функцию processList, которая принимает список строк.
//       Функция должна проходить по списку и выводить каждую строку. Если встречается null значение,
//       функция должна прекратить выполнение с помощью return без возврата значения.
    fun processList (arg: List<String?>) {
        for (i in arg) {
            if (i == null){
                return
            } else {
                println(i)
            }
        }
    }