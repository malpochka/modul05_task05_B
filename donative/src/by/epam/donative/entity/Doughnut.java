package by.epam.donative.entity;

public class Doughnut extends Sweetness {

	private static final long serialVersionUID = 1521138890465818257L;
	private String colorOfGlaze;

	public Doughnut(String nameOfSweet, Integer price, String colorOfGlaze) {
		super(nameOfSweet, price);
		this.colorOfGlaze = colorOfGlaze;
	}

	public Doughnut() {
		super();
	}

	public Doughnut(String nameOfSweet, Integer price) {
		super(nameOfSweet, price);
	}

	@Override
	public Object copy() {
		Doughnut copy = new Doughnut(getNameOfSweet(), getPrice(), colorOfGlaze);
		return copy;
	}

	public String getColorOfGlaze() {
		return colorOfGlaze;
	}

	public void setColoOfGlaze(String colorOfGlaze) {
		this.colorOfGlaze = colorOfGlaze;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((colorOfGlaze == null) ? 0 : colorOfGlaze.hashCode());
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
		Doughnut other = (Doughnut) obj;
		if (colorOfGlaze == null) {
			if (other.colorOfGlaze != null)
				return false;
		} else if (!colorOfGlaze.equals(other.colorOfGlaze))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return super.toString() + ", coloOfGlaze=" + colorOfGlaze + "]" + "\r";
	}

}
