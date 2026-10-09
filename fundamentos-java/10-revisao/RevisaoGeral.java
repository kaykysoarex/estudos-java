/* REVISÃO GERAL: array, loop, condição e método. */
public class RevisaoGeral { public static void main(String[] args) { int[] notas={6,8,7};double media=media(notas);System.out.println(media>=7?"Aprovado":"Revisar");}static double media(int[] v){int soma=0;for(int n:v)soma+=n;return(double)soma/v.length;} }
