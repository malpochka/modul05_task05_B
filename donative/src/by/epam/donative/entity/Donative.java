package by.epam.donative.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Donative implements Serializable {

	private static final long serialVersionUID = -6123235944912836722L;
	private Wrapping pack;
	private Sweetness sweet;
	private List<Sweetness> sweets;
	{
		sweets = new ArrayList<Sweetness>();
	}

	public Donative(Wrapping pack) {
		this.pack = pack;
	}

	public Donative(Sweetness sweet) {
		this.sweet = sweet;
	}

	public Donative() {
	}

	public void addSweet(Sweetness sweet) {
		sweets.add(sweet);
	}

	public void removeSweet(Sweetness sweet) {
		sweets.remove(sweet);
	}

	public Sweetness cloneSweetness() {
		return (Sweetness) sweet.copy();
	}

	public Wrapping cloneWrapping() {
		return (Wrapping) pack.copy();
	}

	public Wrapping getPack() {
		return pack;
	}

	public void setPack(Wrapping pack) {
		this.pack = pack;
	}

	public List<Sweetness> getSweets() {
		return sweets;
	}

	public void setSweets(List<Sweetness> sweets) {
		this.sweets = sweets;
	}

	public Sweetness getSweet() {
		return sweet;
	}

	public void setSweet(Sweetness sweet) {
		this.sweet = sweet;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pack == null) ? 0 : pack.hashCode());
		result = prime * result + ((sweet == null) ? 0 : sweet.hashCode());
		result = prime * result + ((sweets == null) ? 0 : sweets.hashCode());
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
		Donative other = (Donative) obj;
		if (pack == null) {
			if (other.pack != null)
				return false;
		} else if (!pack.equals(other.pack))
			return false;
		if (sweet == null) {
			if (other.sweet != null)
				return false;
		} else if (!sweet.equals(other.sweet))
			return false;
		if (sweets == null) {
			if (other.sweets != null)
				return false;
		} else if (!sweets.equals(other.sweets))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Donative:" + "\r" + pack + "\r" + "sweets=" + sweets + "\r";
	}

}
