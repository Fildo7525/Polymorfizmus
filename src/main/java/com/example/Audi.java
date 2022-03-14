package com.example;

public class Audi extends Auto {
	public Audi(){
		super(20);
		this.color = super.getColor(2);
	}

	@Override
	public int getNajazdeneKilometre() {
		return najazdeneKilometre * 10;
	}

}
