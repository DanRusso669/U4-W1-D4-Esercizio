package entities.esercizi;

import entities.enums.Dipartimento;

public class DipendenteFullTime extends Dipendente {
    public DipendenteFullTime(int matricola, double stipendio, Dipartimento dipartimento) {
        super(matricola, stipendio, dipartimento);
    }

    @Override
    public void calculateSalary(double stipendio) {
        System.out.println("Il mio salario è di " + stipendio + " euro al mese.");
    }

    @Override
    public void checkIn() {
        System.out.println("Sono un dipendente fullTime e ho iniziato il turno alle 14:00");
    }
}
