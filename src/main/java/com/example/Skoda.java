package com.example;

public class Skoda extends Auto {
	public Skoda(int i){
		super(i);
		this.color = super.getColor(0);
	}

	@Override
	public int getNajazdeneKilometre() {
		return najazdeneKilometre * 2;
	}
}
