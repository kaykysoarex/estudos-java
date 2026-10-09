import java.util.Scanner;
/* TEMA: nextLine E BUFFER. next lê até espaço; nextLine lê a linha toda.
 * Após nextInt, use nextLine extra para consumir o Enter pendente. */
public class NextLineEBuffer { public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); System.out.print("Idade: "); int idade = sc.nextInt();
    sc.nextLine(); System.out.print("Nome completo: "); String nome = sc.nextLine();
    System.out.println(nome + ": " + idade); sc.close();
} }
