package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
public class regex {
    public static void main(String[] args) {
        String regex = "\\d{1,2}/\\d{1,2}/\\d{2,4}";
        String texto = "05/10/2000 14/07/2012 09/03/18 1/1/16";
        
        Pattern pato = Pattern.compile(regex);
        Matcher mat = pato.matcher(texto);
        
        System.out.println("Texto: "+texto);
        System.out.println("Indice: 012345678901234567");
        System.out.println("Expressão: "+mat.pattern());
        System.out.println("Posições encontradas: ");
        
        while(mat.find()){
            System.out.println(mat .start() +" "+ mat.group());
        }
    }
}

public class regex {
    public static void main(String[] args) {
        String regex = "\\(\\d{2}\\)\\d{4,5}-\\d{4}";
        String texto = "(78)4444-4444 (45)55555-0998 90 77689000";
        
        Pattern pato = Pattern.compile(regex);
        Matcher mat = pato.matcher(texto);
        
        System.out.println("Texto: "+texto);
        System.out.println("Indice: 012345678901234567");
        System.out.println("Expressão: "+mat.pattern());
        System.out.println("Posições encontradas: ");
        
        while(mat.find()){
            System.out.println(mat.start() +" "+ mat.group());
        }
    }
}

public class regex {
    public static void main(String[] args) {
        String regex = "([0-9a-zA-Z\\.-_])+@([0-9a-zA-Z])+(\\.([a-zA-Z])+)*";
        String texto = "n_puipo@yttuyy viin.lopes@terra.com.br iuou-po@gmail.com ert@trrt_tyu";
        
        Pattern pato = Pattern.compile(regex);
        Matcher mat = pato.matcher(texto);
        
        System.out.println("Texto: "+texto);
        System.out.println("Indice: 012345678901234567");
        System.out.println("Expressão: "+mat.pattern());
        System.out.println("Posições encontradas: ");
        
        while(mat.find()){
            System.out.println(mat.start() +" "+ mat.group());
        }
    }
}*/
public class regex {
    public static void main(String[] args) {
        String regex = "([\\p{Alnum})\\._-])+@([\\p{Alnum}])+(\\.([\\p{Alnum}])+)*";
        String texto = "n_puipo@yttuyy viin.lopes@terra.com.br iuou-po@gmail.com ert@trrt_tyu";
        
        Pattern pato = Pattern.compile(regex);
        Matcher mat = pato.matcher(texto);
        
        System.out.println("Texto: "+texto);
        System.out.println("Indice: 012345678901234567");
        System.out.println("Expressão: "+mat.pattern());
        System.out.println("Posições encontradas: ");
        
        while(mat.find()){
            System.out.println(mat.start() +" "+ mat.group());
        }
        
        String dado = "teste_.5T1234@gmail.com.org";
        System.out.println("\nEmail valido? "+ dado.matches(regex));
    }
}