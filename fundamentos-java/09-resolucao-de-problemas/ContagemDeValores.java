/* TEMA: CONTAGEM. Cada condição verdadeira aumenta seu contador. */
public class ContagemDeValores { public static void main(String[] args) { int[] v={-2,-1,0,3,4}; int pares=0,impares=0,positivos=0,negativos=0; for(int n:v){if(n%2==0)pares++;else impares++;if(n>0)positivos++;if(n<0)negativos++;} System.out.println(pares+" "+impares+" "+positivos+" "+negativos); } }
