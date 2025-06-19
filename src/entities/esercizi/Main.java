package entities.esercizi;

import entities.enums.Dipartimento;

public class Main {
    public static void main(String[] args) {

        /*Dipendente dipendente1 = new Dipendente(259, 20.3, Dipartimento.PRODUZIONE);
        Dipendente dipendente2 = new Dipendente(192, 50.3, Dipartimento.AMMINISTRAZIONE);
        Dipendente dipendente3 = new Dipendente(490, 23.5, Dipartimento.VENDITE);

        Dipendente[] listaDipendenti = {dipendente1, dipendente2, dipendente3};

        for (Dipendente dipendente : listaDipendenti) {
            System.out.println("La mia matricola è: " + dipendente.matricola);
        }*/

        DipendenteFullTime dipFull = new DipendenteFullTime(239, 2000.33, Dipartimento.PRODUZIONE);
        DipendentePartTime dipPartTime = new DipendentePartTime(351, 8, Dipartimento.VENDITE, 100);
        Dirigente dirigente = new Dirigente(2911, 3420.21, Dipartimento.AMMINISTRAZIONE);

        /*dipFull.calculateSalary(dipFull.stipendio);
        dipPartTime.calculateSalary(dipPartTime.stipendio);
        dirigente.calculateSalary(dirigente.stipendio);*/

        Dipendente[] employees = new Dipendente[3];
        employees[0] = dipFull;
        employees[1] = dipPartTime;
        employees[2] = dirigente;

        double total = 0;

        for (Dipendente employee : employees) {
            employee.calculateSalary(employee.stipendio);
            employee.checkIn();
            total += employee.stipendio;
        }

        System.out.println("Il totale degli stipendi è: " + total);

        Volontario volontario1 = new Volontario("Mario", 49, 10);
        volontario1.checkIn();

        Volontario volontario2 = new Volontario("Luigi", 38, 90);
        volontario2.checkIn();


    }
}