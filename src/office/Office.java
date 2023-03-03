package office;

import java.util.ArrayList;

class Office {
    private int sumaSalarii;
    private String descriere;
    private String nume;

    private ArrayList<Angajat> angajati = new ArrayList<>();

    public int getNumarDeAngajati() {
        return angajati.size();
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public int getSumaSalarii() {
        for (int i = 0; i < angajati.size(); i++) {
            sumaSalarii = sumaSalarii + angajati.get(i).getSalariu();
        }

        return sumaSalarii;
    }

    public void setSumaSalarii(int sumaSalarii) {
        this.sumaSalarii = sumaSalarii;
    }

    public ArrayList<Angajat> getAngajati() {
        return angajati;
    }

    public void setAngajati(ArrayList<Angajat> angajati) {
        this.angajati = angajati;
    }
}
