import java.sql.Array;
import java.util.Arrays;
public class Exe1 {
    public static void main(String args[] ) {
        int n1 = 0;
        int n2 = 0;
        int moltiplica = n1 * n2;
        System.out.println(moltiplica);

       int numero = 20;
       String testo = "Il numero è ";
       String concatenazione = testo + numero;
        System.out.println(concatenazione);

        String[] array5 = {"uno", "due", "tre", "quattro", "cinque"};
        String parola =  "Ciao";
        String [] nuovoArray = new String[array5.length+1];
        nuovoArray[0] = array5 [0];
        nuovoArray[1] = array5 [1];
        nuovoArray[2] = parola;
        nuovoArray[3] = array5 [2];
        nuovoArray[4] = array5 [3];
        nuovoArray[5] = array5 [4];
        System.out.println(Arrays.toString(nuovoArray));
}}
