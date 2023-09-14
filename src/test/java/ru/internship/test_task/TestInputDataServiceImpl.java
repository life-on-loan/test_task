package ru.internship.test_task;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import ru.internship.test_task.dto.SymbolDto;
import ru.internship.test_task.dto.OutputDto;
import ru.internship.test_task.service.InputDataService;
import ru.internship.test_task.service.InputDataServiceImpl;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class TestInputDataServiceImpl {
    private final InputDataService inputDataService = new InputDataServiceImpl();
    @Test
    @DisplayName("Проверка корректности подсчета и вывода итогового результата")
    public void correctCountLetters (){
        // given
        String str = "aaaaabcccc  ";

        //when
        OutputDto outputDto = inputDataService.countLetters(str);

        //then
        List<SymbolDto> symbolDtoList = outputDto.getResult();
        assertThat(symbolDtoList.size()).isEqualTo(4);
        assertThat(symbolDtoList.get(0).getSymbol()).isEqualTo("a");
        assertThat(symbolDtoList.get(0).getAmount()).isEqualTo(5);
        assertThat(symbolDtoList.get(1).getSymbol()).isEqualTo("c");
        assertThat(symbolDtoList.get(1).getAmount()).isEqualTo(4);
        assertThat(symbolDtoList.get(3).getSymbol()).isEqualTo("b");
        assertThat(symbolDtoList.get(3).getAmount()).isEqualTo(1);
    }
}
