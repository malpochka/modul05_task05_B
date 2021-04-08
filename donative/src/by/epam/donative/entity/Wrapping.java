package by.epam.donative.entity;

import java.io.Serializable;

public class Wrapping implements Serializable, Copyable {

	private static final long serialVersionUID = 4089739503059070607L;
	private String composition;
	private String color;
	private Integer price;

	public Wrapping(String composition, String color, Integer price) {
		super();
		this.composition = composition;
		this.color = color;
		this.price = price;
	}

	public Wrapping() {
		super();
	}

	@Override
	public Object copy() {
		Wrapping copy = new Wrapping(composition, color, price);
		return copy;

	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
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
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((composition == null) ? 0 : composition.hashCode());
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
		Wrapping other = (Wrapping) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (composition == null) {
			if (other.composition != null)
				return false;
		} else if (!composition.equals(other.composition))
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
		return "Wrapping [composition=" + composition + ", color=" + color + ", price=" + price + "]";
	}

}
