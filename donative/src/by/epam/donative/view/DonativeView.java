package by.epam.donative.view;

import by.epam.donative.entity.Donative;
import by.epam.donative.entity.DonativeList;

public class DonativeView {

	public void print(Donative donative) {
		System.out.println("Состав подарка");
		for (int i = 0; i < donative.getSweets().size(); i++) {
			System.out.println(donative.getSweets().get(i));
		}
		System.out.println(donative.getPack());
	}

	public void printTotalPrice(Integer price) {
		System.out.println();
		System.out.println("Общая стоимость подарка равна: " + price);
	}

	public void printAllDonative(DonativeList donatives) {
		System.out.println("Список подарков");
		for (Donative d : donatives.getDonatives()) {
			System.out.println(d);
		}
	}

}
