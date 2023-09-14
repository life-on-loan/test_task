package ru.internship.test_task.dto;

public class SymbolDto {
    private String symbol;
    private Integer amount;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "SymbolDto{" +
                "symbol='" + symbol + '\'' +
                ", amount=" + amount +
                '}';
    }
}
