package lessons.lesson09.homeworks

fun main() {


// Работа с массивами Array
// 1. Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val array1 = arrayOf(1, 2, 3, 4, 5)

// 2. Создайте пустой массив строк размером 10 элементов.
    val array2 = Array(10) { "" }

// 3. Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val array3 = DoubleArray(5)
    for (i in array3.indices) {
        array3[i] = i * 2.0
        println(array3[i])
    }

// 4. Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
    val array4 = IntArray(5)
    for (i in array4.indices) {
        array4[i] = i * 3
        println(array4[i])
    }

// 5. Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val array5 = arrayOf<String?> ("value1", null, "value2")

// 6. Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val array6 = arrayOf(5, 9, 2, 3, 0)
    val array6_1 = IntArray(5)
    for (i in array6.indices) {
        array6_1[i] = array6[i]
        println(array6_1[i])
    }

// 7. Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого. Распечатайте полученные значения.
    val array7_1 = arrayOf(6, 4, 7)
    val array7_2 = arrayOf(1, 0, 3)
    val array7 = IntArray(3)
    for (i in array7_1.indices) {
        array7[i] = array7_1[i] - array7_2[i]
        println(array7[i])
    }

// 8. Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1. Реши задачу через цикл while.
    val array8 = arrayOf(4 , 6 , 5 , 9 , 3)
    var index = 0
    while (index < array8.size) {
        if (array8[index] == 5) {
            println(index)
            break
        }
        index++
    }
        if (index == array8.size) {
            println(-1)
        }
// 9. Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    val array9 = arrayOf(6, 3, 6, 5, 0, 7, 3, 8)
    for (i in array9) {
        if (i %2 == 0) {
            println("$i четное")
        }
        else {
            println("$i нечетное")
        }
    }

    arrayString (arrayOf("a1", "a2", "a3"), "3")
}

// 10. Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()). Распечатай найденный элемент.
fun arrayString (array10: Array<String>, arg: String) {
    for (i in array10) {
        if (i.contains(arg)) {
            println(i)
        }
    }
}