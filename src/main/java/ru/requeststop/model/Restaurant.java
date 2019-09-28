/**
 * 
 */
package ru.requeststop.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Date;


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
	int begin; // начало работы ресторана
	int end; // окончание работы ресторана
	public void setBegin(int begin) {
		this.begin = begin;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getBegin() {
		return begin;
	}

	public int getEnd() {
		return end;
	}

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
		begin = 10;
		end = 24;
		
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
	
	public static Restaurant getRestaurant(String code) {
		return restaurants.get(code);
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
		
		String[] kitchen0 = new String[1];
		kitchen0[0] = "русская";
		Dish[] menu0 = new Dish[1];
		menu0[0] = new Dish("Блюдо1", "Огурцы, помидоры, ...", new BigDecimal("99.99"), "image1.jpg");
		Restaurant restaurant = new Restaurant(city, "name1", "image1", new BigDecimal("4.5"), null, kitchen0, menu0);
		System.out.println(restaurant.name + ": " + restaurant.code);
		
		list.add(restaurant);
		restaurants.put(restaurant.getCode(), restaurant);

		String[] kitchen1 = new String[2];
		kitchen1[0] = "русская";
		kitchen1[1] = "итальянская";
		Dish[] menu1 = new Dish[2];
		menu1[0] = new Dish("Блюдо1", "Огурцы, помидоры, ...", new BigDecimal("99.99"), "image1.jpg");
		menu1[1] = new Dish("Блюдо2", "Огурцы, помидоры, ...", new BigDecimal("199.99"), "image2.jpg");
		restaurant = new Restaurant(city, "name2", "image2", new BigDecimal("4.0"), null, kitchen1, menu1);
		System.out.println(restaurant.name + ": " + restaurant.code);
		
		list.add(restaurant);
		restaurants.put(restaurant.getCode(), restaurant);
		
		String[] kitchen2 = new String[1];
		kitchen2[0] = "итальянская";
		Dish[] menu2 = new Dish[29];
		menu2[0] = new Dish("Пепперони Фреш с перцем", "Сладкий перец, пикантная пепперони, моцарелла, томатный соус", new BigDecimal("245"), " Пепперони Фреш с перцем.jpg");
		menu2[1] = new Dish("Пепперони Фреш с томатами", " Томаты, пикантная пепперони, моцарелла, томатный соус ", new BigDecimal("245"), "Пепперони Фреш с томатами.jpg");
		menu2[2] = new Dish("Сырная", " Томатный соус, моцарелла ", new BigDecimal("245"), "Сырная.jpg");
		menu2[3] = new Dish("Ветчина и сыр", " Моцарелла, ветчина, сливочный соус", new BigDecimal("295"), "Ветчина и сыр.jpg");
		menu2[4] = new Dish("Кисло-сладкий цыпленок", " Кисло-сладкий соус, моцарелла, цыпленок, томатный соус", new BigDecimal("295"), "Кисло-сладкий цыпленок.jpg");
		menu2[5] = new Dish("Брынза и моцарелла", " Кубики брынзы, моцарелла, сливочный соус ", new BigDecimal("295"), "Брынза и моцарелла.jpg");
		menu2[6] = new Dish("Испанские колбаски Чоризо", "Смесь сыров чеддер и пармезан, пикантная чоризо, моцарелла, соус чипотле", new BigDecimal("315"), "Испанские колбаски Чоризо.jpg");
		menu2[7] = new Dish("Чизбургер-пицца", " Соус бургер, мясной соус болоньезе, красный лук, моцарелла, томаты, соленые огурчики", new BigDecimal("345"), "Чизбургер-пицца.jpg");
		menu2[8] = new Dish("Крэйзи пепперони", " Пикантная пепперони, цыпленок, моцарелла, томатный соус, кисло-сладкий соус ", new BigDecimal("345"), "Крэйзи пепперони.jpg");
		menu2[9] = new Dish("Креветки по-азиатски", " Креветки, шампиньоны, моцарелла, кисло-сладкий соус, черный кунжут ", new BigDecimal("345"), "Креветки по-азиатски.jpg");
		menu2[10] = new Dish("Пицца из половинок", " Соберите свою пиццу 35 см с двумя разными вкусами ", new BigDecimal("0"), "Пицца из половинок.jpg");
		menu2[11] = new Dish("Пепперони", "Пикантная пепперони, томатный соус, моцарелла ", new BigDecimal("345"), "Пепперони.jpg");
		menu2[12] = new Dish("Четыре сыра"," Сливочный соус, сыр блю чиз, моцарелла, смесь сыров чеддер и пармезан", new BigDecimal("395"), "Четыре сыра.jpg");
		menu2[13] = new Dish("Додо"," Ветчина, фарш из говядины, пикантная пепперони, томатный соус, шампиньоны, сладкий перец, красный лук, моцарелла, маслины", new BigDecimal("395"), "Додо.jpg");
		menu2[14] = new Dish("Мясная", " Цыпленок, ветчина, пикантная пепперони, томатный соус, острая чоризо, моцарелла", new BigDecimal("395"), "Мясная.jpg");
		menu2[15] = new Dish("Мексиканская", " Цыпленок, томатный соус, сладкий перец, красный лук, моцарелла, острый хлопанью, томаты, соус сальса " ,new BigDecimal("395"), "Мексиканская.jpg");
		menu2[16] = new Dish("Ветчина и грибы", " Ветчина, томатный соус, шампиньоны, моцарелла", new BigDecimal("315"), "Ветчина и грибы.jpg");
		menu2[17] = new Dish("Маргарита", " Итальянские травы, томатный соус, моцарелла, томаты", new BigDecimal("315"), "Маргарита.jpg");
		menu2[18] = new Dish("Гавайская", " Цыпленок, томатный соус, моцарелла, ананасы ", new BigDecimal("345"), "Гавайская.jpg");
		menu2[19] = new Dish("Пицца-пирог", " Молоко сгущенное, брусника, ананасы ", new BigDecimal("315"), "Пицца-пирог.jpg");
		menu2[20] = new Dish("Четыре сезона", " Итальянские травы, ветчина, пикантная пепперони, томатный соус, кубики брынзы, шампиньоны, моцарелла, томаты ", new BigDecimal("345"), "Четыре сезона.jpg");
		menu2[21] = new Dish("Супермясная", " Цыпленок, фарш из говядины, пикантная пепперони, томатный соус, острая чоризо, моцарелла, бекон", new BigDecimal("445"), "Супермясная.jpg");
		menu2[22] = new Dish("Двойная пепперони", " Пикантная пепперони, томатный соус, моцарелла ", new BigDecimal("395"), "Двойная пепперони.jpg");
		menu2[23] = new Dish("Цыпленок ранч", " Цыпленок, ветчина, соус ранч, моцарелла, томаты, чеснок ", new BigDecimal("395"), "Цыпленок ранч.jpg");
		menu2[24] = new Dish("Сырный цыпленок", " Сырный соус, цыпленок, томаты, моцарелла ", new BigDecimal("345"), "Сырный цыпленок.jpg");
		menu2[25] = new Dish("Овощи и грибы", " Итальянские травы, томатный соус, кубики брынзы, шампиньоны, сладкий перец, красный лук, моцарелла, маслины, томаты ", new BigDecimal("345"), "Овощи и грибы.jpg");
		menu2[26] = new Dish("Итальянская", " Итальянские травы, пикантная пепперони, томатный соус, шампиньоны, моцарелла, маслины ", new BigDecimal("345"), "Итальянская.jpg");
		menu2[27] = new Dish("Цыпленок барбекю", " Цыпленок, соус барбекю, томатный соус, красный лук, моцарелла, бекон ", new BigDecimal("395"), "Цыпленок барбекю.jpg");
		menu2[28] = new Dish("Дон Бекон9", " Цыпленок, пикантная пепперони, томатный соус, красный лук, моцарелла, бекон", new BigDecimal("395"), "Дон Бекон.jpg");
		restaurant = new Restaurant(city, "Додо Пицца", "dodo.jpg", new BigDecimal("4.0"), null, kitchen2, menu2);
		System.out.println(restaurant.name + ": " + restaurant.code);

		list.add(restaurant);
		restaurants.put(restaurant.getCode(), restaurant);

		cityRestaurans.put(key, list);
	}
}
