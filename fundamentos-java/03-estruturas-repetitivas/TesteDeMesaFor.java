/* TEMA: TESTE DE MESA FOR. i=1: soma 0→1; i=2: 1→3; i=3: 3→6; i=4 falha em i<=3. */
public class TesteDeMesaFor { public static void main(String[] args) { int soma = 0; for (int i = 1; i <= 3; i++) soma += i; System.out.println(soma); } }
