import java.util.Scanner;

public class Exe3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci il primo numero");
        int lato1 = scanner.nextInt();
        System.out.println("Inserisci il secondo numero");
        int lato2 = scanner.nextInt();
        int perimetro = calcolarePerimetro(lato1, lato2);
        System.out.println(perimetro);
        System.out.println("Inserisci un numero");
        int n = scanner.nextInt();
        int risultato = pariDiscpari(n);
        System.out.println(risultato);

        System.out.println("Inserisci il primo lato");
        int l1 = scanner.nextInt();
        System.out.println("Inserisci il secondo lato");
        int l2 = scanner.nextInt();
        System.out.println("Inserisci il terzo lato");
        int l3 = scanner.nextInt();
        double area = perimetroTriangolo(l1, l2,l3);
        System.out.println(Math.round(area));

    }
    public static int calcolarePerimetro (int l1, int l2) {
        return (l1 + l2) * 2;

    }
    public static int pariDiscpari (int n) {
        return (n % 2 == 0) ? 0 : 1;

    }
    public static double perimetroTriangolo (int n1, int n2, int n3 ) {
     double semiPerimetro = (n1 + n2 + n3) / 2;
     return Math.sqrt(semiPerimetro*(semiPerimetro - n1)*(semiPerimetro - n2)* (semiPerimetro - n3));

    }
}
