package lessons.lesson14.homeworks

// Класс Rack (Стеллаж)
//
//Характеристики:
//Список полок (shelves): хранит полки стеллажа.
//Максимальное количество полок.

class Rack(private val maxShelves: Int) {
    private val shelves = mutableListOf<Shelf>()


// Методы:
//
//Добавление Полки (addShelf):
//Добавляет новую полку в стеллаж.
//Возвращает true, если полка была успешно добавлена или false если стеллаж уже
// заполнен или была попытка добавить полку которая уже установлена.

    fun addShelf(shelf: Shelf): Boolean {
        if (shelves.size >= maxShelves || shelves.contains((shelf))) {
            return false
        } else {
            return true
        }
    }

//Удаление Полки (removeShelf):
//Принимает индекс полки для удаления.
//Удаляет полку по указанному индексу.
//Возвращает список предметов полки, если полка была успешно удалена или пустой
// список если полка не существует.

    fun removeShelf(index: Int): List<String> {
         if (index in shelves.indices) {
            val remove = shelves[index].getItems()
            shelves.removeAt(index)
            return remove
        } else {
            return emptyList()
        }
    }

//Добавление Предмета (addItem):
//Добавляет предмет на первую свободную полку.
//Возвращает true, если предмет успешно добавлен, и false, если на всех полках недостаточно места.

    fun addItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.addItem(item)) return true
        }
        return false
    }

//Удаление Предмета (removeItem):
//Находит и удаляет только один предмет с любой полки.
//Возвращает true, если предмет был удален, и false, если такой предмет не найден.

    fun removeItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.removeItem(item)) return true
        }
        return false
    }

//Проверка наличия предмета на стеллаже (containsItem):
//Возвращает true если предмет есть на одной из полок

    fun containsItem(item: String): Boolean {
        for (shelf in shelves) {
            if (shelf.containsItem(item)) {
                return true
            }
        }
        return false
    }

//Получение списка полок (getShelves):
//Возвращает неизменяемый список полок

    fun getShelves(): List<Shelf> {
        return shelves.toList()
    }

//Печать Содержимого (printContents):
//Выводит в консоль информацию о каждой полке: индекс, вместимость, оставшуюся
// вместимость, список предметов. Информацию выводить в наглядном читаемом виде

    fun printContents() {
        for (i in shelves.indices) {
            val capacity = shelves[i].capacity
            val freeSpace = capacity - shelves[i].getItems().map { it.length }.sum()
            val items = shelves[i].getItems().joinToString()
            println("Index $i, Capacity: $capacity, Space left: $freeSpace")
            println(items)
        }
    }

//Сложное удаление полки (advancedRemoveShelf):
//Принимает индекс полки для удаления
//Перераспределяет предметы по имеющимся полкам, начиная с самых длинных.
// Если очередной предмет никуда не вмещается, его нужно пропустить и
// попробовать разместить следующий.
//Удаляет полку с оставшимися предметами
//Возвращает неизменяемый список предметов, которые не удалось удалить или пустой
// список если полки с таким индексом нет.

    fun advancedRemoveShelf(index: Int): List<String> {
        if (index !in shelves.indices){
            return emptyList()
        }
        val notReplacedItems = mutableListOf<String>()
        val otherShelves = shelves - shelves[index]
        for (item in shelves[index].getItems()) {
            if (otherShelves.none { it.addItem(item) }) {
                notReplacedItems.add(item)
            }
        }
        shelves.removeAt(index)
        return emptyList()
    }

}