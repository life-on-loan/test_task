package ru.internship.test_task.error;

public class NotFoundStringException extends RuntimeException{
    private String message;

    public NotFoundStringException(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}