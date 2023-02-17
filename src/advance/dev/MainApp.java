package advance.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Person person[] = new Person[3];
		input(person);
		print(person);
		sort(person);
	}
		private static void sort(Person[] person) {
			for (int i = 0; i < person.length -1; i++) {
			for (int j = i + 1; j < person.length; j++) {
					if (person[i].getDiemTB() > person[j].getDiemTB()) {
						Person diemTB = person[i];
						person[i] = person[j];
						person[j] = diemTB;
					}
		}
}
	}
		private static void print(Person[] person) {
		for (int i = 0; i < person.length; i++) {
			System.out.println(person[i].toString());
		}
	}
		private static void input(Person[] person) {
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < person.length; i++) {
				System.out.format("Person a[%d]",i);
				System.out.println("Nhap ten");
				String ten = sc.next();
				System.out.println("Nhap tuoi");
				int tuoi = sc.nextInt();
				System.out.println("Nhap dia chi");
				String diaChi = sc.next();
				System.out.println("Nhap sdt");
				String sdt = sc.next();
				System.out.println("Nhap diemTB");
				double diemTB = sc.nextDouble();
				 person[i] = new Person(ten, tuoi, diaChi, sdt, diemTB);
			}
			sc.close();
		}

	}


