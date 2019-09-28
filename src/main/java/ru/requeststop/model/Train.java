/**
 * 
 */
package ru.requeststop.model;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author Валерий Лиховских
 *
 */
public class Train implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5353720433335139856L;
	
	String number;
	GregorianCalendar date; 
	String start;
	String finish;
	
	Station[] route;

	/**
	 * @param number
	 * @param date
	 * @param start
	 * @param finish
	 * @param route
	 */
	public Train(String number, GregorianCalendar date, String start, String finish, Station[] route) {
		super();
		this.number = number;
		this.date = date;
		this.start = start;
		this.finish = finish;
		this.route = route;
	}

	public String getNumber() {
		return number;
	}

	public GregorianCalendar getDate() {
		return date;
	}

	public String getStart() {
		return start;
	}

	public String getfinish() {
		return finish;
	}

	public Station[] getRoute() {
		return route;
	}

	public static Train getTrain002() {
		GregorianCalendar calendar = new GregorianCalendar();
		GregorianCalendar temp = new GregorianCalendar();
		temp.setGregorianChange(new Date(0));
		temp.set(Calendar.YEAR, calendar.get(Calendar.YEAR));
		temp.set(Calendar.MONTH, calendar.get(Calendar.MONTH));
		temp.set(Calendar.DAY_OF_MONTH, calendar.get(Calendar.DAY_OF_MONTH));
		String number = "002Щ";
		GregorianCalendar date = (GregorianCalendar) temp.clone();
		String start = "Москва Яр";
		String finish = "Владивосток";
		Station[] route = new Station[5];
		temp.add(Calendar.DAY_OF_MONTH, 1);
		route[0] = new Station("Владимир -Пассажирский", "02:26 МСК", "02:52 МСК", temp, 26);
		route[1] = new Station("Н. Новгород -Московский", "05:37 МСК", "05:49 МСК", temp, 12);
		route[2] = new Station("Киров-Пассажирский", "11:48 МСК", "12:03 МСК", temp, 15);
		route[3] = new Station("Балезино", "16:35 МСК +1", "17:01 МСК+1", temp, 26);
		route[4] = new Station("Пермь 2", "21:41 МСК +2", "22:01 МСК+2", temp, 20);
		return new Train(number, date, start, finish, route);
				
	}
	
}
