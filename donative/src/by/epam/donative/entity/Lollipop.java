package by.epam.donative.entity;

public class Lollipop extends Sweetness {

	private static final long serialVersionUID = -3064510294476647990L;
	private String producer;
	private String color;

	public Lollipop(String nameOfSweet, Integer price, String producer, String color) {
		super(nameOfSweet, price);
		this.producer = producer;
		this.color = color;
	}

	public Lollipop() {
		super();

	}

	public Lollipop(String nameOfSweet, Integer price) {
		super(nameOfSweet, price);

	}

	@Override
	public Object copy() {
		Lollipop copy = new Lollipop(getNameOfSweet(), getPrice(), producer, color);
		return copy;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((color == null) ? 0 : color.hashCode());
		result = prime * result + ((producer == null) ? 0 : producer.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Lollipop other = (Lollipop) obj;
		if (color == null) {
			if (other.color != null)
				return false;
		} else if (!color.equals(other.color))
			return false;
		if (producer == null) {
			if (other.producer != null)
				return false;
		} else if (!producer.equals(other.producer))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ", producer=" + producer + ", color=" + color + "]" + "\r";
	}

}
