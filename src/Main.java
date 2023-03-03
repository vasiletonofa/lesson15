import MOSTENIRE.Employee;
import MOSTENIRE.Programmer;
import office.Angajat;
import office.Companie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String [] args) {

//        int array[][] = {{1,2,3}, {3, 4, 5}, {6,7,8}};
//
//        int media;
//        int suma = 0;
//        int count = 0;
//
//        int pare = 0;
//        int impare = 0;
//
//
//        for (int i = 0; i < array.length; i++) {
//            for (int j = 0; j < array[i].length; j++) {
//                System.out.print(array[i][j] + " ");
//                count++;
//                suma = suma + array[i][j];
//
//                if (array[i][j] % 2 == 0) {
//                    pare++;
//                } else {
//                    impare++;
//                }
//            }
//
//            System.out.println();
//        }
//
//        media = suma / count;
//
//        System.out.println("Media: " + media);
//        System.out.println("Suma: " + suma);
//        System.out.println("Pare: " + pare);
//        System.out.println("Impare: " + impare);

        // Companie = Companie(Office[](Angajat[](salriu))))
        // Angajat 1 = 20000, Angajat 2 = 30000
        // Office[] { 50000 }
        // Companie(Office[] { Angajat 1 })

//        Companie companie = new Companie();
//
//        int x = 2;
//
//        int[] y = {3, 4, 5}; // Arrays.asList()
//
//        int[] z = new int[20];
//        z[0] = 2;
//        z[1] = 3;
//
//        z[0] = 0;

        // z[0] = 0;

//        System.out.println(z.length); // 20
//        int[5] = 2;

//        ArrayList<Integer> arrayList = new ArrayList<>();    // 1. Alocare dinamica de memorie
//                                                             // 2. Are metode
//        arrayList.add(1);
//        arrayList.add(2);
//        // ..
//        arrayList.add(1000);
//
//        arrayList.size(); // 3
//
//        arrayList.remove(0);
//
//        arrayList.size(); // 2
//
//        arrayList.clear(); // toate elementele
//
//        arrayList.size(); // 0

//        ArrayList<Integer> itemsToBeRemoved = new ArrayList<>();
//        itemsToBeRemoved.add(2); // [0] = 2
//        itemsToBeRemoved.add(1); // [1] = 1 ,  [0] = 1
//
//        itemsToBeRemoved.remove(0);
//
//        itemsToBeRemoved.size(); // 1
//
//        itemsToBeRemoved.get(0); // 1
//
//        System.out.println(itemsToBeRemoved.get(0)); // 1

//        arrayList.removeAll(Arrays.asList(1,2)); // 1000    // Se poate
//
//
//        List<Integer> myList = new ArrayList<>();
//
//
//        List<Integer> integerList = Arrays.asList(1, 2);   // Nu se poate -> ca un array cu marime fixa
//
//        integerList.add(1);
//        integerList.add(3);
//        integerList.add(3); // EROARE LA RULARE - Runtime error
//        integerList.a2d(4)   // EROARE DE COMPILARE  -> Compile time error


//        for(int i = 0; i<arrayList.size(); i++) {
//            int v = arrayList.get(i);    // 1, 2, 1000
//
//            if (itemsToBeRemoved.contains(v)) { // itemsToBeRemoved are 1, 2, 1000
//                arrayList.remove(i);  // [0] = 1  , [1] = 2
//            }
//        }



        // arrayList => 10  new [10] { 1, 2, 3}
        // arrayList => 20  new [20] {1, 2, 3, 4, 5, 6}
        // arrayList => 40  new [40] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}



//        System.out.println(y[0]); // 3
//        System.out.println(x); // 2

        Companie companie = new Companie();

        ArrayList<Angajat> angajati = new ArrayList<>();
        angajati.add(new Angajat("Ion", 15000));
        angajati.add(new Angajat("Vasile", 10000));

        companie.addNewOffice("Oficiul 1", "Back Office", angajati);

        ArrayList<Angajat> angajati2 = new ArrayList<>();
        angajati2.add(new Angajat("Mihai", 20000));
        angajati2.add(new Angajat("Gheorghe", 30000));

        companie.addNewOffice("Oficiul 2", "IT Department", angajati2);

        System.out.println("Salariu mediu per angajat: " + companie.calculeazSalariuMediuAngajat());


        ArrayList<Boolean> arrayList = new ArrayList<Boolean>();

        Integer l = 2;
        Boolean a = true;

        List<Integer> n = new ArrayList<>();  // 1
        ArrayList<Integer> b = new ArrayList<>(); // 2

        Employee e = new Programmer(); // 1   => Employee parinte la Programmer
        Programmer t = new Programmer(); // 2


        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(20);
        arr.add(6);
        arr.add(9);

        Collections.sort(arr); // 6, 9, 20




















//        System.out.println(arr); // 6, 9, 20
//
//        arr.add(30);
//
//        System.out.println(arr); // 6, 9, 20, 30
//
//        arr.set(1, 3);
//
//        System.out.println(arr); // 6, 3, 9, 20, 30



    }
}