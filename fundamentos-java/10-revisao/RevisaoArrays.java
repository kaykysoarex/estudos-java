/* REVISÃO: percorra array, some e encontre maior. */
public class RevisaoArrays { public static void main(String[] args) { int[] v={2,5,3};int soma=0,maior=v[0];for(int n:v){soma+=n;if(n>maior)maior=n;}System.out.println(soma+" "+maior); } }
