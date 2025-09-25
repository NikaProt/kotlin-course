package lessons.lesson07.homeworks

fun main() {

    // 1. Напишите цикл for, который выводит числа от 1 до 5.
    for (i in 1..5) {
        println(i)
    }
    println()

    // 2. Напишите цикл for, который выводит четные числа от 1 до 10.
    for (i in 1..10) {
        if (i % 2 == 0) {
            println(i)
        }
    }
    println()

    // 3. Создайте цикл for, который выводит числа от 5 до 1.
    for (i in 5 downTo 1) {
        println(i)
    }
    println()

    // 4. Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
    for (i in 10 downTo 1) {
        var a = i - 2
        println(a)
    }
    println()

    // 5. Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
    for (i in 1..9 step 2) {
        println(i)
    }
    println()


    // 6. Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
    for (i in 1..20 step 3) {
        println(i)
    }
    println()

    // Создайте числовую переменную 'size'. Используйте цикл for с шагом 2 для вывода чисел от 3 до size не включая size.
    var size = 15
    for (i in 3 until size step 2) {
        println(i)
    }
    println()

    // 7. Создайте цикл while, который выводит квадраты чисел от 1 до 5.
    var number = 0
    while (++number <= 5) {
        println(number * number)
    }
    println()

    // 8. Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
    var counter = 10
    while (counter > 5) {
        counter--
        println(counter)
    }
    println()

    // 9. Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.
    for (i in 1..10) {
        if (i == 6) break
        println(i)
    }
    println()

    // 10. Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.
    var number1 = 1
    while (true) {
        println(number1)
        if (number1 == 10) {
            break
        }
        number1++
    }
    println()

    // 11. В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.
    for (i in 1..10) {
        if (i % 2 == 0) continue
        println(i)
    }
    println()

    // 12. Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.
    var number2 = 1
    while (number2 <= 10) {
        if (number2 % 3 == 0) {
            number2++
            continue
        }
        println(number2)
        number2++
    }
    println()


// Задача повышенной сложности (разбирается отдельно от основной домашки и награждается отдельным стимом за разбор).
// Её выполнять по желанию, проверка не выполняется.

// 1. Используя вложенный цикл реализовать таблицу умножения, как на картинке.

    for (a in 1..10) {
        for (b in 1..10) {
            val c = a * b
            print("$c ")
        }
        println()
    }
    println()



    sum1(5)
    factorial(3)
    evenSum(6)
    rectangle(5, 3)
    sumEvenOdd(5)
}

// 2. Напишите функцию, которая суммирует числа от 1 до 'arg' с помощью цикла for. 'arg' - целочисленный аргумент функции.
    fun sum1(arg: Int) {
    var num = 0
        for (i in 1..arg) {
            num += i
        }
    println(num)
    println()
    }

// 3. Напишите функцию, которая вычисляет факториал числа 'arg' с использованием цикла while.
    fun factorial (arg: Int) {
        var num = 1
        for (i in 1..arg) {
            num *= i
        }
    println(num)
    println()
    }


// 4. Напишите функцию, которая находит сумму всех четных чисел от 2 до 'arg', используя цикл while.
    fun evenSum (arg: Int) {
        var num = 2
        var numSum = 0
        while (num <= arg) {
            if (num % 2 == 0) {
                numSum += num
            }
            num++
        }
    println(numSum)
    println()
    }

// 5. Напишите функцию, которая используя вложенные циклы while, выведет заполненный прямоугольник размером 5x3 из символов *.
    fun rectangle (a: Int, b: Int) {
        var width = 0
        while (width < b) {
            var height = 0
            while (height < a) {
                print("* ")
                height++
            }
            println()
            width++
        }
    println()
    }

// 6. Напишите функцию, которая используя цикл for найдёт суммы чётных и нечётных значений чисел от 1 до arg.
    fun sumEvenOdd (arg: Int) {
    var sumEven = 0
    var sumOdd = 0
    for (i in 1..arg) {
        if (i % 2 == 0) {
            sumEven += i
        } else {
            sumOdd += i
        }
    }
    println(sumEven)
    println(sumOdd)
    }








