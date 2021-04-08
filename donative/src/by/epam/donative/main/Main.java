package by.epam.donative.main;

import by.epam.donative.entity.*;
import by.epam.donative.logic.DonativeLogic;
import by.epam.donative.view.DonativeView;

/*Создать консольное приложение, удовлетворяющее следующим требованиям:
 * -Корректно спроектируйте и реализуйте предметную область задачи;
 * -Для создания объектов из иерархии классов продумайте возможность использования порождающих шаблонов проектирования;
 * -Реализуйте проверку данных вводимых пользователем, но не на стороне клиента;
 * -Для проверки корректности переданных данных можно применить регулярные выражения;
 * -Меню выбора действий пользователем можно не реализовывать, используйте заглушку;
 * -Особое условие:переопределить, где необходимо, методы toString(), equals(),hashCode();
 * 
 *  Вариант B.Подарки.Реализовать приложение, позволяющее создавать подарки(объект, представляющий
 *  собой подарок).Состовляющими подарка являются сладости и упаковка.
 */

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException {

		String client;

		DonativeList donatives = new DonativeList();
		DonativeLogic logic = new DonativeLogic();
		DonativeView view = new DonativeView();

		Sweetness chocolate = new Chocolate("Шоколад", 6, "Коммунарка", "Черный");
		Sweetness cookie = new Cookie("Печенье", 3, "Спартак", "Бисквит");
		Sweetness doughnut = new Doughnut("Пончик", 1, "Шоколадный");
		Doughnut doughnutPink = new Doughnut("Пончик", 1, "Розовый");
		Sweetness lollipop = new Lollipop("Леденец", 3, "Рошен", "Разноцветный");

		Donative donative = new Donative(chocolate);

		Sweetness chocolateDubl = donative.cloneSweetness();
		donative.setSweet(cookie);
		Sweetness cookieDubl = donative.cloneSweetness();

		donative.addSweet(chocolate);
		donative.addSweet(chocolateDubl);
		donative.addSweet(cookie);
		donative.addSweet(cookieDubl);
		donative.setPack(new Wrapping("Цветная бумага", "Розовый", 2));

		Donative donative2 = new Donative();

		donative2.setSweet(doughnut);
		Sweetness dougnutDubl = donative2.cloneSweetness();
		Sweetness dougnutDubl2 = donative2.cloneSweetness();

		donative2.setSweet((Sweetness) doughnutPink);
		Sweetness dougnutDubl3 = donative2.cloneSweetness();
		doughnutPink.setColoOfGlaze("Белый");
		Sweetness dougnutDubl4 = donative2.cloneSweetness();

		donative2.addSweet(doughnut);
		donative2.addSweet(dougnutDubl);
		donative2.addSweet(dougnutDubl2);
		donative2.addSweet((Sweetness) doughnutPink);
		donative2.addSweet(dougnutDubl3);
		donative2.addSweet(dougnutDubl4);
		donative2.setPack(new Wrapping("Цветная бумага", "Черный", 2));

		Donative donative3 = new Donative();

		donative2.setSweet(lollipop);
		Sweetness lollipopDubl = donative2.cloneSweetness();
		Sweetness lollipopDubl2 = donative2.cloneSweetness();

		donative3.addSweet(lollipop);
		donative3.addSweet(lollipopDubl);
		donative3.addSweet(lollipopDubl2);
		donative3.setPack(new Wrapping("Пакет", "Прозрачный", 2));

		donatives.addDonative(donative);
		donatives.addDonative(donative2);
		donatives.addDonative(donative3);

		view.printAllDonative(donatives);

		client = logic.enterFromConsole("Введите сладость, котораяй должна входить в состав подарка");
		logic.checkClient(client, donatives, logic, view);
	}
}
