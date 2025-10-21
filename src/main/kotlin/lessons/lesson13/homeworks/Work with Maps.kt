package lessons.lesson13.homeworks

fun main() {
// 1. Дан словарь с именем и временем выполнения каждого автоматизированного теста в секундах.
// Определите среднее время выполнения теста.
    val map1 = mapOf("test_1" to 2, "test_2" to 6, "test_3" to 3)
    val avgTime = map1.values.average()
    println(avgTime)

// 2. Имеется словарь с метаданными автоматизированных тестов, где ключи — это имена тестовых методов
// а значения - строка с метаданными. Выведите список всех тестовых методов.
    val map2 = mapOf("test_1" to "meta_1", "test_2" to "meta_2", "test_3" to "meta_3")
    val listMethod = map2.keys.toList()
    println(listMethod)

// 3. В изменяемый словарь с данными о прохождении тестов добавьте новый тест и его результат.
    val map3 = mutableMapOf("test_1" to "result_1", "test_2" to "result_2", "test_3" to "result_3")
    map3["test_4"] = "result_4"
    println(map3)

// 4. Посчитайте количество успешных тестов в словаре с результатами
// (ключ - название, значение - результат из passed, failed, skipped).
    val map4 = mutableMapOf("test_1" to "passed", "test_2" to "passed", "test_3" to "failed", "test_4" to "failed", "test_5" to "skipped")
    println(map4.count { it.value == "passed" })

// 5. Удалите из изменяемого словаря с баг-трекингом запись о баге, который был исправлен
// (ключ - название, значение - статус исправления).
    val map5 = mutableMapOf("bug_1" to "open", "bug_2" to "fixed", "bug_3" to "in progress")
    map5.remove("bug_2")
    println(map5)

// 6. Для словаря с результатами тестирования веб-страниц (ключ — URL страницы, значение — статус ответа),
// выведите сообщение о странице и статусе её проверки.
    val map6 = mapOf("https://page1.com" to 200, "https://page2.com" to 404)
    for ((key, value) in map6) {
        println("$key response status: $value")
    }

// 7. Найдите в словаре с названием и временем ответа сервисов только те, время ответа которых превышает заданный порог.
    val map7 = mapOf("test_1" to 30, "test_2" to 25, "test_3" to 70)
    val filteredByValues = map7.filterValues { it > 27 }
    println(filteredByValues)

// 8. В словаре хранятся результаты тестирования API (ключ — endpoint, значение — статус ответа в виде строки).
// Для указанного endpoint найдите статус ответа, если endpoint отсутствует, предположите, что он не был протестирован.
    val map8 = mapOf("endpoint_1" to "200", "endpoint_2" to "200", "endpoint_3" to "400")
    val toCheck = "endpoint_4"
    val map8Check = map8.getOrElse(toCheck) {"Not tested"}
    println(map8Check)

// 9. Из словаря, содержащего конфигурации тестового окружения (ключ — название параметра конфигурации,
// значение - сама конфигурация), получите значение для "browserType". Ответ не может быть null.
    val map9 = mapOf("browserType" to "Chrome", "Version" to "146")
    val brouserType = map9.getValue("browserType")
    println(brouserType)

// 10. Создайте копию неизменяемого словаря с данными о версиях тестируемого ПО, добавив новую версию.
    val map10 = mapOf("Version_11" to "info_1", "Version_12" to "info_2")
    val newMap10 = map10 + ("Version_13" to "info_3")
    println(newMap10)

// 11. Используя словарь с настройками тестирования для различных мобильных устройств
// (ключ — модель устройства, значение - строка с настройками), получите настройки для конкретной модели
// или верните настройки по умолчанию.
    val map11 = mapOf("iPhone_15" to "testing settings 1", "iPhone_16" to "testing settings 2", "iPhone_17" to "testing settings 3")
    val model = "iPhone_15"
    val testSettings = map11.getOrDefault(model, "default settings")
    println(testSettings)

// 12. Проверьте, содержит ли словарь с ошибками тестирования (ключ - код ошибки,
// значение - описание ошибки) определенный код ошибки.
    val map12 = mapOf(1001 to "error 1", 1002 to "error 2", 1002 to "error 3")
    val codError = map12.containsKey(1002)
    println(codError)

// 13. Дан неизменяемый словарь, где ключи — это идентификаторы тестовых сценариев в формате "TestID_Version",
// а значения — статусы выполнения этих тестов ("Passed", "Failed", "Skipped"). Отфильтруйте словарь,
// оставив только те сценарии, идентификаторы которых соответствуют определённой версии тестов,
// то-есть в ключе содержится требуемая версия.
    val map13 = mapOf("Test01_V1" to "Passed", "Test02_V1" to "Skipped", "Test01_V2" to "Failed", "Test01_V3" to "Passed")
    val version = "V1"
    val filterMap13 = map13.filterKeys { it.contains(version) }
    println(filterMap13)

// 14. У вас есть словарь, где ключи — это названия функциональных модулей приложения,
// а значения — результаты их тестирования. Проверьте, есть ли модули с неудачным тестированием.
    val map14 = mapOf("Module_1" to "passed", "Module_2" to "failed")
    val checkResult = map14.any { it.value == "failed" }
    println(checkResult)

// 15. Добавьте в изменяемый словарь с настройками тестовой среды настройки из другого словаря.
    val map15 = mutableMapOf("test_1" to "settings_1", "test_2" to "settings_3")
    map15.putAll(mapOf("test_3" to "settings_3", "test_4" to "settings_4"))
    println(map15)


// 16. Объедините два неизменяемых словаря с данными о багах.
    val map16_1 = mapOf("Bug_1" to "in progress", "Bug_2" to "Fixed")
    val map16_2 = mapOf("Bug_3" to "in progress", "Bug_4" to "Open")
    val map16 = map16_1 + map16_2
    println(map16)

// 17. Очистите изменяемый словарь с временными данными о последнем прогоне автоматизированных тестов.
    val map17 = mutableMapOf("test_1" to 2, "test_2" to 6, "test_3" to 3)
    map17.clear()

// 18. Исключите из отчета по автоматизированному тестированию те случаи, где тесты были пропущены
// (имеют статус “skipped”). Ключи - название теста, значения - статус.
    val map18 = mapOf("Test_1" to "Passed", "Test_2" to "Skipped", "Test_3" to "Failed", "Test_4" to "Passed")
    val report = map18.filterValues { it != "Skipped" }
    println(report)

// 19. Создайте копию словаря с конфигурациями тестирования удалив из него несколько конфигураций.
    val map19 = mapOf("Test_01" to "Configuration_1", "Test_02" to "Configuration_2", "Test_03" to "Configuration_1", "Test_04" to "Configuration_1", "Test_05" to "Configuration_2")
    val newMap19 = map19 - listOf("Test_01", "Test_04")
    println(newMap19)

// 20. Создайте отчет о тестировании, преобразовав словарь с результатами тестирования
// (ключ — идентификатор теста, значение — результат) в список строк формата "Test ID: результат".
    val map20 = mapOf(1 to "Passed", 2 to "Skipped", 3 to "Failed", 4 to "Passed")
    val testReport = map20.map { (id, result) -> "$id: $result" }
    println(testReport)

// 21. Преобразуйте изменяемый словарь с результатами последнего тестирования в неизменяемый для архивации.
    val map21 = mutableMapOf("Test_1" to "Passed", "Test_2" to "Skipped", "Test_3" to "Failed", "Test_4" to "Passed")
    val archivedMap21 = map21.toMap()
    println(archivedMap21)

// 22. Преобразуйте словарь, содержащий числовой ID теста и данные о времени выполнения тестов,
// заменив идентификаторы тестов на их строковый аналог (например через toString()).
    val map22 = mapOf(1 to 3.0, 2 to 2.3, 3 to 5.1, 4 to 4.2)
    val stringMap22 = map22.mapKeys { it.key.toString() }
    println(stringMap22)

// 23. Для словаря с оценками производительности различных версий приложения (ключи - строковая версия,
// значения - дробное число времени ответа сервера) увеличьте каждую оценку на 10%,
// чтобы учесть новые условия тестирования.
    val map23 = mapOf("Test_1" to 3.0, "Test_2" to 2.3, "Test_3" to 5.1, "Test_4" to 4.2)
    val map23_2 = map23.mapValues { it.value * 1.10 }
    println(map23_2)

// 24. Проверьте, пуст ли словарь с ошибками компиляции тестов.
    val map24 = emptyMap<String, String>()
    println(map24.isEmpty())

// 25. Убедитесь, что словарь с результатами нагрузочного тестирования не пуст.
    val map25 = mapOf("Test_1" to "passed", "Test_2" to "passed", "Test_3" to "failed")
    println(map25.isNotEmpty())

// 26. Проверьте, прошли ли успешно все автоматизированные тесты в словаре с результатами.
    val map26 = mapOf("Test_1" to "passed", "Test_2" to "passed", "Test_3" to "failed")
    println(map26.all { it.value == "passed" })

// 27. Определите, содержит ли словарь с результатами тестирования хотя бы один тест с ошибкой.
    val map27 = mapOf("Test_1" to "passed", "Test_2" to "passed", "Test_3" to "failed")
    println(map27.any { it.value == "passed" })

// 28. Отфильтруйте словарь с результатами тестирования сервисов, оставив только те тесты, которые не прошли успешно
// и содержат в названии “optional”.
    val map28 = mapOf("optional-login" to "failed", "optional-payment" to "passed", "search" to "failed")
    val filterMap28 = map28.filter { (key, value) -> key.contains("optional") && value == "failed"}
    println(filterMap28)
}