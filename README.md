🎬 KinoTracker — Android Movie App
KinoTracker — это современное Android-приложение для просмотра популярных фильмов, построенное на базе TMDB API. Проект разработан с использованием актуального стека технологий и демонстрирует навыки работы с сетью, внедрением зависимостей и современной версткой.

🚀 Особенности
Реальное API: Загрузка актуального списка популярных фильмов.

Архитектура MVVM: Четкое разделение бизнес-логики и UI.

Clean Architecture: Слои data, domain и presentation для масштабируемости.

Обработка состояний: Реализованы экраны загрузки (Loading), ошибки (Error) и пустого списка.

Оффлайн-режим: Базовая обработка ошибок сети с отображением локальных данных.

🛠 Стек технологий
Kotlin — основной язык разработки.

Jetpack Compose — современный декларативный UI.

Dagger Hilt — Dependency Injection (внедрение зависимостей).

Retrofit 2 & OkHttp — работа с сетевыми запросами.

Coil — эффективная загрузка изображений.

Kotlin Coroutines & Flow — асинхронная работа и реактивные потоки данных.

📦 Структура проекта
Plaintext
com.example.kinotracker
├── di             # Модули Dagger Hilt
├── data           # Репозитории, API сервисы, DTO (Data Transfer Objects)
├── domain         # Бизнес-логика: модели и интерфейсы репозиториев
└── presentation   # UI: ViewModel, Compose Screens и State-классы
⚙️ Установка и запуск
Склонируйте репозиторий:

Bash
git clone https://github.com/твой-логин/KinoTracker.git
Получите API ключ на сайте TMDB.

Вставьте ваш ключ в MovieRepositoryImpl.kt:

Kotlin
val apiKey = "ВАШ_КЛЮЧ_ЗДЕСЬ"
Соберите проект в Android Studio и запустите на эмуляторе или реальном устройстве.
![1000034285](https://github.com/user-attachments/assets/a8d4768a-8aac-4d95-a86c-08ad168137a0)

![1000034286](https://github.com/user-attachments/assets/c6823f86-309d-4842-a06c-d90de9f28162)
![1000034287](https://github.com/user-attachments/assets/9a897d37-9fb3-4bd5-bf06-6950f48dec7f)
![1000034288](https://github.com/user-attachments/assets/f476915e-0670-481b-a283-4ee45ecfe672)
