package com.hillel.shabrin.homework.homework14;

public class PersonData {

    private final String firstName;
    private final int dayB;
    private final int monthB;
    private final int yearB;
    private final String email;
    private final int phone;

    private final int age;
    int currentYear = 2022;

    String lastName;
    double weight;
    double pressure;
    int countSteps;

    public PersonData(String firstName,String lastName, int dayB, int monthB, int yearB, String email, int phone,
                      double weight, double pressure, int countSteps) {
        this.firstName = firstName;
        this.dayB = dayB;
        this.monthB = monthB;
        this.yearB = yearB;
        this.email = email;
        this.phone = phone;

        this.lastName = lastName;
        this.weight = weight;
        this.pressure = pressure;
        this.countSteps = countSteps;

        age = currentYear - yearB;
    }

    public String getFirstName(){
        return firstName;
    }
    public int getDayB(){
        return dayB;
    }
    public int getMonthB(){
        return monthB;
    }
    public int getYearB(){
        return yearB;
    }
    public String getEmail(){
        return email;
    }
    public int getPhone(){
        return phone;
    }
    public String getLastName(){
        return lastName;
    }
    public double getWeight(){
        return weight;
    }
    public double getPressure(){
        return pressure;
    }
    public int getCountSteps(){
        return countSteps;
    }

    public void setLastname(String lastName){
        this.lastName = lastName;
    }
    public void setWeight(double weight){
        this.weight = weight;
    }
    public void setPressure(double pressure){
        this.pressure = pressure;
    }
    public void setCountSteps(int countSteps){
        this.countSteps = countSteps;
    }

    void printAccountInfo(){
        System.out.println("Name: " + firstName + " " + lastName + "\n" +
                "Date of birth: " + dayB + '.' + monthB + "." + yearB + "\n" +
                "Age: " + age + "\n" +
                "Email: " + email + "\n" + "Phone: " + phone + "\n" +
                "Weight: " + weight + "\n" + "Pressure: " + pressure + "\n" +
                "Number of steps: " + countSteps + "\n");
    }
}

