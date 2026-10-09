/* TEMA: ESTATÍSTICAS. Quantidade, soma, média, maior e menor em uma passagem. */
public class EstatisticasDeArray { public static void main(String[] args) { int[] v={2,8,4}; int soma=0,maior=v[0],menor=v[0]; for(int n:v){soma+=n;if(n>maior)maior=n;if(n<menor)menor=n;} System.out.println("q="+v.length+" soma="+soma+" média="+(double)soma/v.length+" maior="+maior+" menor="+menor); } }
