package Aula18;

public class Main {
    public static void main(String[] args) {
        
        char[] textoChar = {'c', 'u', 'r', 's', 'o', ' ', 'd', 'e', ' ', 'j', 'a', 'v', 'a'};
        String textoString = "curso de java";
        char[] s1 = new char[5];
        String s2 = "curso de java";

        for (int i = 0; i < textoChar.length; i++) {
            System.out.print(textoChar[i]);
        }
        System.out.println("\n" + textoString);

        // length charAt getChars

        System.out.println(textoString.length());
        System.out.println(textoString.charAt(0));
        textoString.getChars(0,5,s1,0);
        System.out.println(s1);

        // regionMatches
        if (textoString.regionMatches(true, 0, s2, 0, 3)) {
            System.out.println(true);
        }

        // compareTo
        System.out.println(textoString.compareTo(s2));

        // equalsIgnoreCase
        if (textoString.equalsIgnoreCase(s2)) {
            System.out.println(true);
        }

        // equals
        if (textoString.equals(s2)) {
            System.out.println(true);
        }
        
        // startsWith endWith
        System.out.println(textoString.startsWith("c"));
        System.out.println(textoString.endsWith("a"));

        // indexOf
        System.out.println(textoString.indexOf('a',1 ));

        // substring
        System.out.println(textoString.substring(0,5));

        // concat
        System.out.println(textoString.concat(s2));

        // replace
        System.out.println(textoString.replace("a", " "));

        // toUpperCase toLowerCase
        System.out.println(textoString.toLowerCase());
        System.out.println(textoString.toUpperCase());

        //split
        String[] textoEmPartes = new String[13];
        textoEmPartes = textoString.split(" ");
        for (int i = 0; i < textoEmPartes.length; i++) {
            System.out.println(textoEmPartes[i]);
        }

    }
}
