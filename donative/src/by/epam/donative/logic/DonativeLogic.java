package by.epam.donative.logic;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.epam.donative.entity.Donative;
import by.epam.donative.entity.DonativeList;
import by.epam.donative.view.DonativeView;

public class DonativeLogic {

	public Integer totalPrice(Donative donative) {
		Integer total = 0;

		for (int i = 0; i < donative.getSweets().size(); i++) {
			total = total + donative.getSweets().get(i).getPrice();
		}
		total = total + donative.getPack().getPrice();

		return total;
	}

	public String enterFromConsole(String message) {

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println(message);

		while (!sc.hasNextLine()) {
			sc.next();
			System.out.println(message);
		}

		return sc.nextLine();
	}

	public void checkClient(String sweet, DonativeList donatives, DonativeLogic logic, DonativeView view) {

		boolean composition;
		boolean check;

		Pattern pattern = Pattern.compile("[а-яА-Я]+");
		Matcher m = pattern.matcher(sweet);

		check = true;
		composition = false;

		if (check == m.matches()) {
			for (int i = 0; i < donatives.getDonatives().size(); i++) {
				for (int j = 0; j < donatives.getDonatives().get(i).getSweets().size(); j++) {
					if (donatives.getDonatives().get(i).getSweets().get(j).getNameOfSweet().equalsIgnoreCase(sweet)) {
						view.print(donatives.getDonatives().get(i));
						view.printTotalPrice(logic.totalPrice(donatives.getDonatives().get(i)));
						composition = true;
						break;
					}
				}
			}
			if (composition == false) {
				System.out.println("Таких сладостей в составе подарка нет");
			}
		} else {
			System.out.println("Вы ввели недопустимые символы");
		}
	}
}
