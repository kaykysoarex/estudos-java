/* TEMA: VARIÁVEIS E TIPOS. Variável guarda valor durante a execução.
 * Sintaxe: tipo nome = valor; int, double, boolean, char e String são os mais usados. */
public class VariaveisETipos {
    public static void main(String[] args) {
        int idade = 20;
        double altura = 1.75;
        boolean aprovado = true;
        char letra = 'A';
        String nome = "Maria";
        byte pequeno = 10;
        short ano = 2026;
        long populacao = 210000000L;
        float preco = 9.5F;
        idade = 21; // O valor pode mudar depois da declaração.
        System.out.println(nome + ": " + idade + ", " + altura + ", " + aprovado + ", " + letra);
        System.out.println(pequeno + " " + ano + " " + populacao + " " + preco);
    }
}
