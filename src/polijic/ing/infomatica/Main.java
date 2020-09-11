package polijic.ing.infomatica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        List<Double> realNumbers = new ArrayList<Double>();
        int option = 0;


        do {
            System.out.println("Programa para obtener media y desviacion estandar de una lista de numeros");
            for (int i = 0; i < realNumbers.size(); i++) {
                System.out.println("[" + realNumbers.get(i).toString() + "] \t");
            }
            System.out.println("1. Añadir numero a la lista");
            System.out.println("2. Obtener media y desviacion estandar de la lista actual");
            System.out.println("0. salir");

            option = reader.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Digite el numero que desea agregar a la lista");
                    realNumbers.add(reader.nextDouble());
                    System.out.println("Numero agregado con exito");
                    break;
                case 2:
                    Double standardDeviation = 0.0;
                    Double mean = 0.0;
                    Double variance = 0.0;

                    for (int i = 0; i < realNumbers.size(); i++) {
                        mean += realNumbers.get(i);
                    }
                    mean = mean / realNumbers.size();
                    for (int i = 0; i < realNumbers.size(); i++) {
                        double range;
                        range = Math.pow(realNumbers.get(i) - mean, 2);
                        variance = variance + range;
                    }
                    variance = variance / (realNumbers.size()-1);

                    standardDeviation = Math.sqrt(variance);

                    System.out.println("La media es " + mean);
                    System.out.println("La desviacion estandar es " + standardDeviation);

                    break;
                default:
                    break;
            }

        } while (option != 0);
    }
}
