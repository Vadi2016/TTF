/**
 * 
 */
package ru.requeststop;

import java.util.GregorianCalendar;

import ru.requeststop.model.Restaurant;
import ru.requeststop.model.Train;

/**
 * Класс реализаций функций для постороения маршрутов
 *  
 * @author Валерий Лиховских
 *
 */
public class FunctionService {

	/**
	 * Получить рассписание поезда по номеру билета пассажира.
	 * 
	 * Пример результата:
	 * 
	 *  {"number":"002Щ","date":1569687622006,"start":"Москва Яр","finish":"Владивосток","route":[
	 *    {"station":"Владимир -Пассажирский","arrival":"02:26 МСК","departure":"02:52 МСК","stoping":26,"code":"136691135","day":29},
	 *    {"station":"Н. Новгород -Московский","arrival":"05:37 МСК","departure":"05:49 МСК","stoping":12,"code":"173831393","day":29},
	 *    {"station":"Киров-Пассажирский","arrival":"11:48 МСК","departure":"12:03 МСК","stoping":15,"code":"817875152","day":29},
	 *    {"station":"Балезино","arrival":"16:35 МСК +1","departure":"17:01 МСК+1","stoping":26,"code":"1679014811","day":29},
	 *    {"station":"Пермь 2","arrival":"21:41 МСК +2","departure":"22:01 МСК+2","stoping":20,"code":"1820479916","day":29}]}
	 *    
	 * @param number номер билета на поезд
	 * @param lang язык вывода расписания поезда
	 * 
	 * @return рассписание поезда
	 */
	public Train searchByTicketNumber(String number, String lang) {
		return Train.getTrain002();
	}

	/**
	 * Получить рассписание поезда по дате оправления и номеру поезда
     * 
	 * Пример результата:
	 * 
	 *  {"number":"002Щ","date":1569687622006,"start":"Москва Яр","finish":"Владивосток","route":[
	 *    {"station":"Владимир -Пассажирский","arrival":"02:26 МСК","departure":"02:52 МСК","stoping":26,"code":"136691135","day":29},
	 *    {"station":"Н. Новгород -Московский","arrival":"05:37 МСК","departure":"05:49 МСК","stoping":12,"code":"173831393","day":29},
	 *    {"station":"Киров-Пассажирский","arrival":"11:48 МСК","departure":"12:03 МСК","stoping":15,"code":"817875152","day":29},
	 *    {"station":"Балезино","arrival":"16:35 МСК +1","departure":"17:01 МСК+1","stoping":26,"code":"1679014811","day":29},
	 *    {"station":"Пермь 2","arrival":"21:41 МСК +2","departure":"22:01 МСК+2","stoping":20,"code":"1820479916","day":29}]}
	 *    
     * @param station станция отправления
     * @param date дате отправления поезда
     * @param number номер поезда
	 * 
	 * @return рассписание запрошенного маршрута или null, если маршрут не найден
	 */
	public Train searchByTrainNumber(String station, GregorianCalendar date, String number, String lang) {
		return Train.getTrain002();
	}


	/**
	 * Получить описание и меню ресторана
	 * 
	 * Пример результата:
	 * 
	 * {"city":"Киров-Пассажирский","name":"Додо Пицца","image":"dodo.jpg","rating":4.0,"begin":10,"end":24,
	 *    "minSumma":null,"code":"531010245","kitchen":["итальянская"],"menu":[
	 *    {"name":"Пепперони Фреш с перцем","description":"Сладкий перец, пикантная пепперони, моцарелла, томатный соус","price":245,"image":" Пепперони Фреш с перцем.jpg"},
	 *    {"name":"Пепперони Фреш с томатами","description":" Томаты, пикантная пепперони, моцарелла, томатный соус ","price":245,"image":"Пепперони Фреш с томатами.jpg"},
	 *    {"name":"Сырная","description":" Томатный соус, моцарелла ","price":245,"image":"Сырная.jpg"},
	 * ]}
	 * 
	 * @param code код ресторана
	 * @param lang язык запроса
	 * 
	 * @return ресторан
	 */
	public Restaurant getRestaurant(String code, String lang) {
		return Restaurant.getRestaurant(code);
	}

	/**
	 * Получить список рестораторов города/станции
	 * 
	 * Пример результата:
	 * 
	 * [{"city":"Киров-Пассажирский","name":"Додо Пицца","image":"dodo.jpg","rating":4.0,"begin":10,"end":24,
	 *    "minSumma":null,"code":"531010245","kitchen":["итальянская"],"menu":[
	 *    {"name":"Пепперони Фреш с перцем","description":"Сладкий перец, пикантная пепперони, моцарелла, томатный соус","price":245,"image":" Пепперони Фреш с перцем.jpg"},
	 *    {"name":"Пепперони Фреш с томатами","description":" Томаты, пикантная пепперони, моцарелла, томатный соус ","price":245,"image":"Пепперони Фреш с томатами.jpg"},
	 *    {"name":"Сырная","description":" Томатный соус, моцарелла ","price":245,"image":"Сырная.jpg"},
	 * ]}]
	 * 
	 * @param code код города/станции
	 * @param lang язык запроса
	 * 
	 * @return рестораны
	 */
	public Restaurant[] getRestaurants(String code, String lang) {
		return Restaurant.getRestaurants(code);
	}
	
}
