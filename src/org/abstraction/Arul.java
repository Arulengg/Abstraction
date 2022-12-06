package org.abstraction;

//Multiple inheritance 

public class Arul implements Mathi, Murugan {

    @Override
    public void lanName() {

	System.out.println("Moravali");
    }

    @Override
    public void landValue() {

	System.out.println("Sengavaeli");

    }

    public void bankMoney() {

	System.out.println("43535");

    }

    public static void main(String[] args) {

	Arul ap = new Arul();

	ap.landValue();
	ap.lanName();
	ap.bankMoney();

	System.out.println(ap);
    }

}
