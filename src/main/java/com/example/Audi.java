package com.example;

public class Audi extends Auto {
	public Audi(int i){
		super(20);
		this.color = super.getColor(i);
	}

	@Override
	public int getNajazdeneKilometre() {
		return najazdeneKilometre * 10;
	}

}
