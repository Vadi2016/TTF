/**
 * 
 */
package ru.requeststop;



import java.util.GregorianCalendar;

import ru.funsys.avalanche.AvalancheRemote;
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
	 * В этом методе сперва выбираются остановки общественного транспорта в указанном
	 * радиусе от начальной и конечной точек. Далее определяютс маршруты, проходящие 
	 * через эти остановки и выбираются только маршруты пересечения.
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
     * @param station станция отправления
     * @param date дате отправления поезда
     * @param number номер поезда
	 * 
	 * @return рассписание запрошенного маршрута или null, если маршрут не найден
	 */
	public Train searchByTrainNumber(String station, GregorianCalendar date, String number, String lang) {
		return Train.getTrain002();
	}


}
