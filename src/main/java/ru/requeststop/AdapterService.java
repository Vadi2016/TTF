/**
 * 
 */
package ru.requeststop;

import java.util.GregorianCalendar;

import ru.requeststop.model.Dish;
import ru.requeststop.model.Restaurant;
import ru.requeststop.model.Train;
import ru.funsys.avalanche.AvalancheRemote;

/**
 * @author Валерий Лиховских
 *
 */
public interface AdapterService {

	/**
	 * Получить рассписание поезда по номеру билета пассажира.
	 * 
	 * В этом методе сперва выбираются остановки общественного транспорта в указанном
	 * радиусе от начальной и конечной точек. Далее определяютс маршруты, проходящие 
	 * через эти остановки и выбираются только маршруты пересечения.
	 *  
	 * @param number номер билета на поезд
	 * @param lang язык вывода расписания поезда
	 * 
	 * @return рассписание поезда
	 */
	public Train searchByTicketNumber(String number, String lang) throws AvalancheRemote;


	/**
	 * Получить рассписание поезда по дате оправления и номеру поезда
     * 
	 * @param station станция отправления
	 * @param date дата отправления
	 * @param number номер поезда
	 * @param lang язак запроса
	 * 
	 * @return расписание поезда
	 * 
	 * @throws AvalancheRemote
	 */
	public Train searchByTrainNumber(String station, GregorianCalendar date, String number, String lang) throws AvalancheRemote; 

	/**
	 * Получить меню ресторана
	 * 
	 * @param code код ресторана
	 * @param lang язык запроса
	 * 
	 * @return меню
	 */
	public Dish[] getMenu(String code, String lang)  throws AvalancheRemote;

	/**
	 * Получить список ресторанов
	 * 
	 * @param code код города/станции
	 * @param lang язык запроса
	 * 
	 * @return список расторан
	 * 
	 * @throws AvalancheRemote
	 */
	public Restaurant[] getRestaurants(String code, String lang) throws AvalancheRemote;

}
