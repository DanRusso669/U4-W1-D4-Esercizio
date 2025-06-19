package entities.esercizi;

import entities.enums.Dipartimento;

public class DipendentePartTime extends Dipendente {
    private double hours;

    public DipendentePartTime(int matricola, double stipendio, Dipartimento dipartimento, double hours) {
        super(matricola, stipendio, dipartimento);
        this.hours = hours;
        this.stipendio = hours * 8;
    }


    @Override
    public void calculateSalary(double stipendio) {
        System.out.println("Il mio salario è di " + stipendio + " euro al mese.");

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
