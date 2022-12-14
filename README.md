# :video_game: Тестове завдання на хакатон 3.0 (NoNamed)
  Створено концепцію програмного застосунку, який відображає механіку взаємодії з ігровим світом.
  
  :bangbang: Для отримання гри потрібно завантажити NoNamedTestgame.zip->розпакувати, відкрити папку "bin" та запусити file:app.bat. 
  
   ![This is an image](/readME_File.png)
   
## Основні блоки гри:
 :white_check_mark: Головне меню;
 
 :white_check_mark: Налаштування гри;
 
 :white_check_mark: Ігрове вікно;
 
 :white_check_mark: Меню паузи;
 
 :white_check_mark: Місія завершена успішно;
 
 :white_check_mark: Місія завершена із поразкою.
 
 ## Знайомство
  Після запуску nameGame.exe перед користувачем відображається головне меню гри, на якому зображено три пункти меню: 
  
   :one: Нова гра - створює нову сесію гри; 
   
   :two: Налаштування - відкриває налаштування ігрового процесу, який можна змінити під свої потреби; 
   
   :three: Вихід - закриває програмний застосунок.
   
   ## Ігровий процес
   :star: Нова гра запускає світ, на якому розташовано будинок героя, будинок ворогів та головний персонаж (герой). Керування реалізовано за допомогою стрілочок на клавіатурі: :arrow_up::arrow_down::arrow_right::arrow_left: Поточна ціль героя відображається у правому верхньому куті ігрової сцени. Вороги :space_invader: спавняться безкінечно зі свого будинку, їх потрібно вбивати. Також для ускладнення ігрового процесу додано умову збору ключів :key:, які відкривають доступ до будинку героя, тим самим підтверджується додаткова умова завершення місії.
  
   :star: Бій ворогів та героя відбувається при колізії їхніх графічних примітивів. Якщо досягнуто ціль по кількості вбитих ворогів та зібрано усі ключики від будинку головного персонажа, то потрібно піти в будинок - місію буде завершено. 
  
   :star: Якщо ж вороги отримали перевагу над героєм й рівень здоров'я опустився до нуля - ігрова сесія завершується поразкою, відкривається додаткове вікно інформування із можливістю подальшого вибору дій.

:star: Також під час ігрового процесу в користувача є додаткова можливість зупинки гри за допомогою клавіші "ESCAPE" - після натиснення відкривається меню паузи із можливістю вибору таких дій:

   :one: Продовжити; 
   
   :two: Зберегти; 
   
   :three: Головне меню.
