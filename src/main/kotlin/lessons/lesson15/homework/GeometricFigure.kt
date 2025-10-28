package lessons.lesson15.homework

// Геометрические Фигуры
//Базовый класс: Геометрическая Фигура
//Производные классы: Многоугольник, Круг
//Дополнительное разветвление для Многоугольник: Треугольник, Четырехугольник

open class GeometricFigure(val name: String) {
}

open class Polygon(
    name: String,
    val sidesCount: Int
) : GeometricFigure(name)

class Circle (
    val radius: Int
        ) : GeometricFigure("Circle")

class Triangle (
    val sideAB: Int,
    val sideBC: Int,
    val sideCA: Int
        ) : Polygon("Triangle", 3)

class Quadrangle(
    val sideAB: Int,
    val sideBC: Int,
    val sideCD: Int,
    val sideDA: Int
) : Polygon("Quadrangle", 4)