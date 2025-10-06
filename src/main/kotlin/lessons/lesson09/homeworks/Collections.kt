package lessons.lesson09.homeworks

fun main() {


// 1. Работа с массивами Array
// 1.1. Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    val array1 = arrayOf(1, 2, 3, 4, 5)

// 1.2. Создайте пустой массив строк размером 10 элементов.
    val array2 = Array(10) { "" }

// 1.3. Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    val array3 = DoubleArray(5)
    for (i in array3.indices) {
        array3[i] = i * 2.0
        println(array3[i])
    }

// 1.4. Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
    val array4 = IntArray(5)
    for (i in array4.indices) {
        array4[i] = i * 3
        println(array4[i])
    }

// 1.5. Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    val array5 = arrayOf<String?> ("value1", null, "value2")

// 1.6. Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    val array6 = arrayOf(5, 9, 2, 3, 0)
    val array6_1 = IntArray(5)
    for (i in array6.indices) {
        array6_1[i] = array6[i]
        println(array6_1[i])
    }

// 1.7. Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого. Распечатайте полученные значения.
    val array7_1 = arrayOf(6, 4, 7)
    val array7_2 = arrayOf(1, 0, 3)
    val array7 = IntArray(3)
    for (i in array7_1.indices) {
        array7[i] = array7_1[i] - array7_2[i]
        println(array7[i])
    }

// 1.8. Создайте массив целых чисел. Найдите индекс элемента со значением 5. Если значения 5 нет в массиве, печатаем -1. Реши задачу через цикл while.
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
// 1.9. Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль. Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    val array9 = arrayOf(6, 3, 6, 5, 0, 7, 3, 8)
    for (i in array9) {
        if (i %2 == 0) {
            println("$i четное")
        }
        else {
            println("$i нечетное")
        }
    }

//    2. Работа со списками List
//    2.1. Создайте пустой неизменяемый список целых чисел.
    val list1 = listOf<Int>()

//    2.2. Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    val list2: List<String> = listOf("Hello", "World", "Kotlin")

//    2.3. Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    val list3: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)

//    2.4. Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    val list4: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    list4.add(6)
    list4.add(7)
    list4.add(8)
    println(list4)

//    2.5. Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    val list5: MutableList<String> = mutableListOf("Hello", "World", "Kotlin")
    list5.remove("World")
    println(list5)

//    2.6. Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    val list6: List<Int> = listOf(7, 9, 0)
    for (i in list6) {
        println(i)
    }

//    2.7. Создайте список строк и получите из него второй элемент, используя его индекс.
    val list7: List<String> = listOf("el1", "el2", "el3", "el4", "el5")
    val element = list7[1]
    println(element)

//    2.8. Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент с индексом 2 на новое значение).
    val list8: MutableList<Int> = mutableListOf(8, 5, 4, 8, 9)
    list8[2] = 0
    println(list8)

//    2.9. Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
    val list9_1 = listOf("a1", "a2", "a3")
    val list9_2 = listOf("b1", "b2", "b3")
    val list9 = mutableListOf<String>()
    for (i in list9_1) {
        list9.add(i)
    }
    for (i in list9_2) {
        list9.add(i)
    }
    println(list9)

//    2.10. Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    val list10 = listOf<Int>(2,5,9,4,5,3)
    var min = list10[0]
    var max = list10[0]
    for (i in list10) {
        if (i < min) {
            min = i
        }
        if (i > max) {
            max = i
        }
    }
    println("Минимальный элемент $min")
    println("Максимальный элемент $max")

//    2.11. Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    val list11_1 = listOf<Int>(4, 9, 0, 6, 7, 5 ,4)
    val list11_2 = mutableListOf<Int>()
    for (i in list11_1) {
        if (i %2 == 0) {
            list11_2.add(i)
        }
    }
    println(list11_2)



    arrayString (arrayOf("a1", "a2", "a3"), "2")
}

// 1.10. Создай функцию, которая принимает массив строк и строку для поиска. Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()). Распечатай найденный элемент.
fun arrayString (array10: Array<String>, arg: String) {
    for (i in array10) {
        if (i.contains(arg)) {
            println(i)
        }
    }
}
