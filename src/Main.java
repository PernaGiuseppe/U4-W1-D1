import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

/* Esercizio con IF e Else
       System.out.println("Inserisci il primo numero");
        int x = scanner.nextInt();
        System.out.println("Inserisci il secondo numero");
        int y = scanner.nextInt();
        System.out.println("Inserisci il terzo numero");
        int z = scanner.nextInt();

        int numeroMaggiore = 0;
if(x >= y && x >= z) {
    numeroMaggiore = x;
} else if (y >= x && y >= z) {
    numeroMaggiore = y;
}else if (z >= x && z >= y) {
    numeroMaggiore = z;
} else {
    System.out.println("Tutti i numeri sono uguali");
}
System.out.println("Il numero maggiore é: " + numeroMaggiore);*/


        /*Esercizio con Switch/Case
        System.out.println("Inserisci il primo numero");
        int num1 = scanner.nextInt();
        System.out.println("Inserisci il secondo numero");
        int num2 = scanner.nextInt();
        System.out.println("Selezione l'operazione: addizione, sottrazione, moltiplicazione o divisione");
        String operazione = scanner.next();
        int totale = 0;

        switch (operazione) {
            case "addizione":
                totale = num1 + num2;
            break;
            case "sottrazione":
                totale = num1 - num2;
                break;
            case "moltiplicazione":
                totale = num1 * num2;
                break;
            case "divisione":
                totale = num1 / num2;
                break;
            default:
                System.out.println("Operazione selezionata errata");
        }
        System.out.println("Il totale dell'operazione è: " + totale);*/


        /*Esercizio con While
                int numero;
                int contatorePari = 0;

                System.out.println("Inserisci dei numeri per contare quanti sono pari.");
                System.out.println("Inserisci 0 per terminare il programma.");

                System.out.println("Inserisci un numero:");
                numero = scanner.nextInt();
                while (true) {

                    if (numero % 2 == 0 && numero > 0) {
                        contatorePari++;
                    }
                    if (numero == 0) break;

                    System.out.println("Inserisci un altro numero:");
                    numero = scanner.nextInt();
                }
                System.out.println("Hai inserito " + contatorePari + " numeri pari.");
                scanner.close();

        int[] numbers = new int[10]; // Modificato a 10 per memorizzare 10 numeri
        int sum = 0;
        int max = 0;

        System.out.println("Inserisci 10 numeri interi:");

        // Ciclo per inserire i 10 numeri nell'array e calcolare la somma
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Inserisci il numero " + (i + 1) + ":");
            numbers[i] = scanner.nextInt();
            sum += numbers[i]; // Aggiunge il numero alla somma totale

            // Trova il numero massimo
            if (i == 0 || numbers[i] > max) {
                max = numbers[i];
            }
        }

        // Calcola la media dei numeri
        double average = (double) sum / numbers.length;

        // Stampa i risultati
        System.out.println("\nI numeri inseriti sono: " + Arrays.toString(numbers));
        System.out.println("La somma dei numeri è: " + sum);
        System.out.println("La media dei numeri è: " + average);
        System.out.println("Il numero massimo è: " + max);

        scanner.close();*/
        int n1 = 0;
        int n2 = 0;
        int moltiplica = n1 * n2;
        System.out.println(moltiplica);

        int numero = 20;
        String testo = "Il numero è ";
        String concatenazione = testo + numero;
        System.out.println(concatenazione);
    }
        }

