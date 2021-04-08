package by.epam.donative.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class DonativeList implements Serializable {

	private static final long serialVersionUID = 7658902230377977414L;
	private List<Donative> donatives;
	{
		donatives = new ArrayList<Donative>();
	}

	public DonativeList() {

	}

	public void addDonative(Donative donative) {
		donatives.add(donative);
	}

	public List<Donative> getDonatives() {
		return donatives;
	}

	public void setDonatives(List<Donative> donatives) {
		this.donatives = donatives;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((donatives == null) ? 0 : donatives.hashCode());
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
		DonativeList other = (DonativeList) obj;
		if (donatives == null) {
			if (other.donatives != null)
				return false;
		} else if (!donatives.equals(other.donatives))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ListDonative donatives=" + donatives;
	}

}
