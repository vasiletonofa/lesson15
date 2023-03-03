package office;

import java.util.ArrayList;

public class Companie {

    private int mediaSalariuAngajat;
    private ArrayList<Office> offices = new ArrayList<>();

    public int calculeazSalariuMediuAngajat() {
        int suma = 0;
        int numarAngajati = 0;
        for (int i = 0; i < offices.size(); i++) {
            suma = suma + offices.get(i).getSumaSalarii();
            numarAngajati = numarAngajati + offices.get(i).getNumarDeAngajati();
        }

        mediaSalariuAngajat = suma / numarAngajati;

        return mediaSalariuAngajat;
    }

    public void addNewOffice(String nume, String descriere, ArrayList<Angajat> angajati) {
        Office office = new Office();
        office.setNume(nume);
        office.setDescriere(descriere);
        office.setAngajati(angajati);
        offices.add(office);
    }
}
