package by.epam.donative.entity;

public class Chocolate extends Sweetness {

	private static final long serialVersionUID = -2040720323922552442L;
	private String producer;
	private String sort;

	public Chocolate(String nameOfSweet, Integer price, String producer, String sort) {
		super(nameOfSweet, price);
		this.producer = producer;
		this.sort = sort;
	}

	public Chocolate() {
		super();

	}

	public Chocolate(String nameOfSweet, Integer price) {
		super(nameOfSweet, price);

	}

	@Override
	public Object copy() {
		Chocolate copy = new Chocolate(getNameOfSweet(), getPrice(), producer, sort);
		return copy;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((producer == null) ? 0 : producer.hashCode());
		result = prime * result + ((sort == null) ? 0 : sort.hashCode());
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
		Chocolate other = (Chocolate) obj;
		if (producer == null) {
			if (other.producer != null)
				return false;
		} else if (!producer.equals(other.producer))
			return false;
		if (sort == null) {
			if (other.sort != null)
				return false;
		} else if (!sort.equals(other.sort))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ", producer=" + producer + ", sort=" + sort + "]" + "\r";
	}

}
