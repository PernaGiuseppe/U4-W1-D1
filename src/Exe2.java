import java.util.Scanner;
public class Exe2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.println("Inserisci la prima stringa:");
        String stringa1 = input.nextLine();

        System.out.println("Inserisci la seconda stringa:");
        String stringa2 = input.nextLine();

        System.out.println("Inserisci la terza stringa:");
        String stringa3 = input.nextLine();


        System.out.println("\nConcatenazione in ordine di inserimento:");
        System.out.println(stringa1 + stringa2 + stringa3);


        System.out.println("\nConcatenazione in ordine inverso:");
        System.out.println(stringa3 + stringa2 + stringa1);


        input.close();
    }
}