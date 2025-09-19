package lessons.lesson05.homework

fun main() {
    val initialSound: Double = 10.0
    val attenuationCoefficient: Double? = 0.6
    val standardCoefficient: Double = 0.5
    val soundIntensity = initialSound * (attenuationCoefficient ?: standardCoefficient)
    println(soundIntensity)

    val price: Double? = 30.0
    val standardPrice: Double = 50.0
    val insuranceCoefficient: Double = 0.5
    val delivery: Double = 5.0
    val insuranse = (price ?: standardPrice) * insuranceCoefficient/100
    val totalCost = delivery + insuranse
    println(totalCost)

    val atmosphericPressure: Int? = 760
    val message: String = "Ошибка. Данные отсутствуют"
    val answer = atmosphericPressure ?: message
    println(answer)
}