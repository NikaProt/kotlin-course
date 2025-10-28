package lessons.lesson15.homework

//Иерархия Мебели
//Базовый класс: Мебель
//Производные классы: …
//Дополнительное разветвление для …: …

open class Furniture(
    val name: String,
    val manufacturer: String
) {
}

open class Material(
    name: String,
    manufacturer: String,
    val typeOfMaterial: String
) : Furniture(name, manufacturer)

open class Room(
    name: String,
    manufacturer: String,
    val furnitureRoom: String
) : Furniture(name, manufacturer)

class Table(
    name: String,
    manufacturer: String,
    val color: String
) : Material(name, manufacturer, "Oak")

class Price(
    name: String,
    manufacturer: String,
    furnitureRoom: String,
    val price: Int
) : Room (name, manufacturer, "Badroom")