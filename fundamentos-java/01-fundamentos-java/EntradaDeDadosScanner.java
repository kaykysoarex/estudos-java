import java.util.Scanner;

/* TEMA: SCANNER. new Scanner(System.in) lê o teclado. next lê palavra, nextInt inteiro,
 * nextDouble decimal, next().charAt(0) caractere e nextLine uma linha. */
public class EntradaDeDadosScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Palavra inteiro decimal letra: ");
        String palavra = sc.next();
        int inteiro = sc.nextInt();
        double decimal = sc.nextDouble();
        char letra = sc.next().charAt(0);
        System.out.println(palavra + " " + inteiro + " " + decimal + " " + letra);
        sc.close();
    }
}
