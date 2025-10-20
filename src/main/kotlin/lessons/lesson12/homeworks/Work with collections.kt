package lessons.lesson12.homeworks

fun main() {

//    Задачи на приведение коллекции к значению

    val collection = listOf<Int>(12, 3, -4, 9, 0, -2, 2, 9, 24)

//    1. Проверить, что размер коллекции больше 5 элементов.
    if (collection.size > 5) {

    }

//    2. Проверить, что коллекция пустая
    if (collection.isEmpty()) {

    }
//    3. Проверить, что коллекция не пустая
    if (collection.isNotEmpty()) {

    }
//    4. Взять элемент по индексу или создать значение если индекса не существует
    val elIndex = collection.getOrElse(30) {"Not found"}
    println(elIndex)

//    5. Собрать коллекцию в строку
    val sttingCollection = collection.joinToString (";" )
    println(sttingCollection)

//    6. Посчитать сумму всех значений
    println(collection.sum())

//    7. Посчитать среднее
    val av = collection.average()
    println(av)

//    8. Взять максимальное число
    val max = collection.maxOrNull()
    println(max)

//    9. Взять минимальное число
    val min = collection.minOrNull()
    println(min)
//    10. Взять первое число или null
    val firstNumber = collection.firstOrNull()

//    11. Проверить что коллекция содержит элемент
    val element = collection.contains(4)


//    Задачи на обработку коллекций
//    12. Отфильтровать коллекцию по диапазону 18-30
    val range = collection.filter { it in 18..30 }

//    13. Выбрать числа, которые не делятся на 2 и 3 одновременно
    val a9 = collection.filter { it %2 !=0 || it %3 !=0 }
    println (a9)

//    14. Очистить текстовую коллекцию от null элементов
    val withoutNull = collection.filterNotNull()
    println(withoutNull)

//    15. Преобразовать текстовую коллекцию в коллекцию длин слов
    val stringCollection = listOf<String>("cat", "dog", "horse", "elephant", "cow", "camel")
    val x1 = stringCollection.map { it.length }
    println(x1)

//    16. Преобразовать текстовую коллекцию в мапу, где ключи - перевёрнутые слова, а значения - длина слов
    val x2 = stringCollection.associate { it.reversed() to it.length }

//    17. Отсортировать список в алфавитном порядке
    val a3 = stringCollection.sorted()

//    18. Взять первые 3 элемента списка
    val a4 = stringCollection.take(3)

//    19. Распечатать квадраты элементов списка
    collection.forEach {println(it * it)}

//    20. Группировать список по первой букве слов
    val a5 = stringCollection.groupBy { it.first() }
    println(a5)

//    21. Очистить список от дублей
    val a6 = collection.distinct()
    println(a6)

//    22. Отсортировать список по убыванию
    val a7 = collection.sortedDescending()
    println(a7)

//    23.  Взять последние 3 элемента списка
    val a8 = stringCollection.dropLast(2)
    println(a8)

    println(qualityNumber(listOf()))
    println(qualityNumber(listOf(2, 5)))
    println(qualityNumber(listOf(0 ,3, 9, 3, 1)))
    println(qualityNumber(listOf(500, 300, 400, 9400, 7430)))
    println(qualityNumber(listOf(10, 5, 15, 10, 5, 15)))
    println(qualityNumber(listOf(1000, 1000, 1000, 1000, 1000, 1)))
    println(qualityNumber(listOf(-90, -36, -11, -71, -64)))
    println(qualityNumber(listOf(1500, 2000, 1001, 5369, 7362)))
    println(qualityNumber(listOf(4, 3, 14, 9, 0)))
    println(qualityNumber(listOf(1, 1, 2, 3, 4)))

    println(education(listOf(85, 58, 90, 74, 88, 67, 95, 92, 50, 42, 12)))

    val list = listOf(
        "Стол", "табурет", "ваза", "Кружка", "Зеркало", "ковер", "Шкаф", "часы", "Люстра",
        "подушка", "Картина", "столик", "Вазон", "шторы", "Пуф", "книга", "Фоторамка",
        "светильник", "Коврик", "вешалка", "Подставка", "телевизор", "Комод", "полка",
        "Абажур", "диван", "Кресло", "занавеска", "Бра", "пепельница", "Глобус", "статуэтка",
        "Поднос", "фигурка", "Ключница", "плед", "Тумба", "игрушка", "Настенные часы",
        "подсвечник", "Журнальный столик", "сувенир", "Корзина для белья", "посуда",
        "Настольная лампа", "торшер", "Этажерка"
    )

    val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)

    val ages = listOf(22, 18, 30, 45, 17, null, 60)

    println(catalog(list))
    println(averageWord(list))
    println(category(numbers))
    println(firstTrue(ages, 18))

}

