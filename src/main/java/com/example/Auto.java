package com.example;

public class Auto {
	private static String[] farby = {"green", "red", "blue"};
	protected int najazdeneKilometre;
	protected String color;

	public Auto(int kil) {
		this.najazdeneKilometre = kil;
	}

	public int getNajazdeneKilometre() {
		return this.najazdeneKilometre;
	}

	protected String getColor(int idx) {
		return farby[idx];
	}

	public String getColor() {
		return this.color;
	}
}
