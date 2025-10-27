package lessons.lesson14.homeworks

// Мероприятие: концерт. Создайте класс, который будет представлять концерт.
// У него должны быть свойства “группа”, “место проведения”, “стоимость”,
// “вместимость зала”. Также приватное поле “проданные билеты”.
// Добавьте метод, который выводит информацию о концерте и метод “купить билет”,
// который увеличивает количество проданных билетов на один.

data class Concert(
    val band: String,
    val place: String,
    val price: Double,
    val hallCapacity: Int
    ) {

    private var soldTickets: Int = 0

    fun infoConcert() {
            println("$band, $place, $price, $hallCapacity")
        }

    fun byuTicket() {
        if (soldTickets < hallCapacity) {
            soldTickets++
        }
        else {
            println("No tickets")
        }

    }
}