// Задача 24. Характеристика числовой коллекции
// Напиши функцию, которая принимает коллекцию чисел и возвращает строку с
// характеристикой коллекции используя конструкцию when

    fun qualityNumber (list: List<Int>): String {
        val max = list.maxOrNull()
        val min = list.minOrNull()

        return when {
            list.isEmpty() -> "Empty"
            list.size < 5 -> "Short"
            list.first() == 0 -> "Start"
            list.sum() > 10000 -> "Massive"
            list.average() == 10.0 -> "Balanced"
            list.joinToString ( "" ).length > 20 -> "Sticky"
            max != null && max < -10 -> "Negative"
            min != null && min > 1000 -> "Positive"
            list.contains(3) && list.contains(14) -> "WOW"
            else -> "Unique"
        }
    }


// Задача 25. Анализ учебных оценок
// Напиши функцию, которая принимает список чисел и возвращает список чисел.
// Отфильтровать удовлетворительные оценки (>=60),
// отсортировать оставшиеся по возрастанию и взять первые 3.
// Вызывай методы обработки и фильтрации последовательно один из другого,
// чтобы результат предыдущего метода являлся основой для следующего.

    fun education (grades: List<Int>): List<Int> {
        return grades
            .filter { it >= 60 }
            .sorted()
            .take(3)
    }


// Задача 26. Создание каталога по первой букве
// Напиши функцию, которая принимает список строк и возвращает словарь с
// ключом - буквой и значением - списком строк.

    fun catalog(list: List<String>): Map<Char, List<String>> {
        return list.groupBy { it.first().uppercaseChar() }
    }


// Задание 27. Подсчёт средней длины слов в списке
// Напиши функцию, которая принимает список строк и возвращает строку.
// Начальные значения взять из предыдущей задачи.
// Цель: Перевести все слова в количество букв, подсчитать среднее значение.
// Вернуть форматированный текст с двумя знаками после запятой,
// используя функцию format и подходящий шаблон.

    fun averageWord(words: List<String>): String {
       val length = words.joinToString("")
           .length
           .toDouble() / words.size
        return String.format("%.2f", length)
    }

// Задание 28: Категоризация чисел
// Напиши функцию, которая принимает список чисел и возвращает словарь с
// ключами - строками и значениями - список чисел.
// Начальные значения: val numbers = listOf(1, 3, 5, 7, 3, 1, 8, 9, 9, 7)
// Цель: Отобрать уникальные числа, отсортировать по убыванию и сгруппировать по
// четности (“четные” и “нечетные”).

fun category(numbers: List<Int>): Map<String, List<Int>> {
    return numbers
        .distinct()
        .sortedDescending()
        .groupBy {
            if (it % 2 == 0) "четные"
            else "нечетные"
        }
}


// Задание 29: Поиск первого подходящего элемента
// Напиши функцию, которая принимает список чисел и число и возвращает nullable число.
// Начальные значения: val ages = listOf(22, 18, 30, 45, 17, null, 60) и число для
// проверки возраста, например 18.
// Цель: Найти первый возраст в списке, который соответствует условию
// (больше второго аргумента) и вернуть его, либо null если значения не нашлось.

    fun firstTrue(ages: List<Int?>, n: Int): Int? {
        return ages.firstOrNull { it != null && it > n }
    }