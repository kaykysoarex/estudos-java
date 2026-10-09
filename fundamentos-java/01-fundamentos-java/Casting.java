/* TEMA: CASTING. (int) descarta a parte decimal. Converter antes da divisão evita divisão inteira. */
public class Casting { public static void main(String[] args) {
    double valor = 10.8; int numero = (int) valor; int a = 5, b = 2;
    System.out.println(numero); System.out.println(a / b); System.out.println((double) a / b);
} }
