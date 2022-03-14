package com.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String args[]){
		System.out.println("Hallo World!");
		ArrayList<Auto> auta = new ArrayList<>(List.of(new Audi(), new Skoda(10)));

		int i = 0;
		for (var car : auta) {
			System.out.println(car.getNajazdeneKilometre());
			System.out.println(car.getColor());
			System.out.println(car.getColor(i++));
		}
	}
}
