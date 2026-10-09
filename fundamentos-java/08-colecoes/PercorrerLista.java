import java.util.*;
/* TEMA: PERCORRER. for tradicional permite índice; for-each recebe diretamente o valor. */
public class PercorrerLista { public static void main(String[] args) { List<String> nomes=new ArrayList<>(); nomes.add("Ana"); nomes.add("Maria"); for(int i=0;i<nomes.size();i++) System.out.println(i+": "+nomes.get(i)); for(String nome:nomes) System.out.println(nome); } }
