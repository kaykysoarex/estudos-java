/* TEMA: ATRIBUIÇÃO CUMULATIVA. soma += valor equivale a soma = soma + valor. ++ soma 1; -- subtrai 1. */
public class AtribuicaoCumulativa { public static void main(String[] args) { int valor = 10, contador = 0;
    valor += 5; valor -= 2; valor *= 2; contador++; contador--; System.out.println(valor + " " + contador);
} }
