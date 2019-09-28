/**
 * 
 */
package ru.requeststop.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;


/**
 * @author Валерий Лиховских
 *
 */
public class Restaurant implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6915553501993557131L;
	
	String city; // название станции/города
	String name;
	String image;
	BigDecimal rating; // кухня
	BigDecimal minSumma;
	String code;
	
	String[] kitchen; // кухня - русская, грузинская, японская
	
	Dish[] menu;

	/**
	 * @param name
	 * @param rating
	 * @param minSumma
	 * @param kitchen
	 * @param menu
	 */
	public Restaurant(String city, String name, String image, BigDecimal rating, BigDecimal minSumma, String[] kitchen, Dish[] menu) {
		super();
		this.city = city;
		this.name = name;
		this.image = image;
		this.rating = rating;
		this.minSumma = minSumma;
		this.kitchen = kitchen;
		this.menu = menu;
		
		int hash = name.hashCode() + city.hashCode();
		if (hash < 0) hash = hash * -1;
		code = new Integer(hash).toString();
	}

	public String getCity() {
		return city;
	}

	public String getName() {
		return name;
	}

	public String getImage() {
		return image;
	}

	public BigDecimal getRating() {
		return rating;
	}

	public BigDecimal getMinSumma() {
		return minSumma;
	}

	public String[] getKitchen() {
		return kitchen;
	}

	public Dish[] getMenu() {
		return menu;
	}
	
	/**
	 * Получить код ресторана
	 * @return
	 */
	public String getCode() {
		return code;
	}
	
	public static Hashtable<String, ArrayList<Restaurant>> cityRestaurans = new Hashtable<String, ArrayList<Restaurant>>();
	public static Hashtable<String, Restaurant> restaurants = new Hashtable<String, Restaurant>();

	public static Restaurant[] getRestaurants(String code) {
		List<Restaurant> list = cityRestaurans.get(code);
		if (list == null) list = new ArrayList<Restaurant>();
		Restaurant[] result = new Restaurant[list.size()];
		return (Restaurant[]) list.toArray(result);
	}
	
	public static Dish[] getMenu(String code) {
		Restaurant restaurant = restaurants.get(code);
		if (restaurant != null) {
			if (restaurant.menu != null) {
				return restaurant.menu; 
			}
		}
		return new Dish[0];
	}
	
	public static void init() {
	}
	
	static {
		String city = "Киров-Пассажирский";
		ArrayList<Restaurant> list = new ArrayList<Restaurant>();
		int code = city.hashCode();
		if (code < 0) code = code * 1;
		String key = new Integer(code).toString();
		System.out.println(city + ": " + key);
		
		String[] kitchen1 = new String[1];
		kitchen1[0] = "русская";
		Dish[] menu1 = new Dish[1];
		menu1[0] = new Dish("Блюдо1", "Огурцы, помидоры, ...", new BigDecimal("99.99"), "image1.jpg");
		Restaurant restaurant = new Restaurant(city, "name1", "image1", new BigDecimal("4.5"), null, kitchen1, menu1);
		System.out.println(restaurant.name + ": " + restaurant.code);
		
		list.add(restaurant);
		restaurants.put(restaurant.getCode(), restaurant);

		String[] kitchen2 = new String[2];
		kitchen2[0] = "русская";
		kitchen2[1] = "итальянская";
		Dish[] menu2 = new Dish[2];
		menu2[0] = new Dish("Блюдо1", "Огурцы, помидоры, ...", new BigDecimal("99.99"), "image1.jpg");
		menu2[1] = new Dish("Блюдо2", "Огурцы, помидоры, ...", new BigDecimal("199.99"), "image2.jpg");
		restaurant = new Restaurant(city, "name2", "image2", new BigDecimal("4.0"), null, kitchen2, menu2);
		System.out.println(restaurant.name + ": " + restaurant.code);
		
		list.add(restaurant);
		restaurants.put(restaurant.getCode(), restaurant);
		
		cityRestaurans.put(key, list);
	}
}
