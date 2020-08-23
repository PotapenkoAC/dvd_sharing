# dvd_sharing
This is demo project of dvd sharing system. 

Требования: 
Необходимо написать автоматизацию ресурса по обмену dvd дисками, веб-приложение - только REST API (UI не надо).
Есть коллекция дисков у каждого участника. Диски можно брать и отдавать. В системе три сущности: Disk (DVD-диск), User, TakenItem (связка User-Disk)
В системе должно быть пять эранов (экраны делать не надо, надо придумать API для их обслуживания):
- авторизация,
- список собственных дисков у каждого пользователя,
- список свободных дисков (у всех пользователей невзятые),
- список дисков, взятых пользователем;
- список дисков, взятых у пользователя (с указанием, кто взял)
Диск можно взять и отдать (без денежных расчётов).
СУБД - на выбор, можно встроенную (hsql, derby).
Работа с СУБД – Hibernate (http://hibernate.org), простого JDBC не достаточно.
Для организации работы с ORM и в качестве «клея» для слоев приложения использовать Spring Boot.
Обязательно написать скрипт сборки проекта при помощи Maven или gradle
 
Оформление результата:
Проект на bitbucket/github содержащий исходники, файлы сборки, библиотеки, SQL-скрипты создания базы и заполнения ее начальными данными -- в общем, полный набор для сборки проекта и запуска проекта.
Так же, предоставить краткую инструкцию по сборке и установке.
