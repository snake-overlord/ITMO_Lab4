package exceptions;

public class NegativeTimeException extends RuntimeException{
    public NegativeTimeException(){
        System.err.print("Количество часов не может быть отрицательным!");
    }
}
