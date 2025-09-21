package lessons.lesson06.homeworks

import java.sql.DriverManager.println

fun main() {
    seasons(9)
    pet(3)
    move(2.5)
    bonus(2000)
    document("jpg")
    cloth(15)
    movie(17)

}

//Задание 1: "Определение сезона"
fun seasons (month: Int) {
    when (month) {
        in 3..5 -> println("Весна")
        in 6..8 -> println("Лето")
        in 9..11 -> println("Осень")
        1, 2, 12 -> println("Зима")
        else -> println("Ошибка ввода")
    }
}

//Задание 2: "Расчет возраста питомца"
fun pet (age: Int) {
    if (age <= 0) {
        println("Возраст не может быть меньше или равен 0")
    } else if (age <= 2) {
        val humanAge1 = age * 10.5
        println("Возраст собаки в человекогодах: $humanAge1")
    } else {
        val humanAge2 = (age - 2) * 4 + 21
        println("Возраст собаки в человекогодах: $humanAge2")
    }
}

//Задание 3: "Определение способа перемещения"
fun move (km: Double) {
    if (km <= 0) {
        println ("Расстояние должно быть больше 0")
    } else if (km > 0 && km <= 1) {
        println ("Иди пешком")
    } else if (km > 1 && km <= 5) {
        println("Едь на велосипеде")
    } else {
        println("Едь на авто")
    }
}

//Задание 4: "Расчет бонусных баллов"
fun bonus (sum: Int) {
    if (sum <= 1000) {
        val points1: Int = (sum / 100) * 2
        println("Бонусные баллы: $points1")
    } else {
        val points2: Int = (sum / 100) * 3
        println("Бонусные баллы: $points2")
    }
}

//Задание 5: "Определение типа документа"
fun document (type: String) {
    when (type) {
        "docx" -> println("Текстовый документ")
        "jpg" -> println("Изображение")
        "xlsx" -> println("Таблица")
        else -> println("Неизвестный тип")
    }
}

//Задание 6: "Конвертация температуры"
fun tempConversion (temperature: Double, type: Char){
    if (type == 'C' || type == 'c'){
        val convertToF = temperature * 9/5 + 32
        //print(convertToF) - IDEA выдает ошибку, поэтому использую println()
        println("$convertToF + F")
    } else if (type == 'F' || type == 'f') {
        val convertToC = (temperature - 32) * 5 / 9
        //print(convertToC) - IDEA выдает ошибку, поэтому использую println()
        println("$convertToC + C")
    } else {
        "Неверная единица измерения"
    }
}

//Задание 7: "Подбор одежды по погоде"
fun cloth (temperature: Int) {
    when (temperature) {
        in -30..9 -> println("Одень куртку и шапку")
        in 10..18 -> println("Одень ветровку")
        in 19..35 -> println("Одень шорты и футболку")
        else -> println("Останься дома")
    }
}

//Задание 8: "Выбор фильма по возрасту"
fun movie (age: Int) {
    if (age in 0..9) {
        println("Детские фильмы")
    } else if (age in 10..18) {
        println("Подростковые фильмы")
    } else {
        println("Для остальных")
    }
}



