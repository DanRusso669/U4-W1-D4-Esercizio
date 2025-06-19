package entities.esercizi;

import entities.enums.Dipartimento;

public class DipendentePartTime extends Dipendente {
    private double hours;

    public DipendentePartTime(int matricola, Dipartimento dipartimento, double hours) {
        super(matricola, hours * 8, dipartimento);
        this.hours = hours;
    }


    @Override
    public void calculateSalary(double stipendio) {
        System.out.println("Il mio salario è di " + stipendio + " euro al mese.");

    }
    
    public void calculateSalary(double stipendio, int age) {
        System.out.println("mi chiamo daniele " + stipendio + age);
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) {
        this.hours = hours;
    }

    @Override
    public void checkIn() {
        System.out.println("Sono un dipendente partTime e inizio il turno alle 16:15");
    }
}
