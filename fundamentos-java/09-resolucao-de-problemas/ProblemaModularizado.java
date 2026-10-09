/* TEMA: PROBLEMA MODULARIZADO. Métodos separam cálculo e apresentação. */
public class ProblemaModularizado { public static void main(String[] args) { int[] notas={7,8,9}; mostrarResultados(calcularMedia(notas),encontrarMaior(notas)); }
 static double calcularMedia(int[] v){int soma=0;for(int n:v)soma+=n;return(double)soma/v.length;} static int encontrarMaior(int[] v){int maior=v[0];for(int n:v)if(n>maior)maior=n;return maior;} static void mostrarResultados(double media,int maior){System.out.println(media+" "+maior);} }
