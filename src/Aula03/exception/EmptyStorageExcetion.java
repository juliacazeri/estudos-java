package Aula03.exception;

public class EmptyStorageExcetion extends  RuntimeException {
    public EmptyStorageExcetion(String message) {
        super(message);
    }
}