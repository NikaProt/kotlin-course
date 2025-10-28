package lessons.lesson15.homework

abstract class Materials {
    private val materials = mutableListOf<String>()
    fun addMaterial(material: String) {
        materials.add(material)
    }
    fun extractMaterials(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }
    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}

// Первый класс должен вставлять строку на дно контейнера
// (должно появиться под индексом 0)

class AddToBottom : Materials() {
    fun insert(item: String) {
        val material = extractMaterials()
        addMaterial(item)
        material.forEach { addMaterial(it)}
    }
}

// Второй класс должен получать список строк и вставлять их в начало контейнера но
// поочерёдно с теми данными, которые уже есть. То-есть, наш список должен появиться
// в контейнере по индексам 0, 2, 4 и так далее.

class AddOneByOne : Materials() {
    fun insert(items: List<String>) {
        val materials = extractMaterials().toMutableList()
        val general = mutableListOf<String>()
        val maxSize = maxOf(materials.size, items.size)
        for (i in 0..maxSize) {
            if (i < items.size) general.add(items[i])
            if (i < materials.size) general.add(materials[i])
        }
        general.forEach {addMaterial(it)}

    }
}

// Третий класс при добавлении строки должен отсортировать весь список метиралов в
// алфавитном порядке включая добавляемый материал.

class AddSorted : Materials() {
    fun addSorted(item: String) {
        val materials = (extractMaterials() + item).sorted()
        materials.forEach() {
            addSorted(it)
        }
    }
}

// Четвёртый класс должен принимать словарь (ключи и значения строки). Каждая пара
// ключа и значения должна попадать в контейнер следующим образом - ключ в начало,
// значение в конец. Таким образом в начале должны быть ключи в обратном порядке,
// потом существующие материалы, потом все значения.

class AddMap : Materials() {
    fun insert(items: Map<String, String>) {
        val materials = items.keys.reversed() + extractMaterials() + items.values
        materials.forEach {
            addMaterial(it)
        }
    }
}