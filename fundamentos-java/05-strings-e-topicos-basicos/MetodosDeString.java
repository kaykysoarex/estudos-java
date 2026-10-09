/* TEMA: MÉTODOS DE STRING. Eles retornam novo texto: lower, upper, trim, substring, replace, indexOf e lastIndexOf. */
public class MetodosDeString { public static void main(String[] args) { String texto="  Java é legal  "; String limpo=texto.trim();
    System.out.println(texto.toLowerCase()); System.out.println(texto.toUpperCase()); System.out.println(limpo.substring(0,4));
    System.out.println(limpo.replace("legal","útil")); System.out.println(limpo.indexOf("é")); System.out.println(limpo.lastIndexOf("a"));
} }
