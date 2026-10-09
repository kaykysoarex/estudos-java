/* TEMA: ESCOPO. Uma variável do bloco só existe dentro dele. Variável local deve receber valor antes do uso. */
public class EscopoEInicializacao { public static void main(String[] args) { int fora = 1;
    if (true) { int dentro = 2; System.out.println(dentro); } System.out.println(fora);
    // System.out.println(dentro); // Erro: fora do escopo.
} }
