/* TEMA: MÉDIA. Casting em soma evita divisão inteira. */
public class MediaDosElementos { public static void main(String[] args) { int[] numeros={7,8,9}; int soma=0; for(int n:numeros) soma+=n; System.out.println((double)soma/numeros.length); } }
