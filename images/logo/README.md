# Проект по автоматизированному тестированию сайта "IBS"

<p align="center">
<img title="Allure Overview" src="images/screenshots/IBS_main_page.png">
</p>

## <a name="bookmark_tabs-Содержание"></a>:bookmark_tabs: Содержание

➠ [Покрытый функционал](#checkered_flag-покрытый-функционал)

➠ [Технологический стек](#desktop_computer-Технологический-стек)

➠ [Запуск тестов из терминала](#key-запуск-тестов-из-терминала)

➠ [Удаленный запуск тестов в Jenkins](#-удаленный-запуск-тестов-в-Jenkins)

➠ [Отчет о результатах тестирования в Allure Report](#-отчет-о-результатах-тестирования-в-allure-report)

➠ [Уведомления в Telegram с использованием бота](#-уведомления-в-telegram-с-использованием-бота)

➠ [Пример запуска теста в Selenoid из отчета Allure](#-Пример-запуска-теста-в-Selenoid-из-отчета-Allure)
## <a name="checkered_flag-покрытый-функционал"></a>:checkered_flag: Покрытый функционал

### UI тесты

- [x] Проверка наличия кнопки "Контакты" на главной странице
- [x] Проверка кликабельности кнопки принятия cookies
- [x] Проверка поля поиска по сайту на главной странице
- [x] Проверка открытия страницы "Тестирование"
- [x] Проверка открытия страницы "Вакансии"
- [x] Проверка наличия кнопки "Стажировки" в футере страницы
- [x] Проверка открытия страницы вк с группой компании при клике на иконку VK

[:arrow_up:Содержание](#bookmark_tabs-Содержание)

## <a name="desktop_computer-Технологический стек"></a>:desktop_computer: Технологический стек

<p align="center">
<img width="6%" title="IntelliJ IDEA" src="images/logo/Intelij_IDEA.svg">
<img width="6%" title="Java" src="images/logo/Java.svg">
<img width="6%" title="JUnit5" src="images/logo/JUnit5.svg">
<img width="6%" title="Selenide" src="images/logo/Selenide.svg">
<img width="6%" title="Gradle" src="images/logo/Gradle.svg">
<img width="6%" title="GitHub" src="images/logo/GitHub.svg">
<img width="6%" title="Jenkins" src="images/logo/Jenkins.svg">
<img width="6%" title="Selenoid" src="images/logo/Selenoid.svg">
<img width="6%" title="Allure Report" src="images/logo/Allure_Report.svg">
<img width="6%" title="Telegram" src="images/logo/Telegram.svg">
</p>

```mermaid        
    stateDiagram-v2
        State1: Java & IntelliJ IDEA
        State2: Selenide & JUnit5
        State3: Gradle
        State4: GitHub
        State5: Jenkins
        State6: Selenoid
        State7: Allure Report
        State8: Telegram
        State1 --> State2
        State2 --> State3
        State3 --> State4
        State4 --> State5
        State5 --> State6
        State6 --> State7
        State7 --> State8
        note right of State1 : Написание тестов
        note left of State2 : Фреймворки
        note right of State3 : Сборка проекта
        note left of State4 : Система контроля версий 
        note right of State5 : Параметризация и запуск сборки
        note left of State6 : Контейнеризация
        note right of State7 : Просмотр отчетности
        note left of State8 : Уведомления
```
[:arrow_up:Содержание](#bookmark_tabs-Содержание)

## :key: Запуск тестов из терминала

### Локальный запуск тестов

```
gradle clean test
```

[:arrow_up:Содержание](#bookmark_tabs-Содержание)

## <img width="4%" title="Jenkins" src="images/logo/Jenkins.svg"> Удаленный запуск тестов в [Jenkins](https://jenkins.autotests.cloud/job/C16-leshkakuff-IBS_project/)

### Главная страница сборки

<p align="center">
<img title="Jenkins" src="images/screenshots/IBS_Jenkins.png">
</p>

### Удаленный запуск тестов

```
clean
test
"-Dbrowser=${BROWSER}"
"-DbrowserSize=${BROWSER_SIZE}"
"-DbrowserVersion=${BROWSER_VERSION}"
```

> Для запуска тестов используется параметризированная сборка
> - <code>BROWSER</code> – браузер, в котором будут выполняться тесты (по умолчанию - <code>chrome</code>).
>- <code>BROWSER_SIZE</code> – размер окна браузера, в котором будут выполняться тесты (по умолчанию - <code>1920x1080</code>).
>- <code>BROWSER_VERSION</code> – версия браузера, в котором будут выполняться тесты (по умолчанию - <code>100.0</code>)

[:arrow_up:Содержание](#bookmark_tabs-Содержание)

## <img width="4%" title="Allure Report" src="images/logo/Allure_Report.svg"> Отчет о результатах тестирования в [Allure Report](https://jenkins.autotests.cloud/job/C16-leshkakuff-IBS_project/3/allure/#)

### :large_orange_diamond: Главная страница Allure-отчета

<p align="center">
<img title="Allure Overview" src="images/screenshots/IBS_allure_main_page.png">
</p>

### :large_orange_diamond: Страница с тестами

<p align="center">
<img title="Allure Behaviors" src="images/screenshots/IBS_allure_tests.png">
</p>

> Каждый тест имеет:
> - Скриншот
>- Page source
>- Browser console log
>- Видео

### :large_orange_diamond: Основной дашборд

<p align="center">
<img title="Allure Overview Dashboard" src="images/screenshots/IBS_graphs_allure.png">
</p>

[:arrow_up:Содержание](#bookmark_tabs-Содержание)

## <img width="4%" title="Telegram" src="images/logo/Telegram.svg"> Уведомления в Telegram с использованием бота

> По результатам каждой сборки Telegram-бот отправляет отчет в специальный телеграм-чат. 
>
> Информация по настройке и использованию бота <code>https://github.com/qa-guru/allure-notifications</code>

<p align="center">
<img title="Telegram Notifications" src="images/screenshots/IBS_telegram.png">
</p>

[:arrow_up:Содержание](#bookmark_tabs-Содержание)

## <img width="4%" title="Selenoid" src="images/logo/Selenoid.svg"> Пример запуска теста в Selenoid из отчета Allure

> К каждому тесту в отчете прилагается видео. Одно из таких видео представлено ниже.
<p align="center">
  <img title="Selenoid Video" src="images/gif/IBS_test.gif">
</p>

[:arrow_up:Содержание](#bookmark_tabs-Содержание)
