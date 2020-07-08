package regex;

public class ValidaCampos {
    public static boolean validaNome(String nome){
        return nome.matches("\\p{Upper}[\\p{IsLatin}[ ]]+");
    }
    public static boolean validaEndereco(String endereco){
        return endereco.matches("\\p{Upper}[\\p{IsLatin}\\p{Alnum}[ ][,-]]+");
    }
    public static boolean validaEmail(String mail){
        return mail.matches("([\\p{Alnum}\\._-])+@([\\p{Alnum}])+(\\.([\\p{Alnum}])+)*");
    }
    public static boolean validaFone(String fone){
        return fone.matches("\\(\\p{Digit}{2}\\)\\s\\p{Digit}{4,5}-\\p{Digit}{4}");
    }
    public static boolean validaMatricula(String matr){
        return matr.matches("\\p{Alnum}+");
    }
    public static boolean validaCurso(String curso){
        return curso.matches("\\p{Upper}[\\p{IsLatin}[ ]]+");
    }
    
    //////////////////////////////////////////////////////////
    
    public static boolean validaNomeDisciplina(String nome){
        return nome.matches("\\p{Upper}[\\p{IsLatin}[ ]]+");
    }
    public static boolean validaCodigoDisciplina(String code){
        return code.matches("\\p{Alnum}+");
    }
    public static boolean validaCargaHoraria(String ch){
        return ch.matches("\\p{Digit}+");
    }
    
    //////////////////////////////////////////////////////////
    
    public static boolean validaAno(String ano){
        return ano.matches("\\p{Digit}{4}");
    }
    public static boolean validaNota(String n){
        return n.matches("\\p{Digit}{1,2}(\\.\\p{Digit}{1,2})?");
    }
    public static boolean validaFaltas(String f){
        return f.matches("\\p{Digit}+");
    }
    
    /////////////////////////////////////////////////////////
    
    public static boolean validaFormacao(String form){
        return form.matches("\\p{Upper}[\\p{IsLatin}[ ]]+");
    }
    public static boolean validaSalario(String sal){
        return sal.matches("\\p{Digit}{1,10}(\\.\\p{Digit}{1,3})?");
    }
    
    ////////////////////////////////////////////////////////
    
    
    
}
