package lessons.lesson14.homeworks

fun main() {
    val party = Party("The Rooftop", 30)
    party.details()

    val emotion = Emotion("Joy", 10)
    emotion.express()

    Moon.showPhase()

    val grocery = Grocery("apple", 3.5, 5)
    println(grocery)

    val concert = Concert("Band-Band", "Concert Hall", 120.00, 1500)
    concert.infoConcert()
}