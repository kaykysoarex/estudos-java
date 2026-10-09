/* TEMA: BUSCA. Booleano informa o resultado ao fim da procura. */
public class BuscaDeElemento { public static void main(String[] args) { int[] v={1,4,8}; int alvo=4; boolean achou=false; for(int n:v)if(n==alvo)achou=true; System.out.println(achou); } }
