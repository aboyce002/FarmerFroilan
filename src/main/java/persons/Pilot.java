package persons;

import interfaces.Edible;

public class Pilot extends Person {

	@Override
	public void eat(Edible edible) {

	}

	@Override
	public void makeNoise() {
		System.out.println("Weeeee, im high af (in the sky)");
	}
}
