package ru.internship.test_task.dto;

/**
 * Класс, описывающий структуру входных данных
 */
public class InputDto {
    private String input;

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    @Override
    public String toString() {
        return "InputDto{" +
                "input='" + input + '\'' +
                '}';
    }
}
