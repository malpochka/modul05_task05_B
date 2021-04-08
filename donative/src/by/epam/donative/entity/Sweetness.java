package by.epam.donative.entity;

import java.io.Serializable;

public class Sweetness implements Serializable, Copyable {

	private static final long serialVersionUID = -4657706959498816162L;
	private String nameOfSweet;
	private Integer price;

	public Sweetness(String nameOfSweet, Integer price) {
		super();
		this.nameOfSweet = nameOfSweet;
		this.price = price;
	}

	public Sweetness() {

	}

	@Override
	public Object copy() {
		Sweetness copy = new Sweetness(nameOfSweet, price);
		return copy;
	}

	public String getNameOfSweet() {
		return nameOfSweet;
	}

	public void setNameOfSweet(String nameOfSweet) {
		this.nameOfSweet = nameOfSweet;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameOfSweet == null) ? 0 : nameOfSweet.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sweetness other = (Sweetness) obj;
		if (nameOfSweet == null) {
			if (other.nameOfSweet != null)
				return false;
		} else if (!nameOfSweet.equals(other.nameOfSweet))
			return false;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return " [nameOfSweet=" + nameOfSweet + ", price=" + price;
	}

}
