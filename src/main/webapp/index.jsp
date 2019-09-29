<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><html>
<head>
<title>TooTooWood</title>
<meta charset="UTF-8">
</head>
<body>
<h1>TooTooWooD - сервер приложений</h1>
<h2>Примеры возова сервисов приложения.</h2>
<ul>
<li><a href="cxf/service/restaurants?code=817875152">Список ресторанов на станции по коду города/станции</a>
<li><a href="cxf/service/restaurant?code=531010245">Меню ресторана DODO Pizza по коду ресторана</a>
<li><a href="cxf/service/restaurant?code=922460119">Меню ресторана Name2 по коду ресторана</a>
<li><a href="cxf/service/findByTicket?number=74897183557290">Получить расписание движения поездов по номеру билета</a>
<li><a href="cxf/service/findByNumber?number=002&date=2019-09-28@station=817875152">Получить расписание движения поездов по номеру поезда, дате и станции отправления</a>
</ul>

<h2>Пример интерфейса аргегатора услуги (ФПК).</h2>
<a href="fpk/index.html">Интерфейс агрегатора услуги</a>

<h2>Пример интерфейса ресторана.</h2>
<a href="image/page4.jpg">Интерфейс ресторана</a>
</body>
</html>
