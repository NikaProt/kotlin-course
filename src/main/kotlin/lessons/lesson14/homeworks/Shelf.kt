package lessons.lesson14.homeworks

//    Задание 6. Стеллаж и полки.
//    Цель задания: Создать систему управления складским пространством с
//    использованием классов "Стеллаж" и "Полка стеллажа".
//
//    Класс Shelf (Полка Стеллажа)
//    Характеристики:
//    Вместимость полки (capacity): максимальная сумма букв всех названий предметов, которые могут быть размещены на полке.
//    Список предметов (items): хранит названия предметов на полке.

class Shelf(val capacity: Int) {
    private val items = mutableListOf<String>()

// Методы:
// Добавление Предмета (addItem):
// Принимает название предмета.
// Проверяет, поместится ли предмет на полку, учитывая длину его названия и текущее заполнение полки.
// Возвращает true и добавляет предмет, если есть место. В противном случае возвращает false.

    fun addItem (item: String): Boolean {
        if (canAccomodation(item)) {
            items.add(item)
            return true
        } else {
            return false
        }
    }

// Удаление Предмета (removeItem):
// Принимает название предмета.
// Удаляет предмет, если он найден на полке.
// Возвращает true, если предмет был удален, и false, если такой предмет не найден.

    fun removeItem(item: String): Boolean {
        if (items.contains(item)) {
            items.remove(item)
            return true
        } else {
            return false
        }
    }

// Проверка Вместимости (canAccommodate):
// Принимает название предмета.
// Определяет, вместится ли предмет на полку.
// Возвращает true, если предмет вместится, и false, если места недостаточно.

    fun canAccomodation(item: String): Boolean {
        val nowAccomodation = items.map { it.length }.sum()
        return nowAccomodation + item.length <= capacity
    }

// Проверка наличия предмета (containsItem):
// Принимает название предмета
// Возвращает true если такой предмет есть

    fun containsItem(item: String): Boolean {
        return items.contains(item)
    }

// Получение списка предметов (getItems):
// Возвращает неизменяемый список предметов

    fun getItems(): List<String> {
        return items.toList()
    }

}