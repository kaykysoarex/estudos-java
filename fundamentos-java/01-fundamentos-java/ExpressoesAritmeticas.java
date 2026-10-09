/* TEMA: EXPRESSÕES ARITMÉTICAS. + - * / % fazem contas; * / % têm prioridade sobre + -.
 * % retorna o resto: 10 % 3 é 1. */
public class ExpressoesAritmeticas {
    public static void main(String[] args) {
        int resultado1 = 3 + 2 * 4; int resultado2 = (3 + 2) * 4; int numero = 8;
        System.out.println(resultado1); System.out.println(resultado2);
        System.out.println("É par? " + (numero % 2 == 0));
    }
}
