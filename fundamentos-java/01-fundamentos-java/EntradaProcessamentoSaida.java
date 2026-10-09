import java.util.Scanner;
/* TEMA: ENTRADA → PROCESSAMENTO → SAÍDA. Primeiro recebe notas, depois calcula, então exibe. */
public class EntradaProcessamentoSaida {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); System.out.print("Duas notas: ");
        double nota1 = sc.nextDouble(), nota2 = sc.nextDouble();
        double media = (nota1 + nota2) / 2.0;
        System.out.println("Média: " + media); sc.close();
    }
}
