package entities.esercizi;

import entities.interfaces.CheckIn;

public class Volontario implements CheckIn {
    private String name;
    private int age;
    private int CV;

    public Volontario(String name, int age, int CV) {
        this.name = name;
        this.age = age;
        this.CV = CV;
    }

    @Override
    public void checkIn() {
        System.out.println("Ho iniziato il servizio alle 20:30");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getCV() {
        return CV;
    }

    public void setCV(int CV) {
        this.CV = CV;
    }
}
