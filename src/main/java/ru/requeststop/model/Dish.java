/**
 * 
 */
package ru.requeststop.model;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Блюдо
 * 
 * @author Валерий Лиховских
 *
 */
public class Dish  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5652397831110933826L;
	
	String name;
	String description;
	BigDecimal price;
	String image; // фото блюда

	/**
	 * @param name bv
	 * @param description
	 * @param price
	 */
	public Dish(String name, String description, BigDecimal price, String image) {
		this.name = name;
		this.description = description;
		this.price = price;
		this.image = image;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public String getImage() {
		return image;
	}
	
	
}
