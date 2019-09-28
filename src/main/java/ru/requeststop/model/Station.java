/**
 * 
 */
package ru.requeststop.model;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author Валерий Лиховских
 *
 */
public class Station {

	String station;
	String arrival; // прибытие
	String departure; // отправление
	GregorianCalendar date; // дата стоянки
	int stoping; // стоянка
	/**
	 * @param station
	 * @param arrival
	 * @param departure
	 * @param date
	 * @param stoping
	 */
	public Station(String station, String arrival, String departure, GregorianCalendar date, int stoping) {
		super();
		this.station = station;
		this.arrival = arrival;
		this.departure = departure;
		this.date = date;
		this.stoping = stoping;
	}
	public String getStation() {
		return station;
	}
	public String getArrival() {
		return arrival;
	}
	public String getDeparture() {
		return departure;
	}
	public int getDay() {
		return date.get(Calendar.DAY_OF_MONTH);
	}
	public int getStoping() {
		return stoping;
	}
	

	
}

