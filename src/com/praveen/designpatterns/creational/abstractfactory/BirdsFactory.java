package com.praveen.designpatterns.creational.abstractfactory;

public class BirdsFactory extends AnimalFactory{

	@Override
	public Animal create(String animal) {		
		animal = animal.toUpperCase();
		if(animal.equals("OWL")){
			return new Owl();
		}
		return null;
	}

}
