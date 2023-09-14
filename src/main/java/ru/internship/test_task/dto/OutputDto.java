package ru.internship.test_task.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс, описывающий структуру выходных данных
 */
public class OutputDto {
    private List<SymbolDto> result = new ArrayList<>();

    public List<SymbolDto> getResult() {
        return result;
    }

    public void setResult(List<SymbolDto> result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "OutputDto{" +
                "result=" + result +
                '}';
    }
}
