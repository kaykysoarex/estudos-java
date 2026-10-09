/* TEMA: SWITCH. case é uma opção; break encerra o caso; default atende valores não previstos. */
public class SwitchCase { public static void main(String[] args) { int dia = 2;
    switch (dia) { case 1: System.out.println("Domingo"); break; case 2: System.out.println("Segunda"); break;
    case 3: System.out.println("Terça"); break; default: System.out.println("Dia inválido"); break; }
} }
