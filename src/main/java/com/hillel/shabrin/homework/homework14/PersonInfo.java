package com.hillel.shabrin.homework.homework14;

public class PersonInfo {
    public static void main(String[] args) {

        PersonData dwayne = new PersonData("Dwayne","Johnson", 2,5, 1972,
                "therock@yahoo.com",5554141,120.5,120.80,25000);

        PersonData keanu = new PersonData("Keanu", "Reeves", 2, 10, 1964,
                "keanu@yahoo.com", 5553870,80.3, 135.60, 15000);

        PersonData henry = new PersonData("Henry", "Cavil",5, 5,1983,
                "imsuperman@yahoo.com", 5551313,100.7, 120.80,20000);

        PersonData anna = new PersonData("Anna", "De Armas",30,4,1988,
                "dearmas@yahoo.com",5550102,61.2, 125.85, 17000);

        dwayne.printAccountInfo();
        keanu.printAccountInfo();
        henry.printAccountInfo();
        anna.printAccountInfo();

        System.out.println("The client " + anna.getFirstName() + " began to run more, what influenced her weight." +
               "\n" + "Last weight: " + anna.getWeight() + "\n");

        anna.setWeight(59.7);

        System.out.println("Updated data: ");
        anna.printAccountInfo();

        System.out.println("The client " + henry.getFirstName() +
                " started doing more cardio, what influenced his regular pressure and steps." + "\n" +
                "Last regular pressure: " + henry.getPressure() + "\n" +
                "Last steps: " + henry.getCountSteps() + "\n");

        henry.setCountSteps(30000);
        henry.setPressure(130.90);

        System.out.println("Updated data: ");
        henry.printAccountInfo();
    }
}
