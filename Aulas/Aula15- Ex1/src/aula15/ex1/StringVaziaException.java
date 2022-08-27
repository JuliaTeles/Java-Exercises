package aula15.ex1;

public class StringVaziaException extends RuntimeException{
     
    @Override
    public String getMessage(){
        return("A string não pode ser vazia");   
    }
}
