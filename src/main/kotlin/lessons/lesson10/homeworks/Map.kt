package lessons.lesson10.homeworks

fun main() {

//    1. Задачи на работу со словарём
//    1.1. Создайте пустой неизменяемый словарь, где ключи и значения - целые числа.
    val map1 = mapOf<Int, Int>()

//    1.2. Создайте словарь, инициализированный несколькими парами "ключ-значение", где ключи - float, а значения - double
    val map2 = mapOf<Float, Double>()

//    1.3. Создайте изменяемый словарь, где ключи - целые числа, а значения - строки.
    val map3 = mutableMapOf<Int, String>()

//    1.4. Имея изменяемый словарь, добавьте в него новые пары "ключ-значение".
    val map4 = mutableMapOf<Int, String>()
    map4[1] = "One"
    map4[2] = "Two"
    map4[3] = "Three"

//    1.5. Используя словарь из предыдущего задания, извлеките значение, используя ключ. Попробуй получить значение с ключом, которого в словаре нет.
    val value1 = map4[1]
    println(value1)
    val value2 = map4[5]
    println(value2)

//    1.6. Удалите определенный элемент из изменяемого словаря по его ключу.
    map4.remove(2)

//    1.7. Создайте словарь (ключи Double, значения Int) и выведи в цикле результат деления ключа на значение. Не забудь обработать деление на 0 (в этом случае выведи слово “бесконечность”)
    val map7 = mapOf<Double, Int>(4.0 to 2, 7.4 to 2, 5.0 to 5, 9.5 to 0)
        for ((x, y) in map7) {
            if (y > 0) {
                println(x/y)
            }
            else println("Infinity")
        }

//    1.8. Измените значение для существующего ключа в изменяемом словаре.
    val map8 = mutableMapOf<String, String>("Coffee " to " Empty", "Fridge " to "Full")
    map8["Fridge "] = " Empty (someone got hungry!)"
    println(map8)

//    1.9. Создайте два словаря и объедините их в третьем изменяемом словаре через циклы.
    val map9_1 = mapOf<String, String>(
        "Cat " to " the boss of the house",
        "Dog " to " the security guard")
    val map9_2 = mapOf<String, String>("Parrot " to " repeats all your secrets")
    val map9_3 = mutableMapOf<String, String>()
    for ((key1, value1) in map9_1) {
        map9_3[key1] = value1
    }
    for ((key2, value2) in map9_2) {
        map9_3[key2] = value2
    }
    println(map9_3)

//    1.10. Создайте словарь, где ключами являются строки, а значениями - списки целых чисел. Добавьте несколько элементов в этот словарь.
    val map10 = mutableMapOf<String, List<Int>>()
    map10["Spider-Man"] = mutableListOf(100, 200, 300)
    map10["Batman"] = mutableListOf(200, 400, 150)
    println(map10)

//    1.11. Создай словарь, в котором ключи - это целые числа, а значения - изменяемые множества строк.
//    Добавь данные в словарь. Получи значение по ключу (это должно быть множество строк)
//    и добавь в это множество ещё строку. Распечатай полученное множество.
    val map11 = mutableMapOf<Int, MutableList<String>>()
    map11[1] = mutableListOf("Orange", "Banana", "Apple")
    map11[2] = mutableListOf("Potato", "Carrot", "Cabbage")
    val groceries = map11[1]
    groceries?.add("Mango")
    println(groceries)

//    1.12. Создай словарь, где ключами будут пары чисел.
//    Через перебор найди значение у которого пара будет содержать
//    цифру 5 в качестве первого или второго значения.
    val map12 = mapOf<List<Int>, String>(
        listOf(1, 2) to "One Cat knocked over 2 cups",
        listOf(2, 5) to "Two Dogs stole 5 socks",
        listOf(5, 3) to "Parrot repeated 5 words 3 times")
        for ((key, value) in map12) {
            val a = key[0]
            val b = key[1]
            if (a == 5 || b == 5) {
                println(key + value)
            }
        }


//    2. Задачи на подбор оптимального типа для словаря
//    2.1. Словарь библиотека: Ключи - автор книги, значения - список книг
    val library = mapOf<String, MutableList<String>>()

//    2.2. Справочник растений: Ключи - типы растений (например, "Цветы", "Деревья"), значения - списки названий растений
    val flowers = mapOf<String, List<String>>()

//    2.3. Четвертьфинала: Ключи - названия спортивных команд, значения - списки игроков каждой команды
    val quarterfinals = mutableMapOf<String, MutableList<String>>()

//    2.4. Курс лечения: Ключи - даты, значения - список препаратов принимаемых в дату
    val treatment = mapOf<String, List<String>>()

//    2.5. Словарь путешественника: Ключи - страны, значения - словари из городов со списком интересных мест.
    val traveler = mutableMapOf<String, MutableMap<String, MutableList<String>>>()


}