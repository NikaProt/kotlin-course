package lessons.lesson15.homework

// Учебные Заведения
//Базовый класс: Учебное Заведение
//Производные классы: Школа, …
//Дополнительное разветвление для …: …

open class EducationalInstitution(
    val name: String,
    val city: String
) {
}

open class School(
    name: String,
    city: String,
    val level: String
) : EducationalInstitution(name, city)

open class University(
    name: String,
    city: String,
    val type: String
) : EducationalInstitution(name, city)

class HighSchool (
    name: String,
    city: String
        ) : School(name, city, "High School")

class TechnicalUniversity(
    name: String,
    city: String,
    val durationOfStudying: Int
) : University(name, city, "Technical")