package lessons.lesson08.homeworks

fun main() {
    convertingString("Удача")
    date("Пользователь вошел в систему -> 2021-12-01 09:48:23")
    mask("4539 1488 0343 6467")
    email("username@example.com")
    file("C:/Пользователи/Документы/report.txt")
    abbreviation("Котлин лучший язык программирования")
}



// 1. Преобразование строк

fun convertingString(arg: String) {
    val newString = when {
        arg.contains("невозможно") -> arg.replace("невозможно", "совершенно точно возможно, просто требует времени")
        arg.startsWith("Я не уверен") -> "$arg, но моя интуиция говорит об обратном"
        arg.contains("катастрофа") -> arg.replace("катастрофа","интересное событие")
        arg.endsWith("без проблем") -> arg.replace("без проблем","с парой интересных вызовов на пути")
        !arg.contains(" ") -> "Иногда, $arg, но не всегда"
        else -> arg
    }
    println(newString)
}

// 2. Извлечение даты из строки лога

fun date(log: String) {
    val arrow = log.indexOf("->")
    val date = log.substring(arrow + 3, arrow + 13)
    val time = log.substring(arrow + 14, arrow + 22)
    println(date)
    println(time)
}

// 3. Маскирование личных данных
 fun mask (arg: String) {
    val cardNumber = arg.split(" ")
    val maskNumbers = "**** **** **** ${cardNumber[3]}"
    println(maskNumbers)
 }

// 4. Форматирование адреса электронной почты.
fun email (arg: String) {
    val email1 = arg.replace("@", " [at] ")
        .replace(".", " [dot] ")
    println(email1)
}

// 5. Извлечение имени файла из пути.
fun file (arg: String) {
    val fileParts = arg.split("/")
    val fileName = fileParts[fileParts.size - 1]
    println(fileName)
}

// 6. Создание аббревиатуры из фразы.
fun abbreviation (arg: String) {
    val words = arg.split(" ")
    var abbr = ""
    for (word in words) {
        if (!word.isNullOrBlank()) {
            abbr += word[0].uppercase()
        }
    }
    println(abbr)
}