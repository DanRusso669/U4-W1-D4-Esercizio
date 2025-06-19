package entities.esercizi;

import entities.enums.Dipartimento;

public class Dirigente extends Dipendente {


    public Dirigente(int matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public void calculateSalary(double stipendio) {
        System.out.println("Il mio salario è di " + stipendio + " euro al mese.");
    }

    @Override
    public void checkIn() {
        System.out.println("Sono un dirigente e inizio il turno alle 09:00");
    }
}
